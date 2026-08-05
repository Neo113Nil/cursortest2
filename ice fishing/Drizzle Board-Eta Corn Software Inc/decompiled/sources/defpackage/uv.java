package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class uv implements bu {
    public final /* synthetic */ uu NCTxEWno;
    public final /* synthetic */ WeakReference qoPGr6Ce;

    public uv(WeakReference weakReference, uu uuVar) {
        this.qoPGr6Ce = weakReference;
        this.NCTxEWno = uuVar;
    }

    @Override // defpackage.bu
    public final void qoPGr6Ce(uu uuVar, pu puVar) {
        puVar.getClass();
        tv tvVar = (tv) this.qoPGr6Ce.get();
        if (tvVar == null) {
            uu uuVar2 = this.NCTxEWno;
            uuVar2.getClass();
            gu guVar = uuVar2.NCTxEWno;
            guVar.getClass();
            guVar.lDXGDhIF.remove(this);
            return;
        }
        if (puVar instanceof pc) {
            return;
        }
        Menu menu = tvVar.getMenu();
        menu.getClass();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (ra.gjV1z5T1(item.getItemId(), puVar)) {
                item.setChecked(true);
            }
        }
    }
}
