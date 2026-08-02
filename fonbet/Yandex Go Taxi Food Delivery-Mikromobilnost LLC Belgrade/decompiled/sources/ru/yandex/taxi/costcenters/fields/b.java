package ru.yandex.taxi.costcenters.fields;

import defpackage.lwe;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ lwe b;
    public final /* synthetic */ boolean c;

    public b(tpr tprVar, lwe lweVar, boolean z) {
        this.a = tprVar;
        this.b = lweVar;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1 costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1) {
            costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1 = (CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1) continuation;
            int i2 = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.L$0 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.L$1 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.L$2 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1 = new CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
