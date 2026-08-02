package ru.yandex.taxi.summary.topnotification.plus;

import defpackage.drd;
import defpackage.nrd;
import defpackage.s6d0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class c {
    public final drd a;
    public final s6d0 b;

    public c(drd drdVar, s6d0 s6d0Var) {
        this.a = drdVar;
        this.b = s6d0Var;
    }

    public final b a() {
        nrd nrdVar = this.a.b;
        return new b(com.yandex.go.coroutines.b.d(e.t(new com.yandex.go.payments.composite.data.b(nrdVar.b, nrdVar)), new CompositePaymentNotificationInteractor$notificationModelFlow$1(this, null)), this);
    }
}
