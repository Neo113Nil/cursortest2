package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class eqv extends dqv {
    public zne o;
    public zne p;
    public zne q;

    public eqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.hqv
    public zne i() {
        if (this.p == null) {
            this.p = zne.d(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.hqv
    public zne k() {
        if (this.o == null) {
            this.o = zne.d(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.hqv
    public zne m() {
        if (this.q == null) {
            this.q = zne.d(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.bqv, defpackage.hqv
    public kqv n(int i, int i2, int i3, int i4) {
        return kqv.h(null, this.c.inset(i, i2, i3, i4));
    }

    public eqv(kqv kqvVar, eqv eqvVar) {
        super(kqvVar, eqvVar);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.cqv, defpackage.hqv
    public void u(zne zneVar) {
    }
}
