package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public abstract class zuw extends e530 implements v0y {
    public abstract long E0(x910 x910Var, long j);

    public abstract boolean F0();

    public int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return x910Var.k0(i);
    }

    public int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return x910Var.e0(i);
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        long E0 = E0(x910Var, j);
        if (F0()) {
            E0 = p8e.e(j, E0);
        }
        o l0 = x910Var.l0(E0);
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 6));
    }

    public int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return x910Var.V(i);
    }

    public int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return x910Var.y(i);
    }
}
