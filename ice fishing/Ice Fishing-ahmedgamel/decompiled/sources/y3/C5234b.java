package y3;

import O.X;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import g0.C4519a;
import java.util.WeakHashMap;
import l3.AbstractC4661a;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5234b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f41847A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f41848B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f41849C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f41851E;

    /* renamed from: F, reason: collision with root package name */
    public float f41852F;

    /* renamed from: G, reason: collision with root package name */
    public float f41853G;

    /* renamed from: H, reason: collision with root package name */
    public float f41854H;

    /* renamed from: I, reason: collision with root package name */
    public float f41855I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f41856K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f41857L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f41858M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f41859N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f41860O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f41861P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f41862Q;

    /* renamed from: R, reason: collision with root package name */
    public float f41863R;

    /* renamed from: S, reason: collision with root package name */
    public float f41864S;

    /* renamed from: T, reason: collision with root package name */
    public float f41865T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f41866U;

    /* renamed from: V, reason: collision with root package name */
    public float f41867V;

    /* renamed from: W, reason: collision with root package name */
    public float f41868W;

    /* renamed from: X, reason: collision with root package name */
    public float f41869X;
    public StaticLayout Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f41870Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f41871a;

    /* renamed from: a0, reason: collision with root package name */
    public float f41872a0;

    /* renamed from: b, reason: collision with root package name */
    public float f41873b;

    /* renamed from: b0, reason: collision with root package name */
    public float f41874b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f41875c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f41876c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f41877d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f41879e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f41885j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f41886k;

    /* renamed from: l, reason: collision with root package name */
    public float f41887l;

    /* renamed from: m, reason: collision with root package name */
    public float f41888m;

    /* renamed from: n, reason: collision with root package name */
    public float f41889n;

    /* renamed from: o, reason: collision with root package name */
    public float f41890o;

    /* renamed from: p, reason: collision with root package name */
    public float f41891p;

    /* renamed from: q, reason: collision with root package name */
    public float f41892q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f41893r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f41894s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f41895t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f41896u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f41897v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f41898w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f41899x;

    /* renamed from: y, reason: collision with root package name */
    public B3.a f41900y;

    /* renamed from: f, reason: collision with root package name */
    public int f41881f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f41883g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f41884h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f41901z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f41850D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f41878d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f41880e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f41882f0 = 1;

    public C5234b(TextInputLayout textInputLayout) {
        this.f41871a = textInputLayout;
        TextPaint textPaint = new TextPaint(com.anythink.expressad.video.module.a.a.f21730T);
        this.f41859N = textPaint;
        this.f41860O = new TextPaint(textPaint);
        this.f41877d = new Rect();
        this.f41875c = new Rect();
        this.f41879e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i6, float f3) {
        float f9 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i6) * f3) + (Color.alpha(i) * f9)), Math.round((Color.red(i6) * f3) + (Color.red(i) * f9)), Math.round((Color.green(i6) * f3) + (Color.green(i) * f9)), Math.round((Color.blue(i6) * f3) + (Color.blue(i) * f9)));
    }

    public static float f(float f3, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return AbstractC4661a.a(f3, f9, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2054a;
        boolean z3 = this.f41871a.getLayoutDirection() == 1;
        if (this.f41850D) {
            return (z3 ? M.h.f1778d : M.h.f1777c).e(charSequence, charSequence.length());
        }
        return z3;
    }

    public final void c(float f3, boolean z3) {
        float f9;
        float f10;
        Typeface typeface;
        boolean z6;
        Layout.Alignment alignment;
        if (this.f41847A == null) {
            return;
        }
        float width = this.f41877d.width();
        float width2 = this.f41875c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f9 = this.i;
            f10 = this.f41867V;
            this.f41852F = 1.0f;
            typeface = this.f41893r;
        } else {
            float f11 = this.f41884h;
            float f12 = this.f41868W;
            Typeface typeface2 = this.f41896u;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.f41852F = 1.0f;
            } else {
                this.f41852F = f(this.f41884h, this.i, f3, this.f41862Q) / this.f41884h;
            }
            float f13 = this.i / this.f41884h;
            width = (z3 || width2 * f13 <= width) ? width2 : Math.min(width / f13, width2);
            f9 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f41859N;
        if (width > 0.0f) {
            boolean z9 = this.f41853G != f9;
            boolean z10 = this.f41869X != f10;
            boolean z11 = this.f41899x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z12 = z9 || z10 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z11 || this.f41858M;
            this.f41853G = f9;
            this.f41869X = f10;
            this.f41899x = typeface;
            this.f41858M = false;
            textPaint.setLinearText(this.f41852F != 1.0f);
            z6 = z12;
        } else {
            z6 = false;
        }
        if (this.f41848B == null || z6) {
            textPaint.setTextSize(this.f41853G);
            textPaint.setTypeface(this.f41899x);
            textPaint.setLetterSpacing(this.f41869X);
            boolean b9 = b(this.f41847A);
            this.f41849C = b9;
            int i = this.f41878d0;
            if (i <= 1 || b9) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f41881f, b9 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f41849C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f41849C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C5239g c5239g = new C5239g(this.f41847A, textPaint, (int) width);
            c5239g.f41918k = this.f41901z;
            c5239g.f41917j = b9;
            c5239g.f41913e = alignment;
            c5239g.i = false;
            c5239g.f41914f = i;
            c5239g.f41915g = this.f41880e0;
            c5239g.f41916h = this.f41882f0;
            StaticLayout a9 = c5239g.a();
            a9.getClass();
            this.Y = a9;
            this.f41848B = a9.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f41860O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f41893r);
        textPaint.setLetterSpacing(this.f41867V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f41857L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f41895t;
            if (typeface != null) {
                this.f41894s = V2.a.s(configuration, typeface);
            }
            Typeface typeface2 = this.f41898w;
            if (typeface2 != null) {
                this.f41897v = V2.a.s(configuration, typeface2);
            }
            Typeface typeface3 = this.f41894s;
            if (typeface3 == null) {
                typeface3 = this.f41895t;
            }
            this.f41893r = typeface3;
            Typeface typeface4 = this.f41897v;
            if (typeface4 == null) {
                typeface4 = this.f41898w;
            }
            this.f41896u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z3) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f41871a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        c(1.0f, z3);
        CharSequence charSequence = this.f41848B;
        TextPaint textPaint = this.f41859N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f41876c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f41901z);
        }
        CharSequence charSequence2 = this.f41876c0;
        if (charSequence2 != null) {
            this.f41870Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f41870Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f41883g, this.f41849C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f41877d;
        if (i == 48) {
            this.f41888m = rect.top;
        } else if (i != 80) {
            this.f41888m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f41888m = textPaint.ascent() + rect.bottom;
        }
        int i6 = absoluteGravity & 8388615;
        if (i6 == 1) {
            this.f41890o = rect.centerX() - (this.f41870Z / 2.0f);
        } else if (i6 != 5) {
            this.f41890o = rect.left;
        } else {
            this.f41890o = rect.right - this.f41870Z;
        }
        c(0.0f, z3);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.f41878d0 <= 1) {
            CharSequence charSequence3 = this.f41848B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f41881f, this.f41849C ? 1 : 0);
        int i9 = absoluteGravity2 & 112;
        Rect rect2 = this.f41875c;
        if (i9 == 48) {
            this.f41887l = rect2.top;
        } else if (i9 != 80) {
            this.f41887l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f41887l = textPaint.descent() + (rect2.bottom - height);
        }
        int i10 = absoluteGravity2 & 8388615;
        if (i10 == 1) {
            this.f41889n = rect2.centerX() - (measureText / 2.0f);
        } else if (i10 != 5) {
            this.f41889n = rect2.left;
        } else {
            this.f41889n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f41851E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41851E = null;
        }
        l(this.f41873b);
        float f3 = this.f41873b;
        float f9 = f(rect2.left, rect.left, f3, this.f41861P);
        RectF rectF = this.f41879e;
        rectF.left = f9;
        rectF.top = f(this.f41887l, this.f41888m, f3, this.f41861P);
        rectF.right = f(rect2.right, rect.right, f3, this.f41861P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f3, this.f41861P);
        this.f41891p = f(this.f41889n, this.f41890o, f3, this.f41861P);
        this.f41892q = f(this.f41887l, this.f41888m, f3, this.f41861P);
        l(f3);
        C4519a c4519a = AbstractC4661a.f38904b;
        this.f41872a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, c4519a);
        WeakHashMap weakHashMap = X.f2054a;
        textInputLayout.postInvalidateOnAnimation();
        this.f41874b0 = f(1.0f, 0.0f, f3, c4519a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f41886k;
        ColorStateList colorStateList2 = this.f41885j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f41886k), f3));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f10 = this.f41867V;
        float f11 = this.f41868W;
        if (f10 != f11) {
            textPaint.setLetterSpacing(f(f11, f10, f3, c4519a));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.f41854H = AbstractC4661a.a(0.0f, this.f41863R, f3);
        this.f41855I = AbstractC4661a.a(0.0f, this.f41864S, f3);
        this.J = AbstractC4661a.a(0.0f, this.f41865T, f3);
        int a9 = a(0, e(this.f41866U), f3);
        this.f41856K = a9;
        textPaint.setShadowLayer(this.f41854H, this.f41855I, this.J, a9);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f41886k == colorStateList && this.f41885j == colorStateList) {
            return;
        }
        this.f41886k = colorStateList;
        this.f41885j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        B3.a aVar = this.f41900y;
        if (aVar != null) {
            aVar.f188v = true;
        }
        if (this.f41895t == typeface) {
            return false;
        }
        this.f41895t = typeface;
        Typeface s9 = V2.a.s(this.f41871a.getContext().getResources().getConfiguration(), typeface);
        this.f41894s = s9;
        if (s9 == null) {
            s9 = this.f41895t;
        }
        this.f41893r = s9;
        return true;
    }

    public final void k(float f3) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 != this.f41873b) {
            this.f41873b = f3;
            float f9 = this.f41875c.left;
            Rect rect = this.f41877d;
            float f10 = f(f9, rect.left, f3, this.f41861P);
            RectF rectF = this.f41879e;
            rectF.left = f10;
            rectF.top = f(this.f41887l, this.f41888m, f3, this.f41861P);
            rectF.right = f(r1.right, rect.right, f3, this.f41861P);
            rectF.bottom = f(r1.bottom, rect.bottom, f3, this.f41861P);
            this.f41891p = f(this.f41889n, this.f41890o, f3, this.f41861P);
            this.f41892q = f(this.f41887l, this.f41888m, f3, this.f41861P);
            l(f3);
            C4519a c4519a = AbstractC4661a.f38904b;
            this.f41872a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, c4519a);
            WeakHashMap weakHashMap = X.f2054a;
            TextInputLayout textInputLayout = this.f41871a;
            textInputLayout.postInvalidateOnAnimation();
            this.f41874b0 = f(1.0f, 0.0f, f3, c4519a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f41886k;
            ColorStateList colorStateList2 = this.f41885j;
            TextPaint textPaint = this.f41859N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f41886k), f3));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.f41867V;
            float f12 = this.f41868W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, f3, c4519a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f41854H = AbstractC4661a.a(0.0f, this.f41863R, f3);
            this.f41855I = AbstractC4661a.a(0.0f, this.f41864S, f3);
            this.J = AbstractC4661a.a(0.0f, this.f41865T, f3);
            int a9 = a(0, e(this.f41866U), f3);
            this.f41856K = a9;
            textPaint.setShadowLayer(this.f41854H, this.f41855I, this.J, a9);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f3) {
        c(f3, false);
        WeakHashMap weakHashMap = X.f2054a;
        this.f41871a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z3;
        boolean j6 = j(typeface);
        if (this.f41898w != typeface) {
            this.f41898w = typeface;
            Typeface s9 = V2.a.s(this.f41871a.getContext().getResources().getConfiguration(), typeface);
            this.f41897v = s9;
            if (s9 == null) {
                s9 = this.f41898w;
            }
            this.f41896u = s9;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j6 || z3) {
            h(false);
        }
    }
}
