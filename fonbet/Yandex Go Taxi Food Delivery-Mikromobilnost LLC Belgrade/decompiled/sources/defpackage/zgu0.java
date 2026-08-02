package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zgu0 implements ygu0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final eiy d;
    public final frn e;
    public final boolean f;

    public zgu0(String str, CharSequence charSequence, CharSequence charSequence2, eiy eiyVar, frn frnVar, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = eiyVar;
        this.e = frnVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgu0)) {
            return false;
        }
        zgu0 zgu0Var = (zgu0) obj;
        return jl40.l(this.a, zgu0Var.a) && jl40.l(this.b, zgu0Var.b) && jl40.l(this.c, zgu0Var.c) && jl40.l(this.d, zgu0Var.d) && jl40.l(this.e, zgu0Var.e) && this.f == zgu0Var.f;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        frn frnVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode3 + (frnVar != null ? frnVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "StopSectionBeginItem(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", lineType=");
        t.append(this.d);
        t.append(", ellipse=");
        t.append(this.e);
        t.append(", isSelectable=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
