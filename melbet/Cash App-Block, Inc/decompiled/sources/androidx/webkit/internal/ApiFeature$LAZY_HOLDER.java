package androidx.webkit.internal;

import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class ApiFeature$LAZY_HOLDER {
    public static final HashSet WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getWebViewFeatures()));
}
