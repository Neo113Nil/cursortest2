package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class we {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public int qoPGr6Ce;

    public we(t10 t10Var) {
        this.qoPGr6Ce = Integer.MIN_VALUE;
        this.MdtA4re8 = new Rect();
        this.NCTxEWno = t10Var;
    }

    public static we NCTxEWno(t10 t10Var, int i) {
        if (i == 0) {
            return new fx(t10Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new fx(t10Var, i2);
        }
        m1.sjUBp5pO("invalid orientation");
        return null;
    }

    public abstract void Ey6iv0m0(f40 f40Var);

    public abstract void I5GHvsYW(f40 f40Var);

    public abstract void KlHjfFWx(f40 f40Var);

    public abstract void MdtA4re8(f40 f40Var);

    public abstract int OnDfzHZD();

    public abstract void OxcuoDLp(int i);

    public abstract int P7K7Inc8(View view);

    public abstract int Qr9iLBAD();

    public abstract y30 RXQxj5Oe(f40 f40Var);

    public abstract int VgvYg0wo(View view);

    public abstract void amk52bBQ(f40 f40Var);

    public abstract int b2ZJblxo(View view);

    public abstract int eVhOlqcC();

    public abstract int jb9XjC4I();

    public abstract int k3x7lurq();

    public abstract int lDXGDhIF(View view);

    public abstract int ow5vqvCr();

    public abstract void qoPGr6Ce(f40 f40Var);

    public abstract int sjUBp5pO(View view);

    public abstract int wxUZMvaN(View view);

    public abstract int ygLcUYwZ();

    public we(int i, String str, String str2) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = str;
        this.MdtA4re8 = str2;
    }

    public we(ye yeVar) {
        this.qoPGr6Ce = 0;
        this.MdtA4re8 = new wa();
        this.NCTxEWno = yeVar;
    }
}
