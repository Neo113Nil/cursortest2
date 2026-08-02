package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rx41 {
    public final ix41 a;
    public final int b;
    public final boolean c;

    public rx41(ix41 ix41Var, int i, boolean z) {
        this.a = ix41Var;
        this.b = i;
        this.c = z;
    }

    public static rx41 a(rx41 rx41Var, ix41 ix41Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            ix41Var = rx41Var.a;
        }
        if ((i2 & 2) != 0) {
            i = rx41Var.b;
        }
        if ((i2 & 4) != 0) {
            z = rx41Var.c;
        }
        rx41Var.getClass();
        return new rx41(ix41Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx41)) {
            return false;
        }
        rx41 rx41Var = (rx41) obj;
        return jl40.l(this.a, rx41Var.a) && this.b == rx41Var.b && this.c == rx41Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelDatePickerUiState(data=");
        sb.append(this.a);
        sb.append(", selectedIndex=");
        sb.append(this.b);
        sb.append(", isScrolling=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public rx41() {
        this(0);
    }

    public rx41(int i) {
        this(ix41.d, 0, false);
    }
}
