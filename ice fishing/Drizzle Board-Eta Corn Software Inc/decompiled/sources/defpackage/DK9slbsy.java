package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class DK9slbsy {
    public int MdtA4re8;
    public lwWCatUu[] NCTxEWno;
    public la0 VgvYg0wo;
    public int wxUZMvaN;

    public abstract lwWCatUu MdtA4re8();

    public final void P7K7Inc8(lwWCatUu lwwcatuu) {
        la0 la0Var;
        int i;
        g9[] NCTxEWno;
        synchronized (this) {
            try {
                int i2 = this.MdtA4re8 - 1;
                this.MdtA4re8 = i2;
                la0Var = this.VgvYg0wo;
                if (i2 == 0) {
                    this.wxUZMvaN = 0;
                }
                lwwcatuu.getClass();
                NCTxEWno = lwwcatuu.NCTxEWno(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g9 g9Var : NCTxEWno) {
            if (g9Var != null) {
                g9Var.P7K7Inc8(xe0.qoPGr6Ce);
            }
        }
        if (la0Var != null) {
            la0Var.FySoLYna(-1);
        }
    }

    public final la0 b2ZJblxo() {
        la0 la0Var;
        synchronized (this) {
            la0Var = this.VgvYg0wo;
            if (la0Var == null) {
                int i = this.MdtA4re8;
                la0Var = new la0(1, Integer.MAX_VALUE, v2.MdtA4re8);
                la0Var.OxcuoDLp(Integer.valueOf(i));
                this.VgvYg0wo = la0Var;
            }
        }
        return la0Var;
    }

    public final lwWCatUu qoPGr6Ce() {
        lwWCatUu lwwcatuu;
        la0 la0Var;
        synchronized (this) {
            try {
                lwWCatUu[] lwwcatuuArr = this.NCTxEWno;
                if (lwwcatuuArr == null) {
                    lwwcatuuArr = wxUZMvaN();
                    this.NCTxEWno = lwwcatuuArr;
                } else if (this.MdtA4re8 >= lwwcatuuArr.length) {
                    Object[] copyOf = Arrays.copyOf(lwwcatuuArr, lwwcatuuArr.length * 2);
                    this.NCTxEWno = (lwWCatUu[]) copyOf;
                    lwwcatuuArr = (lwWCatUu[]) copyOf;
                }
                int i = this.wxUZMvaN;
                do {
                    lwwcatuu = lwwcatuuArr[i];
                    if (lwwcatuu == null) {
                        lwwcatuu = MdtA4re8();
                        lwwcatuuArr[i] = lwwcatuu;
                    }
                    i++;
                    if (i >= lwwcatuuArr.length) {
                        i = 0;
                    }
                } while (!lwwcatuu.qoPGr6Ce(this));
                this.wxUZMvaN = i;
                this.MdtA4re8++;
                la0Var = this.VgvYg0wo;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (la0Var != null) {
            la0Var.FySoLYna(1);
        }
        return lwwcatuu;
    }

    public abstract lwWCatUu[] wxUZMvaN();
}
