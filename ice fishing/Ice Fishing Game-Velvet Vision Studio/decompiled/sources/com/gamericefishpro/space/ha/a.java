package com.gamericefishpro.space.ha;

import android.graphics.Typeface;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends y3 {
    public final Typeface d;
    public final com.gamericefishpro.space.vb.c e;
    public boolean f;

    public a(com.gamericefishpro.space.vb.c cVar, Typeface typeface) {
        this.d = typeface;
        this.e = cVar;
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void A(int i) {
        if (this.f) {
            return;
        }
        com.gamericefishpro.space.fa.c cVar = (com.gamericefishpro.space.fa.c) this.e.e;
        if (cVar.l(this.d)) {
            cVar.j(false);
        }
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void B(Typeface typeface, boolean z) {
        if (this.f) {
            return;
        }
        com.gamericefishpro.space.fa.c cVar = (com.gamericefishpro.space.fa.c) this.e.e;
        if (cVar.l(typeface)) {
            cVar.j(false);
        }
    }
}
