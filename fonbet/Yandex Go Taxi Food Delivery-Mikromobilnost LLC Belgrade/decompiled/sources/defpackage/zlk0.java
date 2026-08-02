package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zlk0 {
    public final int a;
    public final kdc b;
    public final boolean c;
    public final long d;

    public zlk0(int i, kdc kdcVar, boolean z, long j) {
        this.a = i;
        this.b = kdcVar;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlk0)) {
            return false;
        }
        zlk0 zlk0Var = (zlk0) obj;
        return this.a == zlk0Var.a && jl40.l(this.b, zlk0Var.b) && this.c == zlk0Var.c && this.d == zlk0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + unr0.e(smw0.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "ProgressBar(timeInterval=" + this.a + ", color=" + this.b + ", shouldIncrease=" + this.c + ", finishTime=" + this.d + Extension.C_BRAKE;
    }
}
