package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u0s0 extends n351 {
    public final String c;
    public final bzr0 d;
    public final b151 e;
    public final qj4 f;
    public final x2s g;

    public u0s0(String str, bzr0 bzr0Var, x9x0 x9x0Var, qj4 qj4Var, x2s x2sVar) {
        super("shortcut", false, 14);
        this.c = str;
        this.d = bzr0Var;
        this.e = x9x0Var;
        this.f = qj4Var;
        this.g = x2sVar;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0s0)) {
            return false;
        }
        u0s0 u0s0Var = (u0s0) obj;
        return jl40.l(this.c, u0s0Var.c) && jl40.l(this.d, u0s0Var.d) && jl40.l(this.e, u0s0Var.e) && jl40.l(this.f, u0s0Var.f) && this.g.equals(u0s0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        b151 b151Var = this.e;
        int hashCode2 = (hashCode + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        qj4 qj4Var = this.f;
        return this.g.hashCode() + ((hashCode2 + (qj4Var != null ? qj4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ShortcutModel(id=" + this.c + ", content=" + this.d + ", widgetAction=" + this.e + ", badge=" + this.f + ", onShownAnalyticsData=" + this.g + Extension.C_BRAKE;
    }
}
