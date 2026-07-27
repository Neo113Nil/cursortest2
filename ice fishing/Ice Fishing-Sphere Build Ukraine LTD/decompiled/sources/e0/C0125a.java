package e0;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1846c;

    public C0125a(String str, String str2) {
        this.f1844a = str;
        this.f1845b = null;
        this.f1846c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0125a.class != obj.getClass()) {
            return false;
        }
        C0125a c0125a = (C0125a) obj;
        if (this.f1844a.equals(c0125a.f1844a)) {
            return this.f1846c.equals(c0125a.f1846c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1846c.hashCode() + (this.f1844a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f1844a + ", function: " + this.f1846c + " )";
    }

    public C0125a(String str, String str2, String str3) {
        this.f1844a = str;
        this.f1845b = str2;
        this.f1846c = str3;
    }
}
