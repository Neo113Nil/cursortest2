package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jpd implements lpd {
    public final float a;

    public jpd(float f) {
        this.a = f;
        if (Float.compare(f, 0) > 0) {
            return;
        }
        vme.a("Provided min size should be larger than zero.");
    }

    @Override // defpackage.lpd
    public final ArrayList a(jx7 jx7Var, int i, int i2) {
        return wdp.V(i, Math.max((i + i2) / (jx7Var.L(this.a) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpd) {
            return cma.a(this.a, ((jpd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
