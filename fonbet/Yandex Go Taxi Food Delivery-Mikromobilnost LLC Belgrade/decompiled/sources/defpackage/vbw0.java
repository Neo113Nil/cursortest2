package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vbw0 implements wbw0 {
    public final CharSequence a;
    public final pjc0 b;
    public final pwz0 c;

    public vbw0(CharSequence charSequence, pjc0 pjc0Var, pwz0 pwz0Var) {
        this.a = charSequence;
        this.b = pjc0Var;
        this.c = pwz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbw0)) {
            return false;
        }
        vbw0 vbw0Var = (vbw0) obj;
        return jl40.l(this.a, vbw0Var.a) && jl40.l(this.b, vbw0Var.b) && jl40.l(this.c, vbw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Visible(text=" + ((Object) this.a) + ", clickAction=" + this.b + ", reason=" + this.c + Extension.C_BRAKE;
    }
}
