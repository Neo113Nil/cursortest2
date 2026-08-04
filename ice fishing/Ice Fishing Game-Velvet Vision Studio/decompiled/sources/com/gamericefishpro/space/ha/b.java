package com.gamericefishpro.space.ha;

import android.graphics.Typeface;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.t3.b {
    public final /* synthetic */ y3 e;
    public final /* synthetic */ d f;

    public b(d dVar, y3 y3Var) {
        this.f = dVar;
        this.e = y3Var;
    }

    @Override // com.gamericefishpro.space.t3.b
    public final void g(int i) {
        this.f.n = true;
        this.e.A(i);
    }

    @Override // com.gamericefishpro.space.t3.b
    public final void h(Typeface typeface) {
        d dVar = this.f;
        dVar.p = Typeface.create(typeface, dVar.d);
        dVar.n = true;
        this.e.B(dVar.p, false);
    }
}
