package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class vi8 {
    public static final ui8 Companion = new ui8();
    public final String a;
    public final boolean b;

    public /* synthetic */ vi8(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ti8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi8)) {
            return false;
        }
        vi8 vi8Var = (vi8) obj;
        return jl40.l(this.a, vi8Var.a) && this.b == vi8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("CardMetaResult(paymentSystem=", this.a, ", withoutCvn=", this.b, Extension.C_BRAKE);
    }
}
