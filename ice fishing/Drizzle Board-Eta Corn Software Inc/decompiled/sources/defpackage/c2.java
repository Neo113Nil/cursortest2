package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class c2 extends ProgressBar {
    public int MdtA4re8;
    public final m5 NCTxEWno;
    public final a2 OnDfzHZD;
    public long P7K7Inc8;
    public boolean Qr9iLBAD;
    public final int VgvYg0wo;
    public rSPHMVzL b2ZJblxo;
    public boolean eVhOlqcC;
    public int jb9XjC4I;
    public final z1 k3x7lurq;
    public final b2 lDXGDhIF;
    public final a2 ow5vqvCr;
    public final boolean wxUZMvaN;
    public final b2 ygLcUYwZ;

    public c2(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.P7K7Inc8 = -1L;
        this.Qr9iLBAD = false;
        this.jb9XjC4I = 4;
        this.k3x7lurq = new z1(this);
        this.ow5vqvCr = new a2(this, 0);
        this.OnDfzHZD = new a2(this, 1);
        this.ygLcUYwZ = new b2(this, 0);
        this.lDXGDhIF = new b2(this, 1);
        Context context2 = getContext();
        m5 m5Var = new m5();
        m5Var.VgvYg0wo = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        fn.NCTxEWno(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = y00.NCTxEWno;
        fn.wxUZMvaN(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        m5Var.qoPGr6Ce = w30.WYNAV5pd(context2, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i = peekValue.type;
            if (i == 5) {
                m5Var.NCTxEWno = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), m5Var.qoPGr6Ce / 2);
                m5Var.wxUZMvaN = false;
            } else if (i == 6) {
                m5Var.MdtA4re8 = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                m5Var.wxUZMvaN = true;
            }
        }
        m5Var.b2ZJblxo = obtainStyledAttributes.getInt(6, 0);
        m5Var.Qr9iLBAD = obtainStyledAttributes.getInt(1, 0);
        m5Var.jb9XjC4I = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, 0));
        m5Var.eVhOlqcC = Math.abs(obtainStyledAttributes.getDimensionPixelSize(16, abs));
        m5Var.k3x7lurq = Math.abs(obtainStyledAttributes.getDimensionPixelSize(17, abs));
        m5Var.ow5vqvCr = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        m5Var.OnDfzHZD = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        m5Var.ygLcUYwZ = obtainStyledAttributes.getFloat(2, 1.0f);
        m5Var.lDXGDhIF = obtainStyledAttributes.getFloat(13, 0.1f);
        m5Var.sjUBp5pO = obtainStyledAttributes.getFloat(12, 0.9f);
        if (!obtainStyledAttributes.hasValue(3)) {
            m5Var.VgvYg0wo = new int[]{fn.OnDfzHZD(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            m5Var.VgvYg0wo = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            m5Var.VgvYg0wo = intArray;
            if (intArray.length == 0) {
                m1.sjUBp5pO("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            m5Var.P7K7Inc8 = obtainStyledAttributes.getColor(8, -1);
        } else {
            m5Var.P7K7Inc8 = m5Var.VgvYg0wo[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            int i2 = (int) (f * 255.0f);
            int i3 = m5Var.P7K7Inc8;
            m5Var.P7K7Inc8 = g6.wxUZMvaN(i3, (i2 * Color.alpha(i3)) / 255);
        }
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        fn.NCTxEWno(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = y00.b2ZJblxo;
        fn.wxUZMvaN(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        m5Var.OxcuoDLp = obtainStyledAttributes3.getInt(0, 0);
        m5Var.amk52bBQ = Math.max(w30.WYNAV5pd(context2, obtainStyledAttributes3, 4, dimensionPixelSize2), m5Var.qoPGr6Ce * 2);
        m5Var.KlHjfFWx = w30.WYNAV5pd(context2, obtainStyledAttributes3, 3, dimensionPixelSize3);
        m5Var.Ey6iv0m0 = obtainStyledAttributes3.getInt(2, 0);
        m5Var.I5GHvsYW = obtainStyledAttributes3.getBoolean(1, true);
        obtainStyledAttributes3.recycle();
        m5Var.NCTxEWno();
        this.NCTxEWno = m5Var;
        fn.NCTxEWno(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        fn.wxUZMvaN(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obtainStyledAttributes4.getInt(7, -1);
        this.VgvYg0wo = Math.min(obtainStyledAttributes4.getInt(5, -1), 1000);
        obtainStyledAttributes4.recycle();
        this.b2ZJblxo = new rSPHMVzL();
        this.wxUZMvaN = true;
    }

    private zd getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().lDXGDhIF;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().lDXGDhIF;
    }

    public final boolean NCTxEWno() {
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
        return this.NCTxEWno.Qr9iLBAD;
    }

    @Override // android.widget.ProgressBar
    public sm getIndeterminateDrawable() {
        return (sm) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.NCTxEWno.VgvYg0wo;
    }

    public int getIndicatorTrackGapSize() {
        return this.NCTxEWno.jb9XjC4I;
    }

    @Override // android.widget.ProgressBar
    public ec getProgressDrawable() {
        return (ec) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.NCTxEWno.b2ZJblxo;
    }

    public int getTrackColor() {
        return this.NCTxEWno.P7K7Inc8;
    }

    public int getTrackCornerRadius() {
        return this.NCTxEWno.NCTxEWno;
    }

    public float getTrackCornerRadiusFraction() {
        return this.NCTxEWno.MdtA4re8;
    }

    public int getTrackThickness() {
        return this.NCTxEWno.qoPGr6Ce;
    }

    public int getWaveAmplitude() {
        return this.NCTxEWno.ow5vqvCr;
    }

    public int getWaveSpeed() {
        return this.NCTxEWno.OnDfzHZD;
    }

    public int getWavelengthDeterminate() {
        return this.NCTxEWno.eVhOlqcC;
    }

    public int getWavelengthIndeterminate() {
        return this.NCTxEWno.k3x7lurq;
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
            getIndeterminateDrawable().sjUBp5pO.OnDfzHZD(this.ygLcUYwZ);
        }
        ec progressDrawable = getProgressDrawable();
        b2 b2Var = this.lDXGDhIF;
        if (progressDrawable != null) {
            ec progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.Qr9iLBAD;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.Qr9iLBAD = arrayList;
            }
            if (!arrayList.contains(b2Var)) {
                progressDrawable2.Qr9iLBAD.add(b2Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            sm indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.Qr9iLBAD;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.Qr9iLBAD = arrayList2;
            }
            if (!arrayList2.contains(b2Var)) {
                indeterminateDrawable.Qr9iLBAD.add(b2Var);
            }
        }
        if (NCTxEWno()) {
            if (this.VgvYg0wo > 0) {
                this.P7K7Inc8 = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.OnDfzHZD);
        removeCallbacks(this.ow5vqvCr);
        ((wd) getCurrentDrawable()).wxUZMvaN(false, false, false);
        sm indeterminateDrawable = getIndeterminateDrawable();
        b2 b2Var = this.lDXGDhIF;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().P7K7Inc8(b2Var);
            getIndeterminateDrawable().sjUBp5pO.OxcuoDLp();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().P7K7Inc8(b2Var);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().qoPGr6Ce();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            zd currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((h5) currentDrawingDelegate).b2ZJblxo() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((h5) currentDrawingDelegate).b2ZJblxo() + getPaddingLeft() + getPaddingRight(), ((h5) currentDrawingDelegate).b2ZJblxo() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((h5) currentDrawingDelegate).b2ZJblxo() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.wxUZMvaN) {
            ((wd) getCurrentDrawable()).wxUZMvaN(NCTxEWno(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.wxUZMvaN) {
            ((wd) getCurrentDrawable()).wxUZMvaN(NCTxEWno(), false, false);
        }
    }

    public final void qoPGr6Ce(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.MdtA4re8 = i;
            this.Qr9iLBAD = true;
            if (getIndeterminateDrawable().isVisible()) {
                rSPHMVzL rsphmvzl = this.b2ZJblxo;
                ContentResolver contentResolver = getContext().getContentResolver();
                rsphmvzl.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().sjUBp5pO.ygLcUYwZ();
                    return;
                }
            }
            this.ygLcUYwZ.qoPGr6Ce(getIndeterminateDrawable());
        }
    }

    public void setAnimatorDurationScaleProvider(rSPHMVzL rsphmvzl) {
        this.b2ZJblxo = rsphmvzl;
        if (getProgressDrawable() != null) {
            getProgressDrawable().wxUZMvaN = rsphmvzl;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().wxUZMvaN = rsphmvzl;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        z1 z1Var = this.k3x7lurq;
        if (z) {
            ArrayList arrayList = getProgressDrawable().sjUBp5pO.jb9XjC4I;
            if (arrayList.contains(z1Var)) {
                return;
            }
            arrayList.add(z1Var);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().sjUBp5pO.jb9XjC4I;
        int indexOf = arrayList2.indexOf(z1Var);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.NCTxEWno.Qr9iLBAD = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            wd wdVar = (wd) getCurrentDrawable();
            if (wdVar != null) {
                wdVar.wxUZMvaN(false, false, false);
            }
            super.setIndeterminate(z);
            wd wdVar2 = (wd) getCurrentDrawable();
            if (wdVar2 != null) {
                wdVar2.wxUZMvaN(NCTxEWno(), false, false);
            }
            if ((wdVar2 instanceof sm) && NCTxEWno()) {
                ((sm) wdVar2).sjUBp5pO.sjUBp5pO();
            }
            this.Qr9iLBAD = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.ygLcUYwZ != f) {
            m5Var.ygLcUYwZ = f;
            getIndeterminateDrawable().sjUBp5pO.eVhOlqcC();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof sm) {
            ((wd) drawable).wxUZMvaN(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.eVhOlqcC) {
            m1.sjUBp5pO("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{fn.OnDfzHZD(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.NCTxEWno.VgvYg0wo = iArr;
        getIndeterminateDrawable().sjUBp5pO.eVhOlqcC();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.jb9XjC4I != i) {
            m5Var.jb9XjC4I = i;
            m5Var.NCTxEWno();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        qoPGr6Ce(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof ec) {
            ec ecVar = (ec) drawable;
            ecVar.wxUZMvaN(false, false, false);
            super.setProgressDrawable(ecVar);
            ecVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.eVhOlqcC) {
            m1.sjUBp5pO("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.NCTxEWno.b2ZJblxo = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.P7K7Inc8 != i) {
            m5Var.P7K7Inc8 = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.NCTxEWno != i) {
            m5Var.NCTxEWno = Math.min(i, m5Var.qoPGr6Ce / 2);
            m5Var.wxUZMvaN = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.MdtA4re8 != f) {
            m5Var.MdtA4re8 = Math.min(f, 0.5f);
            m5Var.wxUZMvaN = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.qoPGr6Ce != i) {
            m5Var.qoPGr6Ce = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.jb9XjC4I = i;
        } else {
            m1.sjUBp5pO("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.ow5vqvCr != i) {
            m5Var.ow5vqvCr = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        ec progressDrawable = getProgressDrawable();
        progressDrawable.MdtA4re8.sjUBp5pO = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        ec progressDrawable = getProgressDrawable();
        progressDrawable.MdtA4re8.lDXGDhIF = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        m5 m5Var = this.NCTxEWno;
        m5Var.OnDfzHZD = i;
        ec progressDrawable = getProgressDrawable();
        boolean z = m5Var.OnDfzHZD != 0;
        ValueAnimator valueAnimator = progressDrawable.Ey6iv0m0;
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
        m5 m5Var = this.NCTxEWno;
        if (m5Var.eVhOlqcC != i) {
            m5Var.eVhOlqcC = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        m5 m5Var = this.NCTxEWno;
        if (m5Var.k3x7lurq != i) {
            m5Var.k3x7lurq = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
