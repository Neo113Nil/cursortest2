package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes8.dex */
public final class yqt extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            return ProxySelector.getDefault().select(uri);
        } catch (Exception e) {
            jst.e.k(e, "User has incorrect proxy configuration!");
            return scc.i(Proxy.NO_PROXY);
        }
    }
}
