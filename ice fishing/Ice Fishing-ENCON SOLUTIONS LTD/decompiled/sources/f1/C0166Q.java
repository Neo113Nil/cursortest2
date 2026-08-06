package f1;

/* renamed from: f1.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0164O f2921b;

    public C0166Q(String str, EnumC0164O enumC0164O) {
        this.f2920a = str;
        this.f2921b = enumC0164O;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C0166Q.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0166Q c0166q = (C0166Q) obj;
        return R1.d.g(this.f2920a, c0166q.f2920a) && R1.d.g(this.f2921b, c0166q.f2921b);
    }

    public final int hashCode() {
        return R1.d.h(this.f2921b) + ((R1.d.h(this.f2920a) + (C0166Q.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2920a + ", type=" + this.f2921b + ")";
    }
}
