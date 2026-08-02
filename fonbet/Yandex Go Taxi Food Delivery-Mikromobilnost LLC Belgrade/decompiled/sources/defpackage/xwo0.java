package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xwo0 implements two0 {
    public final gxo0 a;
    public final a0p0 b;

    public xwo0(gxo0 gxo0Var, a0p0 a0p0Var) {
        this.a = gxo0Var;
        this.b = a0p0Var;
    }

    @Override // defpackage.two0
    public final a0p0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwo0)) {
            return false;
        }
        xwo0 xwo0Var = (xwo0) obj;
        return jl40.l(this.a, xwo0Var.a) && jl40.l(this.b, xwo0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a0p0 a0p0Var = this.b;
        return hashCode + (a0p0Var == null ? 0 : a0p0Var.hashCode());
    }

    public final String toString() {
        return "ScootersSubscriptionFullState(promoblock=" + this.a + ", upsaleWindow=" + this.b + Extension.C_BRAKE;
    }
}
