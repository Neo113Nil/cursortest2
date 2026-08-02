package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sqb implements tqb {
    public final boolean a;
    public final boolean b;

    public sqb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqb)) {
            return false;
        }
        sqb sqbVar = (sqb) obj;
        return this.a == sqbVar.a && this.b == sqbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("PlusMinus(isPlusAvailable=", ", isMinusAvailable=", Extension.C_BRAKE, this.a, this.b);
    }
}
