package com.gamericefishpro.space.yc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    private final com.gamericefishpro.space.rc.b _configModelStore;

    public b(com.gamericefishpro.space.rc.b _configModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // com.gamericefishpro.space.yc.c
    public HttpURLConnection newHttpURLConnection(String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection uRLConnectionOpenConnection = new URL(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getApiUrl() + url).openConnection();
        Intrinsics.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
