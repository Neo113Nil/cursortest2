package ru.yandex.taxi.linked_order.interactor;

import defpackage.loy;
import defpackage.ny61;
import defpackage.sly;
import defpackage.tly;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class g0 implements vpr {
    public final /* synthetic */ vpr a;

    public g0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1 notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1;
        int i;
        tly a;
        if (continuation instanceof NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1) {
            notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1 = (NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1) continuation;
            int i2 = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sly slyVar = (sly) kotlin.collections.a.R((List) obj);
                    loy loyVar = (slyVar == null || (a = slyVar.a()) == null) ? loy.e : new loy(true, a.e(), a.d(), a.k());
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.L$0 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.L$1 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.L$2 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.L$3 = null;
                    notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(loyVar, notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1 = new NotificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationLinkedOrderInteractor$notificationsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
