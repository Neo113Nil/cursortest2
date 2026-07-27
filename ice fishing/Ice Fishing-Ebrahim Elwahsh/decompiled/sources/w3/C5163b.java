package w3;

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
import j3.AbstractC4596a;
import java.util.WeakHashMap;
import z3.C5274a;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5163b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f41595A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f41596B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f41597C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f41599E;

    /* renamed from: F, reason: collision with root package name */
    public float f41600F;

    /* renamed from: G, reason: collision with root package name */
    public float f41601G;

    /* renamed from: H, reason: collision with root package name */
    public float f41602H;

    /* renamed from: I, reason: collision with root package name */
    public float f41603I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f41604K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f41605L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f41606M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f41607N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f41608O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f41609P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f41610Q;

    /* renamed from: R, reason: collision with root package name */
    public float f41611R;

    /* renamed from: S, reason: collision with root package name */
    public float f41612S;

    /* renamed from: T, reason: collision with root package name */
    public float f41613T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f41614U;

    /* renamed from: V, reason: collision with root package name */
    public float f41615V;

    /* renamed from: W, reason: collision with root package name */
    public float f41616W;

    /* renamed from: X, reason: collision with root package name */
    public float f41617X;
    public StaticLayout Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f41618Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f41619a;

    /* renamed from: a0, reason: collision with root package name */
    public float f41620a0;

    /* renamed from: b, reason: collision with root package name */
    public float f41621b;

    /* renamed from: b0, reason: collision with root package name */
    public float f41622b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f41623c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f41624c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f41625d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f41627e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f41633j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f41634k;

    /* renamed from: l, reason: collision with root package name */
    public float f41635l;

    /* renamed from: m, reason: collision with root package name */
    public float f41636m;

    /* renamed from: n, reason: collision with root package name */
    public float f41637n;

    /* renamed from: o, reason: collision with root package name */
    public float f41638o;

    /* renamed from: p, reason: collision with root package name */
    public float f41639p;

    /* renamed from: q, reason: collision with root package name */
    public float f41640q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f41641r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f41642s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f41643t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f41644u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f41645v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f41646w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f41647x;

    /* renamed from: y, reason: collision with root package name */
    public C5274a f41648y;

    /* renamed from: f, reason: collision with root package name */
    public int f41629f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f41631g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f41632h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f41649z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f41598D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f41626d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f41628e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f41630f0 = 1;

    public C5163b(TextInputLayout textInputLayout) {
        this.f41619a = textInputLayout;
        TextPaint textPaint = new TextPaint(com.anythink.expressad.video.module.a.a.f21888T);
        this.f41607N = textPaint;
        this.f41608O = new TextPaint(textPaint);
        this.f41625d = new Rect();
        this.f41623c = new Rect();
        this.f41627e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i4, float f6) {
        float f9 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i4) * f6) + (Color.alpha(i) * f9)), Math.round((Color.red(i4) * f6) + (Color.red(i) * f9)), Math.round((Color.green(i4) * f6) + (Color.green(i) * f9)), Math.round((Color.blue(i4) * f6) + (Color.blue(i) * f9)));
    }

    public static float f(float f6, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return AbstractC4596a.a(f6, f9, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2240a;
        boolean z8 = this.f41619a.getLayoutDirection() == 1;
        if (this.f41598D) {
            return (z8 ? M.i.f1832d : M.i.f1831c).c(charSequence, charSequence.length());
        }
        return z8;
    }

    public final void c(float f6, boolean z8) {
        float f9;
        float f10;
        Typeface typeface;
        boolean z9;
        Layout.Alignment alignment;
        if (this.f41595A == null) {
            return;
        }
        float width = this.f41625d.width();
        float width2 = this.f41623c.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            f9 = this.i;
            f10 = this.f41615V;
            this.f41600F = 1.0f;
            typeface = this.f41641r;
        } else {
            float f11 = this.f41632h;
            float f12 = this.f41616W;
            Typeface typeface2 = this.f41644u;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.f41600F = 1.0f;
            } else {
                this.f41600F = f(this.f41632h, this.i, f6, this.f41610Q) / this.f41632h;
            }
            float f13 = this.i / this.f41632h;
            width = (z8 || width2 * f13 <= width) ? width2 : Math.min(width / f13, width2);
            f9 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f41607N;
        if (width > 0.0f) {
            boolean z10 = this.f41601G != f9;
            boolean z11 = this.f41617X != f10;
            boolean z12 = this.f41647x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z13 = z10 || z11 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || this.f41606M;
            this.f41601G = f9;
            this.f41617X = f10;
            this.f41647x = typeface;
            this.f41606M = false;
            textPaint.setLinearText(this.f41600F != 1.0f);
            z9 = z13;
        } else {
            z9 = false;
        }
        if (this.f41596B == null || z9) {
            textPaint.setTextSize(this.f41601G);
            textPaint.setTypeface(this.f41647x);
            textPaint.setLetterSpacing(this.f41617X);
            boolean b9 = b(this.f41595A);
            this.f41597C = b9;
            int i = this.f41626d0;
            if (i <= 1 || b9) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f41629f, b9 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f41597C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f41597C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C5168g c5168g = new C5168g(this.f41595A, textPaint, (int) width);
            c5168g.f41666k = this.f41649z;
            c5168g.f41665j = b9;
            c5168g.f41661e = alignment;
            c5168g.i = false;
            c5168g.f41662f = i;
            c5168g.f41663g = this.f41628e0;
            c5168g.f41664h = this.f41630f0;
            StaticLayout a9 = c5168g.a();
            a9.getClass();
            this.Y = a9;
            this.f41596B = a9.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f41608O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f41641r);
        textPaint.setLetterSpacing(this.f41615V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f41605L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f41643t;
            if (typeface != null) {
                this.f41642s = com.bumptech.glide.f.l(configuration, typeface);
            }
            Typeface typeface2 = this.f41646w;
            if (typeface2 != null) {
                this.f41645v = com.bumptech.glide.f.l(configuration, typeface2);
            }
            Typeface typeface3 = this.f41642s;
            if (typeface3 == null) {
                typeface3 = this.f41643t;
            }
            this.f41641r = typeface3;
            Typeface typeface4 = this.f41645v;
            if (typeface4 == null) {
                typeface4 = this.f41646w;
            }
            this.f41644u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z8) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f41619a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z8) {
            return;
        }
        c(1.0f, z8);
        CharSequence charSequence = this.f41596B;
        TextPaint textPaint = this.f41607N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f41624c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f41649z);
        }
        CharSequence charSequence2 = this.f41624c0;
        if (charSequence2 != null) {
            this.f41618Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f41618Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f41631g, this.f41597C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f41625d;
        if (i == 48) {
            this.f41636m = rect.top;
        } else if (i != 80) {
            this.f41636m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f41636m = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f41638o = rect.centerX() - (this.f41618Z / 2.0f);
        } else if (i4 != 5) {
            this.f41638o = rect.left;
        } else {
            this.f41638o = rect.right - this.f41618Z;
        }
        c(0.0f, z8);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.f41626d0 <= 1) {
            CharSequence charSequence3 = this.f41596B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f41629f, this.f41597C ? 1 : 0);
        int i9 = absoluteGravity2 & 112;
        Rect rect2 = this.f41623c;
        if (i9 == 48) {
            this.f41635l = rect2.top;
        } else if (i9 != 80) {
            this.f41635l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f41635l = textPaint.descent() + (rect2.bottom - height);
        }
        int i10 = absoluteGravity2 & 8388615;
        if (i10 == 1) {
            this.f41637n = rect2.centerX() - (measureText / 2.0f);
        } else if (i10 != 5) {
            this.f41637n = rect2.left;
        } else {
            this.f41637n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f41599E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41599E = null;
        }
        l(this.f41621b);
        float f6 = this.f41621b;
        float f9 = f(rect2.left, rect.left, f6, this.f41609P);
        RectF rectF = this.f41627e;
        rectF.left = f9;
        rectF.top = f(this.f41635l, this.f41636m, f6, this.f41609P);
        rectF.right = f(rect2.right, rect.right, f6, this.f41609P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f6, this.f41609P);
        this.f41639p = f(this.f41637n, this.f41638o, f6, this.f41609P);
        this.f41640q = f(this.f41635l, this.f41636m, f6, this.f41609P);
        l(f6);
        C4519a c4519a = AbstractC4596a.f38542b;
        this.f41620a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, c4519a);
        WeakHashMap weakHashMap = X.f2240a;
        textInputLayout.postInvalidateOnAnimation();
        this.f41622b0 = f(1.0f, 0.0f, f6, c4519a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f41634k;
        ColorStateList colorStateList2 = this.f41633j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f41634k), f6));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f10 = this.f41615V;
        float f11 = this.f41616W;
        if (f10 != f11) {
            textPaint.setLetterSpacing(f(f11, f10, f6, c4519a));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.f41602H = AbstractC4596a.a(0.0f, this.f41611R, f6);
        this.f41603I = AbstractC4596a.a(0.0f, this.f41612S, f6);
        this.J = AbstractC4596a.a(0.0f, this.f41613T, f6);
        int a9 = a(0, e(this.f41614U), f6);
        this.f41604K = a9;
        textPaint.setShadowLayer(this.f41602H, this.f41603I, this.J, a9);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f41634k == colorStateList && this.f41633j == colorStateList) {
            return;
        }
        this.f41634k = colorStateList;
        this.f41633j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        C5274a c5274a = this.f41648y;
        if (c5274a != null) {
            c5274a.i = true;
        }
        if (this.f41643t == typeface) {
            return false;
        }
        this.f41643t = typeface;
        Typeface l9 = com.bumptech.glide.f.l(this.f41619a.getContext().getResources().getConfiguration(), typeface);
        this.f41642s = l9;
        if (l9 == null) {
            l9 = this.f41643t;
        }
        this.f41641r = l9;
        return true;
    }

    public final void k(float f6) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f41621b) {
            this.f41621b = f6;
            float f9 = this.f41623c.left;
            Rect rect = this.f41625d;
            float f10 = f(f9, rect.left, f6, this.f41609P);
            RectF rectF = this.f41627e;
            rectF.left = f10;
            rectF.top = f(this.f41635l, this.f41636m, f6, this.f41609P);
            rectF.right = f(r1.right, rect.right, f6, this.f41609P);
            rectF.bottom = f(r1.bottom, rect.bottom, f6, this.f41609P);
            this.f41639p = f(this.f41637n, this.f41638o, f6, this.f41609P);
            this.f41640q = f(this.f41635l, this.f41636m, f6, this.f41609P);
            l(f6);
            C4519a c4519a = AbstractC4596a.f38542b;
            this.f41620a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, c4519a);
            WeakHashMap weakHashMap = X.f2240a;
            TextInputLayout textInputLayout = this.f41619a;
            textInputLayout.postInvalidateOnAnimation();
            this.f41622b0 = f(1.0f, 0.0f, f6, c4519a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f41634k;
            ColorStateList colorStateList2 = this.f41633j;
            TextPaint textPaint = this.f41607N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f41634k), f6));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.f41615V;
            float f12 = this.f41616W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, f6, c4519a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f41602H = AbstractC4596a.a(0.0f, this.f41611R, f6);
            this.f41603I = AbstractC4596a.a(0.0f, this.f41612S, f6);
            this.J = AbstractC4596a.a(0.0f, this.f41613T, f6);
            int a9 = a(0, e(this.f41614U), f6);
            this.f41604K = a9;
            textPaint.setShadowLayer(this.f41602H, this.f41603I, this.J, a9);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap weakHashMap = X.f2240a;
        this.f41619a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z8;
        boolean j9 = j(typeface);
        if (this.f41646w != typeface) {
            this.f41646w = typeface;
            Typeface l9 = com.bumptech.glide.f.l(this.f41619a.getContext().getResources().getConfiguration(), typeface);
            this.f41645v = l9;
            if (l9 == null) {
                l9 = this.f41646w;
            }
            this.f41644u = l9;
            z8 = true;
        } else {
            z8 = false;
        }
        if (j9 || z8) {
            h(false);
        }
    }
}
