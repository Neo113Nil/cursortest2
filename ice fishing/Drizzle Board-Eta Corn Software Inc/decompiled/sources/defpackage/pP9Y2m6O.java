package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pP9Y2m6O implements View.OnClickListener {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ pP9Y2m6O(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                ((yzvmSy3z) obj).qoPGr6Ce();
                break;
            case 1:
                dHPzAh2D dhpzah2d = (dHPzAh2D) obj;
                dhpzah2d.RXQxj5Oe.obtainMessage(1, dhpzah2d.NCTxEWno).sendToTarget();
                break;
            case 2:
                cs itemData = ((iv) view).getItemData();
                r2 r2Var = (r2) obj;
                boolean OxcuoDLp = r2Var.hzgxAD8d.qoPGr6Ce.OxcuoDLp(itemData, r2Var.fVMzMhyS, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!OxcuoDLp || itemData.isChecked()) {
                        r2Var.setCheckedItem(itemData);
                        break;
                    }
                }
                break;
            default:
                xc0 xc0Var = ((Toolbar) obj).fVMzMhyS;
                cs csVar = xc0Var == null ? null : xc0Var.MdtA4re8;
                if (csVar != null) {
                    csVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
