package com.yandex.passport.internal.usecase;

import defpackage.r7o;
import defpackage.rhw;
import defpackage.z7o;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class p extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.storage.m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.m mVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        mVar.getClass();
        this.b = mVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.yandex.passport.internal.storage.m mVar = this.b;
            if (!hasNext) {
                mVar.h.setValue(mVar, com.yandex.passport.internal.storage.m.m[6], Boolean.TRUE);
                r7o r7oVar = z7o.b;
                return new z7o(Unit.a);
            }
            mVar.a(((com.yandex.passport.internal.l) it.next()).b).a(true);
        }
    }
}
