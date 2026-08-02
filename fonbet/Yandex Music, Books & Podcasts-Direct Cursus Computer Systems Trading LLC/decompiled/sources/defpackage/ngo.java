package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class ngo extends aeg {
    public final ArrayList a;
    public final AtomicInteger b;
    public final int c;

    public ngo(ArrayList arrayList, AtomicInteger atomicInteger) {
        o2g.J("empty list", !arrayList.isEmpty());
        this.a = arrayList;
        o2g.O(atomicInteger, "index");
        this.b = atomicInteger;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((aeg) it.next()).hashCode();
        }
        this.c = i;
    }

    @Override // defpackage.aeg
    public final xdg a(dsk dskVar) {
        int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.a;
        return ((aeg) arrayList.get(andIncrement % arrayList.size())).a(dskVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ngo)) {
            return false;
        }
        ngo ngoVar = (ngo) obj;
        ArrayList arrayList = ngoVar.a;
        if (ngoVar == this) {
            return true;
        }
        if (this.c != ngoVar.c || this.b != ngoVar.b) {
            return false;
        }
        ArrayList arrayList2 = this.a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        z0j z0jVar = new z0j(ngo.class.getSimpleName());
        z0jVar.q(this.a, "subchannelPickers");
        return z0jVar.toString();
    }
}
