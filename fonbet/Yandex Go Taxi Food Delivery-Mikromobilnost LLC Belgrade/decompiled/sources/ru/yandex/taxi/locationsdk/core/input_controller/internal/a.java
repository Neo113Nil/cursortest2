package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.k7z;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.qke;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Map b;

    public a(vpr vprVar, Map map) {
        this.a = vprVar;
        this.b = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        InputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1 inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof InputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1) {
            inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1 = (InputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1) continuation;
            int i2 = inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.b.keySet().contains(new q6z(qke.q((k7z) obj)))) {
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.L$0 = null;
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.L$1 = null;
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.L$2 = null;
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.L$3 = null;
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.I$0 = 0;
                        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1 = new InputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputControllerImpl$requestLocationUpdates$lambda$1$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
