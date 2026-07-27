package q0;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4861a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39969a;

    public C4861a(boolean z3) {
        this.f39969a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4861a)) {
            return false;
        }
        C4861a c4861a = (C4861a) obj;
        c4861a.getClass();
        return this.f39969a == c4861a.f39969a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39969a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f39969a;
    }
}
