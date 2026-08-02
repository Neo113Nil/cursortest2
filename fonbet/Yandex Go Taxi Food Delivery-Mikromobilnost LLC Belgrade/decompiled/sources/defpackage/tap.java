package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tap {
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;
    public final String e;
    public final String f;
    public final kdc g;
    public final kdc h;
    public final String i;

    public tap(boolean z, CharSequence charSequence, CharSequence charSequence2, boolean z2, String str, String str2, kdc kdcVar, kdc kdcVar2, String str3) {
        this.a = z;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = kdcVar;
        this.h = kdcVar2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tap)) {
            return false;
        }
        tap tapVar = (tap) obj;
        return this.a == tapVar.a && jl40.l(this.b, tapVar.b) && jl40.l(this.c, tapVar.c) && this.d == tapVar.d && this.e.equals(tapVar.e) && jl40.l(this.f, tapVar.f) && jl40.l(this.g, tapVar.g) && jl40.l(this.h, tapVar.h) && jl40.l(this.i, tapVar.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e(smw0.b(smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        kdc kdcVar = this.g;
        int hashCode = (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.h;
        return this.i.hashCode() + ((hashCode + (kdcVar2 != null ? kdcVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyGroupMenuItemState(isVisible=");
        sb.append(this.a);
        sb.append(", itemTitle=");
        sb.append((Object) this.b);
        sb.append(", itemDescription=");
        sb.append((Object) this.c);
        sb.append(", hasActionButton=");
        sb.append(this.d);
        sb.append(", buttonTitle=");
        g8e.D(sb, this.e, ", buttonDeeplink=", this.f, ", buttonTextColor=");
        sb.append(this.g);
        sb.append(", buttonColor=");
        sb.append(this.h);
        sb.append(", webViewUrl=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
