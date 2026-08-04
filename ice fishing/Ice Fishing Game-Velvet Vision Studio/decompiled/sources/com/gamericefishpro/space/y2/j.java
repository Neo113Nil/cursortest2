package com.gamericefishpro.space.y2;

import android.text.TextPaint;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.r2.r;
import com.gamericefishpro.space.r2.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final k a = new k(false);

    public static final boolean a(i0 i0Var) {
        r rVar;
        s sVar = i0Var.c;
        com.gamericefishpro.space.r2.h hVar = (sVar == null || (rVar = sVar.a) == null) ? null : new com.gamericefishpro.space.r2.h(rVar.b);
        boolean z = false;
        if (hVar != null && hVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final void b(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255));
    }
}
