package com.yandex.passport.internal.usecase.ui;

import defpackage.rhw;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.core.accounts.s b;
    public final com.yandex.passport.internal.core.accounts.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.s sVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        sVar.getClass();
        eVar.getClass();
        this.b = sVar;
        this.c = eVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        a0 a0Var = (a0) obj;
        a0Var.getClass();
        com.yandex.passport.internal.d a = this.c.a();
        ArrayList c = this.b.c(a0Var.a, a);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            com.yandex.passport.internal.l e = a.e(((com.yandex.passport.internal.entities.n) it.next()).a);
            if (e != null && e.e.Z) {
                return e;
            }
            if (e != null) {
                arrayList.add(e);
            }
        }
        return (com.yandex.passport.internal.l) CollectionsKt.S(arrayList, 0);
    }
}
