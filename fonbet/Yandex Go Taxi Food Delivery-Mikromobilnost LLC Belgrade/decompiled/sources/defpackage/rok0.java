package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rok0 {
    public final ibk0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final wrs0 g;

    public rok0(ibk0 ibk0Var, CharSequence charSequence, CharSequence charSequence2, String str, boolean z, boolean z2, wrs0 wrs0Var) {
        this.a = ibk0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = wrs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rok0)) {
            return false;
        }
        rok0 rok0Var = (rok0) obj;
        return jl40.l(this.a, rok0Var.a) && jl40.l(this.b, rok0Var.b) && jl40.l(this.c, rok0Var.c) && jl40.l(this.d, rok0Var.d) && this.e == rok0Var.e && this.f == rok0Var.f && this.g.equals(rok0Var.g);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        return this.g.hashCode() + unr0.e(unr0.e((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideCardTimelineOptionUiState(action=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", iconUrl=");
        sb.append(this.d);
        sb.append(", isSelected=");
        nnm.v(", isEnabled=", ", analytics=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
