package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u4w0 {
    public final String a;
    public final String b;
    public final y4w0 c;

    public u4w0(String str, String str2, y4w0 y4w0Var) {
        this.a = str;
        this.b = str2;
        this.c = y4w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4w0)) {
            return false;
        }
        u4w0 u4w0Var = (u4w0) obj;
        return jl40.l(this.a, u4w0Var.a) && this.b.equals(u4w0Var.b) && jl40.l(this.c, u4w0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        y4w0 y4w0Var = this.c;
        return b + (y4w0Var == null ? 0 : y4w0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(imageUrl=", this.a, ", contentDescription=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
