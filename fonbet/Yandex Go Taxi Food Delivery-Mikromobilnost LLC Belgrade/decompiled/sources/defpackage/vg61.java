package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class vg61 {
    public static final xw81 Companion = new xw81();
    public final String a;
    public final String b;
    public final String c;

    public vg61(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg61)) {
            return false;
        }
        vg61 vg61Var = (vg61) obj;
        return jl40.l(this.a, vg61Var.a) && jl40.l(this.b, vg61Var.b) && jl40.l(this.c, vg61Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("DebugPanelAlert(title=", this.a, ", message=", this.b, ", type="), this.c, Extension.C_BRAKE);
    }
}
