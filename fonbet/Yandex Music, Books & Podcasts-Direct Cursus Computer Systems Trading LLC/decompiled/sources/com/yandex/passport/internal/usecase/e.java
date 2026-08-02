package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.report.q3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class e extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.data.network.c0 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.data.network.c0 c0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        c0Var.getClass();
        bVar.getClass();
        vVar.getClass();
        this.b = eVar;
        this.c = c0Var;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(2:30|(1:32))(2:33|34))|12|(3:14|(1:16)|17)|18|19|(1:21)|22|23))|42|6|7|(0)(0)|12|(0)|18|19|(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002c, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x002c, CancellationException -> 0x002e, wis -> 0x0031, TryCatch #2 {wis -> 0x0031, CancellationException -> 0x002e, all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0077, B:14:0x007f, B:16:0x008d, B:17:0x0092, B:18:0x0095, B:28:0x003d, B:30:0x0056, B:33:0x009b, B:34:0x00a0), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(c cVar, cg6 cg6Var) {
        d dVar;
        int i;
        Throwable a;
        Object obj;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                com.yandex.passport.internal.report.reporters.v vVar = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.common.core.f fVar = cVar.a;
                    String str = cVar.b;
                    String str2 = cVar.c;
                    vVar.z(cVar.d, fVar, str2, str);
                    com.yandex.passport.internal.l e = this.b.a().e(fVar);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar);
                    }
                    com.yandex.passport.data.network.c0 c0Var = this.c;
                    com.yandex.passport.common.account.a aVar = e.d;
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    com.yandex.passport.common.core.b bVar2 = e.b.a;
                    bVar.getClass();
                    com.yandex.passport.data.network.x xVar = new com.yandex.passport.data.network.x(aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), str, str2);
                    dVar.j = cVar;
                    dVar.m = 1;
                    obj2 = c0Var.g(xVar, dVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = dVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.ebs.q qVar = (com.yandex.passport.common.ebs.q) obj;
                    com.yandex.passport.common.core.f fVar2 = cVar.a;
                    String str3 = cVar.c;
                    qVar.getClass();
                    vVar.y(fVar2, str3, qVar instanceof com.yandex.passport.common.ebs.o ? ((com.yandex.passport.common.ebs.o) qVar).a : null, qVar);
                }
                qgg.h0(obj);
                Object obj3 = (com.yandex.passport.common.ebs.q) obj;
                a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.common.core.f fVar3 = cVar.a;
                    String str4 = cVar.c;
                    String message = a.getMessage();
                    vVar.getClass();
                    fVar3.getClass();
                    str4.getClass();
                    vVar.n(q3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)), new com.yandex.passport.internal.report.a(str4, 8), new com.yandex.passport.internal.report.a(message, 27));
                }
                return new z7o(obj3);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        qgg.h0(obj);
        Object obj32 = (com.yandex.passport.common.ebs.q) obj;
        a = z7o.a(obj32);
        if (a != null) {
        }
        return new z7o(obj32);
    }
}
