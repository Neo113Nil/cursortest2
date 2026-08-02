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
import com.google.android.material.chip.Chip;
import com.google.android.material.shape.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class qj4 extends a implements Drawable.Callback, kas {
    public static final int[] v1 = {R.attr.state_enabled};
    public static final ShapeDrawable w1 = new ShapeDrawable(new OvalShape());
    public boolean A0;
    public Drawable B0;
    public RippleDrawable C0;
    public ColorStateList D0;
    public float E0;
    public SpannableStringBuilder F0;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public ColorStateList I;
    public Drawable I0;
    public float J;
    public ColorStateList J0;
    public float K;
    public zei K0;
    public ColorStateList L;
    public zei L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public final Context U0;
    public final Paint V0;
    public final Paint.FontMetrics W0;
    public float X;
    public final RectF X0;
    public ColorStateList Y;
    public final PointF Y0;
    public CharSequence Z;
    public final Path Z0;
    public final las a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public boolean h1;
    public int i1;
    public int j1;
    public ColorFilter k1;
    public PorterDuffColorFilter l1;
    public ColorStateList m1;
    public PorterDuff.Mode n1;
    public int[] o1;
    public ColorStateList p1;
    public WeakReference q1;
    public TextUtils.TruncateAt r1;
    public boolean s1;
    public int t1;
    public boolean u1;
    public boolean v0;
    public Drawable w0;
    public ColorStateList x0;
    public float y0;
    public boolean z0;

    public qj4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = -1.0f;
        this.V0 = new Paint(1);
        this.W0 = new Paint.FontMetrics();
        this.X0 = new RectF();
        this.Y0 = new PointF();
        this.Z0 = new Path();
        this.j1 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.n1 = PorterDuff.Mode.SRC_IN;
        this.q1 = new WeakReference(null);
        n(context);
        this.U0 = context;
        las lasVar = new las(this);
        this.a1 = lasVar;
        this.Z = "";
        lasVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = v1;
        setState(iArr);
        a0(iArr);
        this.s1 = true;
        w1.setTint(-1);
    }

    public static boolean H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void j0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void C(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.B0) {
            if (drawable.isStateful()) {
                drawable.setState(this.o1);
            }
            drawable.setTintList(this.D0);
            return;
        }
        Drawable drawable2 = this.w0;
        if (drawable == drawable2 && this.z0) {
            drawable2.setTintList(this.x0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (h0() || g0()) {
            float f = this.M0 + this.N0;
            Drawable drawable = this.h1 ? this.I0 : this.w0;
            float f2 = this.y0;
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
            Drawable drawable2 = this.h1 ? this.I0 : this.w0;
            float f5 = this.y0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(fxf.x(this.U0, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float E() {
        if (!h0() && !g0()) {
            return 0.0f;
        }
        float f = this.N0;
        Drawable drawable = this.h1 ? this.I0 : this.w0;
        float f2 = this.y0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.O0;
    }

    public final float F() {
        if (i0()) {
            return this.R0 + this.E0 + this.S0;
        }
        return 0.0f;
    }

    public final float G() {
        return this.u1 ? l() : this.K;
    }

    public final void J() {
        Chip chip = (Chip) this.q1.get();
        if (chip != null) {
            chip.c(chip.q);
            chip.requestLayout();
            chip.invalidateOutline();
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
    public final boolean K(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.H;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.b1) : 0);
        boolean z3 = true;
        if (this.b1 != d) {
            this.b1 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.I;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.c1) : 0);
        if (this.c1 != d2) {
            this.c1 = d2;
            onStateChange = true;
        }
        int i2 = aa5.i(d2, d);
        if ((this.d1 != i2) | (this.b.d == null)) {
            this.d1 = i2;
            r(ColorStateList.valueOf(i2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.L;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.e1) : 0;
        if (this.e1 != colorForState3) {
            this.e1 = colorForState3;
            onStateChange = true;
        }
        if (this.p1 != null) {
            int[] iArr3 = leo.a;
            boolean z4 = false;
            boolean z5 = false;
            for (int i3 : iArr) {
                if (i3 == 16842910) {
                    z4 = true;
                } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.p1.getColorForState(iArr, this.f1);
                if (this.f1 != i) {
                    this.f1 = i;
                }
                x9s x9sVar = this.a1.g;
                colorForState = (x9sVar != null || (colorStateList = x9sVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.g1);
                if (this.g1 != colorForState) {
                    this.g1 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (state[i4] != 16842912) {
                            i4++;
                        } else if (this.G0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.h1 != z || this.I0 == null) {
                    z2 = false;
                } else {
                    float E = E();
                    this.h1 = z;
                    if (E != E()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.m1;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.i1) : 0;
                if (this.i1 == colorForState2) {
                    this.i1 = colorForState2;
                    ColorStateList colorStateList6 = this.m1;
                    PorterDuff.Mode mode = this.n1;
                    this.l1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (I(this.w0)) {
                    z3 |= this.w0.setState(iArr);
                }
                if (I(this.I0)) {
                    z3 |= this.I0.setState(iArr);
                }
                if (I(this.B0)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z3 |= this.B0.setState(iArr4);
                }
                if (I(this.C0)) {
                    z3 |= this.C0.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    J();
                }
                return z3;
            }
        }
        i = 0;
        if (this.f1 != i) {
        }
        x9s x9sVar2 = this.a1.g;
        if (x9sVar2 != null) {
        }
        if (this.g1 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.h1 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.m1;
        if (colorStateList52 == null) {
        }
        if (this.i1 == colorForState2) {
        }
        if (I(this.w0)) {
        }
        if (I(this.I0)) {
        }
        if (I(this.B0)) {
        }
        if (I(this.C0)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void L(boolean z) {
        if (this.G0 != z) {
            this.G0 = z;
            float E = E();
            if (!z && this.h1) {
                this.h1 = false;
            }
            float E2 = E();
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    public final void M(Drawable drawable) {
        if (this.I0 != drawable) {
            float E = E();
            this.I0 = drawable;
            float E2 = E();
            j0(this.I0);
            C(this.I0);
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            if (this.H0 && (drawable = this.I0) != null && this.G0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.H0 != z) {
            boolean g0 = g0();
            this.H0 = z;
            boolean g02 = g0();
            if (g0 != g02) {
                Drawable drawable = this.I0;
                if (g02) {
                    C(drawable);
                } else {
                    j0(drawable);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final void P(float f) {
        if (this.K != f) {
            this.K = f;
            setShapeAppearanceModel(this.b.a.i(f));
        }
    }

    public final void Q(Drawable drawable) {
        Drawable drawable2 = this.w0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float E = E();
            this.w0 = drawable != null ? drawable.mutate() : null;
            float E2 = E();
            j0(drawable2);
            if (h0()) {
                C(this.w0);
            }
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    public final void R(float f) {
        if (this.y0 != f) {
            float E = E();
            this.y0 = f;
            float E2 = E();
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        this.z0 = true;
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            if (h0()) {
                this.w0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.v0 != z) {
            boolean h0 = h0();
            this.v0 = z;
            boolean h02 = h0();
            if (h0 != h02) {
                Drawable drawable = this.w0;
                if (h02) {
                    C(drawable);
                } else {
                    j0(drawable);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.u1) {
                x(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(float f) {
        if (this.X != f) {
            this.X = f;
            this.V0.setStrokeWidth(f);
            if (this.u1) {
                this.b.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void W(Drawable drawable) {
        Drawable drawable2 = this.B0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float F = F();
            this.B0 = drawable != null ? drawable.mutate() : null;
            this.C0 = new RippleDrawable(leo.b(this.Y), this.B0, w1);
            float F2 = F();
            j0(drawable2);
            if (i0()) {
                C(this.B0);
            }
            invalidateSelf();
            if (F != F2) {
                J();
            }
        }
    }

    public final void X(float f) {
        if (this.S0 != f) {
            this.S0 = f;
            invalidateSelf();
            if (i0()) {
                J();
            }
        }
    }

    public final void Y(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            invalidateSelf();
            if (i0()) {
                J();
            }
        }
    }

    public final void Z(float f) {
        if (this.R0 != f) {
            this.R0 = f;
            invalidateSelf();
            if (i0()) {
                J();
            }
        }
    }

    @Override // defpackage.kas
    public final void a() {
        J();
        invalidateSelf();
    }

    public final boolean a0(int[] iArr) {
        if (Arrays.equals(this.o1, iArr)) {
            return false;
        }
        this.o1 = iArr;
        if (i0()) {
            return K(getState(), iArr);
        }
        return false;
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            if (i0()) {
                this.B0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void c0(boolean z) {
        if (this.A0 != z) {
            boolean i0 = i0();
            this.A0 = z;
            boolean i02 = i0();
            if (i0 != i02) {
                Drawable drawable = this.B0;
                if (i02) {
                    C(drawable);
                } else {
                    j0(drawable);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final void d0(float f) {
        if (this.O0 != f) {
            float E = E();
            this.O0 = f;
            float E2 = E();
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.j1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.u1;
        Paint paint = this.V0;
        RectF rectF = this.X0;
        if (!z) {
            paint.setColor(this.b1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, G(), G(), paint);
        }
        if (!this.u1) {
            paint.setColor(this.c1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.k1;
            if (colorFilter == null) {
                colorFilter = this.l1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, G(), G(), paint);
        }
        if (this.u1) {
            super.draw(canvas);
        }
        if (this.X > 0.0f && !this.u1) {
            paint.setColor(this.e1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.u1) {
                ColorFilter colorFilter2 = this.k1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.l1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.X / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.K - (this.X / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.f1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.u1) {
            RectF rectF2 = new RectF(bounds);
            mdh mdhVar = this.b;
            eup eupVar = mdhVar.a;
            float[] fArr = this.C;
            float f6 = mdhVar.j;
            qec qecVar = this.r;
            nwh nwhVar = this.s;
            f = 2.0f;
            Path path = this.Z0;
            nwhVar.e(eupVar, fArr, f6, rectF2, qecVar, path);
            f(canvas2, paint, path, this.b.a, this.C, h());
        } else {
            canvas2.drawRoundRect(rectF, G(), G(), paint);
            f = 2.0f;
        }
        if (h0()) {
            D(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.w0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.w0.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (g0()) {
            D(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.I0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.I0.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.s1 && this.Z != null) {
            PointF pointF = this.Y0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Z;
            las lasVar = this.a1;
            if (charSequence != null) {
                float E = E() + this.M0 + this.P0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + E;
                } else {
                    pointF.x = bounds.right - E;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = lasVar.a;
                Paint.FontMetrics fontMetrics = this.W0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.Z != null) {
                float E2 = E() + this.M0 + this.P0;
                float F = F() + this.T0 + this.Q0;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + E2;
                    rectF.right = bounds.right - F;
                } else {
                    rectF.left = i4 + F;
                    rectF.right = bounds.right - E2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            x9s x9sVar = lasVar.g;
            TextPaint textPaint2 = lasVar.a;
            if (x9sVar != null) {
                textPaint2.drawableState = getState();
                lasVar.g.d(this.U0, textPaint2, lasVar.b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.Z.toString();
            if (lasVar.e) {
                lasVar.a(charSequence2);
                f2 = lasVar.c;
            } else {
                f2 = lasVar.c;
            }
            boolean z2 = Math.round(f2) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.Z;
            if (z2 && this.r1 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.r1);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (i0()) {
            rectF.setEmpty();
            if (i0()) {
                float f11 = this.T0 + this.S0;
                if (getLayoutDirection() == 0) {
                    float f12 = bounds.right - f11;
                    rectF.right = f12;
                    rectF.left = f12 - this.E0;
                } else {
                    float f13 = bounds.left + f11;
                    rectF.left = f13;
                    rectF.right = f13 + this.E0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.E0;
                float f15 = exactCenterY - (f14 / f);
                rectF.top = f15;
                rectF.bottom = f15 + f14;
            }
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.B0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.C0.setBounds(this.B0.getBounds());
            this.C0.jumpToCurrentState();
            this.C0.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.j1 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final void e0(float f) {
        if (this.N0 != f) {
            float E = E();
            this.N0 = f;
            float E2 = E();
            invalidateSelf();
            if (E != E2) {
                J();
            }
        }
    }

    public final void f0(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            this.p1 = null;
            onStateChange(getState());
        }
    }

    public final boolean g0() {
        return this.H0 && this.I0 != null && this.h1;
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.k1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float E = E() + this.M0 + this.P0;
        String charSequence = this.Z.toString();
        las lasVar = this.a1;
        if (lasVar.e) {
            lasVar.a(charSequence);
        }
        return Math.min(Math.round(F() + lasVar.c + E + this.Q0 + this.T0), this.t1);
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.u1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        } else {
            outline.setRoundRect(bounds, this.K);
            outline2 = outline;
        }
        outline2.setAlpha(this.j1 / 255.0f);
    }

    public final boolean h0() {
        return this.v0 && this.w0 != null;
    }

    public final boolean i0() {
        return this.A0 && this.B0 != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (H(this.H) || H(this.I) || H(this.L)) {
            return true;
        }
        x9s x9sVar = this.a1.g;
        if (x9sVar == null || (colorStateList = x9sVar.k) == null || !colorStateList.isStateful()) {
            return (this.H0 && this.I0 != null && this.G0) || I(this.w0) || I(this.I0) || H(this.m1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (h0()) {
            onLayoutDirectionChanged |= this.w0.setLayoutDirection(i);
        }
        if (g0()) {
            onLayoutDirectionChanged |= this.I0.setLayoutDirection(i);
        }
        if (i0()) {
            onLayoutDirectionChanged |= this.B0.setLayoutDirection(i);
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
        if (h0()) {
            onLevelChange |= this.w0.setLevel(i);
        }
        if (g0()) {
            onLevelChange |= this.I0.setLevel(i);
        }
        if (i0()) {
            onLevelChange |= this.B0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.u1) {
            super.onStateChange(iArr);
        }
        return K(iArr, this.o1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.j1 != i) {
            this.j1 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.k1 != colorFilter) {
            this.k1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.m1 != colorStateList) {
            this.m1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.a, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.n1 != mode) {
            this.n1 = mode;
            ColorStateList colorStateList = this.m1;
            this.l1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (h0()) {
            visible |= this.w0.setVisible(z, z2);
        }
        if (g0()) {
            visible |= this.I0.setVisible(z, z2);
        }
        if (i0()) {
            visible |= this.B0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
