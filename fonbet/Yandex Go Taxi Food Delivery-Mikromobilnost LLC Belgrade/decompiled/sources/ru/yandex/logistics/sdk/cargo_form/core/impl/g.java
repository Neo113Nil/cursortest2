package ru.yandex.logistics.sdk.cargo_form.core.impl;

import defpackage.ny61;
import defpackage.q3s;
import defpackage.t3s;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormCoreWidgetsProviderImpl$special$$inlined$map$5$2$1 formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1;
        int i;
        if (continuation instanceof FormCoreWidgetsProviderImpl$special$$inlined$map$5$2$1) {
            formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1 = (FormCoreWidgetsProviderImpl$special$$inlined$map$5$2$1) continuation;
            int i2 = formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t3s t3sVar = (t3s) obj;
                    q3s q3sVar = new q3s(t3sVar.g, t3sVar.h);
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.L$0 = null;
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.L$1 = null;
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.L$2 = null;
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.L$3 = null;
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.I$0 = 0;
                    formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.label = 1;
                    if (this.a.emit(q3sVar, formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1) == coroutineSingletons) {
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
        formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1 = new FormCoreWidgetsProviderImpl$special$$inlined$map$5$2$1(this, continuation);
        Object obj22 = formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCoreWidgetsProviderImpl$special$$inlined$map$5$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
