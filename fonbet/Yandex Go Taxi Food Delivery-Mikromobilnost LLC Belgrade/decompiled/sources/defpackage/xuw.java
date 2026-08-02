package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* loaded from: classes10.dex */
public final class xuw extends zuw {
    public IntrinsicSize a;
    public boolean b;

    @Override // defpackage.zuw
    public final long E0(x910 x910Var, long j) {
        int V = this.a == IntrinsicSize.Min ? x910Var.V(n8e.i(j)) : x910Var.y(n8e.i(j));
        if (V < 0) {
            V = 0;
        }
        if (V < 0) {
            kxv.a("height must be >= 0");
        }
        return p8e.h(0, Integer.MAX_VALUE, V, V);
    }

    @Override // defpackage.zuw
    public final boolean F0() {
        return this.b;
    }

    @Override // defpackage.zuw, defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.a == IntrinsicSize.Min ? x910Var.V(i) : x910Var.y(i);
    }

    @Override // defpackage.zuw, defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return this.a == IntrinsicSize.Min ? x910Var.V(i) : x910Var.y(i);
    }
}
