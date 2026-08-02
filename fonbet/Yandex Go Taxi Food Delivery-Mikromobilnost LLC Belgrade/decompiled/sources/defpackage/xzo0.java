package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xzo0 {
    public final CharSequence a;
    public final String b;

    public xzo0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzo0)) {
            return false;
        }
        xzo0 xzo0Var = (xzo0) obj;
        return jl40.l(this.a, xzo0Var.a) && jl40.l(this.b, xzo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
