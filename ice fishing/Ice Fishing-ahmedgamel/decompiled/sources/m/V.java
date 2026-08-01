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
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39064a;

    /* renamed from: b, reason: collision with root package name */
    public i8.h f39065b;

    /* renamed from: c, reason: collision with root package name */
    public i8.h f39066c;

    /* renamed from: d, reason: collision with root package name */
    public i8.h f39067d;

    /* renamed from: e, reason: collision with root package name */
    public i8.h f39068e;

    /* renamed from: f, reason: collision with root package name */
    public i8.h f39069f;

    /* renamed from: g, reason: collision with root package name */
    public i8.h f39070g;

    /* renamed from: h, reason: collision with root package name */
    public i8.h f39071h;
    public final C4684e0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f39072j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f39073k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f39074l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39075m;

    public V(TextView textView) {
        this.f39064a = textView;
        this.i = new C4684e0(textView);
    }

    public static i8.h c(Context context, C4710s c4710s, int i) {
        ColorStateList f3;
        synchronized (c4710s) {
            f3 = c4710s.f39223a.f(context, i);
        }
        if (f3 == null) {
            return null;
        }
        i8.h hVar = new i8.h();
        hVar.f38123b = true;
        hVar.f38124c = f3;
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
        int i6 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i6 > i9 ? i9 : i6;
        if (i6 <= i9) {
            i6 = i9;
        }
        int length = text.length();
        if (i10 < 0 || i6 > length) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            T.c.a(editorInfo, text, i10, i6);
            return;
        }
        int i12 = i6 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(text.length() - i6, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (Character.isLowSurrogate(text.charAt(i15))) {
            i15++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i6 + min) - 1))) {
            min--;
        }
        int i16 = min2 + i13;
        T.c.a(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i6, min + i6)) : text.subSequence(i15, i16 + min + i15), min2, i16);
    }

    public final void a(Drawable drawable, i8.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C4710s.e(drawable, hVar, this.f39064a.getDrawableState());
    }

    public final void b() {
        i8.h hVar = this.f39065b;
        TextView textView = this.f39064a;
        if (hVar != null || this.f39066c != null || this.f39067d != null || this.f39068e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f39065b);
            a(compoundDrawables[1], this.f39066c);
            a(compoundDrawables[2], this.f39067d);
            a(compoundDrawables[3], this.f39068e);
        }
        if (this.f39069f == null && this.f39070g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f39069f);
        a(compoundDrawablesRelative[2], this.f39070g);
    }

    public final ColorStateList d() {
        i8.h hVar = this.f39071h;
        if (hVar != null) {
            return (ColorStateList) hVar.f38124c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        i8.h hVar = this.f39071h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f38125d;
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
        boolean z3;
        boolean z6;
        String str;
        String str2;
        int i6;
        float f3;
        int i9;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f39064a;
        Context context = textView.getContext();
        C4710s a9 = C4710s.a();
        int[] iArr = AbstractC4518a.f37595h;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, i);
        O.X.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, i);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f39065b = c(context, a9, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f39066c = c(context, a9, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f39067d = c(context, a9, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f39068e = c(context, a9, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f39069f = c(context, a9, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f39070g = c(context, a9, typedArray.getResourceId(6, 0));
        }
        s9.t();
        boolean z9 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC4518a.f37609w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            j4.g gVar = new j4.g(context, obtainStyledAttributes);
            if (z9 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z6 = false;
            } else {
                z6 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, gVar);
            int i11 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i11 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            gVar.t();
        } else {
            z3 = false;
            z6 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        j4.g gVar2 = new j4.g(context, obtainStyledAttributes2);
        if (!z9 && obtainStyledAttributes2.hasValue(14)) {
            z6 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z10 = z6;
        int i12 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i12 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar2);
        gVar2.t();
        if (!z9 && z3) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f39074l;
        if (typeface != null) {
            if (this.f39073k == -1) {
                textView.setTypeface(typeface, this.f39072j);
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
        int[] iArr3 = AbstractC4518a.i;
        C4684e0 c4684e0 = this.i;
        Context context2 = c4684e0.f39141j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c4684e0.i;
        O.X.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c4684e0.f39133a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                c4684e0.f39138f = C4684e0.b(iArr4);
                c4684e0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c4684e0.j()) {
            c4684e0.f39133a = 0;
        } else if (c4684e0.f39133a == 1) {
            if (!c4684e0.f39139g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f9 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c4684e0.k(dimension2, f9, dimension);
            }
            c4684e0.h();
        }
        if (f1.f39148c && c4684e0.f39133a != 0) {
            int[] iArr5 = c4684e0.f39138f;
            if (iArr5.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(c4684e0.f39136d), Math.round(c4684e0.f39137e), Math.round(c4684e0.f39135c), 0);
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
            U.m.g(textView, AbstractC4694j0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i14 = peekValue.data;
                i9 = i14 & 15;
                f3 = TypedValue.complexToFloat(i14);
                i6 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i6) {
                    d6.c.n(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i6) {
                    d6.c.o(textView, dimensionPixelSize2);
                }
                if (f3 == -1.0f) {
                    if (i9 == i6) {
                        d6.c.p(textView, (int) f3);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        U.p.a(textView, i9, f3);
                        return;
                    } else {
                        d6.c.p(textView, Math.round(TypedValue.applyDimension(i9, f3, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i6 = -1;
            f3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i6 = -1;
            f3 = -1.0f;
        }
        i9 = i6;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i6) {
        }
        if (dimensionPixelSize2 != i6) {
        }
        if (f3 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4518a.f37609w);
        j4.g gVar = new j4.g(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f39064a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, gVar);
        if (i6 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            T.d(textView, string);
        }
        gVar.t();
        Typeface typeface = this.f39074l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f39072j);
        }
    }

    public final void i(int i, int i6, int i9, int i10) {
        C4684e0 c4684e0 = this.i;
        if (c4684e0.j()) {
            DisplayMetrics displayMetrics = c4684e0.f39141j.getResources().getDisplayMetrics();
            c4684e0.k(TypedValue.applyDimension(i10, i, displayMetrics), TypedValue.applyDimension(i10, i6, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c4684e0.h()) {
                c4684e0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C4684e0 c4684e0 = this.i;
        if (c4684e0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c4684e0.f39141j.getResources().getDisplayMetrics();
                    for (int i6 = 0; i6 < length; i6++) {
                        iArr2[i6] = Math.round(TypedValue.applyDimension(i, iArr[i6], displayMetrics));
                    }
                }
                c4684e0.f39138f = C4684e0.b(iArr2);
                if (!c4684e0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c4684e0.f39139g = false;
            }
            if (c4684e0.h()) {
                c4684e0.a();
            }
        }
    }

    public final void k(int i) {
        C4684e0 c4684e0 = this.i;
        if (c4684e0.j()) {
            if (i == 0) {
                c4684e0.f39133a = 0;
                c4684e0.f39136d = -1.0f;
                c4684e0.f39137e = -1.0f;
                c4684e0.f39135c = -1.0f;
                c4684e0.f39138f = new int[0];
                c4684e0.f39134b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC4404f.e(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c4684e0.f39141j.getResources().getDisplayMetrics();
            c4684e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c4684e0.h()) {
                c4684e0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f39071h == null) {
            this.f39071h = new i8.h();
        }
        i8.h hVar = this.f39071h;
        hVar.f38124c = colorStateList;
        hVar.f38123b = colorStateList != null;
        this.f39065b = hVar;
        this.f39066c = hVar;
        this.f39067d = hVar;
        this.f39068e = hVar;
        this.f39069f = hVar;
        this.f39070g = hVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f39071h == null) {
            this.f39071h = new i8.h();
        }
        i8.h hVar = this.f39071h;
        hVar.f38125d = mode;
        hVar.f38122a = mode != null;
        this.f39065b = hVar;
        this.f39066c = hVar;
        this.f39067d = hVar;
        this.f39068e = hVar;
        this.f39069f = hVar;
        this.f39070g = hVar;
    }

    public final void n(Context context, j4.g gVar) {
        String string;
        int i = this.f39072j;
        TypedArray typedArray = (TypedArray) gVar.f38405v;
        this.f39072j = typedArray.getInt(2, i);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f39073k = i9;
            if (i9 != -1) {
                this.f39072j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f39075m = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.f39074l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f39074l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f39074l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f39074l = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f39073k;
        int i13 = this.f39072j;
        if (!context.isRestricted()) {
            try {
                Typeface k9 = gVar.k(i11, this.f39072j, new Q(this, i12, i13, new WeakReference(this.f39064a)));
                if (k9 != null) {
                    if (i6 < 28 || this.f39073k == -1) {
                        this.f39074l = k9;
                    } else {
                        this.f39074l = U.a(Typeface.create(k9, 0), this.f39073k, (this.f39072j & 2) != 0);
                    }
                }
                this.f39075m = this.f39074l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f39074l != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f39073k == -1) {
            this.f39074l = Typeface.create(string, this.f39072j);
        } else {
            this.f39074l = U.a(Typeface.create(string, 0), this.f39073k, (this.f39072j & 2) != 0);
        }
    }
}
