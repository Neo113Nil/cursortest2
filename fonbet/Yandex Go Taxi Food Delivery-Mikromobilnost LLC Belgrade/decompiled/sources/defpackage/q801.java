package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class q801 {
    public final int a;
    public final xzz0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(3);
        tw21.Q(4);
    }

    public q801(xzz0 xzz0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = xzz0Var.a;
        this.a = i;
        boolean z2 = false;
        d6z.l(i == iArr.length && i == zArr.length);
        this.b = xzz0Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final a a(int i) {
        return this.b.d[i];
    }

    public final int b() {
        return this.b.c;
    }

    public final boolean c(int i) {
        return d(i);
    }

    public final boolean d(int i) {
        return this.d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q801.class == obj.getClass()) {
            q801 q801Var = (q801) obj;
            if (this.c == q801Var.c && this.b.equals(q801Var.b) && Arrays.equals(this.d, q801Var.d) && Arrays.equals(this.e, q801Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
