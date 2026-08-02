package com.yandex.passport.internal.account;

import com.yandex.passport.api.x1;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.m;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.ui.social.gimap.t;
import com.yandex.passport.internal.usecase.authorize.o;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.usecase.r;
import com.yandex.passport.internal.usecase.u;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.ocu;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xg;
import defpackage.xq0;
import defpackage.y7b;
import defpackage.z7o;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public final h a;
    public final com.yandex.passport.internal.core.accounts.f b;
    public final x c;
    public final com.yandex.passport.internal.database.d d;
    public final f1 e;
    public final com.yandex.passport.internal.network.a f;
    public final o g;
    public final u h;
    public final l2 i;
    public final r j;

    public d(h hVar, com.yandex.passport.internal.core.accounts.f fVar, x xVar, com.yandex.passport.internal.database.d dVar, f1 f1Var, com.yandex.passport.internal.network.a aVar, o oVar, u uVar, l2 l2Var, r rVar) {
        hVar.getClass();
        fVar.getClass();
        xVar.getClass();
        dVar.getClass();
        f1Var.getClass();
        aVar.getClass();
        oVar.getClass();
        uVar.getClass();
        l2Var.getClass();
        rVar.getClass();
        this.a = hVar;
        this.b = fVar;
        this.c = xVar;
        this.d = dVar;
        this.e = f1Var;
        this.f = aVar;
        this.g = oVar;
        this.h = uVar;
        this.i = l2Var;
        this.j = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w wVar, com.yandex.passport.internal.analytics.a aVar, cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    mn7 mn7Var = mn7.d;
                    y7b y7bVar = new y7b(wVar, this, aVar, (Continuation) null, 13);
                    cVar.l = 1;
                    obj = x97.V(mn7Var, y7bVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    public final l b(com.yandex.passport.common.core.b bVar, String str, String str2, x1 x1Var, String str3) {
        Object A = com.yandex.passport.internal.ui.a.A(new xg(this, bVar, str, str2, x1Var, str3, null, 26));
        qgg.h0(A);
        return (l) A;
    }

    public final l c(com.yandex.passport.common.core.b bVar, String str, com.yandex.passport.internal.analytics.a aVar) {
        str.getClass();
        aVar.getClass();
        com.yandex.passport.internal.credentials.f b = this.c.b(bVar);
        if (b == null) {
            throw new com.yandex.passport.api.exception.h(com.yandex.plus.core.network.api.utils.a.P(bVar));
        }
        String str2 = b.c;
        this.f.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("status");
        if (!"ok".equals(string)) {
            ArrayList e = com.yandex.passport.internal.network.a.e(jSONObject);
            if (e == null || e.size() <= 0) {
                throw new com.yandex.passport.data.exceptions.h(string);
            }
            if (e.contains("partition.not_matched")) {
                throw new com.yandex.passport.internal.network.exception.a();
            }
            if (e.contains("dc_token.invalid")) {
                throw new com.yandex.passport.common.exception.a("dc_token.invalid");
            }
            if (e.contains("action.impossible")) {
                throw new com.yandex.passport.data.exceptions.h("action.impossible");
            }
            throw new com.yandex.passport.data.exceptions.h((String) e.get(0));
        }
        String string2 = jSONObject.getString("x_token");
        if (string2 == null || string2.length() <= 0 || string2.equals("-")) {
            string2 = null;
        }
        com.yandex.passport.common.account.a aVar2 = new com.yandex.passport.common.account.a(string2);
        jSONObject.remove("x_token");
        String x = com.yandex.plus.pay.ui.core.b.x("access_token", jSONObject);
        com.yandex.passport.internal.entities.e eVar = x == null ? null : new com.yandex.passport.internal.entities.e(x, str2);
        jSONObject.remove("access_token");
        com.yandex.passport.common.core.g s = com.yandex.plus.pay.ui.core.b.s((int) (System.currentTimeMillis() / 1000), str);
        l b2 = this.b.b(m.e(bVar, aVar2, s, null), aVar.d(), true);
        com.yandex.passport.common.core.f fVar = b2.b;
        long j = fVar.b;
        com.yandex.passport.common.core.f fVar2 = b2.c;
        this.e.w(j, fVar2 != null ? Long.valueOf(fVar2.b) : null, b2.e.Z, aVar, s.K);
        if (eVar != null) {
            this.d.z(fVar, eVar);
        }
        return b2;
    }

    public final t d(com.yandex.passport.common.core.b bVar, String str) {
        bVar.getClass();
        try {
            this.a.a(bVar).g(str, "stub");
            throw new IllegalStateException("shouldn't pass auth with stub password");
        } catch (com.yandex.passport.internal.ui.social.gimap.c e) {
            t tVar = e.b;
            return tVar == null ? t.OTHER : tVar;
        }
    }

    public final l e(com.yandex.passport.common.core.b bVar, com.yandex.passport.common.account.a aVar, com.yandex.passport.internal.analytics.a aVar2) {
        return this.b.b((l) x97.D(kotlin.coroutines.g.a, new ocu(this, bVar, aVar, aVar2, (Continuation) null, 17)), aVar2.d(), true);
    }
}
