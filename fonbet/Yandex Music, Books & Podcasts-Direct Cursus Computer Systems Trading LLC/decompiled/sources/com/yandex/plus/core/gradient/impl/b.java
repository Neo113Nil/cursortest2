package com.yandex.plus.core.gradient.impl;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.core.gradient.api.c;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes4.dex */
public final class b implements c {
    public final jyr a;
    public float b;
    public float c;
    public final Matrix d;
    public final Matrix e;
    public final RectF f;
    public float g;
    public final float h;

    public b(int[] iArr, float[] fArr, float f) {
        Shader.TileMode.REPEAT.getClass();
        this.a = btf.b(new p(iArr, fArr, this));
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.h = f;
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void a(float f, float f2, float f3, float f4) {
        float f5;
        RectF rectF = this.f;
        rectF.set(f, f2, f3, f4);
        float width = rectF.width();
        float height = rectF.height();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f6 = this.h;
        if (f6 >= 90.0f) {
            if (f6 < 180.0f) {
                f5 = 180;
            } else if (f6 < 270.0f) {
                f6 -= 180;
            } else {
                f5 = 360;
            }
            f6 = f5 - f6;
        }
        double radians = Math.toRadians(f6);
        this.g = (float) (Math.cos(((float) Math.asin(width / r4)) - radians) * ((float) Math.sqrt((height * height) + (width * width))));
        c();
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void b(float f) {
        this.b = f;
        c();
    }

    public final void c() {
        Matrix matrix = this.d;
        matrix.reset();
        float f = this.g;
        matrix.postScale(f, f);
        matrix.postRotate(this.h);
        RectF rectF = this.f;
        float f2 = 2;
        matrix.postTranslate((rectF.width() / f2) + rectF.left + this.b, (rectF.height() / f2) + rectF.top + this.c);
        Matrix matrix2 = this.e;
        matrix2.set(matrix);
        matrix2.preTranslate(0.0f, -0.0f);
        ((LinearGradient) this.a.getValue()).setLocalMatrix(matrix2);
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final Shader n() {
        return (LinearGradient) this.a.getValue();
    }

    @Override // com.yandex.plus.core.gradient.api.c
    public final void q(float f) {
        this.c = f;
        c();
    }
}
