package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.c7;
import defpackage.e3o;
import defpackage.vq2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public class OverlappingImagesView extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public Bitmap d;
    public Bitmap e;
    public final Paint f;
    public final Paint g;
    public Canvas h;
    public Bitmap i;
    public final Rect j;
    public final Rect k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappingImagesView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = paint2;
        this.h = new Canvas();
        this.j = new Rect();
        this.k = new Rect();
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        int width = getWidth() - this.a;
        int childCount = getChildCount() - 1;
        if (childCount < 1) {
            childCount = 1;
        }
        int min = Math.min(this.b, (width / childCount) - this.a);
        for (int childCount2 = getChildCount() - 1; -1 < childCount2; childCount2--) {
            getChildAt(childCount2).draw(this.h);
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                this.h.drawBitmap(bitmap, 0.0f, 0.0f, this.f);
            }
            if (childCount2 > 0 && min < 0) {
                int i = this.a;
                int i2 = this.c;
                int i3 = i + i2 + min;
                int i4 = (-min) + i2;
                Rect rect = this.j;
                rect.set(i3, i2, i3 + i4, i2 + i);
                Rect rect2 = this.k;
                rect2.set(0, 0, i4, i);
                Bitmap bitmap2 = this.e;
                if (bitmap2 != null) {
                    this.h.drawBitmap(bitmap2, rect, rect2, this.g);
                }
            }
            float f = childCount2 * (this.a + min);
            Bitmap bitmap3 = this.i;
            if (bitmap3 != null) {
                int save = canvas.save();
                canvas.translate(f, 0.0f);
                try {
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
            this.h.drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        super.onMeasure(i, i2);
        if (getLayoutParams().width == -2) {
            int childCount = getChildCount() * this.a;
            int i3 = this.b;
            int childCount2 = getChildCount() - 1;
            if (childCount2 < 0) {
                childCount2 = 0;
            }
            size = (i3 * childCount2) + childCount;
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(size, this.a);
    }

    public final void setImagesCount(int i) {
        if (getChildCount() <= i) {
            int childCount = i - getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Context context = getContext();
                context.getClass();
                context.getClass();
                a aVar = new a(context);
                int i3 = this.a;
                addView(aVar, new FrameLayout.LayoutParams(i3, i3));
            }
        } else if (i > 0) {
            removeViews(i - 1, getChildCount() - i);
        } else {
            removeAllViews();
        }
        c7 c7Var = new c7(8, this);
        while (c7Var.hasNext()) {
            View view = (View) c7Var.next();
            a aVar2 = view instanceof a ? (a) view : null;
            if (aVar2 != null) {
                aVar2.setImageDrawable(null);
            }
        }
    }

    public final void setMask(int i) {
        Bitmap bitmap;
        Resources resources = getResources();
        ThreadLocal threadLocal = e3o.a;
        Drawable drawable = resources.getDrawable(i, null);
        if (drawable != null) {
            int i2 = this.a;
            bitmap = vq2.N(drawable, i2, i2, 4);
        } else {
            bitmap = null;
        }
        this.d = bitmap;
        int i3 = (this.c * 2) + this.a;
        Drawable drawable2 = getResources().getDrawable(i, null);
        this.e = drawable2 != null ? vq2.N(drawable2, i3, i3, 4) : null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlappingImagesView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ OverlappingImagesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlappingImagesView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
