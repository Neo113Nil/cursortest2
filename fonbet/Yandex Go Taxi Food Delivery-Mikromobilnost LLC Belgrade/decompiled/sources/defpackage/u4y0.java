package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u4y0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public u4y0(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4y0)) {
            return false;
        }
        u4y0 u4y0Var = (u4y0) obj;
        return jl40.l(this.a, u4y0Var.a) && jl40.l(this.b, u4y0Var.b) && this.c == u4y0Var.c && this.d == u4y0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return smw0.k(", needShowDetails=", Extension.C_BRAKE, b64.v("TaxiOrderPresentationState(orderId=", this.a, ", tariffName=", this.b, ", isBufferCombo="), this.c, this.d);
    }
}
