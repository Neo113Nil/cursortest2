package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sqo0 implements uqo0 {
    public final String a;
    public final r7p0 b;
    public final CharSequence c;

    public sqo0(String str, r7p0 r7p0Var, CharSequence charSequence) {
        this.a = str;
        this.b = r7p0Var;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqo0)) {
            return false;
        }
        sqo0 sqo0Var = (sqo0) obj;
        return jl40.l(this.a, sqo0Var.a) && this.b.equals(sqo0Var.b) && jl40.l(this.c, sqo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestScooter(iconUrl=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
