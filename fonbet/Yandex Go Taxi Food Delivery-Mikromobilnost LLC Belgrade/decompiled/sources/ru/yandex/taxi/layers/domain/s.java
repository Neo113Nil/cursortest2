package ru.yandex.taxi.layers.domain;

import defpackage.gw00;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.v7s0;
import defpackage.vpr;
import defpackage.x4e0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;

    public s(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PolylinesInteractor$onResponse$$inlined$map$1$2$1 polylinesInteractor$onResponse$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PolylinesInteractor$onResponse$$inlined$map$1$2$1) {
            polylinesInteractor$onResponse$$inlined$map$1$2$1 = (PolylinesInteractor$onResponse$$inlined$map$1$2$1) continuation;
            int i2 = polylinesInteractor$onResponse$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polylinesInteractor$onResponse$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = polylinesInteractor$onResponse$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polylinesInteractor$onResponse$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    int d = gw00.d(tcc.n(list, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj3 : list) {
                        linkedHashMap.put(((x4e0) obj3).b(), obj3);
                    }
                    v7s0 v7s0Var = new v7s0();
                    v7s0Var.a = linkedHashMap;
                    polylinesInteractor$onResponse$$inlined$map$1$2$1.L$0 = null;
                    polylinesInteractor$onResponse$$inlined$map$1$2$1.L$1 = null;
                    polylinesInteractor$onResponse$$inlined$map$1$2$1.L$2 = null;
                    polylinesInteractor$onResponse$$inlined$map$1$2$1.L$3 = null;
                    polylinesInteractor$onResponse$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(v7s0Var, polylinesInteractor$onResponse$$inlined$map$1$2$1) == coroutineSingletons) {
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
        polylinesInteractor$onResponse$$inlined$map$1$2$1 = new PolylinesInteractor$onResponse$$inlined$map$1$2$1(this, continuation);
        Object obj22 = polylinesInteractor$onResponse$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polylinesInteractor$onResponse$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
