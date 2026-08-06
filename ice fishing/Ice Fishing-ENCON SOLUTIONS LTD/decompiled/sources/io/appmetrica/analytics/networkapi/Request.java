package io.appmetrica.analytics.networkapi;

import i1.u;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    private final String f7431a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f7432b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7433c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f7434d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f7435a;

        /* renamed from: b, reason: collision with root package name */
        private Method f7436b = Method.GET;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f7437c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final LinkedHashMap f7438d = new LinkedHashMap();

        public Builder(String str) {
            this.f7435a = str;
        }

        public final Builder addHeader(String str, String str2) {
            this.f7438d.put(str, str2);
            return this;
        }

        public final Request build() {
            return new Request(this.f7435a, this.f7436b, this.f7437c, u.M(this.f7438d), null);
        }

        public final Builder withBody(byte[] bArr) {
            this.f7437c = bArr;
            return this;
        }

        public final Builder withMethod(Method method) {
            this.f7436b = method;
            return this;
        }
    }

    public enum Method {
        GET("GET"),
        POST("POST");


        /* renamed from: a, reason: collision with root package name */
        private final String f7440a;

        Method(String str) {
            this.f7440a = str;
        }

        public final String getMethodName() {
            return this.f7440a;
        }
    }

    public /* synthetic */ Request(String str, Method method, byte[] bArr, Map map, e eVar) {
        this(str, method, bArr, map);
    }

    public final byte[] getBody() {
        return this.f7433c;
    }

    public final Map<String, String> getHeaders() {
        return this.f7434d;
    }

    public final Method getMethod() {
        return this.f7432b;
    }

    public final String getUrl() {
        return this.f7431a;
    }

    public String toString() {
        return "Request(url='" + this.f7431a + "', method='" + this.f7432b + "', bodyLength=" + this.f7433c.length + ", headers=" + this.f7434d + ')';
    }

    private Request(String str, Method method, byte[] bArr, Map map) {
        this.f7431a = str;
        this.f7432b = method;
        this.f7433c = bArr;
        this.f7434d = map;
    }
}
