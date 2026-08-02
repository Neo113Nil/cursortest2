package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.i3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.data.network.j0 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.data.network.j0 j0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        vVar.getClass();
        this.b = eVar;
        this.c = j0Var;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(2:27|(1:29))(2:30|31))|12|(1:14)|15|16|(1:18)|19|20))|42|6|7|(0)(0)|12|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[Catch: all -> 0x002b, CancellationException -> 0x002f, wis -> 0x0033, TryCatch #2 {wis -> 0x0033, CancellationException -> 0x002f, all -> 0x002b, blocks: (B:11:0x0027, B:12:0x007b, B:14:0x0083, B:15:0x0095, B:25:0x0041, B:27:0x005a, B:30:0x009b, B:31:0x00a0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(f fVar, cg6 cg6Var) {
        g gVar;
        int i;
        Throwable a;
        Object obj;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.m;
                com.yandex.passport.internal.report.reporters.v vVar = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.common.core.f fVar2 = fVar.a;
                    String str = fVar.d;
                    String str2 = fVar.c;
                    vVar.u(fVar2, fVar.b, str2, str);
                    com.yandex.passport.internal.l e = this.b.a().e(fVar2);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar2);
                    }
                    com.yandex.passport.data.network.j0 j0Var = this.c;
                    com.yandex.passport.common.account.a aVar = e.d;
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    com.yandex.passport.common.core.b bVar2 = e.b.a;
                    bVar.getClass();
                    com.yandex.passport.data.network.e0 e0Var = new com.yandex.passport.data.network.e0(aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), str2, str);
                    gVar.j = fVar;
                    gVar.m = 1;
                    obj2 = j0Var.g(e0Var, gVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = gVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.ebs.f fVar3 = (com.yandex.passport.common.ebs.f) obj;
                    this.e.v(fVar.a, fVar.b, fVar.c, fVar3.a, fVar3.b);
                }
                qgg.h0(obj);
                Object obj3 = (com.yandex.passport.common.ebs.f) obj;
                a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.common.core.f fVar4 = fVar.a;
                    String str3 = fVar.b;
                    String str4 = fVar.c;
                    String message = a.getMessage();
                    vVar.getClass();
                    fVar4.getClass();
                    str3.getClass();
                    vVar.n(i3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar4.b)), new com.yandex.passport.internal.report.a(str3, 8), new ff(str4, 13), new com.yandex.passport.internal.report.a(message, 27));
                }
                return new z7o(obj3);
            }
        }
        gVar = new g(this, cg6Var);
        Object obj22 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        qgg.h0(obj);
        Object obj32 = (com.yandex.passport.common.ebs.f) obj;
        a = z7o.a(obj32);
        if (a != null) {
        }
        return new z7o(obj32);
    }
}
