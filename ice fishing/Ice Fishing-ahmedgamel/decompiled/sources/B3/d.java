package B3;

import F.q;
import S0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import k3.AbstractC4632a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f197d;

    /* renamed from: e, reason: collision with root package name */
    public final float f198e;

    /* renamed from: f, reason: collision with root package name */
    public final float f199f;

    /* renamed from: g, reason: collision with root package name */
    public final float f200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f201h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f202j;

    /* renamed from: k, reason: collision with root package name */
    public float f203k;

    /* renamed from: l, reason: collision with root package name */
    public final int f204l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f205m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f206n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4632a.f38652y);
        this.f203k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f202j = O3.b.m(context, obtainStyledAttributes, 3);
        O3.b.m(context, obtainStyledAttributes, 4);
        O3.b.m(context, obtainStyledAttributes, 5);
        this.f196c = obtainStyledAttributes.getInt(2, 0);
        this.f197d = obtainStyledAttributes.getInt(1, 1);
        int i6 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f204l = obtainStyledAttributes.getResourceId(i6, 0);
        this.f195b = obtainStyledAttributes.getString(i6);
        obtainStyledAttributes.getBoolean(14, false);
        this.f194a = O3.b.m(context, obtainStyledAttributes, 6);
        this.f198e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f199f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f200g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC4632a.f38644q);
        this.f201h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f206n;
        int i = this.f196c;
        if (typeface == null && (str = this.f195b) != null) {
            this.f206n = Typeface.create(str, i);
        }
        if (this.f206n == null) {
            int i6 = this.f197d;
            if (i6 == 1) {
                this.f206n = Typeface.SANS_SERIF;
            } else if (i6 == 2) {
                this.f206n = Typeface.SERIF;
            } else if (i6 != 3) {
                this.f206n = Typeface.DEFAULT;
            } else {
                this.f206n = Typeface.MONOSPACE;
            }
            this.f206n = Typeface.create(this.f206n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f205m) {
            return this.f206n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a9 = q.a(context, this.f204l);
                this.f206n = a9;
                if (a9 != null) {
                    this.f206n = Typeface.create(a9, this.f196c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e9) {
                Log.d("TextAppearance", "Error loading font " + this.f195b, e9);
            }
        }
        a();
        this.f205m = true;
        return this.f206n;
    }

    public final void c(Context context, f fVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f204l;
        if (i == 0) {
            this.f205m = true;
        }
        if (this.f205m) {
            fVar.q(this.f206n, true);
            return;
        }
        try {
            b bVar = new b(this, fVar);
            ThreadLocal threadLocal = q.f879a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                q.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f205m = true;
            fVar.p(1);
        } catch (Exception e9) {
            Log.d("TextAppearance", "Error loading font " + this.f195b, e9);
            this.f205m = true;
            fVar.p(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f204l;
        if (i != 0) {
            ThreadLocal threadLocal = q.f879a;
            if (!context.isRestricted()) {
                typeface = q.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f202j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f194a;
        textPaint.setShadowLayer(this.f200g, this.f198e, this.f199f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, f fVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f206n);
        c(context, new c(this, context, textPaint, fVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface s9 = V2.a.s(context.getResources().getConfiguration(), typeface);
        if (s9 != null) {
            typeface = s9;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f196c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f203k);
        if (this.f201h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
