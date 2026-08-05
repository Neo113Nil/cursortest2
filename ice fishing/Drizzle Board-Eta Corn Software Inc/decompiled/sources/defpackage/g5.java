package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g5 extends tr implements Drawable.Callback, dc0 {
    public int AxnhUDtd;
    public final PointF B1cjorwa;
    public ColorStateList Bo5Vs0Am;
    public int CIYkyd1d;
    public final RectF CTE3lpUp;
    public final ec0 D4B4MtvK;
    public SpannableStringBuilder ESscZ9M1;
    public boolean FXJmAAN1;
    public boolean FzsqRtM7;
    public float HdOGZAzC;
    public int[] JulN5IwK;
    public Drawable KRabZ4CU;
    public boolean LfKQckgD;
    public gt LvHlPNBd;
    public final Context N2kLh4D5;
    public ColorStateList N8VPGzVC;
    public int NRrvEVSS;
    public boolean QKkyGhhI;
    public float QT4Tf9Dt;
    public int QhQjwNAr;
    public final Paint.FontMetrics S7WAX0X5;
    public final Paint SMax8wMR;
    public gt Sjrx9cEN;
    public int T8ZRPPeH;
    public ColorStateList TrssYQ34;
    public boolean VGmz0ccI;
    public int VZZbw3BB;
    public float VhgXwMj9;
    public float Wi7iiXC4;
    public final Path X1t0wlBd;
    public ColorStateList Xkz7p5xa;
    public float XrPeKzBk;
    public ColorFilter YksF3V7p;
    public int ZLB5OTob;
    public boolean ZyZthT5G;
    public WeakReference a3AMA6yV;
    public float aZz0PFXp;
    public PorterDuff.Mode bA6YQxeu;
    public boolean bvfAo0eO;
    public int d3vfVszL;
    public float dHozS53r;
    public ColorStateList eIA6dogk;
    public float f7oeun2L;
    public float fVMzMhyS;
    public float g2aRJUAd;
    public RippleDrawable gmkaJpmS;
    public float hGvurcGl;
    public ColorStateList hzgxAD8d;
    public PorterDuffColorFilter nJuO6ggC;
    public Drawable nSmgoSB5;
    public float orhfF2Ya;
    public Drawable pP9Y2m6O;
    public ColorStateList pRiPUEwG;
    public TextUtils.TruncateAt rAaHqhFJ;
    public boolean tKaxLBvG;
    public ColorStateList tef3qNMP;
    public float uQ3KJUK5;
    public ColorStateList wkPeYiwH;
    public int yzvmSy3z;
    public CharSequence zCflySGU;
    public static final int[] VM67d7Sv = {R.attr.state_enabled};
    public static final ShapeDrawable LgPefDp5 = new ShapeDrawable(new OvalShape());

    public g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action);
        this.aZz0PFXp = -1.0f;
        this.SMax8wMR = new Paint(1);
        this.S7WAX0X5 = new Paint.FontMetrics();
        this.CTE3lpUp = new RectF();
        this.B1cjorwa = new PointF();
        this.X1t0wlBd = new Path();
        this.NRrvEVSS = 255;
        this.bA6YQxeu = PorterDuff.Mode.SRC_IN;
        this.a3AMA6yV = new WeakReference(null);
        OnDfzHZD(context);
        this.N2kLh4D5 = context;
        ec0 ec0Var = new ec0(this);
        this.D4B4MtvK = ec0Var;
        this.zCflySGU = "";
        ec0Var.qoPGr6Ce.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = VM67d7Sv;
        setState(iArr);
        gmkaJpmS(iArr);
        this.QKkyGhhI = true;
        LgPefDp5.setTint(-1);
    }

    public static void LvHlPNBd(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean Mq3SeTnW(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean euDDoUNr(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void DK9slbsy(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (tef3qNMP() || pP9Y2m6O()) {
            float f = this.hGvurcGl + this.Wi7iiXC4;
            Drawable drawable = this.tKaxLBvG ? this.pP9Y2m6O : this.nSmgoSB5;
            float f2 = this.HdOGZAzC;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.tKaxLBvG ? this.pP9Y2m6O : this.nSmgoSB5;
            float f5 = this.HdOGZAzC;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.N2kLh4D5.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void ESscZ9M1(float f) {
        if (this.QT4Tf9Dt != f) {
            float lwWCatUu = lwWCatUu();
            this.QT4Tf9Dt = f;
            float lwWCatUu2 = lwWCatUu();
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    public final void FXJmAAN1(boolean z) {
        if (this.FXJmAAN1 != z) {
            boolean tef3qNMP = tef3qNMP();
            this.FXJmAAN1 = z;
            boolean tef3qNMP2 = tef3qNMP();
            if (tef3qNMP != tef3qNMP2) {
                Drawable drawable = this.nSmgoSB5;
                if (tef3qNMP2) {
                    WYNAV5pd(drawable);
                } else {
                    LvHlPNBd(drawable);
                }
                invalidateSelf();
                SgZGMMPL();
            }
        }
    }

    public final void HdOGZAzC(Drawable drawable) {
        Drawable drawable2 = this.KRabZ4CU;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float U0LaHZX7 = U0LaHZX7();
            this.KRabZ4CU = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(q30.NCTxEWno(this.hzgxAD8d), this.KRabZ4CU, LgPefDp5);
            FocusRingDrawable.VgvYg0wo(this.N2kLh4D5, rippleDrawable, null);
            this.gmkaJpmS = rippleDrawable;
            float U0LaHZX72 = U0LaHZX7();
            LvHlPNBd(drawable2);
            if (Sjrx9cEN()) {
                WYNAV5pd(this.KRabZ4CU);
            }
            invalidateSelf();
            if (U0LaHZX7 != U0LaHZX72) {
                SgZGMMPL();
            }
        }
    }

    public final void KRabZ4CU(float f) {
        if (this.f7oeun2L != f) {
            this.f7oeun2L = f;
            invalidateSelf();
            if (Sjrx9cEN()) {
                SgZGMMPL();
            }
        }
    }

    public final void LfKQckgD(ColorStateList colorStateList) {
        if (this.hzgxAD8d != colorStateList) {
            this.hzgxAD8d = colorStateList;
            this.wkPeYiwH = null;
            onStateChange(getState());
        }
    }

    public final void N8VPGzVC(float f) {
        if (this.fVMzMhyS != f) {
            this.fVMzMhyS = f;
            this.SMax8wMR.setStrokeWidth(f);
            if (this.FzsqRtM7) {
                this.MdtA4re8.eVhOlqcC = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void SgZGMMPL() {
        f5 f5Var = (f5) this.a3AMA6yV.get();
        if (f5Var != null) {
            Chip chip = (Chip) f5Var;
            chip.NCTxEWno(chip.OxcuoDLp);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean Sjrx9cEN() {
        return this.bvfAo0eO && this.KRabZ4CU != null;
    }

    public final void TrssYQ34(ColorStateList colorStateList) {
        if (this.TrssYQ34 != colorStateList) {
            this.TrssYQ34 = colorStateList;
            if (Sjrx9cEN()) {
                this.KRabZ4CU.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final float U0LaHZX7() {
        if (Sjrx9cEN()) {
            return this.f7oeun2L + this.g2aRJUAd + this.uQ3KJUK5;
        }
        return 0.0f;
    }

    public final void VGmz0ccI(float f) {
        if (this.Wi7iiXC4 != f) {
            float lwWCatUu = lwWCatUu();
            this.Wi7iiXC4 = f;
            float lwWCatUu2 = lwWCatUu();
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    public final void VhgXwMj9(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.tef3qNMP != colorStateList) {
            this.tef3qNMP = colorStateList;
            if (this.LfKQckgD && (drawable = this.pP9Y2m6O) != null && this.VGmz0ccI) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void WYNAV5pd(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.KRabZ4CU) {
            drawable.setTintList(this.TrssYQ34);
            if (drawable.isStateful()) {
                drawable.setState(this.JulN5IwK);
                return;
            }
            return;
        }
        Drawable drawable2 = this.nSmgoSB5;
        if (drawable == drawable2 && this.ZyZthT5G) {
            drawable2.setTintList(this.N8VPGzVC);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void Xkz7p5xa(float f) {
        if (this.aZz0PFXp != f) {
            this.aZz0PFXp = f;
            setShapeAppearanceModel(Qr9iLBAD().qoPGr6Ce(f));
        }
    }

    public final void ZyZthT5G(float f) {
        if (this.uQ3KJUK5 != f) {
            this.uQ3KJUK5 = f;
            invalidateSelf();
            if (Sjrx9cEN()) {
                SgZGMMPL();
            }
        }
    }

    public final void aZz0PFXp(boolean z) {
        if (this.LfKQckgD != z) {
            boolean pP9Y2m6O = pP9Y2m6O();
            this.LfKQckgD = z;
            boolean pP9Y2m6O2 = pP9Y2m6O();
            if (pP9Y2m6O != pP9Y2m6O2) {
                Drawable drawable = this.pP9Y2m6O;
                if (pP9Y2m6O2) {
                    WYNAV5pd(drawable);
                } else {
                    LvHlPNBd(drawable);
                }
                invalidateSelf();
                SgZGMMPL();
            }
        }
    }

    public final void bvfAo0eO(float f) {
        if (this.g2aRJUAd != f) {
            this.g2aRJUAd = f;
            invalidateSelf();
            if (Sjrx9cEN()) {
                SgZGMMPL();
            }
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.NRrvEVSS) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.FzsqRtM7;
        Paint paint = this.SMax8wMR;
        RectF rectF = this.CTE3lpUp;
        if (!z) {
            paint.setColor(this.yzvmSy3z);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, i7xS8jrb(), i7xS8jrb(), paint);
        }
        if (!this.FzsqRtM7) {
            paint.setColor(this.AxnhUDtd);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.YksF3V7p;
            if (colorFilter == null) {
                colorFilter = this.nJuO6ggC;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, i7xS8jrb(), i7xS8jrb(), paint);
        }
        if (this.FzsqRtM7) {
            super.draw(canvas);
        }
        if (this.fVMzMhyS > 0.0f && !this.FzsqRtM7) {
            paint.setColor(this.ZLB5OTob);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.FzsqRtM7) {
                ColorFilter colorFilter2 = this.YksF3V7p;
                if (colorFilter2 == null) {
                    colorFilter2 = this.nJuO6ggC;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.fVMzMhyS / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.aZz0PFXp - (this.fVMzMhyS / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.CIYkyd1d);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.FzsqRtM7) {
            RectF rectF2 = new RectF(bounds);
            t60 wxUZMvaN = this.MdtA4re8.qoPGr6Ce.wxUZMvaN();
            float[] fArr = this.i7xS8jrb;
            float f6 = this.MdtA4re8.jb9XjC4I;
            qr qrVar = this.KlHjfFWx;
            v60 v60Var = this.Ey6iv0m0;
            f = 2.0f;
            Path path = this.X1t0wlBd;
            v60Var.qoPGr6Ce(wxUZMvaN, fArr, f6, rectF2, qrVar, path);
            P7K7Inc8(canvas2, paint, path, this.MdtA4re8.qoPGr6Ce.wxUZMvaN(), this.i7xS8jrb, b2ZJblxo());
        } else {
            canvas2.drawRoundRect(rectF, i7xS8jrb(), i7xS8jrb(), paint);
            f = 2.0f;
        }
        if (tef3qNMP()) {
            DK9slbsy(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.nSmgoSB5.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.nSmgoSB5.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (pP9Y2m6O()) {
            DK9slbsy(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.pP9Y2m6O.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.pP9Y2m6O.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.QKkyGhhI && this.zCflySGU != null) {
            PointF pointF = this.B1cjorwa;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.zCflySGU;
            ec0 ec0Var = this.D4B4MtvK;
            if (charSequence != null) {
                float lwWCatUu = lwWCatUu() + this.hGvurcGl + this.orhfF2Ya;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + lwWCatUu;
                } else {
                    pointF.x = bounds.right - lwWCatUu;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = ec0Var.qoPGr6Ce;
                Paint.FontMetrics fontMetrics = this.S7WAX0X5;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.zCflySGU != null) {
                float lwWCatUu2 = lwWCatUu() + this.hGvurcGl + this.orhfF2Ya;
                float U0LaHZX7 = U0LaHZX7() + this.XrPeKzBk + this.dHozS53r;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + lwWCatUu2;
                    rectF.right = bounds.right - U0LaHZX7;
                } else {
                    rectF.left = i4 + U0LaHZX7;
                    rectF.right = bounds.right - lwWCatUu2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            bc0 bc0Var = ec0Var.b2ZJblxo;
            TextPaint textPaint2 = ec0Var.qoPGr6Ce;
            if (bc0Var != null) {
                textPaint2.drawableState = getState();
                ec0Var.b2ZJblxo.MdtA4re8(this.N2kLh4D5, textPaint2, ec0Var.NCTxEWno);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.zCflySGU.toString();
            if (ec0Var.VgvYg0wo) {
                ec0Var.qoPGr6Ce(charSequence2);
                f2 = ec0Var.MdtA4re8;
            } else {
                f2 = ec0Var.MdtA4re8;
            }
            boolean z2 = Math.round(f2) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.zCflySGU;
            if (z2 && this.rAaHqhFJ != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.rAaHqhFJ);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (Sjrx9cEN()) {
            rectF.setEmpty();
            if (Sjrx9cEN()) {
                float f11 = this.XrPeKzBk + this.uQ3KJUK5;
                if (getLayoutDirection() == 0) {
                    float f12 = bounds.right - f11;
                    rectF.right = f12;
                    rectF.left = f12 - this.g2aRJUAd;
                } else {
                    float f13 = bounds.left + f11;
                    rectF.left = f13;
                    rectF.right = f13 + this.g2aRJUAd;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.g2aRJUAd;
                float f15 = exactCenterY - (f14 / f);
                rectF.top = f15;
                rectF.bottom = f15 + f14;
            }
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.KRabZ4CU.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.gmkaJpmS.setBounds(this.KRabZ4CU.getBounds());
            this.gmkaJpmS.jumpToCurrentState();
            this.gmkaJpmS.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.NRrvEVSS < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final void eIA6dogk(boolean z) {
        if (this.VGmz0ccI != z) {
            this.VGmz0ccI = z;
            float lwWCatUu = lwWCatUu();
            if (!z && this.tKaxLBvG) {
                this.tKaxLBvG = false;
            }
            float lwWCatUu2 = lwWCatUu();
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    public final void fVMzMhyS(Drawable drawable) {
        Drawable drawable2 = this.nSmgoSB5;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float lwWCatUu = lwWCatUu();
            this.nSmgoSB5 = drawable != null ? drawable.mutate() : null;
            float lwWCatUu2 = lwWCatUu();
            LvHlPNBd(drawable2);
            if (tef3qNMP()) {
                WYNAV5pd(this.nSmgoSB5);
            }
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    public final void g2aRJUAd(boolean z) {
        if (this.bvfAo0eO != z) {
            boolean Sjrx9cEN = Sjrx9cEN();
            this.bvfAo0eO = z;
            boolean Sjrx9cEN2 = Sjrx9cEN();
            if (Sjrx9cEN != Sjrx9cEN2) {
                Drawable drawable = this.KRabZ4CU;
                if (Sjrx9cEN2) {
                    WYNAV5pd(drawable);
                } else {
                    LvHlPNBd(drawable);
                }
                invalidateSelf();
                SgZGMMPL();
            }
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.NRrvEVSS;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.YksF3V7p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.VhgXwMj9;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float lwWCatUu = lwWCatUu() + this.hGvurcGl + this.orhfF2Ya;
        String charSequence = this.zCflySGU.toString();
        ec0 ec0Var = this.D4B4MtvK;
        if (ec0Var.VgvYg0wo) {
            ec0Var.qoPGr6Ce(charSequence);
        }
        return Math.min(Math.round(U0LaHZX7() + ec0Var.MdtA4re8 + lwWCatUu + this.dHozS53r + this.XrPeKzBk), this.T8ZRPPeH);
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.FzsqRtM7) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.VhgXwMj9, this.aZz0PFXp);
        } else {
            outline.setRoundRect(bounds, this.aZz0PFXp);
            outline2 = outline;
        }
        outline2.setAlpha(this.NRrvEVSS / 255.0f);
    }

    public final boolean gmkaJpmS(int[] iArr) {
        if (Arrays.equals(this.JulN5IwK, iArr)) {
            return false;
        }
        this.JulN5IwK = iArr;
        if (Sjrx9cEN()) {
            return ytu5o6f4(getState(), iArr);
        }
        return false;
    }

    public final void hzgxAD8d(float f) {
        if (this.HdOGZAzC != f) {
            float lwWCatUu = lwWCatUu();
            this.HdOGZAzC = f;
            float lwWCatUu2 = lwWCatUu();
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    public final float i7xS8jrb() {
        return this.FzsqRtM7 ? eVhOlqcC() : this.aZz0PFXp;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (Mq3SeTnW(this.eIA6dogk) || Mq3SeTnW(this.pRiPUEwG) || Mq3SeTnW(this.Xkz7p5xa)) {
            return true;
        }
        bc0 bc0Var = this.D4B4MtvK.b2ZJblxo;
        if (bc0Var == null || (colorStateList = bc0Var.k3x7lurq) == null || !colorStateList.isStateful()) {
            return (this.LfKQckgD && this.pP9Y2m6O != null && this.VGmz0ccI) || euDDoUNr(this.nSmgoSB5) || euDDoUNr(this.pP9Y2m6O) || Mq3SeTnW(this.Bo5Vs0Am);
        }
        return true;
    }

    public final float lwWCatUu() {
        if (!tef3qNMP() && !pP9Y2m6O()) {
            return 0.0f;
        }
        float f = this.Wi7iiXC4;
        Drawable drawable = this.tKaxLBvG ? this.pP9Y2m6O : this.nSmgoSB5;
        float f2 = this.HdOGZAzC;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.QT4Tf9Dt;
    }

    public final void nSmgoSB5(ColorStateList colorStateList) {
        if (this.Xkz7p5xa != colorStateList) {
            this.Xkz7p5xa = colorStateList;
            if (this.FzsqRtM7) {
                rr rrVar = this.MdtA4re8;
                if (rrVar.wxUZMvaN != colorStateList) {
                    rrVar.wxUZMvaN = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (tef3qNMP()) {
            onLayoutDirectionChanged |= this.nSmgoSB5.setLayoutDirection(i);
        }
        if (pP9Y2m6O()) {
            onLayoutDirectionChanged |= this.pP9Y2m6O.setLayoutDirection(i);
        }
        if (Sjrx9cEN()) {
            onLayoutDirectionChanged |= this.KRabZ4CU.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (tef3qNMP()) {
            onLevelChange |= this.nSmgoSB5.setLevel(i);
        }
        if (pP9Y2m6O()) {
            onLevelChange |= this.pP9Y2m6O.setLevel(i);
        }
        if (Sjrx9cEN()) {
            onLevelChange |= this.KRabZ4CU.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable, defpackage.dc0
    public final boolean onStateChange(int[] iArr) {
        if (this.FzsqRtM7) {
            super.onStateChange(iArr);
        }
        return ytu5o6f4(iArr, this.JulN5IwK);
    }

    public final boolean pP9Y2m6O() {
        return this.LfKQckgD && this.pP9Y2m6O != null && this.tKaxLBvG;
    }

    public final void pRiPUEwG(Drawable drawable) {
        if (this.pP9Y2m6O != drawable) {
            float lwWCatUu = lwWCatUu();
            this.pP9Y2m6O = drawable;
            float lwWCatUu2 = lwWCatUu();
            LvHlPNBd(this.pP9Y2m6O);
            WYNAV5pd(this.pP9Y2m6O);
            invalidateSelf();
            if (lwWCatUu != lwWCatUu2) {
                SgZGMMPL();
            }
        }
    }

    @Override // defpackage.dc0
    public final void qoPGr6Ce() {
        SgZGMMPL();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.NRrvEVSS != i) {
            this.NRrvEVSS = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.YksF3V7p != colorFilter) {
            this.YksF3V7p = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Bo5Vs0Am != colorStateList) {
            this.Bo5Vs0Am = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.tr, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.bA6YQxeu != mode) {
            this.bA6YQxeu = mode;
            ColorStateList colorStateList = this.Bo5Vs0Am;
            this.nJuO6ggC = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (tef3qNMP()) {
            visible |= this.nSmgoSB5.setVisible(z, z2);
        }
        if (pP9Y2m6O()) {
            visible |= this.pP9Y2m6O.setVisible(z, z2);
        }
        if (Sjrx9cEN()) {
            visible |= this.KRabZ4CU.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean tef3qNMP() {
        return this.FXJmAAN1 && this.nSmgoSB5 != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ytu5o6f4(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.eIA6dogk;
        int wxUZMvaN = wxUZMvaN(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.yzvmSy3z) : 0);
        boolean z3 = true;
        if (this.yzvmSy3z != wxUZMvaN) {
            this.yzvmSy3z = wxUZMvaN;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.pRiPUEwG;
        int wxUZMvaN2 = wxUZMvaN(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.AxnhUDtd) : 0);
        if (this.AxnhUDtd != wxUZMvaN2) {
            this.AxnhUDtd = wxUZMvaN2;
            onStateChange = true;
        }
        int NCTxEWno = g6.NCTxEWno(wxUZMvaN2, wxUZMvaN);
        if ((this.d3vfVszL != NCTxEWno) | (this.MdtA4re8.MdtA4re8 == null)) {
            this.d3vfVszL = NCTxEWno;
            OxcuoDLp(ColorStateList.valueOf(NCTxEWno));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.Xkz7p5xa;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ZLB5OTob) : 0;
        if (this.ZLB5OTob != colorForState3) {
            this.ZLB5OTob = colorForState3;
            onStateChange = true;
        }
        if (this.wkPeYiwH != null) {
            int[] iArr3 = q30.qoPGr6Ce;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.wkPeYiwH.getColorForState(iArr, this.CIYkyd1d);
                if (this.CIYkyd1d != i) {
                    this.CIYkyd1d = i;
                }
                bc0 bc0Var = this.D4B4MtvK.b2ZJblxo;
                colorForState = (bc0Var != null || (colorStateList = bc0Var.k3x7lurq) == null) ? 0 : colorStateList.getColorForState(iArr, this.VZZbw3BB);
                if (this.VZZbw3BB != colorForState) {
                    this.VZZbw3BB = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.VGmz0ccI) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.tKaxLBvG != z || this.pP9Y2m6O == null) {
                    z2 = false;
                } else {
                    float lwWCatUu = lwWCatUu();
                    this.tKaxLBvG = z;
                    if (lwWCatUu != lwWCatUu()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.Bo5Vs0Am;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.QhQjwNAr) : 0;
                if (this.QhQjwNAr == colorForState2) {
                    this.QhQjwNAr = colorForState2;
                    ColorStateList colorStateList6 = this.Bo5Vs0Am;
                    PorterDuff.Mode mode = this.bA6YQxeu;
                    this.nJuO6ggC = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (euDDoUNr(this.nSmgoSB5)) {
                    z3 |= this.nSmgoSB5.setState(iArr);
                }
                if (euDDoUNr(this.pP9Y2m6O)) {
                    z3 |= this.pP9Y2m6O.setState(iArr);
                }
                if (euDDoUNr(this.KRabZ4CU)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z3 |= this.KRabZ4CU.setState(iArr4);
                }
                if (euDDoUNr(this.gmkaJpmS)) {
                    z3 |= this.gmkaJpmS.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    SgZGMMPL();
                }
                return z3;
            }
        }
        i = 0;
        if (this.CIYkyd1d != i) {
        }
        bc0 bc0Var2 = this.D4B4MtvK.b2ZJblxo;
        if (bc0Var2 != null) {
        }
        if (this.VZZbw3BB != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.tKaxLBvG != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.Bo5Vs0Am;
        if (colorStateList52 == null) {
        }
        if (this.QhQjwNAr == colorForState2) {
        }
        if (euDDoUNr(this.nSmgoSB5)) {
        }
        if (euDDoUNr(this.pP9Y2m6O)) {
        }
        if (euDDoUNr(this.KRabZ4CU)) {
        }
        if (euDDoUNr(this.gmkaJpmS)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void zCflySGU(ColorStateList colorStateList) {
        this.ZyZthT5G = true;
        if (this.N8VPGzVC != colorStateList) {
            this.N8VPGzVC = colorStateList;
            if (tef3qNMP()) {
                this.nSmgoSB5.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
