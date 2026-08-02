package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w0s {
    public final boolean a;
    public final uqf0 b;
    public final qzr c;

    public w0s(boolean z, uqf0 uqf0Var, qzr qzrVar) {
        this.a = z;
        this.b = uqf0Var;
        this.c = qzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0s)) {
            return false;
        }
        w0s w0sVar = (w0s) obj;
        return this.a == w0sVar.a && jl40.l(this.b, w0sVar.b) && jl40.l(this.c, w0sVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        uqf0 uqf0Var = this.b;
        return this.c.hashCode() + ((hashCode + (uqf0Var == null ? 0 : uqf0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "FooterUiState(isShadowVisible=" + this.a + ", promoUiState=" + this.b + ", footerButtonsUiState=" + this.c + Extension.C_BRAKE;
    }
}
