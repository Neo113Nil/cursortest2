package io.appmetrica.analytics.networkapi;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class NetworkClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f7419a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f7420b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f7421c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f7422d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f7423e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7424f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f7425a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f7426b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f7427c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f7428d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f7429e;

        /* renamed from: f, reason: collision with root package name */
        private int f7430f = Integer.MAX_VALUE;

        public final NetworkClientSettings build() {
            return new NetworkClientSettings(this.f7425a, this.f7426b, this.f7427c, this.f7428d, this.f7429e, this.f7430f, null);
        }

        public final Builder withConnectTimeout(int i2) {
            this.f7425a = Integer.valueOf(i2);
            return this;
        }

        public final Builder withInstanceFollowRedirects(boolean z2) {
            this.f7429e = Boolean.valueOf(z2);
            return this;
        }

        public final Builder withMaxResponseSize(int i2) {
            this.f7430f = i2;
            return this;
        }

        public final Builder withReadTimeout(int i2) {
            this.f7426b = Integer.valueOf(i2);
            return this;
        }

        public final Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f7427c = sSLSocketFactory;
            return this;
        }

        public final Builder withUseCaches(boolean z2) {
            this.f7428d = Boolean.valueOf(z2);
            return this;
        }
    }

    public /* synthetic */ NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i2, e eVar) {
        this(num, num2, sSLSocketFactory, bool, bool2, i2);
    }

    public final Integer getConnectTimeout() {
        return this.f7419a;
    }

    public final Boolean getInstanceFollowRedirects() {
        return this.f7423e;
    }

    public final int getMaxResponseSize() {
        return this.f7424f;
    }

    public final Integer getReadTimeout() {
        return this.f7420b;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.f7421c;
    }

    public final Boolean getUseCaches() {
        return this.f7422d;
    }

    public String toString() {
        return "NetworkClientSettings(connectTimeout=" + this.f7419a + ", readTimeout=" + this.f7420b + ", sslSocketFactory=" + this.f7421c + ", useCaches=" + this.f7422d + ", instanceFollowRedirects=" + this.f7423e + ", maxResponseSize=" + this.f7424f + ')';
    }

    private NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i2) {
        this.f7419a = num;
        this.f7420b = num2;
        this.f7421c = sSLSocketFactory;
        this.f7422d = bool;
        this.f7423e = bool2;
        this.f7424f = i2;
    }
}
