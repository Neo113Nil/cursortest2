package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yeg0 {
    public final xeg0 a;
    public final String b;
    public final boolean c;

    public yeg0(xeg0 xeg0Var, String str, boolean z) {
        this.a = xeg0Var;
        this.b = str;
        this.c = z;
    }

    public static yeg0 a(yeg0 yeg0Var, xeg0 xeg0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            xeg0Var = yeg0Var.a;
        }
        if ((i & 2) != 0) {
            str = yeg0Var.b;
        }
        if ((i & 4) != 0) {
            z = yeg0Var.c;
        }
        yeg0Var.getClass();
        return new yeg0(xeg0Var, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeg0)) {
            return false;
        }
        yeg0 yeg0Var = (yeg0) obj;
        return jl40.l(this.a, yeg0Var.a) && jl40.l(this.b, yeg0Var.b) && this.c == yeg0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrScanUiState(screen=");
        sb.append(this.a);
        sb.append(", enterNumberInput=");
        sb.append(this.b);
        sb.append(", isFlashlightEnabled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public yeg0() {
        this(0);
    }

    public /* synthetic */ yeg0(int i) {
        this(veg0.a, "", false);
    }
}
