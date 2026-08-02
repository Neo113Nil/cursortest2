package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wnk0 {
    public final CharSequence a;
    public final ibk0 b;

    public wnk0(CharSequence charSequence, ibk0 ibk0Var) {
        this.a = charSequence;
        this.b = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnk0)) {
            return false;
        }
        wnk0 wnk0Var = (wnk0) obj;
        return jl40.l(this.a, wnk0Var.a) && jl40.l(this.b, wnk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ibk0 ibk0Var = this.b;
        return hashCode + (ibk0Var == null ? 0 : ibk0Var.hashCode());
    }

    public final String toString() {
        return "StatusText(text=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
