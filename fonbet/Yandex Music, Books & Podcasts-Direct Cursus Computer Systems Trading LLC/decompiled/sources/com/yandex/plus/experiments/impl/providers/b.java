package com.yandex.plus.experiments.impl.providers;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public oqi j;
    public h k;
    public long l;
    public int m;
    public int n;
    public int o;
    public final /* synthetic */ h p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, long j, Continuation continuation) {
        super(2, continuation);
        this.p = hVar;
        this.q = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(1:(3:(1:(1:(5:7|8|9|10|11)(2:17|18))(7:19|20|21|22|23|(3:26|10|11)|25))(6:33|34|35|36|37|(2:39|25)(4:40|23|(0)|25))|15|16)(1:44))(3:50|(1:52)|25)|45|46|(2:48|25)(3:49|37|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Type inference failed for: r10v0, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v6, types: [oqi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        long j;
        h hVar;
        int i;
        int i2;
        int i3;
        h hVar2;
        long j2;
        com.yandex.plus.experiments.api.cache.c cVar;
        long j3;
        h hVar3;
        oqi oqiVar;
        com.yandex.plus.experiments.api.cache.c cVar2;
        nm6 nm6Var = nm6.a;
        int i4 = this.o;
        if (i4 == 0) {
            qgg.h0(obj);
            h hVar4 = this.p;
            qqiVar = hVar4.j;
            this.j = qqiVar;
            this.k = hVar4;
            j = this.q;
            this.l = j;
            this.m = 0;
            this.o = 1;
            if (qqiVar.a(this) != nm6Var) {
                hVar = hVar4;
                i = 0;
            }
            return nm6Var;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = this.n;
                int i6 = this.m;
                j2 = this.l;
                hVar2 = this.k;
                ?? r9 = this.j;
                try {
                    qgg.h0(obj);
                    i3 = i5;
                    i2 = i6;
                    qqiVar = r9;
                    cVar = hVar2.f;
                    this.j = qqiVar;
                    this.k = hVar2;
                    this.l = j2;
                    this.m = i2;
                    this.n = i3;
                    this.o = 3;
                    if (cVar.a(j2, this) != nm6Var) {
                        return nm6Var;
                    }
                    j3 = j2;
                    hVar3 = hVar2;
                    cVar2 = hVar3.g;
                    this.j = qqiVar;
                    this.k = null;
                    this.m = i2;
                    this.n = i3;
                    this.o = 4;
                    if (com.yandex.plus.experiments.api.cache.c.i(cVar2, j3, this) != nm6Var) {
                    }
                    return nm6Var;
                } catch (Throwable th) {
                    th = th;
                    oqiVar = r9;
                }
            } else if (i4 == 3) {
                int i7 = this.n;
                i2 = this.m;
                j3 = this.l;
                hVar3 = this.k;
                ?? r8 = this.j;
                try {
                    qgg.h0(obj);
                    i3 = i7;
                    qqiVar = r8;
                    cVar2 = hVar3.g;
                    this.j = qqiVar;
                    this.k = null;
                    this.m = i2;
                    this.n = i3;
                    this.o = 4;
                    if (com.yandex.plus.experiments.api.cache.c.i(cVar2, j3, this) != nm6Var) {
                        oqiVar = qqiVar;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    oqiVar = r8;
                }
            } else {
                if (i4 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oqiVar = this.j;
                try {
                    qgg.h0(obj);
                    oqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            oqiVar.b(null);
            throw th;
        }
        int i8 = this.m;
        j = this.l;
        hVar = this.k;
        ?? r10 = this.j;
        qgg.h0(obj);
        i = i8;
        qqiVar = r10;
        this.j = qqiVar;
        this.k = hVar;
        this.l = j;
        this.m = i;
        this.n = 0;
        this.o = 2;
        if (h.c(hVar, this) == nm6Var) {
            return nm6Var;
        }
        i2 = i;
        i3 = 0;
        long j4 = j;
        hVar2 = hVar;
        j2 = j4;
        cVar = hVar2.f;
        this.j = qqiVar;
        this.k = hVar2;
        this.l = j2;
        this.m = i2;
        this.n = i3;
        this.o = 3;
        if (cVar.a(j2, this) != nm6Var) {
        }
    }
}
