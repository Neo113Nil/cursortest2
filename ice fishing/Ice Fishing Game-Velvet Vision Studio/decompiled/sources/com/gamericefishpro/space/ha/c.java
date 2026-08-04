package com.gamericefishpro.space.ha;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y3 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ y3 f;
    public final /* synthetic */ d g;

    public c(d dVar, Context context, TextPaint textPaint, y3 y3Var) {
        this.g = dVar;
        this.d = context;
        this.e = textPaint;
        this.f = y3Var;
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void A(int i) {
        this.f.A(i);
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void B(Typeface typeface, boolean z) {
        this.g.f(this.d, this.e, typeface);
        this.f.B(typeface, z);
    }
}
