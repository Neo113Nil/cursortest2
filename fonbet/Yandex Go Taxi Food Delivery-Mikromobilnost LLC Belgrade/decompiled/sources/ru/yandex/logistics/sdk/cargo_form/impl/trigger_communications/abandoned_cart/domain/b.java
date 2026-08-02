package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.c4z;
import defpackage.cv8;
import defpackage.dnm0;
import defpackage.etc;
import defpackage.j4;
import defpackage.j6s;
import defpackage.jbe;
import defpackage.kbe;
import defpackage.lza1;
import defpackage.ny61;
import defpackage.pnm0;
import defpackage.qv0;
import defpackage.t4s;
import defpackage.v5z0;
import defpackage.vng;
import defpackage.w511;
import defpackage.z3z;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final cv8 b;
    public final ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b c;

    public b(String str, cv8 cv8Var, ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b bVar) {
        this.a = str;
        this.b = cv8Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jbe jbeVar, long j, ContinuationImpl continuationImpl) {
        AbandonedCartMatcher$matchesContactPolicy$1 abandonedCartMatcher$matchesContactPolicy$1;
        int i;
        j4 j4Var;
        long millis;
        if (continuationImpl instanceof AbandonedCartMatcher$matchesContactPolicy$1) {
            abandonedCartMatcher$matchesContactPolicy$1 = (AbandonedCartMatcher$matchesContactPolicy$1) continuationImpl;
            int i2 = abandonedCartMatcher$matchesContactPolicy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartMatcher$matchesContactPolicy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abandonedCartMatcher$matchesContactPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartMatcher$matchesContactPolicy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    abandonedCartMatcher$matchesContactPolicy$1.L$0 = jbeVar;
                    abandonedCartMatcher$matchesContactPolicy$1.J$0 = j;
                    abandonedCartMatcher$matchesContactPolicy$1.label = 1;
                    obj = this.c.a(abandonedCartMatcher$matchesContactPolicy$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = abandonedCartMatcher$matchesContactPolicy$1.J$0;
                    jbeVar = (jbe) abandonedCartMatcher$matchesContactPolicy$1.L$0;
                    kotlin.b.b(obj);
                }
                j4Var = (j4) obj;
                if (j4Var != null) {
                    return Boolean.TRUE;
                }
                long I = (vng.I() + j) - j4Var.b;
                int i3 = jbeVar.b;
                int i4 = kbe.a[jbeVar.a.ordinal()];
                if (i4 == 1) {
                    millis = TimeUnit.MINUTES.toMillis(i3);
                } else if (i4 == 2) {
                    millis = TimeUnit.HOURS.toMillis(i3);
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    millis = TimeUnit.DAYS.toMillis(i3);
                }
                return Boolean.valueOf(I >= millis);
            }
        }
        abandonedCartMatcher$matchesContactPolicy$1 = new AbandonedCartMatcher$matchesContactPolicy$1(this, continuationImpl);
        Object obj2 = abandonedCartMatcher$matchesContactPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartMatcher$matchesContactPolicy$1.label;
        if (i != 0) {
        }
        j4Var = (j4) obj2;
        if (j4Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        if (r7.get(6) == r5.get(6)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
    
        if (r8 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z3z z3zVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        AbandonedCartMatcher$matchesLocalNotification$1 abandonedCartMatcher$matchesLocalNotification$1;
        Object obj;
        int i;
        long longValue;
        if (continuationImpl instanceof AbandonedCartMatcher$matchesLocalNotification$1) {
            abandonedCartMatcher$matchesLocalNotification$1 = (AbandonedCartMatcher$matchesLocalNotification$1) continuationImpl;
            int i2 = abandonedCartMatcher$matchesLocalNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartMatcher$matchesLocalNotification$1.label = i2 - Integer.MIN_VALUE;
                obj = abandonedCartMatcher$matchesLocalNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartMatcher$matchesLocalNotification$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Long k = lza1.k(z3zVar.c);
                    if (k == null) {
                        return Boolean.FALSE;
                    }
                    longValue = k.longValue();
                    jbe jbeVar = z3zVar.d;
                    abandonedCartMatcher$matchesLocalNotification$1.L$0 = z3zVar;
                    abandonedCartMatcher$matchesLocalNotification$1.L$1 = j6sVar;
                    abandonedCartMatcher$matchesLocalNotification$1.J$0 = longValue;
                    abandonedCartMatcher$matchesLocalNotification$1.label = 1;
                    obj = a(jbeVar, longValue, abandonedCartMatcher$matchesLocalNotification$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = abandonedCartMatcher$matchesLocalNotification$1.J$0;
                    j6s j6sVar2 = (j6s) abandonedCartMatcher$matchesLocalNotification$1.L$1;
                    z3z z3zVar2 = (z3z) abandonedCartMatcher$matchesLocalNotification$1.L$0;
                    kotlin.b.b(obj);
                    longValue = j;
                    z3zVar = z3zVar2;
                    j6sVar = j6sVar2;
                }
                if (((Boolean) obj).booleanValue()) {
                    dnm0 dnm0Var = z3zVar.c;
                    long I = vng.I();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(longValue + I);
                    if (dnm0Var.a instanceof pnm0) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(I);
                        if (calendar.get(1) == calendar2.get(1)) {
                        }
                    }
                    etc etcVar = dnm0Var.b;
                    int i3 = (calendar.get(11) * 60) + calendar.get(12);
                    v5z0 v5z0Var = etcVar.a;
                    int i4 = (v5z0Var.a * 60) + v5z0Var.b;
                    v5z0 v5z0Var2 = etcVar.b;
                    int i5 = (v5z0Var2.a * 60) + v5z0Var2.b;
                    if (i4 <= i3 && i3 <= i5) {
                        c4z c4zVar = z3zVar.a;
                        List list = c4zVar.a;
                        if (list.isEmpty() ? true : list.contains(this.a)) {
                            List list2 = c4zVar.b;
                            t4s t4sVar = this.b.a;
                            String str = t4sVar != null ? t4sVar.a : null;
                            List list3 = list2;
                            if (list3 == null || list3.isEmpty() || (str != null && list2.contains(str))) {
                                List list4 = c4zVar.e ? j6sVar.d.a : j6sVar.c.a;
                                qv0 qv0Var = (qv0) kotlin.collections.a.R(list4);
                                boolean z2 = (qv0Var != null ? qv0Var.a : null) != null;
                                qv0 qv0Var2 = (qv0) kotlin.collections.a.b0(kotlin.collections.a.J(list4, 1));
                                boolean z3 = (qv0Var2 != null ? qv0Var2.a : null) != null;
                                boolean z4 = !c4zVar.c || z2;
                                boolean z5 = !c4zVar.d || z3;
                                if (z4) {
                                }
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        abandonedCartMatcher$matchesLocalNotification$1 = new AbandonedCartMatcher$matchesLocalNotification$1(this, continuationImpl);
        obj = abandonedCartMatcher$matchesLocalNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartMatcher$matchesLocalNotification$1.label;
        boolean z6 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z6 = false;
        return Boolean.valueOf(z6);
    }
}
