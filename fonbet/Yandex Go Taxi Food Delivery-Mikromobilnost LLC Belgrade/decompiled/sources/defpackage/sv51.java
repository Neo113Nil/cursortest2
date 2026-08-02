package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class sv51 {
    public static final sv51 e = new sv51("", null, null, false);
    public final String a;
    public final String b;
    public final df51 c;
    public final boolean d;

    public sv51(String str, String str2, df51 df51Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = df51Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv51)) {
            return false;
        }
        sv51 sv51Var = (sv51) obj;
        return jl40.l(this.a, sv51Var.a) && jl40.l(this.b, sv51Var.b) && jl40.l(this.c, sv51Var.c) && this.d == sv51Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        df51 df51Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (df51Var != null ? df51Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbSdkMenuItemInfo(title=", this.a, ", subtitle=", this.b, ", balanceBadgePayload=");
        v.append(this.c);
        v.append(", isVisible=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
