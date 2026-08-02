package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class mq5 extends tr5 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final x6k f = new x6k(a.g, rwd.h);
    public final /* synthetic */ oq5 g;

    public mq5(oq5 oq5Var, int i, boolean z, boolean z2, y9w y9wVar) {
        this.g = oq5Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.tr5
    public final void a(wr5 wr5Var, wn5 wn5Var) {
        this.g.b.a(wr5Var, wn5Var);
    }

    @Override // defpackage.tr5
    public final void b(mfi mfiVar) {
        this.g.b.b(mfiVar);
    }

    @Override // defpackage.tr5
    public final void c() {
        oq5 oq5Var = this.g;
        oq5Var.z--;
    }

    @Override // defpackage.tr5
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.tr5
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.tr5
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.tr5
    public final a g() {
        return (a) this.f.getValue();
    }

    @Override // defpackage.tr5
    public final int h() {
        return this.a;
    }

    @Override // defpackage.tr5
    public final CoroutineContext i() {
        return this.g.b.i();
    }

    @Override // defpackage.tr5
    public final void j(mfi mfiVar) {
        this.g.b.j(mfiVar);
    }

    @Override // defpackage.tr5
    public final void k(wr5 wr5Var) {
        oq5 oq5Var = this.g;
        oq5Var.b.k(oq5Var.g);
        oq5Var.b.k(wr5Var);
    }

    @Override // defpackage.tr5
    public final void l(mfi mfiVar, lfi lfiVar, nw0 nw0Var) {
        this.g.b.l(mfiVar, lfiVar, nw0Var);
    }

    @Override // defpackage.tr5
    public final lfi m(mfi mfiVar) {
        return this.g.b.m(mfiVar);
    }

    @Override // defpackage.tr5
    public final void n(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.tr5
    public final void o(oq5 oq5Var) {
        this.e.add(oq5Var);
    }

    @Override // defpackage.tr5
    public final void p(wr5 wr5Var) {
        this.g.b.p(wr5Var);
    }

    @Override // defpackage.tr5
    public final void q() {
        this.g.z++;
    }

    @Override // defpackage.tr5
    public final void r(hq5 hq5Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                hq5Var.getClass();
                set.remove(((oq5) hq5Var).c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        wct.m(linkedHashSet);
        linkedHashSet.remove(hq5Var);
    }

    @Override // defpackage.tr5
    public final void s(wr5 wr5Var) {
        this.g.b.s(wr5Var);
    }

    public final void t() {
        LinkedHashSet<oq5> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (oq5 oq5Var : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(oq5Var.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
