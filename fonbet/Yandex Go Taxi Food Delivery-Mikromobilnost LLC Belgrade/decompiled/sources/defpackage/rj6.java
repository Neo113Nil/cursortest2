package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rj6 extends dbb1 {
    public static final rj6 e = new rj6(null, 15);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public rj6(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj6)) {
            return false;
        }
        rj6 rj6Var = (rj6) obj;
        return jl40.l(this.a, rj6Var.a) && jl40.l(this.b, rj6Var.b) && this.c == rj6Var.c && this.d == rj6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", shouldSwapTexts=", Extension.C_BRAKE, b64.v("SourcePin(text=", this.a, ", hint=", this.b, ", hasChevron="), this.c, this.d);
    }

    public rj6() {
        this(null, 15);
    }

    public /* synthetic */ rj6(String str, int i) {
        this(false, false, (i & 1) != 0 ? "" : str, "");
    }
}
