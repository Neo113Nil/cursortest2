package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class n7 implements com.yandex.passport.data.network.core.d {
    public final /* synthetic */ int a;
    public final com.yandex.passport.data.network.core.t b;
    public final com.yandex.passport.data.network.core.l c;
    public final com.yandex.passport.data.network.core.p d;

    public n7(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar, com.yandex.passport.data.network.core.p pVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                tVar.getClass();
                lVar.getClass();
                pVar.getClass();
                this.b = tVar;
                this.c = lVar;
                this.d = pVar;
                break;
            default:
                tVar.getClass();
                lVar.getClass();
                pVar.getClass();
                this.b = tVar;
                this.c = lVar;
                this.d = pVar;
                break;
        }
    }

    @Override // com.yandex.passport.data.network.core.d
    public final /* bridge */ /* synthetic */ Object a(Object obj, com.yandex.passport.data.network.core.a aVar) {
        switch (this.a) {
            case 0:
                return b((l7) obj, aVar);
            default:
                return c((d8) obj, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(l7 l7Var, cg6 cg6Var) {
        m7 m7Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof m7) {
            m7Var = (m7) cg6Var;
            int i2 = m7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m7Var.k;
                nm6 nm6Var = nm6.a;
                i = m7Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, l7Var.a).b, "/2/bundle/auth/password/submit/");
                    k.F("Ya-Client-Host", this.d.a(l7Var.a));
                    k.F("Ya-Client-Cookie", "");
                    k.S("with_code", "1");
                    String str = l7Var.b;
                    if (str != null) {
                        k.S("qrpath", str);
                    }
                    m7Var.j = k;
                    m7Var.m = 1;
                    if (this.c.b(k, m7Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = m7Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        m7Var = new m7(this, cg6Var);
        Object obj2 = m7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m7Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(d8 d8Var, cg6 cg6Var) {
        e8 e8Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof e8) {
            e8Var = (e8) cg6Var;
            int i2 = e8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e8Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e8Var.k;
                nm6 nm6Var = nm6.a;
                i = e8Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.b, d8Var.a).b, "/2/bundle/auth/password/commit_magic");
                    k.F("Ya-Client-Host", this.d.a(d8Var.a));
                    k.F("Ya-Client-Cookie", "");
                    k.S("track_id", d8Var.b);
                    k.S("csrf_token", d8Var.c);
                    e8Var.j = k;
                    e8Var.m = 1;
                    if (this.c.b(k, e8Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = e8Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        e8Var = new e8(this, cg6Var);
        Object obj2 = e8Var.k;
        nm6 nm6Var2 = nm6.a;
        i = e8Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
