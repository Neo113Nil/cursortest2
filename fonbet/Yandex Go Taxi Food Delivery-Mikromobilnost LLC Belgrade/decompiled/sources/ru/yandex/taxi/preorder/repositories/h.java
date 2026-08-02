package ru.yandex.taxi.preorder.repositories;

import defpackage.ny61;
import defpackage.pte0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pte0 b;

    public h(vpr vprVar, pte0 pte0Var) {
        this.a = vprVar;
        this.b = pte0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PreorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1 preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PreorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1) {
            preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1 = (PreorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1) continuation;
            int i2 = preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    String str = this.b.a.a.Q;
                    if (str == null) {
                        str = "default";
                    }
                    preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.L$0 = null;
                    preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.L$1 = null;
                    preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.L$2 = null;
                    preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.L$3 = null;
                    preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(str, preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1 = new PreorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderZoneModeRepository$zoneModeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
