package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class yb41 {
    public static final xb41 Companion = new xb41();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public /* synthetic */ yb41(String str, int i, String str2, String str3, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wb41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb41)) {
            return false;
        }
        yb41 yb41Var = (yb41) obj;
        return jl40.l(this.a, yb41Var.a) && jl40.l(this.b, yb41Var.b) && jl40.l(this.c, yb41Var.c) && this.d == yb41Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", isMaxScreenBrightness=", Extension.C_BRAKE, b64.v("OverlayConfig(type=", this.a, ", id=", this.b, ", backgroundColor="), this.d);
    }
}
