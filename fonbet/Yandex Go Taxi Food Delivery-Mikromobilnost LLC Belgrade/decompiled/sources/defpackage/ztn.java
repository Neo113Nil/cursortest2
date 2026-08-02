package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final class ztn implements Iterable, xfx {
    public final List a;

    public ztn(ListBuilder listBuilder) {
        this.a = listBuilder;
        if (listBuilder.isEmpty()) {
            ny61.r("Initialized with empty categorized sources");
            throw null;
        }
    }

    public final int a(int i) {
        Iterator it = a.A0(this.a, i).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((d2x) it.next()).b();
        }
        return i2;
    }

    public final g3x b(int i) {
        for (d2x d2xVar : this.a) {
            if (i < d2xVar.b()) {
                return d2xVar.a(i);
            }
            i -= d2xVar.b();
        }
        ny61.s();
        return null;
    }

    public final d6w d(d2x d2xVar) {
        List list = this.a;
        if (list.contains(d2xVar)) {
            int a = a(list.indexOf(d2xVar));
            return y6i0.n(a, d2xVar.b() + a);
        }
        ny61.r("Check failed.");
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        List<d2x> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (d2x d2xVar : list) {
            d2xVar.getClass();
            d6w d6wVar = new d6w(0, d2xVar.b() - 1, 1);
            ArrayList arrayList2 = new ArrayList(tcc.n(d6wVar, 10));
            c6w it = d6wVar.iterator();
            while (it.c) {
                arrayList2.add(d2xVar.a(it.nextInt()));
            }
            ycc.r(arrayList2, arrayList);
        }
        return arrayList.iterator();
    }
}
