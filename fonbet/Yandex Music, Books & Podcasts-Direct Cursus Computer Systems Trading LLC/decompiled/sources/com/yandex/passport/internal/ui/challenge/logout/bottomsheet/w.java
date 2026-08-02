package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.b6e;
import defpackage.c5b;
import defpackage.nm6;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class w extends com.yandex.passport.common.mvi.h {
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.flags.i d;
    public final com.yandex.passport.internal.core.accounts.s e;
    public final com.yandex.passport.common.core.f f;
    public final boolean g;
    public final boolean h;

    public w(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.core.accounts.s sVar, com.yandex.passport.common.core.f fVar, boolean z, boolean z2) {
        eVar.getClass();
        iVar.getClass();
        sVar.getClass();
        this.c = eVar;
        this.d = iVar;
        this.e = sVar;
        this.f = fVar;
        this.g = z;
        this.h = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        ?? r11;
        com.yandex.passport.common.core.b bVar;
        if (!((v) obj).equals(v.a)) {
            b6e.s();
            return null;
        }
        com.yandex.passport.internal.d a = this.c.a();
        com.yandex.passport.common.core.f fVar = this.f;
        com.yandex.passport.internal.l e = a.e(fVar);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(fVar);
        }
        ArrayList g = a.g();
        ArrayList arrayList = new ArrayList(v75.o(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.passport.internal.l) it.next()).b);
        }
        com.yandex.passport.common.core.f fVar2 = ((Boolean) this.d.b(com.yandex.passport.internal.flags.o.q0)).booleanValue() ? e.c : null;
        if (fVar2 != null) {
            ArrayList c = this.e.c(fVar2, a);
            r11 = new ArrayList();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (arrayList.contains(((com.yandex.passport.internal.entities.n) next).a)) {
                    r11.add(next);
                }
            }
        } else {
            r11 = c5b.a;
        }
        List list = r11;
        boolean z = (e.n() || e.e.h == 7 || (bVar = e.b.a) == com.yandex.passport.common.core.b.d || bVar == com.yandex.passport.common.core.b.f) ? false : true;
        boolean z2 = this.g;
        if (z2 || z) {
            a(new x(new h0(this.f, e.c, !this.h, z, z2, list)));
        } else {
            g(c0.a);
        }
        Unit unit = Unit.a;
        nm6 nm6Var = nm6.a;
        return unit;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        a(new y(th));
        return Unit.a;
    }
}
