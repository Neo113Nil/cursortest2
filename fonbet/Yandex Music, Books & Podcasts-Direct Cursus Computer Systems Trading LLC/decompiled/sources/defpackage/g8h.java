package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class g8h extends mc4 {
    public final String b;
    public final /* synthetic */ j8h d;
    public final AtomicReference a = new AtomicReference(j8h.i0);
    public final c8h c = new c8h(this);

    public g8h(j8h j8hVar, String str) {
        this.d = j8hVar;
        o2g.O(str, "authority");
        this.b = str;
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.b;
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        j8h j8hVar = this.d;
        vq6 vq6Var = j8hVar.m;
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        u7h u7hVar = j8h.i0;
        if (obj != u7hVar) {
            return h(k3iVar, ks3Var);
        }
        vq6Var.execute(new d8h(this, 2));
        if (atomicReference.get() != u7hVar) {
            return h(k3iVar, ks3Var);
        }
        if (j8hVar.F.get()) {
            return new hv7(2);
        }
        f8h f8hVar = new f8h(this, we6.z(), k3iVar, ks3Var);
        vq6Var.execute(new e8h(0, this, f8hVar));
        return f8hVar;
    }

    public final vn4 h(k3i k3iVar, ks3 ks3Var) {
        nte nteVar = (nte) this.a.get();
        c8h c8hVar = this.c;
        if (nteVar == null) {
            return c8hVar.g(k3iVar, ks3Var);
        }
        if (!(nteVar instanceof p8h)) {
            return new y7h(nteVar, c8hVar, this.d.h, k3iVar, ks3Var);
        }
        q8h q8hVar = ((p8h) nteVar).b;
        o8h o8hVar = (o8h) q8hVar.b.get(k3iVar.b);
        if (o8hVar == null) {
            o8hVar = (o8h) q8hVar.c.get(k3iVar.c);
        }
        if (o8hVar == null) {
            o8hVar = q8hVar.a;
        }
        if (o8hVar != null) {
            ks3Var = ks3Var.c(o8h.g, o8hVar);
        }
        return c8hVar.g(k3iVar, ks3Var);
    }

    public final void i(nte nteVar) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.a;
        nte nteVar2 = (nte) atomicReference.get();
        atomicReference.set(nteVar);
        if (nteVar2 != j8h.i0 || (linkedHashSet = this.d.A) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((f8h) it.next()).j();
        }
    }
}
