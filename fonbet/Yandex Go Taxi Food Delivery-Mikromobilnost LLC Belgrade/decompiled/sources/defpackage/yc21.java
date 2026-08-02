package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class yc21 {
    public static final xc21 Companion = new xc21();
    public final String a;
    public final String b;

    public /* synthetic */ yc21(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wc21.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc21)) {
            return false;
        }
        yc21 yc21Var = (yc21) obj;
        return jl40.l(this.a, yc21Var.a) && jl40.l(this.b, yc21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FailureReason(code=", this.a, ", message=", this.b, Extension.C_BRAKE);
    }
}
