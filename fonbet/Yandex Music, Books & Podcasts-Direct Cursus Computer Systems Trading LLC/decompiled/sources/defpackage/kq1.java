package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class kq1 extends AppCompatImageView implements sq1 {
    public static final /* synthetic */ s9f[] g;
    public Bitmap a;
    public final ub b;
    public final q13 c;
    public iq1 d;
    public final Matrix e;
    public boolean f;

    static {
        opi opiVar = new opi(kq1.class, "gravity", "getGravity()I", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar, new opi(kq1.class, "aspectRatio", "getAspectRatio()F", 0)};
    }

    public kq1(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ub ubVar = new ub();
        ubVar.a = 0;
        this.b = ubVar;
        this.c = new q13(Float.valueOf(0.0f), rq1.s);
        this.d = iq1.a;
        this.e = new Matrix();
        this.f = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public boolean c(int i) {
        return View.MeasureSpec.getMode(i) != 1073741824;
    }

    public final float getAspectRatio() {
        s9f s9fVar = g[1];
        q13 q13Var = this.c;
        q13Var.getClass();
        return ((Number) q13Var.a).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.a;
    }

    public final int getGravity() {
        s9f s9fVar = g[0];
        ub ubVar = this.b;
        ubVar.getClass();
        return ((Number) ubVar.a).intValue();
    }

    @NotNull
    public final iq1 getImageScale() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Matrix imageMatrix = getImageMatrix();
        Matrix matrix = this.e;
        if ((imageMatrix == null || Intrinsics.d(getImageMatrix(), matrix)) && this.f && getWidth() > 0 && getHeight() > 0) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                float F = bg3.F(this);
                float E = bg3.E(this);
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(getGravity(), getLayoutDirection());
                int ordinal = this.d.ordinal();
                if (ordinal == 0) {
                    width = this.a != null ? (r6.getWidth() * getContext().getResources().getDisplayMetrics().density) / intrinsicWidth : 1.0f;
                } else if (ordinal == 1) {
                    width = Math.min(F / intrinsicWidth, E / intrinsicHeight);
                } else if (ordinal == 2) {
                    width = Math.max(F / intrinsicWidth, E / intrinsicHeight);
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    width = F / intrinsicWidth;
                }
                float f = jq1.a[this.d.ordinal()] == 4 ? E / intrinsicHeight : width;
                int i = absoluteGravity & 7;
                float f2 = 0.0f;
                float f3 = i != 1 ? i != 5 ? 0.0f : F - (intrinsicWidth * width) : (F - (intrinsicWidth * width)) / 2;
                int i2 = absoluteGravity & 112;
                if (i2 == 16) {
                    f2 = (E - (intrinsicHeight * f)) / 2;
                } else if (i2 == 80) {
                    f2 = E - (intrinsicHeight * f);
                }
                matrix.reset();
                matrix.postScale(width, f);
                matrix.postTranslate(f3, f2);
                setImageMatrix(matrix);
            }
            this.f = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean c = c(i);
        boolean z = View.MeasureSpec.getMode(i2) != 1073741824;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!c && !z) {
            measuredHeight = eeh.b(measuredWidth / aspectRatio);
        } else if (!c && z) {
            measuredHeight = eeh.b(measuredWidth / aspectRatio);
        } else if (c && !z) {
            measuredWidth = eeh.b(measuredHeight * aspectRatio);
        } else if (c && z) {
            measuredHeight = eeh.b(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
    }

    @Override // defpackage.sq1
    public final void setAspectRatio(float f) {
        this.c.setValue(this, g[1], Float.valueOf(f));
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final void setGravity(int i) {
        this.b.setValue(this, g[0], Integer.valueOf(i));
    }

    public final void setImageScale(@NotNull iq1 iq1Var) {
        if (this.d != iq1Var) {
            this.d = iq1Var;
            invalidate();
            if (bg3.r0(this)) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public kq1(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ kq1(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public kq1(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
