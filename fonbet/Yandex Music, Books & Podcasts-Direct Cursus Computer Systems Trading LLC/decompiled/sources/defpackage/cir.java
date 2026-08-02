package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class cir implements tqg {
    public Object a;
    public final xsg b;
    public final g06 c = new g06(new d5b(), c5b.a);
    public final LinkedList d = new LinkedList();
    public final ArrayList e = new ArrayList();
    public final usg f;
    public boolean g;

    public cir(i6a i6aVar, xsg xsgVar, List list) {
        this.a = i6aVar;
        this.b = xsgVar;
        usg usgVar = new usg(new kzp(23, this));
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                usgVar = new usg(new zzq(4, this, (h5i) listIterator.previous(), usgVar));
            }
        }
        this.f = usgVar;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.c;
    }

    public final void b(ohb ohbVar) {
        boolean z = this.g;
        LinkedList linkedList = this.d;
        if (z) {
            linkedList.add(ohbVar);
            return;
        }
        if (z) {
            xq0.x("Concurrent dispatching is not allowed");
            return;
        }
        this.g = true;
        this.f.a.invoke(ohbVar);
        this.g = false;
        if (!linkedList.isEmpty()) {
            do {
                b((ohb) linkedList.remove());
            } while (!linkedList.isEmpty());
        } else {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(this.a);
            }
        }
    }
}
