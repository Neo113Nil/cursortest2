package p7;

import d1.C4445c;
import f6.C4512a;
import f6.c;
import java.util.Objects;
import java.util.logging.Logger;
import k6.e;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4853a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4853a f39797c;

    /* renamed from: a, reason: collision with root package name */
    public final String f39798a;

    /* renamed from: b, reason: collision with root package name */
    public final C4512a f39799b;

    static {
        Logger logger = Logger.getLogger(C4853a.class.getName());
        f6.b bVar = f6.b.f37516n;
        e a9 = e.a(bVar, "service.name");
        e a10 = e.a(bVar, "telemetry.sdk.language");
        e a11 = e.a(bVar, "telemetry.sdk.name");
        e a12 = e.a(bVar, "telemetry.sdk.version");
        C4853a a13 = a(C4512a.f37513w, null);
        C4853a a14 = a(c.a(a9, "unknown_service:java"), null);
        C4445c c4445c = new C4445c();
        c4445c.f(a11, "opentelemetry");
        c4445c.f(a10, "java");
        c4445c.f(a12, "1.55.0");
        C4853a a15 = a(c4445c.d(), null);
        if (a15 != a13) {
            C4445c c4445c2 = new C4445c();
            c4445c2.g(a14.f39799b);
            c4445c2.g(a15.f39799b);
            String str = a14.f39798a;
            String str2 = a15.f39798a;
            if (str2 == null) {
                a14 = a(c4445c2.d(), str);
            } else if (str == null) {
                a14 = a(c4445c2.d(), str2);
            } else if (str2.equals(str)) {
                a14 = a(c4445c2.d(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a14 = a(c4445c2.d(), null);
            }
        }
        f39797c = a14;
    }

    public C4853a(C4512a c4512a, String str) {
        this.f39798a = str;
        if (c4512a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f39799b = c4512a;
    }

    public static C4853a a(C4512a c4512a, String str) {
        Objects.requireNonNull(c4512a, "attributes");
        c4512a.forEach(new C4854b());
        return new C4853a(c4512a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4853a)) {
            return false;
        }
        C4853a c4853a = (C4853a) obj;
        String str = this.f39798a;
        if (str == null) {
            if (c4853a.f39798a != null) {
                return false;
            }
        } else if (!str.equals(c4853a.f39798a)) {
            return false;
        }
        return this.f39799b.equals(c4853a.f39799b);
    }

    public final int hashCode() {
        String str = this.f39798a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f39799b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f39798a + ", attributes=" + this.f39799b + "}";
    }
}
