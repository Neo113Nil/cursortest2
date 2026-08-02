package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class r0k {
    public final gu21 a;
    public final e370 b;

    public r0k(gu21 gu21Var, e370 e370Var) {
        this.a = gu21Var;
        this.b = e370Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0k)) {
            return false;
        }
        r0k r0kVar = (r0k) obj;
        return jl40.l(this.a, r0kVar.a) && jl40.l(this.b, r0kVar.b);
    }

    public final int hashCode() {
        gu21 gu21Var = this.a;
        return this.b.hashCode() + ((gu21Var == null ? 0 : gu21Var.hashCode()) * 31);
    }

    public final String toString() {
        return "DisplayUserStatus(userStatus=" + this.a + ", onlineStatus=" + this.b + Extension.C_BRAKE;
    }
}
