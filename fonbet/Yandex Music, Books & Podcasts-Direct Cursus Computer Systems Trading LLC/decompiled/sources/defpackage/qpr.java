package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class qpr extends rg7 implements ipr {
    public ipr j;
    public long k;

    @Override // defpackage.ipr
    public final int e(long j) {
        ipr iprVar = this.j;
        iprVar.getClass();
        return iprVar.e(j - this.k);
    }

    @Override // defpackage.ipr
    public final List g(long j) {
        ipr iprVar = this.j;
        iprVar.getClass();
        return iprVar.g(j - this.k);
    }

    @Override // defpackage.ipr
    public final long o(int i) {
        ipr iprVar = this.j;
        iprVar.getClass();
        return iprVar.o(i) + this.k;
    }

    @Override // defpackage.ipr
    public final int q() {
        ipr iprVar = this.j;
        iprVar.getClass();
        return iprVar.q();
    }

    @Override // defpackage.rg7
    public final void z() {
        this.b = 0;
        this.g = 0L;
        this.h = 0;
        this.i = false;
        this.j = null;
    }
}
