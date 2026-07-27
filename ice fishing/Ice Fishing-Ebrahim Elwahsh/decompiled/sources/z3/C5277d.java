package z3;

import F.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import i3.AbstractC4576a;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5277d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f42163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42165c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42166d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42167e;

    /* renamed from: f, reason: collision with root package name */
    public final float f42168f;

    /* renamed from: g, reason: collision with root package name */
    public final float f42169g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f42170h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f42171j;

    /* renamed from: k, reason: collision with root package name */
    public float f42172k;

    /* renamed from: l, reason: collision with root package name */
    public final int f42173l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42174m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f42175n;

    public C5277d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4576a.f38315y);
        this.f42172k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f42171j = com.bumptech.glide.d.o(context, obtainStyledAttributes, 3);
        com.bumptech.glide.d.o(context, obtainStyledAttributes, 4);
        com.bumptech.glide.d.o(context, obtainStyledAttributes, 5);
        this.f42165c = obtainStyledAttributes.getInt(2, 0);
        this.f42166d = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f42173l = obtainStyledAttributes.getResourceId(i4, 0);
        this.f42164b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f42163a = com.bumptech.glide.d.o(context, obtainStyledAttributes, 6);
        this.f42167e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f42168f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f42169g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC4576a.f38307q);
        this.f42170h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f42175n;
        int i = this.f42165c;
        if (typeface == null && (str = this.f42164b) != null) {
            this.f42175n = Typeface.create(str, i);
        }
        if (this.f42175n == null) {
            int i4 = this.f42166d;
            if (i4 == 1) {
                this.f42175n = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f42175n = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f42175n = Typeface.DEFAULT;
            } else {
                this.f42175n = Typeface.MONOSPACE;
            }
            this.f42175n = Typeface.create(this.f42175n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f42174m) {
            return this.f42175n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a9 = o.a(context, this.f42173l);
                this.f42175n = a9;
                if (a9 != null) {
                    this.f42175n = Typeface.create(a9, this.f42165c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f42164b, e6);
            }
        }
        a();
        this.f42174m = true;
        return this.f42175n;
    }

    public final void c(Context context, e eVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f42173l;
        if (i == 0) {
            this.f42174m = true;
        }
        if (this.f42174m) {
            eVar.v(this.f42175n, true);
            return;
        }
        try {
            C5275b c5275b = new C5275b(this, eVar);
            ThreadLocal threadLocal = o.f927a;
            if (context.isRestricted()) {
                c5275b.a(-4);
            } else {
                o.b(context, i, new TypedValue(), 0, c5275b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f42174m = true;
            eVar.u(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f42164b, e6);
            this.f42174m = true;
            eVar.u(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f42173l;
        if (i != 0) {
            ThreadLocal threadLocal = o.f927a;
            if (!context.isRestricted()) {
                typeface = o.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, e eVar) {
        f(context, textPaint, eVar);
        ColorStateList colorStateList = this.f42171j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f42163a;
        textPaint.setShadowLayer(this.f42169g, this.f42167e, this.f42168f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, e eVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f42175n);
        c(context, new C5276c(this, context, textPaint, eVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface l9 = f.l(context.getResources().getConfiguration(), typeface);
        if (l9 != null) {
            typeface = l9;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f42165c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f42172k);
        if (this.f42170h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
