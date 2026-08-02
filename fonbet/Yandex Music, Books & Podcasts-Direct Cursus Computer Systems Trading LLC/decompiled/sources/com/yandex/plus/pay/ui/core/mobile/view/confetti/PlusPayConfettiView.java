package com.yandex.plus.pay.ui.core.mobile.view.confetti;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.aa5;
import defpackage.c5b;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class PlusPayConfettiView extends View {
    public final Paint a;
    public int[] b;
    public Object c;
    public int[] d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayConfettiView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.a = paint;
        this.b = new int[0];
        c5b c5bVar = c5b.a;
        this.c = c5bVar;
        this.d = new int[0];
        this.e = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f = c5bVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            float f = ((PointF) this.c.get(i)).x;
            float f2 = ((PointF) this.c.get(i)).y;
            double d = f2;
            double height = canvas.getHeight() * 0.8d;
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (d > height) {
                int height2 = (int) (((canvas.getHeight() - f2) / (canvas.getHeight() * 0.19999999999999996d)) * KotlinVersion.MAX_COMPONENT_VALUE);
                i2 = height2 < 0 ? 0 : height2;
            }
            int l = aa5.l(this.b[i], Math.min(i2, this.e));
            Paint paint = this.a;
            paint.setColor(l);
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                float f3 = this.d[i];
                save = canvas.save();
                canvas.rotate(f3, 0.0f, 0.0f);
                try {
                    canvas.drawPath((Path) this.f.get(i), paint);
                    canvas.restoreToCount(save);
                } finally {
                    canvas.restoreToCount(save);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ PlusPayConfettiView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayConfettiView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
