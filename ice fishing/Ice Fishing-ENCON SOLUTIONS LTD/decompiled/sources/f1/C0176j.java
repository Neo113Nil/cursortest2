package f1;

/* renamed from: f1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2937b;

    public C0176j(String str, boolean z2) {
        this.f2936a = str;
        this.f2937b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C0176j.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0176j c0176j = (C0176j) obj;
        return R1.d.g(this.f2936a, c0176j.f2936a) && R1.d.g(Boolean.valueOf(this.f2937b), Boolean.valueOf(c0176j.f2937b));
    }

    public final int hashCode() {
        return R1.d.h(Boolean.valueOf(this.f2937b)) + ((R1.d.h(this.f2936a) + (C0176j.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2936a + ", useDataStore=" + this.f2937b + ")";
    }
}
