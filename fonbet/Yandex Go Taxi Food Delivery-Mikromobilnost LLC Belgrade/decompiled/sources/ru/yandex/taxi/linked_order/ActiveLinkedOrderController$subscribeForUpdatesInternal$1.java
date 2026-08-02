package ru.yandex.taxi.linked_order;

import defpackage.loy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "canShow", "Lloy;", "notificationData", "<anonymous>", "(ZLloy;)Lloy;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.ActiveLinkedOrderController$subscribeForUpdatesInternal$1", f = "ActiveLinkedOrderController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ActiveLinkedOrderController$subscribeForUpdatesInternal$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ActiveLinkedOrderController$subscribeForUpdatesInternal$1 activeLinkedOrderController$subscribeForUpdatesInternal$1 = new ActiveLinkedOrderController$subscribeForUpdatesInternal$1(3, (Continuation) obj3);
        activeLinkedOrderController$subscribeForUpdatesInternal$1.Z$0 = booleanValue;
        activeLinkedOrderController$subscribeForUpdatesInternal$1.L$0 = (loy) obj2;
        return activeLinkedOrderController$subscribeForUpdatesInternal$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        loy loyVar = (loy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return z ? loyVar : loy.e;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
