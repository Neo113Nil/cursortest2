package ru.yandex.taxi.experiments;

import defpackage.dzm;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.w96;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements t1b0 {
    public final /* synthetic */ dzm a;
    public final /* synthetic */ q b;

    public c(dzm dzmVar, q qVar) {
        this.a = dzmVar;
        this.b = qVar;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return new b(this.b.a(), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.t1b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1 experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1;
        int i;
        tls tlsVar;
        if (continuation instanceof ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1) {
            experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1 = (ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1) continuation;
            int i2 = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dzm dzmVar = this.a;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.L$0 = dzmVar;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.label = 1;
                    Object b = this.b.b(experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    tlsVar = dzmVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.L$0;
                    kotlin.b.b(obj);
                }
                return tlsVar.invoke(obj);
            }
        }
        experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1 = new ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1(this, continuation);
        Object obj2 = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentSuspend$1.label;
        if (i != 0) {
        }
        return tlsVar.invoke(obj2);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (w96) this.a.invoke(this.b.c());
    }
}
