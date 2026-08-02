package io.appmetrica.analytics.networkapi;

import defpackage.oo31;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010)\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001d¨\u0006+"}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkClientSettings;", "", "", "toString", "", "a", "Ljava/lang/Integer;", "getConnectTimeout", "()Ljava/lang/Integer;", "connectTimeout", "b", "getReadTimeout", "readTimeout", "", "c", "Ljava/lang/Long;", "getCallTimeout", "()Ljava/lang/Long;", "callTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "d", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "e", "Ljava/lang/Boolean;", "getUseCaches", "()Ljava/lang/Boolean;", "useCaches", "f", "getInstanceFollowRedirects", "instanceFollowRedirects", "g", CA20Status.STATUS_USER_I, "getMaxResponseSize", "()I", "maxResponseSize", "h", "getCollectMetrics", "collectMetrics", "Builder", "network-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class NetworkClientSettings {

    /* renamed from: a, reason: from kotlin metadata */
    private final Integer connectTimeout;

    /* renamed from: b, reason: from kotlin metadata */
    private final Integer readTimeout;

    /* renamed from: c, reason: from kotlin metadata */
    private final Long callTimeout;

    /* renamed from: d, reason: from kotlin metadata */
    private final SSLSocketFactory sslSocketFactory;

    /* renamed from: e, reason: from kotlin metadata */
    private final Boolean useCaches;

    /* renamed from: f, reason: from kotlin metadata */
    private final Boolean instanceFollowRedirects;

    /* renamed from: g, reason: from kotlin metadata */
    private final int maxResponseSize;

    /* renamed from: h, reason: from kotlin metadata */
    private final Boolean collectMetrics;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0018¨\u0006\u001c"}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkClientSettings$Builder;", "", "", "connectTimeout", "withConnectTimeout", "readTimeout", "withReadTimeout", "", "callTimeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "withCallTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "withSslSocketFactory", "", "useCaches", "withUseCaches", "instanceFollowRedirects", "withInstanceFollowRedirects", "maxResponseSize", "withMaxResponseSize", "collectMetrics", "withCollectMetrics", "Lio/appmetrica/analytics/networkapi/NetworkClientSettings;", "build", "<init>", "()V", "network-api_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private Integer a;
        private Integer b;
        private Long c;
        private SSLSocketFactory d;
        private Boolean e;
        private Boolean f;
        private int g = Integer.MAX_VALUE;
        private Boolean h;

        public final NetworkClientSettings build() {
            return new NetworkClientSettings(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
        }

        public final Builder withCallTimeout(long callTimeout, TimeUnit timeUnit) {
            this.c = Long.valueOf(timeUnit.toMillis(callTimeout));
            return this;
        }

        public final Builder withCollectMetrics(boolean collectMetrics) {
            this.h = Boolean.valueOf(collectMetrics);
            return this;
        }

        public final Builder withConnectTimeout(int connectTimeout) {
            this.a = Integer.valueOf(connectTimeout);
            return this;
        }

        public final Builder withInstanceFollowRedirects(boolean instanceFollowRedirects) {
            this.f = Boolean.valueOf(instanceFollowRedirects);
            return this;
        }

        public final Builder withMaxResponseSize(int maxResponseSize) {
            this.g = maxResponseSize;
            return this;
        }

        public final Builder withReadTimeout(int readTimeout) {
            this.b = Integer.valueOf(readTimeout);
            return this;
        }

        public final Builder withSslSocketFactory(SSLSocketFactory sslSocketFactory) {
            this.d = sslSocketFactory;
            return this;
        }

        public final Builder withUseCaches(boolean useCaches) {
            this.e = Boolean.valueOf(useCaches);
            return this;
        }
    }

    private NetworkClientSettings(Integer num, Integer num2, Long l, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i, Boolean bool3) {
        this.connectTimeout = num;
        this.readTimeout = num2;
        this.callTimeout = l;
        this.sslSocketFactory = sSLSocketFactory;
        this.useCaches = bool;
        this.instanceFollowRedirects = bool2;
        this.maxResponseSize = i;
        this.collectMetrics = bool3;
    }

    public final Long getCallTimeout() {
        return this.callTimeout;
    }

    public final Boolean getCollectMetrics() {
        return this.collectMetrics;
    }

    public final Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Boolean getInstanceFollowRedirects() {
        return this.instanceFollowRedirects;
    }

    public final int getMaxResponseSize() {
        return this.maxResponseSize;
    }

    public final Integer getReadTimeout() {
        return this.readTimeout;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final Boolean getUseCaches() {
        return this.useCaches;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkClientSettings(connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", callTimeout=");
        sb.append(this.callTimeout);
        sb.append(", sslSocketFactory=");
        sb.append(this.sslSocketFactory);
        sb.append(", useCaches=");
        sb.append(this.useCaches);
        sb.append(", instanceFollowRedirects=");
        sb.append(this.instanceFollowRedirects);
        sb.append(", maxResponseSize=");
        sb.append(this.maxResponseSize);
        sb.append(", collectMetrics=");
        return oo31.i(sb, this.collectMetrics, ')');
    }

    public /* synthetic */ NetworkClientSettings(Integer num, Integer num2, Long l, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i, Boolean bool3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, l, sSLSocketFactory, bool, bool2, i, bool3);
    }
}
