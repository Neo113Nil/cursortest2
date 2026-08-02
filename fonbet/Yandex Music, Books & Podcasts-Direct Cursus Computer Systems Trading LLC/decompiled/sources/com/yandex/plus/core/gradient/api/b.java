package com.yandex.plus.core.gradient.api;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b extends e {
    public final List c;
    public final List d;
    public final float e;
    public final float f;

    public b(float f, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.c = list;
        this.d = list2;
        this.e = f % 360;
        this.f = (float) Math.abs(Math.tan(Math.toRadians(r1 - 90)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawRect(this.b, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        float f3;
        rect.getClass();
        RectF rectF = this.b;
        rectF.set(rect);
        float width = rectF.width();
        float height = rectF.height();
        float f4 = this.e;
        float f5 = 0.0f;
        if (f4 == 90.0f || f4 == 270.0f) {
            f = 0.0f;
            f5 = width;
        } else if (f4 == 0.0f || f4 == 180.0f) {
            f = height;
        } else {
            float f6 = this.f;
            if (f6 < 1.0f) {
                float f7 = ((height - (width * f6)) * f6) + width;
                f = f6 * f7;
                f5 = f7;
            } else if (f6 > 1.0f) {
                f = ((width - (height / f6)) / f6) + height;
                f5 = f / f6;
            } else {
                f5 = Math.max(width, height);
                f = f5;
            }
        }
        Float valueOf = Float.valueOf(f5);
        Float valueOf2 = Float.valueOf(f);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float f8 = rectF.left;
        float f9 = rectF.top;
        if (f4 >= 90.0f) {
            if (f4 < 180.0f) {
                f2 = floatValue + f8;
            } else if (f4 < 270.0f) {
                f8 += width;
                f2 = f8 - floatValue;
            } else {
                f8 += width;
                f9 += height;
                f2 = f8 - floatValue;
            }
            f3 = f9 + floatValue2;
            this.a.setShader(new LinearGradient(f8, f9, f2, f3, CollectionsKt.v0(this.c), CollectionsKt.t0(this.d), Shader.TileMode.REPEAT));
        }
        f9 += height;
        f2 = floatValue + f8;
        f3 = f9 - floatValue2;
        this.a.setShader(new LinearGradient(f8, f9, f2, f3, CollectionsKt.v0(this.c), CollectionsKt.t0(this.d), Shader.TileMode.REPEAT));
    }
}
