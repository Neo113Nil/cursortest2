package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class zsc extends zdg {
    @Override // defpackage.zdg
    public final void D() {
        S().D();
    }

    @Override // defpackage.zdg
    public void F() {
        S().F();
    }

    @Override // defpackage.zdg
    public void Q(List list) {
        S().Q(list);
    }

    public abstract zdg S();

    @Override // defpackage.zdg
    public final List t() {
        return S().t();
    }

    @Override // defpackage.zdg
    public String toString() {
        z0j Y = ezf.Y(this);
        Y.q(S(), "delegate");
        return Y.toString();
    }

    @Override // defpackage.zdg
    public final zc4 v() {
        return S().v();
    }

    @Override // defpackage.zdg
    public final Object w() {
        return S().w();
    }
}
