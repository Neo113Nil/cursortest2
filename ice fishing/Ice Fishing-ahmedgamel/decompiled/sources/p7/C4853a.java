package p7;

import f6.C4522a;
import f6.c;
import java.util.Objects;
import java.util.logging.Logger;
import k6.e;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4853a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4853a f39847c;

    /* renamed from: a, reason: collision with root package name */
    public final String f39848a;

    /* renamed from: b, reason: collision with root package name */
    public final C4522a f39849b;

    static {
        Logger logger = Logger.getLogger(C4853a.class.getName());
        f6.b bVar = f6.b.f37478n;
        e a9 = e.a(bVar, "service.name");
        e a10 = e.a(bVar, "telemetry.sdk.language");
        e a11 = e.a(bVar, "telemetry.sdk.name");
        e a12 = e.a(bVar, "telemetry.sdk.version");
        C4853a a13 = a(C4522a.f37475w, null);
        C4853a a14 = a(c.a(a9, "unknown_service:java"), null);
        K1.c cVar = new K1.c(1);
        cVar.c(a11, "opentelemetry");
        cVar.c(a10, "java");
        cVar.c(a12, "1.55.0");
        C4853a a15 = a(cVar.a(), null);
        if (a15 != a13) {
            K1.c cVar2 = new K1.c(1);
            cVar2.d(a14.f39849b);
            cVar2.d(a15.f39849b);
            String str = a14.f39848a;
            String str2 = a15.f39848a;
            if (str2 == null) {
                a14 = a(cVar2.a(), str);
            } else if (str == null) {
                a14 = a(cVar2.a(), str2);
            } else if (str2.equals(str)) {
                a14 = a(cVar2.a(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a14 = a(cVar2.a(), null);
            }
        }
        f39847c = a14;
    }

    public C4853a(C4522a c4522a, String str) {
        this.f39848a = str;
        if (c4522a == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f39849b = c4522a;
    }

    public static C4853a a(C4522a c4522a, String str) {
        Objects.requireNonNull(c4522a, "attributes");
        c4522a.forEach(new C4854b());
        return new C4853a(c4522a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4853a)) {
            return false;
        }
        C4853a c4853a = (C4853a) obj;
        String str = this.f39848a;
        if (str == null) {
            if (c4853a.f39848a != null) {
                return false;
            }
        } else if (!str.equals(c4853a.f39848a)) {
            return false;
        }
        return this.f39849b.equals(c4853a.f39849b);
    }

    public final int hashCode() {
        String str = this.f39848a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f39849b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f39848a + ", attributes=" + this.f39849b + "}";
    }
}
