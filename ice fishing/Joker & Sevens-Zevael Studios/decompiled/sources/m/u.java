package m;

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
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4465a;

    /* renamed from: b, reason: collision with root package name */
    public l1 f4466b;

    /* renamed from: c, reason: collision with root package name */
    public l1 f4467c;

    /* renamed from: d, reason: collision with root package name */
    public l1 f4468d;

    /* renamed from: e, reason: collision with root package name */
    public l1 f4469e;

    /* renamed from: f, reason: collision with root package name */
    public l1 f4470f;

    /* renamed from: g, reason: collision with root package name */
    public l1 f4471g;

    /* renamed from: h, reason: collision with root package name */
    public l1 f4472h;

    /* renamed from: i, reason: collision with root package name */
    public final z f4473i;

    /* renamed from: j, reason: collision with root package name */
    public int f4474j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4475k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f4476l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4477m;

    public u(TextView textView) {
        this.f4465a = textView;
        this.f4473i = new z(textView);
    }

    public static l1 c(Context context, o oVar, int i10) {
        ColorStateList f10;
        synchronized (oVar) {
            f10 = oVar.f4399a.f(context, i10);
        }
        if (f10 == null) {
            return null;
        }
        l1 l1Var = new l1();
        l1Var.f4383d = true;
        l1Var.f4380a = f10;
        return l1Var;
    }

    public final void a(Drawable drawable, l1 l1Var) {
        if (drawable == null || l1Var == null) {
            return;
        }
        o.c(drawable, l1Var, this.f4465a.getDrawableState());
    }

    public final void b() {
        l1 l1Var = this.f4466b;
        TextView textView = this.f4465a;
        if (l1Var != null || this.f4467c != null || this.f4468d != null || this.f4469e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4466b);
            a(compoundDrawables[1], this.f4467c);
            a(compoundDrawables[2], this.f4468d);
            a(compoundDrawables[3], this.f4469e);
        }
        if (this.f4470f == null && this.f4471g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f4470f);
        a(compoundDrawablesRelative[2], this.f4471g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x034f, code lost:
    
        if (r3 != null) goto L218;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i10) {
        o oVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f10;
        float f11;
        char c3;
        ColorStateList colorStateList;
        int resourceId;
        int i11;
        int resourceId2;
        int[] iArr = i.a.f2916g;
        int[] iArr2 = i.a.f2927r;
        z zVar = this.f4473i;
        TextView textView = this.f4465a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = o.f4397b;
        synchronized (o.class) {
            try {
                if (o.f4398c == null) {
                    o.b();
                }
                oVar = o.f4398c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = i.a.f2915f;
        a5.c C = a5.c.C(context, attributeSet, iArr3, i10);
        TextView textView2 = this.f4465a;
        h3.w.a(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) C.f261g, i10);
        TypedArray typedArray = (TypedArray) C.f261g;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f4466b = c(context, oVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f4467c = c(context, oVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f4468d = c(context, oVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f4469e = c(context, oVar, typedArray.getResourceId(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f4470f = c(context, oVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f4471g = c(context, oVar, typedArray.getResourceId(6, 0));
        }
        C.F();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            a5.c cVar = new a5.c(context, obtainStyledAttributes);
            if (z12 || !obtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z11 = true;
            }
            f(context, cVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            cVar.F();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        a5.c cVar2 = new a5.c(context, obtainStyledAttributes2);
        if (!z12 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z11 = true;
        }
        boolean z13 = z10;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, cVar2);
        cVar2.F();
        if (!z12 && z11) {
            this.f4465a.setAllCaps(z13);
        }
        Typeface typeface = this.f4476l;
        if (typeface != null) {
            if (this.f4475k == -1) {
                textView.setTypeface(typeface, this.f4474j);
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
        Context context2 = zVar.f4506j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView3 = zVar.f4505i;
        h3.w.a(textView3, textView3.getContext(), iArr, attributeSet, obtainStyledAttributes3, i10);
        if (obtainStyledAttributes3.hasValue(5)) {
            zVar.f4497a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(1)) {
            f11 = obtainStyledAttributes3.getDimension(1, -1.0f);
            f10 = -1.0f;
        } else {
            f10 = -1.0f;
            f11 = -1.0f;
        }
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            c3 = 3;
        } else {
            c3 = 3;
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                zVar.f4502f = z.b(iArr4);
                zVar.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (zVar.f4497a == 1) {
            if (!zVar.f4503g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f10) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (f11 == f10) {
                    f11 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                if (dimension == f10) {
                    dimension = 1.0f;
                }
                zVar.i(dimension2, f11, dimension);
            }
            zVar.g();
        }
        if (l3.b.f4131b && zVar.f4497a != 0) {
            int[] iArr5 = zVar.f4502f;
            if (iArr5.length > 0) {
                if (textView.getAutoSizeStepGranularity() != f10) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(zVar.f4500d), Math.round(zVar.f4501e), Math.round(zVar.f4499c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a6 = resourceId4 != -1 ? oVar.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a8 = resourceId5 != -1 ? oVar.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a10 = resourceId6 != -1 ? oVar.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a11 = resourceId7 != -1 ? oVar.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a12 = resourceId8 != -1 ? oVar.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a13 = resourceId9 != -1 ? oVar.a(context, resourceId9) : null;
        if (a12 != null || a13 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a12 == null) {
                a12 = compoundDrawablesRelative[0];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[1];
            }
            if (a13 == null) {
                a13 = compoundDrawablesRelative[2];
            }
            if (a11 == null) {
                a11 = compoundDrawablesRelative[c3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a12, a8, a13, a11);
        } else if (a6 != null || a8 != null || a10 != null || a11 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a6 == null) {
                    a6 = compoundDrawables[0];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[1];
                }
                if (a10 == null) {
                    a10 = compoundDrawables[2];
                }
                if (a11 == null) {
                    a11 = compoundDrawables[c3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a6, a8, a10, a11);
            } else {
                if (a8 == null) {
                    a8 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a11 == null) {
                    a11 = compoundDrawablesRelative2[c3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a8, drawable2, a11);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) != 0) {
                Object obj = j.a.f3284a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(c0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            v6.a.S(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            v6.a.T(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i10) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, i.a.f2927r);
        a5.c cVar = new a5.c(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4465a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, cVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        cVar.F();
        Typeface typeface = this.f4476l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4474j);
        }
    }

    public final void f(Context context, a5.c cVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i10 = this.f4474j;
        TypedArray typedArray = (TypedArray) cVar.f261g;
        this.f4474j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f4475k = i12;
            if (i12 != -1) {
                this.f4474j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4477m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f4476l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f4476l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f4476l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4476l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f4475k;
        int i16 = this.f4474j;
        if (!context.isRestricted()) {
            try {
                Typeface w3 = cVar.w(i14, this.f4474j, new s(this, i15, i16, new WeakReference(this.f4465a)));
                if (w3 != null) {
                    if (i11 < 28 || this.f4475k == -1) {
                        this.f4476l = w3;
                    } else {
                        create2 = Typeface.create(Typeface.create(w3, 0), this.f4475k, (this.f4474j & 2) != 0);
                        this.f4476l = create2;
                    }
                }
                this.f4477m = this.f4476l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4476l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4475k == -1) {
            this.f4476l = Typeface.create(string, this.f4474j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f4475k, (this.f4474j & 2) != 0);
            this.f4476l = create;
        }
    }
}
