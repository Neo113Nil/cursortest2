package r3;

import C3.g;
import C3.j;
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
import com.anythink.basead.exoplayer.k.p;
import com.google.android.material.chip.Chip;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import w3.InterfaceC5169h;
import w3.i;
import z3.C5277d;

/* renamed from: r3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963f extends g implements Drawable.Callback, InterfaceC5169h {

    /* renamed from: l1, reason: collision with root package name */
    public static final int[] f40286l1 = {R.attr.state_enabled};

    /* renamed from: m1, reason: collision with root package name */
    public static final ShapeDrawable f40287m1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public j3.b f40288A0;

    /* renamed from: B0, reason: collision with root package name */
    public j3.b f40289B0;
    public float C0;

    /* renamed from: D0, reason: collision with root package name */
    public float f40290D0;

    /* renamed from: E0, reason: collision with root package name */
    public float f40291E0;

    /* renamed from: F0, reason: collision with root package name */
    public float f40292F0;

    /* renamed from: G0, reason: collision with root package name */
    public float f40293G0;

    /* renamed from: H0, reason: collision with root package name */
    public float f40294H0;

    /* renamed from: I0, reason: collision with root package name */
    public float f40295I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f40296J0;

    /* renamed from: K0, reason: collision with root package name */
    public final Context f40297K0;

    /* renamed from: L0, reason: collision with root package name */
    public final Paint f40298L0;

    /* renamed from: M0, reason: collision with root package name */
    public final Paint.FontMetrics f40299M0;

    /* renamed from: N0, reason: collision with root package name */
    public final RectF f40300N0;

    /* renamed from: O0, reason: collision with root package name */
    public final PointF f40301O0;

    /* renamed from: P0, reason: collision with root package name */
    public final Path f40302P0;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f40303Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final i f40304Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f40305R;

    /* renamed from: R0, reason: collision with root package name */
    public int f40306R0;

    /* renamed from: S, reason: collision with root package name */
    public float f40307S;

    /* renamed from: S0, reason: collision with root package name */
    public int f40308S0;

    /* renamed from: T, reason: collision with root package name */
    public float f40309T;

    /* renamed from: T0, reason: collision with root package name */
    public int f40310T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f40311U;

    /* renamed from: U0, reason: collision with root package name */
    public int f40312U0;

    /* renamed from: V, reason: collision with root package name */
    public float f40313V;

    /* renamed from: V0, reason: collision with root package name */
    public int f40314V0;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f40315W;

    /* renamed from: W0, reason: collision with root package name */
    public int f40316W0;

    /* renamed from: X, reason: collision with root package name */
    public CharSequence f40317X;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f40318X0;
    public boolean Y;

    /* renamed from: Y0, reason: collision with root package name */
    public int f40319Y0;

    /* renamed from: Z, reason: collision with root package name */
    public Drawable f40320Z;

    /* renamed from: Z0, reason: collision with root package name */
    public int f40321Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ColorFilter f40322a1;

    /* renamed from: b1, reason: collision with root package name */
    public PorterDuffColorFilter f40323b1;

    /* renamed from: c1, reason: collision with root package name */
    public ColorStateList f40324c1;

    /* renamed from: d1, reason: collision with root package name */
    public PorterDuff.Mode f40325d1;

    /* renamed from: e1, reason: collision with root package name */
    public int[] f40326e1;

    /* renamed from: f1, reason: collision with root package name */
    public ColorStateList f40327f1;

    /* renamed from: g1, reason: collision with root package name */
    public WeakReference f40328g1;

    /* renamed from: h1, reason: collision with root package name */
    public TextUtils.TruncateAt f40329h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f40330i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f40331j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f40332k1;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f40333n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f40334o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f40335p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f40336q0;

    /* renamed from: r0, reason: collision with root package name */
    public Drawable f40337r0;

    /* renamed from: s0, reason: collision with root package name */
    public RippleDrawable f40338s0;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f40339t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f40340u0;

    /* renamed from: v0, reason: collision with root package name */
    public SpannableStringBuilder f40341v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f40342w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f40343x0;

    /* renamed from: y0, reason: collision with root package name */
    public Drawable f40344y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f40345z0;

    public C4963f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.chipStyle, C5284R.style.Widget_MaterialComponents_Chip_Action);
        this.f40309T = -1.0f;
        this.f40298L0 = new Paint(1);
        this.f40299M0 = new Paint.FontMetrics();
        this.f40300N0 = new RectF();
        this.f40301O0 = new PointF();
        this.f40302P0 = new Path();
        this.f40321Z0 = p.f8630b;
        this.f40325d1 = PorterDuff.Mode.SRC_IN;
        this.f40328g1 = new WeakReference(null);
        h(context);
        this.f40297K0 = context;
        i iVar = new i(this);
        this.f40304Q0 = iVar;
        this.f40317X = "";
        iVar.f41667a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f40286l1;
        setState(iArr);
        if (!Arrays.equals(this.f40326e1, iArr)) {
            this.f40326e1 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f40330i1 = true;
        int[] iArr2 = A3.a.f35a;
        f40287m1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f6) {
        if (this.f40309T != f6) {
            this.f40309T = f6;
            j e6 = this.f413n.f383a.e();
            e6.f425e = new C3.a(f6);
            e6.f426f = new C3.a(f6);
            e6.f427g = new C3.a(f6);
            e6.f428h = new C3.a(f6);
            setShapeAppearanceModel(e6.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f40320Z;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z8) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p6 = p();
            this.f40320Z = drawable != null ? drawable.mutate() : null;
            float p9 = p();
            U(drawable2);
            if (S()) {
                n(this.f40320Z);
            }
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void C(float f6) {
        if (this.f40334o0 != f6) {
            float p6 = p();
            this.f40334o0 = f6;
            float p9 = p();
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f40335p0 = true;
        if (this.f40333n0 != colorStateList) {
            this.f40333n0 = colorStateList;
            if (S()) {
                H.a.h(this.f40320Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z8) {
        if (this.Y != z8) {
            boolean S8 = S();
            this.Y = z8;
            boolean S9 = S();
            if (S8 != S9) {
                if (S9) {
                    n(this.f40320Z);
                } else {
                    U(this.f40320Z);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f40311U != colorStateList) {
            this.f40311U = colorStateList;
            if (this.f40332k1) {
                C3.f fVar = this.f413n;
                if (fVar.f386d != colorStateList) {
                    fVar.f386d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f6) {
        if (this.f40313V != f6) {
            this.f40313V = f6;
            this.f40298L0.setStrokeWidth(f6);
            if (this.f40332k1) {
                this.f413n.f391j = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f40337r0;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z8) {
            }
            if (drawable2 == drawable) {
                float q6 = q();
                this.f40337r0 = drawable != null ? drawable.mutate() : null;
                int[] iArr = A3.a.f35a;
                this.f40338s0 = new RippleDrawable(A3.a.a(this.f40315W), this.f40337r0, f40287m1);
                float q9 = q();
                U(drawable2);
                if (T()) {
                    n(this.f40337r0);
                }
                invalidateSelf();
                if (q6 != q9) {
                    u();
                    return;
                }
                return;
            }
            return;
        }
        drawable2 = null;
        if (drawable2 == drawable) {
        }
    }

    public final void I(float f6) {
        if (this.f40295I0 != f6) {
            this.f40295I0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f6) {
        if (this.f40340u0 != f6) {
            this.f40340u0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f6) {
        if (this.f40294H0 != f6) {
            this.f40294H0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f40339t0 != colorStateList) {
            this.f40339t0 = colorStateList;
            if (T()) {
                H.a.h(this.f40337r0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z8) {
        if (this.f40336q0 != z8) {
            boolean T8 = T();
            this.f40336q0 = z8;
            boolean T9 = T();
            if (T8 != T9) {
                if (T9) {
                    n(this.f40337r0);
                } else {
                    U(this.f40337r0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f6) {
        if (this.f40291E0 != f6) {
            float p6 = p();
            this.f40291E0 = f6;
            float p9 = p();
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void O(float f6) {
        if (this.f40290D0 != f6) {
            float p6 = p();
            this.f40290D0 = f6;
            float p9 = p();
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f40315W != colorStateList) {
            this.f40315W = colorStateList;
            this.f40327f1 = null;
            onStateChange(getState());
        }
    }

    public final void Q(C5277d c5277d) {
        i iVar = this.f40304Q0;
        if (iVar.f41672f != c5277d) {
            iVar.f41672f = c5277d;
            if (c5277d != null) {
                TextPaint textPaint = iVar.f41667a;
                Context context = this.f40297K0;
                C4959b c4959b = iVar.f41668b;
                c5277d.f(context, textPaint, c4959b);
                InterfaceC5169h interfaceC5169h = (InterfaceC5169h) iVar.f41671e.get();
                if (interfaceC5169h != null) {
                    textPaint.drawableState = interfaceC5169h.getState();
                }
                c5277d.e(context, textPaint, c4959b);
                iVar.f41670d = true;
            }
            InterfaceC5169h interfaceC5169h2 = (InterfaceC5169h) iVar.f41671e.get();
            if (interfaceC5169h2 != null) {
                C4963f c4963f = (C4963f) interfaceC5169h2;
                c4963f.u();
                c4963f.invalidateSelf();
                c4963f.onStateChange(interfaceC5169h2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f40343x0 && this.f40344y0 != null && this.f40318X0;
    }

    public final boolean S() {
        return this.Y && this.f40320Z != null;
    }

    public final boolean T() {
        return this.f40336q0 && this.f40337r0 != null;
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i4;
        int i9;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f40321Z0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i4 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i4 = 0;
        }
        boolean z8 = this.f40332k1;
        Paint paint = this.f40298L0;
        RectF rectF = this.f40300N0;
        if (!z8) {
            paint.setColor(this.f40306R0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f40332k1) {
            paint.setColor(this.f40308S0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f40322a1;
            if (colorFilter == null) {
                colorFilter = this.f40323b1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f40332k1) {
            super.draw(canvas);
        }
        if (this.f40313V > 0.0f && !this.f40332k1) {
            paint.setColor(this.f40312U0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f40332k1) {
                ColorFilter colorFilter2 = this.f40322a1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f40323b1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = bounds.left;
            float f9 = this.f40313V / 2.0f;
            rectF.set(f6 + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
            float f10 = this.f40309T - (this.f40313V / 2.0f);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
        }
        paint.setColor(this.f40314V0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f40332k1) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f40302P0;
            C3.f fVar = this.f413n;
            this.f408K.a(fVar.f383a, fVar.i, rectF2, this.J, path);
            d(canvas2, paint, path, this.f413n.f383a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f40320Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f40320Z.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (R()) {
            o(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f40344y0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f40344y0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f40330i1 && this.f40317X != null) {
            PointF pointF = this.f40301O0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f40317X;
            i iVar = this.f40304Q0;
            if (charSequence != null) {
                float p6 = p() + this.C0 + this.f40292F0;
                if (H.b.a(this) == 0) {
                    pointF.x = bounds.left + p6;
                } else {
                    pointF.x = bounds.right - p6;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f41667a;
                Paint.FontMetrics fontMetrics = this.f40299M0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f40317X != null) {
                float p9 = p() + this.C0 + this.f40292F0;
                float q6 = q() + this.f40296J0 + this.f40293G0;
                if (H.b.a(this) == 0) {
                    rectF.left = bounds.left + p9;
                    rectF.right = bounds.right - q6;
                } else {
                    rectF.left = bounds.left + q6;
                    rectF.right = bounds.right - p9;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C5277d c5277d = iVar.f41672f;
            TextPaint textPaint2 = iVar.f41667a;
            if (c5277d != null) {
                textPaint2.drawableState = getState();
                iVar.f41672f.e(this.f40297K0, textPaint2, iVar.f41668b);
            }
            textPaint2.setTextAlign(align);
            boolean z9 = Math.round(iVar.a(this.f40317X.toString())) > Math.round(rectF.width());
            if (z9) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i9 = save;
            } else {
                i9 = 0;
            }
            CharSequence charSequence2 = this.f40317X;
            if (z9 && this.f40329h1 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f40329h1);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z9) {
                canvas2.restoreToCount(i9);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f15 = this.f40296J0 + this.f40295I0;
                if (H.b.a(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f40340u0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f40340u0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f18 = this.f40340u0;
                float f19 = exactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas2.translate(f20, f21);
            this.f40337r0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = A3.a.f35a;
            this.f40338s0.setBounds(this.f40337r0.getBounds());
            this.f40338s0.jumpToCurrentState();
            this.f40338s0.draw(canvas2);
            canvas2.translate(-f20, -f21);
        }
        if (this.f40321Z0 < 255) {
            canvas2.restoreToCount(i4);
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40321Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f40322a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f40307S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f40304Q0.a(this.f40317X.toString()) + p() + this.C0 + this.f40292F0 + this.f40293G0 + this.f40296J0), this.f40331j1);
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f40332k1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f40307S, this.f40309T);
        } else {
            outline.setRoundRect(bounds, this.f40309T);
            outline2 = outline;
        }
        outline2.setAlpha(this.f40321Z0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f40303Q) || s(this.f40305R) || s(this.f40311U)) {
            return true;
        }
        C5277d c5277d = this.f40304Q0.f41672f;
        if (c5277d == null || (colorStateList = c5277d.f42171j) == null || !colorStateList.isStateful()) {
            return (this.f40343x0 && this.f40344y0 != null && this.f40342w0) || t(this.f40320Z) || t(this.f40344y0) || s(this.f40324c1);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        H.b.b(drawable, H.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f40337r0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f40326e1);
            }
            H.a.h(drawable, this.f40339t0);
            return;
        }
        Drawable drawable2 = this.f40320Z;
        if (drawable == drawable2 && this.f40335p0) {
            H.a.h(drawable2, this.f40333n0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f6 = this.C0 + this.f40290D0;
            Drawable drawable = this.f40318X0 ? this.f40344y0 : this.f40320Z;
            float f9 = this.f40334o0;
            if (f9 <= 0.0f && drawable != null) {
                f9 = drawable.getIntrinsicWidth();
            }
            if (H.b.a(this) == 0) {
                float f10 = rect.left + f6;
                rectF.left = f10;
                rectF.right = f10 + f9;
            } else {
                float f11 = rect.right - f6;
                rectF.right = f11;
                rectF.left = f11 - f9;
            }
            Drawable drawable2 = this.f40318X0 ? this.f40344y0 : this.f40320Z;
            float f12 = this.f40334o0;
            if (f12 <= 0.0f && drawable2 != null) {
                f12 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f40297K0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f12) {
                    f12 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f12;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= H.b.b(this.f40320Z, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= H.b.b(this.f40344y0, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= H.b.b(this.f40337r0, i);
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
        if (S()) {
            onLevelChange |= this.f40320Z.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f40344y0.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f40337r0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f40332k1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f40326e1);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f6 = this.f40290D0;
        Drawable drawable = this.f40318X0 ? this.f40344y0 : this.f40320Z;
        float f9 = this.f40334o0;
        if (f9 <= 0.0f && drawable != null) {
            f9 = drawable.getIntrinsicWidth();
        }
        return f9 + f6 + this.f40291E0;
    }

    public final float q() {
        if (T()) {
            return this.f40294H0 + this.f40340u0 + this.f40295I0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f40332k1 ? this.f413n.f383a.f436e.a(f()) : this.f40309T;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j9);
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f40321Z0 != i) {
            this.f40321Z0 = i;
            invalidateSelf();
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f40322a1 != colorFilter) {
            this.f40322a1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f40324c1 != colorStateList) {
            this.f40324c1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // C3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f40325d1 != mode) {
            this.f40325d1 = mode;
            ColorStateList colorStateList = this.f40324c1;
            this.f40323b1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (S()) {
            visible |= this.f40320Z.setVisible(z8, z9);
        }
        if (R()) {
            visible |= this.f40344y0.setVisible(z8, z9);
        }
        if (T()) {
            visible |= this.f40337r0.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC4962e interfaceC4962e = (InterfaceC4962e) this.f40328g1.get();
        if (interfaceC4962e != null) {
            Chip chip = (Chip) interfaceC4962e;
            chip.b(chip.f36086I);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z8;
        boolean z9;
        int colorForState;
        ColorStateList colorStateList;
        boolean z10 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f40303Q;
        int b9 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f40306R0) : 0);
        if (this.f40306R0 != b9) {
            this.f40306R0 = b9;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f40305R;
        int b10 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f40308S0) : 0);
        if (this.f40308S0 != b10) {
            this.f40308S0 = b10;
            onStateChange = true;
        }
        int b11 = G.c.b(b10, b9);
        if ((this.f40310T0 != b11) | (this.f413n.f385c == null)) {
            this.f40310T0 = b11;
            j(ColorStateList.valueOf(b11));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f40311U;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f40312U0) : 0;
        if (this.f40312U0 != colorForState2) {
            this.f40312U0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f40327f1 == null || !A3.a.b(iArr)) ? 0 : this.f40327f1.getColorForState(iArr, this.f40314V0);
        if (this.f40314V0 != colorForState3) {
            this.f40314V0 = colorForState3;
        }
        C5277d c5277d = this.f40304Q0.f41672f;
        int colorForState4 = (c5277d == null || (colorStateList = c5277d.f42171j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f40316W0);
        if (this.f40316W0 != colorForState4) {
            this.f40316W0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.f40342w0) {
                    z8 = true;
                }
            }
        }
        z8 = false;
        if (this.f40318X0 != z8 && this.f40344y0 != null) {
            float p6 = p();
            this.f40318X0 = z8;
            if (p6 != p()) {
                onStateChange = true;
                z9 = true;
                ColorStateList colorStateList5 = this.f40324c1;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f40319Y0) : 0;
                if (this.f40319Y0 == colorForState) {
                    this.f40319Y0 = colorForState;
                    ColorStateList colorStateList6 = this.f40324c1;
                    PorterDuff.Mode mode = this.f40325d1;
                    this.f40323b1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z10 = onStateChange;
                }
                if (t(this.f40320Z)) {
                    z10 |= this.f40320Z.setState(iArr);
                }
                if (t(this.f40344y0)) {
                    z10 |= this.f40344y0.setState(iArr);
                }
                if (t(this.f40337r0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z10 |= this.f40337r0.setState(iArr3);
                }
                int[] iArr4 = A3.a.f35a;
                if (t(this.f40338s0)) {
                    z10 |= this.f40338s0.setState(iArr2);
                }
                if (z10) {
                    invalidateSelf();
                }
                if (z9) {
                    u();
                }
                return z10;
            }
            onStateChange = true;
        }
        z9 = false;
        ColorStateList colorStateList52 = this.f40324c1;
        if (colorStateList52 == null) {
        }
        if (this.f40319Y0 == colorForState) {
        }
        if (t(this.f40320Z)) {
        }
        if (t(this.f40344y0)) {
        }
        if (t(this.f40337r0)) {
        }
        int[] iArr42 = A3.a.f35a;
        if (t(this.f40338s0)) {
        }
        if (z10) {
        }
        if (z9) {
        }
        return z10;
    }

    public final void w(boolean z8) {
        if (this.f40342w0 != z8) {
            this.f40342w0 = z8;
            float p6 = p();
            if (!z8 && this.f40318X0) {
                this.f40318X0 = false;
            }
            float p9 = p();
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f40344y0 != drawable) {
            float p6 = p();
            this.f40344y0 = drawable;
            float p9 = p();
            U(this.f40344y0);
            n(this.f40344y0);
            invalidateSelf();
            if (p6 != p9) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f40345z0 != colorStateList) {
            this.f40345z0 = colorStateList;
            if (this.f40343x0 && (drawable = this.f40344y0) != null && this.f40342w0) {
                H.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z8) {
        if (this.f40343x0 != z8) {
            boolean R8 = R();
            this.f40343x0 = z8;
            boolean R9 = R();
            if (R8 != R9) {
                if (R9) {
                    n(this.f40344y0);
                } else {
                    U(this.f40344y0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
