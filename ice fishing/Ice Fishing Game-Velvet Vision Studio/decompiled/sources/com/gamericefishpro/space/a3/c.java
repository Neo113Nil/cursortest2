package com.gamericefishpro.space.a3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.gamericefishpro.space.n1.e;
import com.gamericefishpro.space.o1.i0;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.y2.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends CharacterStyle implements UpdateAppearance {
    public final i0 d;
    public final float e;
    public final f1 i = i.v(new e(9205357640488583168L));
    public final d0 v = i.p(new b(0, this));

    public c(i0 i0Var, float f) {
        this.d = i0Var;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.e);
        textPaint.setShader((Shader) this.v.getValue());
    }
}
