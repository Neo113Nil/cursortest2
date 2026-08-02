package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xfu0 implements ygu0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final eiy d;
    public final eiy e;

    public xfu0(String str, CharSequence charSequence, CharSequence charSequence2, eiy eiyVar, eiy eiyVar2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = eiyVar;
        this.e = eiyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfu0)) {
            return false;
        }
        xfu0 xfu0Var = (xfu0) obj;
        return jl40.l(this.a, xfu0Var.a) && jl40.l(this.b, xfu0Var.b) && jl40.l(this.c, xfu0Var.c) && jl40.l(this.d, xfu0Var.d) && jl40.l(this.e, xfu0Var.e);
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
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "StopGroupSectionItem(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", prevLineType=");
        t.append(this.d);
        t.append(", lineType=");
        t.append(this.e);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
