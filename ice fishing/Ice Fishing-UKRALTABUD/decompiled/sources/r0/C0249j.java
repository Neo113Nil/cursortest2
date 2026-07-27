package r0;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2889b;

    public C0249j(String str, boolean z2) {
        this.f2888a = str;
        this.f2889b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C0249j.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0249j c0249j = (C0249j) obj;
        return o.g.k(this.f2888a, c0249j.f2888a) && o.g.k(Boolean.valueOf(this.f2889b), Boolean.valueOf(c0249j.f2889b));
    }

    public final int hashCode() {
        return o.g.l(Boolean.valueOf(this.f2889b)) + ((o.g.l(this.f2888a) + (C0249j.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2888a + ", useDataStore=" + this.f2889b + ")";
    }
}
