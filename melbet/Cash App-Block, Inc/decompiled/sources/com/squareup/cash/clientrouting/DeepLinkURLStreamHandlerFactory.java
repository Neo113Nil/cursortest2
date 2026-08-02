package com.squareup.cash.clientrouting;

import com.squareup.cash.clientroutes.DeepLinksConfig;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class DeepLinkURLStreamHandlerFactory implements URLStreamHandlerFactory {
    public final DeepLinksConfig deepLinksConfig;

    public DeepLinkURLStreamHandlerFactory(DeepLinksConfig deepLinksConfig) {
        deepLinksConfig.getClass();
        this.deepLinksConfig = deepLinksConfig;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (CollectionsKt.contains(this.deepLinksConfig.platformProtocols, str)) {
            return new URLStreamHandler() { // from class: com.squareup.cash.clientrouting.DeepLinkURLStreamHandlerFactory$createURLStreamHandler$1
                @Override // java.net.URLStreamHandler
                public final URLConnection openConnection(final URL url) {
                    url.getClass();
                    return new URLConnection(url) { // from class: com.squareup.cash.clientrouting.DeepLinkURLStreamHandlerFactory$createURLStreamHandler$1$openConnection$1
                        @Override // java.net.URLConnection
                        public final void connect() {
                        }
                    };
                }
            };
        }
        return null;
    }
}
