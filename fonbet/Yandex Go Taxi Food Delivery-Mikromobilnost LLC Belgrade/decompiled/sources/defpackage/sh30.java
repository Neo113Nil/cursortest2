package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sh30 implements wh30 {
    public final boolean a;
    public final boolean b;

    public sh30(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh30)) {
            return false;
        }
        sh30 sh30Var = (sh30) obj;
        return this.a == sh30Var.a && this.b == sh30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("StateChanged(isExpanded=", ", isUserInitiated=", Extension.C_BRAKE, this.a, this.b);
    }
}
