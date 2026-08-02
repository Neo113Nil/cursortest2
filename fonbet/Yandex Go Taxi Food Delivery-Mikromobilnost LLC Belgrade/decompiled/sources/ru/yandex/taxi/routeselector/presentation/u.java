package ru.yandex.taxi.routeselector.presentation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class u implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ boolean b;

    public u(r0 r0Var, boolean z) {
        this.a = r0Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SelectorPinV1DataRepository$anchorFlow$$inlined$map$1$1 selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SelectorPinV1DataRepository$anchorFlow$$inlined$map$1$1) {
            selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1 = (SelectorPinV1DataRepository$anchorFlow$$inlined$map$1$1) continuation;
            int i2 = selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.L$0 = null;
                    selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.L$1 = null;
                    selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.L$2 = null;
                    selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(tVar, selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1 = new SelectorPinV1DataRepository$anchorFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorPinV1DataRepository$anchorFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
