package ru.yandex.taxi.location;

import android.net.wifi.ScanResult;
import android.os.SystemClock;
import defpackage.ny61;
import defpackage.q7y;
import defpackage.v551;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public c(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if (r6.emit(r0, r2) != r3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126 A[LOOP:3: B:47:0x0120->B:49:0x0126, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [vpr] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LbsProviderImpl$requestLocation$$inlined$map$1$2$1 lbsProviderImpl$requestLocation$$inlined$map$1$2$1;
        int i;
        List list;
        ?? r6;
        v551 v551Var;
        Iterable iterable;
        Iterator it;
        if (continuation instanceof LbsProviderImpl$requestLocation$$inlined$map$1$2$1) {
            lbsProviderImpl$requestLocation$$inlined$map$1$2$1 = (LbsProviderImpl$requestLocation$$inlined$map$1$2$1) continuation;
            int i2 = lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lbsProviderImpl$requestLocation$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    list = (List) obj;
                    g gVar = this.b;
                    v551 v551Var2 = gVar.a;
                    ru.yandex.taxi.location.lbs.b bVar = gVar.e;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$0 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$1 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$2 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar = this.a;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$4 = vprVar;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$5 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$6 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$7 = list;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$8 = v551Var2;
                    lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.d(lbsProviderImpl$requestLocation$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        r6 = vprVar;
                        v551Var = v551Var2;
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
                v551Var = (v551) lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$8;
                list = (List) lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$7;
                vpr vprVar2 = (vpr) lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                r6 = vprVar2;
                long longValue = ((Number) obj2).longValue();
                v551Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                v551Var.c.getClass();
                if (list == null) {
                    List list2 = list;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str = ((ScanResult) it2.next()).BSSID;
                    }
                    List list3 = list2;
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        long j = elapsedRealtime - (((ScanResult) it3.next()).timestamp / 1000000);
                        if (j < 0) {
                            q7y.a(new IllegalArgumentException(), "wifi from future sec=" + j);
                        }
                    }
                    iterable = new ArrayList();
                    for (Object obj3 : list3) {
                        if (elapsedRealtime - (((ScanResult) obj3).timestamp / 1000000) < longValue) {
                            iterable.add(obj3);
                        }
                    }
                } else {
                    iterable = EmptyList.a;
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                    String str2 = ((ScanResult) it.next()).BSSID;
                }
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$0 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$1 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$2 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$3 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$4 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$5 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$6 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$7 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$8 = null;
                lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label = 2;
            }
        }
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1 = new LbsProviderImpl$requestLocation$$inlined$map$1$2$1(this, continuation);
        Object obj22 = lbsProviderImpl$requestLocation$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj22).longValue();
        v551Var.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() / 1000;
        v551Var.c.getClass();
        if (list == null) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$0 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$1 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$2 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$3 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$4 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$5 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$6 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$7 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.L$8 = null;
        lbsProviderImpl$requestLocation$$inlined$map$1$2$1.label = 2;
    }
}
