package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class ymv0 {
    public static final xmv0 Companion = new xmv0();
    public final String a;
    public final String b;

    public /* synthetic */ ymv0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wmv0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymv0)) {
            return false;
        }
        ymv0 ymv0Var = (ymv0) obj;
        return jl40.l(this.a, ymv0Var.a) && jl40.l(this.b, ymv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AlternativeOffer(offerId=", this.a, ", type=", this.b, Extension.C_BRAKE);
    }

    public ymv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
