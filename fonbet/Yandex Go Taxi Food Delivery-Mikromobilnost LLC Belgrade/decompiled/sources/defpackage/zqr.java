package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.ui.layout.o;

/* loaded from: classes10.dex */
public final class zqr {
    public final FlowLayoutOverflow$OverflowType a;
    public x910 b;
    public o c;
    public x910 d;
    public o e;
    public s5w f;
    public s5w g;

    public zqr(FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType) {
        this.a = flowLayoutOverflow$OverflowType;
    }

    public final s5w a(int i, int i2, boolean z) {
        int i3 = yqr.a[this.a.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 == 3) {
            if (z) {
                return this.f;
            }
            return null;
        }
        if (i3 != 4) {
            w511.b();
            return null;
        }
        if (z) {
            return this.f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.g;
    }

    public final void b(x910 x910Var, x910 x910Var2, boolean z, long j) {
        long c = id00.c(j, z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (x910Var != null) {
            int h = n8e.h(c);
            int e0 = z ? x910Var.e0(h) : x910Var.V(h);
            this.f = new s5w(s5w.a(e0, z ? x910Var.V(e0) : x910Var.e0(e0)));
            this.b = x910Var;
            this.c = null;
        }
        if (x910Var2 != null) {
            int h2 = n8e.h(c);
            int e02 = z ? x910Var2.e0(h2) : x910Var2.V(h2);
            this.g = new s5w(s5w.a(e02, z ? x910Var2.V(e02) : x910Var2.e0(e02)));
            this.d = x910Var2;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqr) && this.a == ((zqr) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + oyr.b(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
