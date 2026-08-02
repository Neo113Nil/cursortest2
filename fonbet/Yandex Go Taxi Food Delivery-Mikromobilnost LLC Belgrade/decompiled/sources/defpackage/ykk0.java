package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ykk0 {
    public final Integer a;
    public final boolean b;
    public final boolean c;
    public final Float d;
    public final Float e;
    public final boolean f;

    public ykk0(Integer num, boolean z, boolean z2, Float f, Float f2, boolean z3) {
        this.a = num;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = f2;
        this.f = z3;
    }

    public static ykk0 a(ykk0 ykk0Var, Integer num, boolean z, boolean z2, Float f, Float f2, boolean z3, int i) {
        if ((i & 2) != 0) {
            z = ykk0Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = ykk0Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            f = ykk0Var.d;
        }
        Float f3 = f;
        if ((i & 16) != 0) {
            f2 = ykk0Var.e;
        }
        Float f4 = f2;
        if ((i & 32) != 0) {
            z3 = ykk0Var.f;
        }
        ykk0Var.getClass();
        return new ykk0(num, z4, z5, f3, f4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykk0)) {
            return false;
        }
        ykk0 ykk0Var = (ykk0) obj;
        return jl40.l(this.a, ykk0Var.a) && this.b == ykk0Var.b && this.c == ykk0Var.c && jl40.l(this.d, ykk0Var.d) && jl40.l(this.e, ykk0Var.e) && this.f == ykk0Var.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int e = unr0.e(unr0.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c);
        Float f = this.d;
        int hashCode = (e + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RideCardModalViewState(bottomSheetState=" + this.a + ", canDrag=" + this.b + ", skipAnchoredState=" + this.c + ", anchorScreenRatio=" + this.d + ", collapsedScreenRatio=" + this.e + ", blockOthersA11yOnExpand=" + this.f + Extension.C_BRAKE;
    }
}
