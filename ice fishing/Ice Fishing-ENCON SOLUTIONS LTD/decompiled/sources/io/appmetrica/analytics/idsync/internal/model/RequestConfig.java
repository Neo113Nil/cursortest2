package io.appmetrica.analytics.idsync.internal.model;

import C1.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f4084a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4085b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f4086c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f4087d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4088e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4089f;

    /* renamed from: g, reason: collision with root package name */
    private final List f4090g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4091h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4092i;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j2, long j3, List<Integer> list, boolean z2, String str3) {
        this.f4084a = str;
        this.f4085b = str2;
        this.f4086c = preconditions;
        this.f4087d = map;
        this.f4088e = j2;
        this.f4089f = j3;
        this.f4090g = list;
        this.f4091h = z2;
        this.f4092i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.f4088e == requestConfig.f4088e && this.f4089f == requestConfig.f4089f && i.a(this.f4084a, requestConfig.f4084a) && i.a(this.f4085b, requestConfig.f4085b) && i.a(this.f4086c, requestConfig.f4086c) && i.a(this.f4087d, requestConfig.f4087d) && i.a(this.f4090g, requestConfig.f4090g) && this.f4091h == requestConfig.f4091h && i.a(this.f4092i, requestConfig.f4092i);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f4087d;
    }

    public final Preconditions getPreconditions() {
        return this.f4086c;
    }

    public final boolean getReportEventEnabled() {
        return this.f4091h;
    }

    public final String getReportUrl() {
        return this.f4092i;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f4089f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f4088e;
    }

    public final String getType() {
        return this.f4084a;
    }

    public final String getUrl() {
        return this.f4085b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f4090g;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.f4091h) + ((this.f4090g.hashCode() + ((this.f4087d.hashCode() + ((this.f4086c.hashCode() + a.e(this.f4085b, a.e(this.f4084a, (Long.hashCode(this.f4089f) + (Long.hashCode(this.f4088e) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f4092i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f4084a + "', url='" + this.f4085b + "', preconditions=" + this.f4086c + ", headers=" + this.f4087d + ", resendIntervalForValidResponse=" + this.f4088e + ", resendIntervalForInvalidResponse=" + this.f4089f + ", validResponseCodes=" + this.f4090g + ", reportEventEnabled=" + this.f4091h + ", reportUrl=" + this.f4092i + ')';
    }
}
