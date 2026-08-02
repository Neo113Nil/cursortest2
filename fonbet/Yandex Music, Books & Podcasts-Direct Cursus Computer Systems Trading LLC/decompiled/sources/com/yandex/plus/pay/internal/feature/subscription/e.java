package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.b6e;
import defpackage.bck;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.wis;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.z7o;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class e implements g {
    public final b a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final com.yandex.plus.pay.diagnostic.impl.d c;

    public e(b bVar, com.yandex.plus.pay.log.impl.b bVar2, com.yandex.plus.pay.diagnostic.impl.d dVar) {
        bVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        this.a = bVar;
        this.b = bVar2;
        this.c = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:19)|20|21|22|23|(12:25|26|27|28|29|(2:31|(1:33)(1:34))|35|(1:37)(1:88)|38|(1:40)(1:87)|(1:42)(1:86)|43)|95) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0104, code lost:
    
        r11 = r2;
        r10 = r3;
        r2 = r13;
        r3 = 0;
        r13 = r7;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010c, code lost:
    
        r5 = r15;
        r15 = r2;
        r2 = r13;
        r13 = r7;
        r7 = r5;
        r10 = r3;
        r5 = r14;
        r3 = 0;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0103, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0245 -> B:13:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Set set, f fVar, cg6 cg6Var) {
        d dVar;
        int i;
        Object obj;
        Set set2;
        f fVar2;
        int i2;
        d dVar2;
        int i3;
        String str2;
        f fVar3;
        String str3;
        Set set3;
        int i4;
        ?? r4;
        int i5;
        Throwable th;
        Object t7oVar;
        int i6;
        int i7;
        f fVar4;
        int i8;
        String str4;
        String str5;
        int i9;
        int i10;
        Throwable th2;
        wis e;
        String str6;
        Set set4;
        f fVar5;
        char c;
        char c2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c3;
        Set set5;
        Throwable th3;
        Throwable a;
        PlusPaySubscriptionInfo.SubscriptionStatus status;
        Throwable th4;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i17 = dVar.s;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                dVar.s = i17 - Integer.MIN_VALUE;
                Object obj2 = dVar.q;
                nm6 nm6Var = nm6.a;
                i = dVar.s;
                int i18 = 0;
                int i19 = 1;
                if (i != 0) {
                    obj = null;
                    qgg.h0(obj2);
                    set2 = set;
                    fVar2 = fVar;
                    i2 = 61;
                    dVar2 = dVar;
                    i3 = 0;
                    str2 = str;
                    if (i3 < i2) {
                    }
                } else if (i == 1) {
                    obj = null;
                    i5 = dVar.p;
                    int i20 = dVar.o;
                    i10 = dVar.n;
                    i9 = dVar.m;
                    fVar3 = dVar.l;
                    Set set6 = dVar.k;
                    str5 = dVar.j;
                    try {
                        try {
                            qgg.h0(obj2);
                            set3 = set6;
                            str3 = str5;
                            i3 = i20;
                            i2 = i9;
                            r4 = 0;
                            i4 = i10;
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (wis e3) {
                        e = e3;
                        set3 = set6;
                        i3 = i20;
                        th2 = null;
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(e);
                        f fVar6 = fVar3;
                        i8 = i10;
                        i6 = i3;
                        i7 = i9;
                        str4 = str5;
                        fVar4 = fVar6;
                        th3 = th2;
                        a = z7o.a(t7oVar);
                        if (a != null) {
                        }
                        PlusPaySubscriptionInfo plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                        if (plusPaySubscriptionInfo == null) {
                        }
                        switch (status != null ? -1 : c.a[status.ordinal()]) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        set3 = set6;
                        str3 = str5;
                        i3 = i20;
                        i2 = i9;
                        r4 = 0;
                        i4 = i10;
                        r7o r7oVar2 = z7o.b;
                        String str7 = str3;
                        t7oVar = new t7o(th);
                        i6 = i3;
                        i7 = i2;
                        fVar4 = fVar3;
                        i8 = i4;
                        str4 = str7;
                        th3 = r4;
                        a = z7o.a(t7oVar);
                        if (a != null) {
                        }
                        PlusPaySubscriptionInfo plusPaySubscriptionInfo2 = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                        if (plusPaySubscriptionInfo2 == null) {
                        }
                        switch (status != null ? -1 : c.a[status.ordinal()]) {
                        }
                    }
                    r7o r7oVar3 = z7o.b;
                    i6 = i3;
                    i7 = i2;
                    fVar4 = fVar3;
                    i8 = i4;
                    str4 = str3;
                    t7oVar = obj2;
                    th3 = r4;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    PlusPaySubscriptionInfo plusPaySubscriptionInfo22 = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                    if (plusPaySubscriptionInfo22 == null) {
                    }
                    switch (status != null ? -1 : c.a[status.ordinal()]) {
                    }
                } else {
                    if (i == 2) {
                        obj = null;
                        i5 = dVar.p;
                        i13 = dVar.o;
                        i12 = dVar.n;
                        i11 = dVar.m;
                        fVar5 = dVar.l;
                        set4 = dVar.k;
                        str6 = dVar.j;
                        qgg.h0(obj2);
                        c2 = 3;
                        c = 2;
                        i14 = i5;
                        i15 = i12;
                        i16 = i11;
                        set3 = set4;
                        str4 = str6;
                        fVar4 = fVar5;
                        dVar.j = str4;
                        dVar.k = set3;
                        dVar.l = fVar4;
                        dVar.m = i16;
                        dVar.n = i15;
                        dVar.o = i13;
                        dVar.p = i14;
                        c3 = 4;
                        dVar.s = 4;
                        if (y2x.o(1000L, dVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i == 3) {
                        i5 = dVar.p;
                        i6 = dVar.o;
                        i8 = dVar.n;
                        i7 = dVar.m;
                        fVar4 = dVar.l;
                        set5 = dVar.k;
                        obj = null;
                        str4 = dVar.j;
                        qgg.h0(obj2);
                        c2 = 3;
                        i14 = i5;
                        set3 = set5;
                        i13 = i6;
                        i15 = i8;
                        i16 = i7;
                        c = 2;
                        dVar.j = str4;
                        dVar.k = set3;
                        dVar.l = fVar4;
                        dVar.m = i16;
                        dVar.n = i15;
                        dVar.o = i13;
                        dVar.p = i14;
                        c3 = 4;
                        dVar.s = 4;
                        if (y2x.o(1000L, dVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i15 = dVar.n;
                    i16 = dVar.m;
                    f fVar7 = dVar.l;
                    Set set7 = dVar.k;
                    String str8 = dVar.j;
                    qgg.h0(obj2);
                    obj = null;
                    c3 = 4;
                    c2 = 3;
                    c = 2;
                    int i21 = 1;
                    fVar2 = fVar7;
                    dVar2 = dVar;
                    str2 = str8;
                    i2 = i16;
                    int i22 = i15 + 1;
                    set2 = set7;
                    i19 = i21;
                    i18 = 0;
                    i3 = i22;
                    if (i3 < i2) {
                        try {
                        } catch (wis e4) {
                            e = e4;
                            th4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            r4 = 0;
                        }
                        r7o r7oVar4 = z7o.b;
                        r4 = 0;
                        r4 = 0;
                        th4 = null;
                        j jVar = new j(this, str2, set2, r4, 24);
                        dVar2.j = str2;
                        dVar2.k = set2;
                        dVar2.l = fVar2;
                        dVar2.m = i2;
                        dVar2.n = i3;
                        dVar2.o = i3;
                        dVar2.p = i18;
                        dVar2.s = i19;
                        obj2 = tyf.J(2000L, jVar, dVar2);
                        if (obj2 != nm6Var) {
                            str3 = str2;
                            set3 = set2;
                            dVar = dVar2;
                            i5 = 0;
                            fVar3 = fVar2;
                            i4 = i3;
                            try {
                            } catch (wis e5) {
                                e = e5;
                                i10 = i4;
                                i9 = i2;
                                str5 = str3;
                                th2 = r4;
                                r7o r7oVar5 = z7o.b;
                                t7oVar = new t7o(e);
                                f fVar62 = fVar3;
                                i8 = i10;
                                i6 = i3;
                                i7 = i9;
                                str4 = str5;
                                fVar4 = fVar62;
                                th3 = th2;
                                a = z7o.a(t7oVar);
                                if (a != null) {
                                }
                                PlusPaySubscriptionInfo plusPaySubscriptionInfo222 = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                                if (plusPaySubscriptionInfo222 == null) {
                                }
                                switch (status != null ? -1 : c.a[status.ordinal()]) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r7o r7oVar22 = z7o.b;
                                String str72 = str3;
                                t7oVar = new t7o(th);
                                i6 = i3;
                                i7 = i2;
                                fVar4 = fVar3;
                                i8 = i4;
                                str4 = str72;
                                th3 = r4;
                                a = z7o.a(t7oVar);
                                if (a != null) {
                                }
                                PlusPaySubscriptionInfo plusPaySubscriptionInfo2222 = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                                if (plusPaySubscriptionInfo2222 == null) {
                                }
                                switch (status != null ? -1 : c.a[status.ordinal()]) {
                                }
                            }
                            r7o r7oVar32 = z7o.b;
                            i6 = i3;
                            i7 = i2;
                            fVar4 = fVar3;
                            i8 = i4;
                            str4 = str3;
                            t7oVar = obj2;
                            th3 = r4;
                            a = z7o.a(t7oVar);
                            if (a != null) {
                                boolean z = a instanceof wis;
                                com.yandex.plus.pay.api.log.a aVar = com.yandex.plus.pay.api.log.b.a;
                                com.yandex.plus.pay.log.impl.b bVar = this.b;
                                if (z) {
                                    com.yandex.plus.pay.log.impl.b.f(bVar, aVar, "Timeout when receiving subscription status.", th3, 12);
                                } else {
                                    com.yandex.plus.pay.log.impl.b.f(bVar, aVar, "Error when receiving subscription status.", a, 8);
                                }
                            }
                            PlusPaySubscriptionInfo plusPaySubscriptionInfo22222 = (PlusPaySubscriptionInfo) (!(t7oVar instanceof t7o) ? null : t7oVar);
                            status = plusPaySubscriptionInfo22222 == null ? plusPaySubscriptionInfo22222.getStatus() : null;
                            switch (status != null ? -1 : c.a[status.ordinal()]) {
                                case -1:
                                    c2 = 3;
                                    c = 2;
                                    i14 = i5;
                                    i13 = i6;
                                    i15 = i8;
                                    i16 = i7;
                                    dVar.j = str4;
                                    dVar.k = set3;
                                    dVar.l = fVar4;
                                    dVar.m = i16;
                                    dVar.n = i15;
                                    dVar.o = i13;
                                    dVar.p = i14;
                                    c3 = 4;
                                    dVar.s = 4;
                                    if (y2x.o(1000L, dVar) != nm6Var) {
                                        dVar2 = dVar;
                                        str2 = str4;
                                        set7 = set3;
                                        fVar2 = fVar4;
                                        i21 = 1;
                                        i2 = i16;
                                        int i222 = i15 + 1;
                                        set2 = set7;
                                        i19 = i21;
                                        i18 = 0;
                                        i3 = i222;
                                        if (i3 < i2) {
                                            com.yandex.plus.pay.diagnostic.impl.d dVar3 = this.c;
                                            dVar3.getClass();
                                            str2.getClass();
                                            bck bckVar = dVar3.a;
                                            LinkedHashMap m = dfi.m("requestId", "no_value", "additionalData", "no_value");
                                            m.put("orderId", str2);
                                            m.put("_meta", bck.c(new HashMap()));
                                            bckVar.d("Error.Api.SubscriptionStatus.Timeout", m);
                                            throw new com.yandex.plus.pay.api.exception.a("Subscription synchronization retry limit exceeded", null);
                                        }
                                    }
                                    break;
                                case 0:
                                default:
                                    b6e.s();
                                    return obj;
                                case 2:
                                    c2 = 3;
                                    if (!set3.isEmpty()) {
                                        if (plusPaySubscriptionInfo22222.getSynchronizationState() != null) {
                                            Set<SyncType> set8 = set3;
                                            if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                                                for (SyncType syncType : set8) {
                                                    PlusPaySubscriptionInfo.SynchronizationState synchronizationState = plusPaySubscriptionInfo22222.getSynchronizationState();
                                                    if (c.b[syncType.ordinal()] != 1) {
                                                        b6e.s();
                                                        return obj;
                                                    }
                                                    if (synchronizationState.getOttSubscriptionSync() && synchronizationState.getFamilyRoleSync() && synchronizationState.getFeaturesSync()) {
                                                    }
                                                }
                                            }
                                        }
                                        dVar.j = str4;
                                        dVar.k = set3;
                                        dVar.l = fVar4;
                                        dVar.m = i7;
                                        dVar.n = i8;
                                        dVar.o = i6;
                                        dVar.p = i5;
                                        c = 2;
                                        dVar.s = 2;
                                        fVar4.getClass();
                                        if (Unit.a != nm6Var) {
                                            i13 = i6;
                                            i12 = i8;
                                            fVar5 = fVar4;
                                            str6 = str4;
                                            i11 = i7;
                                            set4 = set3;
                                            i14 = i5;
                                            i15 = i12;
                                            i16 = i11;
                                            set3 = set4;
                                            str4 = str6;
                                            fVar4 = fVar5;
                                            dVar.j = str4;
                                            dVar.k = set3;
                                            dVar.l = fVar4;
                                            dVar.m = i16;
                                            dVar.n = i15;
                                            dVar.o = i13;
                                            dVar.p = i14;
                                            c3 = 4;
                                            dVar.s = 4;
                                            if (y2x.o(1000L, dVar) != nm6Var) {
                                            }
                                        }
                                    }
                                    break;
                                case 1:
                                case 4:
                                case 5:
                                case 6:
                                    return plusPaySubscriptionInfo22222;
                                case 3:
                                    dVar.j = str4;
                                    dVar.k = set3;
                                    dVar.l = fVar4;
                                    dVar.m = i7;
                                    dVar.n = i8;
                                    dVar.o = i6;
                                    dVar.p = i5;
                                    c2 = 3;
                                    dVar.s = 3;
                                    fVar4.getClass();
                                    if (Unit.a != nm6Var) {
                                        set5 = set3;
                                        i14 = i5;
                                        set3 = set5;
                                        i13 = i6;
                                        i15 = i8;
                                        i16 = i7;
                                        c = 2;
                                        dVar.j = str4;
                                        dVar.k = set3;
                                        dVar.l = fVar4;
                                        dVar.m = i16;
                                        dVar.n = i15;
                                        dVar.o = i13;
                                        dVar.p = i14;
                                        c3 = 4;
                                        dVar.s = 4;
                                        if (y2x.o(1000L, dVar) != nm6Var) {
                                        }
                                    }
                                    break;
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.q;
        nm6 nm6Var2 = nm6.a;
        i = dVar.s;
        int i182 = 0;
        int i192 = 1;
        if (i != 0) {
        }
    }
}
