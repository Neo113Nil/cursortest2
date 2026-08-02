package D3;

import F.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.bumptech.glide.f;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f613a;

    /* renamed from: b, reason: collision with root package name */
    public final String f614b;

    /* renamed from: c, reason: collision with root package name */
    public final int f615c;

    /* renamed from: d, reason: collision with root package name */
    public final int f616d;

    /* renamed from: e, reason: collision with root package name */
    public final float f617e;

    /* renamed from: f, reason: collision with root package name */
    public final float f618f;

    /* renamed from: g, reason: collision with root package name */
    public final float f619g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f620h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f621j;

    /* renamed from: k, reason: collision with root package name */
    public float f622k;

    /* renamed from: l, reason: collision with root package name */
    public final int f623l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f624m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f625n;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4742a.f39441y);
        this.f622k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f621j = f.j(context, obtainStyledAttributes, 3);
        f.j(context, obtainStyledAttributes, 4);
        f.j(context, obtainStyledAttributes, 5);
        this.f615c = obtainStyledAttributes.getInt(2, 0);
        this.f616d = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f623l = obtainStyledAttributes.getResourceId(i4, 0);
        this.f614b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f613a = f.j(context, obtainStyledAttributes, 6);
        this.f617e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f618f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f619g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC4742a.f39433q);
        this.f620h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f625n;
        int i = this.f615c;
        if (typeface == null && (str = this.f614b) != null) {
            this.f625n = Typeface.create(str, i);
        }
        if (this.f625n == null) {
            int i4 = this.f616d;
            if (i4 == 1) {
                this.f625n = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f625n = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f625n = Typeface.DEFAULT;
            } else {
                this.f625n = Typeface.MONOSPACE;
            }
            this.f625n = Typeface.create(this.f625n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f624m) {
            return this.f625n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a9 = q.a(context, this.f623l);
                this.f625n = a9;
                if (a9 != null) {
                    this.f625n = Typeface.create(a9, this.f615c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e9) {
                Log.d("TextAppearance", "Error loading font " + this.f614b, e9);
            }
        }
        a();
        this.f624m = true;
        return this.f625n;
    }

    public final void c(Context context, g gVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f623l;
        if (i == 0) {
            this.f624m = true;
        }
        if (this.f624m) {
            gVar.w(this.f625n, true);
            return;
        }
        try {
            b bVar = new b(this, gVar);
            ThreadLocal threadLocal = q.f942a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                q.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f624m = true;
            gVar.v(1);
        } catch (Exception e9) {
            Log.d("TextAppearance", "Error loading font " + this.f614b, e9);
            this.f624m = true;
            gVar.v(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i = this.f623l;
        if (i != 0) {
            ThreadLocal threadLocal = q.f942a;
            if (!context.isRestricted()) {
                typeface = q.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, g gVar) {
        f(context, textPaint, gVar);
        ColorStateList colorStateList = this.f621j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f613a;
        textPaint.setShadowLayer(this.f619g, this.f617e, this.f618f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, g gVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f625n);
        c(context, new c(this, context, textPaint, gVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface i = h.i(context.getResources().getConfiguration(), typeface);
        if (i != null) {
            typeface = i;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f615c;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f622k);
        if (this.f620h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
