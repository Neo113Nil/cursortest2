package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class mxh {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public mxh(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ttc) ((hyh) it.next())).a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(hyh hyhVar) {
        this.b.remove(hyhVar);
        lxh lxhVar = (lxh) this.c.remove(hyhVar);
        if (lxhVar != null) {
            lxhVar.a.d(lxhVar.b);
            lxhVar.b = null;
        }
        this.a.run();
    }
}
