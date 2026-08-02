package defpackage;

/* loaded from: classes2.dex */
public final class qmd {
    public final String a;
    public final mmd b;
    public final nmd c;
    public final lmd d;
    public final pmd e;
    public final omd f;

    public qmd(String str, mmd mmdVar, nmd nmdVar, lmd lmdVar, pmd pmdVar, omd omdVar) {
        this.a = str;
        this.b = mmdVar;
        this.c = nmdVar;
        this.d = lmdVar;
        this.e = pmdVar;
        this.f = omdVar;
    }

    public final lmd a() {
        return this.d;
    }

    public final omd b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmd)) {
            return false;
        }
        qmd qmdVar = (qmd) obj;
        return jl40.l(this.a, qmdVar.a) && jl40.l(this.b, qmdVar.b) && jl40.l(this.c, qmdVar.c) && jl40.l(this.d, qmdVar.d) && jl40.l(this.e, qmdVar.e) && jl40.l(this.f, qmdVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mmd mmdVar = this.b;
        int hashCode2 = (hashCode + (mmdVar == null ? 0 : mmdVar.hashCode())) * 31;
        nmd nmdVar = this.c;
        int hashCode3 = (hashCode2 + (nmdVar == null ? 0 : nmdVar.hashCode())) * 31;
        lmd lmdVar = this.d;
        int hashCode4 = (hashCode3 + (lmdVar == null ? 0 : lmdVar.hashCode())) * 31;
        pmd pmdVar = this.e;
        int hashCode5 = (hashCode4 + (pmdVar == null ? 0 : pmdVar.hashCode())) * 31;
        omd omdVar = this.f;
        return hashCode5 + (omdVar != null ? omdVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentButton(__typename=" + this.a + ", onNewCardPaymentButton=" + this.b + ", onNewSbpPaymentButton=" + this.c + ", onCardPaymentButton=" + this.d + ", onSbpPaymentButton=" + this.e + ", onNewYBPaymentButton=" + this.f + ')';
    }
}
