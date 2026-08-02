package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class za20 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public za20(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za20)) {
            return false;
        }
        za20 za20Var = (za20) obj;
        return this.a == za20Var.a && this.b == za20Var.b && this.c == za20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("MetricaActionState(isWhereYouAre=", ", isClarifyMode=", ", isShowingPickupPoints=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
