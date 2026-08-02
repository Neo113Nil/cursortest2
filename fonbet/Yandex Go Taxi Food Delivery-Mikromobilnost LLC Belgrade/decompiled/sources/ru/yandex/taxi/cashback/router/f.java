package ru.yandex.taxi.cashback.router;

import defpackage.h3y;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class f {
    public final tse a;
    public final h3y b;
    public final ru.yandex.taxi.cashback.international.c c;
    public pzt0 d;

    public f(tse tseVar, h3y h3yVar, ru.yandex.taxi.cashback.international.c cVar) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, sls slsVar, ContinuationImpl continuationImpl) {
        SdkStateAwaitRouter$awaitSdkStateAndRun$1 sdkStateAwaitRouter$awaitSdkStateAndRun$1;
        int i;
        h3y h3yVar = fVar.b;
        if (continuationImpl instanceof SdkStateAwaitRouter$awaitSdkStateAndRun$1) {
            sdkStateAwaitRouter$awaitSdkStateAndRun$1 = (SdkStateAwaitRouter$awaitSdkStateAndRun$1) continuationImpl;
            int i2 = sdkStateAwaitRouter$awaitSdkStateAndRun$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkStateAwaitRouter$awaitSdkStateAndRun$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkStateAwaitRouter$awaitSdkStateAndRun$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkStateAwaitRouter$awaitSdkStateAndRun$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((ru.yandex.taxi.plus.repository.c) h3yVar.get()).a.e.getValue() != null) {
                        slsVar.invoke();
                        return zy11Var;
                    }
                    e eVar = new e(((ru.yandex.taxi.plus.repository.c) h3yVar.get()).a.b());
                    sdkStateAwaitRouter$awaitSdkStateAndRun$1.L$0 = slsVar;
                    sdkStateAwaitRouter$awaitSdkStateAndRun$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(eVar, sdkStateAwaitRouter$awaitSdkStateAndRun$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) sdkStateAwaitRouter$awaitSdkStateAndRun$1.L$0;
                    kotlin.b.b(obj);
                }
                slsVar.invoke();
                return zy11Var;
            }
        }
        sdkStateAwaitRouter$awaitSdkStateAndRun$1 = new SdkStateAwaitRouter$awaitSdkStateAndRun$1(fVar, continuationImpl);
        Object obj2 = sdkStateAwaitRouter$awaitSdkStateAndRun$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateAwaitRouter$awaitSdkStateAndRun$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        slsVar.invoke();
        return zy11Var2;
    }

    public final void b(sls slsVar) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = com.yandex.go.coroutines.b.g(this.a, null, null, new SdkStateAwaitRouter$awaitAndRun$1(this, slsVar, null), 3);
    }
}
