package ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors;

import defpackage.mth;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.delivery.d;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c.a(r7, (defpackage.oo0) r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        FetchDashboardContentInteractor$start$2$1$emit$1 fetchDashboardContentInteractor$start$2$1$emit$1;
        int i;
        c cVar;
        if (continuation instanceof FetchDashboardContentInteractor$start$2$1$emit$1) {
            fetchDashboardContentInteractor$start$2$1$emit$1 = (FetchDashboardContentInteractor$start$2$1$emit$1) continuation;
            int i2 = fetchDashboardContentInteractor$start$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchDashboardContentInteractor$start$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchDashboardContentInteractor$start$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchDashboardContentInteractor$start$2$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar = this.a;
                    mth mthVar = new mth((d) cVar.c.a, 6);
                    fetchDashboardContentInteractor$start$2$1$emit$1.L$0 = null;
                    fetchDashboardContentInteractor$start$2$1$emit$1.L$1 = cVar;
                    fetchDashboardContentInteractor$start$2$1$emit$1.label = 1;
                    obj = e.y(mthVar, fetchDashboardContentInteractor$start$2$1$emit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    cVar = (c) fetchDashboardContentInteractor$start$2$1$emit$1.L$1;
                    kotlin.b.b(obj);
                }
                fetchDashboardContentInteractor$start$2$1$emit$1.L$0 = null;
                fetchDashboardContentInteractor$start$2$1$emit$1.L$1 = null;
                fetchDashboardContentInteractor$start$2$1$emit$1.label = 2;
            }
        }
        fetchDashboardContentInteractor$start$2$1$emit$1 = new FetchDashboardContentInteractor$start$2$1$emit$1(this, continuation);
        Object obj2 = fetchDashboardContentInteractor$start$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchDashboardContentInteractor$start$2$1$emit$1.label;
        if (i != 0) {
        }
        fetchDashboardContentInteractor$start$2$1$emit$1.L$0 = null;
        fetchDashboardContentInteractor$start$2$1$emit$1.L$1 = null;
        fetchDashboardContentInteractor$start$2$1$emit$1.label = 2;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(continuation);
    }
}
