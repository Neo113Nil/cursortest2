package com.gamericefishpro.space.na;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.ka.j {
    public static final /* synthetic */ int a0 = 0;
    public g Z;

    @Override // com.gamericefishpro.space.ka.j
    public final void f(Canvas canvas) {
        if (this.Z.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.Z.r);
        super.f(canvas);
        canvas.restore();
    }

    @Override // com.gamericefishpro.space.ka.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.Z = new g(this.Z);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.Z.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
