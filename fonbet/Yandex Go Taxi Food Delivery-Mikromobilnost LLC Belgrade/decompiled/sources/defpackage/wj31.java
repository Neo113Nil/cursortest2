package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wj31 implements xj31 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public wj31(String str, String str2, boolean z, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj31)) {
            return false;
        }
        wj31 wj31Var = (wj31) obj;
        return jl40.l(this.a, wj31Var.a) && jl40.l(this.b, wj31Var.b) && this.c == wj31Var.c && jl40.l(this.d, wj31Var.d) && jl40.l(this.e, wj31Var.e);
    }

    @Override // defpackage.xj31
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // defpackage.xj31
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        StringBuilder v = b64.v("SmallVerticalUiState(id=", this.a, ", text=", this.b, ", isSelected=");
        unr0.A(", contentDescription=", this.d, ", stateDescription=", v, this.c);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
