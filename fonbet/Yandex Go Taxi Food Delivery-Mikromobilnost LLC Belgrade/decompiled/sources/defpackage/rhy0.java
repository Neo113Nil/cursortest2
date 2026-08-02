package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rhy0 implements uhy0 {
    public final mhy0 a;

    public rhy0(mhy0 mhy0Var) {
        this.a = mhy0Var;
    }

    public final mhy0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhy0) && jl40.l(this.a, ((rhy0) obj).a);
    }

    public final int hashCode() {
        mhy0 mhy0Var = this.a;
        if (mhy0Var == null) {
            return 0;
        }
        return mhy0Var.hashCode();
    }

    public final String toString() {
        return "Content(paymentState=" + this.a + Extension.C_BRAKE;
    }

    public rhy0() {
        this(null);
    }
}
