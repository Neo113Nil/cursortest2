package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xpw implements m1j {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;
    public final k911 e;
    public final k911 f;
    public final String g;

    public xpw(CharSequence charSequence, String str, String str2, String str3, k911 k911Var, k911 k911Var2, String str4) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = k911Var;
        this.f = k911Var2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpw)) {
            return false;
        }
        xpw xpwVar = (xpw) obj;
        return jl40.l(this.a, xpwVar.a) && jl40.l(this.b, xpwVar.b) && jl40.l(this.c, xpwVar.c) && this.d.equals(xpwVar.d) && this.e.equals(xpwVar.e) && this.f.equals(xpwVar.f) && jl40.l(this.g, xpwVar.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.g.hashCode() + smw0.e(this.f, smw0.e(this.e, unr0.b(unr0.b(unr0.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntermediateStopItem(index=");
        sb.append((Object) this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", time=");
        g8e.D(sb, this.c, ", contentDescription=", this.d, ", prevTransportType=");
        sb.append(this.e);
        sb.append(", transportType=");
        sb.append(this.f);
        sb.append(", id=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
