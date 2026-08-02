package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rzw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rzw0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzw0)) {
            return false;
        }
        rzw0 rzw0Var = (rzw0) obj;
        return jl40.l(this.a, rzw0Var.a) && this.b.equals(rzw0Var.b) && this.c.equals(rzw0Var.c) && this.d.equals(rzw0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("SwitchNetworkEnvironmentUiState(iconTag=", this.a, ", title=", this.b, ", text="), this.c, ", buttonText=", this.d, Extension.C_BRAKE);
    }
}
