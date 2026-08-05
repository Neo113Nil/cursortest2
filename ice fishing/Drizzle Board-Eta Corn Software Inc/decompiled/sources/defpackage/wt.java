package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wt {
    public final Bundle MdtA4re8;
    public final pu NCTxEWno;
    public final String P7K7Inc8;
    public final q50 Qr9iLBAD;
    public final hu VgvYg0wo;
    public final Bundle b2ZJblxo;
    public final xo eVhOlqcC;
    public boolean jb9XjC4I;
    public po k3x7lurq;
    public final t50 ow5vqvCr;
    public final ut qoPGr6Ce;
    public po wxUZMvaN;

    public wt(ut utVar) {
        this.qoPGr6Ce = utVar;
        this.NCTxEWno = utVar.MdtA4re8;
        this.MdtA4re8 = utVar.wxUZMvaN;
        this.wxUZMvaN = utVar.VgvYg0wo;
        this.VgvYg0wo = utVar.P7K7Inc8;
        this.P7K7Inc8 = utVar.b2ZJblxo;
        this.b2ZJblxo = utVar.Qr9iLBAD;
        this.Qr9iLBAD = new q50(new r50(utVar, new e7(8, utVar)));
        cb0 cb0Var = new cb0(new ek(4));
        this.eVhOlqcC = new xo(utVar);
        this.k3x7lurq = po.MdtA4re8;
        this.ow5vqvCr = (t50) cb0Var.getValue();
        new cb0(new ek(5));
    }

    public final void NCTxEWno() {
        if (!this.jb9XjC4I) {
            q50 q50Var = this.Qr9iLBAD;
            q50Var.Qr9iLBAD();
            this.jb9XjC4I = true;
            if (this.VgvYg0wo != null) {
                w30.OxcuoDLp(this.qoPGr6Ce);
            }
            q50Var.jb9XjC4I(this.b2ZJblxo);
        }
        int ordinal = this.wxUZMvaN.ordinal();
        int ordinal2 = this.k3x7lurq.ordinal();
        xo xoVar = this.eVhOlqcC;
        if (ordinal < ordinal2) {
            xoVar.b2ZJblxo(this.wxUZMvaN);
        } else {
            xoVar.b2ZJblxo(this.k3x7lurq);
        }
    }

    public final Bundle qoPGr6Ce() {
        Bundle bundle = this.MdtA4re8;
        if (bundle == null) {
            return null;
        }
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        VgvYg0wo.putAll(bundle);
        return VgvYg0wo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m20.qoPGr6Ce(ut.class).MdtA4re8());
        sb.append("(" + this.P7K7Inc8 + ')');
        sb.append(" destination=");
        sb.append(this.NCTxEWno);
        return sb.toString();
    }
}
