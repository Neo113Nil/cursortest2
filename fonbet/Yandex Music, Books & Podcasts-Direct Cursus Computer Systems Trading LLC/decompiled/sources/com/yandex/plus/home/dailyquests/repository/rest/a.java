package com.yandex.plus.home.dailyquests.repository.rest;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.g;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.k;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.d0;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.l;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.x;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.y;
import com.yandex.plus.home.datasource.openapi.apis.MissionPlatformControllerApi;
import com.yandex.plus.home.datasource.openapi.models.p4;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public oqi j;
    public c k;
    public Long l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public final /* synthetic */ c t;
    public final /* synthetic */ Long u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t = cVar;
        this.u = l;
        this.v = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0155, code lost:
    
        if (r3 != r0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #2 {all -> 0x002b, blocks: (B:9:0x0024, B:11:0x0158, B:21:0x013a, B:33:0x00e8, B:35:0x00ec, B:38:0x00f4, B:41:0x00fa, B:44:0x0107, B:46:0x010b, B:49:0x0118, B:57:0x00c6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oqi oqiVar;
        boolean z;
        String str;
        String str2;
        c cVar;
        int i;
        Long l;
        String str3;
        Object c;
        int i2;
        int i3;
        String str4;
        String str5;
        y yVar;
        Object b;
        Long l2;
        Object a;
        nm6 nm6Var = nm6.a;
        ?? r2 = this.s;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r2 == 0) {
            qgg.h0(obj);
            c cVar2 = this.t;
            oqiVar = cVar2.i;
            this.j = oqiVar;
            this.k = cVar2;
            Long l3 = this.u;
            this.l = l3;
            this.m = null;
            this.n = null;
            this.o = "music";
            z = this.v;
            this.p = z;
            this.q = 0;
            this.s = 1;
            if (oqiVar.a(this) != nm6Var) {
                str = null;
                str2 = "music";
                cVar = cVar2;
                i = 0;
                l = l3;
                str3 = null;
            }
            return nm6Var;
        }
        if (r2 != 1) {
            if (r2 == 2) {
                int i4 = this.r;
                int i5 = this.q;
                boolean z2 = this.p;
                str4 = this.o;
                String str6 = this.n;
                str5 = this.m;
                Long l4 = this.l;
                c cVar3 = this.k;
                oqi oqiVar2 = this.j;
                try {
                    qgg.h0(obj);
                    i3 = i5;
                    oqiVar = oqiVar2;
                    l = l4;
                    str = str6;
                    z = z2;
                    i2 = i4;
                    c = obj;
                    cVar = cVar3;
                    yVar = (y) c;
                    if (yVar != null) {
                        boolean c2 = cVar.c(yVar);
                        a1 a1Var = cVar.d;
                        if (c2) {
                            if ((yVar instanceof x) && !z) {
                                a1Var.getClass();
                                k g = a1.g((x) yVar, true);
                                oqiVar.b(null);
                                return g;
                            }
                            if (yVar instanceof l) {
                                a1Var.getClass();
                                g f = a1.f((l) yVar);
                                oqiVar.b(null);
                                return f;
                            }
                        }
                    }
                    p4 p4Var = new p4(str5, str, str4);
                    MissionPlatformControllerApi missionPlatformControllerApi = cVar.b;
                    this.j = oqiVar;
                    this.k = cVar;
                    this.l = l;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.q = i3;
                    this.r = i2;
                    this.s = 3;
                    b = missionPlatformControllerApi.b(p4Var, this);
                    if (b != nm6Var) {
                        return nm6Var;
                    }
                    l2 = l;
                    Object b2 = c.b(cVar, (com.yandex.plus.core.openapi.a) b);
                    this.j = oqiVar;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.q = i3;
                    this.r = i2;
                    this.s = 4;
                    a = c.a(cVar, l2, b2, this);
                } catch (Throwable th2) {
                    th = th2;
                    r2 = oqiVar2;
                }
            } else {
                if (r2 != 3) {
                    if (r2 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqiVar = this.j;
                    qgg.h0(obj);
                    a = obj;
                    com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) a;
                    oqiVar.b(null);
                    return lVar;
                }
                int i6 = this.r;
                i3 = this.q;
                l2 = this.l;
                c cVar4 = this.k;
                oqi oqiVar3 = this.j;
                try {
                    qgg.h0(obj);
                    b = obj;
                    cVar = cVar4;
                    i2 = i6;
                    oqiVar = oqiVar3;
                    Object b22 = c.b(cVar, (com.yandex.plus.core.openapi.a) b);
                    this.j = oqiVar;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.q = i3;
                    this.r = i2;
                    this.s = 4;
                    a = c.a(cVar, l2, b22, this);
                } catch (Throwable th3) {
                    th = th3;
                    r2 = oqiVar3;
                }
            }
            r2.b(null);
            throw th;
        }
        int i7 = this.q;
        boolean z3 = this.p;
        String str7 = this.o;
        String str8 = this.n;
        String str9 = this.m;
        Long l5 = this.l;
        c cVar5 = this.k;
        oqi oqiVar4 = this.j;
        qgg.h0(obj);
        i = i7;
        oqiVar = oqiVar4;
        cVar = cVar5;
        l = l5;
        str3 = str9;
        str = str8;
        str2 = str7;
        z = z3;
        d0 d0Var = cVar.a;
        this.j = oqiVar;
        this.k = cVar;
        this.l = l;
        this.m = str3;
        this.n = str;
        this.o = str2;
        this.p = z;
        this.q = i;
        this.r = 0;
        this.s = 2;
        c = d0Var.c(l, this);
        if (c == nm6Var) {
            return nm6Var;
        }
        i2 = 0;
        i3 = i;
        str4 = str2;
        str5 = str3;
        yVar = (y) c;
        if (yVar != null) {
        }
        p4 p4Var2 = new p4(str5, str, str4);
        MissionPlatformControllerApi missionPlatformControllerApi2 = cVar.b;
        this.j = oqiVar;
        this.k = cVar;
        this.l = l;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = i3;
        this.r = i2;
        this.s = 3;
        b = missionPlatformControllerApi2.b(p4Var2, this);
        if (b != nm6Var) {
        }
    }
}
