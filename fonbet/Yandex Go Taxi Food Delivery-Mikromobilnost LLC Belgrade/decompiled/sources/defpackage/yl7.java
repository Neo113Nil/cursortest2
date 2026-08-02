package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yl7 {
    public final boolean a;
    public final boolean b;

    public yl7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl7)) {
            return false;
        }
        yl7 yl7Var = (yl7) obj;
        return this.a == yl7Var.a && this.b == yl7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("CallsUiConfiguration(isRtl=", ", isDarkTheme=", Extension.C_BRAKE, this.a, this.b);
    }
}
