package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class xzq0 implements a850, yw60 {
    public final h3y a;
    public final lx4 b;
    public final iay0 c;
    public final yvf0 d;
    public final h3y e;
    public final r0 f = bvf0.c("#none#");
    public final ConcurrentLinkedDeque g = new ConcurrentLinkedDeque();
    public final String h = "SessionManagerImpl";

    public xzq0(h3y h3yVar, lx4 lx4Var, iay0 iay0Var, yvf0 yvf0Var, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = lx4Var;
        this.c = iay0Var;
        this.d = yvf0Var;
        this.e = h3yVar2;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        if (this.g.isEmpty()) {
            return;
        }
        n(m());
    }

    @Override // defpackage.a850
    public final void d(String str) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.g;
        if (!concurrentLinkedDeque.isEmpty() && jl40.l(str, m())) {
            concurrentLinkedDeque.pop();
            if (concurrentLinkedDeque.isEmpty()) {
                return;
            }
            n(m());
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.h;
    }

    @Override // defpackage.a850
    public final void i(String str, boolean z) {
        j(z ? this.g.size() : 0, Collections.singletonList(str));
        unr0.C(new Object[]{str}, 1, "screen opened: %s", jst.e);
    }

    @Override // defpackage.a850
    public final void j(int i, List list) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.g;
        if (i >= concurrentLinkedDeque.size()) {
            concurrentLinkedDeque.clear();
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                concurrentLinkedDeque.pop();
            }
        }
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            String str = (String) a.P(list);
            if (jl40.l(str, "#none#") || !jl40.l(m(), str)) {
                concurrentLinkedDeque.push(str);
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                concurrentLinkedDeque.addFirst((String) it.next());
            }
        }
        n(m());
    }

    @Override // defpackage.a850
    public final void k(List list) {
        int size = list.size();
        ConcurrentLinkedDeque concurrentLinkedDeque = this.g;
        if (size >= concurrentLinkedDeque.size()) {
            concurrentLinkedDeque.clear();
        } else {
            for (int i = 0; i < size; i++) {
                concurrentLinkedDeque.pop();
            }
        }
        if (concurrentLinkedDeque.isEmpty()) {
            return;
        }
        n(m());
    }

    public final String m() {
        String str = (String) this.g.peek();
        return (str == null || evu0.J(str)) ? "#none#" : str;
    }

    public final void n(String str) {
        r0 r0Var = this.f;
        if (jl40.l(r0Var.getValue(), str)) {
            return;
        }
        j jVar = (j) this.b;
        jVar.getClass();
        j.m(jVar, str + ".Shown", null, null, false, false, str, 24);
        if (jl40.l(str, "pickup_location")) {
            ((cv4) this.a.get()).a.clear();
        }
        r0Var.l(str);
        ((ru.yandex.taxi.cashback.repository.a) this.e.get()).a(this.g);
        unr0.C(new Object[]{str}, 1, "Current screen changed. new screen: %s", jst.e);
    }

    public final void o() {
        ((cv4) this.a.get()).a.clear();
        Iterator it = ((Set) this.d.get()).iterator();
        while (it.hasNext()) {
            try {
                ((bre0) it.next()).b();
            } catch (Throwable th) {
                jst.e.x(th, "Failed to process new session listener");
            }
        }
        iay0 iay0Var = this.c;
        iay0Var.getClass();
        iay0Var.a.a("TaxiSessionStarted", new HashMap(), 1, new HashMap());
    }
}
