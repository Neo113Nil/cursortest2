package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xda implements w201 {
    public final String a;
    public final i501 b;
    public final String c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final taa g;

    public xda(String str, i501 i501Var, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, taa taaVar) {
        this.a = str;
        this.b = i501Var;
        this.c = str2;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = taaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xda)) {
            return false;
        }
        xda xdaVar = (xda) obj;
        return jl40.l(this.a, xdaVar.a) && jl40.l(this.b, xdaVar.b) && jl40.l(this.c, xdaVar.c) && jl40.l(this.d, xdaVar.d) && jl40.l(this.e, xdaVar.e) && jl40.l(this.f, xdaVar.f) && jl40.l(this.g, xdaVar.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + smw0.b(smw0.b(smw0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersOrderTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", iconTag=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", subtitle=");
        vfc.A(sb, this.e, ", powerBankShortNumber=", this.f, ", chargersOrder=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
