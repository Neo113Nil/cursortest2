package A3;

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
import g0.C4529a;
import java.util.WeakHashMap;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f98A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f99B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f100C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f102E;

    /* renamed from: F, reason: collision with root package name */
    public float f103F;

    /* renamed from: G, reason: collision with root package name */
    public float f104G;

    /* renamed from: H, reason: collision with root package name */
    public float f105H;

    /* renamed from: I, reason: collision with root package name */
    public float f106I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f107K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f108L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f109M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f110N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f111O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f112P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f113Q;

    /* renamed from: R, reason: collision with root package name */
    public float f114R;

    /* renamed from: S, reason: collision with root package name */
    public float f115S;

    /* renamed from: T, reason: collision with root package name */
    public float f116T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f117U;

    /* renamed from: V, reason: collision with root package name */
    public float f118V;

    /* renamed from: W, reason: collision with root package name */
    public float f119W;

    /* renamed from: X, reason: collision with root package name */
    public float f120X;
    public StaticLayout Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f121Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f122a;

    /* renamed from: a0, reason: collision with root package name */
    public float f123a0;

    /* renamed from: b, reason: collision with root package name */
    public float f124b;

    /* renamed from: b0, reason: collision with root package name */
    public float f125b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f126c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f127c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f128d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f130e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f136j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f137k;

    /* renamed from: l, reason: collision with root package name */
    public float f138l;

    /* renamed from: m, reason: collision with root package name */
    public float f139m;

    /* renamed from: n, reason: collision with root package name */
    public float f140n;

    /* renamed from: o, reason: collision with root package name */
    public float f141o;

    /* renamed from: p, reason: collision with root package name */
    public float f142p;

    /* renamed from: q, reason: collision with root package name */
    public float f143q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f144r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f145s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f146t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f147u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f148v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f149w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f150x;

    /* renamed from: y, reason: collision with root package name */
    public D3.a f151y;

    /* renamed from: f, reason: collision with root package name */
    public int f132f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f134g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f135h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f152z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f101D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f129d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f131e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f133f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f122a = textInputLayout;
        TextPaint textPaint = new TextPaint(com.anythink.expressad.video.module.a.a.f22517T);
        this.f110N = textPaint;
        this.f111O = new TextPaint(textPaint);
        this.f128d = new Rect();
        this.f126c = new Rect();
        this.f130e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i4, float f2) {
        float f9 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i4) * f2) + (Color.alpha(i) * f9)), Math.round((Color.red(i4) * f2) + (Color.red(i) * f9)), Math.round((Color.green(i4) * f2) + (Color.green(i) * f9)), Math.round((Color.blue(i4) * f2) + (Color.blue(i) * f9)));
    }

    public static float f(float f2, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return AbstractC4770a.a(f2, f9, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2142a;
        boolean z6 = this.f122a.getLayoutDirection() == 1;
        if (this.f101D) {
            return (z6 ? M.i.f1811d : M.i.f1810c).f(charSequence, charSequence.length());
        }
        return z6;
    }

    public final void c(float f2, boolean z6) {
        float f9;
        float f10;
        Typeface typeface;
        boolean z9;
        Layout.Alignment alignment;
        if (this.f98A == null) {
            return;
        }
        float width = this.f128d.width();
        float width2 = this.f126c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f9 = this.i;
            f10 = this.f118V;
            this.f103F = 1.0f;
            typeface = this.f144r;
        } else {
            float f11 = this.f135h;
            float f12 = this.f119W;
            Typeface typeface2 = this.f147u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f103F = 1.0f;
            } else {
                this.f103F = f(this.f135h, this.i, f2, this.f113Q) / this.f135h;
            }
            float f13 = this.i / this.f135h;
            width = (z6 || width2 * f13 <= width) ? width2 : Math.min(width / f13, width2);
            f9 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f110N;
        if (width > 0.0f) {
            boolean z10 = this.f104G != f9;
            boolean z11 = this.f120X != f10;
            boolean z12 = this.f150x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z13 = z10 || z11 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || this.f109M;
            this.f104G = f9;
            this.f120X = f10;
            this.f150x = typeface;
            this.f109M = false;
            textPaint.setLinearText(this.f103F != 1.0f);
            z9 = z13;
        } else {
            z9 = false;
        }
        if (this.f99B == null || z9) {
            textPaint.setTextSize(this.f104G);
            textPaint.setTypeface(this.f150x);
            textPaint.setLetterSpacing(this.f120X);
            boolean b9 = b(this.f98A);
            this.f100C = b9;
            int i = this.f129d0;
            if (i <= 1 || b9) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f132f, b9 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f100C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f100C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f98A, textPaint, (int) width);
            iVar.f169k = this.f152z;
            iVar.f168j = b9;
            iVar.f164e = alignment;
            iVar.i = false;
            iVar.f165f = i;
            iVar.f166g = this.f131e0;
            iVar.f167h = this.f133f0;
            StaticLayout a9 = iVar.a();
            a9.getClass();
            this.Y = a9;
            this.f99B = a9.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f111O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f144r);
        textPaint.setLetterSpacing(this.f118V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f108L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f146t;
            if (typeface != null) {
                this.f145s = com.bumptech.glide.h.i(configuration, typeface);
            }
            Typeface typeface2 = this.f149w;
            if (typeface2 != null) {
                this.f148v = com.bumptech.glide.h.i(configuration, typeface2);
            }
            Typeface typeface3 = this.f145s;
            if (typeface3 == null) {
                typeface3 = this.f146t;
            }
            this.f144r = typeface3;
            Typeface typeface4 = this.f148v;
            if (typeface4 == null) {
                typeface4 = this.f149w;
            }
            this.f147u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z6) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f122a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z6) {
            return;
        }
        c(1.0f, z6);
        CharSequence charSequence = this.f99B;
        TextPaint textPaint = this.f110N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f127c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f152z);
        }
        CharSequence charSequence2 = this.f127c0;
        if (charSequence2 != null) {
            this.f121Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f121Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f134g, this.f100C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f128d;
        if (i == 48) {
            this.f139m = rect.top;
        } else if (i != 80) {
            this.f139m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f139m = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f141o = rect.centerX() - (this.f121Z / 2.0f);
        } else if (i4 != 5) {
            this.f141o = rect.left;
        } else {
            this.f141o = rect.right - this.f121Z;
        }
        c(0.0f, z6);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.f129d0 <= 1) {
            CharSequence charSequence3 = this.f99B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f132f, this.f100C ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.f126c;
        if (i6 == 48) {
            this.f138l = rect2.top;
        } else if (i6 != 80) {
            this.f138l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f138l = textPaint.descent() + (rect2.bottom - height);
        }
        int i9 = absoluteGravity2 & 8388615;
        if (i9 == 1) {
            this.f140n = rect2.centerX() - (measureText / 2.0f);
        } else if (i9 != 5) {
            this.f140n = rect2.left;
        } else {
            this.f140n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f102E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f102E = null;
        }
        l(this.f124b);
        float f2 = this.f124b;
        float f9 = f(rect2.left, rect.left, f2, this.f112P);
        RectF rectF = this.f130e;
        rectF.left = f9;
        rectF.top = f(this.f138l, this.f139m, f2, this.f112P);
        rectF.right = f(rect2.right, rect.right, f2, this.f112P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f112P);
        this.f142p = f(this.f140n, this.f141o, f2, this.f112P);
        this.f143q = f(this.f138l, this.f139m, f2, this.f112P);
        l(f2);
        C4529a c4529a = AbstractC4770a.f39642b;
        this.f123a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c4529a);
        WeakHashMap weakHashMap = X.f2142a;
        textInputLayout.postInvalidateOnAnimation();
        this.f125b0 = f(1.0f, 0.0f, f2, c4529a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f137k;
        ColorStateList colorStateList2 = this.f136j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f137k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f10 = this.f118V;
        float f11 = this.f119W;
        if (f10 != f11) {
            textPaint.setLetterSpacing(f(f11, f10, f2, c4529a));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.f105H = AbstractC4770a.a(0.0f, this.f114R, f2);
        this.f106I = AbstractC4770a.a(0.0f, this.f115S, f2);
        this.J = AbstractC4770a.a(0.0f, this.f116T, f2);
        int a9 = a(0, e(this.f117U), f2);
        this.f107K = a9;
        textPaint.setShadowLayer(this.f105H, this.f106I, this.J, a9);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f137k == colorStateList && this.f136j == colorStateList) {
            return;
        }
        this.f137k = colorStateList;
        this.f136j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        D3.a aVar = this.f151y;
        if (aVar != null) {
            aVar.f607c = true;
        }
        if (this.f146t == typeface) {
            return false;
        }
        this.f146t = typeface;
        Typeface i = com.bumptech.glide.h.i(this.f122a.getContext().getResources().getConfiguration(), typeface);
        this.f145s = i;
        if (i == null) {
            i = this.f146t;
        }
        this.f144r = i;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f124b) {
            this.f124b = f2;
            float f9 = this.f126c.left;
            Rect rect = this.f128d;
            float f10 = f(f9, rect.left, f2, this.f112P);
            RectF rectF = this.f130e;
            rectF.left = f10;
            rectF.top = f(this.f138l, this.f139m, f2, this.f112P);
            rectF.right = f(r1.right, rect.right, f2, this.f112P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f112P);
            this.f142p = f(this.f140n, this.f141o, f2, this.f112P);
            this.f143q = f(this.f138l, this.f139m, f2, this.f112P);
            l(f2);
            C4529a c4529a = AbstractC4770a.f39642b;
            this.f123a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c4529a);
            WeakHashMap weakHashMap = X.f2142a;
            TextInputLayout textInputLayout = this.f122a;
            textInputLayout.postInvalidateOnAnimation();
            this.f125b0 = f(1.0f, 0.0f, f2, c4529a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f137k;
            ColorStateList colorStateList2 = this.f136j;
            TextPaint textPaint = this.f110N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f137k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.f118V;
            float f12 = this.f119W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, f2, c4529a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f105H = AbstractC4770a.a(0.0f, this.f114R, f2);
            this.f106I = AbstractC4770a.a(0.0f, this.f115S, f2);
            this.J = AbstractC4770a.a(0.0f, this.f116T, f2);
            int a9 = a(0, e(this.f117U), f2);
            this.f107K = a9;
            textPaint.setShadowLayer(this.f105H, this.f106I, this.J, a9);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = X.f2142a;
        this.f122a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z6;
        boolean j6 = j(typeface);
        if (this.f149w != typeface) {
            this.f149w = typeface;
            Typeface i = com.bumptech.glide.h.i(this.f122a.getContext().getResources().getConfiguration(), typeface);
            this.f148v = i;
            if (i == null) {
                i = this.f149w;
            }
            this.f147u = i;
            z6 = true;
        } else {
            z6 = false;
        }
        if (j6 || z6) {
            h(false);
        }
    }
}
