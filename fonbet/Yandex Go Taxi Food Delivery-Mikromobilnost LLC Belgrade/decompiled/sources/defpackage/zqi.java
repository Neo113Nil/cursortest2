package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zqi {
    public final kus0 a;
    public final kus0 b;
    public final kez0 c;

    public zqi(kus0 kus0Var, kus0 kus0Var2, kez0 kez0Var) {
        this.a = kus0Var;
        this.b = kus0Var2;
        this.c = kez0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqi)) {
            return false;
        }
        zqi zqiVar = (zqi) obj;
        return this.a.equals(zqiVar.a) && jl40.l(this.b, zqiVar.b) && this.c.equals(zqiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kus0 kus0Var = this.b;
        return this.c.hashCode() + ((hashCode + (kus0Var == null ? 0 : kus0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "SlotContent(since=" + this.a + ", until=" + this.b + ", timer=" + this.c + Extension.C_BRAKE;
    }
}
