package ru.yandex.taxi.logistics.sdk;

import defpackage.nwh;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public m(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1 logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1) {
            logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1 = (LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String c = ((Boolean) obj).booleanValue() ? ((nwh) this.b.j.get()).a.c() : null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.L$0 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.L$1 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.L$2 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.L$3 = null;
                    logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1 = new LogisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logisticsSdkInitializer$ConfigImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
