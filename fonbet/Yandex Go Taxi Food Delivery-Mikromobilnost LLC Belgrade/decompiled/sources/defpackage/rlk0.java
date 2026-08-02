package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rlk0 extends slk0 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public rlk0(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.slk0
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlk0)) {
            return false;
        }
        rlk0 rlk0Var = (rlk0) obj;
        return jl40.l(this.b, rlk0Var.b) && jl40.l(this.c, rlk0Var.c) && this.d == rlk0Var.d && jl40.l(this.e, rlk0Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int b = oyr.b(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.slk0
    public final int m() {
        return this.d;
    }

    @Override // defpackage.slk0
    public final String n() {
        return this.e;
    }

    public final String toString() {
        return xvz.h(this.d, ", photoDescription=", this.e, Extension.C_BRAKE, b64.v("Loading(id=", this.b, ", analyticsId=", this.c, ", height="));
    }
}
