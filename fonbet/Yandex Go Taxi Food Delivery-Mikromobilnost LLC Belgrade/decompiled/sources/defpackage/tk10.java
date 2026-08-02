package defpackage;

import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class tk10 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public tk10(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(an10 an10Var, pey peyVar) {
        this.b.add(an10Var);
        this.a.run();
        Lifecycle lifecycle = peyVar.getLifecycle();
        HashMap hashMap = this.c;
        sk10 sk10Var = (sk10) hashMap.remove(an10Var);
        if (sk10Var != null) {
            sk10Var.a.d(sk10Var.b);
            sk10Var.b = null;
        }
        hashMap.put(an10Var, new sk10(lifecycle, new wu5(3, this, an10Var)));
    }

    public final void b(an10 an10Var, pey peyVar, Lifecycle.State state) {
        Lifecycle lifecycle = peyVar.getLifecycle();
        HashMap hashMap = this.c;
        sk10 sk10Var = (sk10) hashMap.remove(an10Var);
        if (sk10Var != null) {
            sk10Var.a.d(sk10Var.b);
            sk10Var.b = null;
        }
        hashMap.put(an10Var, new sk10(lifecycle, new wdy(2, state, this, an10Var)));
    }

    public final boolean c(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ncs) ((an10) it.next())).a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void d(an10 an10Var) {
        this.b.remove(an10Var);
        sk10 sk10Var = (sk10) this.c.remove(an10Var);
        if (sk10Var != null) {
            sk10Var.a.d(sk10Var.b);
            sk10Var.b = null;
        }
        this.a.run();
    }
}
