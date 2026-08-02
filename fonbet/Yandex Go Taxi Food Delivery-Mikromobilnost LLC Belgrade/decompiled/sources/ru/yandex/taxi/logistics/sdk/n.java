package ru.yandex.taxi.logistics.sdk;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o b;

    public n(tpr tprVar, o oVar) {
        this.a = tprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1 logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1) {
            logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1 = (LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1) continuation;
            int i2 = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.L$0 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.L$1 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.L$2 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1 = new LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
