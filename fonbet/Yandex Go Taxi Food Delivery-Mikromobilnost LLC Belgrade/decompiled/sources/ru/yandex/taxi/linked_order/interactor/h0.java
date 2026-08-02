package ru.yandex.taxi.linked_order.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class h0 implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.o a;

    public h0(kotlinx.coroutines.flow.o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1 notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1) {
            notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1 = (NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1) continuation;
            int i2 = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g0 g0Var = new g0(vprVar);
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.L$0 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.L$1 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.L$2 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(g0Var, notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1 = new NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
