package com.knotapi.knot.utilities;

import android.net.Uri;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import com.knotapi.knot.webview.PopupChromeClient;

/* loaded from: classes4.dex */
public class SsoLoginHelper {

    /* renamed from: com.knotapi.knot.utilities.SsoLoginHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider;

        static {
            int[] iArr = new int[SSOProvider.values().length];
            $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider = iArr;
            try {
                iArr[SSOProvider.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.AMAZON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.APPLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.SPOTIFY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[SSOProvider.NORMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum SSOProvider {
        GOOGLE,
        FACEBOOK,
        AMAZON,
        X,
        APPLE,
        SPOTIFY,
        NORMAL
    }

    private static SSOProvider determineSSOProvider(String str) {
        if (str == null || str.isEmpty()) {
            return SSOProvider.NORMAL;
        }
        String lowerCase = str.toLowerCase();
        return (lowerCase.equals("google.com") || lowerCase.endsWith(".google.com")) ? SSOProvider.GOOGLE : (lowerCase.equals("facebook.com") || lowerCase.endsWith(".facebook.com")) ? SSOProvider.FACEBOOK : (lowerCase.equals("amazon.com") || lowerCase.endsWith(".amazon.com")) ? SSOProvider.AMAZON : (lowerCase.equals("x.com") || lowerCase.endsWith(".x.com")) ? SSOProvider.X : (lowerCase.equals("apple.com") || lowerCase.endsWith(".apple.com")) ? SSOProvider.APPLE : (lowerCase.equals("spotify.com") || lowerCase.endsWith(".spotify.com")) ? SSOProvider.SPOTIFY : SSOProvider.NORMAL;
    }

    public static void processSSO(String str, Bot bot, KnotView knotView, SsoCookieHelper ssoCookieHelper, PopupChromeClient popupChromeClient, boolean z) {
        String host;
        if (str != null) {
            try {
                if (!str.isEmpty() && (host = Uri.parse(str).getHost()) != null && !host.isEmpty()) {
                    SSOProvider determineSSOProvider = determineSSOProvider(host);
                    String userAgent = PreferenceManager.getUserAgent(knotView.getContext(), "google_opera_linux", Boolean.FALSE);
                    int i = AnonymousClass1.$SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[determineSSOProvider.ordinal()];
                    String str2 = Constants.operaUserAgent;
                    switch (i) {
                        case 1:
                            if (!z) {
                                KnotViewClient knotViewClient = knotView.viewClient;
                                if (bot.hasGoogleUserAgent()) {
                                    userAgent = bot.getGoogleUserAgent();
                                }
                                knotViewClient.configureLogin(Constants.GOOGLE_LOGIN, userAgent);
                            }
                            if (z) {
                                if (bot.hasGooglePopUpUserAgent()) {
                                    str2 = bot.getGooglePopUpUserAgent();
                                }
                                popupChromeClient.setUserAgentAndVisibility(str2, "google");
                                break;
                            }
                            break;
                        case 2:
                            if (!z) {
                                knotView.viewClient.configureLogin(Constants.FACEBOOK_LOGIN, bot.getAndroidFbSSO().isEmpty() ? bot.getAndroidSSOGlobal() : bot.getAndroidFbSSO());
                                knotView.removeFBWarning();
                            }
                            if (z) {
                                popupChromeClient.setUserAgentAndVisibility(bot.getAndroidFbSSO().isEmpty() ? bot.getAndroidSSOGlobal() : bot.getAndroidFbSSO(), "facebook");
                                break;
                            }
                            break;
                        case 3:
                            if (!z) {
                                KnotViewClient knotViewClient2 = knotView.viewClient;
                                if (bot.hasAmazonUserAgent()) {
                                    userAgent = bot.getAmazonUserAgent();
                                }
                                knotViewClient2.configureLogin(Constants.AMAZON_LOGIN, userAgent);
                            }
                            if (z) {
                                if (bot.hasAmazonPopUpUserAgent()) {
                                    str2 = bot.getAmazonPopUpUserAgent();
                                }
                                popupChromeClient.setUserAgentAndVisibility(str2, "");
                                break;
                            }
                            break;
                        case 4:
                            if (!z) {
                                KnotViewClient knotViewClient3 = knotView.viewClient;
                                if (bot.hasXUserAgent()) {
                                    userAgent = bot.getXUserAgent();
                                }
                                knotViewClient3.configureLogin(Constants.X_LOGIN, userAgent);
                            }
                            if (z) {
                                if (bot.hasXPopUpUserAgent()) {
                                    str2 = bot.getXPopUpUserAgent();
                                }
                                popupChromeClient.setUserAgentAndVisibility(str2, "");
                                break;
                            }
                            break;
                        case 5:
                            if (!z) {
                                knotView.loginType = Constants.APPLE_LOGIN;
                                knotView.adjustAppleHeight();
                            }
                            if (z) {
                                popupChromeClient.updateWebViewPopUpVisibility("apple");
                                break;
                            }
                            break;
                        case 6:
                            if (z) {
                                popupChromeClient.setUserAgentAndVisibility(Constants.operaUserAgent, "spotify");
                                break;
                            }
                            break;
                        default:
                            if (!z) {
                                knotView.viewClient.configureLogin(Constants.NORMAL_LOGIN, bot.getUserAgent(knotView));
                            }
                            if (z && bot != null && bot.getAllowChromeClientWindow()) {
                                popupChromeClient.setUserAgentAndVisibility(bot.getUserAgent(knotView), "");
                                break;
                            }
                            break;
                    }
                    if (z && bot != null && bot.getMerchantId() == 239 && host.contains("www.headspace.com")) {
                        popupChromeClient.setLoaderVisibility(0);
                        popupChromeClient.webViewPopUp.setVisibility(8);
                    }
                    if (host.contains("google") || host.contains("facebook")) {
                        ssoCookieHelper.ssoSessionActive = true;
                    } else {
                        ssoCookieHelper.ssoSessionInActive(str, knotView);
                    }
                }
            } catch (Exception e) {
                Reporter.error(e, "SsoLoginHelper.processSSO");
            }
        }
    }
}
