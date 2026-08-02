package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class dgj {
    public final bsr a;
    public final mm6 b;
    public final jyr c;
    public final jyr d;
    public final CopyOnWriteArrayList e;
    public final CopyOnWriteArrayList f;
    public final xdr g;
    public final CopyOnWriteArrayList h;

    public dgj(jyr jyrVar, jyr jyrVar2, bsr bsrVar) {
        tf6 e = gld.e(dm6.b());
        this.a = bsrVar;
        this.b = e;
        this.c = jyrVar;
        this.d = jyrVar2;
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = ydr.a(c5b.a);
        this.h = new CopyOnWriteArrayList();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        ArrayList arrayList = new ArrayList(v75.o(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(((wfj) it.next()).a());
        }
        List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList));
        rf3.g.getClass();
        EnumSet<rf3> allOf = EnumSet.allOf(rf3.class);
        allOf.getClass();
        for (rf3 rf3Var : allOf) {
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                ip2 ip2Var = (ip2) it2.next();
                boolean contains = w0.contains(rf3Var);
                ip2Var.getClass();
                rf3Var.getClass();
                kii kiiVar = (kii) ip2Var.a.a;
                if (kiiVar != null) {
                    HashSet hashSet = kiiVar.k;
                    if (contains) {
                        hashSet.add(rf3Var);
                    } else {
                        hashSet.remove(rf3Var);
                    }
                    kiiVar.u();
                }
            }
        }
    }
}
