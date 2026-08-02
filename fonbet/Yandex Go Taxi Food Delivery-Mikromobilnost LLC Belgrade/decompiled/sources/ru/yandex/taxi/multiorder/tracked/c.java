package ru.yandex.taxi.multiorder.tracked;

import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.cm40;
import defpackage.l551;
import defpackage.tpr;
import defpackage.xvr0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widgets.data.repository.h;

/* loaded from: classes6.dex */
public final class c {
    public final tpr a;

    public c(g gVar, cm40 cm40Var, l551 l551Var) {
        this.a = e.t(new m0(new b(gVar.h(), cm40Var), new h((tpr) ((xvr0) l551Var.a.m.get()).a.getValue()), new TrackedActiveOrderRepository$trackedActiveOrdersFlow$2$1(3, null)));
    }
}
