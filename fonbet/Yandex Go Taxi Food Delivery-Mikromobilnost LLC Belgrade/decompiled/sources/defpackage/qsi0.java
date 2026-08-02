package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class qsi0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final zb4 g;

    public qsi0(long j, long j2, long j3, long j4, long j5, zb4 zb4Var, float[] fArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = zb4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && qsi0.class == obj.getClass()) {
            qsi0 qsi0Var = (qsi0) obj;
            if (this.a == qsi0Var.a && this.b == qsi0Var.b && this.e == qsi0Var.e && z5w.a(this.c, qsi0Var.c) && z5w.a(this.d, qsi0Var.d)) {
                float[] fArr = qsi0Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.g == qsi0Var.g;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((c + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
