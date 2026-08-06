package io.appmetrica.analytics.networkapi;

import i1.s;
import i1.u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7441a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7442b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7443c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f7444d;

    /* renamed from: e, reason: collision with root package name */
    private final Throwable f7445e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7446f;

    public /* synthetic */ Response(boolean z2, int i2, byte[] bArr, Map map, Throwable th, String str, e eVar) {
        this(z2, i2, bArr, map, th, str);
    }

    public final int getCode() {
        return this.f7442b;
    }

    public final Throwable getException() {
        return this.f7445e;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f7444d;
    }

    public final byte[] getResponseData() {
        return this.f7443c;
    }

    public final String getUrl() {
        return this.f7446f;
    }

    public final boolean isCompleted() {
        return this.f7441a;
    }

    public String toString() {
        return "Response(isCompleted=" + this.f7441a + ", code=" + this.f7442b + ", responseDataLength=" + this.f7443c.length + ", headers=" + this.f7444d + ", exception=" + this.f7445e + ", url=" + this.f7446f + ')';
    }

    private Response(boolean z2, int i2, byte[] bArr, Map map, Throwable th, String str) {
        this.f7441a = z2;
        this.f7442b = i2;
        this.f7443c = bArr;
        this.f7444d = map;
        this.f7445e = th;
        this.f7446f = str;
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f7447a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7448b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7449c;

        /* renamed from: d, reason: collision with root package name */
        private final Throwable f7450d;

        /* renamed from: e, reason: collision with root package name */
        private Map f7451e;

        /* renamed from: f, reason: collision with root package name */
        private String f7452f;

        private Builder(boolean z2, int i2, byte[] bArr, Throwable th) {
            this.f7447a = z2;
            this.f7448b = i2;
            this.f7449c = bArr;
            this.f7450d = th;
            this.f7451e = s.f3417a;
        }

        public final Response build() {
            return new Response(this.f7447a, this.f7448b, this.f7449c, this.f7451e, this.f7450d, this.f7452f, null);
        }

        public final Builder withHeaders(Map<String, ? extends List<String>> map) {
            this.f7451e = u.M(map);
            return this;
        }

        public final Builder withUrl(String str) {
            this.f7452f = str;
            return this;
        }

        public Builder(Throwable th) {
            this(false, 0, new byte[0], th);
        }

        public Builder(boolean z2, int i2, byte[] bArr) {
            this(z2, i2, bArr, null);
        }
    }
}
