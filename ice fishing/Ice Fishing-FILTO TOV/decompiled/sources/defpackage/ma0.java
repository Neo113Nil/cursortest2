package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ma0 extends v11 {
    public final List Y6hRI1cF8;
    public final long cilMamHF;
    public final List jivtDDk9H;
    public final long lv06NcmrQ;

    public ma0(List list, ArrayList arrayList, long j, long j2) {
        this.jivtDDk9H = list;
        this.Y6hRI1cF8 = arrayList;
        this.cilMamHF = j;
        this.lv06NcmrQ = j2;
    }

    @Override // defpackage.v11
    public final Shader MjxSquD6Av(long j) {
        long j2 = this.cilMamHF;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.lv06NcmrQ;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.jivtDDk9H;
        List list2 = this.Y6hRI1cF8;
        o30.J3Xc8BaqpN8(list, list2);
        int WIEu4Ya2g8 = o30.WIEu4Ya2g8(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), o30.ozMwhSAI(WIEu4Ya2g8, list), o30.AEn1Rrio(list2, list, WIEu4Ya2g8), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return this.jivtDDk9H.equals(ma0Var.jivtDDk9H) && o30.rQPn8YBR(this.Y6hRI1cF8, ma0Var.Y6hRI1cF8) && uk0.Yi7zF1RB1(this.cilMamHF, ma0Var.cilMamHF) && uk0.Yi7zF1RB1(this.lv06NcmrQ, ma0Var.lv06NcmrQ);
    }

    public final int hashCode() {
        int hashCode = this.jivtDDk9H.hashCode() * 31;
        List list = this.Y6hRI1cF8;
        return Integer.hashCode(0) + mr0.X1lG3V04pd(mr0.X1lG3V04pd((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.cilMamHF), 31, this.lv06NcmrQ);
    }

    public final String toString() {
        String str;
        long j = this.cilMamHF;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) uk0.AvO7iQsrTN(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.lv06NcmrQ;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) uk0.AvO7iQsrTN(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.jivtDDk9H + ", stops=" + this.Y6hRI1cF8 + ", " + str + str2 + "tileMode=Clamp)";
    }
}
