package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kpd implements lpd {
    public final int a;

    public kpd(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        vme.a("Provided count should be larger than zero");
    }

    @Override // defpackage.lpd
    public final ArrayList a(jx7 jx7Var, int i, int i2) {
        return wdp.V(i, this.a, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kpd) {
            return this.a == ((kpd) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
