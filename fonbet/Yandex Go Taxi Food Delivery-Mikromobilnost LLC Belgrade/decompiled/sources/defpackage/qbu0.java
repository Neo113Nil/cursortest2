package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qbu0 implements pbu0 {
    public final CharSequence a;
    public final CharSequence b;
    public final uau0 c;
    public final j37 d;

    public qbu0(CharSequence charSequence, CharSequence charSequence2, uau0 uau0Var, j37 j37Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uau0Var;
        this.d = j37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbu0)) {
            return false;
        }
        qbu0 qbu0Var = (qbu0) obj;
        return jl40.l(this.a, qbu0Var.a) && jl40.l(this.b, qbu0Var.b) && this.c.equals(qbu0Var.c) && this.d.equals(qbu0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "StepsSliderState(title=", ", subtitle=", ", action=");
        r.append(this.c);
        r.append(", style=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
