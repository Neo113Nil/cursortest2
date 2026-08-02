package ru.yandex.taxi.cashback.sdk;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class v implements tpr {
    public final /* synthetic */ com.yandex.go.chargers.payments.domain.b a;
    public final /* synthetic */ String b;

    public v(com.yandex.go.chargers.payments.domain.b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1 taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1) {
            taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1 = (TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1) continuation;
            int i2 = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(vprVar, this.b);
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.L$0 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.L$1 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.L$2 = null;
                    taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(uVar, taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1 = new TaxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiClientContextRepository$getChargersClientContextFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
