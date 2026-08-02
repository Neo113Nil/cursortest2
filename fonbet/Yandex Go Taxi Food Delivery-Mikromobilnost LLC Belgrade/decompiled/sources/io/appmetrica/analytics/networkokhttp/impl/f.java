package io.appmetrica.analytics.networkokhttp.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class f extends NetworkClient {
    public final OkHttpClient a;

    public /* synthetic */ f(NetworkClientSettings networkClientSettings, OkHttpClient okHttpClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkClientSettings, (i & 2) != 0 ? e.a(networkClientSettings) : okHttpClient);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    public final Call newCall(Request request) {
        return new c(this.a, request, getSettings());
    }

    public final String toString() {
        return "OkHttpNetworkClient(settings=" + getSettings() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(NetworkClientSettings networkClientSettings) {
        this(networkClientSettings, null, 2, 0 == true ? 1 : 0);
    }

    public f(NetworkClientSettings networkClientSettings, OkHttpClient okHttpClient) {
        super(networkClientSettings);
        this.a = okHttpClient;
    }
}
