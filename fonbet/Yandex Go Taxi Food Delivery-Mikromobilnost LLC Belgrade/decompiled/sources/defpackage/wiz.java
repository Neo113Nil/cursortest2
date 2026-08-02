package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wiz {
    public final String a;
    public final viz b;
    public final String c;
    public final uiz d;

    public wiz(String str, viz vizVar, String str2, uiz uizVar) {
        this.a = str;
        this.b = vizVar;
        this.c = str2;
        this.d = uizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wiz)) {
            return false;
        }
        wiz wizVar = (wiz) obj;
        return jl40.l(this.a, wizVar.a) && this.b.equals(wizVar.b) && jl40.l(this.c, wizVar.c) && jl40.l(this.d, wizVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        uiz uizVar = this.d;
        return hashCode2 + (uizVar != null ? uizVar.hashCode() : 0);
    }

    public final String toString() {
        return "Performer(name=" + this.a + ", image=" + this.b + ", rating=" + this.c + ", communication=" + this.d + Extension.C_BRAKE;
    }
}
