package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class v6c0 implements x6c0 {
    public final ti80 a;
    public final je80 b;

    public v6c0(ti80 ti80Var, je80 je80Var) {
        this.a = ti80Var;
        this.b = je80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6c0)) {
            return false;
        }
        v6c0 v6c0Var = (v6c0) obj;
        return this.a.equals(v6c0Var.a) && jl40.l(this.b, v6c0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        je80 je80Var = this.b;
        return hashCode + (je80Var == null ? 0 : je80Var.hashCode());
    }

    public final String toString() {
        return "OrganizationCard(organizationId=" + this.a + ", externalOverridesConfig=" + this.b + Extension.C_BRAKE;
    }
}
