package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t611 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final obm d;
    public final String e;

    public t611(String str, String str2, CharSequence charSequence, obm obmVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = obmVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t611)) {
            return false;
        }
        t611 t611Var = (t611) obj;
        return jl40.l(this.a, t611Var.a) && jl40.l(this.b, t611Var.b) && jl40.l(this.c, t611Var.c) && jl40.l(this.d, t611Var.d) && jl40.l(this.e, t611Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = smw0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        obm obmVar = this.d;
        int hashCode2 = (b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SupportButtonUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append((Object) this.c);
        v.append(", iconDrawableState=");
        v.append(this.d);
        v.append(", supportChatUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
