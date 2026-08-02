package ru.yandex.taxi.experiments;

import defpackage.dzm;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w96;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dzm b;

    public a(vpr vprVar, dzm dzmVar) {
        this.a = vprVar;
        this.b = dzmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1 experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1) {
            experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1 = (ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object invoke = this.b.invoke((w96) obj);
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.L$0 = null;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.L$1 = null;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.L$2 = null;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.L$3 = null;
                    experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(invoke, experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1 = new ExperimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentProviderFactoryKt$persistentBooleanProviderWithDefaultValueIfDisabled$1$experimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
