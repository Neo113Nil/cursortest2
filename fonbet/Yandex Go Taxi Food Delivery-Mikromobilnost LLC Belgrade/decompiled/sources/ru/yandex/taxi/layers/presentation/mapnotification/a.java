package ru.yandex.taxi.layers.presentation.mapnotification;

import com.yandex.go.layers.api.model.params.Mode;
import defpackage.c430;
import defpackage.cq60;
import defpackage.ny61;
import defpackage.o9u0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r8.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1 mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Mode mode;
        if (continuation instanceof MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1) {
            mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1 = (MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1) continuation;
            int i2 = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    cq60 cq60Var = (cq60) pair.getFirst();
                    Mode mode2 = ((c430) pair.getSecond()).a;
                    ru.yandex.taxi.layers.source.factory.b bVar = this.b.b;
                    o9u0 o9u0Var = cq60Var.j;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$0 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$1 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$2 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$4 = vprVar2;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$5 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$6 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$7 = null;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$8 = mode2;
                    mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.c(o9u0Var, mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        mode = mode2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                mode = (Mode) mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$8;
                vprVar = (vpr) mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                Pair pair2 = new Pair(mode, obj2);
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$0 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$1 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$2 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$3 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$4 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$5 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$6 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$7 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$8 = null;
                mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label = 2;
            }
        }
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1 = new MapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Pair pair22 = new Pair(mode, obj22);
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$0 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$1 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$2 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$3 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$4 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$5 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$6 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$7 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.L$8 = null;
        mapNotificationInteractor$listenToMapNotifications$$inlined$map$1$2$1.label = 2;
    }
}
