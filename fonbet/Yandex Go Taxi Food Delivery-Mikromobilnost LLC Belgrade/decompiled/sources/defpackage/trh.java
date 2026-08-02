package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class trh {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public trh(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static trh a(trh trhVar, boolean z, boolean z2, int i) {
        String str = trhVar.a;
        String str2 = trhVar.b;
        if ((i & 8) != 0) {
            z2 = trhVar.d;
        }
        return new trh(z, z2, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trh)) {
            return false;
        }
        trh trhVar = (trh) obj;
        return jl40.l(this.a, trhVar.a) && jl40.l(this.b, trhVar.b) && this.c == trhVar.c && this.d == trhVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isLoading=", Extension.C_BRAKE, b64.v("ButtonUiState(text=", this.a, ", loadingText=", this.b, ", isEnabled="), this.c, this.d);
    }
}
