package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.b6s;
import defpackage.bmh;
import defpackage.bvf0;
import defpackage.c6f;
import defpackage.cv8;
import defpackage.dv8;
import defpackage.e0l0;
import defpackage.e4s;
import defpackage.f4s;
import defpackage.f650;
import defpackage.g650;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p4f;
import defpackage.p6s;
import defpackage.pzt0;
import defpackage.q4f;
import defpackage.qu;
import defpackage.r4f;
import defpackage.ue11;
import defpackage.w511;
import defpackage.wth;
import defpackage.z4s;
import defpackage.zy11;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.model.AbandonedCartNotificationCancelReason;

/* loaded from: classes5.dex */
public final class d {
    public final cv8 a;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.order.a b;
    public final dv8 c;
    public final z4s d;
    public final p6s e;
    public final ue11 f;
    public final b6s g;

    public d(cv8 cv8Var, ru.yandex.logistics.sdk.cargo_form.core.impl.order.a aVar, dv8 dv8Var, z4s z4sVar, p6s p6sVar, ue11 ue11Var, b6s b6sVar) {
        this.a = cv8Var;
        this.b = aVar;
        this.c = dv8Var;
        this.d = z4sVar;
        this.e = p6sVar;
        this.f = ue11Var;
        this.g = b6sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TapAction$OrderAction$Flow tapAction$OrderAction$Flow, boolean z, ContinuationImpl continuationImpl) {
        FormCreateOrderInteractor$createOrder$1 formCreateOrderInteractor$createOrder$1;
        int i;
        e0l0 e0l0Var;
        e4s e4sVar;
        List list;
        pzt0 pzt0Var;
        Object g650Var;
        if (continuationImpl instanceof FormCreateOrderInteractor$createOrder$1) {
            formCreateOrderInteractor$createOrder$1 = (FormCreateOrderInteractor$createOrder$1) continuationImpl;
            int i2 = formCreateOrderInteractor$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCreateOrderInteractor$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formCreateOrderInteractor$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCreateOrderInteractor$createOrder$1.label;
                zy11 zy11Var = zy11.a;
                p6s p6sVar = this.e;
                z4s z4sVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z4sVar.a(FormLoadingStateRepository$State.LOADING);
                    j6s b = p6sVar.b();
                    if (b == null) {
                        return zy11Var;
                    }
                    c6f c6fVar = tapAction$OrderAction$Flow == TapAction$OrderAction$Flow.STATE ? c6f.b : c6f.a;
                    int i3 = f4s.a[tapAction$OrderAction$Flow.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        e0l0Var = b.c;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        e0l0Var = b.d;
                    }
                    this.a.getClass();
                    formCreateOrderInteractor$createOrder$1.L$0 = null;
                    formCreateOrderInteractor$createOrder$1.L$1 = null;
                    formCreateOrderInteractor$createOrder$1.L$2 = null;
                    formCreateOrderInteractor$createOrder$1.L$3 = null;
                    formCreateOrderInteractor$createOrder$1.Z$0 = z;
                    formCreateOrderInteractor$createOrder$1.label = 2;
                    obj = this.b.a(e0l0Var, c6fVar, z, formCreateOrderInteractor$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        e4sVar = (e4s) obj;
                        list = e4sVar.a;
                        r4f r4fVar = e4sVar.b;
                        if (!list.isEmpty() && !jl40.l(r4fVar, p4f.a)) {
                            ue11 ue11Var = this.f;
                            ue11Var.f.set(true);
                            ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a aVar = ue11Var.c;
                            pzt0Var = aVar.l;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            aVar.j.a.l(null);
                            aVar.c(AbandonedCartNotificationCancelReason.ORDER);
                            if (list.size() <= 1) {
                                g650Var = f650.a;
                            } else {
                                UUID uuid = (UUID) kotlin.collections.a.R(list);
                                q4f q4fVar = r4fVar instanceof q4f ? (q4f) r4fVar : null;
                                g650Var = new g650(q4fVar != null ? q4fVar.a : null, uuid);
                            }
                            dv8 dv8Var = this.c;
                            ((com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b).r(new wth(5));
                            com.yandex.go.logistics.cargo_flow.a aVar2 = (com.yandex.go.logistics.cargo_flow.a) dv8Var.a.b;
                            aVar2.r(new qu(9));
                            ru.yandex.taxi.logistics.sdk.utils.a.b(new bmh(7, g650Var, aVar2));
                            bvf0.j(this.g, null);
                            p6sVar.a();
                        }
                        z4sVar.a(FormLoadingStateRepository$State.READY);
                        return zy11Var;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                e4sVar = new e4s((List) obj, null);
                list = e4sVar.a;
                r4f r4fVar2 = e4sVar.b;
                if (!list.isEmpty()) {
                    ue11 ue11Var2 = this.f;
                    ue11Var2.f.set(true);
                    ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a aVar3 = ue11Var2.c;
                    pzt0Var = aVar3.l;
                    if (pzt0Var != null) {
                    }
                    aVar3.j.a.l(null);
                    aVar3.c(AbandonedCartNotificationCancelReason.ORDER);
                    if (list.size() <= 1) {
                    }
                    dv8 dv8Var2 = this.c;
                    ((com.yandex.go.logistics.cargo_flow.a) dv8Var2.a.b).r(new wth(5));
                    com.yandex.go.logistics.cargo_flow.a aVar22 = (com.yandex.go.logistics.cargo_flow.a) dv8Var2.a.b;
                    aVar22.r(new qu(9));
                    ru.yandex.taxi.logistics.sdk.utils.a.b(new bmh(7, g650Var, aVar22));
                    bvf0.j(this.g, null);
                    p6sVar.a();
                }
                z4sVar.a(FormLoadingStateRepository$State.READY);
                return zy11Var;
            }
        }
        formCreateOrderInteractor$createOrder$1 = new FormCreateOrderInteractor$createOrder$1(this, continuationImpl);
        Object obj2 = formCreateOrderInteractor$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCreateOrderInteractor$createOrder$1.label;
        zy11 zy11Var2 = zy11.a;
        p6s p6sVar2 = this.e;
        z4s z4sVar2 = this.d;
        if (i != 0) {
        }
        e4sVar = new e4s((List) obj2, null);
        list = e4sVar.a;
        r4f r4fVar22 = e4sVar.b;
        if (!list.isEmpty()) {
        }
        z4sVar2.a(FormLoadingStateRepository$State.READY);
        return zy11Var2;
    }
}
