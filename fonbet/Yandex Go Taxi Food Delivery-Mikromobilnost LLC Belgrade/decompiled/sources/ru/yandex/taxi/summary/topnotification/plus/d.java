package ru.yandex.taxi.summary.topnotification.plus;

import defpackage.b2k;
import defpackage.k7x0;
import defpackage.kld0;
import defpackage.s0r0;
import defpackage.tpr;
import defpackage.xdf;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class d {
    public final s0r0 a;
    public final xdf b;
    public final k7x0 c;
    public final kld0 d;

    public d(s0r0 s0r0Var, xdf xdfVar, k7x0 k7x0Var, kld0 kld0Var) {
        this.a = s0r0Var;
        this.b = xdfVar;
        this.c = k7x0Var;
        this.d = kld0Var;
    }

    public final b2k a(tpr tprVar) {
        return e.s(new m0(tprVar, e.t(this.d.a.a.b()), new PlusNotificationInteractor$notificationModelFlow$1(this, null)), new PlusNotificationInteractor$notificationModelFlow$2(2, this, d.class, "areSameModels", "areSameModels(Lru/yandex/taxi/summary/topnotification/plus/PlusNotificationModel;Lru/yandex/taxi/summary/topnotification/plus/PlusNotificationModel;)Z", 0));
    }
}
