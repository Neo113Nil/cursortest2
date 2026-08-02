package ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl;

import defpackage.p1f;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements p1f {
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.p1f
    public final tpr a() {
        return this.a.b;
    }

    @Override // defpackage.p1f
    public final Object b(Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(this.a.a(), new CouponDataStore$clear$2(2, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return a == coroutineSingletons ? a : zy11Var;
    }
}
