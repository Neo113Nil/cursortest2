package com.gamericefishpro.space.fa;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public float c;
    public final WeakReference e;
    public com.gamericefishpro.space.ha.d f;
    public final TextPaint a = new TextPaint(1);
    public final com.gamericefishpro.space.aa.b b = new com.gamericefishpro.space.aa.b(1, this);
    public boolean d = true;

    public j(com.gamericefishpro.space.aa.f fVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
