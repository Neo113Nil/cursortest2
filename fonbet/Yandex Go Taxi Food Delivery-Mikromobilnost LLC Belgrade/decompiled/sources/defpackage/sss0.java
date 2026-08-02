package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sss0 implements tss0 {
    public final boolean a;
    public final boolean b;

    public sss0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sss0)) {
            return false;
        }
        sss0 sss0Var = (sss0) obj;
        return this.a == sss0Var.a && this.b == sss0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("Switch(isChecked=", ", isClickable=", Extension.C_BRAKE, this.a, this.b);
    }
}
