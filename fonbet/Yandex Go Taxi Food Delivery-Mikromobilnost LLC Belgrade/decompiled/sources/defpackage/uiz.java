package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uiz {
    public final String a;
    public final boolean b;
    public final tiz c;

    public uiz(String str, boolean z, tiz tizVar) {
        this.a = str;
        this.b = z;
        this.c = tizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiz)) {
            return false;
        }
        uiz uizVar = (uiz) obj;
        return jl40.l(this.a, uizVar.a) && this.b == uizVar.b && jl40.l(this.c, uizVar.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        tiz tizVar = this.c;
        return e + (tizVar == null ? 0 : tizVar.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("Communication(buttonText=", this.a, ", hasOngoingCall=", ", method=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
