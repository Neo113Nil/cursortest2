package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xjf0 extends t4z0 {
    public final dif0 a;
    public final CharSequence b;

    public xjf0(dif0 dif0Var, CharSequence charSequence) {
        this.a = dif0Var;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjf0)) {
            return false;
        }
        xjf0 xjf0Var = (xjf0) obj;
        return jl40.l(this.a, xjf0Var.a) && jl40.l(this.b, xjf0Var.b);
    }

    public final int hashCode() {
        dif0 dif0Var = this.a;
        int hashCode = (dif0Var == null ? 0 : dif0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressTileFooterState(progressBar=" + this.a + ", text=" + ((Object) this.b) + Extension.C_BRAKE;
    }

    public xjf0() {
        this(null, null);
    }
}
