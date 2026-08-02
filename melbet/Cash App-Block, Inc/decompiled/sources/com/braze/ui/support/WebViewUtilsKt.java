package com.braze.ui.support;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebSettingsNoOpAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import com.braze.support.BrazeLogger;
import com.fillr.n;
import com.knotapi.knot.utilities.PreferenceManager;
import com.nimbusds.jose.util.X509CertUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", "setWebViewSettings", "", PreferenceManager.PREF_SETTINGS, "Landroid/webkit/WebSettings;", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebViewUtilsKt {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    public static final void setWebViewSettings(WebSettings webSettings, Context context) {
        n.b webSettingsNoOpAdapter;
        webSettings.getClass();
        context.getClass();
        int i = 1;
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(false);
        try {
            if (WebViewFeature.isFeatureSupported("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                WebViewFeatureInternal.FORCE_DARK.getClass();
                webSettings.setForceDark(2);
            }
            if (WebViewFeature.isFeatureSupported("FORCE_DARK_STRATEGY")) {
                if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
                    throw WebViewFeatureInternal.getUnsupportedOperationException();
                }
                try {
                    webSettingsNoOpAdapter = new n.b((WebSettingsBoundaryInterface) X509CertUtils.castToSuppLibClass(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE.a).convertSettings(webSettings)), i);
                } catch (ClassCastException e) {
                    if (Build.VERSION.SDK_INT != 30) {
                        throw e;
                    }
                    if (!"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                        throw e;
                    }
                    Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
                    webSettingsNoOpAdapter = new WebSettingsNoOpAdapter(null, i);
                }
                webSettingsNoOpAdapter.setForceDarkStrategy();
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(15), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewSettings$lambda$0() {
        return "Failed to set dark mode WebView settings.";
    }
}
