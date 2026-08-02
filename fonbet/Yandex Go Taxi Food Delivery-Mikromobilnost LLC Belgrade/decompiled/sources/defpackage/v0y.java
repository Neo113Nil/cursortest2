package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.u;

/* loaded from: classes.dex */
public interface v0y extends cqh {
    default int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return u.b(new i4u(this), lookaheadCapablePlaceable, x910Var, i);
    }

    default int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return u.d(new u0y(this), lookaheadCapablePlaceable, x910Var, i);
    }

    aa10 e(k kVar, x910 x910Var, long j);

    default int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return u.c(new reu(17, this), lookaheadCapablePlaceable, x910Var, i);
    }

    default int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return u.a(new u0y(this), lookaheadCapablePlaceable, x910Var, i);
    }
}
