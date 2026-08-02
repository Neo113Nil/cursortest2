package ru.yandex.taxi.cashback;

import defpackage.h8b0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
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
        CashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1 cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1) {
            cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1 = (CashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1) continuation;
            int i2 = cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof h8b0) {
                            arrayList.add(obj3);
                        }
                    }
                    Object R = kotlin.collections.a.R(arrayList);
                    cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.L$0 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.L$1 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.L$2 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.L$3 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(R, cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1) == coroutineSingletons) {
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
        cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1 = new CashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackTeaserController$onExperimentChanged$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
