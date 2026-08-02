package ru.yandex.taxi.persuggest.source;

import defpackage.g2t;
import defpackage.kw11;
import defpackage.ny61;
import defpackage.rtx0;
import defpackage.sxq0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1 taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof TaxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1) {
            taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1 = (TaxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1) continuation;
            int i2 = taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sxq0 sxq0Var = ((g2t) obj).a.a.d;
                    rtx0 rtx0Var = sxq0Var != null ? sxq0Var.a : null;
                    kw11 kw11Var = rtx0Var != null ? rtx0Var.c : null;
                    taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.L$0 = null;
                    taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.L$1 = null;
                    taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.L$2 = null;
                    taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.L$3 = null;
                    taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(kw11Var, taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1 = new TaxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiServiceAvailabilityRepositoryImpl$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
