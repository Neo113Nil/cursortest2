package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qbz {
    public final pbz a;
    public final String b;
    public final String c;

    public qbz(pbz pbzVar, String str, String str2) {
        this.a = pbzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbz)) {
            return false;
        }
        qbz qbzVar = (qbz) obj;
        return this.a.equals(qbzVar.a) && this.b.equals(qbzVar.b) && this.c.equals(qbzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationState(icon=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
