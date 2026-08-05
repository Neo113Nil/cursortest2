package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t60 implements r60 {
    public ra qoPGr6Ce = new c40();
    public ra NCTxEWno = new c40();
    public ra MdtA4re8 = new c40();
    public ra wxUZMvaN = new c40();
    public i9 VgvYg0wo = new P7K7Inc8(0.0f);
    public i9 P7K7Inc8 = new P7K7Inc8(0.0f);
    public i9 b2ZJblxo = new P7K7Inc8(0.0f);
    public i9 Qr9iLBAD = new P7K7Inc8(0.0f);
    public re jb9XjC4I = new re(0);
    public re eVhOlqcC = new re(0);
    public re k3x7lurq = new re(0);
    public re ow5vqvCr = new re(0);

    public static s60 P7K7Inc8(Context context, AttributeSet attributeSet, int i, int i2) {
        P7K7Inc8 p7K7Inc8 = new P7K7Inc8(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.OxcuoDLp, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return b2ZJblxo(contextThemeWrapper.obtainStyledAttributes(y00.gjV1z5T1), p7K7Inc8);
    }

    public static i9 Qr9iLBAD(TypedArray typedArray, int i, i9 i9Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new P7K7Inc8(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new r20(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return i9Var;
    }

    public static s60 b2ZJblxo(TypedArray typedArray, P7K7Inc8 p7K7Inc8) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            i9 Qr9iLBAD = Qr9iLBAD(typedArray, 5, p7K7Inc8);
            i9 Qr9iLBAD2 = Qr9iLBAD(typedArray, 8, Qr9iLBAD);
            i9 Qr9iLBAD3 = Qr9iLBAD(typedArray, 9, Qr9iLBAD);
            i9 Qr9iLBAD4 = Qr9iLBAD(typedArray, 7, Qr9iLBAD);
            i9 Qr9iLBAD5 = Qr9iLBAD(typedArray, 6, Qr9iLBAD);
            s60 s60Var = new s60();
            s60Var.qoPGr6Ce = le0.ow5vqvCr(i2);
            s60Var.VgvYg0wo = Qr9iLBAD2;
            s60Var.NCTxEWno = le0.ow5vqvCr(i3);
            s60Var.P7K7Inc8 = Qr9iLBAD3;
            s60Var.MdtA4re8 = le0.ow5vqvCr(i4);
            s60Var.b2ZJblxo = Qr9iLBAD4;
            s60Var.wxUZMvaN = le0.ow5vqvCr(i5);
            s60Var.Qr9iLBAD = Qr9iLBAD5;
            return s60Var;
        } finally {
            typedArray.recycle();
        }
    }

    @Override // defpackage.r60
    public final t60[] MdtA4re8() {
        return new t60[]{this};
    }

    @Override // defpackage.r60
    public final boolean VgvYg0wo() {
        return false;
    }

    public final s60 eVhOlqcC() {
        s60 s60Var = new s60();
        s60Var.qoPGr6Ce = this.qoPGr6Ce;
        s60Var.NCTxEWno = this.NCTxEWno;
        s60Var.MdtA4re8 = this.MdtA4re8;
        s60Var.wxUZMvaN = this.wxUZMvaN;
        s60Var.VgvYg0wo = this.VgvYg0wo;
        s60Var.P7K7Inc8 = this.P7K7Inc8;
        s60Var.b2ZJblxo = this.b2ZJblxo;
        s60Var.Qr9iLBAD = this.Qr9iLBAD;
        s60Var.jb9XjC4I = this.jb9XjC4I;
        s60Var.eVhOlqcC = this.eVhOlqcC;
        s60Var.k3x7lurq = this.k3x7lurq;
        s60Var.ow5vqvCr = this.ow5vqvCr;
        return s60Var;
    }

    public final boolean jb9XjC4I(RectF rectF) {
        boolean z = this.ow5vqvCr.getClass().equals(re.class) && this.eVhOlqcC.getClass().equals(re.class) && this.jb9XjC4I.getClass().equals(re.class) && this.k3x7lurq.getClass().equals(re.class);
        float qoPGr6Ce = this.VgvYg0wo.qoPGr6Ce(rectF);
        return z && ((this.P7K7Inc8.qoPGr6Ce(rectF) > qoPGr6Ce ? 1 : (this.P7K7Inc8.qoPGr6Ce(rectF) == qoPGr6Ce ? 0 : -1)) == 0 && (this.Qr9iLBAD.qoPGr6Ce(rectF) > qoPGr6Ce ? 1 : (this.Qr9iLBAD.qoPGr6Ce(rectF) == qoPGr6Ce ? 0 : -1)) == 0 && (this.b2ZJblxo.qoPGr6Ce(rectF) > qoPGr6Ce ? 1 : (this.b2ZJblxo.qoPGr6Ce(rectF) == qoPGr6Ce ? 0 : -1)) == 0) && (this.NCTxEWno instanceof c40) && (this.qoPGr6Ce instanceof c40) && (this.MdtA4re8 instanceof c40) && (this.wxUZMvaN instanceof c40);
    }

    @Override // defpackage.r60
    public final t60 qoPGr6Ce(float f) {
        s60 eVhOlqcC = eVhOlqcC();
        eVhOlqcC.NCTxEWno(f);
        return eVhOlqcC.qoPGr6Ce();
    }

    public final String toString() {
        return "[" + this.VgvYg0wo + ", " + this.P7K7Inc8 + ", " + this.b2ZJblxo + ", " + this.Qr9iLBAD + "]";
    }

    @Override // defpackage.r60
    public final t60 NCTxEWno(int[] iArr) {
        return this;
    }

    @Override // defpackage.r60
    public final t60 wxUZMvaN() {
        return this;
    }
}
