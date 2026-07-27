package e0;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1836a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1837b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1838c;

    public C0125a(String str, String str2) {
        this.f1836a = str;
        this.f1837b = null;
        this.f1838c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0125a.class != obj.getClass()) {
            return false;
        }
        C0125a c0125a = (C0125a) obj;
        if (this.f1836a.equals(c0125a.f1836a)) {
            return this.f1838c.equals(c0125a.f1838c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1838c.hashCode() + (this.f1836a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f1836a + ", function: " + this.f1838c + " )";
    }

    public C0125a(String str, String str2, String str3) {
        this.f1836a = str;
        this.f1837b = str2;
        this.f1838c = str3;
    }
}
