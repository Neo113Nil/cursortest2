package com.gamericefishpro.space.j5;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.si.a0;
import com.gamericefishpro.space.si.e0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.tb.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final n0 a = e0.b(h.e);
    public final n0 b;
    public final a0 c;
    public final r d;
    public final r e;
    public d f;
    public int g;
    public f h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public g() {
        n0 n0VarB = e0.b(new e());
        this.b = n0VarB;
        this.c = new a0(n0VarB);
        this.d = new r();
        this.e = new r();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(s dispatcher, f input, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.a != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.a + '.').toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(input);
        input.a = dispatcher;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        e history = (e) this.c.d.getValue();
        Intrinsics.checkNotNullParameter(history, "history");
        Intrinsics.checkNotNullParameter(history, "history");
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        input.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        e history;
        r<d> rVar = this.d;
        if (rVar != null && rVar.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = rVar.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((d) it.next()).d) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        r<d> rVar2 = this.e;
        if (rVar2 != null && rVar2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = rVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((d) it2.next()).d) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((f) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((f) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((f) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        d dVarC = this.f;
        if (dVarC == null) {
            dVarC = c(0);
        }
        d dVarC2 = this.f;
        if (dVarC2 == null) {
            dVarC2 = c(0);
        }
        if (Intrinsics.a(dVarC2, dVarC)) {
            if (dVarC2 == null) {
                history = new e();
            } else {
                ArrayList backInfo = new ArrayList();
                for (d dVar : rVar) {
                    if (dVar.d) {
                        dVar.b.getClass();
                    }
                }
                for (d dVar2 : rVar2) {
                    if (dVar2.d) {
                        dVar2.b.getClass();
                    }
                }
                y3 currentInfo = dVarC2.a;
                g0 forwardInfo = dVarC2.c;
                Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
                Intrinsics.checkNotNullParameter(backInfo, "backInfo");
                Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
                com.gamericefishpro.space.qh.d dVarB = w.b();
                c0.l(dVarB, backInfo);
                dVarB.add(currentInfo);
                c0.l(dVarB, forwardInfo);
                history = new e(backInfo.size(), w.a(dVarB));
            }
            n0 n0Var = this.b;
            if (Intrinsics.a((e) n0Var.getValue(), history)) {
                return;
            }
            n0Var.j(null, history);
            Iterator it6 = linkedHashSet.iterator();
            while (it6.hasNext()) {
                ((f) it6.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it7 = linkedHashSet2.iterator();
            while (it7.hasNext()) {
                ((f) it7.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
            Iterator it8 = linkedHashSet3.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).getClass();
                Intrinsics.checkNotNullParameter(history, "history");
                Intrinsics.checkNotNullParameter(history, "history");
            }
        }
    }

    public final d c(int i) {
        Object next;
        Object next2;
        r rVar = this.e;
        r rVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = rVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((d) next).d);
            d dVar = (d) next;
            if (dVar != null) {
                return dVar;
            }
            for (Object obj2 : rVar) {
                if (((d) obj2).d) {
                    obj = obj2;
                    break;
                }
            }
            return (d) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = rVar2.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).getClass();
            }
            Iterator it3 = rVar.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = rVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((d) next2).d);
        d dVar2 = (d) next2;
        if (dVar2 != null) {
            return dVar2;
        }
        for (Object obj3 : rVar) {
            if (((d) obj3).d) {
                obj = obj3;
                break;
            }
        }
        return (d) obj;
    }
}
