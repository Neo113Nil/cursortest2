package ru.yandex.taxi.main.map;

import defpackage.fnx0;
import defpackage.iv70;
import defpackage.jv70;
import defpackage.kv70;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.ybo;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1 pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1;
        int i;
        ybo yboVar;
        if (continuation instanceof PinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1) {
            pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1 = (PinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1) continuation;
            int i2 = pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    iv70 iv70Var = this.b.c;
                    TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                    ((kv70) iv70Var).getClass();
                    switch (jv70.a[tariffOrderFlow.ordinal()]) {
                        case 1:
                            yboVar = ybo.d;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            yboVar = pex0Var.h;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.L$0 = null;
                    pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.L$1 = null;
                    pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.L$2 = null;
                    pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.L$3 = null;
                    pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yboVar, pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1 = new PinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInfoRepository$tariffEstimatedWaitingFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
