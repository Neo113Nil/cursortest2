package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.i9;
import com.yandex.passport.data.network.n9;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.m3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class r1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final n9 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, n9 n9Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        n9Var.getClass();
        bVar.getClass();
        vVar.getClass();
        this.b = eVar;
        this.c = n9Var;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(2:27|(1:29))(2:30|31))|12|(1:14)|15|16|(1:18)|19|20))|39|6|7|(0)(0)|12|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002b, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x002b, CancellationException -> 0x002d, wis -> 0x002f, TryCatch #2 {wis -> 0x002f, CancellationException -> 0x002d, all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0075, B:14:0x007d, B:15:0x008b, B:25:0x003b, B:27:0x0054, B:30:0x0091, B:31:0x0096), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(p1 p1Var, cg6 cg6Var) {
        q1 q1Var;
        int i;
        Throwable a;
        Object obj;
        if (cg6Var instanceof q1) {
            q1Var = (q1) cg6Var;
            int i2 = q1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = q1Var.k;
                nm6 nm6Var = nm6.a;
                i = q1Var.m;
                com.yandex.passport.internal.report.reporters.v vVar = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.common.core.f fVar = p1Var.a;
                    String str = p1Var.d;
                    vVar.w(fVar, p1Var.b, p1Var.c, str);
                    com.yandex.passport.internal.l e = this.b.a().e(fVar);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar);
                    }
                    n9 n9Var = this.c;
                    com.yandex.passport.common.account.a aVar = e.d;
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    com.yandex.passport.common.core.b bVar2 = e.b.a;
                    bVar.getClass();
                    i9 i9Var = new i9(aVar, str, com.yandex.passport.internal.network.mappers.b.a(bVar2));
                    q1Var.j = p1Var;
                    q1Var.m = 1;
                    obj2 = n9Var.g(i9Var, q1Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p1Var = q1Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    vVar.x(p1Var.a, p1Var.b, p1Var.c, p1Var.d);
                }
                qgg.h0(obj);
                Object obj3 = (com.yandex.passport.common.core.d) obj;
                a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.common.core.f fVar2 = p1Var.a;
                    String str2 = p1Var.b;
                    String str3 = p1Var.c;
                    String str4 = p1Var.d;
                    String message = a.getMessage();
                    vVar.getClass();
                    fVar2.getClass();
                    str2.getClass();
                    vVar.n(m3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str2, 8), new ff(str3, 13), new com.yandex.passport.internal.report.a(str4, 21, false), new com.yandex.passport.internal.report.a(message, 27));
                }
                return new z7o(obj3);
            }
        }
        q1Var = new q1(this, cg6Var);
        Object obj22 = q1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = q1Var.m;
        com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        qgg.h0(obj);
        Object obj32 = (com.yandex.passport.common.core.d) obj;
        a = z7o.a(obj32);
        if (a != null) {
        }
        return new z7o(obj32);
    }
}
