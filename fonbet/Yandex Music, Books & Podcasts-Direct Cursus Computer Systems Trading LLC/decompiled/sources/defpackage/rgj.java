package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes5.dex */
public final class rgj extends ProxySelector {
    public static final rgj a = new rgj();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return t75.c(Proxy.NO_PROXY);
        }
        xq0.x("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
