package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class iao {
    public final boolean a;
    public final List b;
    public final Collection c;
    public final Collection d;
    public final int e;
    public final lao f;
    public final boolean g;
    public final boolean h;

    public iao(List list, Collection collection, Collection collection2, lao laoVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        o2g.O(collection, "drainedSubstreams");
        this.c = collection;
        this.f = laoVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        o2g.U("passThrough should imply buffer is null", !z2 || list == null);
        o2g.U("passThrough should imply winningSubstream != null", (z2 && laoVar == null) ? false : true);
        o2g.U("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(laoVar)) || (collection.size() == 0 && laoVar.b));
        o2g.U("cancelled should imply committed", (z && laoVar == null) ? false : true);
    }

    public final iao a(lao laoVar) {
        Collection unmodifiableCollection;
        o2g.U("hedging frozen", !this.h);
        o2g.U("already committed", this.f == null);
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(laoVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(laoVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new iao(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    public final iao b(lao laoVar) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(laoVar);
        return new iao(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f, this.g, this.a, this.h, this.e);
    }

    public final iao c(lao laoVar, lao laoVar2) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(laoVar);
        arrayList.add(laoVar2);
        return new iao(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f, this.g, this.a, this.h, this.e);
    }

    public final iao d(lao laoVar) {
        laoVar.b = true;
        Collection collection = this.c;
        if (!collection.contains(laoVar)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(laoVar);
        return new iao(this.b, Collections.unmodifiableCollection(arrayList), this.d, this.f, this.g, this.a, this.h, this.e);
    }

    public final iao e(lao laoVar) {
        List list;
        o2g.U("Already passThrough", !this.a);
        boolean z = laoVar.b;
        Collection collection = this.c;
        if (!z) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(laoVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(laoVar);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        lao laoVar2 = this.f;
        boolean z2 = laoVar2 != null;
        if (z2) {
            o2g.U("Another RPC attempt has already committed", laoVar2 == laoVar);
            list = null;
        } else {
            list = this.b;
        }
        return new iao(list, collection2, this.d, this.f, this.g, z2, this.h, this.e);
    }
}
