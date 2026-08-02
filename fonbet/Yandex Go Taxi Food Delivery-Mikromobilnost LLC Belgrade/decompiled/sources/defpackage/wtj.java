package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wtj {
    public final CharSequence a;
    public final CharSequence b;
    public final v4v c;
    public final v4v d;

    public wtj(CharSequence charSequence, CharSequence charSequence2, lvi0 lvi0Var, lvi0 lvi0Var2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = lvi0Var;
        this.d = lvi0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtj)) {
            return false;
        }
        wtj wtjVar = (wtj) obj;
        return jl40.l(this.a, wtjVar.a) && jl40.l(this.b, wtjVar.b) && jl40.l(this.c, wtjVar.c) && jl40.l(this.d, wtjVar.d);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        v4v v4vVar = this.c;
        int hashCode = (b + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        v4v v4vVar2 = this.d;
        return hashCode + (v4vVar2 != null ? v4vVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "DiscoveryMapState(title=", ", searchFieldTitle=", ", headerIcon=");
        r.append(this.c);
        r.append(", searchFieldIcon=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
