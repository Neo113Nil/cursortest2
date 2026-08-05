package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ef0 extends hf0 {
    public Paint.Join OnDfzHZD;
    public rpbmbhyp P7K7Inc8;
    public float Qr9iLBAD;
    public float VgvYg0wo;
    public float b2ZJblxo;
    public float eVhOlqcC;
    public float jb9XjC4I;
    public float k3x7lurq;
    public Paint.Cap ow5vqvCr;
    public rpbmbhyp wxUZMvaN;
    public float ygLcUYwZ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.gf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean NCTxEWno(int[] iArr) {
        boolean z;
        rpbmbhyp rpbmbhypVar;
        rpbmbhyp rpbmbhypVar2 = this.P7K7Inc8;
        boolean z2 = true;
        if (rpbmbhypVar2.MdtA4re8()) {
            ColorStateList colorStateList = (ColorStateList) rpbmbhypVar2.MdtA4re8;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != rpbmbhypVar2.qoPGr6Ce) {
                rpbmbhypVar2.qoPGr6Ce = colorForState;
                z = true;
                rpbmbhypVar = this.wxUZMvaN;
                if (rpbmbhypVar.MdtA4re8()) {
                    ColorStateList colorStateList2 = (ColorStateList) rpbmbhypVar.MdtA4re8;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != rpbmbhypVar.qoPGr6Ce) {
                        rpbmbhypVar.qoPGr6Ce = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        rpbmbhypVar = this.wxUZMvaN;
        if (rpbmbhypVar.MdtA4re8()) {
        }
        z2 = false;
        return z | z2;
    }

    public float getFillAlpha() {
        return this.Qr9iLBAD;
    }

    public int getFillColor() {
        return this.P7K7Inc8.qoPGr6Ce;
    }

    public float getStrokeAlpha() {
        return this.b2ZJblxo;
    }

    public int getStrokeColor() {
        return this.wxUZMvaN.qoPGr6Ce;
    }

    public float getStrokeWidth() {
        return this.VgvYg0wo;
    }

    public float getTrimPathEnd() {
        return this.eVhOlqcC;
    }

    public float getTrimPathOffset() {
        return this.k3x7lurq;
    }

    public float getTrimPathStart() {
        return this.jb9XjC4I;
    }

    @Override // defpackage.gf0
    public final boolean qoPGr6Ce() {
        return this.P7K7Inc8.MdtA4re8() || this.wxUZMvaN.MdtA4re8();
    }

    public void setFillAlpha(float f) {
        this.Qr9iLBAD = f;
    }

    public void setFillColor(int i) {
        this.P7K7Inc8.qoPGr6Ce = i;
    }

    public void setStrokeAlpha(float f) {
        this.b2ZJblxo = f;
    }

    public void setStrokeColor(int i) {
        this.wxUZMvaN.qoPGr6Ce = i;
    }

    public void setStrokeWidth(float f) {
        this.VgvYg0wo = f;
    }

    public void setTrimPathEnd(float f) {
        this.eVhOlqcC = f;
    }

    public void setTrimPathOffset(float f) {
        this.k3x7lurq = f;
    }

    public void setTrimPathStart(float f) {
        this.jb9XjC4I = f;
    }
}
