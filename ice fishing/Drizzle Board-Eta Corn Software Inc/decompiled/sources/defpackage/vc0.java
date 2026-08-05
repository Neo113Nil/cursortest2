package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vc0 implements D4B4MtvK, wr {
    public final /* synthetic */ Toolbar NCTxEWno;

    public /* synthetic */ vc0(Toolbar toolbar) {
        this.NCTxEWno = toolbar;
    }

    @Override // defpackage.wr
    public boolean b2ZJblxo(yr yrVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.wr
    public void ygLcUYwZ(yr yrVar) {
        Toolbar toolbar = this.NCTxEWno;
        CTE3lpUp cTE3lpUp = toolbar.NCTxEWno.I5GHvsYW;
        if (cTE3lpUp == null || !cTE3lpUp.jb9XjC4I()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.eIA6dogk.VgvYg0wo).iterator();
            while (it.hasNext()) {
                ((xi) it.next()).qoPGr6Ce.KlHjfFWx();
            }
        }
    }
}
