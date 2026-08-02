package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xrs0 implements css0 {
    public final bss0 a;
    public final bss0 b;

    public xrs0(bss0 bss0Var, bss0 bss0Var2) {
        this.a = bss0Var;
        this.b = bss0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrs0)) {
            return false;
        }
        xrs0 xrs0Var = (xrs0) obj;
        return this.a.equals(xrs0Var.a) && this.b.equals(xrs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DoubleColumn(firstColumn=" + this.a + ", secondColumn=" + this.b + Extension.C_BRAKE;
    }
}
