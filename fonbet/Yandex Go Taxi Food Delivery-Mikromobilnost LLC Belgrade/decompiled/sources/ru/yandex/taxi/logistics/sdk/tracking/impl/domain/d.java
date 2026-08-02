package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.gri;
import defpackage.h8n;
import defpackage.lqi;
import defpackage.ny61;
import defpackage.t701;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DynamicHeaderInfoInteractor$special$$inlined$map$1$2$1 dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DynamicHeaderInfoInteractor$special$$inlined$map$1$2$1) {
            dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1 = (DynamicHeaderInfoInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gri griVar = ((t701) obj).a;
                    lqi lqiVar = griVar.b.d;
                    h8n h8nVar = new h8n(griVar.f, (lqiVar != null ? lqiVar.d : null) != null ? null : griVar.g, griVar.u, lqiVar);
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.I$0 = 0;
                    dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h8nVar, dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1 = new DynamicHeaderInfoInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicHeaderInfoInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
