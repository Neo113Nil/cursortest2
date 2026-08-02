package defpackage;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.g;

/* loaded from: classes10.dex */
public final class w0y extends noz {
    public final /* synthetic */ g O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0y(g gVar) {
        super(gVar);
        this.O = gVar;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int C0(kt1 kt1Var) {
        int a = xcb1.a(this, kt1Var);
        this.N.g(kt1Var, a);
        return a;
    }

    @Override // defpackage.x910
    public final int V(int i) {
        g gVar = this.O;
        return gVar.q0.l0(this, gVar.J.Z0(), i);
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        g gVar = this.O;
        return gVar.q0.b(this, gVar.J.Z0(), i);
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        g gVar = this.O;
        return gVar.q0.O(this, gVar.J.Z0(), i);
    }

    @Override // defpackage.x910
    public final o l0(long j) {
        z0(j);
        new n8e(j);
        g gVar = this.O;
        noz.Q0(this, gVar.q0.e(this, gVar.J.Z0(), j));
        return this;
    }

    @Override // defpackage.x910
    public final int y(int i) {
        g gVar = this.O;
        return gVar.q0.v(this, gVar.J.Z0(), i);
    }
}
