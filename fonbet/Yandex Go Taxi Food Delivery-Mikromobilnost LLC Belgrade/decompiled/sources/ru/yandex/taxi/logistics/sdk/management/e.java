package ru.yandex.taxi.logistics.sdk.management;

import defpackage.g92;
import defpackage.l7;
import defpackage.ny61;
import defpackage.puh;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public e(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1 deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1) {
            deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1 = (DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<puh> list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (puh puhVar : list) {
                        String str = puhVar.a;
                        arrayList.add(new l7((!puhVar.s || puhVar.p) ? new g92(2, obj3) : this.b.f.b(str), str, puhVar, 5));
                    }
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.I$0 = 0;
                    deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1 = new DeliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesManagerImpl$getPerformerRoutesStateFlow$$inlined$map$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
