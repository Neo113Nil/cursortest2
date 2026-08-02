package ru.yandex.taxi.notifications;

import defpackage.as21;
import defpackage.kjz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kjz b;

    public d(vpr vprVar, kjz kjzVar) {
        this.a = vprVar;
        this.b = kjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1 notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1) {
            notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1 = (NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    boolean z = false;
                    if (!((as21) ((yvi0) this.b.b).a).a("NOTIFICATION_PERMISSION_ASKED", false) && !booleanValue) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1 = new NotificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPermissionCanBeShownInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
