package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qe6 {
    public final CharSequence a;
    public final String b;
    public final pe6 c;
    public final oe6 d;
    public final int e;
    public final ke6 f;

    public qe6(String str, String str2, pe6 pe6Var, oe6 oe6Var, ke6 ke6Var) {
        int i = dzg0.bg_transparent_ripple;
        this.a = str;
        this.b = str2;
        this.c = pe6Var;
        this.d = oe6Var;
        this.e = i;
        this.f = ke6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe6)) {
            return false;
        }
        qe6 qe6Var = (qe6) obj;
        return jl40.l(this.a, qe6Var.a) && jl40.l(this.b, qe6Var.b) && jl40.l(this.c, qe6Var.c) && jl40.l(this.d, qe6Var.d) && this.e == qe6Var.e && jl40.l(this.f, qe6Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 961;
        String str = this.b;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false);
        pe6 pe6Var = this.c;
        int hashCode2 = (e + (pe6Var == null ? 0 : pe6Var.a.hashCode())) * 31;
        oe6 oe6Var = this.d;
        int b = oyr.b(this.e, (hashCode2 + (oe6Var == null ? 0 : Integer.hashCode(oe6Var.a))) * 961, 31);
        ke6 ke6Var = this.f;
        return b + (ke6Var != null ? ke6Var.hashCode() : 0);
    }

    public final String toString() {
        return "BottomSectionUiState(title=" + ((Object) this.a) + ", titleColor=null, subtitle=" + ((Object) this.b) + ", animateSubtitleProgress=false, lead=" + this.c + ", trail=" + this.d + ", trailCompanionText=null, backgroundId=" + this.e + ", action=" + this.f + Extension.C_BRAKE;
    }
}
