package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ryw0 implements u22 {
    public final String a;
    public final q0d0 b;

    public ryw0(String str, q0d0 q0d0Var) {
        this.a = str;
        this.b = q0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryw0)) {
            return false;
        }
        ryw0 ryw0Var = (ryw0) obj;
        return jl40.l(this.a, ryw0Var.a) && jl40.l(this.b, ryw0Var.b);
    }

    @Override // defpackage.h22
    public final q0d0 getAction() {
        return this.b;
    }

    @Override // defpackage.h22
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0d0 q0d0Var = this.b;
        return hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode());
    }

    public final String toString() {
        return "SwitchAnalyticWidget(id=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
