package ru.yandex.taxi.costcenters.fields;

import defpackage.lwe;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lwe b;
    public final /* synthetic */ boolean c;

    public a(vpr vprVar, lwe lweVar, boolean z) {
        this.a = vprVar;
        this.b = lweVar;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1 costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1) {
            costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1 = (CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1) continuation;
            int i2 = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList a = this.b.a(this.c);
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.L$0 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.L$1 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.L$2 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.L$3 = null;
                    costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1 = new CostCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = costCenterFieldsInteractor$getCostCenterFieldsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
