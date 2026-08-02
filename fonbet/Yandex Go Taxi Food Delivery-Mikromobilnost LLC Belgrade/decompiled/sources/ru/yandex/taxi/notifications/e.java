package ru.yandex.taxi.notifications;

import defpackage.ha2;
import defpackage.kjz;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ kjz b;

    public e(ha2 ha2Var, kjz kjzVar) {
        this.a = ha2Var;
        this.b = kjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$1 notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$1) {
            notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1 = (NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$1) continuation;
            int i2 = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.L$0 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.L$1 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.L$2 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1 = new NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
