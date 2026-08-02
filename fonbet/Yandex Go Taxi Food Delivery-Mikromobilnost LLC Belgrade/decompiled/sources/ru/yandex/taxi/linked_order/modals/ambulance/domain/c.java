package ru.yandex.taxi.linked_order.modals.ambulance.domain;

import defpackage.ny61;
import defpackage.sly;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ru.yandex.taxi.linked_order.mapper.a b;

    public c(vpr vprVar, ru.yandex.taxi.linked_order.mapper.a aVar) {
        this.a = vprVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1 linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof LinkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1) {
            linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1 = (LinkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$5 = null;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$6 = null;
                    linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label = 1;
                    Object b = this.b.b((sly) obj, linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$0 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$1 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$2 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$3 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$4 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$5 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$6 = null;
                linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1 = new LinkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$0 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$1 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$2 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$3 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$4 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$5 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.L$6 = null;
        linkedOrderInfoInteractor$getLinkedOrderInfoFlow$$inlined$map$1$2$1.label = 2;
    }
}
