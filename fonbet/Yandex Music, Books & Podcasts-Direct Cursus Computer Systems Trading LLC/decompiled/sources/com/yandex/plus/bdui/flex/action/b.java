package com.yandex.plus.bdui.flex.action;

import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.f0q;
import defpackage.jyr;
import defpackage.md;
import defpackage.nm6;
import defpackage.oun;
import defpackage.pg;
import defpackage.q2a;
import defpackage.qgg;
import defpackage.ri7;
import defpackage.s3o;
import defpackage.t0a;
import defpackage.t7c;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.bdui.flex.utils.b a;
    public final com.yandex.plus.log.api.b b;
    public final jyr c;

    public b(t0a t0aVar, com.yandex.plus.bdui.flex.utils.b bVar, com.yandex.plus.log.api.b bVar2) {
        bVar2.getClass();
        this.a = bVar;
        this.b = bVar2;
        this.c = btf.b(t0aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.bdui.query.b bVar, com.yandex.plus.bdui.document.e eVar, cg6 cg6Var) {
        a aVar;
        int i;
        oun ounVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                com.yandex.plus.log.api.b bVar2 = this.b;
                com.yandex.plus.bdui.flex.utils.b bVar3 = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "ActionQueryExecutorImpl", "executeQuery(); query = " + bVar);
                    }
                    ri7 ri7Var = (ri7) this.c.getValue();
                    bVar.getClass();
                    pg pgVar = new pg(bVar.a, bVar.b, bVar.c);
                    q2a b = eVar != null ? bVar3.b(eVar) : null;
                    aVar.l = 1;
                    obj = ri7Var.b(pgVar, b, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ounVar = (oun) obj;
                if (ounVar instanceof t7c) {
                    if (!(ounVar instanceof s3o)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th = ((s3o) ounVar).a;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar3)) {
                        bVar2.a(aVar3, "ActionQueryExecutorImpl", "executeQuery() failed!", th);
                    }
                    return new com.yandex.plus.bdui.action.e(th);
                }
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar4)) {
                    bVar2.c(aVar4, "ActionQueryExecutorImpl", "executeQuery() succeeded with feedback action = " + ((t7c) ounVar).a);
                }
                t7c t7cVar = (t7c) ounVar;
                md mdVar = t7cVar.a;
                com.yandex.plus.bdui.action.a f = mdVar != null ? com.yandex.plus.bdui.flex.utils.b.f(mdVar) : null;
                f0q f0qVar = t7cVar.b;
                return new com.yandex.plus.bdui.action.f(f, f0qVar != null ? bVar3.j(f0qVar) : null);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        com.yandex.plus.log.api.b bVar22 = this.b;
        com.yandex.plus.bdui.flex.utils.b bVar32 = this.a;
        if (i != 0) {
        }
        ounVar = (oun) obj2;
        if (ounVar instanceof t7c) {
        }
    }
}
