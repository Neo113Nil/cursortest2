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
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class a1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.network.r b;
    public final com.yandex.passport.internal.usecase.e0 c;
    public final com.yandex.passport.common.ui.lang.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar, com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.common.ui.lang.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        rVar.getClass();
        e0Var.getClass();
        bVar.getClass();
        this.b = rVar;
        this.c = e0Var;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[Catch: all -> 0x0027, CancellationException -> 0x002a, wis -> 0x002d, TryCatch #2 {wis -> 0x002d, CancellationException -> 0x002a, all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0079, B:13:0x0081, B:14:0x0091, B:21:0x003a), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(x0 x0Var, cg6 cg6Var) {
        z0 z0Var;
        int i;
        t7o t7oVar;
        Object obj;
        try {
            if (cg6Var instanceof z0) {
                z0Var = (z0) cg6Var;
                int i2 = z0Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    z0Var.l = i2 - Integer.MIN_VALUE;
                    Object obj2 = z0Var.j;
                    nm6 nm6Var = nm6.a;
                    i = z0Var.l;
                    if (i != 0) {
                        qgg.h0(obj2);
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.internal.network.r rVar = this.b;
                        long j = x0Var.b.b;
                        String uri = Uri.parse(x0Var.a).toString();
                        uri.getClass();
                        Uri a = rVar.a(j, uri);
                        com.yandex.passport.internal.usecase.e0 e0Var = this.c;
                        com.yandex.passport.common.core.f fVar = x0Var.b;
                        Locale b = ((com.yandex.passport.internal.ui.lang.a) this.d).b();
                        String uri2 = a.toString();
                        uri2.getClass();
                        com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar, b, uri2, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 96);
                        z0Var.l = 1;
                        obj2 = e0Var.g(c0Var, z0Var);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                    }
                    obj = ((z7o) obj2).a;
                    if (!(obj instanceof t7o)) {
                        r7o r7oVar2 = z7o.b;
                        obj = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.l(((com.yandex.passport.common.url.b) obj).a));
                    }
                    return new z7o(obj);
                }
            }
            if (i != 0) {
            }
            obj = ((z7o) obj2).a;
            if (!(obj instanceof t7o)) {
            }
            return new z7o(obj);
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            return new z7o(t7oVar);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            return new z7o(t7oVar);
        }
        z0Var = new z0(this, cg6Var);
        Object obj22 = z0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = z0Var.l;
    }
}
