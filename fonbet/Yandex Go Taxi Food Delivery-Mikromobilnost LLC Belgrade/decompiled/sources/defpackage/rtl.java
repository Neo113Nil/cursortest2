package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rtl extends gc5 {
    public final rr51 c;
    public final String d;
    public final String e;

    public rtl(rr51 rr51Var, String str, String str2) {
        super(str, str2);
        this.c = rr51Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtl)) {
            return false;
        }
        rtl rtlVar = (rtl) obj;
        return this.c.equals(rtlVar.c) && jl40.l(this.d, rtlVar.d) && jl40.l(this.e, rtlVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivkitDashboardItem(divData=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", layoutId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
