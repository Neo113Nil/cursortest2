package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vj31 implements xj31 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final ua31 f;

    public vj31(String str, String str2, boolean z, String str3, String str4, ua31 ua31Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = ua31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj31)) {
            return false;
        }
        vj31 vj31Var = (vj31) obj;
        return jl40.l(this.a, vj31Var.a) && this.b.equals(vj31Var.b) && this.c == vj31Var.c && jl40.l(this.d, vj31Var.d) && jl40.l(this.e, vj31Var.e) && jl40.l(this.f, vj31Var.f);
    }

    @Override // defpackage.xj31
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        ua31 ua31Var = this.f;
        return b + (ua31Var == null ? 0 : ua31Var.hashCode());
    }

    @Override // defpackage.xj31
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        StringBuilder v = b64.v("BigVerticalUiState(id=", this.a, ", text=", this.b, ", isSelected=");
        unr0.A(", contentDescription=", this.d, ", stateDescription=", v, this.c);
        v.append(this.e);
        v.append(", badgeUiState=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
