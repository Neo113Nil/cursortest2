package ru.yandex.taxi.linked_order.modals.ambulance.domain;

import defpackage.mrj;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ mrj b;

    public b(mth mthVar, mrj mrjVar) {
        this.a = mthVar;
        this.b = mrjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1 ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1) {
            ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1 = (AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1 = new AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
