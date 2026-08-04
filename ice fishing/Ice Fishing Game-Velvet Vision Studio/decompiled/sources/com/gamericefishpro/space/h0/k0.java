package com.gamericefishpro.space.h0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, int i) {
        this.c = m0Var;
        this.a = i;
    }

    public final void a(int i) {
        m0 m0Var = this.c;
        z0 z0Var = m0Var.c;
        if (z0Var == null) {
            return;
        }
        this.b.add(new y0(z0Var, i, m0Var.b, null));
    }
}
