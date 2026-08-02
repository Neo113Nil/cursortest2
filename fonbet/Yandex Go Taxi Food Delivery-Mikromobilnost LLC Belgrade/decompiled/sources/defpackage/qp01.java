package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qp01 implements sp01 {
    public final CharSequence a;
    public final xh01 b;
    public final axq0 c;
    public final fh10 d;
    public final ikl0 e;
    public final o4m f;

    public qp01(CharSequence charSequence, xh01 xh01Var, axq0 axq0Var, fh10 fh10Var, ikl0 ikl0Var, o4m o4mVar) {
        this.a = charSequence;
        this.b = xh01Var;
        this.c = axq0Var;
        this.d = fh10Var;
        this.e = ikl0Var;
        this.f = o4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp01)) {
            return false;
        }
        qp01 qp01Var = (qp01) obj;
        return jl40.l(this.a, qp01Var.a) && jl40.l(this.b, qp01Var.b) && jl40.l(this.c, qp01Var.c) && jl40.l(this.d, qp01Var.d) && jl40.l(this.e, qp01Var.e) && jl40.l(this.f, qp01Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        xh01 xh01Var = this.b;
        int hashCode2 = (hashCode + (xh01Var == null ? 0 : xh01Var.a.hashCode())) * 31;
        axq0 axq0Var = this.c;
        int hashCode3 = (hashCode2 + (axq0Var == null ? 0 : axq0Var.hashCode())) * 31;
        fh10 fh10Var = this.d;
        int hashCode4 = (hashCode3 + (fh10Var == null ? 0 : fh10Var.hashCode())) * 31;
        ikl0 ikl0Var = this.e;
        int hashCode5 = (hashCode4 + (ikl0Var == null ? 0 : ikl0Var.hashCode())) * 31;
        o4m o4mVar = this.f;
        return hashCode5 + (o4mVar != null ? o4mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(title=" + ((Object) this.a) + ", dateSelector=" + this.b + ", serviceSection=" + this.c + ", meetingSection=" + this.d + ", rulesSection=" + this.e + ", doneButtonState=" + this.f + Extension.C_BRAKE;
    }
}
