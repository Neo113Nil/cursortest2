package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qvz0 {
    public final boolean a;
    public final String b;

    public qvz0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvz0)) {
            return false;
        }
        qvz0 qvz0Var = (qvz0) obj;
        return this.a == qvz0Var.a && jl40.l(this.b, qvz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("TooltipShowState(shouldShow=", this.a, ", tooltipText=", this.b, Extension.C_BRAKE);
    }
}
