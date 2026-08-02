package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class st51 extends ProxySelector {
    public final AppAnalyticsReporter a;

    public st51(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        z94 z94Var = this.a.V;
        String uri2 = uri != null ? uri.toString() : null;
        String obj = socketAddress != null ? socketAddress.toString() : null;
        String message = iOException != null ? iOException.getMessage() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (uri2 != null) {
            linkedHashMap.put(LaunchBrowserActivity.KEY_URI, uri2);
        }
        if (obj != null) {
            linkedHashMap.put("socket_address", obj);
        }
        if (message != null) {
            linkedHashMap.put("error", message);
        }
        z94Var.a.a("proxy_selector.connect_failed", linkedHashMap);
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            return ProxySelector.getDefault().select(uri);
        } catch (Exception e) {
            z94 z94Var = this.a.V;
            String valueOf = String.valueOf(uri);
            String message = e.getMessage();
            LinkedHashMap w = g8e.w(2, LaunchBrowserActivity.KEY_URI, valueOf);
            if (message != null) {
                w.put("error", message);
            }
            z94Var.a.a("proxy_selector.select_error", w);
            return Collections.singletonList(Proxy.NO_PROXY);
        }
    }
}
