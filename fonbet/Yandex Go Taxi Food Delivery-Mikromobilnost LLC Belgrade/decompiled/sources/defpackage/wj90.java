package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wj90 {
    public final CharSequence a;
    public final wp2 b;
    public final ila c;

    public wj90(CharSequence charSequence, wp2 wp2Var, ila ilaVar) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = ilaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj90)) {
            return false;
        }
        wj90 wj90Var = (wj90) obj;
        return jl40.l(this.a, wj90Var.a) && jl40.l(this.b, wj90Var.b) && jl40.l(this.c, wj90Var.c);
    }

    public final int hashCode() {
        int b = n.b(this.b, this.a.hashCode() * 31, 31);
        ila ilaVar = this.c;
        return b + (ilaVar == null ? 0 : ilaVar.hashCode());
    }

    public final String toString() {
        return "PassButton(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
