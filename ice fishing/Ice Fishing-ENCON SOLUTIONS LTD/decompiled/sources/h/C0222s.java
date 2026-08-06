package h;

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
import c.AbstractC0131a;
import d.AbstractC0142a;

/* renamed from: h.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3338a;

    /* renamed from: b, reason: collision with root package name */
    public J1.h f3339b;

    /* renamed from: c, reason: collision with root package name */
    public J1.h f3340c;

    /* renamed from: d, reason: collision with root package name */
    public J1.h f3341d;

    /* renamed from: e, reason: collision with root package name */
    public J1.h f3342e;

    /* renamed from: f, reason: collision with root package name */
    public J1.h f3343f;

    /* renamed from: g, reason: collision with root package name */
    public J1.h f3344g;

    /* renamed from: h, reason: collision with root package name */
    public J1.h f3345h;

    /* renamed from: i, reason: collision with root package name */
    public final C0224u f3346i;

    /* renamed from: j, reason: collision with root package name */
    public int f3347j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3348k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3349l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3350m;

    public C0222s(TextView textView) {
        this.f3338a = textView;
        this.f3346i = new C0224u(textView);
    }

    public static J1.h c(Context context, C0219o c0219o, int i2) {
        ColorStateList f2;
        synchronized (c0219o) {
            f2 = c0219o.f3312a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        J1.h hVar = new J1.h();
        hVar.f867b = true;
        hVar.f868c = f2;
        return hVar;
    }

    public final void a(Drawable drawable, J1.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C0219o.c(drawable, hVar, this.f3338a.getDrawableState());
    }

    public final void b() {
        J1.h hVar = this.f3339b;
        TextView textView = this.f3338a;
        if (hVar != null || this.f3340c != null || this.f3341d != null || this.f3342e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3339b);
            a(compoundDrawables[1], this.f3340c);
            a(compoundDrawables[2], this.f3341d);
            a(compoundDrawables[3], this.f3342e);
        }
        if (this.f3343f == null && this.f3344g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3343f);
        a(compoundDrawablesRelative[2], this.f3344g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0331, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C0219o c0219o;
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
        TextView textView = this.f3338a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0219o.f3310b;
        synchronized (C0219o.class) {
            try {
                if (C0219o.f3311c == null) {
                    C0219o.b();
                }
                c0219o = C0219o.f3311c;
            } catch (Throwable th) {
                throw th;
            }
        }
        I0.b H2 = I0.b.H(context, attributeSet, AbstractC0131a.f2623f, i2);
        TypedArray typedArray = (TypedArray) H2.f722c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3339b = c(context, c0219o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3340c = c(context, c0219o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3341d = c(context, c0219o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3342e = c(context, c0219o, typedArray.getResourceId(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3343f = c(context, c0219o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3344g = c(context, c0219o, typedArray.getResourceId(6, 0));
        }
        H2.K();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0131a.f2636s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            I0.b bVar = new I0.b(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, bVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            bVar.K();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        I0.b bVar2 = new I0.b(context, obtainStyledAttributes2);
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
        f(context, bVar2);
        bVar2.K();
        if (!z5 && z2) {
            this.f3338a.setAllCaps(z4);
        }
        Typeface typeface = this.f3349l;
        if (typeface != null) {
            if (this.f3348k == -1) {
                textView.setTypeface(typeface, this.f3347j);
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
        int[] iArr2 = AbstractC0131a.f2624g;
        C0224u c0224u = this.f3346i;
        Context context2 = c0224u.f3367j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0224u.f3358a = obtainStyledAttributes3.getInt(5, 0);
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
                c0224u.f3363f = C0224u.b(iArr3);
                c0224u.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0224u.f3358a == 1) {
            if (!c0224u.f3364g) {
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
                c0224u.i(dimension2, dimension3, dimension);
            }
            c0224u.g();
        }
        if (C.c.f104M && c0224u.f3358a != 0) {
            int[] iArr4 = c0224u.f3363f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0224u.f3361d), Math.round(c0224u.f3362e), Math.round(c0224u.f3360c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a2 = resourceId4 != -1 ? c0219o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a3 = resourceId5 != -1 ? c0219o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a4 = resourceId6 != -1 ? c0219o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a5 = resourceId7 != -1 ? c0219o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a6 = resourceId8 != -1 ? c0219o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a7 = resourceId9 != -1 ? c0219o.a(context, resourceId9) : null;
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
                Object obj = AbstractC0142a.f2825a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            C.o.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            C.o.g(textView, AbstractC0227x.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i3);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            R1.l.C(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            R1.l.D(textView, dimensionPixelSize2);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0131a.f2636s);
        I0.b bVar = new I0.b(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3338a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, bVar);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        bVar.K();
        Typeface typeface = this.f3349l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3347j);
        }
    }

    public final void f(Context context, I0.b bVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f3347j;
        TypedArray typedArray = (TypedArray) bVar.f722c;
        this.f3347j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3348k = i4;
            if (i4 != -1) {
                this.f3347j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3350m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3349l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3349l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3349l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3349l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3348k;
        int i8 = this.f3347j;
        if (!context.isRestricted()) {
            try {
                Typeface B2 = bVar.B(i6, this.f3347j, new Q1.A(this, i7, i8));
                if (B2 != null) {
                    if (i3 < 28 || this.f3348k == -1) {
                        this.f3349l = B2;
                    } else {
                        create2 = Typeface.create(Typeface.create(B2, 0), this.f3348k, (this.f3347j & 2) != 0);
                        this.f3349l = create2;
                    }
                }
                this.f3350m = this.f3349l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3349l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3348k == -1) {
            this.f3349l = Typeface.create(string, this.f3347j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f3348k, (this.f3347j & 2) != 0);
            this.f3349l = create;
        }
    }
}
