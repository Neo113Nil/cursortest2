package com.gamericefishpro.space.n9;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends g0 {
    public com.gamericefishpro.space.f9.e i;
    public boolean v;
    public final com.gamericefishpro.space.m.d w;
    public final v3 y;
    public final com.gamericefishpro.space.u6.s z;

    public w3(r1 r1Var) {
        super(r1Var);
        this.v = true;
        this.w = new com.gamericefishpro.space.m.d(14, this);
        this.y = new v3(this);
        this.z = new com.gamericefishpro.space.u6.s(this);
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return false;
    }

    public final void v() {
        r();
        if (this.i == null) {
            this.i = new com.gamericefishpro.space.f9.e(Looper.getMainLooper(), 3);
        }
    }
}
