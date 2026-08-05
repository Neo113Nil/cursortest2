package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ep {
    public int MdtA4re8;
    public int NCTxEWno;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public List k3x7lurq;
    public boolean ow5vqvCr;
    public boolean qoPGr6Ce;
    public int wxUZMvaN;

    public final View NCTxEWno(z10 z10Var) {
        List list = this.k3x7lurq;
        if (list == null) {
            View wxUZMvaN = z10Var.wxUZMvaN(this.wxUZMvaN);
            this.wxUZMvaN += this.VgvYg0wo;
            return wxUZMvaN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((g20) this.k3x7lurq.get(i)).qoPGr6Ce;
            u10 u10Var = (u10) view.getLayoutParams();
            if (!u10Var.qoPGr6Ce.b2ZJblxo() && this.wxUZMvaN == u10Var.qoPGr6Ce.NCTxEWno()) {
                qoPGr6Ce(view);
                return view;
            }
        }
        return null;
    }

    public final void qoPGr6Ce(View view) {
        int NCTxEWno;
        int size = this.k3x7lurq.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((g20) this.k3x7lurq.get(i2)).qoPGr6Ce;
            u10 u10Var = (u10) view3.getLayoutParams();
            if (view3 != view && !u10Var.qoPGr6Ce.b2ZJblxo() && (NCTxEWno = (u10Var.qoPGr6Ce.NCTxEWno() - this.wxUZMvaN) * this.VgvYg0wo) >= 0 && NCTxEWno < i) {
                view2 = view3;
                if (NCTxEWno == 0) {
                    break;
                } else {
                    i = NCTxEWno;
                }
            }
        }
        if (view2 == null) {
            this.wxUZMvaN = -1;
        } else {
            this.wxUZMvaN = ((u10) view2.getLayoutParams()).qoPGr6Ce.NCTxEWno();
        }
    }
}
