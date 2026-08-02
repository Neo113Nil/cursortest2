package ru.yandex.taxi.layers.presentation.mapnotification;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ c b;

    public b(n0 n0Var, c cVar) {
        this.a = n0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1 mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1;
        int i;
        if (continuation instanceof MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1) {
            mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1 = (MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1) continuation;
            int i2 = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.L$0 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.L$1 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.L$2 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1) == coroutineSingletons) {
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
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1 = new MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1(this, continuation);
        Object obj2 = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
