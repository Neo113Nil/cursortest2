package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m8 {
    public int MdtA4re8;
    public int[] NCTxEWno;
    public int P7K7Inc8;
    public String[] Qr9iLBAD;
    public float[] VgvYg0wo;
    public int[] b2ZJblxo;
    public int[] eVhOlqcC;
    public int jb9XjC4I;
    public boolean[] k3x7lurq;
    public int ow5vqvCr;
    public int[] qoPGr6Ce;
    public int[] wxUZMvaN;

    public final void MdtA4re8(int i, boolean z) {
        int i2 = this.ow5vqvCr;
        int[] iArr = this.eVhOlqcC;
        if (i2 >= iArr.length) {
            this.eVhOlqcC = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k3x7lurq;
            this.k3x7lurq = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.eVhOlqcC;
        int i3 = this.ow5vqvCr;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k3x7lurq;
        this.ow5vqvCr = i3 + 1;
        zArr2[i3] = z;
    }

    public final void NCTxEWno(int i, int i2) {
        int i3 = this.MdtA4re8;
        int[] iArr = this.qoPGr6Ce;
        if (i3 >= iArr.length) {
            this.qoPGr6Ce = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.NCTxEWno;
            this.NCTxEWno = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.qoPGr6Ce;
        int i4 = this.MdtA4re8;
        iArr3[i4] = i;
        int[] iArr4 = this.NCTxEWno;
        this.MdtA4re8 = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void qoPGr6Ce(int i, float f) {
        int i2 = this.P7K7Inc8;
        int[] iArr = this.wxUZMvaN;
        if (i2 >= iArr.length) {
            this.wxUZMvaN = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.VgvYg0wo;
            this.VgvYg0wo = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.wxUZMvaN;
        int i3 = this.P7K7Inc8;
        iArr2[i3] = i;
        float[] fArr2 = this.VgvYg0wo;
        this.P7K7Inc8 = i3 + 1;
        fArr2[i3] = f;
    }

    public final void wxUZMvaN(String str, int i) {
        int i2 = this.jb9XjC4I;
        int[] iArr = this.b2ZJblxo;
        if (i2 >= iArr.length) {
            this.b2ZJblxo = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.Qr9iLBAD;
            this.Qr9iLBAD = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.b2ZJblxo;
        int i3 = this.jb9XjC4I;
        iArr2[i3] = i;
        String[] strArr2 = this.Qr9iLBAD;
        this.jb9XjC4I = i3 + 1;
        strArr2[i3] = str;
    }
}
