package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r70 implements Comparable {
    public boolean NCTxEWno;
    public int OnDfzHZD;
    public float P7K7Inc8;
    public int MdtA4re8 = -1;
    public int wxUZMvaN = -1;
    public int VgvYg0wo = 0;
    public boolean b2ZJblxo = false;
    public final float[] Qr9iLBAD = new float[9];
    public final float[] jb9XjC4I = new float[9];
    public y0[] eVhOlqcC = new y0[16];
    public int k3x7lurq = 0;
    public int ow5vqvCr = 0;

    public r70(int i) {
        this.OnDfzHZD = i;
    }

    public final void MdtA4re8() {
        this.OnDfzHZD = 5;
        this.VgvYg0wo = 0;
        this.MdtA4re8 = -1;
        this.wxUZMvaN = -1;
        this.P7K7Inc8 = 0.0f;
        this.b2ZJblxo = false;
        int i = this.k3x7lurq;
        for (int i2 = 0; i2 < i; i2++) {
            this.eVhOlqcC[i2] = null;
        }
        this.k3x7lurq = 0;
        this.ow5vqvCr = 0;
        this.NCTxEWno = false;
        Arrays.fill(this.jb9XjC4I, 0.0f);
    }

    public final void NCTxEWno(y0 y0Var) {
        int i = this.k3x7lurq;
        int i2 = 0;
        while (i2 < i) {
            if (this.eVhOlqcC[i2] == y0Var) {
                while (i2 < i - 1) {
                    y0[] y0VarArr = this.eVhOlqcC;
                    int i3 = i2 + 1;
                    y0VarArr[i2] = y0VarArr[i3];
                    i2 = i3;
                }
                this.k3x7lurq--;
                return;
            }
            i2++;
        }
    }

    public final void VgvYg0wo(gp gpVar, y0 y0Var) {
        int i = this.k3x7lurq;
        for (int i2 = 0; i2 < i; i2++) {
            this.eVhOlqcC[i2].jb9XjC4I(gpVar, y0Var, false);
        }
        this.k3x7lurq = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.MdtA4re8 - ((r70) obj).MdtA4re8;
    }

    public final void qoPGr6Ce(y0 y0Var) {
        int i = 0;
        while (true) {
            int i2 = this.k3x7lurq;
            y0[] y0VarArr = this.eVhOlqcC;
            if (i >= i2) {
                if (i2 >= y0VarArr.length) {
                    y0VarArr = (y0[]) Arrays.copyOf(y0VarArr, y0VarArr.length * 2);
                    this.eVhOlqcC = y0VarArr;
                }
                int i3 = this.k3x7lurq;
                y0VarArr[i3] = y0Var;
                this.k3x7lurq = i3 + 1;
                return;
            }
            if (y0VarArr[i] == y0Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final String toString() {
        return "" + this.MdtA4re8;
    }

    public final void wxUZMvaN(gp gpVar, float f) {
        this.P7K7Inc8 = f;
        this.b2ZJblxo = true;
        int i = this.k3x7lurq;
        this.wxUZMvaN = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.eVhOlqcC[i2].Qr9iLBAD(gpVar, this, false);
        }
        this.k3x7lurq = 0;
    }
}
