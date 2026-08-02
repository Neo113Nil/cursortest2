package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t7e0 implements d8e0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public t7e0(CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7e0)) {
            return false;
        }
        t7e0 t7e0Var = (t7e0) obj;
        return jl40.l(this.a, t7e0Var.a) && jl40.l(this.b, t7e0Var.b) && jl40.l(this.c, t7e0Var.c) && jl40.l(this.d, t7e0Var.d) && this.e == t7e0Var.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + smw0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("BulletItem(id=", this.a, ", imageUrl=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", hasDivider=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
