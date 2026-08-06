package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ss0 extends v11 {
    public final long Y6hRI1cF8;
    public final float cilMamHF;
    public final List jivtDDk9H;

    public ss0(List list, long j, float f) {
        this.jivtDDk9H = list;
        this.Y6hRI1cF8 = j;
        this.cilMamHF = f;
    }

    @Override // defpackage.v11
    public final Shader MjxSquD6Av(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.Y6hRI1cF8;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long mOu10nynGul = n4.mOu10nynGul(j);
            intBitsToFloat = Float.intBitsToFloat((int) (mOu10nynGul >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (mOu10nynGul & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.cilMamHF;
        if (f == Float.POSITIVE_INFINITY) {
            f = t21.Yi7zF1RB1(j) / 2.0f;
        }
        List list = this.jivtDDk9H;
        o30.J3Xc8BaqpN8(list, null);
        int WIEu4Ya2g8 = o30.WIEu4Ya2g8(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f, o30.ozMwhSAI(WIEu4Ya2g8, list), o30.AEn1Rrio(null, list, WIEu4Ya2g8), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss0)) {
            return false;
        }
        ss0 ss0Var = (ss0) obj;
        return this.jivtDDk9H.equals(ss0Var.jivtDDk9H) && uk0.Yi7zF1RB1(this.Y6hRI1cF8, ss0Var.Y6hRI1cF8) && this.cilMamHF == ss0Var.cilMamHF;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + mr0.GWasM1elztuh(this.cilMamHF, mr0.X1lG3V04pd(this.jivtDDk9H.hashCode() * 961, 31, this.Y6hRI1cF8), 31);
    }

    public final String toString() {
        String str;
        long j = this.Y6hRI1cF8;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) uk0.AvO7iQsrTN(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.cilMamHF;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.jivtDDk9H + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
