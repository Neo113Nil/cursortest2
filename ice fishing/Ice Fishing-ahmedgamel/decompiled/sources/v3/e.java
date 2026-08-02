package v3;

import A3.k;
import A3.l;
import G3.f;
import G3.g;
import G3.j;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n3.C4771b;

/* loaded from: classes2.dex */
public final class e extends g implements Drawable.Callback, k {

    /* renamed from: g1, reason: collision with root package name */
    public static final int[] f41150g1 = {R.attr.state_enabled};

    /* renamed from: h1, reason: collision with root package name */
    public static final ShapeDrawable f41151h1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public float f41152A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f41153B0;
    public float C0;

    /* renamed from: D0, reason: collision with root package name */
    public float f41154D0;

    /* renamed from: E0, reason: collision with root package name */
    public float f41155E0;

    /* renamed from: F0, reason: collision with root package name */
    public final Context f41156F0;

    /* renamed from: G0, reason: collision with root package name */
    public final Paint f41157G0;

    /* renamed from: H0, reason: collision with root package name */
    public final Paint.FontMetrics f41158H0;

    /* renamed from: I0, reason: collision with root package name */
    public final RectF f41159I0;

    /* renamed from: J0, reason: collision with root package name */
    public final PointF f41160J0;

    /* renamed from: K0, reason: collision with root package name */
    public final Path f41161K0;

    /* renamed from: L0, reason: collision with root package name */
    public final l f41162L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f41163M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f41164N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f41165O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f41166P0;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f41167Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f41168Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f41169R;

    /* renamed from: R0, reason: collision with root package name */
    public int f41170R0;

    /* renamed from: S, reason: collision with root package name */
    public float f41171S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f41172S0;

    /* renamed from: T, reason: collision with root package name */
    public float f41173T;

    /* renamed from: T0, reason: collision with root package name */
    public int f41174T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f41175U;

    /* renamed from: U0, reason: collision with root package name */
    public int f41176U0;

    /* renamed from: V, reason: collision with root package name */
    public float f41177V;

    /* renamed from: V0, reason: collision with root package name */
    public ColorFilter f41178V0;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f41179W;

    /* renamed from: W0, reason: collision with root package name */
    public PorterDuffColorFilter f41180W0;

    /* renamed from: X, reason: collision with root package name */
    public CharSequence f41181X;

    /* renamed from: X0, reason: collision with root package name */
    public ColorStateList f41182X0;
    public boolean Y;

    /* renamed from: Y0, reason: collision with root package name */
    public PorterDuff.Mode f41183Y0;

    /* renamed from: Z, reason: collision with root package name */
    public Drawable f41184Z;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f41185Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ColorStateList f41186a1;

    /* renamed from: b1, reason: collision with root package name */
    public WeakReference f41187b1;

    /* renamed from: c1, reason: collision with root package name */
    public TextUtils.TruncateAt f41188c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f41189d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f41190e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f41191f1;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f41192i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f41193j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f41194k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f41195l0;
    public Drawable m0;

    /* renamed from: n0, reason: collision with root package name */
    public RippleDrawable f41196n0;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f41197o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f41198p0;

    /* renamed from: q0, reason: collision with root package name */
    public SpannableStringBuilder f41199q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f41200r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f41201s0;

    /* renamed from: t0, reason: collision with root package name */
    public Drawable f41202t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f41203u0;

    /* renamed from: v0, reason: collision with root package name */
    public C4771b f41204v0;

    /* renamed from: w0, reason: collision with root package name */
    public C4771b f41205w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f41206x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f41207y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f41208z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.chipStyle, C5248R.style.Widget_MaterialComponents_Chip_Action);
        this.f41173T = -1.0f;
        this.f41157G0 = new Paint(1);
        this.f41158H0 = new Paint.FontMetrics();
        this.f41159I0 = new RectF();
        this.f41160J0 = new PointF();
        this.f41161K0 = new Path();
        this.f41176U0 = p.f9259b;
        this.f41183Y0 = PorterDuff.Mode.SRC_IN;
        this.f41187b1 = new WeakReference(null);
        h(context);
        this.f41156F0 = context;
        l lVar = new l(this);
        this.f41162L0 = lVar;
        this.f41181X = "";
        lVar.f172a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f41150g1;
        setState(iArr);
        if (!Arrays.equals(this.f41185Z0, iArr)) {
            this.f41185Z0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f41189d1 = true;
        int[] iArr2 = E3.a.f895a;
        f41151h1.setTint(-1);
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

    public final void A(float f2) {
        if (this.f41173T != f2) {
            this.f41173T = f2;
            j e9 = this.f1108n.f1078a.e();
            e9.f1120e = new G3.a(f2);
            e9.f1121f = new G3.a(f2);
            e9.f1122g = new G3.a(f2);
            e9.f1123h = new G3.a(f2);
            setShapeAppearanceModel(e9.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f41184Z;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p9 = p();
            this.f41184Z = drawable != null ? drawable.mutate() : null;
            float p10 = p();
            U(drawable2);
            if (S()) {
                n(this.f41184Z);
            }
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f41193j0 != f2) {
            float p9 = p();
            this.f41193j0 = f2;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f41194k0 = true;
        if (this.f41192i0 != colorStateList) {
            this.f41192i0 = colorStateList;
            if (S()) {
                H.a.h(this.f41184Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z6) {
        if (this.Y != z6) {
            boolean S8 = S();
            this.Y = z6;
            boolean S9 = S();
            if (S8 != S9) {
                if (S9) {
                    n(this.f41184Z);
                } else {
                    U(this.f41184Z);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f41175U != colorStateList) {
            this.f41175U = colorStateList;
            if (this.f41191f1) {
                f fVar = this.f1108n;
                if (fVar.f1081d != colorStateList) {
                    fVar.f1081d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f41177V != f2) {
            this.f41177V = f2;
            this.f41157G0.setStrokeWidth(f2);
            if (this.f41191f1) {
                this.f1108n.f1086j = f2;
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
        Drawable drawable3 = this.m0;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof H.g;
            drawable2 = drawable3;
            if (z6) {
            }
            if (drawable2 == drawable) {
                float q8 = q();
                this.m0 = drawable != null ? drawable.mutate() : null;
                int[] iArr = E3.a.f895a;
                this.f41196n0 = new RippleDrawable(E3.a.a(this.f41179W), this.m0, f41151h1);
                float q9 = q();
                U(drawable2);
                if (T()) {
                    n(this.m0);
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

    public final void I(float f2) {
        if (this.f41154D0 != f2) {
            this.f41154D0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f41198p0 != f2) {
            this.f41198p0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.C0 != f2) {
            this.C0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f41197o0 != colorStateList) {
            this.f41197o0 = colorStateList;
            if (T()) {
                H.a.h(this.m0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z6) {
        if (this.f41195l0 != z6) {
            boolean T8 = T();
            this.f41195l0 = z6;
            boolean T9 = T();
            if (T8 != T9) {
                if (T9) {
                    n(this.m0);
                } else {
                    U(this.m0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f41208z0 != f2) {
            float p9 = p();
            this.f41208z0 = f2;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f41207y0 != f2) {
            float p9 = p();
            this.f41207y0 = f2;
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f41179W != colorStateList) {
            this.f41179W = colorStateList;
            this.f41186a1 = null;
            onStateChange(getState());
        }
    }

    public final void Q(D3.d dVar) {
        l lVar = this.f41162L0;
        if (lVar.f177f != dVar) {
            lVar.f177f = dVar;
            if (dVar != null) {
                TextPaint textPaint = lVar.f172a;
                Context context = this.f41156F0;
                A3.j jVar = lVar.f173b;
                dVar.f(context, textPaint, jVar);
                k kVar = (k) lVar.f176e.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.e(context, textPaint, jVar);
                lVar.f175d = true;
            }
            k kVar2 = (k) lVar.f176e.get();
            if (kVar2 != null) {
                e eVar = (e) kVar2;
                eVar.u();
                eVar.invalidateSelf();
                eVar.onStateChange(kVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f41201s0 && this.f41202t0 != null && this.f41172S0;
    }

    public final boolean S() {
        return this.Y && this.f41184Z != null;
    }

    public final boolean T() {
        return this.f41195l0 && this.m0 != null;
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i4;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f41176U0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i4 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i4 = 0;
        }
        boolean z6 = this.f41191f1;
        Paint paint = this.f41157G0;
        RectF rectF = this.f41159I0;
        if (!z6) {
            paint.setColor(this.f41163M0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f41191f1) {
            paint.setColor(this.f41164N0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f41178V0;
            if (colorFilter == null) {
                colorFilter = this.f41180W0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f41191f1) {
            super.draw(canvas);
        }
        if (this.f41177V > 0.0f && !this.f41191f1) {
            paint.setColor(this.f41166P0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f41191f1) {
                ColorFilter colorFilter2 = this.f41178V0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f41180W0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f9 = this.f41177V / 2.0f;
            rectF.set(f2 + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
            float f10 = this.f41173T - (this.f41177V / 2.0f);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
        }
        paint.setColor(this.f41168Q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f41191f1) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f41161K0;
            f fVar = this.f1108n;
            this.f1103K.a(fVar.f1078a, fVar.i, rectF2, this.J, path);
            d(canvas2, paint, path, this.f1108n.f1078a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f41184Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f41184Z.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (R()) {
            o(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f41202t0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f41202t0.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f41189d1 && this.f41181X != null) {
            PointF pointF = this.f41160J0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f41181X;
            l lVar = this.f41162L0;
            if (charSequence != null) {
                float p9 = p() + this.f41206x0 + this.f41152A0;
                if (H.b.a(this) == 0) {
                    pointF.x = bounds.left + p9;
                } else {
                    pointF.x = bounds.right - p9;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = lVar.f172a;
                Paint.FontMetrics fontMetrics = this.f41158H0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f41181X != null) {
                float p10 = p() + this.f41206x0 + this.f41152A0;
                float q8 = q() + this.f41155E0 + this.f41153B0;
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
            D3.d dVar = lVar.f177f;
            TextPaint textPaint2 = lVar.f172a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                lVar.f177f.e(this.f41156F0, textPaint2, lVar.f173b);
            }
            textPaint2.setTextAlign(align);
            boolean z9 = Math.round(lVar.a(this.f41181X.toString())) > Math.round(rectF.width());
            if (z9) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i6 = save;
            } else {
                i6 = 0;
            }
            CharSequence charSequence2 = this.f41181X;
            if (z9 && this.f41188c1 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f41188c1);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z9) {
                canvas2.restoreToCount(i6);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f15 = this.f41155E0 + this.f41154D0;
                if (H.b.a(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.f41198p0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.f41198p0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f18 = this.f41198p0;
                float f19 = exactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas2.translate(f20, f21);
            this.m0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = E3.a.f895a;
            this.f41196n0.setBounds(this.m0.getBounds());
            this.f41196n0.jumpToCurrentState();
            this.f41196n0.draw(canvas2);
            canvas2.translate(-f20, -f21);
        }
        if (this.f41176U0 < 255) {
            canvas2.restoreToCount(i4);
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f41176U0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f41178V0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f41171S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f41162L0.a(this.f41181X.toString()) + p() + this.f41206x0 + this.f41152A0 + this.f41153B0 + this.f41155E0), this.f41190e1);
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f41191f1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f41171S, this.f41173T);
        } else {
            outline.setRoundRect(bounds, this.f41173T);
            outline2 = outline;
        }
        outline2.setAlpha(this.f41176U0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f41167Q) || s(this.f41169R) || s(this.f41175U)) {
            return true;
        }
        D3.d dVar = this.f41162L0.f177f;
        if (dVar == null || (colorStateList = dVar.f621j) == null || !colorStateList.isStateful()) {
            return (this.f41201s0 && this.f41202t0 != null && this.f41200r0) || t(this.f41184Z) || t(this.f41202t0) || s(this.f41182X0);
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
        if (drawable == this.m0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f41185Z0);
            }
            H.a.h(drawable, this.f41197o0);
            return;
        }
        Drawable drawable2 = this.f41184Z;
        if (drawable == drawable2 && this.f41194k0) {
            H.a.h(drawable2, this.f41192i0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f41206x0 + this.f41207y0;
            Drawable drawable = this.f41172S0 ? this.f41202t0 : this.f41184Z;
            float f9 = this.f41193j0;
            if (f9 <= 0.0f && drawable != null) {
                f9 = drawable.getIntrinsicWidth();
            }
            if (H.b.a(this) == 0) {
                float f10 = rect.left + f2;
                rectF.left = f10;
                rectF.right = f10 + f9;
            } else {
                float f11 = rect.right - f2;
                rectF.right = f11;
                rectF.left = f11 - f9;
            }
            Drawable drawable2 = this.f41172S0 ? this.f41202t0 : this.f41184Z;
            float f12 = this.f41193j0;
            if (f12 <= 0.0f && drawable2 != null) {
                f12 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f41156F0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= H.b.b(this.f41184Z, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= H.b.b(this.f41202t0, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= H.b.b(this.m0, i);
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
            onLevelChange |= this.f41184Z.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f41202t0.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.m0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f41191f1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f41185Z0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f41207y0;
        Drawable drawable = this.f41172S0 ? this.f41202t0 : this.f41184Z;
        float f9 = this.f41193j0;
        if (f9 <= 0.0f && drawable != null) {
            f9 = drawable.getIntrinsicWidth();
        }
        return f9 + f2 + this.f41208z0;
    }

    public final float q() {
        if (T()) {
            return this.C0 + this.f41198p0 + this.f41154D0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f41191f1 ? this.f1108n.f1078a.f1131e.a(f()) : this.f41173T;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f41176U0 != i) {
            this.f41176U0 = i;
            invalidateSelf();
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f41178V0 != colorFilter) {
            this.f41178V0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f41182X0 != colorStateList) {
            this.f41182X0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // G3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f41183Y0 != mode) {
            this.f41183Y0 = mode;
            ColorStateList colorStateList = this.f41182X0;
            this.f41180W0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        boolean visible = super.setVisible(z6, z9);
        if (S()) {
            visible |= this.f41184Z.setVisible(z6, z9);
        }
        if (R()) {
            visible |= this.f41202t0.setVisible(z6, z9);
        }
        if (T()) {
            visible |= this.m0.setVisible(z6, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        d dVar = (d) this.f41187b1.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f36691I);
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
        boolean z6;
        boolean z9;
        int colorForState;
        ColorStateList colorStateList;
        boolean z10 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f41167Q;
        int b9 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f41163M0) : 0);
        if (this.f41163M0 != b9) {
            this.f41163M0 = b9;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f41169R;
        int b10 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f41164N0) : 0);
        if (this.f41164N0 != b10) {
            this.f41164N0 = b10;
            onStateChange = true;
        }
        int b11 = G.c.b(b10, b9);
        if ((this.f41165O0 != b11) | (this.f1108n.f1080c == null)) {
            this.f41165O0 = b11;
            j(ColorStateList.valueOf(b11));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f41175U;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f41166P0) : 0;
        if (this.f41166P0 != colorForState2) {
            this.f41166P0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f41186a1 == null || !E3.a.b(iArr)) ? 0 : this.f41186a1.getColorForState(iArr, this.f41168Q0);
        if (this.f41168Q0 != colorForState3) {
            this.f41168Q0 = colorForState3;
        }
        D3.d dVar = this.f41162L0.f177f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f621j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f41170R0);
        if (this.f41170R0 != colorForState4) {
            this.f41170R0 = colorForState4;
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
                } else if (this.f41200r0) {
                    z6 = true;
                }
            }
        }
        z6 = false;
        if (this.f41172S0 != z6 && this.f41202t0 != null) {
            float p9 = p();
            this.f41172S0 = z6;
            if (p9 != p()) {
                onStateChange = true;
                z9 = true;
                ColorStateList colorStateList5 = this.f41182X0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f41174T0) : 0;
                if (this.f41174T0 == colorForState) {
                    this.f41174T0 = colorForState;
                    ColorStateList colorStateList6 = this.f41182X0;
                    PorterDuff.Mode mode = this.f41183Y0;
                    this.f41180W0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z10 = onStateChange;
                }
                if (t(this.f41184Z)) {
                    z10 |= this.f41184Z.setState(iArr);
                }
                if (t(this.f41202t0)) {
                    z10 |= this.f41202t0.setState(iArr);
                }
                if (t(this.m0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z10 |= this.m0.setState(iArr3);
                }
                int[] iArr4 = E3.a.f895a;
                if (t(this.f41196n0)) {
                    z10 |= this.f41196n0.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f41182X0;
        if (colorStateList52 == null) {
        }
        if (this.f41174T0 == colorForState) {
        }
        if (t(this.f41184Z)) {
        }
        if (t(this.f41202t0)) {
        }
        if (t(this.m0)) {
        }
        int[] iArr42 = E3.a.f895a;
        if (t(this.f41196n0)) {
        }
        if (z10) {
        }
        if (z9) {
        }
        return z10;
    }

    public final void w(boolean z6) {
        if (this.f41200r0 != z6) {
            this.f41200r0 = z6;
            float p9 = p();
            if (!z6 && this.f41172S0) {
                this.f41172S0 = false;
            }
            float p10 = p();
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f41202t0 != drawable) {
            float p9 = p();
            this.f41202t0 = drawable;
            float p10 = p();
            U(this.f41202t0);
            n(this.f41202t0);
            invalidateSelf();
            if (p9 != p10) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f41203u0 != colorStateList) {
            this.f41203u0 = colorStateList;
            if (this.f41201s0 && (drawable = this.f41202t0) != null && this.f41200r0) {
                H.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z6) {
        if (this.f41201s0 != z6) {
            boolean R8 = R();
            this.f41201s0 = z6;
            boolean R9 = R();
            if (R8 != R9) {
                if (R9) {
                    n(this.f41202t0);
                } else {
                    U(this.f41202t0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
