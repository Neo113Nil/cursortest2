package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final TextView a;
    public w1 b;
    public w1 c;
    public w1 d;
    public w1 e;
    public w1 f;
    public w1 g;
    public w1 h;
    public final n0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public e0(TextView textView) {
        this.a = textView;
        this.i = new n0(textView);
    }

    public static w1 c(Context context, q qVar, int i) {
        ColorStateList colorStateListF;
        synchronized (qVar) {
            colorStateListF = qVar.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        w1 w1Var = new w1();
        w1Var.d = true;
        w1Var.a = colorStateListF;
        return w1Var;
    }

    public final void a(Drawable drawable, w1 w1Var) {
        if (drawable == null || w1Var == null) {
            return;
        }
        q.d(drawable, w1Var, this.a.getDrawableState());
    }

    public final void b() {
        w1 w1Var = this.b;
        TextView textView = this.a;
        if (w1Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Code duplicated, block: B:237:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:242:0x03bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:245:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    public final void d(AttributeSet attributeSet, int i) {
        q qVar;
        String string;
        boolean z;
        boolean z2;
        String string2;
        float f;
        float fApplyDimension;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int[] iArr = com.gamericefishpro.space.j.a.g;
        int[] iArr2 = com.gamericefishpro.space.j.a.r;
        n0 n0Var = this.i;
        TextView textView = this.a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = q.b;
        synchronized (q.class) {
            try {
                if (q.c == null) {
                    q.c();
                }
                qVar = q.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = com.gamericefishpro.space.j.a.f;
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(context, attributeSet, iArr3, i);
        TextView textView2 = this.a;
        com.gamericefishpro.space.d4.l0.k(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) cVarT.i, i);
        TypedArray typedArray = (TypedArray) cVarT.i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, qVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, qVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, qVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, qVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, qVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, qVar, typedArray.getResourceId(6, 0));
        }
        cVarT.u();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            k(context, cVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            cVar.u();
        } else {
            string = null;
            z = false;
            z2 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        com.gamericefishpro.space.a8.c cVar2 = new com.gamericefishpro.space.a8.c(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i5 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, cVar2);
        cVar2.u();
        if (!z3 && z) {
            this.a.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            c0.d(textView, string);
        }
        if (string2 != null) {
            b0.b(textView, b0.a(string2));
        }
        Context context2 = n0Var.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = n0Var.i;
        com.gamericefishpro.space.d4.l0.k(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            n0Var.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(1)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(1, -1.0f);
            f = -1.0f;
        } else {
            f = -1.0f;
            fApplyDimension = -1.0f;
        }
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                n0Var.f = n0.b(iArr4);
                n0Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!n0Var.j()) {
            n0Var.a = 0;
        } else if (n0Var.a == 1) {
            if (!n0Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (fApplyDimension == f) {
                    fApplyDimension = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == f) {
                    dimension = 1.0f;
                }
                n0Var.k(dimension2, fApplyDimension, dimension);
            }
            n0Var.h();
        }
        if (k2.a && n0Var.a != 0) {
            int[] iArr5 = n0Var.f;
            if (iArr5.length > 0) {
                if (c0.a(textView) != f) {
                    c0.b(textView, Math.round(n0Var.d), Math.round(n0Var.e), Math.round(n0Var.c), 0);
                } else {
                    c0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? qVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? qVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? qVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? qVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? qVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? qVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[r3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[r3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = com.gamericefishpro.space.s3.a.c(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(q0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                int i8 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                com.gamericefishpro.space.i.a.J(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                com.gamericefishpro.space.i.a.K(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != f) {
                if (i3 == i2) {
                    com.gamericefishpro.space.i.a.L(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    com.gamericefishpro.space.d4.v.k(textView, i3, dimensionPixelSize);
                } else {
                    com.gamericefishpro.space.i.a.L(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            com.gamericefishpro.space.i.a.J(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            com.gamericefishpro.space.i.a.K(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != f) {
            if (i3 == i2) {
                com.gamericefishpro.space.i.a.L(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                com.gamericefishpro.space.d4.v.k(textView, i3, dimensionPixelSize);
            } else {
                com.gamericefishpro.space.i.a.L(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, com.gamericefishpro.space.j.a.r);
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, cVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            c0.d(textView, string);
        }
        cVar.u();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        n0 n0Var = this.i;
        if (n0Var.j()) {
            DisplayMetrics displayMetrics = n0Var.j.getResources().getDisplayMetrics();
            n0Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (n0Var.h()) {
                n0Var.a();
            }
        }
    }

    public final void g(int[] iArr, int i) {
        n0 n0Var = this.i;
        if (n0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = n0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                n0Var.f = n0.b(iArrCopyOf);
                if (!n0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                n0Var.g = false;
            }
            if (n0Var.h()) {
                n0Var.a();
            }
        }
    }

    public final void h(int i) {
        n0 n0Var = this.i;
        if (n0Var.j()) {
            if (i == 0) {
                n0Var.a = 0;
                n0Var.d = -1.0f;
                n0Var.e = -1.0f;
                n0Var.c = -1.0f;
                n0Var.f = new int[0];
                n0Var.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = n0Var.j.getResources().getDisplayMetrics();
            n0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (n0Var.h()) {
                n0Var.a();
            }
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new w1();
        }
        w1 w1Var = this.h;
        w1Var.a = colorStateList;
        w1Var.d = colorStateList != null;
        this.b = w1Var;
        this.c = w1Var;
        this.d = w1Var;
        this.e = w1Var;
        this.f = w1Var;
        this.g = w1Var;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new w1();
        }
        w1 w1Var = this.h;
        w1Var.b = mode;
        w1Var.c = mode != null;
        this.b = w1Var;
        this.c = w1Var;
        this.d = w1Var;
        this.e = w1Var;
        this.f = w1Var;
        this.g = w1Var;
    }

    public final void k(Context context, com.gamericefishpro.space.a8.c cVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) cVar.i;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM = cVar.m(i5, this.j, new z(this, i6, i7, new WeakReference(this.a)));
                if (typefaceM != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceM;
                    } else {
                        this.l = d0.a(Typeface.create(typefaceM, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = d0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
