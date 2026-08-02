package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vfs0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ufs0 e;

    public vfs0(String str, String str2, String str3, String str4, ufs0 ufs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ufs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfs0)) {
            return false;
        }
        vfs0 vfs0Var = (vfs0) obj;
        return jl40.l(this.a, vfs0Var.a) && jl40.l(this.b, vfs0Var.b) && jl40.l(this.c, vfs0Var.c) && jl40.l(this.d, vfs0Var.d) && jl40.l(this.e, vfs0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ufs0 ufs0Var = this.e;
        return hashCode4 + (ufs0Var != null ? ufs0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SimplifiedIdWidgetEntity(title=", this.a, ", description=", this.b, ", action=");
        g8e.D(v, this.c, ", buttonText=", this.d, ", theme=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
