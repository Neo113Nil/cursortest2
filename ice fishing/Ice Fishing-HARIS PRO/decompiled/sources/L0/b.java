package L0;

import O.K;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import b0.C0117a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f441A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f442B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f443C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f445E;

    /* renamed from: F, reason: collision with root package name */
    public float f446F;

    /* renamed from: G, reason: collision with root package name */
    public float f447G;

    /* renamed from: H, reason: collision with root package name */
    public float f448H;

    /* renamed from: I, reason: collision with root package name */
    public float f449I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f450K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f451L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f452M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f453N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f454O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f455P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f456Q;

    /* renamed from: R, reason: collision with root package name */
    public float f457R;

    /* renamed from: S, reason: collision with root package name */
    public float f458S;

    /* renamed from: T, reason: collision with root package name */
    public float f459T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f460U;

    /* renamed from: V, reason: collision with root package name */
    public float f461V;

    /* renamed from: W, reason: collision with root package name */
    public float f462W;

    /* renamed from: X, reason: collision with root package name */
    public float f463X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f464Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f465Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f466a;

    /* renamed from: a0, reason: collision with root package name */
    public float f467a0;

    /* renamed from: b, reason: collision with root package name */
    public float f468b;

    /* renamed from: b0, reason: collision with root package name */
    public float f469b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f470c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f471c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f472d;
    public final RectF e;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f479k;

    /* renamed from: l, reason: collision with root package name */
    public float f480l;

    /* renamed from: m, reason: collision with root package name */
    public float f481m;

    /* renamed from: n, reason: collision with root package name */
    public float f482n;

    /* renamed from: o, reason: collision with root package name */
    public float f483o;

    /* renamed from: p, reason: collision with root package name */
    public float f484p;

    /* renamed from: q, reason: collision with root package name */
    public float f485q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f486r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f487s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f488t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f489u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f490v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f491w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f492x;

    /* renamed from: y, reason: collision with root package name */
    public P0.a f493y;

    /* renamed from: f, reason: collision with root package name */
    public int f475f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f477g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f478h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f494z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f444D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f473d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f474e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f476f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f466a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f453N = textPaint;
        this.f454O = new TextPaint(textPaint);
        this.f472d = new Rect();
        this.f470c = new Rect();
        this.e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0360a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = K.f747a;
        boolean z2 = this.f466a.getLayoutDirection() == 1;
        if (this.f444D) {
            return (z2 ? M.g.f604d : M.g.f603c).c(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f441A == null) {
            return;
        }
        float width = this.f472d.width();
        float width2 = this.f470c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f461V;
            this.f446F = 1.0f;
            typeface = this.f486r;
        } else {
            float f5 = this.f478h;
            float f6 = this.f462W;
            Typeface typeface2 = this.f489u;
            if (Math.abs(f2 - RecyclerView.f2111C0) < 1.0E-5f) {
                this.f446F = 1.0f;
            } else {
                this.f446F = f(this.f478h, this.i, f2, this.f456Q) / this.f478h;
            }
            float f7 = this.i / this.f478h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f453N;
        if (width > RecyclerView.f2111C0) {
            boolean z4 = this.f447G != f3;
            boolean z5 = this.f463X != f4;
            boolean z6 = this.f492x != typeface;
            StaticLayout staticLayout = this.f464Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f452M;
            this.f447G = f3;
            this.f463X = f4;
            this.f492x = typeface;
            this.f452M = false;
            textPaint.setLinearText(this.f446F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f442B == null || z3) {
            textPaint.setTextSize(this.f447G);
            textPaint.setTypeface(this.f492x);
            textPaint.setLetterSpacing(this.f463X);
            boolean b2 = b(this.f441A);
            this.f443C = b2;
            int i = this.f473d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f475f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f443C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f443C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            h hVar = new h(this.f441A, textPaint, (int) width);
            hVar.f510k = this.f494z;
            hVar.j = b2;
            hVar.e = alignment;
            hVar.i = false;
            hVar.f507f = i;
            hVar.f508g = this.f474e0;
            hVar.f509h = this.f476f0;
            StaticLayout a2 = hVar.a();
            a2.getClass();
            this.f464Y = a2;
            this.f442B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f454O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f486r);
        textPaint.setLetterSpacing(this.f461V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f451L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f488t;
            if (typeface != null) {
                this.f487s = AbstractC0078a.P(configuration, typeface);
            }
            Typeface typeface2 = this.f491w;
            if (typeface2 != null) {
                this.f490v = AbstractC0078a.P(configuration, typeface2);
            }
            Typeface typeface3 = this.f487s;
            if (typeface3 == null) {
                typeface3 = this.f488t;
            }
            this.f486r = typeface3;
            Typeface typeface4 = this.f490v;
            if (typeface4 == null) {
                typeface4 = this.f491w;
            }
            this.f489u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f466a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f442B;
        TextPaint textPaint = this.f453N;
        if (charSequence != null && (staticLayout = this.f464Y) != null) {
            this.f471c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f494z);
        }
        CharSequence charSequence2 = this.f471c0;
        if (charSequence2 != null) {
            this.f465Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f465Z = RecyclerView.f2111C0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f477g, this.f443C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f472d;
        if (i == 48) {
            this.f481m = rect.top;
        } else if (i != 80) {
            this.f481m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f481m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f483o = rect.centerX() - (this.f465Z / 2.0f);
        } else if (i2 != 5) {
            this.f483o = rect.left;
        } else {
            this.f483o = rect.right - this.f465Z;
        }
        c(RecyclerView.f2111C0, z2);
        float height = this.f464Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f464Y;
        if (staticLayout2 == null || this.f473d0 <= 1) {
            CharSequence charSequence3 = this.f442B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f464Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f475f, this.f443C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f470c;
        if (i3 == 48) {
            this.f480l = rect2.top;
        } else if (i3 != 80) {
            this.f480l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f480l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f482n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f482n = rect2.left;
        } else {
            this.f482n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f445E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f445E = null;
        }
        l(this.f468b);
        float f2 = this.f468b;
        float f3 = f(rect2.left, rect.left, f2, this.f455P);
        RectF rectF = this.e;
        rectF.left = f3;
        rectF.top = f(this.f480l, this.f481m, f2, this.f455P);
        rectF.right = f(rect2.right, rect.right, f2, this.f455P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f455P);
        this.f484p = f(this.f482n, this.f483o, f2, this.f455P);
        this.f485q = f(this.f480l, this.f481m, f2, this.f455P);
        l(f2);
        C0117a c0117a = AbstractC0360a.f4481b;
        this.f467a0 = 1.0f - f(RecyclerView.f2111C0, 1.0f, 1.0f - f2, c0117a);
        WeakHashMap weakHashMap = K.f747a;
        textInputLayout.postInvalidateOnAnimation();
        this.f469b0 = f(1.0f, RecyclerView.f2111C0, f2, c0117a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f479k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f479k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f461V;
        float f5 = this.f462W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0117a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f448H = AbstractC0360a.a(RecyclerView.f2111C0, this.f457R, f2);
        this.f449I = AbstractC0360a.a(RecyclerView.f2111C0, this.f458S, f2);
        this.J = AbstractC0360a.a(RecyclerView.f2111C0, this.f459T, f2);
        int a2 = a(0, e(this.f460U), f2);
        this.f450K = a2;
        textPaint.setShadowLayer(this.f448H, this.f449I, this.J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f479k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f479k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        P0.a aVar = this.f493y;
        if (aVar != null) {
            aVar.f895g = true;
        }
        if (this.f488t == typeface) {
            return false;
        }
        this.f488t = typeface;
        Typeface P2 = AbstractC0078a.P(this.f466a.getContext().getResources().getConfiguration(), typeface);
        this.f487s = P2;
        if (P2 == null) {
            P2 = this.f488t;
        }
        this.f486r = P2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f2111C0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f468b) {
            this.f468b = f2;
            float f3 = this.f470c.left;
            Rect rect = this.f472d;
            float f4 = f(f3, rect.left, f2, this.f455P);
            RectF rectF = this.e;
            rectF.left = f4;
            rectF.top = f(this.f480l, this.f481m, f2, this.f455P);
            rectF.right = f(r1.right, rect.right, f2, this.f455P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f455P);
            this.f484p = f(this.f482n, this.f483o, f2, this.f455P);
            this.f485q = f(this.f480l, this.f481m, f2, this.f455P);
            l(f2);
            C0117a c0117a = AbstractC0360a.f4481b;
            this.f467a0 = 1.0f - f(RecyclerView.f2111C0, 1.0f, 1.0f - f2, c0117a);
            WeakHashMap weakHashMap = K.f747a;
            TextInputLayout textInputLayout = this.f466a;
            textInputLayout.postInvalidateOnAnimation();
            this.f469b0 = f(1.0f, RecyclerView.f2111C0, f2, c0117a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f479k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f453N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f479k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f461V;
            float f6 = this.f462W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0117a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f448H = AbstractC0360a.a(RecyclerView.f2111C0, this.f457R, f2);
            this.f449I = AbstractC0360a.a(RecyclerView.f2111C0, this.f458S, f2);
            this.J = AbstractC0360a.a(RecyclerView.f2111C0, this.f459T, f2);
            int a2 = a(0, e(this.f460U), f2);
            this.f450K = a2;
            textPaint.setShadowLayer(this.f448H, this.f449I, this.J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = K.f747a;
        this.f466a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j = j(typeface);
        if (this.f491w != typeface) {
            this.f491w = typeface;
            Typeface P2 = AbstractC0078a.P(this.f466a.getContext().getResources().getConfiguration(), typeface);
            this.f490v = P2;
            if (P2 == null) {
                P2 = this.f491w;
            }
            this.f489u = P2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j || z2) {
            h(false);
        }
    }
}
