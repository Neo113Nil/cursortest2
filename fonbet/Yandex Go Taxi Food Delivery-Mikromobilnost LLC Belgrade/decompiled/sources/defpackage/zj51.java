package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zj51 {
    public final String a;
    public final tw80 b;
    public final hzq c;

    public zj51(String str, tw80 tw80Var, hzq hzqVar) {
        this.a = str;
        this.b = tw80Var;
        this.c = hzqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj51)) {
            return false;
        }
        zj51 zj51Var = (zj51) obj;
        return this.a.equals(zj51Var.a) && jl40.l(this.b, zj51Var.b) && this.c.equals(zj51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreparedFileData(uploadId=" + this.a + ", attachment=" + this.b + ", fetchResult=" + this.c + Extension.C_BRAKE;
    }
}
