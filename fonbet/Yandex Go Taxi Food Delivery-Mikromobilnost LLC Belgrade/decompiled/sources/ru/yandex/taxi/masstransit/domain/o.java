package ru.yandex.taxi.masstransit.domain;

import defpackage.g73;
import defpackage.g92;
import defpackage.gw00;
import defpackage.hrv;
import defpackage.irv;
import defpackage.mq30;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wei;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mq30 b;

    public o(vpr vprVar, mq30 mq30Var) {
        this.a = vprVar;
        this.b = mq30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1 mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1) {
            mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1 = (MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MtSummaryCommunicationsResponse.b.a aVar = (MtSummaryCommunicationsResponse.b.a) obj;
                    this.b.getClass();
                    g73 O0 = kotlin.collections.a.O0(aVar.b);
                    int d = gw00.d(tcc.n(O0, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it = O0.iterator();
                    while (true) {
                        irv irvVar = (irv) it;
                        if (!irvVar.c.hasNext()) {
                            break;
                        }
                        hrv hrvVar = (hrv) irvVar.next();
                        Pair pair = new Pair(hrvVar.b, Integer.valueOf(hrvVar.a));
                        linkedHashMap.put(pair.c(), pair.f());
                    }
                    g92 g92Var = new g92(2, kotlin.collections.a.x0(aVar.a, new wei(linkedHashMap, i3)));
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.L$0 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.L$1 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.L$2 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.L$3 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g92Var, mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1 = new MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$2$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
