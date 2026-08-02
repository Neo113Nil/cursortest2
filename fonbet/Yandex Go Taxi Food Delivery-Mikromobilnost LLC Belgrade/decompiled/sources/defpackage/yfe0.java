package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yfe0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public yfe0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfe0)) {
            return false;
        }
        yfe0 yfe0Var = (yfe0) obj;
        return jl40.l(this.a, yfe0Var.a) && jl40.l(this.b, yfe0Var.b) && jl40.l(this.c, yfe0Var.c) && this.d == yfe0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", shouldShowButton=", Extension.C_BRAKE, b64.v("PostcardUiState(imageUrl=", this.a, ", status=", this.b, ", message="), this.d);
    }
}
