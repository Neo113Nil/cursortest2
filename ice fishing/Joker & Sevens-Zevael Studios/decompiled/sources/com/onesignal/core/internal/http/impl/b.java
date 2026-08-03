package com.onesignal.core.internal.http.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;

    public b(com.onesignal.core.internal.config.b bVar) {
        j.e(bVar, "_configModelStore");
        this._configModelStore = bVar;
    }

    @Override // com.onesignal.core.internal.http.impl.c
    public HttpURLConnection newHttpURLConnection(String str) {
        j.e(str, "url");
        URLConnection openConnection = new URL(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getApiUrl() + str).openConnection();
        j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
