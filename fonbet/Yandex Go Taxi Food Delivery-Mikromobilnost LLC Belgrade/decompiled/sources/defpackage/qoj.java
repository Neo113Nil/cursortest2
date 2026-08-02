package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qoj extends n351 {
    public final v4v c;
    public final ldc d;
    public final CharSequence e;
    public final v4v f;
    public final x9x0 g;
    public final x2s h;
    public final String i;

    public qoj(v4v v4vVar, ldc ldcVar, CharSequence charSequence, lvi0 lvi0Var, x9x0 x9x0Var, x2s x2sVar, String str) {
        super("discount", false, 14);
        this.c = v4vVar;
        this.d = ldcVar;
        this.e = charSequence;
        this.f = lvi0Var;
        this.g = x9x0Var;
        this.h = x2sVar;
        this.i = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoj)) {
            return false;
        }
        qoj qojVar = (qoj) obj;
        return jl40.l(this.c, qojVar.c) && jl40.l(this.d, qojVar.d) && jl40.l(this.e, qojVar.e) && jl40.l(this.f, qojVar.f) && this.g.equals(qojVar.g) && this.h.equals(qojVar.h) && jl40.l(this.i, qojVar.i);
    }

    public final int hashCode() {
        v4v v4vVar = this.c;
        int hashCode = (v4vVar == null ? 0 : v4vVar.hashCode()) * 31;
        ldc ldcVar = this.d;
        int b = smw0.b((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31, 31, this.e);
        v4v v4vVar2 = this.f;
        int a = tse0.a(this.h, (this.g.hashCode() + ((b + (v4vVar2 == null ? 0 : v4vVar2.hashCode())) * 31)) * 31, 31);
        String str = this.i;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscountModel(leadImage=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append((Object) this.e);
        sb.append(", trailImage=");
        sb.append(this.f);
        sb.append(", widgetAction=");
        sb.append(this.g);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.h);
        sb.append(", id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
