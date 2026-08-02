package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ue21 {
    public final sls a;
    public final sls b;

    public ue21(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue21)) {
            return false;
        }
        ue21 ue21Var = (ue21) obj;
        return jl40.l(this.a, ue21Var.a) && jl40.l(this.b, ue21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Callbacks(onShow=" + this.a + ", onDismiss=" + this.b + Extension.C_BRAKE;
    }
}
