package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xkw0 {
    public static final xkw0 d = new xkw0(null, s9k0.a, false);
    public final CharSequence a;
    public final ibk0 b;
    public final boolean c;

    public xkw0(String str, ibk0 ibk0Var, boolean z) {
        this.a = str;
        this.b = ibk0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkw0)) {
            return false;
        }
        xkw0 xkw0Var = (xkw0) obj;
        return jl40.l(this.a, xkw0Var.a) && jl40.l(this.b, xkw0Var.b) && this.c == xkw0Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupportUiState(title=");
        sb.append((Object) this.a);
        sb.append(", onClickAction=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
