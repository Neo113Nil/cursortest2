package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u611 {
    public final p611 a;
    public final t611 b;
    public final a711 c;
    public final o611 d;
    public final Integer e;
    public final Integer f;

    public u611(p611 p611Var, t611 t611Var, a711 a711Var, o611 o611Var, Integer num, Integer num2) {
        this.a = p611Var;
        this.b = t611Var;
        this.c = a711Var;
        this.d = o611Var;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u611)) {
            return false;
        }
        u611 u611Var = (u611) obj;
        return jl40.l(this.a, u611Var.a) && jl40.l(this.b, u611Var.b) && jl40.l(this.c, u611Var.c) && jl40.l(this.d, u611Var.d) && jl40.l(this.e, u611Var.e) && this.f.equals(u611Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t611 t611Var = this.b;
        int hashCode2 = (hashCode + (t611Var == null ? 0 : t611Var.hashCode())) * 31;
        a711 a711Var = this.c;
        int hashCode3 = (hashCode2 + (a711Var == null ? 0 : a711Var.hashCode())) * 31;
        o611 o611Var = this.d;
        int hashCode4 = (hashCode3 + (o611Var == null ? 0 : o611Var.hashCode())) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TaxiFeedback(ratingSelector=" + this.a + ", supportButton=" + this.b + ", tipsChoices=" + this.c + ", doneButton=" + this.d + ", selectedRating=" + this.e + ", selectedTipIndex=" + this.f + Extension.C_BRAKE;
    }
}
