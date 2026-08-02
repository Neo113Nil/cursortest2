package defpackage;

import com.yx360.design.compose.atoms.DsAvatar$Size;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class sqm implements xqm {
    public final un91 a;
    public final com b;
    public final DsAvatar$Size c;

    public sqm(un91 un91Var, DsAvatar$Size dsAvatar$Size, int i) {
        dsAvatar$Size = (i & 8) != 0 ? DsAvatar$Size.M24 : dsAvatar$Size;
        this.a = un91Var;
        this.b = com.a;
        this.c = dsAvatar$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqm)) {
            return false;
        }
        sqm sqmVar = (sqm) obj;
        return jl40.l(this.a, sqmVar.a) && jl40.l(this.b, sqmVar.b) && this.c == sqmVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        this.b.getClass();
        return this.c.hashCode() + (((-1900897527) + hashCode) * 961);
    }

    public final String toString() {
        return "Avatar(avatar=" + this.a + ", style=" + this.b + ", status=null, size=" + this.c + Extension.C_BRAKE;
    }
}
