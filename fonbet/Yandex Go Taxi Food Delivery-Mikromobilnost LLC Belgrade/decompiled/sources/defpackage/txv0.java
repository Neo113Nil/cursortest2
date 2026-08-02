package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class txv0 extends uxv0 {
    public final CharSequence a;
    public final yuv0 b;

    public txv0(CharSequence charSequence) {
        yuv0 yuv0Var = new yuv0(0);
        this.a = charSequence;
        this.b = yuv0Var;
    }

    @Override // defpackage.uxv0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txv0)) {
            return false;
        }
        txv0 txv0Var = (txv0) obj;
        return jl40.l(this.a, txv0Var.a) && jl40.l(this.b, txv0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GlobalLoading(input=" + ((Object) this.a) + ", state=" + this.b + Extension.C_BRAKE;
    }
}
