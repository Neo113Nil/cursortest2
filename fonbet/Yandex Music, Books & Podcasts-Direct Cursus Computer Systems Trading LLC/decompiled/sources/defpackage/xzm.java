package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class xzm {
    public static final Logger d = Logger.getLogger(xzm.class.getName());
    public static final ujl e = new ujl();
    public static final vqd f = new vqd(1);
    public final yqr a;
    public final ujl b;
    public final InetSocketAddress c;

    public xzm() {
        String str = System.getenv("GRPC_PROXY_EXP");
        vqd vqdVar = f;
        vqdVar.getClass();
        this.a = vqdVar;
        ujl ujlVar = e;
        ujlVar.getClass();
        this.b = ujlVar;
        if (str == null) {
            this.c = null;
            return;
        }
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.c = new InetSocketAddress(split[0], parseInt);
    }

    public final wzm a(InetSocketAddress inetSocketAddress) {
        URL url;
        d6e d6eVar;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.c;
            if (inetSocketAddress2 != null) {
                return new d6e(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = d;
            try {
                try {
                    URI uri = new URI("https", null, xqd.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> select = proxySelector.select(uri);
                    if (select.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String d2 = xqd.d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.b.getClass();
                        try {
                            url = new URL("https", d2, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", d2});
                            url = null;
                        }
                        PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(d2, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i = d6e.e;
                        if (requestPasswordAuthentication == null) {
                            d6eVar = new d6e(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            d6eVar = new d6e(inetSocketAddress3, inetSocketAddress, requestPasswordAuthentication.getUserName(), requestPasswordAuthentication.getPassword() != null ? new String(requestPasswordAuthentication.getPassword()) : null);
                        }
                        return d6eVar;
                    }
                } catch (URISyntaxException e2) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
