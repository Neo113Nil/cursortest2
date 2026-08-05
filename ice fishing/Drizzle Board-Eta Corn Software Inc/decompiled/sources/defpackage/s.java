package defpackage;

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
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s {
    public rc0 MdtA4re8;
    public rc0 NCTxEWno;
    public boolean OnDfzHZD;
    public rc0 P7K7Inc8;
    public rc0 Qr9iLBAD;
    public rc0 VgvYg0wo;
    public rc0 b2ZJblxo;
    public final b0 jb9XjC4I;
    public Typeface ow5vqvCr;
    public final TextView qoPGr6Ce;
    public rc0 wxUZMvaN;
    public int eVhOlqcC = 0;
    public int k3x7lurq = -1;

    public s(TextView textView) {
        this.qoPGr6Ce = textView;
        this.jb9XjC4I = new b0(textView);
    }

    public static rc0 MdtA4re8(Context context, j5BPOSYv j5bposyv, int i) {
        ColorStateList b2ZJblxo;
        synchronized (j5bposyv) {
            b2ZJblxo = j5bposyv.qoPGr6Ce.b2ZJblxo(context, i);
        }
        if (b2ZJblxo == null) {
            return null;
        }
        rc0 rc0Var = new rc0();
        rc0Var.wxUZMvaN = true;
        rc0Var.qoPGr6Ce = b2ZJblxo;
        return rc0Var;
    }

    public static void Qr9iLBAD(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            Xkz7p5xa.VgvYg0wo(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            Xkz7p5xa.VgvYg0wo(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            le0.fVMzMhyS(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            le0.fVMzMhyS(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            le0.fVMzMhyS(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        le0.fVMzMhyS(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void NCTxEWno() {
        rc0 rc0Var = this.NCTxEWno;
        TextView textView = this.qoPGr6Ce;
        if (rc0Var != null || this.MdtA4re8 != null || this.wxUZMvaN != null || this.VgvYg0wo != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            qoPGr6Ce(compoundDrawables[0], this.NCTxEWno);
            qoPGr6Ce(compoundDrawables[1], this.MdtA4re8);
            qoPGr6Ce(compoundDrawables[2], this.wxUZMvaN);
            qoPGr6Ce(compoundDrawables[3], this.VgvYg0wo);
        }
        if (this.P7K7Inc8 == null && this.b2ZJblxo == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        qoPGr6Ce(compoundDrawablesRelative[0], this.P7K7Inc8);
        qoPGr6Ce(compoundDrawablesRelative[2], this.b2ZJblxo);
    }

    public final void OnDfzHZD(PorterDuff.Mode mode) {
        rc0 rc0Var = this.Qr9iLBAD;
        if (rc0Var == null) {
            rc0Var = new rc0();
            this.Qr9iLBAD = rc0Var;
        }
        rc0 rc0Var2 = rc0Var;
        rc0Var.NCTxEWno = mode;
        rc0Var.MdtA4re8 = mode != null;
        this.NCTxEWno = rc0Var2;
        this.MdtA4re8 = rc0Var2;
        this.wxUZMvaN = rc0Var2;
        this.VgvYg0wo = rc0Var2;
        this.P7K7Inc8 = rc0Var2;
        this.b2ZJblxo = rc0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P7K7Inc8(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.qoPGr6Ce;
        Context context = textView.getContext();
        j5BPOSYv qoPGr6Ce = j5BPOSYv.qoPGr6Ce();
        int[] iArr = z00.Qr9iLBAD;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, i);
        hg0.jb9XjC4I(textView, textView.getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, i);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.NCTxEWno = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.MdtA4re8 = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.wxUZMvaN = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.VgvYg0wo = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.P7K7Inc8 = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.b2ZJblxo = MdtA4re8(context, qoPGr6Ce, typedArray.getResourceId(6, 0));
        }
        Mq3SeTnW.SgZGMMPL();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = z00.RXQxj5Oe;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            f0 f0Var = new f0(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            ygLcUYwZ(context, f0Var);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (Build.VERSION.SDK_INT < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            f0Var.SgZGMMPL();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        f0 f0Var2 = new f0(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        ygLcUYwZ(context, f0Var2);
        f0Var2.SgZGMMPL();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.ow5vqvCr;
        if (typeface != null) {
            if (this.k3x7lurq == -1) {
                textView.setTypeface(typeface, this.eVhOlqcC);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            q.wxUZMvaN(textView, str);
        }
        if (str2 != null) {
            p.NCTxEWno(textView, p.qoPGr6Ce(str2));
        }
        b0 b0Var = this.jb9XjC4I;
        Context context2 = b0Var.eVhOlqcC;
        int[] iArr3 = z00.jb9XjC4I;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = b0Var.jb9XjC4I;
        hg0.jb9XjC4I(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            b0Var.qoPGr6Ce = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                b0Var.P7K7Inc8 = b0.NCTxEWno(iArr4);
                b0Var.jb9XjC4I();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!b0Var.eVhOlqcC()) {
            b0Var.qoPGr6Ce = 0;
        } else if (b0Var.qoPGr6Ce == 1) {
            if (!b0Var.b2ZJblxo) {
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
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                b0Var.k3x7lurq(dimension2, f2, dimension);
            }
            b0Var.Qr9iLBAD();
        }
        if (fh0.MdtA4re8 && b0Var.qoPGr6Ce != 0) {
            int[] iArr5 = b0Var.P7K7Inc8;
            if (iArr5.length > 0) {
                if (q.qoPGr6Ce(textView) != -1.0f) {
                    q.NCTxEWno(textView, Math.round(b0Var.wxUZMvaN), Math.round(b0Var.VgvYg0wo), Math.round(b0Var.MdtA4re8), 0);
                } else {
                    q.MdtA4re8(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable NCTxEWno = resourceId4 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable NCTxEWno2 = resourceId5 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable NCTxEWno3 = resourceId6 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable NCTxEWno4 = resourceId7 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable NCTxEWno5 = resourceId8 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable NCTxEWno6 = resourceId9 != -1 ? qoPGr6Ce.NCTxEWno(context, resourceId9) : null;
        if (NCTxEWno5 != null || NCTxEWno6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (NCTxEWno5 == null) {
                NCTxEWno5 = compoundDrawablesRelative[0];
            }
            if (NCTxEWno2 == null) {
                NCTxEWno2 = compoundDrawablesRelative[1];
            }
            if (NCTxEWno6 == null) {
                NCTxEWno6 = compoundDrawablesRelative[2];
            }
            if (NCTxEWno4 == null) {
                NCTxEWno4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(NCTxEWno5, NCTxEWno2, NCTxEWno6, NCTxEWno4);
        } else if (NCTxEWno != null || NCTxEWno2 != null || NCTxEWno3 != null || NCTxEWno4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (NCTxEWno == null) {
                    NCTxEWno = compoundDrawables[0];
                }
                if (NCTxEWno2 == null) {
                    NCTxEWno2 = compoundDrawables[1];
                }
                if (NCTxEWno3 == null) {
                    NCTxEWno3 = compoundDrawables[2];
                }
                if (NCTxEWno4 == null) {
                    NCTxEWno4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(NCTxEWno, NCTxEWno2, NCTxEWno3, NCTxEWno4);
            } else {
                if (NCTxEWno2 == null) {
                    NCTxEWno2 = compoundDrawablesRelative2[1];
                }
                if (NCTxEWno4 == null) {
                    NCTxEWno4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, NCTxEWno2, compoundDrawablesRelative2[2], NCTxEWno4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = w30.RXQxj5Oe(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(ud.NCTxEWno(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i7 = peekValue.data;
                int i8 = i7 & 15;
                f = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i2) {
                    f50.sjUBp5pO(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i2) {
                    f50.OxcuoDLp(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i3 == i2) {
                        f50.amk52bBQ(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        hzgxAD8d.Qr9iLBAD(textView, i3, f);
                        return;
                    } else {
                        f50.amk52bBQ(textView, Math.round(TypedValue.applyDimension(i3, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            f = -1.0f;
        }
        i3 = i2;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i2) {
        }
        if (dimensionPixelSize2 != i2) {
        }
        if (f == -1.0f) {
        }
    }

    public final PorterDuff.Mode VgvYg0wo() {
        rc0 rc0Var = this.Qr9iLBAD;
        if (rc0Var != null) {
            return rc0Var.NCTxEWno;
        }
        return null;
    }

    public final void b2ZJblxo(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z00.RXQxj5Oe);
        f0 f0Var = new f0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.qoPGr6Ce;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        ygLcUYwZ(context, f0Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            q.wxUZMvaN(textView, string);
        }
        f0Var.SgZGMMPL();
        Typeface typeface = this.ow5vqvCr;
        if (typeface != null) {
            textView.setTypeface(typeface, this.eVhOlqcC);
        }
    }

    public final void eVhOlqcC(int[] iArr, int i) {
        b0 b0Var = this.jb9XjC4I;
        if (b0Var.eVhOlqcC()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = b0Var.eVhOlqcC.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                b0Var.P7K7Inc8 = b0.NCTxEWno(iArr2);
                if (!b0Var.jb9XjC4I()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                b0Var.b2ZJblxo = false;
            }
            if (b0Var.Qr9iLBAD()) {
                b0Var.qoPGr6Ce();
            }
        }
    }

    public final void jb9XjC4I(int i, int i2, int i3, int i4) {
        b0 b0Var = this.jb9XjC4I;
        if (b0Var.eVhOlqcC()) {
            DisplayMetrics displayMetrics = b0Var.eVhOlqcC.getResources().getDisplayMetrics();
            b0Var.k3x7lurq(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (b0Var.Qr9iLBAD()) {
                b0Var.qoPGr6Ce();
            }
        }
    }

    public final void k3x7lurq(int i) {
        b0 b0Var = this.jb9XjC4I;
        if (b0Var.eVhOlqcC()) {
            if (i == 0) {
                b0Var.qoPGr6Ce = 0;
                b0Var.wxUZMvaN = -1.0f;
                b0Var.VgvYg0wo = -1.0f;
                b0Var.MdtA4re8 = -1.0f;
                b0Var.P7K7Inc8 = new int[0];
                b0Var.NCTxEWno = false;
                return;
            }
            if (i != 1) {
                m1.sjUBp5pO(q70.VgvYg0wo("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = b0Var.eVhOlqcC.getResources().getDisplayMetrics();
            b0Var.k3x7lurq(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (b0Var.Qr9iLBAD()) {
                b0Var.qoPGr6Ce();
            }
        }
    }

    public final void ow5vqvCr(ColorStateList colorStateList) {
        rc0 rc0Var = this.Qr9iLBAD;
        if (rc0Var == null) {
            rc0Var = new rc0();
            this.Qr9iLBAD = rc0Var;
        }
        rc0 rc0Var2 = rc0Var;
        rc0Var.qoPGr6Ce = colorStateList;
        rc0Var.wxUZMvaN = colorStateList != null;
        this.NCTxEWno = rc0Var2;
        this.MdtA4re8 = rc0Var2;
        this.wxUZMvaN = rc0Var2;
        this.VgvYg0wo = rc0Var2;
        this.P7K7Inc8 = rc0Var2;
        this.b2ZJblxo = rc0Var2;
    }

    public final void qoPGr6Ce(Drawable drawable, rc0 rc0Var) {
        if (drawable == null || rc0Var == null) {
            return;
        }
        int[] drawableState = this.qoPGr6Ce.getDrawableState();
        PorterDuff.Mode mode = j5BPOSYv.NCTxEWno;
        e30.jb9XjC4I(drawable, rc0Var, drawableState);
    }

    public final ColorStateList wxUZMvaN() {
        rc0 rc0Var = this.Qr9iLBAD;
        if (rc0Var != null) {
            return rc0Var.qoPGr6Ce;
        }
        return null;
    }

    public final void ygLcUYwZ(Context context, f0 f0Var) {
        String string;
        int i = this.eVhOlqcC;
        TypedArray typedArray = (TypedArray) f0Var.MdtA4re8;
        this.eVhOlqcC = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k3x7lurq = i3;
            if (i3 != -1) {
                this.eVhOlqcC &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.OnDfzHZD = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.ow5vqvCr = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.ow5vqvCr = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.ow5vqvCr = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.ow5vqvCr = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k3x7lurq;
        int i7 = this.eVhOlqcC;
        if (!context.isRestricted()) {
            try {
                Typeface KlHjfFWx = f0Var.KlHjfFWx(i5, this.eVhOlqcC, new n(this, i6, i7, new WeakReference(this.qoPGr6Ce)));
                if (KlHjfFWx != null) {
                    if (i2 < 28 || this.k3x7lurq == -1) {
                        this.ow5vqvCr = KlHjfFWx;
                    } else {
                        this.ow5vqvCr = r.qoPGr6Ce(Typeface.create(KlHjfFWx, 0), this.k3x7lurq, (this.eVhOlqcC & 2) != 0);
                    }
                }
                this.OnDfzHZD = this.ow5vqvCr == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.ow5vqvCr != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k3x7lurq == -1) {
            this.ow5vqvCr = Typeface.create(string, this.eVhOlqcC);
        } else {
            this.ow5vqvCr = r.qoPGr6Ce(Typeface.create(string, 0), this.k3x7lurq, (this.eVhOlqcC & 2) != 0);
        }
    }
}
