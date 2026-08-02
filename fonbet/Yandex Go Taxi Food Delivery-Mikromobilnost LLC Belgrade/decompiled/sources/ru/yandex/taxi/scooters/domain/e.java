package ru.yandex.taxi.scooters.domain;

import defpackage.gko0;
import defpackage.ny61;
import defpackage.oqm0;
import defpackage.sqm0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e {
    public final ru.yandex.taxi.scooters.data.data_source.a a;
    public final gko0 b;
    public final ru.yandex.taxi.scooters.data.g c;

    public e(ru.yandex.taxi.scooters.data.data_source.a aVar, gko0 gko0Var, ru.yandex.taxi.scooters.data.g gVar) {
        this.a = aVar;
        this.b = gko0Var;
        this.c = gVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(6:20|21|(1:23)|13|14|15))(5:24|25|(7:27|(1:29)(1:33)|30|(1:32)|21|(0)|13)|14|15)))|38|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "Scooters.Orders: polling failed", null, new ru.yandex.taxi.scooters.domain.model.ScootersSessionsStateFailedException(), "Error occurred while scooters user state polling", 2);
        r12 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:13:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, sqm0 sqm0Var, ContinuationImpl continuationImpl) {
        ScootersCurrentActiveOrdersInteractor$makeNextRequest$1 scootersCurrentActiveOrdersInteractor$makeNextRequest$1;
        int i;
        e eVar2;
        Object a;
        eVar.getClass();
        if (continuationImpl instanceof ScootersCurrentActiveOrdersInteractor$makeNextRequest$1) {
            scootersCurrentActiveOrdersInteractor$makeNextRequest$1 = (ScootersCurrentActiveOrdersInteractor$makeNextRequest$1) continuationImpl;
            int i2 = scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentActiveOrdersInteractor$makeNextRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar3 = eVar;
                    if (kotlinx.coroutines.a.p(scootersCurrentActiveOrdersInteractor$makeNextRequest$1.get_context())) {
                        eVar3.b.getClass();
                        long j = sqm0Var instanceof oqm0 ? 10000L : 90000L;
                        scootersCurrentActiveOrdersInteractor$makeNextRequest$1.L$0 = sqm0Var;
                        scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label = 1;
                        eVar2 = eVar3;
                        if (kotlinx.coroutines.a.i(j, scootersCurrentActiveOrdersInteractor$makeNextRequest$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        scootersCurrentActiveOrdersInteractor$makeNextRequest$1.L$0 = sqm0Var;
                        scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label = 2;
                        a = eVar2.a.a(scootersCurrentActiveOrdersInteractor$makeNextRequest$1);
                        eVar = a;
                        if (a == coroutineSingletons) {
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sqm0Var = (sqm0) scootersCurrentActiveOrdersInteractor$makeNextRequest$1.L$0;
                    kotlin.b.b(obj);
                    eVar = eVar;
                    return zy11Var;
                }
                sqm0Var = (sqm0) scootersCurrentActiveOrdersInteractor$makeNextRequest$1.L$0;
                kotlin.b.b(obj);
                eVar2 = eVar;
                scootersCurrentActiveOrdersInteractor$makeNextRequest$1.L$0 = sqm0Var;
                scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label = 2;
                a = eVar2.a.a(scootersCurrentActiveOrdersInteractor$makeNextRequest$1);
                eVar = a;
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        scootersCurrentActiveOrdersInteractor$makeNextRequest$1 = new ScootersCurrentActiveOrdersInteractor$makeNextRequest$1(eVar, continuationImpl);
        Object obj2 = scootersCurrentActiveOrdersInteractor$makeNextRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentActiveOrdersInteractor$makeNextRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        defpackage.zgz.a(null, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersCurrentActiveOrdersInteractor$makeInitRequest$1 scootersCurrentActiveOrdersInteractor$makeInitRequest$1;
        int i;
        if (continuationImpl instanceof ScootersCurrentActiveOrdersInteractor$makeInitRequest$1) {
            scootersCurrentActiveOrdersInteractor$makeInitRequest$1 = (ScootersCurrentActiveOrdersInteractor$makeInitRequest$1) continuationImpl;
            int i2 = scootersCurrentActiveOrdersInteractor$makeInitRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentActiveOrdersInteractor$makeInitRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentActiveOrdersInteractor$makeInitRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentActiveOrdersInteractor$makeInitRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersCurrentActiveOrdersInteractor$makeInitRequest$1.label = 1;
                    if (this.a.a(scootersCurrentActiveOrdersInteractor$makeInitRequest$1) == coroutineSingletons) {
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
        scootersCurrentActiveOrdersInteractor$makeInitRequest$1 = new ScootersCurrentActiveOrdersInteractor$makeInitRequest$1(this, continuationImpl);
        Object obj2 = scootersCurrentActiveOrdersInteractor$makeInitRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentActiveOrdersInteractor$makeInitRequest$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object c(Continuation continuation) {
        return kotlinx.coroutines.flow.e.k(this.c.b(true), new ScootersCurrentActiveOrdersInteractor$makePolling$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1 scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1;
        int i;
        if (continuationImpl instanceof ScootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1) {
            scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1 = (ScootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1) continuationImpl;
            int i2 = scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.label = 1;
                    if (this.a.a(scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1) == coroutineSingletons) {
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
        scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1 = new ScootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1(this, continuationImpl);
        Object obj2 = scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentActiveOrdersInteractor$updateCurrentActiveOrders$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
