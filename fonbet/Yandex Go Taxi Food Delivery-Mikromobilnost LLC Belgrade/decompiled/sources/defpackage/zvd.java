package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zvd {
    public final mex0 a;
    public final mex0 b;
    public final String c;

    public zvd(mex0 mex0Var, mex0 mex0Var2) {
        this.a = mex0Var;
        this.b = mex0Var2;
        this.c = mex0Var2.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd)) {
            return false;
        }
        zvd zvdVar = (zvd) obj;
        return jl40.l(this.a, zvdVar.a) && this.b.equals(zvdVar.b);
    }

    public final int hashCode() {
        mex0 mex0Var = this.a;
        return this.b.hashCode() + ((mex0Var == null ? 0 : mex0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "CompoundTariffCellUiState(alternativeTariffCellUiState=" + this.a + ", originalTariffCellUiState=" + this.b + Extension.C_BRAKE;
    }
}
