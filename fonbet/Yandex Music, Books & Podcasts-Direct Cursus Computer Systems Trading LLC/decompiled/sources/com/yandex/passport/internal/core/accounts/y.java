package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.report.reporters.x0;
import defpackage.b6e;
import defpackage.btf;
import defpackage.jyr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {
    public final i a;
    public final s b;
    public final p c;
    public final com.yandex.passport.internal.flags.i d;
    public final jyr e;

    public y(i iVar, s sVar, p pVar, com.yandex.passport.internal.flags.i iVar2) {
        iVar.getClass();
        sVar.getClass();
        pVar.getClass();
        iVar2.getClass();
        this.a = iVar;
        this.b = sVar;
        this.c = pVar;
        this.d = iVar2;
        this.e = btf.b(new com.yandex.passport.internal.common.e(4, this));
    }

    public final Unit a(x xVar) {
        com.yandex.passport.internal.l e;
        boolean z;
        com.yandex.plus.core.network.api.utils.a aVar = xVar.a;
        boolean z2 = xVar.b;
        boolean z3 = xVar.c;
        x0 x0Var = xVar.d;
        boolean z4 = aVar instanceof v;
        jyr jyrVar = this.e;
        if (z4) {
            e = ((v) aVar).a;
        } else {
            if (!(aVar instanceof w)) {
                b6e.s();
                return null;
            }
            e = ((com.yandex.passport.internal.d) jyrVar.getValue()).e(((w) aVar).a);
            if (e == null) {
                return Unit.a;
            }
        }
        com.yandex.passport.common.core.f fVar = e.c;
        if (fVar == null || !((Boolean) this.d.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
            this.a.c(e, z2, z3, x0Var, xVar.e);
        } else {
            ArrayList c = this.b.c(fVar, (com.yandex.passport.internal.d) jyrVar.getValue());
            ArrayList arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                com.yandex.passport.internal.l e2 = ((com.yandex.passport.internal.d) jyrVar.getValue()).e(((com.yandex.passport.internal.entities.n) it.next()).a);
                if (e2 != null) {
                    arrayList.add(e2);
                }
            }
            Iterator it2 = arrayList.iterator();
            boolean z5 = false;
            loop1: while (true) {
                z = z5;
                while (it2.hasNext()) {
                    com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) it2.next();
                    this.a.c(lVar, z2, z3, x0Var, xVar.e);
                    if (Intrinsics.d(lVar.b, e.b)) {
                        break;
                    }
                }
                z5 = true;
            }
            if (!z) {
                this.a.c(e, z2, z3, x0Var, xVar.e);
            }
        }
        return Unit.a;
    }
}
