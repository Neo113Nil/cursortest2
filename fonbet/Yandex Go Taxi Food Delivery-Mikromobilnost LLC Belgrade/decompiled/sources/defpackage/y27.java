package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y27 {
    public static final y27 f = new y27(null, 0 == true ? 1 : 0, 31);
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final sls e;

    public /* synthetic */ y27(String str, sls slsVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0, xng0.controlMain, xng0.textOnControl, (i & 16) != 0 ? new rm6(18) : slsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y27)) {
            return false;
        }
        y27 y27Var = (y27) obj;
        return jl40.l(this.a, y27Var.a) && this.b == y27Var.b && this.c == y27Var.c && this.d == y27Var.d && jl40.l(this.e, y27Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ButtonState(text=", this.a, ", isVisible=", ", buttonColorAttr=", this.b);
        vfc.u(this.c, this.d, ", textColorAttr=", ", onClick=", l);
        return ly3.r(l, this.e, Extension.C_BRAKE);
    }

    public y27(String str, boolean z, int i, int i2, sls slsVar) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = slsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y27() {
        this(null, 0 == true ? 1 : 0, 31);
    }
}
