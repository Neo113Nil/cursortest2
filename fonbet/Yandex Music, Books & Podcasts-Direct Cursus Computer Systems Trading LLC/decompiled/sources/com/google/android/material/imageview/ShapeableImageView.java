package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.a;
import defpackage.bg3;
import defpackage.etn;
import defpackage.eup;
import defpackage.fup;
import defpackage.fvp;
import defpackage.gvp;
import defpackage.ivf;
import defpackage.nwh;
import defpackage.vdn;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements fvp {
    public final nwh a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final Paint e;
    public final Path f;
    public ColorStateList g;
    public a h;
    public eup i;
    public float j;
    public final Path k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public boolean r;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.a = fup.a;
        this.f = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.b = new RectF();
        this.c = new RectF();
        this.k = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, vdn.O, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.g = ivf.D(context2, obtainStyledAttributes, 9);
        this.j = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.i = eup.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).e();
        setOutlineProvider(new gvp(this));
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public int getContentPaddingBottom() {
        return this.o;
    }

    public final int getContentPaddingEnd() {
        int i = this.q;
        return i != Integer.MIN_VALUE ? i : c() ? this.l : this.n;
    }

    public int getContentPaddingLeft() {
        int i = this.q;
        int i2 = this.p;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.l;
    }

    public int getContentPaddingRight() {
        int i = this.q;
        int i2 = this.p;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int getContentPaddingStart() {
        int i = this.p;
        return i != Integer.MIN_VALUE ? i : c() ? this.n : this.l;
    }

    public int getContentPaddingTop() {
        return this.m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        return this.i;
    }

    public ColorStateList getStrokeColor() {
        return this.g;
    }

    public float getStrokeWidth() {
        return this.j;
    }

    public final void n(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.b;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        eup eupVar = this.i;
        nwh nwhVar = this.a;
        Path path = this.f;
        nwhVar.e(eupVar, null, 1.0f, rectF, null, path);
        Path path2 = this.k;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.c;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.e);
        if (this.g == null) {
            return;
        }
        float f = this.j;
        Paint paint = this.d;
        paint.setStrokeWidth(f);
        int colorForState = this.g.getColorForState(getDrawableState(), this.g.getDefaultColor());
        if (this.j <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.r && isLayoutDirectionResolved()) {
            this.r = true;
            if (!isPaddingRelative() && this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.fvp
    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        this.i = eupVar;
        a aVar = this.h;
        if (aVar != null) {
            aVar.setShapeAppearanceModel(eupVar);
        }
        n(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(etn.E(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.j != f) {
            this.j = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
