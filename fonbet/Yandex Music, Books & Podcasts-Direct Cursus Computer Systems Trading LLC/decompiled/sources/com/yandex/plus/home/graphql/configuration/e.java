package com.yandex.plus.home.graphql.configuration;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.oqi;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.saf;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public oqi j;
    public j k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public final /* synthetic */ j q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, long j, Continuation continuation) {
        super(2, continuation);
        this.q = jVar;
        this.r = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0050: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:81), block:B:70:0x0050 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oqi oqiVar;
        oqi oqiVar2;
        oqi oqiVar3;
        long j;
        j jVar;
        int i;
        j jVar2;
        long j2;
        int i2;
        j jVar3;
        com.yandex.plus.home.datasource.local.preferences.j jVar4;
        j jVar5;
        int i3;
        long j3;
        oqi oqiVar4;
        nsa nsaVar;
        nsa nsaVar2;
        Object a;
        int i4;
        long j4;
        j jVar6;
        long j5;
        nsa nsaVar3;
        com.yandex.plus.home.datasource.local.preferences.j jVar7;
        nsa nsaVar4;
        nm6 nm6Var = nm6.a;
        int i5 = this.p;
        int i6 = 0;
        try {
            if (i5 == 0) {
                qgg.h0(obj);
                j jVar8 = this.q;
                oqiVar3 = jVar8.k;
                this.j = oqiVar3;
                this.k = jVar8;
                j = this.r;
                this.l = j;
                this.n = 0;
                this.p = 1;
                if (oqiVar3.a(this) != nm6Var) {
                    jVar = jVar8;
                    i = 0;
                }
                return nm6Var;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    i6 = this.o;
                    i2 = this.n;
                    j2 = this.l;
                    jVar3 = this.k;
                    oqiVar3 = this.j;
                    qgg.h0(obj);
                    j jVar9 = jVar3;
                    i = i2;
                    jVar2 = jVar9;
                    jVar2.m = null;
                    jVar2.l.l(null);
                    jVar4 = jVar2.h;
                    this.j = oqiVar3;
                    this.k = jVar2;
                    this.l = j2;
                    this.n = i;
                    this.o = i6;
                    this.p = 3;
                    if (jVar4.e(null, this) != nm6Var) {
                        int i7 = i6;
                        jVar5 = jVar2;
                        i3 = i7;
                        j3 = j2;
                        oqiVar4 = oqiVar3;
                        long a2 = jVar5.c.a();
                        nsaVar = new nsa(j3);
                        nsaVar2 = new nsa(yd5.M(24, ssa.HOURS));
                        if (nsaVar.compareTo(nsaVar2) > 0) {
                        }
                        long o = nsa.o(a2, nsaVar.a);
                        com.yandex.plus.home.datasource.local.preferences.j jVar10 = jVar5.i;
                        this.j = oqiVar4;
                        this.k = jVar5;
                        this.n = i;
                        this.o = i3;
                        this.l = a2;
                        this.m = o;
                        this.p = 4;
                        a = jVar10.a(this);
                        if (a != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = this.j;
                        try {
                            qgg.h0(obj);
                            ((z7o) obj).getClass();
                            oqiVar4 = oqiVar2;
                            oqiVar4.b(null);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    j5 = this.m;
                    j4 = this.l;
                    i3 = this.o;
                    i4 = this.n;
                    j jVar11 = this.k;
                    oqi oqiVar5 = this.j;
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                    jVar6 = jVar11;
                    oqiVar4 = oqiVar5;
                    r7o r7oVar = z7o.b;
                    if (a instanceof t7o) {
                        a = null;
                    }
                    nsaVar3 = (nsa) a;
                    if (nsaVar3 != null || nsa.c(nsaVar3.a, j5) < 0) {
                        jVar7 = jVar6.i;
                        nsaVar4 = new nsa(j5);
                        this.j = oqiVar4;
                        this.k = null;
                        this.n = i4;
                        this.o = i3;
                        this.l = j4;
                        this.m = j5;
                        this.p = 5;
                        if (jVar7.e(nsaVar4, this) != nm6Var) {
                            oqiVar2 = oqiVar4;
                            oqiVar4 = oqiVar2;
                        }
                        return nm6Var;
                    }
                    oqiVar4.b(null);
                    return Unit.a;
                }
                i3 = this.o;
                i = this.n;
                j3 = this.l;
                jVar5 = this.k;
                oqiVar4 = this.j;
                try {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    long a22 = jVar5.c.a();
                    nsaVar = new nsa(j3);
                    nsaVar2 = new nsa(yd5.M(24, ssa.HOURS));
                    if (nsaVar.compareTo(nsaVar2) > 0) {
                        nsaVar = nsaVar2;
                    }
                    long o2 = nsa.o(a22, nsaVar.a);
                    com.yandex.plus.home.datasource.local.preferences.j jVar102 = jVar5.i;
                    this.j = oqiVar4;
                    this.k = jVar5;
                    this.n = i;
                    this.o = i3;
                    this.l = a22;
                    this.m = o2;
                    this.p = 4;
                    a = jVar102.a(this);
                    if (a != nm6Var) {
                        return nm6Var;
                    }
                    i4 = i;
                    j4 = a22;
                    jVar6 = jVar5;
                    j5 = o2;
                    r7o r7oVar2 = z7o.b;
                    if (a instanceof t7o) {
                    }
                    nsaVar3 = (nsa) a;
                    if (nsaVar3 != null) {
                    }
                    jVar7 = jVar6.i;
                    nsaVar4 = new nsa(j5);
                    this.j = oqiVar4;
                    this.k = null;
                    this.n = i4;
                    this.o = i3;
                    this.l = j4;
                    this.m = j5;
                    this.p = 5;
                    if (jVar7.e(nsaVar4, this) != nm6Var) {
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    oqiVar2 = oqiVar4;
                    oqiVar2.b(null);
                    throw th;
                }
            }
            i = this.n;
            long j6 = this.l;
            jVar = this.k;
            oqi oqiVar6 = this.j;
            qgg.h0(obj);
            oqiVar3 = oqiVar6;
            j = j6;
            com.yandex.plus.core.analytics.logging.d dVar = jVar.g;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            if (dVar.b(aVar)) {
                dVar.a(aVar, "SdkConfigurationRepositoryImpl", "clearCacheAndStorage(rechargeTime=" + ((Object) nsa.t(j)) + ')', null);
            }
            ou7 ou7Var = jVar.m;
            if (ou7Var == null) {
                jVar2 = jVar;
                j2 = j;
                jVar2.m = null;
                jVar2.l.l(null);
                jVar4 = jVar2.h;
                this.j = oqiVar3;
                this.k = jVar2;
                this.l = j2;
                this.n = i;
                this.o = i6;
                this.p = 3;
                if (jVar4.e(null, this) != nm6Var) {
                }
                return nm6Var;
            }
            this.j = oqiVar3;
            this.k = jVar;
            this.l = j;
            this.n = i;
            this.o = 0;
            this.p = 2;
            if (saf.C(ou7Var, this) == nm6Var) {
                return nm6Var;
            }
            i2 = i;
            jVar3 = jVar;
            j2 = j;
            j jVar92 = jVar3;
            i = i2;
            jVar2 = jVar92;
            jVar2.m = null;
            jVar2.l.l(null);
            jVar4 = jVar2.h;
            this.j = oqiVar3;
            this.k = jVar2;
            this.l = j2;
            this.n = i;
            this.o = i6;
            this.p = 3;
            if (jVar4.e(null, this) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            th = th3;
            oqiVar2 = oqiVar;
        }
    }
}
