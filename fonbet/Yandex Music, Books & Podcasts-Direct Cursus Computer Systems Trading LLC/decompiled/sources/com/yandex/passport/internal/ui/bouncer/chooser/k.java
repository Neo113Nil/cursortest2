package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.y0;
import com.yandex.passport.internal.usecase.ui.a0;
import com.yandex.passport.internal.usecase.ui.b0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t75;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class k extends com.yandex.passport.common.mvi.h {
    public final b0 c;
    public final boolean d;
    public final List e;

    public k(b0 b0Var, boolean z, List list) {
        b0Var.getClass();
        list.getClass();
        this.c = b0Var;
        this.d = z;
        this.e = list;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        if (!((i) obj).equals(i.a)) {
            b6e.s();
            return null;
        }
        n8g b = t75.b();
        List list = this.e;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t((y0) it.next()));
        }
        b.addAll(arrayList);
        if (this.d) {
            b.add(u.a);
        }
        a(new o(t75.a(b)));
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        v vVar = ((x) obj).a;
        if (vVar instanceof t) {
            Object i = i((t) vVar, gVar);
            return i == nm6.a ? i : Unit.a;
        }
        if (vVar instanceof u) {
            a(new n(new j2(null)));
            return Unit.a;
        }
        b6e.s();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        a(new l(th));
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(t tVar, cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.common.core.f fVar;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a(new m(tVar.a.a));
                    a0 a0Var = new a0(tVar.a.a);
                    jVar.l = 1;
                    obj = this.c.g(a0Var, jVar);
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
                lVar = (com.yandex.passport.internal.l) obj;
                if (lVar != null || (fVar = lVar.b) == null) {
                    xq0.q("No related accounts to create a profile.");
                    return null;
                }
                a(new n(new j2(fVar)));
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj2;
        if (lVar != null) {
        }
        xq0.q("No related accounts to create a profile.");
        return null;
    }
}
