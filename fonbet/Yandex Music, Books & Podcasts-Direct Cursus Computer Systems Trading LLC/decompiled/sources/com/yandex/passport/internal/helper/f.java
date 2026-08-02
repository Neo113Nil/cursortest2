package com.yandex.passport.internal.helper;

import com.yandex.passport.api.exception.t;
import com.yandex.passport.data.network.ia;
import com.yandex.passport.data.network.pa;
import com.yandex.passport.data.network.s6;
import com.yandex.passport.data.network.w6;
import com.yandex.passport.data.network.y6;
import com.yandex.passport.internal.analytics.k;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.cb;
import com.yandex.passport.internal.report.db;
import com.yandex.passport.internal.report.eb;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.y0;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.u75;
import defpackage.uah;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class f {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final pa b;
    public final y6 c;
    public final y0 d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final w f;
    public final com.yandex.passport.internal.credentials.g g;

    public f(com.yandex.passport.internal.network.client.h hVar, com.yandex.passport.internal.core.accounts.e eVar, pa paVar, y6 y6Var, y0 y0Var, com.yandex.passport.internal.network.mappers.b bVar, w wVar, com.yandex.passport.internal.credentials.g gVar) {
        hVar.getClass();
        eVar.getClass();
        paVar.getClass();
        y6Var.getClass();
        y0Var.getClass();
        bVar.getClass();
        wVar.getClass();
        gVar.getClass();
        this.a = eVar;
        this.b = paVar;
        this.c = y6Var;
        this.d = y0Var;
        this.e = bVar;
        this.f = wVar;
        this.g = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.core.b bVar, String str, boolean z, cg6 cg6Var) {
        d dVar;
        int i;
        boolean z2;
        Throwable a;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.credentials.f b = this.g.b(bVar);
                    this.e.getClass();
                    s6 s6Var = new s6(com.yandex.passport.internal.network.mappers.b.a(bVar), str, b.c, z);
                    dVar.l = 1;
                    obj = this.c.g(s6Var, dVar);
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
                Object obj2 = ((z7o) obj).a;
                z2 = obj2 instanceof t7o;
                w wVar = this.f;
                if (!z2) {
                    k kVar = k.c;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    wVar.b(kVar, e5bVar);
                }
                a = z7o.a(obj2);
                if (a != null) {
                    wVar.b(k.d, uah.e(new Pair("success", CommonUrlParts.Values.FALSE_INTEGER), new Pair("error", a.toString())));
                }
                if (!z2) {
                    return obj2;
                }
                try {
                    w6 w6Var = (w6) obj2;
                    return new com.yandex.passport.internal.entities.i(w6Var.a, w6Var.d, w6Var.e, w6Var.b, w6Var.c);
                } catch (Throwable th) {
                    r7o r7oVar = z7o.b;
                    return new t7o(th);
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj3 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        z2 = obj22 instanceof t7o;
        w wVar2 = this.f;
        if (!z2) {
        }
        a = z7o.a(obj22);
        if (a != null) {
        }
        if (!z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.common.core.f fVar, String str, String str2, String str3, cg6 cg6Var) {
        e eVar;
        int i;
        y0 y0Var;
        Object t7oVar;
        y0 y0Var2;
        Throwable a;
        boolean z;
        com.yandex.passport.common.core.f fVar2 = fVar;
        String str4 = str;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.n = i2 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.l;
                nm6 nm6Var = nm6.a;
                i = eVar2.n;
                y0 y0Var3 = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    y0Var3.getClass();
                    str4.getClass();
                    fVar2.getClass();
                    y0Var3.n(db.d, new ff(str4, 14), new ff(fVar2));
                    l e = this.a.a().e(fVar2);
                    if (e == null) {
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(new com.yandex.passport.api.exception.b(fVar2));
                    } else {
                        com.yandex.passport.common.core.g gVar = e.e;
                        if (u75.h(new Integer(12), new Integer(10)).contains(new Integer(gVar.h))) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(new t("Unsupported account type: " + gVar.h));
                        } else {
                            com.yandex.passport.common.core.b bVar = fVar2.a;
                            this.e.getClass();
                            y0Var = y0Var3;
                            ia iaVar = new ia(e.h(), e.d, com.yandex.passport.internal.network.mappers.b.a(bVar), str4, str2, str3 == null ? "selected_2fa_picture" : str3);
                            eVar2.j = fVar2;
                            eVar2.k = str4;
                            eVar2.n = 1;
                            obj = this.b.g(iaVar, eVar2);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    y0Var2 = y0Var3;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                        String valueOf = String.valueOf(a.getMessage());
                        y0Var2.getClass();
                        str4.getClass();
                        fVar2.getClass();
                        y0Var2.n(cb.d, new ff(str4, 14), new ff(fVar2), new com.yandex.passport.internal.report.a(valueOf, 28));
                    }
                    return t7oVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = eVar2.k;
                com.yandex.passport.common.core.f fVar3 = eVar2.j;
                qgg.h0(obj);
                str4 = str5;
                fVar2 = fVar3;
                y0Var = y0Var3;
                t7oVar = ((z7o) obj).a;
                z = t7oVar instanceof t7o;
                if (z) {
                    y0Var.getClass();
                    str4.getClass();
                    fVar2.getClass();
                    y0Var2 = y0Var;
                    y0Var2.n(eb.d, new ff(str4, 14), new ff(fVar2));
                } else {
                    y0Var2 = y0Var;
                }
                if (!z) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = Unit.a;
                }
                a = z7o.a(t7oVar);
                if (a != null) {
                }
                return t7oVar;
            }
        }
        eVar = new e(this, cg6Var);
        e eVar22 = eVar;
        Object obj2 = eVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = eVar22.n;
        y0 y0Var32 = this.d;
        if (i != 0) {
        }
        t7oVar = ((z7o) obj2).a;
        z = t7oVar instanceof t7o;
        if (z) {
        }
        if (!z) {
        }
        a = z7o.a(t7oVar);
        if (a != null) {
        }
        return t7oVar;
    }
}
