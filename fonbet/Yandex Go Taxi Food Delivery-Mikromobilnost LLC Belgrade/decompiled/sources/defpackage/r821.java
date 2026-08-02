package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r821 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public r821(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r821)) {
            return false;
        }
        r821 r821Var = (r821) obj;
        return jl40.l(this.a, r821Var.a) && jl40.l(this.b, r821Var.b) && jl40.l(this.c, r821Var.c) && this.d == r821Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", isLoading=", Extension.C_BRAKE, b64.v("UpdateSourcePointConfirmationUiState(title=", this.a, ", subtitle=", this.b, ", button="), this.d);
    }
}
