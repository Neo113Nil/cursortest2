package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class zs2 extends ProgressBar {
    public final h7g a;
    public int b;
    public boolean c;
    public final boolean d;
    public final int e;
    public hn0 f;
    public boolean g;
    public int h;
    public boolean i;
    public final xs2 j;
    public final xs2 k;
    public final ys2 l;
    public final ys2 m;

    public zs2(Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.g = false;
        this.h = 4;
        this.j = new xs2(this, 0);
        this.k = new xs2(this, 1);
        this.l = new ys2(this, 0);
        this.m = new ys2(this, 1);
        Context context2 = getContext();
        h7g h7gVar = new h7g();
        h7gVar.e = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        bcx.t(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = vdn.d;
        bcx.u(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        h7gVar.a = ivf.E(context2, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                h7gVar.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), h7gVar.a / 2);
                h7gVar.d = false;
            } else if (i2 == 6) {
                h7gVar.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                h7gVar.d = true;
            }
        }
        h7gVar.g = obtainStyledAttributes.getInt(6, 0);
        h7gVar.h = obtainStyledAttributes.getInt(1, 0);
        h7gVar.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        h7gVar.j = Math.abs(obtainStyledAttributes.getDimensionPixelSize(14, abs));
        h7gVar.k = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, abs));
        h7gVar.l = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        h7gVar.m = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        h7gVar.n = obtainStyledAttributes.getFloat(2, 1.0f);
        if (!obtainStyledAttributes.hasValue(3)) {
            h7gVar.e = new int[]{qgg.O(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            h7gVar.e = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            h7gVar.e = intArray;
            if (intArray.length == 0) {
                xq0.x("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            h7gVar.f = obtainStyledAttributes.getColor(8, -1);
        } else {
            h7gVar.f = h7gVar.e[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            h7gVar.f = qgg.E(h7gVar.f, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
        bcx.t(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr2 = vdn.u;
        bcx.u(context2, attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        h7gVar.o = obtainStyledAttributes3.getInt(0, 1);
        h7gVar.p = obtainStyledAttributes3.getInt(1, 0);
        h7gVar.r = Math.min(obtainStyledAttributes3.getDimensionPixelSize(4, 0), h7gVar.a);
        if (obtainStyledAttributes3.hasValue(3)) {
            h7gVar.s = Integer.valueOf(obtainStyledAttributes3.getDimensionPixelSize(3, 0));
        }
        TypedValue peekValue2 = obtainStyledAttributes3.peekValue(2);
        if (peekValue2 != null) {
            int i3 = peekValue2.type;
            if (i3 == 5) {
                h7gVar.t = Math.min(TypedValue.complexToDimensionPixelSize(peekValue2.data, obtainStyledAttributes3.getResources().getDisplayMetrics()), h7gVar.a / 2);
                h7gVar.v = false;
                h7gVar.w = true;
            } else if (i3 == 6) {
                h7gVar.u = Math.min(peekValue2.getFraction(1.0f, 1.0f), 0.5f);
                h7gVar.v = true;
                h7gVar.w = true;
            }
        }
        obtainStyledAttributes3.recycle();
        h7gVar.d();
        h7gVar.q = h7gVar.p == 1;
        this.a = h7gVar;
        bcx.t(context2, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        bcx.u(context2, attributeSet, iArr, i, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        obtainStyledAttributes4.getInt(7, -1);
        this.e = Math.min(obtainStyledAttributes4.getInt(5, -1), 1000);
        obtainStyledAttributes4.recycle();
        this.f = new hn0();
        this.d = true;
    }

    private iqa getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().n;
    }

    public void a(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = z;
            this.g = true;
            if (getIndeterminateDrawable().isVisible()) {
                hn0 hn0Var = this.f;
                ContentResolver contentResolver = getContext().getContentResolver();
                hn0Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().o.I();
                    return;
                }
            }
            this.l.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.h;
    }

    @Override // android.widget.ProgressBar
    public qie getIndeterminateDrawable() {
        return (qie) super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.i;
    }

    @Override // android.widget.ProgressBar
    public kz7 getProgressDrawable() {
        return (kz7) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.g;
    }

    public int getTrackColor() {
        return this.a.f;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.a.c;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public int getWaveAmplitude() {
        return this.a.l;
    }

    public int getWaveSpeed() {
        return this.a.m;
    }

    public int getWavelengthDeterminate() {
        return this.a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.a.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o.H(this.l);
        }
        kz7 progressDrawable = getProgressDrawable();
        ys2 ys2Var = this.m;
        if (progressDrawable != null) {
            kz7 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.g == null) {
                progressDrawable2.g = new ArrayList();
            }
            if (!progressDrawable2.g.contains(ys2Var)) {
                progressDrawable2.g.add(ys2Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            qie indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.g == null) {
                indeterminateDrawable.g = new ArrayList();
            }
            if (!indeterminateDrawable.g.contains(ys2Var)) {
                indeterminateDrawable.g.add(ys2Var);
            }
        }
        if (b()) {
            if (this.e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k);
        removeCallbacks(this.j);
        ((zpa) getCurrentDrawable()).d(false, false, false);
        qie indeterminateDrawable = getIndeterminateDrawable();
        ys2 ys2Var = this.m;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(ys2Var);
            getIndeterminateDrawable().o.N();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(ys2Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().b();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            iqa currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), currentDrawingDelegate.a() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.a() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.d) {
            ((zpa) getCurrentDrawable()).d(b(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.d) {
            ((zpa) getCurrentDrawable()).d(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull hn0 hn0Var) {
        this.f = hn0Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = hn0Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = hn0Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            zpa zpaVar = (zpa) getCurrentDrawable();
            if (zpaVar != null) {
                zpaVar.d(false, false, false);
            }
            super.setIndeterminate(z);
            zpa zpaVar2 = (zpa) getCurrentDrawable();
            if (zpaVar2 != null) {
                zpaVar2.d(b(), false, false);
            }
            if ((zpaVar2 instanceof qie) && b()) {
                ((qie) zpaVar2).o.L();
            }
            this.g = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        h7g h7gVar = this.a;
        if (h7gVar.n != f) {
            h7gVar.n = f;
            getIndeterminateDrawable().o.x();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof qie) {
            ((zpa) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.i) {
            xq0.x("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{qgg.O(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.e = iArr;
        getIndeterminateDrawable().o.x();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.i != i) {
            h7gVar.i = i;
            h7gVar.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        a(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof kz7) {
            kz7 kz7Var = (kz7) drawable;
            kz7Var.d(false, false, false);
            super.setProgressDrawable(kz7Var);
            kz7Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.i) {
            xq0.x("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.f != i) {
            h7gVar.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.b != i) {
            h7gVar.b = Math.min(i, h7gVar.a / 2);
            h7gVar.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        h7g h7gVar = this.a;
        if (h7gVar.c != f) {
            h7gVar.c = Math.min(f, 0.5f);
            h7gVar.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.a != i) {
            h7gVar.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.h = i;
        } else {
            xq0.x("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.l != i) {
            h7gVar.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        h7g h7gVar = this.a;
        h7gVar.m = i;
        kz7 progressDrawable = getProgressDrawable();
        boolean z = h7gVar.m != 0;
        ValueAnimator valueAnimator = progressDrawable.t;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.j != i) {
            h7gVar.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        h7g h7gVar = this.a;
        if (h7gVar.k != i) {
            h7gVar.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
