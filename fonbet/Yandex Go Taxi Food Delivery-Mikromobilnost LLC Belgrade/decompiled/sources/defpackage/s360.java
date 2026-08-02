package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s360 extends n351 {
    public final k460 c;
    public final d360 d;
    public final boolean e;

    public s360(k460 k460Var, d360 d360Var, boolean z) {
        super("neuro-postcard", false, 14);
        this.c = k460Var;
        this.d = d360Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s360)) {
            return false;
        }
        s360 s360Var = (s360) obj;
        return jl40.l(this.c, s360Var.c) && jl40.l(this.d, s360Var.d) && this.e == s360Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroPostcardModel(stage=");
        sb.append(this.c);
        sb.append(", commonParams=");
        sb.append(this.d);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
