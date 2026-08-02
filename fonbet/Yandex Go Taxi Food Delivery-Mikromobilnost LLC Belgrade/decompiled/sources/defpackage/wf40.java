package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wf40 {
    public final CharSequence a;
    public final CharSequence b;

    public wf40(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf40)) {
            return false;
        }
        wf40 wf40Var = (wf40) obj;
        return jl40.l(this.a, wf40Var.a) && jl40.l(this.b, wf40Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "MtTrainRouteState(routeTitle=", ", routeSubtitle=", Extension.C_BRAKE);
    }

    public wf40() {
        this(null, null);
    }
}
