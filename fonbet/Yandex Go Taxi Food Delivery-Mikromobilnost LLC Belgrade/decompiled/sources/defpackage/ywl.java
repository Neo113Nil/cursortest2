package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ywl {
    public final see a;
    public final mjm0 b;
    public final cnr0 c;
    public final uwl d;
    public final q370 e;
    public final wwl f;

    public ywl(see seeVar, mjm0 mjm0Var, cnr0 cnr0Var, uwl uwlVar, q370 q370Var, wwl wwlVar) {
        this.a = seeVar;
        this.b = mjm0Var;
        this.c = cnr0Var;
        this.d = uwlVar;
        this.e = q370Var;
        this.f = wwlVar;
    }

    public static ywl a(ywl ywlVar, see seeVar, mjm0 mjm0Var, cnr0 cnr0Var, uwl uwlVar, int i) {
        if ((i & 1) != 0) {
            seeVar = ywlVar.a;
        }
        see seeVar2 = seeVar;
        if ((i & 2) != 0) {
            mjm0Var = ywlVar.b;
        }
        mjm0 mjm0Var2 = mjm0Var;
        if ((i & 4) != 0) {
            cnr0Var = ywlVar.c;
        }
        cnr0 cnr0Var2 = cnr0Var;
        if ((i & 8) != 0) {
            uwlVar = ywlVar.d;
        }
        uwl uwlVar2 = uwlVar;
        q370 q370Var = (i & 16) != 0 ? ywlVar.e : null;
        wwl wwlVar = ywlVar.f;
        ywlVar.getClass();
        return new ywl(seeVar2, mjm0Var2, cnr0Var2, uwlVar2, q370Var, wwlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ywl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ywl ywlVar = (ywl) obj;
        return jl40.l(this.a, ywlVar.a) && jl40.l(this.b, ywlVar.b) && jl40.l(this.c, ywlVar.c) && jl40.l(this.d, ywlVar.d) && jl40.l(this.e, ywlVar.e) && jl40.l(this.f, ywlVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mjm0 mjm0Var = this.b;
        int d = unr0.d((hashCode + (mjm0Var != null ? mjm0Var.hashCode() : 0)) * 31, 31, this.c.a);
        uwl uwlVar = this.d;
        int hashCode2 = (d + (uwlVar != null ? uwlVar.hashCode() : 0)) * 31;
        q370 q370Var = this.e;
        int hashCode3 = (hashCode2 + (q370Var != null ? q370Var.a.hashCode() : 0)) * 31;
        wwl wwlVar = this.f;
        return hashCode3 + (wwlVar != null ? wwlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Document(content=" + this.a + ", scaffold=" + this.b + ", shared=" + this.c + ", actions=" + this.d + ", context=" + this.e + ", transitionSettings=" + this.f + Extension.C_BRAKE;
    }
}
