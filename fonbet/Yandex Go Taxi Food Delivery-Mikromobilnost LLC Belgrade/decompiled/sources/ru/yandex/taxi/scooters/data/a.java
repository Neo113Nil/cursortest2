package ru.yandex.taxi.scooters.data;

import defpackage.fvt;
import defpackage.kb20;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.vp21;
import defpackage.ypb1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final vp21 a;
    public final fvt b;
    public final po21 c;
    public final kb20 d;

    public a(vp21 vp21Var, fvt fvtVar, po21 po21Var, kb20 kb20Var) {
        this.a = vp21Var;
        this.b = fvtVar;
        this.c = po21Var;
        this.d = kb20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        ScootersApiHeaderRepository$getHeaders$1 scootersApiHeaderRepository$getHeaders$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String a;
        Object d;
        Map map;
        boolean z2;
        Map map2;
        if (continuationImpl instanceof ScootersApiHeaderRepository$getHeaders$1) {
            scootersApiHeaderRepository$getHeaders$1 = (ScootersApiHeaderRepository$getHeaders$1) continuationImpl;
            int i2 = scootersApiHeaderRepository$getHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersApiHeaderRepository$getHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersApiHeaderRepository$getHeaders$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersApiHeaderRepository$getHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersApiHeaderRepository$getHeaders$1.Z$0 = z;
                    scootersApiHeaderRepository$getHeaders$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(scootersApiHeaderRepository$getHeaders$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = scootersApiHeaderRepository$getHeaders$1.Z$0;
                        map2 = (Map) scootersApiHeaderRepository$getHeaders$1.L$2;
                        map = (Map) scootersApiHeaderRepository$getHeaders$1.L$1;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            map2.put("MobilePaymentSupport", "1");
                        }
                        if (z2) {
                            map2.put("Timezone-Offset", String.valueOf(ypb1.d()));
                        }
                        return map;
                    }
                    z = scootersApiHeaderRepository$getHeaders$1.Z$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                Pair pair = new Pair("Lat", String.valueOf(mo21Var.a));
                Pair pair2 = new Pair("Lon", String.valueOf(mo21Var.b));
                Pair pair3 = new Pair("X-Ya-Phone-Verified", ((ru.yandex.taxi.startup.launch.h) this.a).Og());
                kb20 kb20Var = this.d;
                Pair pair4 = new Pair("UUID", kb20Var.b());
                a = kb20Var.a();
                if (a == null) {
                    a = "";
                }
                LinkedHashMap l = kotlin.collections.b.l(pair, pair2, pair3, pair4, new Pair("DeviceID", a));
                scootersApiHeaderRepository$getHeaders$1.L$0 = null;
                scootersApiHeaderRepository$getHeaders$1.L$1 = l;
                scootersApiHeaderRepository$getHeaders$1.L$2 = l;
                scootersApiHeaderRepository$getHeaders$1.Z$0 = z;
                scootersApiHeaderRepository$getHeaders$1.label = 2;
                d = ((com.yandex.go.payments.googlepay.domain.e) this.b).d(scootersApiHeaderRepository$getHeaders$1);
                if (d != coroutineSingletons) {
                    map = l;
                    obj = d;
                    z2 = z;
                    map2 = map;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (z2) {
                    }
                    return map;
                }
                return coroutineSingletons;
            }
        }
        scootersApiHeaderRepository$getHeaders$1 = new ScootersApiHeaderRepository$getHeaders$1(this, continuationImpl);
        Object obj2 = scootersApiHeaderRepository$getHeaders$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersApiHeaderRepository$getHeaders$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        Pair pair5 = new Pair("Lat", String.valueOf(mo21Var2.a));
        Pair pair22 = new Pair("Lon", String.valueOf(mo21Var2.b));
        Pair pair32 = new Pair("X-Ya-Phone-Verified", ((ru.yandex.taxi.startup.launch.h) this.a).Og());
        kb20 kb20Var2 = this.d;
        Pair pair42 = new Pair("UUID", kb20Var2.b());
        a = kb20Var2.a();
        if (a == null) {
        }
        LinkedHashMap l2 = kotlin.collections.b.l(pair5, pair22, pair32, pair42, new Pair("DeviceID", a));
        scootersApiHeaderRepository$getHeaders$1.L$0 = null;
        scootersApiHeaderRepository$getHeaders$1.L$1 = l2;
        scootersApiHeaderRepository$getHeaders$1.L$2 = l2;
        scootersApiHeaderRepository$getHeaders$1.Z$0 = z;
        scootersApiHeaderRepository$getHeaders$1.label = 2;
        d = ((com.yandex.go.payments.googlepay.domain.e) this.b).d(scootersApiHeaderRepository$getHeaders$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
