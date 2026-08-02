package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vei {
    public final zzs a;
    public final uc4 b;

    public vei(zzs zzsVar, uc4 uc4Var) {
        this.a = zzsVar;
        this.b = uc4Var;
    }

    public final uc4 a() {
        return this.b;
    }

    public final zzs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vei)) {
            return false;
        }
        vei veiVar = (vei) obj;
        return this.a.equals(veiVar.a) && this.b.equals(veiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestArea(pinPosition=" + this.a + ", bbox=" + this.b + Extension.C_BRAKE;
    }
}
