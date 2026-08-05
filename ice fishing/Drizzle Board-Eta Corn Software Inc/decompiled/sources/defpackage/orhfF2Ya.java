package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class orhfF2Ya extends hi {
    public final /* synthetic */ int k3x7lurq = 1;
    public final /* synthetic */ View ow5vqvCr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orhfF2Ya(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.ow5vqvCr = actionMenuItemView;
    }

    @Override // defpackage.hi
    public final boolean MdtA4re8() {
        o70 NCTxEWno;
        int i = this.k3x7lurq;
        View view = this.ow5vqvCr;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                xr xrVar = actionMenuItemView.ow5vqvCr;
                if (xrVar == null || !xrVar.qoPGr6Ce(actionMenuItemView.jb9XjC4I) || (NCTxEWno = NCTxEWno()) == null || !NCTxEWno.NCTxEWno()) {
                }
                break;
            default:
                ((N2kLh4D5) view).VgvYg0wo.ygLcUYwZ();
                break;
        }
        return true;
    }

    @Override // defpackage.hi
    public final o70 NCTxEWno() {
        f7oeun2L f7oeun2l;
        int i = this.k3x7lurq;
        View view = this.ow5vqvCr;
        switch (i) {
            case 0:
                dHozS53r dhozs53r = ((ActionMenuItemView) view).ygLcUYwZ;
                if (dhozs53r == null || (f7oeun2l = ((uQ3KJUK5) dhozs53r).qoPGr6Ce.RXQxj5Oe) == null) {
                    return null;
                }
                return f7oeun2l.qoPGr6Ce();
            default:
                f7oeun2L f7oeun2l2 = ((N2kLh4D5) view).VgvYg0wo.I5GHvsYW;
                if (f7oeun2l2 == null) {
                    return null;
                }
                return f7oeun2l2.qoPGr6Ce();
        }
    }

    @Override // defpackage.hi
    public boolean wxUZMvaN() {
        switch (this.k3x7lurq) {
            case 1:
                CTE3lpUp cTE3lpUp = ((N2kLh4D5) this.ow5vqvCr).VgvYg0wo;
                if (cTE3lpUp.FySoLYna != null) {
                    return false;
                }
                cTE3lpUp.wxUZMvaN();
                return true;
            default:
                return super.wxUZMvaN();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orhfF2Ya(N2kLh4D5 n2kLh4D5, N2kLh4D5 n2kLh4D52) {
        super(n2kLh4D52);
        this.ow5vqvCr = n2kLh4D5;
    }
}
