package io.appmetrica.analytics.networkapi;

import io.appmetrica.analytics.networkapi.NetworkClientSettings;

/* loaded from: classes.dex */
public abstract class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkClientSettings f7417a;

    public static abstract class Builder {

        /* renamed from: a, reason: collision with root package name */
        private NetworkClientSettings f7418a = new NetworkClientSettings.Builder().build();

        public abstract NetworkClient build();

        public final NetworkClientSettings getSettings() {
            return this.f7418a;
        }

        public final Builder withSettings(NetworkClientSettings networkClientSettings) {
            this.f7418a = networkClientSettings;
            return this;
        }
    }

    public NetworkClient(NetworkClientSettings networkClientSettings) {
        this.f7417a = networkClientSettings;
    }

    public final NetworkClientSettings getSettings() {
        return this.f7417a;
    }

    public abstract Call newCall(Request request);
}
