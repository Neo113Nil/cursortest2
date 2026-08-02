package defpackage;

/* loaded from: classes13.dex */
public final class xsn0 {
    public final hro0 a;
    public final long b;
    public final boolean c;

    public xsn0(hro0 hro0Var, long j, boolean z) {
        this.a = hro0Var;
        this.b = j;
        this.c = z;
    }

    public final r7p0 a() {
        hro0 hro0Var = this.a;
        ero0 ero0Var = hro0Var instanceof ero0 ? (ero0) hro0Var : null;
        if (ero0Var != null) {
            return ero0Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xsn0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return jl40.l(a(), ((xsn0) obj).a());
        }
        ny61.t("null cannot be cast to non-null type com.yandex.go.scooters.qr.preview.domain.model.ScootersIncomingResult");
        return false;
    }

    public final int hashCode() {
        r7p0 a = a();
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
}
