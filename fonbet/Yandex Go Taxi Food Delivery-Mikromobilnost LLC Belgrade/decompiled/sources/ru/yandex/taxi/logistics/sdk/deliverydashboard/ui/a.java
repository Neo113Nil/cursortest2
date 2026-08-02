package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.cms;
import defpackage.hhg;
import defpackage.jl40;
import defpackage.jms;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements vpr, jms {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        b bVar = this.a;
        tje.N(bVar.e, null, null, new DeliveryDashboardActionListener$handle$1((hhg) obj, null, bVar), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, b.class, "handle", "handle(Lcom/yandex/delivery/mapper/model/DashboardAction;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
