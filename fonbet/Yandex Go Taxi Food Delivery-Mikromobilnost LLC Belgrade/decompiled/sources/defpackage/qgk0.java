package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qgk0 {
    public final boolean a;
    public final long b;
    public final float c;
    public final long d;

    public qgk0(long j, float f, boolean z, long j2) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
    }

    public static qgk0 a(qgk0 qgk0Var, int i) {
        boolean z = (i & 1) != 0 ? qgk0Var.a : false;
        long j = (i & 2) != 0 ? qgk0Var.b : 300L;
        float f = (i & 4) != 0 ? qgk0Var.c : 0.5f;
        long j2 = (i & 8) != 0 ? qgk0Var.d : 300L;
        qgk0Var.getClass();
        return new qgk0(j, f, z, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgk0)) {
            return false;
        }
        qgk0 qgk0Var = (qgk0) obj;
        return this.a == qgk0Var.a && this.b == qgk0Var.b && Float.compare(this.c, qgk0Var.c) == 0 && this.d == qgk0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + g8e.c(this.c, qv10.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideCardDriverContentUiState(expanded=");
        sb.append(this.a);
        sb.append(", heightAnimationDuration=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", alphaAnimationDuration=");
        return oyr.n(this.d, Extension.C_BRAKE, sb);
    }
}
