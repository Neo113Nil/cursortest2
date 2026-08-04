package com.gamericefishpro.space.i6;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p {
    public boolean a = false;
    public final ViewGroup b;

    public d(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public final void b() {
        com.gamericefishpro.space.b9.a.G(this.b, false);
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public final void c() {
        com.gamericefishpro.space.b9.a.G(this.b, true);
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public final void d(o oVar) {
        if (!this.a) {
            com.gamericefishpro.space.b9.a.G(this.b, false);
        }
        oVar.z(this);
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public final void e(o oVar) {
        com.gamericefishpro.space.b9.a.G(this.b, false);
        this.a = true;
    }
}
