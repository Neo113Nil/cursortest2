package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.api.x;
import com.yandex.passport.internal.autologin.k;
import com.yandex.passport.internal.filter.l;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.ui.util.q;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class g extends com.yandex.passport.internal.ui.base.h {
    public final com.yandex.passport.internal.account.a q;
    public final com.yandex.passport.internal.core.accounts.e r;
    public final g0 s;
    public final Uri t;
    public final k u;
    public final m v;
    public final com.yandex.passport.internal.flags.i w;
    public final com.yandex.passport.internal.report.d x;
    public final l y;
    public final q z;

    public g(com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.core.accounts.e eVar, g0 g0Var, Uri uri, k kVar, m mVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.d dVar, l lVar) {
        aVar.getClass();
        eVar.getClass();
        g0Var.getClass();
        kVar.getClass();
        mVar.getClass();
        iVar.getClass();
        dVar.getClass();
        lVar.getClass();
        this.q = aVar;
        this.r = eVar;
        this.s = g0Var;
        this.t = uri;
        this.u = kVar;
        this.v = mVar;
        this.w = iVar;
        this.x = dVar;
        this.y = lVar;
        this.z = new q();
    }

    public static final void L(g gVar, Uri uri) {
        gVar.getClass();
        if (kotlin.text.c.n(String.valueOf(uri.getHost()), "pay.yandex.ru", false)) {
            return;
        }
        throw new UnknownHostException("Unknown host " + uri.getHost() + " in " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(g gVar, com.yandex.passport.internal.l lVar, com.yandex.passport.internal.properties.l lVar2, cg6 cg6Var) {
        f fVar;
        int i;
        gVar.getClass();
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fVar.l;
                nm6 nm6Var = nm6.a;
                i = fVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    l lVar3 = gVar.y;
                    ArrayList g = gVar.r.a().g();
                    com.yandex.passport.internal.entities.k kVar = lVar2.d;
                    fVar.j = lVar;
                    fVar.k = lVar2;
                    fVar.n = 1;
                    obj = lVar3.c(g, kVar, fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object obj2 = ((z7o) obj).a;
                        return (com.yandex.passport.internal.l) (obj2 instanceof t7o ? null : obj2);
                    }
                    lVar2 = fVar.k;
                    lVar = fVar.j;
                    qgg.h0(obj);
                }
                List list = (List) obj;
                if (lVar == null) {
                    return lVar;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    gVar.v.a(((com.yandex.passport.internal.l) it.next()).b).a(false);
                }
                k kVar2 = gVar.u;
                com.yandex.passport.internal.autologin.e eVar = new com.yandex.passport.internal.autologin.e(x.a, list, com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a), null, 20);
                fVar.j = null;
                fVar.k = null;
                fVar.n = 2;
                obj = kVar2.g(eVar, fVar);
            }
        }
        fVar = new f(gVar, cg6Var);
        Object obj3 = fVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fVar.n;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        if (lVar == null) {
        }
    }

    @Override // com.yandex.passport.internal.ui.base.h, defpackage.bfu
    public final void onCleared() {
        com.yandex.passport.internal.report.d dVar = this.x;
        dVar.d = null;
        dVar.e = null;
        super.onCleared();
    }
}
