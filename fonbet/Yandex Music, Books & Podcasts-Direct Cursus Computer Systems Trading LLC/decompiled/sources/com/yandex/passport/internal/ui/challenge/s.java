package com.yandex.passport.internal.ui.challenge;

import android.net.Uri;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.s7;
import com.yandex.passport.internal.report.t7;
import com.yandex.passport.internal.report.u7;
import com.yandex.passport.internal.report.v7;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.passport.internal.usecase.f0;
import com.yandex.passport.internal.usecase.g0;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.i0;
import com.yandex.passport.internal.usecase.k0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class s {
    public final com.yandex.passport.internal.network.d a;
    public final k0 b;
    public final e0 c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final com.yandex.passport.internal.flags.i e;
    public final com.yandex.passport.internal.report.reporters.n f;

    public s(com.yandex.passport.internal.network.d dVar, k0 k0Var, e0 e0Var, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.n nVar) {
        dVar.getClass();
        k0Var.getClass();
        e0Var.getClass();
        bVar.getClass();
        iVar.getClass();
        nVar.getClass();
        this.a = dVar;
        this.b = k0Var;
        this.c = e0Var;
        this.d = bVar;
        this.e = iVar;
        this.f = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        p pVar;
        int i;
        Throwable a;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pVar.k;
                nm6 nm6Var = nm6.a;
                i = pVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, "Requesting challengeState for uid = " + fVar, 10);
                    }
                    pVar.j = fVar;
                    pVar.m = 1;
                    obj = this.b.g(fVar, pVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = pVar.j;
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                com.yandex.passport.internal.report.reporters.n nVar = this.f;
                if (a != null) {
                    i0 i0Var = (i0) obj2;
                    nVar.getClass();
                    fVar.getClass();
                    i0Var.getClass();
                    nVar.n(t7.d, new ff(fVar), new com.yandex.passport.internal.report.a(i0Var));
                    return i0Var;
                }
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to get challenge", a);
                }
                nVar.getClass();
                fVar.getClass();
                nVar.n(u7.d, new ff(fVar), new ff(a));
                boolean z = a instanceof IOException;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "causeNoInternet " + z, 8);
                }
                return new f0(z);
            }
        }
        pVar = new p(this, cg6Var);
        Object obj3 = pVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        com.yandex.passport.internal.report.reporters.n nVar2 = this.f;
        if (a != null) {
        }
    }

    public final Object b(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        int ordinal;
        return (!((Boolean) this.e.b(com.yandex.passport.internal.flags.o.F)).booleanValue() || (ordinal = fVar.a.ordinal()) == 1 || ordinal == 3) ? h0.a : a(fVar, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.passport.common.core.f fVar, g0 g0Var, y1 y1Var, cg6 cg6Var) {
        q qVar;
        int i;
        Object e;
        com.yandex.passport.common.core.f fVar2;
        String str;
        com.yandex.passport.common.url.b bVar;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.n = i2 - Integer.MIN_VALUE;
                Object obj = qVar.l;
                Object obj2 = nm6.a;
                i = qVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.b bVar2 = fVar.a;
                    com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
                    hVar.getClass();
                    bVar2.getClass();
                    Uri build = Uri.parse(hVar.g(bVar2, 0L, null)).buildUpon().appendEncodedPath("closewebview").build();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a = com.yandex.passport.common.url.a.a(build);
                    String str2 = g0Var.a;
                    com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar3, null, "showWebView url = " + ((Object) com.yandex.passport.common.url.b.m(str2)), 10);
                    }
                    String a2 = com.yandex.passport.common.url.a.a(Uri.parse(str2).buildUpon().appendQueryParameter("retpath", a).appendQueryParameter("theme", com.yandex.passport.internal.ui.util.s.b(y1Var)).build());
                    qVar.j = fVar;
                    qVar.k = a;
                    qVar.n = 1;
                    e = e(qVar, fVar, a2);
                    if (e == obj2) {
                        return obj2;
                    }
                    fVar2 = fVar;
                    str = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = qVar.k;
                    fVar2 = qVar.j;
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar4 = (com.yandex.passport.common.url.b) obj;
                    e = bVar4 != null ? bVar4.a : null;
                }
                String str3 = (String) e;
                bVar = str3 == null ? new com.yandex.passport.common.url.b(str3) : null;
                if (bVar != null) {
                    return null;
                }
                c0 c0Var = new c0(bVar.a, str);
                com.yandex.passport.internal.report.reporters.n nVar = this.f;
                nVar.getClass();
                fVar2.getClass();
                nVar.n(v7.d, new ff(fVar2), new com.yandex.passport.internal.report.c(c0Var.c, 5));
                com.yandex.passport.internal.ui.bouncer.o oVar = new com.yandex.passport.internal.ui.bouncer.o(6, this, fVar2);
                ArrayList arrayList = c0Var.a.a;
                if (arrayList.contains(oVar)) {
                    return c0Var;
                }
                arrayList.add(oVar);
                return c0Var;
            }
        }
        qVar = new q(this, cg6Var);
        Object obj3 = qVar.l;
        Object obj22 = nm6.a;
        i = qVar.n;
        if (i != 0) {
        }
        String str32 = (String) e;
        if (str32 == null) {
        }
        if (bVar != null) {
        }
    }

    public final void d(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        com.yandex.passport.internal.report.reporters.n nVar = this.f;
        nVar.getClass();
        fVar.getClass();
        nVar.o(s7.d, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        r rVar;
        int i;
        Object obj;
        com.yandex.passport.common.url.b bVar;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (fVar != null) {
                        com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar, ((com.yandex.passport.internal.ui.lang.a) this.d).b(), str, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 120);
                        rVar.l = 1;
                        obj2 = this.c.g(c0Var, rVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj2);
                obj = ((z7o) obj2).a;
                if (obj instanceof t7o) {
                    obj = null;
                }
                bVar = (com.yandex.passport.common.url.b) obj;
                if (bVar != null) {
                    return bVar.a;
                }
                return null;
            }
        }
        rVar = new r(this, cg6Var);
        Object obj22 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (obj instanceof t7o) {
        }
        bVar = (com.yandex.passport.common.url.b) obj;
        if (bVar != null) {
        }
        return null;
    }
}
