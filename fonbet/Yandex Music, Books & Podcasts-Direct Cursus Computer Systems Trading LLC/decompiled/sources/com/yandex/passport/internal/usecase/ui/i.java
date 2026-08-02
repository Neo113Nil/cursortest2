package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class i extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.network.r b;
    public final com.yandex.passport.internal.core.tokens.b c;
    public final com.yandex.passport.internal.usecase.e0 d;
    public final com.yandex.passport.common.ui.lang.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar, com.yandex.passport.internal.core.tokens.b bVar, com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.common.ui.lang.b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        rVar.getClass();
        bVar.getClass();
        e0Var.getClass();
        bVar2.getClass();
        this.b = rVar;
        this.c = bVar;
        this.d = e0Var;
        this.e = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(f fVar, cg6 cg6Var) {
        h hVar;
        int i;
        t7o t7oVar;
        Throwable a;
        com.yandex.passport.internal.l e;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i2 = hVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = hVar.k;
                    nm6 nm6Var = nm6.a;
                    i = hVar.m;
                    if (i == 0) {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar2 = hVar.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    Uri b = this.b.b(fVar.b.b, fVar.a);
                    com.yandex.passport.internal.usecase.e0 e0Var = this.d;
                    com.yandex.passport.common.core.f fVar3 = fVar.b;
                    Locale b2 = ((com.yandex.passport.internal.ui.lang.a) this.e).b();
                    String uri = b.toString();
                    uri.getClass();
                    com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar3, b2, uri, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 96);
                    hVar.j = fVar;
                    hVar.m = 1;
                    Object g = e0Var.g(c0Var, hVar);
                    return g == nm6Var ? nm6Var : g;
                }
            }
            if (i == 0) {
            }
        } catch (wis e2) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e2);
            a = z7o.a(t7oVar);
            if (a != null && (a instanceof com.yandex.passport.common.exception.a)) {
                com.yandex.passport.common.core.f fVar4 = fVar.b;
                com.yandex.passport.internal.core.tokens.b bVar = this.c;
                bVar.getClass();
                fVar4.getClass();
                e = bVar.b.a().e(fVar4);
                if (e != null) {
                    bVar.c.a(e);
                }
            }
            return new z7o(t7oVar);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
            a = z7o.a(t7oVar);
            if (a != null) {
                com.yandex.passport.common.core.f fVar42 = fVar.b;
                com.yandex.passport.internal.core.tokens.b bVar2 = this.c;
                bVar2.getClass();
                fVar42.getClass();
                e = bVar2.b.a().e(fVar42);
                if (e != null) {
                }
            }
            return new z7o(t7oVar);
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
    }
}
