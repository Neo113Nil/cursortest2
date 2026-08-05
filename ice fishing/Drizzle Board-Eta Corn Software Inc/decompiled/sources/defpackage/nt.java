package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class nt {
    public static final Object eVhOlqcC = new Object();
    public volatile Object P7K7Inc8;
    public boolean Qr9iLBAD;
    public volatile Object VgvYg0wo;
    public int b2ZJblxo;
    public boolean jb9XjC4I;
    public boolean wxUZMvaN;
    public final Object qoPGr6Ce = new Object();
    public final p40 NCTxEWno = new p40();
    public int MdtA4re8 = 0;

    public nt() {
        Object obj = eVhOlqcC;
        this.P7K7Inc8 = obj;
        this.VgvYg0wo = obj;
        this.b2ZJblxo = -1;
    }

    public static void qoPGr6Ce(String str) {
        n0.sjUBp5pO().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        m1.Ey6iv0m0(q70.P7K7Inc8("Cannot invoke ", str, " on a background thread"));
    }

    public final void MdtA4re8(bq bqVar) {
        if (this.Qr9iLBAD) {
            this.jb9XjC4I = true;
            return;
        }
        this.Qr9iLBAD = true;
        do {
            this.jb9XjC4I = false;
            if (bqVar != null) {
                NCTxEWno(bqVar);
                bqVar = null;
            } else {
                p40 p40Var = this.NCTxEWno;
                p40Var.getClass();
                n40 n40Var = new n40(p40Var);
                p40Var.wxUZMvaN.put(n40Var, Boolean.FALSE);
                while (n40Var.hasNext()) {
                    NCTxEWno((bq) ((Map.Entry) n40Var.next()).getValue());
                    if (this.jb9XjC4I) {
                        break;
                    }
                }
            }
        } while (this.jb9XjC4I);
        this.Qr9iLBAD = false;
    }

    public final void NCTxEWno(bq bqVar) {
        if (bqVar.MdtA4re8) {
            if (!bqVar.wxUZMvaN()) {
                bqVar.qoPGr6Ce(false);
                return;
            }
            int i = bqVar.wxUZMvaN;
            int i2 = this.b2ZJblxo;
            if (i >= i2) {
                return;
            }
            bqVar.wxUZMvaN = i2;
            bqVar.NCTxEWno.qoPGr6Ce(this.VgvYg0wo);
        }
    }
}
