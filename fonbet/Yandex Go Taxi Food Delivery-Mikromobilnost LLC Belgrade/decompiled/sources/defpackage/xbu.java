package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xbu {
    public final v4v a;
    public final CharSequence b;
    public final ldc c;
    public final vge d;

    public xbu(v4v v4vVar, CharSequence charSequence, ldc ldcVar, vge vgeVar) {
        this.a = v4vVar;
        this.b = charSequence;
        this.c = ldcVar;
        this.d = vgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbu)) {
            return false;
        }
        xbu xbuVar = (xbu) obj;
        return jl40.l(this.a, xbuVar.a) && jl40.l(this.b, xbuVar.b) && jl40.l(this.c, xbuVar.c) && this.d.equals(xbuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ldc ldcVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0)) * 31);
    }

    public final String toString() {
        return "HeaderState(icon=" + this.a + ", iconText=" + ((Object) this.b) + ", backgroundColor=" + this.c + ", contentItem=" + this.d + Extension.C_BRAKE;
    }
}
