package t3;

import E3.g;
import E3.j;
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
import com.icefishing.icefishinglive2.C5275R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l3.C4662b;
import y3.InterfaceC5240h;
import y3.i;

/* loaded from: classes2.dex */
public final class f extends g implements Drawable.Callback, InterfaceC5240h {

    /* renamed from: l1, reason: collision with root package name */
    public static final int[] f40862l1 = {R.attr.state_enabled};

    /* renamed from: m1, reason: collision with root package name */
    public static final ShapeDrawable f40863m1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public C4662b f40864A0;

    /* renamed from: B0, reason: collision with root package name */
    public C4662b f40865B0;
    public float C0;

    /* renamed from: D0, reason: collision with root package name */
    public float f40866D0;

    /* renamed from: E0, reason: collision with root package name */
    public float f40867E0;

    /* renamed from: F0, reason: collision with root package name */
    public float f40868F0;

    /* renamed from: G0, reason: collision with root package name */
    public float f40869G0;

    /* renamed from: H0, reason: collision with root package name */
    public float f40870H0;

    /* renamed from: I0, reason: collision with root package name */
    public float f40871I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f40872J0;

    /* renamed from: K0, reason: collision with root package name */
    public final Context f40873K0;

    /* renamed from: L0, reason: collision with root package name */
    public final Paint f40874L0;

    /* renamed from: M0, reason: collision with root package name */
    public final Paint.FontMetrics f40875M0;

    /* renamed from: N0, reason: collision with root package name */
    public final RectF f40876N0;

    /* renamed from: O0, reason: collision with root package name */
    public final PointF f40877O0;

    /* renamed from: P0, reason: collision with root package name */
    public final Path f40878P0;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f40879Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final i f40880Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f40881R;

    /* renamed from: R0, reason: collision with root package name */
    public int f40882R0;

    /* renamed from: S, reason: collision with root package name */
    public float f40883S;

    /* renamed from: S0, reason: collision with root package name */
    public int f40884S0;

    /* renamed from: T, reason: collision with root package name */
    public float f40885T;

    /* renamed from: T0, reason: collision with root package name */
    public int f40886T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f40887U;

    /* renamed from: U0, reason: collision with root package name */
    public int f40888U0;

    /* renamed from: V, reason: collision with root package name */
    public float f40889V;

    /* renamed from: V0, reason: collision with root package name */
    public int f40890V0;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f40891W;

    /* renamed from: W0, reason: collision with root package name */
    public int f40892W0;

    /* renamed from: X, reason: collision with root package name */
    public CharSequence f40893X;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f40894X0;
    public boolean Y;

    /* renamed from: Y0, reason: collision with root package name */
    public int f40895Y0;

    /* renamed from: Z, reason: collision with root package name */
    public Drawable f40896Z;

    /* renamed from: Z0, reason: collision with root package name */
    public int f40897Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ColorFilter f40898a1;

    /* renamed from: b1, reason: collision with root package name */
    public PorterDuffColorFilter f40899b1;

    /* renamed from: c1, reason: collision with root package name */
    public ColorStateList f40900c1;

    /* renamed from: d1, reason: collision with root package name */
    public PorterDuff.Mode f40901d1;

    /* renamed from: e1, reason: collision with root package name */
    public int[] f40902e1;

    /* renamed from: f1, reason: collision with root package name */
    public ColorStateList f40903f1;

    /* renamed from: g1, reason: collision with root package name */
    public WeakReference f40904g1;

    /* renamed from: h1, reason: collision with root package name */
    public TextUtils.TruncateAt f40905h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f40906i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f40907j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f40908k1;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f40909n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f40910o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f40911p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f40912q0;

    /* renamed from: r0, reason: collision with root package name */
    public Drawable f40913r0;

    /* renamed from: s0, reason: collision with root package name */
    public RippleDrawable f40914s0;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f40915t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f40916u0;

    /* renamed from: v0, reason: collision with root package name */
    public SpannableStringBuilder f40917v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f40918w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f40919x0;

    /* renamed from: y0, reason: collision with root package name */
    public Drawable f40920y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f40921z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.chipStyle, C5275R.style.Widget_MaterialComponents_Chip_Action);
        this.f40885T = -1.0f;
        this.f40874L0 = new Paint(1);
        this.f40875M0 = new Paint.FontMetrics();
        this.f40876N0 = new RectF();
        this.f40877O0 = new PointF();
        this.f40878P0 = new Path();
        this.f40897Z0 = p.f8473b;
        this.f40901d1 = PorterDuff.Mode.SRC_IN;
        this.f40904g1 = new WeakReference(null);
        h(context);
        this.f40873K0 = context;
        i iVar = new i(this);
        this.f40880Q0 = iVar;
        this.f40893X = "";
        iVar.f41916a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f40862l1;
        setState(iArr);
        if (!Arrays.equals(this.f40902e1, iArr)) {
            this.f40902e1 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f40906i1 = true;
        int[] iArr2 = C3.a.f430a;
        f40863m1.setTint(-1);
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

    public final void A(float f3) {
        if (this.f40885T != f3) {
            this.f40885T = f3;
            j e9 = this.f766n.f736a.e();
            e9.f778e = new E3.a(f3);
            e9.f779f = new E3.a(f3);
            e9.f780g = new E3.a(f3);
            e9.f781h = new E3.a(f3);
            setShapeAppearanceModel(e9.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f40896Z;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p9 = p();
            this.f40896Z = drawable != null ? drawable.mutate() : null;
            float p10 = p();
            U(drawable2);
            if (S()) {
                n(this.f40896Z);
            }
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void C(float f3) {
        if (this.f40910o0 != f3) {
            float p9 = p();
            this.f40910o0 = f3;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f40911p0 = true;
        if (this.f40909n0 != colorStateList) {
            this.f40909n0 = colorStateList;
            if (S()) {
                H.a.h(this.f40896Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z3) {
        if (this.Y != z3) {
            boolean S8 = S();
            this.Y = z3;
            boolean S9 = S();
            if (S8 != S9) {
                if (S9) {
                    n(this.f40896Z);
                } else {
                    U(this.f40896Z);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f40887U != colorStateList) {
            this.f40887U = colorStateList;
            if (this.f40908k1) {
                E3.f fVar = this.f766n;
                if (fVar.f739d != colorStateList) {
                    fVar.f739d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f3) {
        if (this.f40889V != f3) {
            this.f40889V = f3;
            this.f40874L0.setStrokeWidth(f3);
            if (this.f40908k1) {
                this.f766n.f744j = f3;
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
        Drawable drawable3 = this.f40913r0;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z3) {
            }
            if (drawable2 == drawable) {
                float q8 = q();
                this.f40913r0 = drawable != null ? drawable.mutate() : null;
                int[] iArr = C3.a.f430a;
                this.f40914s0 = new RippleDrawable(C3.a.a(this.f40891W), this.f40913r0, f40863m1);
                float q9 = q();
                U(drawable2);
                if (T()) {
                    n(this.f40913r0);
                }
                invalidateSelf();
                if (q8 != q9) {
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

    public final void I(float f3) {
        if (this.f40871I0 != f3) {
            this.f40871I0 = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f3) {
        if (this.f40916u0 != f3) {
            this.f40916u0 = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f3) {
        if (this.f40870H0 != f3) {
            this.f40870H0 = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f40915t0 != colorStateList) {
            this.f40915t0 = colorStateList;
            if (T()) {
                H.a.h(this.f40913r0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z3) {
        if (this.f40912q0 != z3) {
            boolean T8 = T();
            this.f40912q0 = z3;
            boolean T9 = T();
            if (T8 != T9) {
                if (T9) {
                    n(this.f40913r0);
                } else {
                    U(this.f40913r0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f3) {
        if (this.f40867E0 != f3) {
            float p9 = p();
            this.f40867E0 = f3;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void O(float f3) {
        if (this.f40866D0 != f3) {
            float p9 = p();
            this.f40866D0 = f3;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f40891W != colorStateList) {
            this.f40891W = colorStateList;
            this.f40903f1 = null;
            onStateChange(getState());
        }
    }

    public final void Q(B3.d dVar) {
        i iVar = this.f40880Q0;
        if (iVar.f41921f != dVar) {
            iVar.f41921f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f41916a;
                Context context = this.f40873K0;
                C5039b c5039b = iVar.f41917b;
                dVar.f(context, textPaint, c5039b);
                InterfaceC5240h interfaceC5240h = (InterfaceC5240h) iVar.f41920e.get();
                if (interfaceC5240h != null) {
                    textPaint.drawableState = interfaceC5240h.getState();
                }
                dVar.e(context, textPaint, c5039b);
                iVar.f41919d = true;
            }
            InterfaceC5240h interfaceC5240h2 = (InterfaceC5240h) iVar.f41920e.get();
            if (interfaceC5240h2 != null) {
                f fVar = (f) interfaceC5240h2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(interfaceC5240h2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f40919x0 && this.f40920y0 != null && this.f40894X0;
    }

    public final boolean S() {
        return this.Y && this.f40896Z != null;
    }

    public final boolean T() {
        return this.f40912q0 && this.f40913r0 != null;
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i6;
        int i9;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f40897Z0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i6 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i6 = 0;
        }
        boolean z3 = this.f40908k1;
        Paint paint = this.f40874L0;
        RectF rectF = this.f40876N0;
        if (!z3) {
            paint.setColor(this.f40882R0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f40908k1) {
            paint.setColor(this.f40884S0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f40898a1;
            if (colorFilter == null) {
                colorFilter = this.f40899b1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f40908k1) {
            super.draw(canvas);
        }
        if (this.f40889V > 0.0f && !this.f40908k1) {
            paint.setColor(this.f40888U0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f40908k1) {
                ColorFilter colorFilter2 = this.f40898a1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f40899b1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f9 = this.f40889V / 2.0f;
            rectF.set(f3 + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
            float f10 = this.f40885T - (this.f40889V / 2.0f);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
        }
        paint.setColor(this.f40890V0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f40908k1) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f40878P0;
            E3.f fVar = this.f766n;
            this.f761K.a(fVar.f736a, fVar.i, rectF2, this.J, path);
            d(canvas2, paint, path, this.f766n.f736a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f40896Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f40896Z.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (R()) {
            o(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f40920y0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f40920y0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f40906i1 && this.f40893X != null) {
            PointF pointF = this.f40877O0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f40893X;
            i iVar = this.f40880Q0;
            if (charSequence != null) {
                float p9 = p() + this.C0 + this.f40868F0;
                if (H.b.a(this) == 0) {
                    pointF.x = bounds.left + p9;
                } else {
                    pointF.x = bounds.right - p9;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f41916a;
                Paint.FontMetrics fontMetrics = this.f40875M0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f40893X != null) {
                float p10 = p() + this.C0 + this.f40868F0;
                float q8 = q() + this.f40872J0 + this.f40869G0;
                if (H.b.a(this) == 0) {
                    rectF.left = bounds.left + p10;
                    rectF.right = bounds.right - q8;
                } else {
                    rectF.left = bounds.left + q8;
                    rectF.right = bounds.right - p10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            B3.d dVar = iVar.f41921f;
            TextPaint textPaint2 = iVar.f41916a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f41921f.e(this.f40873K0, textPaint2, iVar.f41917b);
            }
            textPaint2.setTextAlign(align);
            boolean z6 = Math.round(iVar.a(this.f40893X.toString())) > Math.round(rectF.width());
            if (z6) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i9 = save;
            } else {
                i9 = 0;
            }
            CharSequence charSequence2 = this.f40893X;
            if (z6 && this.f40905h1 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f40905h1);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z6) {
                canvas2.restoreToCount(i9);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f15 = this.f40872J0 + this.f40871I0;
                if (H.b.a(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f40916u0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f40916u0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f18 = this.f40916u0;
                float f19 = exactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas2.translate(f20, f21);
            this.f40913r0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = C3.a.f430a;
            this.f40914s0.setBounds(this.f40913r0.getBounds());
            this.f40914s0.jumpToCurrentState();
            this.f40914s0.draw(canvas2);
            canvas2.translate(-f20, -f21);
        }
        if (this.f40897Z0 < 255) {
            canvas2.restoreToCount(i6);
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40897Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f40898a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f40883S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f40880Q0.a(this.f40893X.toString()) + p() + this.C0 + this.f40868F0 + this.f40869G0 + this.f40872J0), this.f40907j1);
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f40908k1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f40883S, this.f40885T);
        } else {
            outline.setRoundRect(bounds, this.f40885T);
            outline2 = outline;
        }
        outline2.setAlpha(this.f40897Z0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f40879Q) || s(this.f40881R) || s(this.f40887U)) {
            return true;
        }
        B3.d dVar = this.f40880Q0.f41921f;
        if (dVar == null || (colorStateList = dVar.f202j) == null || !colorStateList.isStateful()) {
            return (this.f40919x0 && this.f40920y0 != null && this.f40918w0) || t(this.f40896Z) || t(this.f40920y0) || s(this.f40900c1);
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
        if (drawable == this.f40913r0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f40902e1);
            }
            H.a.h(drawable, this.f40915t0);
            return;
        }
        Drawable drawable2 = this.f40896Z;
        if (drawable == drawable2 && this.f40911p0) {
            H.a.h(drawable2, this.f40909n0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f3 = this.C0 + this.f40866D0;
            Drawable drawable = this.f40894X0 ? this.f40920y0 : this.f40896Z;
            float f9 = this.f40910o0;
            if (f9 <= 0.0f && drawable != null) {
                f9 = drawable.getIntrinsicWidth();
            }
            if (H.b.a(this) == 0) {
                float f10 = rect.left + f3;
                rectF.left = f10;
                rectF.right = f10 + f9;
            } else {
                float f11 = rect.right - f3;
                rectF.right = f11;
                rectF.left = f11 - f9;
            }
            Drawable drawable2 = this.f40894X0 ? this.f40920y0 : this.f40896Z;
            float f12 = this.f40910o0;
            if (f12 <= 0.0f && drawable2 != null) {
                f12 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f40873K0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= H.b.b(this.f40896Z, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= H.b.b(this.f40920y0, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= H.b.b(this.f40913r0, i);
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
            onLevelChange |= this.f40896Z.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f40920y0.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f40913r0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f40908k1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f40902e1);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f3 = this.f40866D0;
        Drawable drawable = this.f40894X0 ? this.f40920y0 : this.f40896Z;
        float f9 = this.f40910o0;
        if (f9 <= 0.0f && drawable != null) {
            f9 = drawable.getIntrinsicWidth();
        }
        return f9 + f3 + this.f40867E0;
    }

    public final float q() {
        if (T()) {
            return this.f40870H0 + this.f40916u0 + this.f40871I0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f40908k1 ? this.f766n.f736a.f789e.a(f()) : this.f40885T;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f40897Z0 != i) {
            this.f40897Z0 = i;
            invalidateSelf();
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f40898a1 != colorFilter) {
            this.f40898a1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f40900c1 != colorStateList) {
            this.f40900c1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // E3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f40901d1 != mode) {
            this.f40901d1 = mode;
            ColorStateList colorStateList = this.f40900c1;
            this.f40899b1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        boolean visible = super.setVisible(z3, z6);
        if (S()) {
            visible |= this.f40896Z.setVisible(z3, z6);
        }
        if (R()) {
            visible |= this.f40920y0.setVisible(z3, z6);
        }
        if (T()) {
            visible |= this.f40913r0.setVisible(z3, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f40904g1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f35923I);
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
        boolean z3;
        boolean z6;
        int colorForState;
        ColorStateList colorStateList;
        boolean z9 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f40879Q;
        int b9 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f40882R0) : 0);
        if (this.f40882R0 != b9) {
            this.f40882R0 = b9;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f40881R;
        int b10 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f40884S0) : 0);
        if (this.f40884S0 != b10) {
            this.f40884S0 = b10;
            onStateChange = true;
        }
        int b11 = G.c.b(b10, b9);
        if ((this.f40886T0 != b11) | (this.f766n.f738c == null)) {
            this.f40886T0 = b11;
            j(ColorStateList.valueOf(b11));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f40887U;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f40888U0) : 0;
        if (this.f40888U0 != colorForState2) {
            this.f40888U0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f40903f1 == null || !C3.a.b(iArr)) ? 0 : this.f40903f1.getColorForState(iArr, this.f40890V0);
        if (this.f40890V0 != colorForState3) {
            this.f40890V0 = colorForState3;
        }
        B3.d dVar = this.f40880Q0.f41921f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f202j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f40892W0);
        if (this.f40892W0 != colorForState4) {
            this.f40892W0 = colorForState4;
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
                } else if (this.f40918w0) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        if (this.f40894X0 != z3 && this.f40920y0 != null) {
            float p9 = p();
            this.f40894X0 = z3;
            if (p9 != p()) {
                onStateChange = true;
                z6 = true;
                ColorStateList colorStateList5 = this.f40900c1;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f40895Y0) : 0;
                if (this.f40895Y0 == colorForState) {
                    this.f40895Y0 = colorForState;
                    ColorStateList colorStateList6 = this.f40900c1;
                    PorterDuff.Mode mode = this.f40901d1;
                    this.f40899b1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z9 = onStateChange;
                }
                if (t(this.f40896Z)) {
                    z9 |= this.f40896Z.setState(iArr);
                }
                if (t(this.f40920y0)) {
                    z9 |= this.f40920y0.setState(iArr);
                }
                if (t(this.f40913r0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z9 |= this.f40913r0.setState(iArr3);
                }
                int[] iArr4 = C3.a.f430a;
                if (t(this.f40914s0)) {
                    z9 |= this.f40914s0.setState(iArr2);
                }
                if (z9) {
                    invalidateSelf();
                }
                if (z6) {
                    u();
                }
                return z9;
            }
            onStateChange = true;
        }
        z6 = false;
        ColorStateList colorStateList52 = this.f40900c1;
        if (colorStateList52 == null) {
        }
        if (this.f40895Y0 == colorForState) {
        }
        if (t(this.f40896Z)) {
        }
        if (t(this.f40920y0)) {
        }
        if (t(this.f40913r0)) {
        }
        int[] iArr42 = C3.a.f430a;
        if (t(this.f40914s0)) {
        }
        if (z9) {
        }
        if (z6) {
        }
        return z9;
    }

    public final void w(boolean z3) {
        if (this.f40918w0 != z3) {
            this.f40918w0 = z3;
            float p9 = p();
            if (!z3 && this.f40894X0) {
                this.f40894X0 = false;
            }
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f40920y0 != drawable) {
            float p9 = p();
            this.f40920y0 = drawable;
            float p10 = p();
            U(this.f40920y0);
            n(this.f40920y0);
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f40921z0 != colorStateList) {
            this.f40921z0 = colorStateList;
            if (this.f40919x0 && (drawable = this.f40920y0) != null && this.f40918w0) {
                H.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z3) {
        if (this.f40919x0 != z3) {
            boolean R8 = R();
            this.f40919x0 = z3;
            boolean R9 = R();
            if (R8 != R9) {
                if (R9) {
                    n(this.f40920y0);
                } else {
                    U(this.f40920y0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
