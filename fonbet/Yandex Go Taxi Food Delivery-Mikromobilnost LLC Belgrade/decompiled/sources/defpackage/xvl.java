package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xvl {
    public final String a;
    public final n5o b;
    public final zmk c;

    public xvl(String str, n5o n5oVar, zmk zmkVar) {
        this.a = str;
        this.b = n5oVar;
        this.c = zmkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xvl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xvl xvlVar = (xvl) obj;
        return jl40.l(this.a, xvlVar.a) && jl40.l(this.b, xvlVar.b) && this.c.equals(xvlVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivkitSnippetVo(id=" + this.a + ", data=" + this.b + ", divDataTag=" + this.c + Extension.C_BRAKE;
    }
}
