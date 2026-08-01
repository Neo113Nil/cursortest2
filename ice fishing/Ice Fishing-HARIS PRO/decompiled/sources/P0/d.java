package P0;

import F.o;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f900a;

    /* renamed from: b, reason: collision with root package name */
    public final String f901b;

    /* renamed from: c, reason: collision with root package name */
    public final int f902c;

    /* renamed from: d, reason: collision with root package name */
    public final int f903d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f904f;

    /* renamed from: g, reason: collision with root package name */
    public final float f905g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f906h;
    public final float i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public float f907k;

    /* renamed from: l, reason: collision with root package name */
    public final int f908l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f909m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f910n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0358a.f4435F);
        this.f907k = obtainStyledAttributes.getDimension(0, RecyclerView.f2111C0);
        this.j = AbstractC0078a.B(context, obtainStyledAttributes, 3);
        AbstractC0078a.B(context, obtainStyledAttributes, 4);
        AbstractC0078a.B(context, obtainStyledAttributes, 5);
        this.f902c = obtainStyledAttributes.getInt(2, 0);
        this.f903d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f908l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f901b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f900a = AbstractC0078a.B(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, RecyclerView.f2111C0);
        this.f904f = obtainStyledAttributes.getFloat(8, RecyclerView.f2111C0);
        this.f905g = obtainStyledAttributes.getFloat(9, RecyclerView.f2111C0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0358a.f4456u);
        this.f906h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, RecyclerView.f2111C0);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f910n;
        int i = this.f902c;
        if (typeface == null && (str = this.f901b) != null) {
            this.f910n = Typeface.create(str, i);
        }
        if (this.f910n == null) {
            int i2 = this.f903d;
            if (i2 == 1) {
                this.f910n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f910n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f910n = Typeface.DEFAULT;
            } else {
                this.f910n = Typeface.MONOSPACE;
            }
            this.f910n = Typeface.create(this.f910n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f909m) {
            return this.f910n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = o.a(context, this.f908l);
                this.f910n = a2;
                if (a2 != null) {
                    this.f910n = Typeface.create(a2, this.f902c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f901b, e);
            }
        }
        a();
        this.f909m = true;
        return this.f910n;
    }

    public final void c(Context context, AbstractC0078a abstractC0078a) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f908l;
        if (i == 0) {
            this.f909m = true;
        }
        if (this.f909m) {
            abstractC0078a.S(this.f910n, true);
            return;
        }
        try {
            b bVar = new b(this, abstractC0078a);
            ThreadLocal threadLocal = o.f221a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                o.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f909m = true;
            abstractC0078a.R(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f901b, e);
            this.f909m = true;
            abstractC0078a.R(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f908l;
        if (i != 0) {
            ThreadLocal threadLocal = o.f221a;
            if (!context.isRestricted()) {
                typeface = o.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, AbstractC0078a abstractC0078a) {
        f(context, textPaint, abstractC0078a);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f900a;
        textPaint.setShadowLayer(this.f905g, this.e, this.f904f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, AbstractC0078a abstractC0078a) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f910n);
        c(context, new c(this, context, textPaint, abstractC0078a));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface P2 = AbstractC0078a.P(context.getResources().getConfiguration(), typeface);
        if (P2 != null) {
            typeface = P2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f902c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.f2111C0);
        textPaint.setTextSize(this.f907k);
        if (this.f906h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
