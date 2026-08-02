package com.knotapi.knot.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.models.DialogOptions;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.webview.KnotView;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public class SsoCookieHelper {
    String disabledMerchantList;
    private String emailIDFetcherPath;
    String fbAuthPattern;
    String fbLogoBitmap;
    String fbReqCookie;
    String fbSubtitle;
    String fbTitle;
    String firstBtnText;
    String googleAuthPattern;
    String googleLogoBitmap;
    String googleReqCookie;
    String googleSubtitle;
    String googleTitle;
    boolean isFBDisabledMerchant;
    boolean isFbReuseCookiesEnabled;
    boolean isGoogleDisabledMerchant;
    boolean isGoogleReuseCookiesEnabled;
    String secondBtnText;
    public static List<String> interceptedUrls = new ArrayList();
    private static String googleID = null;
    private static String fbID = null;
    private static final ExecutorService executorService = Executors.newSingleThreadExecutor();
    public final String TAG = "Knot:SsoCookieHelper";
    private final String COOKIE_PREF_FILE_NAME = "knotapi_cookies";
    private final String COOKIE_KEY = "cookies";
    public PreferenceManager preferenceManager = new PreferenceManager();
    public boolean ssoSessionActive = false;
    public boolean fromReusedCookies = false;
    public WebResourceRequest savedRequest = null;
    public boolean proceedWithoutCookies = false;
    public boolean dialogShown = false;
    public boolean shouldBlockRequest = false;
    public String mimeType = "application/octet-stream";

    /* renamed from: encoding, reason: collision with root package name */
    public String f1026encoding = "UTF-8";
    WebAppJSFetcher emailFetcherJS = WebAppJSFetcher.getInstance();
    private long cookieExpirationTimeMs = 43200000;
    private JSONObject tempCookieData = new JSONObject();
    private final List<String> cookieDomains = new ArrayList();

    /* renamed from: com.knotapi.knot.utilities.SsoCookieHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements WebAppJSFetcher.JSFetchCallback {
        final /* synthetic */ String val$currentUrl;
        final /* synthetic */ WebView val$webView;

        public AnonymousClass1(WebView webView, String str) {
            this.val$webView = webView;
            this.val$currentUrl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onJSCodeFetched$0(String str, String str2) {
            if (str2 == null || str2.equals("null") || str2.equals("{}")) {
                return;
            }
            String replace = str2.replace("\"", "");
            if (str.contains("google.com")) {
                String unused = SsoCookieHelper.googleID = replace;
                String str3 = SsoCookieHelper.this.TAG;
                String unused2 = SsoCookieHelper.googleID;
            } else if (str.contains("facebook.com")) {
                String unused3 = SsoCookieHelper.fbID = replace;
                String str4 = SsoCookieHelper.this.TAG;
                String unused4 = SsoCookieHelper.fbID;
            }
        }

        @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
        public void onFetchFailed(Exception exc) {
            String str = SsoCookieHelper.this.TAG;
        }

        @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
        public void onJSCodeFetched(String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            this.val$webView.evaluateJavascript(str, new SsoCookieHelper$1$$ExternalSyntheticLambda0(0, this, this.val$currentUrl));
        }
    }

    private void addCookiesToMap(String str, Map<String, String> map) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String[] split = str.split(";");
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            String[] split2 = str2.split("=", 2);
            if (split2.length == 2) {
                String trim = split2[0].trim();
                map.put(trim, split2[1].trim());
                hashSet.add(trim);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkAndPromptForDialog, reason: merged with bridge method [inline-methods] */
    public void lambda$handleDialog$0(final KnotView knotView, final WebView webView, final Activity activity, String str, String str2, String str3, final String str4, String str5) {
        if (this.dialogShown) {
            WebResourceRequest webResourceRequest = this.savedRequest;
            if (webResourceRequest != null) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                this.savedRequest = null;
                return;
            }
            return;
        }
        this.dialogShown = true;
        final KnotBottomSheetDialog knotBottomSheetDialog = new KnotBottomSheetDialog(knotView.webViewDelegate);
        DialogOptions dialogOptions = new DialogOptions(str, str2, str3, str4, new SsoCookieHelper$$ExternalSyntheticLambda1(this, knotView, str3, webView, knotBottomSheetDialog, 0), new View.OnClickListener() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SsoCookieHelper.this.lambda$checkAndPromptForDialog$2(knotView, str4, "Reuse Google Account Overlay", activity, webView, knotBottomSheetDialog, view);
            }
        }, new ScannerView$$ExternalSyntheticLambda12(this, knotView, webView, knotBottomSheetDialog, 2), "");
        knotBottomSheetDialog.setBitmap(convertBase64ToBitmap(str5));
        knotBottomSheetDialog.setNonDismissible(true);
        knotBottomSheetDialog.setDialogOptions(dialogOptions);
        if (activity instanceof AppCompatActivity) {
            knotBottomSheetDialog.show(((AppCompatActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        } else if (activity instanceof FragmentActivity) {
            knotBottomSheetDialog.show(((FragmentActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Activity must be an instance of FragmentActivity or AppCompatActivity");
        }
    }

    private boolean checkRequiredCookies(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(str2);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i).trim());
            }
            HashSet hashSet2 = new HashSet();
            if (Helper.isValidJson(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        for (String str3 : jSONObject.getJSONObject(keys.next()).getString("cookies").trim().split(";")) {
                            String[] split = str3.split("=", 2);
                            if (split.length == 2) {
                                String trim = split[0].trim();
                                if (hashSet.contains(trim)) {
                                    hashSet2.add(trim);
                                }
                            }
                        }
                    }
                } catch (JSONException unused) {
                    return false;
                }
            } else {
                for (String str4 : str.split(";")) {
                    String[] split2 = str4.split("=", 2);
                    if (split2.length == 2) {
                        String trim2 = split2[0].trim();
                        if (hashSet.contains(trim2)) {
                            hashSet2.add(trim2);
                        }
                    }
                }
            }
            return hashSet2.containsAll(hashSet);
        } catch (JSONException unused2) {
            return false;
        }
    }

    private String cleanUpCookies(String str) {
        HashMap hashMap = new HashMap();
        addCookiesToMap(str, hashMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    public static Bitmap convertBase64ToBitmap(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    private String determineJSPath(String str, KnotView knotView) {
        if (str.contains("google.com")) {
            return this.emailIDFetcherPath;
        }
        if (str.contains("facebook.com") && knotView.getBot().getGlobalSettings().has("facebook_fetch_email") && knotView.getBot().getGlobalSettings().get("facebook_fetch_email").isJsonPrimitive()) {
            return knotView.getBot().getGlobalSettings().get("facebook_fetch_email").getAsString();
        }
        return null;
    }

    private void fetchCookieDomain(String str) {
        this.cookieDomains.clear();
        if (str == null || !Helper.isValidJson(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String trim = jSONArray.getString(i).trim();
                if (!trim.isEmpty()) {
                    this.cookieDomains.add(trim);
                }
            }
        } catch (JSONException unused) {
        }
    }

    private boolean getBoolean(JsonObject jsonObject, String str, boolean z) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsBoolean() : z;
    }

    private int getInt(JsonObject jsonObject, String str, int i) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsInt() : i;
    }

    private String getString(JsonObject jsonObject, String str, String str2) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsString() : str2;
    }

    private void getWebResourceRequestSettings(KnotView knotView) {
        if (knotView != null) {
            try {
                if (knotView.getBot().getAllSettings().has("web_request_mime")) {
                    this.mimeType = knotView.getBot().getAllSettings().get("web_request_mime").getAsString();
                } else {
                    this.mimeType = "application/octet-stream";
                }
                if (knotView.getBot().getAllSettings().has("web_request_encoding")) {
                    this.f1026encoding = knotView.getBot().getAllSettings().get("web_request_encoding").getAsString();
                } else {
                    this.f1026encoding = "UTF-8";
                }
            } catch (Exception unused) {
            }
        }
    }

    private void handleDialog(final KnotView knotView, final WebView webView, final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5, WebResourceRequest webResourceRequest) {
        this.savedRequest = webResourceRequest;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                SsoCookieHelper.this.lambda$handleDialog$0(knotView, webView, activity, str, str2, str3, str4, str5);
            }
        });
        this.shouldBlockRequest = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndPromptForDialog$1(KnotView knotView, String str, String str2, WebView webView, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), Constants.META_BUTTON_CLICKED, str, str2);
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
        this.proceedWithoutCookies = true;
        this.dialogShown = false;
        WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndPromptForDialog$2(KnotView knotView, String str, String str2, Activity activity, WebView webView, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), Constants.META_BUTTON_CLICKED, str, str2);
        injectCookies(activity);
        this.fromReusedCookies = true;
        WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAndPromptForDialog$3(KnotView knotView, String str, WebView webView, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), Constants.META_BUTTON_CLICKED, Constants.META_CLOSE, str);
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
        this.proceedWithoutCookies = true;
        this.dialogShown = false;
        WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveTempCookiesToSharedPreferencesAsync$4(Context context, JSONObject jSONObject) {
        String str;
        String str2 = "";
        try {
            JSONObject jSONObject2 = new JSONObject(EncryptionHelper.getEncryptedString(context, "knotapi_cookies", "cookies", "{}"));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                String optString = optJSONObject.optString("cookies", str2);
                String optString2 = jSONObject3.optString("cookies", str2);
                HashMap hashMap = new HashMap();
                addCookiesToMap(optString, hashMap);
                addCookiesToMap(optString2, hashMap);
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (sb.length() > 0) {
                        str = str2;
                        sb.append("; ");
                    } else {
                        str = str2;
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                    str2 = str;
                }
                String str3 = str2;
                optJSONObject.put("cookies", sb.toString());
                optJSONObject.put("timestamp", Math.max(jSONObject3.optLong("timestamp", 0L), optJSONObject.optLong("timestamp", 0L)));
                jSONObject2.put(next, optJSONObject);
                if (checkRequiredCookies(optString2, this.googleReqCookie)) {
                    saveEmail(context);
                }
                str2 = str3;
            }
            EncryptionHelper.putEncryptedString(context, "knotapi_cookies", "cookies", jSONObject2.toString());
            this.tempCookieData = new JSONObject();
        } catch (Exception unused) {
        }
    }

    private boolean matchesPattern(String str, String str2) {
        if (str2 == null || str2.trim().isEmpty()) {
            return false;
        }
        try {
            return Pattern.compile(str2).matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }

    private void saveCookiesToTempStorage(String str, String str2) {
        try {
            String host = Uri.parse(str).getHost();
            JSONObject optJSONObject = this.tempCookieData.optJSONObject(host);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            String optString = optJSONObject.optString("cookies", "");
            String cleanUpCookies = cleanUpCookies(str2);
            HashMap hashMap = new HashMap();
            addCookiesToMap(optString, hashMap);
            addCookiesToMap(cleanUpCookies, hashMap);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            optJSONObject.put("cookies", sb.toString());
            optJSONObject.put("timestamp", System.currentTimeMillis());
            this.tempCookieData.put(host, optJSONObject);
        } catch (Exception unused) {
        }
    }

    private void saveEmailToSharedPreferences(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("merchantEmails", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (r2.equals(r8) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkDisabledMerchants(KnotView knotView) {
        boolean z;
        if (knotView == null || knotView.getBot() == null || knotView.getBot().getGlobalSettings() == null) {
            return;
        }
        String asString = knotView.getBot().getGlobalSettings().get("disabled_merchants") != null ? knotView.getBot().getGlobalSettings().get("disabled_merchants").getAsString() : null;
        if (asString == null || asString.isEmpty()) {
            return;
        }
        boolean z2 = false;
        String str = asString.contains("google_disabled_merchants") ? asString.split("\"google_disabled_merchants\":\"\\{")[1].split("\\}")[0] : "";
        String str2 = asString.contains("fb_disabled_merchants") ? asString.split("\"fb_disabled_merchants\":\"\\{")[1].split("\\}")[0] : "";
        String valueOf = String.valueOf(knotView.bot.getMerchantId());
        if (!str.contains("," + valueOf + ",")) {
            if (!str.startsWith(valueOf + ",")) {
                if (!str.endsWith("," + valueOf) && !str.equals(valueOf)) {
                    z = false;
                    this.isGoogleDisabledMerchant = z;
                    if (!str2.contains("," + valueOf + ",")) {
                        if (!str2.startsWith(valueOf + ",")) {
                            if (!str2.endsWith("," + valueOf)) {
                            }
                        }
                    }
                    z2 = true;
                    this.isFBDisabledMerchant = z2;
                }
            }
        }
        z = true;
        this.isGoogleDisabledMerchant = z;
        if (!str2.contains("," + valueOf + ",")) {
        }
        z2 = true;
        this.isFBDisabledMerchant = z2;
    }

    public boolean checkShouldIntercept(WebView webView, WebResourceRequest webResourceRequest, Activity activity, KnotView knotView) {
        getSettings(knotView);
        String uri = webResourceRequest.getUrl().toString();
        getWebResourceRequestSettings(knotView);
        boolean matchesPattern = matchesPattern(uri, this.googleAuthPattern);
        boolean matchesPattern2 = matchesPattern(uri, this.fbAuthPattern);
        interceptedUrls.add(uri);
        if ((!matchesPattern && !matchesPattern2) || this.dialogShown || this.proceedWithoutCookies) {
            return false;
        }
        String cookies = getCookies(activity);
        SharedPreferences sharedPreferences = activity.getSharedPreferences("merchantEmails", 0);
        String string2 = sharedPreferences.getString("googleEmail", null);
        String string3 = sharedPreferences.getString("facebookEmail", null);
        if (matchesPattern && this.isGoogleReuseCookiesEnabled && !this.isGoogleDisabledMerchant && checkRequiredCookies(cookies, this.googleReqCookie)) {
            if (string2 == null || string2.isEmpty()) {
                this.googleSubtitle = "You logged in earlier with your Google account for a different merchant";
            } else {
                this.googleSubtitle = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.googleSubtitle, " <b>", string2, "</b>");
            }
            handleDialog(knotView, webView, activity, this.googleTitle, this.googleSubtitle, this.firstBtnText, this.secondBtnText, this.googleLogoBitmap, webResourceRequest);
            return true;
        }
        if (!matchesPattern2 || !this.isFbReuseCookiesEnabled || this.isFBDisabledMerchant || !checkRequiredCookies(cookies, this.fbReqCookie)) {
            return false;
        }
        if (string3 == null || string3.isEmpty()) {
            this.fbSubtitle = "You logged in earlier with your Facebook account for a different merchant";
        } else {
            this.fbSubtitle = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fbSubtitle, " <b>", string3, "</b>");
        }
        handleDialog(knotView, webView, activity, this.fbTitle, this.fbSubtitle, this.firstBtnText, this.secondBtnText, this.fbLogoBitmap, webResourceRequest);
        return true;
    }

    public void fetchEmailFromWebView(WebView webView, KnotView knotView, Activity activity) {
        String url;
        String determineJSPath;
        if (webView == null || webView.getUrl() == null || knotView == null || (determineJSPath = determineJSPath((url = webView.getUrl()), knotView)) == null || determineJSPath.isEmpty()) {
            return;
        }
        this.emailFetcherJS.fetchJS(determineJSPath, new AnonymousClass1(webView, url));
    }

    public String getCookies(Context context) {
        try {
            JSONObject jSONObject = new JSONObject(EncryptionHelper.getEncryptedString(context, "knotapi_cookies", "cookies", "{}"));
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                long optLong = jSONObject.getJSONObject(next).optLong("timestamp", 0L);
                if (optLong == 0 || currentTimeMillis - optLong > this.cookieExpirationTimeMs) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONObject.remove((String) it.next());
            }
            if (!arrayList.isEmpty()) {
                EncryptionHelper.putEncryptedString(context, "knotapi_cookies", "cookies", jSONObject.toString());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public void getSettings(KnotView knotView) {
        String str;
        JsonElement parseString;
        if (knotView == null || knotView.getBot() == null || knotView.getBot().getGlobalSettings() == null) {
            str = null;
        } else {
            checkDisabledMerchants(knotView);
            str = getString(knotView.getBot().getGlobalSettings(), "sso_cookies", null);
            this.disabledMerchantList = getString(knotView.getBot().getGlobalSettings(), "disabled_merchants", null);
        }
        if (str == null || (parseString = JsonParser.parseString(str)) == null || !parseString.isJsonObject()) {
            return;
        }
        JsonObject asJsonObject = parseString.getAsJsonObject();
        this.firstBtnText = getString(asJsonObject, "first_button", "No thanks");
        this.secondBtnText = getString(asJsonObject, "second_button", "Continue");
        this.googleAuthPattern = getString(asJsonObject, "google_auth_pattern", Constants.google_auth_pattern);
        this.googleReqCookie = getString(asJsonObject, "google_req_cookie", "[\"NID\",\"LSID\",\"SSID\"]");
        this.isGoogleReuseCookiesEnabled = getBoolean(asJsonObject, "google_enable_dialog", true);
        this.googleTitle = getString(asJsonObject, "google_title", "Do you want to reuse your Google account login?");
        this.googleSubtitle = getString(asJsonObject, "google_subheading", "You logged in earlier with your Google account for ");
        this.googleLogoBitmap = getString(asJsonObject, "google_logo_bitmap", null);
        this.fbAuthPattern = getString(asJsonObject, "fb_auth_pattern", "https?:\\/\\/([a-z]+\\.)?facebook\\.com\\/(v\\d+\\.\\d+\\/dialog\\/oauth|login\\.php).*");
        this.fbReqCookie = getString(asJsonObject, "fb_req_cookie", "fr");
        this.isFbReuseCookiesEnabled = getBoolean(asJsonObject, "fb_enable_dialog", true);
        this.fbTitle = getString(asJsonObject, "fb_title", "Do you want to reuse your Facebook account login?");
        this.fbSubtitle = getString(asJsonObject, "fb_subheading", "You logged in earlier with your Facebook account for ");
        this.fbLogoBitmap = getString(asJsonObject, "fb_logo_bitmap", null);
        this.cookieExpirationTimeMs = getInt(asJsonObject, "cookie_expiration_hours", 12) * 3600000;
        this.emailIDFetcherPath = getString(asJsonObject, "emailIdFetcherPath", "/bots/google-sso/emailIdFetcher.js");
        fetchCookieDomain(getString(asJsonObject, "cookie_domains", null));
    }

    public void injectCookies(Activity activity) {
        String cookies = getCookies(activity);
        if (cookies == null || cookies.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(cookies);
            CookieManager cookieManager = CookieManager.getInstance();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                for (String str : jSONObject.getJSONObject(next).getString("cookies").split(";")) {
                    String[] split = str.split("=", 2);
                    if (split.length == 2) {
                        cookieManager.setCookie("https://" + next, split[0].trim() + "=" + split[1].trim() + "; domain=" + next + "; path=/;");
                    }
                }
            }
            cookieManager.flush();
        } catch (Exception unused) {
        }
    }

    public void saveCookiesForDomain(Context context, String str) {
        try {
            List<String> list = this.cookieDomains;
            if (list != null && !list.isEmpty()) {
                CookieManager cookieManager = CookieManager.getInstance();
                for (String str2 : this.cookieDomains) {
                    String cookie = cookieManager.getCookie(str2);
                    if (cookie != null && !cookie.isEmpty()) {
                        saveCookiesToTempStorage(str2, cookie);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void saveEmail(Context context) {
        String str = googleID;
        if (str != null && !str.isEmpty()) {
            saveEmailToSharedPreferences("googleEmail", googleID, context);
            googleID = null;
        }
        String str2 = fbID;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        saveEmailToSharedPreferences("facebookEmail", fbID, context);
        fbID = null;
    }

    public void saveTempCookiesToSharedPreferencesAsync(Context context) {
        try {
            executorService.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(11, this, context, new JSONObject(this.tempCookieData.toString())));
        } catch (Exception unused) {
        }
    }

    public void ssoSessionInActive(String str, KnotView knotView) {
        if (!this.ssoSessionActive || str.equals("about:blank")) {
            return;
        }
        this.proceedWithoutCookies = false;
        this.ssoSessionActive = false;
        this.dialogShown = false;
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
    }
}
