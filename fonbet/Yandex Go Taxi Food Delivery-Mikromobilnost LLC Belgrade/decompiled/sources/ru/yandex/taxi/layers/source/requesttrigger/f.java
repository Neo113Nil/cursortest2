package ru.yandex.taxi.layers.source.requesttrigger;

import defpackage.gyx;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ gyx c;

    public f(tpr tprVar, g gVar, gyx gyxVar) {
        this.a = tprVar;
        this.b = gVar;
        this.c = gyxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1 cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1;
        int i;
        if (continuation instanceof CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1) {
            cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1 = (CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1) continuation;
            int i2 = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c);
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.L$0 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.L$1 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.L$2 = null;
                    cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1) == coroutineSingletons) {
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
        cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1 = new CameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1(this, continuation);
        Object obj2 = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraEventRepository$listenToTriggerEvent$lambda$0$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
