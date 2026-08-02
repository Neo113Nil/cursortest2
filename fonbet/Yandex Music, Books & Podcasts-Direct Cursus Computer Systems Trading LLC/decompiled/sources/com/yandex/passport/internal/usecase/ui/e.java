package com.yandex.passport.internal.usecase.ui;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.data.network.d7;
import com.yandex.passport.data.network.e7;
import com.yandex.passport.data.network.z6;
import com.yandex.passport.internal.report.c9;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.w8;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e extends a3 {
    public final e7 d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final com.yandex.passport.internal.credentials.g f;
    public final com.yandex.passport.internal.report.reporters.f1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.r rVar, e7 e7Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.report.reporters.f1 f1Var) {
        super(aVar, kVar, rVar);
        aVar.getClass();
        kVar.getClass();
        rVar.getClass();
        e7Var.getClass();
        bVar.getClass();
        gVar.getClass();
        f1Var.getClass();
        this.d = e7Var;
        this.e = bVar;
        this.f = gVar;
        this.g = f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.yandex.passport.internal.usecase.a3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(c cVar, cg6 cg6Var) {
        d dVar;
        int i;
        com.yandex.passport.internal.report.reporters.f1 f1Var;
        Object obj;
        char c;
        com.yandex.passport.internal.report.reporters.f1 f1Var2;
        char c2;
        char c3;
        char c4;
        Throwable a;
        c cVar2 = cVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                com.yandex.passport.internal.report.reporters.f1 f1Var3 = this.g;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.credentials.f b = this.f.b(cVar2.e);
                    f1Var3.y(new Long(cVar2.g), null, "by_member_token");
                    com.yandex.passport.common.core.b bVar = cVar2.e;
                    this.e.getClass();
                    f1Var = f1Var3;
                    z6 z6Var = new z6(com.yandex.passport.internal.network.mappers.b.a(bVar), cVar2.g, b.c, b.d, cVar2.d, cVar2.a.b);
                    dVar.j = cVar2;
                    dVar.m = 1;
                    obj2 = this.d.g(z6Var, dVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar2 = dVar.j;
                    qgg.h0(obj2);
                    f1Var = f1Var3;
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    String str = ((d7) obj).a;
                    obj = new com.yandex.passport.common.account.a((str == null || str.length() <= 0 || str.equals("-")) ? null : str);
                }
                if (obj instanceof t7o) {
                    c2 = 5;
                    c3 = 4;
                    long j = cVar2.a.b;
                    Long l = new Long(cVar2.b.b);
                    c = 1;
                    Long l2 = new Long(cVar2.c.b);
                    long j2 = cVar2.g;
                    f1Var.getClass();
                    c4 = 3;
                    c9 c9Var = c9.d;
                    ze[] zeVarArr = {new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(l), new ue(l2, 2), new com.yandex.passport.internal.report.f("by_member_token", 11), new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10), new ue(Long.valueOf(j2), 0)};
                    f1Var2 = f1Var;
                    f1Var2.n(c9Var, zeVarArr);
                } else {
                    c = 1;
                    f1Var2 = f1Var;
                    c2 = 5;
                    c3 = 4;
                    c4 = 3;
                }
                a = z7o.a(obj);
                if (a != null) {
                    long j3 = cVar2.a.b;
                    Long l3 = new Long(cVar2.b.b);
                    Long l4 = new Long(cVar2.c.b);
                    String message = a.getMessage();
                    if (message == null) {
                        message = a.getClass().getSimpleName();
                    }
                    long j4 = cVar2.g;
                    f1Var2.getClass();
                    w8 w8Var = w8.d;
                    com.yandex.passport.internal.report.c cVar3 = new com.yandex.passport.internal.report.c(Long.valueOf(j3));
                    ve veVar = new ve(l3);
                    ue ueVar = new ue(l4, 2);
                    com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(message, 28);
                    com.yandex.passport.internal.report.f fVar = new com.yandex.passport.internal.report.f("by_member_token", 11);
                    com.yandex.passport.internal.report.f fVar2 = new com.yandex.passport.internal.report.f(PListParser.TAG_FALSE, 10);
                    ue ueVar2 = new ue(Long.valueOf(j4), 0);
                    ze[] zeVarArr2 = new ze[7];
                    zeVarArr2[0] = cVar3;
                    zeVarArr2[c] = veVar;
                    zeVarArr2[2] = ueVar;
                    zeVarArr2[c4] = aVar;
                    zeVarArr2[c3] = fVar;
                    zeVarArr2[c2] = fVar2;
                    zeVarArr2[6] = ueVar2;
                    f1Var2.n(w8Var, zeVarArr2);
                }
                return obj;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        com.yandex.passport.internal.report.reporters.f1 f1Var32 = this.g;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        if (obj instanceof t7o) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return obj;
    }
}
