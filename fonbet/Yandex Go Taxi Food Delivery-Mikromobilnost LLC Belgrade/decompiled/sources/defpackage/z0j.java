package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class z0j {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(m950 m950Var) {
        this.a.add(m950Var);
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        Iterator it = copyOnWriteArraySet.iterator();
        copyOnWriteArraySet.clear();
        while (it.hasNext()) {
            ((h55) ((m950) it.next())).i();
        }
    }

    public final void c(m950 m950Var) {
        this.a.remove(m950Var);
    }
}
