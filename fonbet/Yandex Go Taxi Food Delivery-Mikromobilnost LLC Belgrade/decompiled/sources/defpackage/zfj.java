package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zfj {
    public final ny6 a;
    public final wp2 b;
    public final wp2 c;

    public zfj(ny6 ny6Var, wp2 wp2Var, wp2 wp2Var2) {
        this.a = ny6Var;
        this.b = wp2Var;
        this.c = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfj)) {
            return false;
        }
        zfj zfjVar = (zfj) obj;
        return this.a.equals(zfjVar.a) && jl40.l(this.b, zfjVar.b) && jl40.l(this.c, zfjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DialogueTrailButton(button=" + this.a + ", bgAppColor=" + this.b + ", textAppColor=" + this.c + Extension.C_BRAKE;
    }
}
