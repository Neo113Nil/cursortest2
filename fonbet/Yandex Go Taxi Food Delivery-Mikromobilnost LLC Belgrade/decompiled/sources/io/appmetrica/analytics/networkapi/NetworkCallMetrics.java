package io.appmetrica.analytics.networkapi;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.b64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "", "", "toString", "", "a", "Ljava/lang/Long;", "getDnsLookup", "()Ljava/lang/Long;", "dnsLookup", "b", "getTcpConnect", "tcpConnect", "c", "getTlsHandshake", "tlsHandshake", "d", "getTimeToFirstByte", "timeToFirstByte", "e", "getResponse", "response", "", "f", "Z", "getConnectionReused", "()Z", "connectionReused", "g", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Builder", "network-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NetworkCallMetrics {

    /* renamed from: a, reason: from kotlin metadata */
    private final Long dnsLookup;

    /* renamed from: b, reason: from kotlin metadata */
    private final Long tcpConnect;

    /* renamed from: c, reason: from kotlin metadata */
    private final Long tlsHandshake;

    /* renamed from: d, reason: from kotlin metadata */
    private final Long timeToFirstByte;

    /* renamed from: e, reason: from kotlin metadata */
    private final Long response;

    /* renamed from: f, reason: from kotlin metadata */
    private final boolean connectionReused;

    /* renamed from: g, reason: from kotlin metadata */
    private final String protocol;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u0018"}, d2 = {"Lio/appmetrica/analytics/networkapi/NetworkCallMetrics$Builder;", "", "", "dnsLookup", "withDnsLookup", "(Ljava/lang/Long;)Lio/appmetrica/analytics/networkapi/NetworkCallMetrics$Builder;", "tcpConnect", "withTcpConnect", "tlsHandshake", "withTlsHandshake", "timeToFirstByte", "withTimeToFirstByte", "response", "withResponse", "", "connectionReused", "withConnectionReused", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "withProtocol", "Lio/appmetrica/analytics/networkapi/NetworkCallMetrics;", "build", "<init>", "()V", "network-api_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {
        private Long a;
        private Long b;
        private Long c;
        private Long d;
        private Long e;
        private boolean f;
        private String g;

        public final NetworkCallMetrics build() {
            return new NetworkCallMetrics(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        public final Builder withConnectionReused(boolean connectionReused) {
            this.f = connectionReused;
            return this;
        }

        public final Builder withDnsLookup(Long dnsLookup) {
            this.a = dnsLookup;
            return this;
        }

        public final Builder withProtocol(String protocol) {
            this.g = protocol;
            return this;
        }

        public final Builder withResponse(Long response) {
            this.e = response;
            return this;
        }

        public final Builder withTcpConnect(Long tcpConnect) {
            this.b = tcpConnect;
            return this;
        }

        public final Builder withTimeToFirstByte(Long timeToFirstByte) {
            this.d = timeToFirstByte;
            return this;
        }

        public final Builder withTlsHandshake(Long tlsHandshake) {
            this.c = tlsHandshake;
            return this;
        }
    }

    private NetworkCallMetrics(Long l, Long l2, Long l3, Long l4, Long l5, boolean z, String str) {
        this.dnsLookup = l;
        this.tcpConnect = l2;
        this.tlsHandshake = l3;
        this.timeToFirstByte = l4;
        this.response = l5;
        this.connectionReused = z;
        this.protocol = str;
    }

    public final boolean getConnectionReused() {
        return this.connectionReused;
    }

    public final Long getDnsLookup() {
        return this.dnsLookup;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final Long getResponse() {
        return this.response;
    }

    public final Long getTcpConnect() {
        return this.tcpConnect;
    }

    public final Long getTimeToFirstByte() {
        return this.timeToFirstByte;
    }

    public final Long getTlsHandshake() {
        return this.tlsHandshake;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkCallMetrics(dnsLookup=");
        sb.append(this.dnsLookup);
        sb.append(", tcpConnect=");
        sb.append(this.tcpConnect);
        sb.append(", tlsHandshake=");
        sb.append(this.tlsHandshake);
        sb.append(", timeToFirstByte=");
        sb.append(this.timeToFirstByte);
        sb.append(", response=");
        sb.append(this.response);
        sb.append(", connectionReused=");
        sb.append(this.connectionReused);
        sb.append(", protocol=");
        return b64.p(sb, this.protocol, ')');
    }

    public /* synthetic */ NetworkCallMetrics(Long l, Long l2, Long l3, Long l4, Long l5, boolean z, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, l4, l5, z, str);
    }
}
