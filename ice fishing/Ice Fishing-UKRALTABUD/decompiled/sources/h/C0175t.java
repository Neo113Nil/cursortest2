package h;

import L.C0051b;
import a.AbstractC0069a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import c.AbstractC0097a;
import d.AbstractC0110a;

/* renamed from: h.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2273a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f2274b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f2275c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2276d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2277e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2278f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f2279g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f2280h;

    /* renamed from: i, reason: collision with root package name */
    public final C0177v f2281i;

    /* renamed from: j, reason: collision with root package name */
    public int f2282j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2283k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2284l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2285m;

    public C0175t(TextView textView) {
        this.f2273a = textView;
        this.f2281i = new C0177v(textView);
    }

    public static j0 c(Context context, C0171o c0171o, int i2) {
        ColorStateList f2;
        synchronized (c0171o) {
            f2 = c0171o.f2237a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.f2212d = true;
        j0Var.f2209a = f2;
        return j0Var;
    }

    public final void a(Drawable drawable, j0 j0Var) {
        if (drawable == null || j0Var == null) {
            return;
        }
        C0171o.c(drawable, j0Var, this.f2273a.getDrawableState());
    }

    public final void b() {
        j0 j0Var = this.f2274b;
        TextView textView = this.f2273a;
        if (j0Var != null || this.f2275c != null || this.f2276d != null || this.f2277e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2274b);
            a(compoundDrawables[1], this.f2275c);
            a(compoundDrawables[2], this.f2276d);
            a(compoundDrawables[3], this.f2277e);
        }
        if (this.f2278f == null && this.f2279g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2278f);
        a(compoundDrawablesRelative[2], this.f2279g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0331, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C0171o c0171o;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i4;
        int resourceId2;
        TextView textView = this.f2273a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0171o.f2235b;
        synchronized (C0171o.class) {
            try {
                if (C0171o.f2236c == null) {
                    C0171o.b();
                }
                c0171o = C0171o.f2236c;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0051b E2 = C0051b.E(context, attributeSet, AbstractC0097a.f1634f, i2);
        TypedArray typedArray = (TypedArray) E2.f602g;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2274b = c(context, c0171o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2275c = c(context, c0171o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2276d = c(context, c0171o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2277e = c(context, c0171o, typedArray.getResourceId(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2278f = c(context, c0171o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2279g = c(context, c0171o, typedArray.getResourceId(6, 0));
        }
        E2.H();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0097a.f1646s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            C0051b c0051b = new C0051b(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, c0051b);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0051b.H();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0051b c0051b2 = new C0051b(context, obtainStyledAttributes2);
        if (z5 || !obtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0051b2);
        c0051b2.H();
        if (!z5 && z2) {
            this.f2273a.setAllCaps(z4);
        }
        Typeface typeface = this.f2284l;
        if (typeface != null) {
            if (this.f2283k == -1) {
                textView.setTypeface(typeface, this.f2282j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            textView.setFontVariationSettings(str);
        }
        if (str2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        int[] iArr2 = AbstractC0097a.f1635g;
        C0177v c0177v = this.f2281i;
        Context context2 = c0177v.f2309j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0177v.f2300a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0177v.f2305f = C0177v.b(iArr3);
                c0177v.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0177v.f2300a == 1) {
            if (!c0177v.f2306g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0177v.i(dimension2, dimension3, dimension);
            }
            c0177v.g();
        }
        if (A.c.f11a && c0177v.f2300a != 0) {
            int[] iArr4 = c0177v.f2305f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0177v.f2303d), Math.round(c0177v.f2304e), Math.round(c0177v.f2302c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a2 = resourceId4 != -1 ? c0171o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a3 = resourceId5 != -1 ? c0171o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a4 = resourceId6 != -1 ? c0171o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a5 = resourceId7 != -1 ? c0171o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a6 = resourceId8 != -1 ? c0171o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a7 = resourceId9 != -1 ? c0171o.a(context, resourceId9) : null;
        if (a6 != null || a7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a6 == null) {
                a6 = compoundDrawablesRelative[0];
            }
            if (a3 == null) {
                a3 = compoundDrawablesRelative[1];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[2];
            }
            if (a5 == null) {
                a5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a6, a3, a7, a5);
        } else if (a2 != null || a3 != null || a4 != null || a5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a2 == null) {
                    a2 = compoundDrawables[0];
                }
                if (a3 == null) {
                    a3 = compoundDrawables[1];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[2];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a2, a3, a4, a5);
            } else {
                if (a3 == null) {
                    a3 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a5 == null) {
                    a5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a3, drawable2, a5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) != 0) {
                Object obj = AbstractC0110a.f1772a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            A.o.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            A.o.g(textView, AbstractC0180y.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i3);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            AbstractC0069a.D(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            AbstractC0069a.E(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0097a.f1646s);
        C0051b c0051b = new C0051b(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2273a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0051b);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0051b.H();
        Typeface typeface = this.f2284l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2282j);
        }
    }

    public final void f(Context context, C0051b c0051b) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f2282j;
        TypedArray typedArray = (TypedArray) c0051b.f602g;
        this.f2282j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2283k = i4;
            if (i4 != -1) {
                this.f2282j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2285m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2284l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2284l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2284l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2284l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2283k;
        int i8 = this.f2282j;
        if (!context.isRestricted()) {
            try {
                Typeface y2 = c0051b.y(i6, this.f2282j, new C0174s(this, i7, i8));
                if (y2 != null) {
                    if (i3 < 28 || this.f2283k == -1) {
                        this.f2284l = y2;
                    } else {
                        create2 = Typeface.create(Typeface.create(y2, 0), this.f2283k, (this.f2282j & 2) != 0);
                        this.f2284l = create2;
                    }
                }
                this.f2285m = this.f2284l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2284l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2283k == -1) {
            this.f2284l = Typeface.create(string, this.f2282j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f2283k, (this.f2282j & 2) != 0);
            this.f2284l = create;
        }
    }
}
