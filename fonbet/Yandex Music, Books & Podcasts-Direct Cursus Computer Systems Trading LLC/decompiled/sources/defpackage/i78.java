package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i78 extends lac {
    public final lac b;

    public i78(lac lacVar) {
        lacVar.getClass();
        this.b = lacVar;
    }

    @Override // defpackage.lac
    public final jmq a(cak cakVar) {
        cakVar.getClass();
        return this.b.a(cakVar);
    }

    @Override // defpackage.lac
    public final void b(cak cakVar, cak cakVar2) {
        cakVar.getClass();
        cakVar2.getClass();
        this.b.b(cakVar, cakVar2);
    }

    @Override // defpackage.lac
    public final void c(cak cakVar) {
        this.b.c(cakVar);
    }

    @Override // defpackage.lac
    public final void d(cak cakVar) {
        cakVar.getClass();
        this.b.d(cakVar);
    }

    @Override // defpackage.lac
    public final List g(cak cakVar) {
        cakVar.getClass();
        List<cak> g = this.b.g(cakVar);
        ArrayList arrayList = new ArrayList();
        for (cak cakVar2 : g) {
            cakVar2.getClass();
            arrayList.add(cakVar2);
        }
        y75.r(arrayList);
        return arrayList;
    }

    @Override // defpackage.lac
    public final v97 i(cak cakVar) {
        cakVar.getClass();
        v97 i = this.b.i(cakVar);
        if (i == null) {
            return null;
        }
        cak cakVar2 = (cak) i.d;
        if (cakVar2 == null) {
            return i;
        }
        boolean z = i.b;
        boolean z2 = i.c;
        Long l = (Long) i.e;
        Long l2 = (Long) i.f;
        Long l3 = (Long) i.g;
        Long l4 = (Long) i.h;
        Map map = (Map) i.i;
        map.getClass();
        return new v97(z, z2, cakVar2, l, l2, l3, l4, map);
    }

    @Override // defpackage.lac
    public final a9f j(cak cakVar) {
        return this.b.j(cakVar);
    }

    @Override // defpackage.lac
    public final jmq k(cak cakVar) {
        cak b = cakVar.b();
        lac lacVar = this.b;
        if (b != null) {
            zx0 zx0Var = new zx0();
            while (b != null && !f(b)) {
                zx0Var.addFirst(b);
                b = b.b();
            }
            Iterator<E> it = zx0Var.iterator();
            while (it.hasNext()) {
                cak cakVar2 = (cak) it.next();
                cakVar2.getClass();
                lacVar.c(cakVar2);
            }
        }
        return lacVar.k(cakVar);
    }

    @Override // defpackage.lac
    public final n3r l(cak cakVar) {
        cakVar.getClass();
        return this.b.l(cakVar);
    }

    public final String toString() {
        return ern.a(i78.class).h() + '(' + this.b + ')';
    }
}
