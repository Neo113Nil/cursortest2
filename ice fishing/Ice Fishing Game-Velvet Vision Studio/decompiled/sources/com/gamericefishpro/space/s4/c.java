package com.gamericefishpro.space.s4;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public c() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
