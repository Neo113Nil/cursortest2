package ru.yandex.taxi.logistics.sdk.management.localstate;

import defpackage.jgu;
import defpackage.ny61;
import defpackage.oth;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
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
        DeliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1 deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1) {
            deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1 = (DeliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set<Pair> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                    for (Pair pair : set) {
                        arrayList.add(new jgu((String) pair.c(), ((Number) pair.f()).intValue()));
                    }
                    oth othVar = new oth(kotlin.collections.a.N0(arrayList));
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.I$0 = 0;
                    deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(othVar, deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1 = new DeliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesLocalStateRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
