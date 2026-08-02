package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w8n0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final CharSequence e;

    public w8n0(String str, int i, boolean z, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8n0)) {
            return false;
        }
        w8n0 w8n0Var = (w8n0) obj;
        return this.a == w8n0Var.a && this.b == w8n0Var.b && this.c == w8n0Var.c && this.d == w8n0Var.d && jl40.l(this.e, w8n0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        CharSequence charSequence = this.e;
        return e + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "TextItem(iconId=", ", titleStringId=", ", subtitleStringId=");
        tse0.z(s, this.c, ", bottomDivider=", this.d, ", trailText=");
        return xvz.n(s, this.e, Extension.C_BRAKE);
    }
}
