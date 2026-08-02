package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wtm0 {
    public final avm0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final wp2 d;
    public final String e;

    public wtm0(avm0 avm0Var, CharSequence charSequence, CharSequence charSequence2, wp2 wp2Var, String str) {
        this.a = avm0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = wp2Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtm0)) {
            return false;
        }
        wtm0 wtm0Var = (wtm0) obj;
        return jl40.l(this.a, wtm0Var.a) && jl40.l(this.b, wtm0Var.b) && this.c.equals(wtm0Var.c) && jl40.l(this.d, wtm0Var.d) && jl40.l(this.e, wtm0Var.e);
    }

    public final int hashCode() {
        avm0 avm0Var = this.a;
        int b = n.b(this.d, smw0.b(smw0.b((avm0Var == null ? 0 : avm0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsElement(paymentData=");
        sb.append(this.a);
        sb.append(", primaryText=");
        sb.append((Object) this.b);
        sb.append(", secondaryText=");
        sb.append((Object) this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", imageTag=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
