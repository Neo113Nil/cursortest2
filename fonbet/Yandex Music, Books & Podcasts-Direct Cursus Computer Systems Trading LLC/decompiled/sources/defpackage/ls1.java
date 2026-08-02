package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ls1 {
    public static final ks1 h = new ks1(0);
    public final rp7 a;
    public final yfx b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final ks1 c = h;

    public ls1(rp7 rp7Var, yfx yfxVar) {
        this.a = rp7Var;
        this.b = yfxVar;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            k8g k8gVar = ((i8g) it.next()).a;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        rp7 rp7Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            rp7Var.j(0, size);
            a(runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new kr1(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        rp7Var.d(0, list.size());
        a(runnable);
    }
}
