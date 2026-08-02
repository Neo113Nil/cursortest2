package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rtk0 {
    public final boolean a;
    public final boolean b;

    public rtk0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtk0)) {
            return false;
        }
        rtk0 rtk0Var = (rtk0) obj;
        return this.a == rtk0Var.a && this.b == rtk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("Radio(isEnabled=", ", isChecked=", Extension.C_BRAKE, this.a, this.b);
    }
}
