package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.internal.ui.bouncer.model.k2;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.passport.common.coroutine.a a;
    public final m b;
    public final com.yandex.passport.internal.report.reporters.m c;
    public final com.yandex.passport.internal.flags.i d;

    public i(com.yandex.passport.common.coroutine.a aVar, m mVar, com.yandex.passport.internal.report.reporters.m mVar2, com.yandex.passport.internal.flags.i iVar) {
        aVar.getClass();
        mVar.getClass();
        mVar2.getClass();
        iVar.getClass();
        this.a = aVar;
        this.b = mVar;
        this.c = mVar2;
        this.d = iVar;
    }

    public final k2 a(n2 n2Var, List list, int i) {
        if (!((Boolean) this.d.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
            return k2.a;
        }
        com.yandex.passport.common.core.f a = n2Var.a();
        if (a == null) {
            return k2.a;
        }
        n2 n2Var2 = (n2) CollectionsKt.S(list, i - 1);
        com.yandex.passport.common.core.f a2 = n2Var2 != null ? n2Var2.a() : null;
        n2 n2Var3 = (n2) CollectionsKt.S(list, i + 1);
        com.yandex.passport.common.core.f a3 = n2Var3 != null ? n2Var3.a() : null;
        return (Intrinsics.d(a2, a) || Intrinsics.d(a3, a)) ? !Intrinsics.d(a2, a) ? k2.b : !Intrinsics.d(a3, a) ? k2.d : k2.c : k2.a;
    }
}
