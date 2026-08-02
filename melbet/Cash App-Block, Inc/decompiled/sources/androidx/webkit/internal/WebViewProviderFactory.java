package androidx.webkit.internal;

import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes3.dex */
public interface WebViewProviderFactory {
    ProxyControllerBoundaryInterface getProxyController();

    StaticsBoundaryInterface getStatics();

    String[] getWebViewFeatures();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
