package ru.yandex.taxi.cashback.sdk;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;

    public q(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1 plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof PlusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1) {
            plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1 = (PlusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1) continuation;
            int i2 = plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar);
                    plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.L$0 = null;
                    plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.L$1 = null;
                    plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.L$2 = null;
                    plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(pVar, plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1 = new PlusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSdkDataRepository$preorderAddressFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
