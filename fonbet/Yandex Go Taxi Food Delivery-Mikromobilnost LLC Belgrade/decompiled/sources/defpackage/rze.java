package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rze {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public rze(CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, String str, String str2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
        this.d = charSequence3;
        this.e = charSequence4;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rze)) {
            return false;
        }
        rze rzeVar = (rze) obj;
        return jl40.l(this.a, rzeVar.a) && jl40.l(this.b, rzeVar.b) && jl40.l(this.c, rzeVar.c) && jl40.l(this.d, rzeVar.d) && jl40.l(this.e, rzeVar.e) && jl40.l(this.f, rzeVar.f) && jl40.l(this.g, rzeVar.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int c = unr0.c((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.c);
        CharSequence charSequence3 = this.d;
        int hashCode2 = (c + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.e;
        int hashCode3 = (hashCode2 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOffersContent(title=");
        sb.append((Object) this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", alternativeActionText=");
        sb.append((Object) this.d);
        sb.append(", supportText=");
        sb.append((Object) this.e);
        sb.append(", errorCode=");
        sb.append(this.f);
        sb.append(", errorCodeContentDescription=");
        return b64.p(sb, this.g, ')');
    }
}
