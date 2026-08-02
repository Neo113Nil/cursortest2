package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.sloth.command.t;
import defpackage.itv;
import defpackage.l2b;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b implements t {
    public final com.yandex.passport.internal.sloth.m a;

    public b(com.yandex.passport.internal.sloth.m mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        com.yandex.passport.internal.sloth.l.b.getClass();
        Iterable iterable = com.yandex.passport.internal.sloth.l.d;
        List list = ((com.yandex.passport.sloth.command.data.o) obj).a;
        if (list != null) {
            iterable = CollectionsKt.U(list, iterable);
        }
        return new l2b(com.yandex.passport.sloth.command.l.a(new itv(25, iterable, this)));
    }
}
