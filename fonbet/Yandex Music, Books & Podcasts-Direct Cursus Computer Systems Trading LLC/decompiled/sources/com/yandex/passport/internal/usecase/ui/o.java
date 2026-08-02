package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class o extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.network.client.h c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final com.yandex.passport.internal.common.l e;
    public final com.yandex.passport.internal.usecase.e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.client.h hVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.common.l lVar, com.yandex.passport.internal.usecase.e0 e0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        hVar.getClass();
        bVar.getClass();
        lVar.getClass();
        e0Var.getClass();
        this.b = eVar;
        this.c = hVar;
        this.d = bVar;
        this.e = lVar;
        this.f = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(m mVar, cg6 cg6Var) {
        n nVar;
        int i;
        com.yandex.passport.common.core.b bVar;
        com.yandex.passport.internal.network.client.j jVar;
        Object t7oVar;
        Object obj;
        Object t7oVar2;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = nVar.l;
                nm6 nm6Var = nm6.a;
                i = nVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.l e = this.b.a().e(mVar.a);
                    if (e == null) {
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(new Exception("Account with uid " + mVar.a + " not found"));
                        return new z7o(t7oVar);
                    }
                    com.yandex.passport.common.core.b bVar2 = e.b.a;
                    com.yandex.passport.internal.network.client.j b = this.c.b(bVar2);
                    Locale b2 = ((com.yandex.passport.internal.ui.lang.a) this.d).b();
                    com.yandex.passport.common.core.f fVar = e.b;
                    String builder = Uri.parse(b.a()).buildUpon().appendEncodedPath("profile/password").appendQueryParameter("retpath", b.d().toString()).toString();
                    builder.getClass();
                    this.e.getClass();
                    com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar, b2, builder, com.yandex.passport.internal.common.l.a(b2), (Map) null, (com.yandex.passport.common.core.c) null, 112);
                    nVar.j = bVar2;
                    nVar.k = b;
                    nVar.n = 1;
                    obj2 = this.f.g(c0Var, nVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    bVar = bVar2;
                    jVar = b;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = nVar.k;
                    bVar = nVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (obj instanceof t7o) {
                    try {
                        r7o r7oVar2 = z7o.b;
                        t7oVar2 = new com.yandex.passport.internal.ui.d(((com.yandex.passport.common.url.b) obj).a, jVar.d(), bVar);
                    } catch (Throwable th) {
                        r7o r7oVar3 = z7o.b;
                        t7oVar2 = new t7o(th);
                    }
                    t7oVar = t7oVar2;
                } else {
                    t7oVar = obj;
                }
                return new z7o(t7oVar);
            }
        }
        nVar = new n(this, cg6Var);
        Object obj22 = nVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (obj instanceof t7o) {
        }
        return new z7o(t7oVar);
    }
}
