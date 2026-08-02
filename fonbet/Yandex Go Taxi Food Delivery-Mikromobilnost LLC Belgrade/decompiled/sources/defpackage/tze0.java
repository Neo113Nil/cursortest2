package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tze0 {
    public final a1f0 a;
    public final kze0 b;
    public final int c;

    public tze0(a1f0 a1f0Var, kze0 kze0Var, int i) {
        this.a = a1f0Var;
        this.b = kze0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tze0)) {
            return false;
        }
        tze0 tze0Var = (tze0) obj;
        return jl40.l(this.a, tze0Var.a) && jl40.l(this.b, tze0Var.b) && this.c == tze0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kze0 kze0Var = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (kze0Var == null ? 0 : kze0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceInfoUiState(priceUiState=");
        sb.append(this.a);
        sb.append(", priceDetailsUiState=");
        sb.append(this.b);
        sb.append(", bottomPadding=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
