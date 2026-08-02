package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.qb;
import com.yandex.passport.data.network.rb;
import com.yandex.passport.data.network.xb;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class o2 extends com.yandex.passport.common.domain.a {
    public final xb b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.j0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.yandex.passport.common.coroutine.a aVar, xb xbVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.j0 j0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        xbVar.getClass();
        eVar.getClass();
        bVar.getClass();
        j0Var.getClass();
        this.b = xbVar;
        this.c = eVar;
        this.d = bVar;
        this.e = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: all -> 0x0029, CancellationException -> 0x002d, wis -> 0x0031, TryCatch #2 {wis -> 0x0031, CancellationException -> 0x002d, all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0081, B:14:0x0089, B:15:0x009d, B:17:0x00a3, B:18:0x00b0, B:20:0x00b4, B:21:0x00bc, B:27:0x003f, B:29:0x004f, B:32:0x00c2, B:33:0x00c7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3 A[Catch: all -> 0x0029, CancellationException -> 0x002d, wis -> 0x0031, TryCatch #2 {wis -> 0x0031, CancellationException -> 0x002d, all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0081, B:14:0x0089, B:15:0x009d, B:17:0x00a3, B:18:0x00b0, B:20:0x00b4, B:21:0x00bc, B:27:0x003f, B:29:0x004f, B:32:0x00c2, B:33:0x00c7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x0029, CancellationException -> 0x002d, wis -> 0x0031, TryCatch #2 {wis -> 0x0031, CancellationException -> 0x002d, all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0081, B:14:0x0089, B:15:0x009d, B:17:0x00a3, B:18:0x00b0, B:20:0x00b4, B:21:0x00bc, B:27:0x003f, B:29:0x004f, B:32:0x00c2, B:33:0x00c7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(m2 m2Var, cg6 cg6Var) {
        n2 n2Var;
        int i;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof n2) {
                n2Var = (n2) cg6Var;
                int i2 = n2Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    n2Var.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = n2Var.k;
                    nm6 nm6Var = nm6.a;
                    i = n2Var.m;
                    if (i != 0) {
                        qgg.h0(obj2);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.internal.d a2 = this.c.a();
                        com.yandex.passport.common.core.f fVar = m2Var.a;
                        com.yandex.passport.internal.l e = a2.e(fVar);
                        if (e == null) {
                            throw new com.yandex.passport.api.exception.b(fVar);
                        }
                        this.e.y(fVar, m2Var.b, m2Var.c, m2Var.d);
                        xb xbVar = this.b;
                        com.yandex.passport.common.account.a aVar = e.d;
                        com.yandex.passport.internal.network.mappers.b bVar = this.d;
                        com.yandex.passport.common.core.b bVar2 = fVar.a;
                        bVar.getClass();
                        rb rbVar = new rb(e.h(), aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), m2Var.b, m2Var.c);
                        n2Var.j = m2Var;
                        n2Var.m = 1;
                        obj2 = xbVar.g(rbVar, n2Var);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m2Var = n2Var.j;
                        qgg.h0(obj2);
                    }
                    obj = ((z7o) obj2).a;
                    if (!(obj instanceof t7o)) {
                        qb qbVar = (qb) obj;
                        this.e.w(m2Var.b, m2Var.c, m2Var.a, qbVar.a, m2Var.d, qbVar.b);
                    }
                    a = z7o.a(obj);
                    if (a != null) {
                        this.e.v(m2Var.b, m2Var.c, m2Var.a, a, m2Var.d);
                    }
                    if (!(obj instanceof t7o)) {
                        obj = Boolean.valueOf(((qb) obj).a);
                    }
                    return new z7o(obj);
                }
            }
            if (i != 0) {
            }
            obj = ((z7o) obj2).a;
            if (!(obj instanceof t7o)) {
            }
            a = z7o.a(obj);
            if (a != null) {
            }
            if (!(obj instanceof t7o)) {
            }
            return new z7o(obj);
        } catch (wis e2) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e2);
            return new z7o(t7oVar);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
            return new z7o(t7oVar);
        }
        n2Var = new n2(this, cg6Var);
        Object obj22 = n2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = n2Var.m;
    }
}
