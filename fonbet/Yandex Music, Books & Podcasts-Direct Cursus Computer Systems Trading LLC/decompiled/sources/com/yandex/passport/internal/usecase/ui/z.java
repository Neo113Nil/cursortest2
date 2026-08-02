package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.vd;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class z extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.usecase.w0 b;
    public final com.yandex.passport.internal.report.reporters.o1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.w0 w0Var, com.yandex.passport.internal.report.reporters.o1 o1Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        w0Var.getClass();
        o1Var.getClass();
        this.b = w0Var;
        this.c = o1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(x xVar, cg6 cg6Var) {
        y yVar;
        int i;
        Throwable a;
        Object u;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yVar.k;
                nm6 nm6Var = nm6.a;
                i = yVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.usecase.w0 w0Var = this.b;
                    com.yandex.passport.common.core.f fVar = xVar.b;
                    String str = xVar.a;
                    yVar.j = xVar;
                    yVar.m = 1;
                    u = w0Var.u(yVar, fVar, str);
                    if (u == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = yVar.j;
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                qgg.h0(u);
                Object obj2 = (com.yandex.passport.internal.entities.c) u;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    com.yandex.passport.common.core.f fVar2 = xVar.b;
                    String str2 = xVar.a;
                    com.yandex.passport.internal.report.reporters.o1 o1Var = this.c;
                    o1Var.getClass();
                    fVar2.getClass();
                    str2.getClass();
                    o1Var.n(vd.d, new ff(a), new ff(fVar2), new com.yandex.passport.internal.report.c("host", str2));
                }
                return new z7o(obj2);
            }
        }
        yVar = new y(this, cg6Var);
        Object obj3 = yVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yVar.m;
        if (i != 0) {
        }
        qgg.h0(u);
        Object obj22 = (com.yandex.passport.internal.entities.c) u;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a != null) {
        }
        return new z7o(obj22);
    }
}
