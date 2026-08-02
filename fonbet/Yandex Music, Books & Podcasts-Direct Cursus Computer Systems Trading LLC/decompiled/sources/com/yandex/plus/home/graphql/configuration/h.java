package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.core.graphql.type.a1;
import defpackage.aur;
import defpackage.l1j;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.wqn;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends aur implements Function2 {
    public long j;
    public wqn k;
    public d l;
    public com.yandex.plus.home.repository.api.model.configuration.a m;
    public com.yandex.plus.home.repository.api.model.configuration.a n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ j r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(2, continuation);
        this.r = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00b6, code lost:
    
        if (r5 == r9) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0249  */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.yandex.plus.home.graphql.configuration.d, wqn] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.yandex.plus.home.graphql.configuration.d, com.yandex.plus.home.repository.api.model.configuration.a, wqn] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.core.android.extensions.c cVar;
        Object a;
        a1 a1Var;
        long j;
        String str;
        j jVar;
        Object obj2;
        wqn wqnVar;
        int i;
        long j2;
        int i2;
        d dVar;
        com.yandex.plus.home.datasource.local.preferences.j jVar2;
        nm6 nm6Var;
        int i3;
        int i4;
        Object a2;
        nm6 nm6Var2;
        Object obj3;
        long j3;
        d dVar2;
        com.yandex.plus.home.repository.api.model.configuration.a aVar;
        xdr xdrVar;
        xdr xdrVar2;
        nm6 nm6Var3;
        d dVar3;
        ?? r7;
        com.yandex.plus.home.repository.api.model.configuration.a aVar2;
        xdr xdrVar3;
        d dVar4;
        ?? r6;
        com.yandex.plus.home.repository.api.model.configuration.a aVar3;
        j jVar3 = this.r;
        long j4 = jVar3.d;
        com.yandex.plus.home.datasource.local.preferences.j jVar4 = jVar3.h;
        com.yandex.plus.core.android.extensions.c cVar2 = jVar3.c;
        xdr xdrVar4 = jVar3.l;
        a1 a1Var2 = jVar3.j;
        com.yandex.plus.core.analytics.logging.d dVar5 = jVar3.g;
        nm6 nm6Var4 = nm6.a;
        int i5 = this.q;
        String str2 = ",currentTime=";
        if (i5 == 0) {
            cVar = cVar2;
            qgg.h0(obj);
            com.yandex.plus.home.datasource.local.preferences.j jVar5 = jVar3.i;
            this.q = 1;
            a = jVar5.a(this);
        } else if (i5 == 1) {
            cVar = cVar2;
            qgg.h0(obj);
            a = ((z7o) obj).a;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        aVar3 = this.m;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        xdrVar3 = xdrVar4;
                        com.yandex.plus.core.b bVar = new com.yandex.plus.core.b(aVar3);
                        xdrVar3.getClass();
                        xdrVar3.m(null, bVar);
                        return aVar3;
                    }
                    if (i5 != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = this.n;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    xdrVar2 = xdrVar4;
                    com.yandex.plus.core.b bVar2 = new com.yandex.plus.core.b(aVar2);
                    xdrVar2.getClass();
                    xdrVar2.m(null, bVar2);
                    return aVar2;
                }
                int i6 = this.p;
                int i7 = this.o;
                long j5 = this.j;
                dVar2 = this.l;
                wqn wqnVar2 = this.k;
                qgg.h0(obj);
                j = j4;
                jVar2 = jVar4;
                cVar = cVar2;
                a1Var = a1Var2;
                str = "SdkConfigurationRepositoryImpl";
                j3 = j5;
                obj3 = ((z7o) obj).a;
                nm6Var2 = nm6Var4;
                i2 = i7;
                i4 = i6;
                wqnVar = wqnVar2;
                r7o r7oVar = z7o.b;
                if (obj3 instanceof t7o) {
                    obj3 = null;
                }
                aVar = (com.yandex.plus.home.repository.api.model.configuration.a) obj3;
                if (aVar == null) {
                    long a3 = cVar.a();
                    wqnVar.a = a3;
                    a1Var.getClass();
                    d i8 = a1.i(aVar, a3);
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (dVar5.b(aVar4)) {
                        StringBuilder sb = new StringBuilder("getOrUpdateDeferred(): value successfully loaded, update storage and local cache networkSdkConfig=");
                        sb.append(aVar);
                        sb.append(str2);
                        xdrVar3 = xdrVar4;
                        dVar4 = i8;
                        sb.append((Object) nsa.t(wqnVar.a));
                        r6 = 0;
                        dVar5.a(aVar4, str, sb.toString(), null);
                    } else {
                        xdrVar3 = xdrVar4;
                        dVar4 = i8;
                        r6 = 0;
                    }
                    this.k = r6;
                    this.l = r6;
                    this.m = aVar;
                    this.j = j3;
                    this.o = i2;
                    this.p = i4;
                    this.q = 4;
                    if (jVar2.e(dVar4, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    aVar3 = aVar;
                    com.yandex.plus.core.b bVar3 = new com.yandex.plus.core.b(aVar3);
                    xdrVar3.getClass();
                    xdrVar3.m(null, bVar3);
                    return aVar3;
                }
                long a4 = cVar.a();
                wqnVar.a = a4;
                if (dVar2 == null) {
                    xdrVar = xdrVar4;
                    long o = nsa.o(nsa.n(a4, j), yd5.M(15, ssa.MINUTES));
                    a1Var.getClass();
                    dVar2 = a1.i(null, o);
                } else {
                    xdrVar = xdrVar4;
                }
                a1Var.getClass();
                xdrVar2 = xdrVar;
                com.yandex.plus.home.repository.api.model.configuration.a aVar5 = new com.yandex.plus.home.repository.api.model.configuration.a(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i);
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
                if (dVar5.b(aVar6)) {
                    StringBuilder sb2 = new StringBuilder("getOrUpdateDeferred(): value loading failed, create fallback fallbackStorageSdkConfig=");
                    sb2.append(dVar2);
                    sb2.append(str2);
                    nm6Var3 = nm6Var2;
                    dVar3 = dVar2;
                    sb2.append((Object) nsa.t(wqnVar.a));
                    String sb3 = sb2.toString();
                    r7 = 0;
                    dVar5.a(aVar6, str, sb3, null);
                } else {
                    nm6Var3 = nm6Var2;
                    dVar3 = dVar2;
                    r7 = 0;
                }
                this.k = r7;
                this.l = r7;
                this.m = r7;
                this.n = aVar5;
                this.j = j3;
                this.o = i2;
                this.p = i4;
                this.q = 5;
                nm6 nm6Var5 = nm6Var3;
                if (jVar2.e(dVar3, this) == nm6Var5) {
                    return nm6Var5;
                }
                aVar2 = aVar5;
                com.yandex.plus.core.b bVar22 = new com.yandex.plus.core.b(aVar2);
                xdrVar2.getClass();
                xdrVar2.m(null, bVar22);
                return aVar2;
            }
            i = this.p;
            i2 = this.o;
            j2 = this.j;
            cVar = cVar2;
            wqn wqnVar3 = this.k;
            qgg.h0(obj);
            obj2 = ((z7o) obj).a;
            j = j4;
            a1Var = a1Var2;
            str = "SdkConfigurationRepositoryImpl";
            jVar = jVar3;
            wqnVar = wqnVar3;
            r7o r7oVar2 = z7o.b;
            if (obj2 instanceof t7o) {
                obj2 = null;
            }
            dVar = (d) obj2;
            j jVar6 = jVar;
            if (dVar == null) {
                long j6 = dVar.j;
                i3 = i;
                long a5 = cVar.a();
                wqnVar.a = a5;
                jVar2 = jVar4;
                boolean z = nsa.c(j6, a5) < 0;
                long j7 = j;
                j = j7;
                boolean z2 = nsa.c(nsa.o(j6, j7), wqnVar.a) > 0;
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                if (dVar5.b(aVar7)) {
                    StringBuilder sb4 = new StringBuilder("getOrUpdateDeferred(): check for fresh stored value currentTime=");
                    nm6Var = nm6Var4;
                    sb4.append((Object) nsa.t(wqnVar.a));
                    sb4.append(",cacheLifeTime=");
                    sb4.append((Object) nsa.t(j));
                    sb4.append(",isConfigTimeValid=");
                    sb4.append(z);
                    sb4.append(",isConfigFresh=");
                    sb4.append(z2);
                    dVar5.a(aVar7, str, sb4.toString(), null);
                } else {
                    nm6Var = nm6Var4;
                }
                if (z && z2) {
                    a1Var.getClass();
                    com.yandex.plus.home.repository.api.model.configuration.a aVar8 = new com.yandex.plus.home.repository.api.model.configuration.a(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i);
                    com.yandex.plus.core.b bVar4 = new com.yandex.plus.core.b(aVar8);
                    xdrVar4.getClass();
                    xdrVar4.m(null, bVar4);
                    return aVar8;
                }
            } else {
                jVar2 = jVar4;
                nm6Var = nm6Var4;
                i3 = i;
            }
            xdrVar4.getClass();
            xdrVar4.m(null, com.yandex.plus.core.c.a);
            this.k = wqnVar;
            this.l = dVar;
            this.j = j2;
            this.o = i2;
            i4 = i3;
            this.p = i4;
            this.q = 3;
            a2 = j.a(jVar6, this);
            nm6Var2 = nm6Var;
            if (a2 != nm6Var2) {
                return nm6Var2;
            }
            obj3 = a2;
            j3 = j2;
            dVar2 = dVar;
            r7o r7oVar3 = z7o.b;
            if (obj3 instanceof t7o) {
            }
            aVar = (com.yandex.plus.home.repository.api.model.configuration.a) obj3;
            if (aVar == null) {
            }
        }
        nsa.b.getClass();
        nsa nsaVar = new nsa(0L);
        r7o r7oVar4 = z7o.b;
        if (a instanceof t7o) {
            a = nsaVar;
        }
        long j8 = ((nsa) a).a;
        wqn wqnVar4 = new wqn();
        long a6 = cVar.a();
        wqnVar4.a = a6;
        a1Var = a1Var2;
        ?? r72 = nsa.c(j8, nsa.o(a6, yd5.M(24, ssa.HOURS))) < 0 ? 1 : 0;
        ?? r12 = nsa.c(j8, wqnVar4.a) > 0 ? 1 : 0;
        com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.c;
        if (dVar5.b(aVar9)) {
            StringBuilder sb5 = new StringBuilder("getOrUpdateDeferred(): check for recharging rechargeEnd=");
            sb5.append((Object) nsa.t(j8));
            str2 = ",currentTime=";
            sb5.append(str2);
            j = j4;
            jVar = jVar3;
            sb5.append((Object) nsa.t(wqnVar4.a));
            sb5.append(",isRechargingTimeValid=");
            sb5.append((boolean) r72);
            sb5.append(",isRechargingNow=");
            sb5.append((boolean) r12);
            str = "SdkConfigurationRepositoryImpl";
            dVar5.a(aVar9, str, sb5.toString(), null);
        } else {
            str2 = ",currentTime=";
            j = j4;
            str = "SdkConfigurationRepositoryImpl";
            jVar = jVar3;
        }
        if (r72 != 0 && r12 != 0) {
            StringBuilder sb6 = new StringBuilder("Rechanging now: rechargeEnd=");
            sb6.append((Object) nsa.t(j8));
            l1j.o(sb6, ", currentTime=", nsa.t(wqnVar4.a));
            return null;
        }
        this.k = wqnVar4;
        this.j = j8;
        this.o = r72;
        this.p = r12;
        this.q = 2;
        Object a7 = jVar4.a(this);
        if (a7 != nm6Var4) {
            obj2 = a7;
            wqnVar = wqnVar4;
            i = r12;
            j2 = j8;
            i2 = r72;
            r7o r7oVar22 = z7o.b;
            if (obj2 instanceof t7o) {
            }
            dVar = (d) obj2;
            j jVar62 = jVar;
            if (dVar == null) {
            }
            xdrVar4.getClass();
            xdrVar4.m(null, com.yandex.plus.core.c.a);
            this.k = wqnVar;
            this.l = dVar;
            this.j = j2;
            this.o = i2;
            i4 = i3;
            this.p = i4;
            this.q = 3;
            a2 = j.a(jVar62, this);
            nm6Var2 = nm6Var;
            if (a2 != nm6Var2) {
            }
        }
        return nm6Var4;
    }
}
