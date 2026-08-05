package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r10 {
    public final /* synthetic */ t10 NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ r10(t10 t10Var, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = t10Var;
    }

    public final int MdtA4re8() {
        int i;
        int euDDoUNr;
        int i2 = this.qoPGr6Ce;
        t10 t10Var = this.NCTxEWno;
        switch (i2) {
            case 0:
                i = t10Var.OnDfzHZD;
                euDDoUNr = t10Var.euDDoUNr();
                break;
            default:
                i = t10Var.ygLcUYwZ;
                euDDoUNr = t10Var.i7xS8jrb();
                break;
        }
        return i - euDDoUNr;
    }

    public final int NCTxEWno(View view) {
        int left;
        int i;
        switch (this.qoPGr6Ce) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                left = view.getLeft() - ((u10) view.getLayoutParams()).NCTxEWno.left;
                i = ((ViewGroup.MarginLayoutParams) u10Var).leftMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                left = view.getTop() - ((u10) view.getLayoutParams()).NCTxEWno.top;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int qoPGr6Ce(View view) {
        int right;
        int i;
        switch (this.qoPGr6Ce) {
            case 0:
                u10 u10Var = (u10) view.getLayoutParams();
                right = view.getRight() + ((u10) view.getLayoutParams()).NCTxEWno.right;
                i = ((ViewGroup.MarginLayoutParams) u10Var).rightMargin;
                break;
            default:
                u10 u10Var2 = (u10) view.getLayoutParams();
                right = view.getBottom() + ((u10) view.getLayoutParams()).NCTxEWno.bottom;
                i = ((ViewGroup.MarginLayoutParams) u10Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int wxUZMvaN() {
        int i = this.qoPGr6Ce;
        t10 t10Var = this.NCTxEWno;
        switch (i) {
            case 0:
                return t10Var.Mq3SeTnW();
            default:
                return t10Var.SgZGMMPL();
        }
    }
}
