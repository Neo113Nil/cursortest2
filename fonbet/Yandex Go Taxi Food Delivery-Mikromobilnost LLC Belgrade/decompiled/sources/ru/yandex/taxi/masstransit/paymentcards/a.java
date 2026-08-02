package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.fl3;
import defpackage.hl3;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1 mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1) {
            mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1 = (MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1) continuation;
            int i2 = mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((hl3) obj) instanceof fl3);
                    mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.L$0 = null;
                    mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.L$1 = null;
                    mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.L$2 = null;
                    mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.L$3 = null;
                    mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1 = new MtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTransportCardSubscriber$subscribeToTransportCardEvents$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
