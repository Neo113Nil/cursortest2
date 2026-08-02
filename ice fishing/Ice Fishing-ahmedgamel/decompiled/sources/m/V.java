package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.internal.ads.Wv;
import g.AbstractC4528a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39133a;

    /* renamed from: b, reason: collision with root package name */
    public i8.h f39134b;

    /* renamed from: c, reason: collision with root package name */
    public i8.h f39135c;

    /* renamed from: d, reason: collision with root package name */
    public i8.h f39136d;

    /* renamed from: e, reason: collision with root package name */
    public i8.h f39137e;

    /* renamed from: f, reason: collision with root package name */
    public i8.h f39138f;

    /* renamed from: g, reason: collision with root package name */
    public i8.h f39139g;

    /* renamed from: h, reason: collision with root package name */
    public i8.h f39140h;
    public final C4697e0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f39141j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f39142k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f39143l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39144m;

    public V(TextView textView) {
        this.f39133a = textView;
        this.i = new C4697e0(textView);
    }

    public static i8.h c(Context context, C4723s c4723s, int i) {
        ColorStateList f2;
        synchronized (c4723s) {
            f2 = c4723s.f39292a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        i8.h hVar = new i8.h();
        hVar.f38242b = true;
        hVar.f38243c = f2;
        return hVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i9 = i4 > i6 ? i6 : i4;
        if (i4 <= i6) {
            i4 = i6;
        }
        int length = text.length();
        if (i9 < 0 || i4 > length) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i10 = editorInfo.inputType & 4095;
        if (i10 == 129 || i10 == 225 || i10 == 18) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            T.c.a(editorInfo, text, i9, i4);
            return;
        }
        int i11 = i4 - i9;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int min = Math.min(text.length() - i4, i13 - Math.min(i9, (int) (i13 * 0.8d)));
        int min2 = Math.min(i9, i13 - min);
        int i14 = i9 - min2;
        if (Character.isLowSurrogate(text.charAt(i14))) {
            i14++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
            min--;
        }
        int i15 = min2 + i12;
        T.c.a(editorInfo, i12 != i11 ? TextUtils.concat(text.subSequence(i14, i14 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i14, i15 + min + i14), min2, i15);
    }

    public final void a(Drawable drawable, i8.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C4723s.e(drawable, hVar, this.f39133a.getDrawableState());
    }

    public final void b() {
        i8.h hVar = this.f39134b;
        TextView textView = this.f39133a;
        if (hVar != null || this.f39135c != null || this.f39136d != null || this.f39137e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f39134b);
            a(compoundDrawables[1], this.f39135c);
            a(compoundDrawables[2], this.f39136d);
            a(compoundDrawables[3], this.f39137e);
        }
        if (this.f39138f == null && this.f39139g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f39138f);
        a(compoundDrawablesRelative[2], this.f39139g);
    }

    public final ColorStateList d() {
        i8.h hVar = this.f39140h;
        if (hVar != null) {
            return (ColorStateList) hVar.f38243c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        i8.h hVar = this.f39140h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f38244d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z6;
        boolean z9;
        String str;
        String str2;
        int i4;
        float f2;
        int i6;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = this.f39133a;
        Context context = textView.getContext();
        C4723s a9 = C4723s.a();
        int[] iArr = AbstractC4528a.f37557h;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, i);
        O.X.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) s9.f38917v, i);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f39134b = c(context, a9, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f39135c = c(context, a9, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f39136d = c(context, a9, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f39137e = c(context, a9, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f39138f = c(context, a9, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f39139g = c(context, a9, typedArray.getResourceId(6, 0));
        }
        s9.t();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC4528a.f37571w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            l4.g gVar = new l4.g(context, obtainStyledAttributes);
            if (z10 || !obtainStyledAttributes.hasValue(14)) {
                z6 = false;
                z9 = false;
            } else {
                z9 = obtainStyledAttributes.getBoolean(14, false);
                z6 = true;
            }
            n(context, gVar);
            int i10 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i10 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            gVar.t();
        } else {
            z6 = false;
            z9 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        l4.g gVar2 = new l4.g(context, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z9 = obtainStyledAttributes2.getBoolean(14, false);
            z6 = true;
        }
        boolean z11 = z9;
        int i11 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i11 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar2);
        gVar2.t();
        if (!z10 && z6) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f39143l;
        if (typeface != null) {
            if (this.f39142k == -1) {
                textView.setTypeface(typeface, this.f39141j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            T.d(textView, str);
        }
        if (str2 != null) {
            S.b(textView, S.a(str2));
        }
        int[] iArr3 = AbstractC4528a.i;
        C4697e0 c4697e0 = this.i;
        Context context2 = c4697e0.f39210j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c4697e0.i;
        O.X.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c4697e0.f39202a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                c4697e0.f39207f = C4697e0.b(iArr4);
                c4697e0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c4697e0.j()) {
            c4697e0.f39202a = 0;
        } else if (c4697e0.f39202a == 1) {
            if (!c4697e0.f39208g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                float f9 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c4697e0.k(dimension2, f9, dimension);
            }
            c4697e0.h();
        }
        if (g1.f39219c && c4697e0.f39202a != 0) {
            int[] iArr5 = c4697e0.f39207f;
            if (iArr5.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(c4697e0.f39205d), Math.round(c4697e0.f39206e), Math.round(c4697e0.f39204c), 0);
                } else {
                    T.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b9 = resourceId4 != -1 ? a9.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b10 = resourceId5 != -1 ? a9.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b11 = resourceId6 != -1 ? a9.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b12 = resourceId7 != -1 ? a9.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b13 = resourceId8 != -1 ? a9.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b14 = resourceId9 != -1 ? a9.b(context, resourceId9) : null;
        if (b13 != null || b14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b13 == null) {
                b13 = compoundDrawablesRelative[0];
            }
            if (b10 == null) {
                b10 = compoundDrawablesRelative[1];
            }
            if (b14 == null) {
                b14 = compoundDrawablesRelative[2];
            }
            if (b12 == null) {
                b12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b13, b10, b14, b12);
        } else if (b9 != null || b10 != null || b11 != null || b12 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b9 == null) {
                    b9 = compoundDrawables[0];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[1];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[2];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b9, b10, b11, b12);
            } else {
                if (b10 == null) {
                    b10 = compoundDrawablesRelative2[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b10, compoundDrawablesRelative2[2], b12);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = E.e.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            U.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            U.m.g(textView, AbstractC4707j0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i13 = peekValue.data;
                i6 = i13 & 15;
                f2 = TypedValue.complexToFloat(i13);
                i4 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i4) {
                    d6.c.k(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i4) {
                    d6.c.l(textView, dimensionPixelSize2);
                }
                if (f2 == -1.0f) {
                    if (i6 == i4) {
                        d6.c.m(textView, (int) f2);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        U.p.a(textView, i6, f2);
                        return;
                    } else {
                        d6.c.m(textView, Math.round(TypedValue.applyDimension(i6, f2, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            f2 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            f2 = -1.0f;
        }
        i6 = i4;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
        }
        if (dimensionPixelSize2 != i4) {
        }
        if (f2 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4528a.f37571w);
        l4.g gVar = new l4.g(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f39133a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            T.d(textView, string);
        }
        gVar.t();
        Typeface typeface = this.f39143l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f39141j);
        }
    }

    public final void i(int i, int i4, int i6, int i9) {
        C4697e0 c4697e0 = this.i;
        if (c4697e0.j()) {
            DisplayMetrics displayMetrics = c4697e0.f39210j.getResources().getDisplayMetrics();
            c4697e0.k(TypedValue.applyDimension(i9, i, displayMetrics), TypedValue.applyDimension(i9, i4, displayMetrics), TypedValue.applyDimension(i9, i6, displayMetrics));
            if (c4697e0.h()) {
                c4697e0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C4697e0 c4697e0 = this.i;
        if (c4697e0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c4697e0.f39210j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i, iArr[i4], displayMetrics));
                    }
                }
                c4697e0.f39207f = C4697e0.b(iArr2);
                if (!c4697e0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c4697e0.f39208g = false;
            }
            if (c4697e0.h()) {
                c4697e0.a();
            }
        }
    }

    public final void k(int i) {
        C4697e0 c4697e0 = this.i;
        if (c4697e0.j()) {
            if (i == 0) {
                c4697e0.f39202a = 0;
                c4697e0.f39205d = -1.0f;
                c4697e0.f39206e = -1.0f;
                c4697e0.f39204c = -1.0f;
                c4697e0.f39207f = new int[0];
                c4697e0.f39203b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(Wv.f(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c4697e0.f39210j.getResources().getDisplayMetrics();
            c4697e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c4697e0.h()) {
                c4697e0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f39140h == null) {
            this.f39140h = new i8.h();
        }
        i8.h hVar = this.f39140h;
        hVar.f38243c = colorStateList;
        hVar.f38242b = colorStateList != null;
        this.f39134b = hVar;
        this.f39135c = hVar;
        this.f39136d = hVar;
        this.f39137e = hVar;
        this.f39138f = hVar;
        this.f39139g = hVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f39140h == null) {
            this.f39140h = new i8.h();
        }
        i8.h hVar = this.f39140h;
        hVar.f38244d = mode;
        hVar.f38241a = mode != null;
        this.f39134b = hVar;
        this.f39135c = hVar;
        this.f39136d = hVar;
        this.f39137e = hVar;
        this.f39138f = hVar;
        this.f39139g = hVar;
    }

    public final void n(Context context, l4.g gVar) {
        String string;
        int i = this.f39141j;
        TypedArray typedArray = (TypedArray) gVar.f38917v;
        this.f39141j = typedArray.getInt(2, i);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f39142k = i6;
            if (i6 != -1) {
                this.f39141j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f39144m = false;
                int i9 = typedArray.getInt(1, 1);
                if (i9 == 1) {
                    this.f39143l = Typeface.SANS_SERIF;
                    return;
                } else if (i9 == 2) {
                    this.f39143l = Typeface.SERIF;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f39143l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f39143l = null;
        int i10 = typedArray.hasValue(12) ? 12 : 10;
        int i11 = this.f39142k;
        int i12 = this.f39141j;
        if (!context.isRestricted()) {
            try {
                Typeface k9 = gVar.k(i10, this.f39141j, new Q(this, i11, i12, new WeakReference(this.f39133a)));
                if (k9 != null) {
                    if (i4 < 28 || this.f39142k == -1) {
                        this.f39143l = k9;
                    } else {
                        this.f39143l = U.a(Typeface.create(k9, 0), this.f39142k, (this.f39141j & 2) != 0);
                    }
                }
                this.f39144m = this.f39143l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f39143l != null || (string = typedArray.getString(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f39142k == -1) {
            this.f39143l = Typeface.create(string, this.f39141j);
        } else {
            this.f39143l = U.a(Typeface.create(string, 0), this.f39142k, (this.f39141j & 2) != 0);
        }
    }
}
