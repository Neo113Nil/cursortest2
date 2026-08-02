package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class q7f extends s7f {
    public final boolean a;
    public final boolean b;
    public final Boolean c;
    public final Boolean d;

    public q7f(boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = z2;
        this.c = bool;
        this.d = bool2;
    }

    @Override // defpackage.s7f
    public final boolean a(s7f s7fVar) {
        return s7fVar instanceof q7f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7f)) {
            return false;
        }
        q7f q7fVar = (q7f) obj;
        return this.a == q7fVar.a && this.b == q7fVar.b && jl40.l(this.c, q7fVar.c) && jl40.l(this.d, q7fVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Footer(isAnonymous=", ", isMultiselect=", ", isStarred=", this.a, this.b);
        u.append(this.c);
        u.append(", isSilent=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public q7f() {
        this(false, false, null, null);
    }
}
