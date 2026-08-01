package G0;

import L0.i;
import L0.j;
import S0.g;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import v0.C0361b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, i {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f283F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f284G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f285A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f286A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f287B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f288B0;

    /* renamed from: C, reason: collision with root package name */
    public float f289C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f290C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f291D;

    /* renamed from: D0, reason: collision with root package name */
    public int f292D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f293E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f294E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f295F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f296G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f297H;

    /* renamed from: I, reason: collision with root package name */
    public float f298I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f299K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f300L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f301M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f302N;

    /* renamed from: O, reason: collision with root package name */
    public float f303O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f304P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f305Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f306R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f307S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f308T;

    /* renamed from: U, reason: collision with root package name */
    public C0361b f309U;

    /* renamed from: V, reason: collision with root package name */
    public C0361b f310V;

    /* renamed from: W, reason: collision with root package name */
    public float f311W;

    /* renamed from: X, reason: collision with root package name */
    public float f312X;

    /* renamed from: Y, reason: collision with root package name */
    public float f313Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f314Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f315a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f316b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f317c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f318d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f319e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f320f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f321g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f322h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f323i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f324j0;

    /* renamed from: k0, reason: collision with root package name */
    public final j f325k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f326l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f327m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f328n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f329o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f330p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f331q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f332r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f333t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f334u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f335v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f336w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f337x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f338x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f339y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f340y0;

    /* renamed from: z, reason: collision with root package name */
    public float f341z;
    public ColorStateList z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.chipStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Chip_Action);
        this.f285A = -1.0f;
        this.f320f0 = new Paint(1);
        this.f321g0 = new Paint.FontMetrics();
        this.f322h0 = new RectF();
        this.f323i0 = new PointF();
        this.f324j0 = new Path();
        this.f333t0 = 255;
        this.f338x0 = PorterDuff.Mode.SRC_IN;
        this.f286A0 = new WeakReference(null);
        j(context);
        this.f319e0 = context;
        j jVar = new j(this);
        this.f325k0 = jVar;
        this.f293E = "";
        jVar.f511a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f283F0;
        setState(iArr);
        if (!Arrays.equals(this.f340y0, iArr)) {
            this.f340y0 = iArr;
            if (X()) {
                A(getState(), iArr);
            }
        }
        this.f290C0 = true;
        int[] iArr2 = Q0.a.f928a;
        f284G0.setTint(-1);
    }

    public static void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
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
    public final boolean A(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        int colorForState;
        ColorStateList colorStateList;
        boolean z4 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f337x;
        int c2 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f326l0) : 0);
        if (this.f326l0 != c2) {
            this.f326l0 = c2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f339y;
        int c3 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f327m0) : 0);
        if (this.f327m0 != c3) {
            this.f327m0 = c3;
            onStateChange = true;
        }
        int b2 = G.a.b(c3, c2);
        if ((this.f328n0 != b2) | (this.f1076a.f1064c == null)) {
            this.f328n0 = b2;
            m(ColorStateList.valueOf(b2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f287B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f329o0) : 0;
        if (this.f329o0 != colorForState2) {
            this.f329o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.z0 == null || !Q0.a.c(iArr)) ? 0 : this.z0.getColorForState(iArr, this.f330p0);
        if (this.f330p0 != colorForState3) {
            this.f330p0 = colorForState3;
        }
        P0.d dVar = this.f325k0.f516g;
        int colorForState4 = (dVar == null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f331q0);
        if (this.f331q0 != colorForState4) {
            this.f331q0 = colorForState4;
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
                } else if (this.f305Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f332r0 != z2 && this.f307S != null) {
            float u2 = u();
            this.f332r0 = z2;
            if (u2 != u()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f336w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
                if (this.s0 == colorForState) {
                    this.s0 = colorForState;
                    ColorStateList colorStateList6 = this.f336w0;
                    PorterDuff.Mode mode = this.f338x0;
                    this.f335v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (y(this.f296G)) {
                    z4 |= this.f296G.setState(iArr);
                }
                if (y(this.f307S)) {
                    z4 |= this.f307S.setState(iArr);
                }
                if (y(this.f300L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f300L.setState(iArr3);
                }
                int[] iArr4 = Q0.a.f928a;
                if (y(this.f301M)) {
                    z4 |= this.f301M.setState(iArr2);
                }
                if (z4) {
                    invalidateSelf();
                }
                if (z3) {
                    z();
                }
                return z4;
            }
            onStateChange = true;
        }
        z3 = false;
        ColorStateList colorStateList52 = this.f336w0;
        if (colorStateList52 == null) {
        }
        if (this.s0 == colorForState) {
        }
        if (y(this.f296G)) {
        }
        if (y(this.f307S)) {
        }
        if (y(this.f300L)) {
        }
        int[] iArr42 = Q0.a.f928a;
        if (y(this.f301M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void B(boolean z2) {
        if (this.f305Q != z2) {
            this.f305Q = z2;
            float u2 = u();
            if (!z2 && this.f332r0) {
                this.f332r0 = false;
            }
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.f307S != drawable) {
            float u2 = u();
            this.f307S = drawable;
            float u3 = u();
            Y(this.f307S);
            s(this.f307S);
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f308T != colorStateList) {
            this.f308T = colorStateList;
            if (this.f306R && (drawable = this.f307S) != null && this.f305Q) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f306R != z2) {
            boolean V2 = V();
            this.f306R = z2;
            boolean V3 = V();
            if (V2 != V3) {
                if (V3) {
                    s(this.f307S);
                } else {
                    Y(this.f307S);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void F(float f2) {
        if (this.f285A != f2) {
            this.f285A = f2;
            S0.j e = this.f1076a.f1062a.e();
            e.e = new S0.a(f2);
            e.f1100f = new S0.a(f2);
            e.f1101g = new S0.a(f2);
            e.f1102h = new S0.a(f2);
            setShapeAppearanceModel(e.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f296G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof H.a;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u2 = u();
            this.f296G = drawable != null ? drawable.mutate() : null;
            float u3 = u();
            Y(drawable2);
            if (W()) {
                s(this.f296G);
            }
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void H(float f2) {
        if (this.f298I != f2) {
            float u2 = u();
            this.f298I = f2;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.J = true;
        if (this.f297H != colorStateList) {
            this.f297H = colorStateList;
            if (W()) {
                this.f296G.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z2) {
        if (this.f295F != z2) {
            boolean W2 = W();
            this.f295F = z2;
            boolean W3 = W();
            if (W2 != W3) {
                if (W3) {
                    s(this.f296G);
                } else {
                    Y(this.f296G);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.f287B != colorStateList) {
            this.f287B = colorStateList;
            if (this.f294E0) {
                S0.f fVar = this.f1076a;
                if (fVar.f1065d != colorStateList) {
                    fVar.f1065d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f2) {
        if (this.f289C != f2) {
            this.f289C = f2;
            this.f320f0.setStrokeWidth(f2);
            if (this.f294E0) {
                this.f1076a.j = f2;
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
    public final void M(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f300L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof H.a;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float v2 = v();
                this.f300L = drawable != null ? drawable.mutate() : null;
                int[] iArr = Q0.a.f928a;
                this.f301M = new RippleDrawable(Q0.a.b(this.f291D), this.f300L, f284G0);
                float v3 = v();
                Y(drawable2);
                if (X()) {
                    s(this.f300L);
                }
                invalidateSelf();
                if (v2 != v3) {
                    z();
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

    public final void N(float f2) {
        if (this.f317c0 != f2) {
            this.f317c0 = f2;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void O(float f2) {
        if (this.f303O != f2) {
            this.f303O = f2;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void P(float f2) {
        if (this.f316b0 != f2) {
            this.f316b0 = f2;
            invalidateSelf();
            if (X()) {
                z();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f302N != colorStateList) {
            this.f302N = colorStateList;
            if (X()) {
                this.f300L.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z2) {
        if (this.f299K != z2) {
            boolean X2 = X();
            this.f299K = z2;
            boolean X3 = X();
            if (X2 != X3) {
                if (X3) {
                    s(this.f300L);
                } else {
                    Y(this.f300L);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void S(float f2) {
        if (this.f313Y != f2) {
            float u2 = u();
            this.f313Y = f2;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void T(float f2) {
        if (this.f312X != f2) {
            float u2 = u();
            this.f312X = f2;
            float u3 = u();
            invalidateSelf();
            if (u2 != u3) {
                z();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        if (this.f291D != colorStateList) {
            this.f291D = colorStateList;
            this.z0 = null;
            onStateChange(getState());
        }
    }

    public final boolean V() {
        return this.f306R && this.f307S != null && this.f332r0;
    }

    public final boolean W() {
        return this.f295F && this.f296G != null;
    }

    public final boolean X() {
        return this.f299K && this.f300L != null;
    }

    @Override // L0.i
    public final void a() {
        z();
        invalidateSelf();
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        float f2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f333t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f294E0;
        Paint paint = this.f320f0;
        RectF rectF3 = this.f322h0;
        if (!z2) {
            paint.setColor(this.f326l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, w(), w(), paint);
        }
        if (!this.f294E0) {
            paint.setColor(this.f327m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f334u0;
            if (colorFilter == null) {
                colorFilter = this.f335v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, w(), w(), paint);
        }
        if (this.f294E0) {
            super.draw(canvas);
        }
        if (this.f289C > RecyclerView.f2111C0 && !this.f294E0) {
            paint.setColor(this.f329o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f294E0) {
                ColorFilter colorFilter2 = this.f334u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f335v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.f289C / 2.0f;
            rectF3.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f285A - (this.f289C / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f330p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f294E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f324j0;
            S0.f fVar = this.f1076a;
            this.f1090r.a(fVar.f1062a, fVar.i, rectF4, this.f1089q, path);
            e(canvas, paint, path, this.f1076a.f1062a, g());
        } else {
            canvas.drawRoundRect(rectF3, w(), w(), paint);
        }
        if (W()) {
            t(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f296G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f296G.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (V()) {
            t(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f307S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f307S.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f290C0 || this.f293E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f323i0;
            pointF.set(RecyclerView.f2111C0, RecyclerView.f2111C0);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f293E;
            j jVar = this.f325k0;
            if (charSequence != null) {
                float u2 = u() + this.f311W + this.f314Z;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + u2;
                } else {
                    pointF.x = bounds.right - u2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = jVar.f511a;
                Paint.FontMetrics fontMetrics = this.f321g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f293E != null) {
                float u3 = u() + this.f311W + this.f314Z;
                float v2 = v() + this.f318d0 + this.f315a0;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + u3;
                    rectF3.right = bounds.right - v2;
                } else {
                    rectF3.left = bounds.left + v2;
                    rectF3.right = bounds.right - u3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            P0.d dVar = jVar.f516g;
            TextPaint textPaint2 = jVar.f511a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                jVar.f516g.e(this.f319e0, textPaint2, jVar.f512b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f293E.toString();
            if (jVar.e) {
                jVar.a(charSequence2);
                f2 = jVar.f513c;
            } else {
                f2 = jVar.f513c;
            }
            boolean z3 = Math.round(f2) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence3 = this.f293E;
            if (z3 && this.f288B0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f288B0);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence4, 0, length, f10, f11, textPaint2);
            if (z3) {
                canvas.restoreToCount(i5);
            }
        }
        if (X()) {
            rectF.setEmpty();
            if (X()) {
                float f12 = this.f318d0 + this.f317c0;
                if (getLayoutDirection() == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f303O;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f303O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f303O;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f300L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = Q0.a.f928a;
            this.f301M.setBounds(this.f300L.getBounds());
            this.f301M.jumpToCurrentState();
            this.f301M.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f333t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f333t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f334u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f341z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2;
        float u2 = u() + this.f311W + this.f314Z;
        String charSequence = this.f293E.toString();
        j jVar = this.f325k0;
        if (jVar.e) {
            jVar.a(charSequence);
            f2 = jVar.f513c;
        } else {
            f2 = jVar.f513c;
        }
        return Math.min(Math.round(v() + f2 + u2 + this.f315a0 + this.f318d0), this.f292D0);
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f294E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f341z, this.f285A);
        } else {
            outline.setRoundRect(bounds, this.f285A);
        }
        outline.setAlpha(this.f333t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        P0.d dVar;
        ColorStateList colorStateList;
        return x(this.f337x) || x(this.f339y) || x(this.f287B) || !((dVar = this.f325k0.f516g) == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) || ((this.f306R && this.f307S != null && this.f305Q) || y(this.f296G) || y(this.f307S) || x(this.f336w0));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (W()) {
            onLayoutDirectionChanged |= this.f296G.setLayoutDirection(i);
        }
        if (V()) {
            onLayoutDirectionChanged |= this.f307S.setLayoutDirection(i);
        }
        if (X()) {
            onLayoutDirectionChanged |= this.f300L.setLayoutDirection(i);
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
        if (W()) {
            onLevelChange |= this.f296G.setLevel(i);
        }
        if (V()) {
            onLevelChange |= this.f307S.setLevel(i);
        }
        if (X()) {
            onLevelChange |= this.f300L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // S0.g, android.graphics.drawable.Drawable, L0.i
    public final boolean onStateChange(int[] iArr) {
        if (this.f294E0) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.f340y0);
    }

    public final void s(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f300L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f340y0);
            }
            drawable.setTintList(this.f302N);
            return;
        }
        Drawable drawable2 = this.f296G;
        if (drawable == drawable2 && this.J) {
            drawable2.setTintList(this.f297H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f333t0 != i) {
            this.f333t0 = i;
            invalidateSelf();
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f334u0 != colorFilter) {
            this.f334u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f336w0 != colorStateList) {
            this.f336w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // S0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f338x0 != mode) {
            this.f338x0 = mode;
            ColorStateList colorStateList = this.f336w0;
            this.f335v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (W()) {
            visible |= this.f296G.setVisible(z2, z3);
        }
        if (V()) {
            visible |= this.f307S.setVisible(z2, z3);
        }
        if (X()) {
            visible |= this.f300L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (W() || V()) {
            float f2 = this.f311W + this.f312X;
            Drawable drawable = this.f332r0 ? this.f307S : this.f296G;
            float f3 = this.f298I;
            if (f3 <= RecyclerView.f2111C0 && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f332r0 ? this.f307S : this.f296G;
            float f6 = this.f298I;
            if (f6 <= RecyclerView.f2111C0 && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f319e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    public final float u() {
        if (!W() && !V()) {
            return RecyclerView.f2111C0;
        }
        float f2 = this.f312X;
        Drawable drawable = this.f332r0 ? this.f307S : this.f296G;
        float f3 = this.f298I;
        if (f3 <= RecyclerView.f2111C0 && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f313Y;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return X() ? this.f316b0 + this.f303O + this.f317c0 : RecyclerView.f2111C0;
    }

    public final float w() {
        return this.f294E0 ? h() : this.f285A;
    }

    public final void z() {
        e eVar = (e) this.f286A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f2459p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }
}
