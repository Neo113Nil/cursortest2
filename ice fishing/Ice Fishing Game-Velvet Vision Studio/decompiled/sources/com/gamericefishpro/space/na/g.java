package com.gamericefishpro.space.na;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.ka.h {
    public final RectF r;

    public g(com.gamericefishpro.space.ka.n nVar, RectF rectF) {
        super(nVar);
        this.r = rectF;
    }

    @Override // com.gamericefishpro.space.ka.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.Z = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.r = gVar.r;
    }
}
