package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.arb0;
import defpackage.bms;
import defpackage.e0l0;
import defpackage.kei;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.x991;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkei;", "source", "", "destinations", "", "isCleared", "Larb0;", "<anonymous>", "(Lkei;Ljava/util/List;Z)Larb0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.PickupPointsRepositoryImpl$routeFlow$1", f = "PickupPointsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointsRepositoryImpl$routeFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        PickupPointsRepositoryImpl$routeFlow$1 pickupPointsRepositoryImpl$routeFlow$1 = new PickupPointsRepositoryImpl$routeFlow$1(4, (Continuation) obj4);
        pickupPointsRepositoryImpl$routeFlow$1.L$0 = (kei) obj;
        pickupPointsRepositoryImpl$routeFlow$1.L$1 = (List) obj2;
        pickupPointsRepositoryImpl$routeFlow$1.Z$0 = booleanValue;
        return pickupPointsRepositoryImpl$routeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kei keiVar = (kei) this.L$0;
        List list = (List) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List singletonList = Collections.singletonList(x991.c(keiVar));
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(x991.c((kei) it.next()));
        }
        return new arb0(new e0l0(kotlin.collections.a.m0(arrayList, singletonList)), z);
    }
}
