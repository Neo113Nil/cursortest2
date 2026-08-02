package ru.yandex.taxi.communications;

import defpackage.kay0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kay0 b;

    public o(vpr vprVar, kay0 kay0Var) {
        this.a = vprVar;
        this.b = kay0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1 taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1) {
            taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1 = (TaxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1) continuation;
            int i2 = taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String a = this.b.a();
                    taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.L$0 = null;
                    taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.L$1 = null;
                    taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.L$2 = null;
                    taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.L$3 = null;
                    taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1 = new TaxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiStatusMessageSource$addStatusMessageListener$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
