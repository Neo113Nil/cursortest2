package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wwl {
    public final vwl a;
    public final vwl b;

    public wwl(vwl vwlVar, vwl vwlVar2) {
        this.a = vwlVar;
        this.b = vwlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wwl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wwl wwlVar = (wwl) obj;
        return jl40.l(this.a, wwlVar.a) && jl40.l(this.b, wwlVar.b);
    }

    public final int hashCode() {
        vwl vwlVar = this.a;
        int hashCode = (vwlVar != null ? vwlVar.hashCode() : 0) * 31;
        vwl vwlVar2 = this.b;
        return hashCode + (vwlVar2 != null ? vwlVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TransitionSettings(onShow=" + this.a + ", onHide=" + this.b + Extension.C_BRAKE;
    }
}
