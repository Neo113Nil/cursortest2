package defpackage;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class xv1 {
    public static final xv1 d;
    public final int a;
    public final int b;
    public final hee c;

    static {
        xv1 xv1Var;
        if (dvt.a >= 33) {
            fee feeVar = new fee(4);
            for (int i = 1; i <= 10; i++) {
                feeVar.a(Integer.valueOf(dvt.u(i)));
            }
            xv1Var = new xv1(2, feeVar.f());
        } else {
            xv1Var = new xv1(2, 10);
        }
        d = xv1Var;
    }

    public xv1(int i, Set set) {
        this.a = i;
        hee v = hee.v(set);
        this.c = v;
        xkt it = v.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv1)) {
            return false;
        }
        xv1 xv1Var = (xv1) obj;
        return this.a == xv1Var.a && this.b == xv1Var.b && Objects.equals(this.c, xv1Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        hee heeVar = this.c;
        return i + (heeVar == null ? 0 : heeVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public xv1(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
