package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class khc {
    public int a;
    public int b;
    public final zx0 c = new zx0();
    public final ime d = new ime(15);
    public ofg e;
    public boolean f;

    public final void a(g1k g1kVar) {
        g1kVar.getClass();
        this.f = true;
        boolean z = g1kVar instanceof a1k;
        zx0 zx0Var = this.c;
        ime imeVar = this.d;
        if (!z) {
            if (g1kVar instanceof w0k) {
                imeVar.W(null, nfg.c);
                throw null;
            }
            if (g1kVar instanceof b1k) {
                b1k b1kVar = (b1k) g1kVar;
                imeVar.V(b1kVar.a);
                this.e = b1kVar.b;
                return;
            } else {
                if (g1kVar instanceof f1k) {
                    zx0Var.clear();
                    this.b = 0;
                    this.a = 0;
                    zx0Var.addLast(new c7t(((f1k) g1kVar).a, 0));
                    return;
                }
                return;
            }
        }
        a1k a1kVar = (a1k) g1kVar;
        ofg ofgVar = a1kVar.e;
        int i = a1kVar.c;
        int i2 = a1kVar.d;
        List list = a1kVar.b;
        imeVar.V(ofgVar);
        this.e = a1kVar.f;
        int ordinal = a1kVar.a.ordinal();
        if (ordinal == 0) {
            zx0Var.clear();
            this.b = i2;
            this.a = i;
            zx0Var.addAll(list);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.b = i2;
            zx0Var.addAll(list);
            return;
        }
        this.a = i;
        int size = list.size() - 1;
        a.d.getClass();
        ype it = new a(size, 0, -1).iterator();
        while (it.c) {
            zx0Var.addFirst(list.get(it.nextInt()));
        }
    }

    public final List b() {
        if (!this.f) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        ofg Z = this.d.Z();
        zx0 zx0Var = this.c;
        if (zx0Var.isEmpty()) {
            arrayList.add(new b1k(Z, this.e));
            return arrayList;
        }
        a1k a1kVar = a1k.g;
        arrayList.add(qgg.k(CollectionsKt.w0(zx0Var), this.a, this.b, Z, this.e));
        return arrayList;
    }
}
