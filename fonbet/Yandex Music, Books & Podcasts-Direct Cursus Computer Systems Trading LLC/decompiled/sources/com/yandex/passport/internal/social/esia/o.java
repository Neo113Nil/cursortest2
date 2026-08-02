package com.yandex.passport.internal.social.esia;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.report.f7;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.gd;
import com.yandex.passport.internal.report.k7;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.nd;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.reporters.q1;
import com.yandex.passport.internal.report.reporters.r1;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.usecase.c2;
import com.yandex.passport.internal.usecase.e2;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.y0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.j9w;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class o extends com.yandex.passport.common.mvi.h {
    public final /* synthetic */ int c = 3;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public o(com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.common.ui.lang.b bVar, w0 w0Var, com.yandex.passport.internal.report.reporters.z zVar, r0 r0Var) {
        e0Var.getClass();
        bVar.getClass();
        w0Var.getClass();
        zVar.getClass();
        r0Var.getClass();
        this.d = e0Var;
        this.e = bVar;
        this.f = w0Var;
        this.g = zVar;
        this.h = r0Var;
    }

    @Override // com.yandex.passport.common.mvi.h
    public void b() {
        switch (this.c) {
            case 2:
                rar rarVar = (rar) this.g;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                rar rarVar2 = (rar) this.h;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                super.b();
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        com.yandex.passport.internal.ui.sloth.webcard.i0 i0Var;
        Continuation continuation = null;
        switch (this.c) {
            case 0:
                l lVar = (l) obj;
                if (lVar instanceof j) {
                    Object l = l(gVar);
                    return l == nm6.a ? l : Unit.a;
                }
                if (lVar instanceof k) {
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 1:
                com.yandex.passport.internal.ui.challenge.logout.u uVar = (com.yandex.passport.internal.ui.challenge.logout.u) obj;
                Object n = n(uVar.a, uVar.c, uVar.b, gVar);
                return n == nm6.a ? n : Unit.a;
            case 2:
                a(new com.yandex.passport.internal.ui.challenge.vpn.l(((com.yandex.passport.internal.ui.challenge.vpn.f) obj).a));
                rar rarVar = (rar) this.g;
                tf6 tf6Var = this.b;
                if (rarVar == null) {
                    this.g = x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.challenge.vpn.g(this, continuation, 1), 3);
                }
                if (((rar) this.h) == null) {
                    this.h = x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.challenge.vpn.g(this, continuation, r1), 3);
                }
                return Unit.a;
            default:
                com.yandex.passport.internal.ui.sloth.webcard.m mVar = (com.yandex.passport.internal.ui.sloth.webcard.m) obj;
                if (mVar.equals(com.yandex.passport.internal.ui.sloth.webcard.k.a)) {
                    if (Intrinsics.d(h(), new com.yandex.passport.internal.ui.sloth.webcard.c0(null, null, null))) {
                        Object m = m(gVar);
                        return m == nm6.a ? m : Unit.a;
                    }
                } else {
                    if (!(mVar instanceof com.yandex.passport.internal.ui.sloth.webcard.l)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.internal.sloth.performers.webcard.f fVar = ((com.yandex.passport.internal.ui.sloth.webcard.l) mVar).a;
                    if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.d) {
                        com.yandex.passport.internal.sloth.performers.webcard.d dVar = (com.yandex.passport.internal.sloth.performers.webcard.d) fVar;
                        String str = dVar.a;
                        if (Intrinsics.d(str, "fullscreen")) {
                            i0Var = new com.yandex.passport.internal.ui.sloth.webcard.i0();
                        } else {
                            Float f = dVar.b;
                            int floatValue = f != null ? (int) f.floatValue() : 0;
                            Float f2 = dVar.c;
                            int floatValue2 = f2 != null ? (int) f2.floatValue() : 0;
                            Float f3 = dVar.d;
                            int floatValue3 = f3 != null ? (int) f3.floatValue() : 0;
                            Float f4 = dVar.e;
                            i0Var = new com.yandex.passport.internal.ui.sloth.webcard.i0(floatValue, floatValue2, floatValue3, f4 != null ? (int) f4.floatValue() : 0, Intrinsics.d(str, "bottom") ? com.yandex.passport.internal.ui.sloth.webcard.m0.d : Intrinsics.d(str, "top") ? com.yandex.passport.internal.ui.sloth.webcard.m0.b : com.yandex.passport.internal.ui.sloth.webcard.m0.c);
                        }
                        g(new com.yandex.passport.internal.ui.sloth.webcard.z(i0Var, dVar.f));
                    } else if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.c) {
                        Object obj2 = ((com.yandex.passport.internal.sloth.performers.webcard.c) fVar).a;
                        r7o r7oVar = z7o.b;
                        if (!(obj2 instanceof t7o)) {
                            g(new com.yandex.passport.internal.ui.sloth.webcard.y((com.yandex.passport.internal.ui.d) obj2));
                        }
                        Throwable a = z7o.a(obj2);
                        if (a != null) {
                            a(new com.yandex.passport.internal.ui.sloth.webcard.s(a));
                        }
                    } else {
                        if (!(fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.e)) {
                            b6e.s();
                            return null;
                        }
                        a(new com.yandex.passport.internal.ui.sloth.webcard.s(((com.yandex.passport.internal.sloth.performers.webcard.e) fVar).a));
                    }
                }
                return Unit.a;
        }
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        int i = this.c;
        Object obj2 = this.d;
        int i2 = 2;
        Object obj3 = this.f;
        boolean z = false;
        switch (i) {
            case 0:
                j0 j0Var = (j0) obj;
                if (!(j0Var instanceof f0)) {
                    if (!(j0Var instanceof g0)) {
                        if (!(j0Var instanceof h0)) {
                            if (!(j0Var instanceof i0)) {
                                b6e.s();
                                break;
                            } else if (((a0) h()).b.e) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "The app resumed without esia results in callback", 8);
                                }
                                a(q.a);
                            }
                        } else {
                            Uri uri = ((h0) j0Var).a;
                            String queryParameter = uri != null ? uri.getQueryParameter("task_id") : null;
                            a(new u((!Intrinsics.d(uri != null ? uri.getQueryParameter("status") : null, "ok") || queryParameter == null) ? b0.a : new c0(queryParameter)));
                        }
                    } else {
                        g0 g0Var = (g0) j0Var;
                        Object k = k(g0Var.a, g0Var.b, gVar);
                        if (k != nm6.a) {
                            break;
                        }
                    }
                } else {
                    a(new t(true));
                }
                break;
            case 1:
                Object p = p(((com.yandex.passport.internal.ui.challenge.logout.o) obj).a, gVar);
                if (p != nm6.a) {
                    break;
                }
                break;
            case 2:
                com.yandex.passport.internal.ui.challenge.vpn.x xVar = (com.yandex.passport.internal.ui.challenge.vpn.x) obj;
                k1 k1Var = (k1) obj3;
                if (!xVar.equals(com.yandex.passport.internal.ui.challenge.vpn.v.a)) {
                    if (!xVar.equals(com.yandex.passport.internal.ui.challenge.vpn.r.a)) {
                        if (!xVar.equals(com.yandex.passport.internal.ui.challenge.vpn.t.a)) {
                            if (!xVar.equals(com.yandex.passport.internal.ui.challenge.vpn.w.a)) {
                                if (!xVar.equals(com.yandex.passport.internal.ui.challenge.vpn.s.a)) {
                                    if (!(xVar instanceof com.yandex.passport.internal.ui.challenge.vpn.u)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        String str = ((com.yandex.passport.internal.ui.challenge.vpn.u) xVar).a;
                                        k1Var.getClass();
                                        str.getClass();
                                        k1Var.n(kd.d, new com.yandex.passport.internal.report.c(str, 5));
                                    }
                                } else {
                                    k1Var.getClass();
                                    k1Var.p(ld.d);
                                    Object r = r(gVar);
                                    if (r != nm6.a) {
                                        break;
                                    }
                                }
                            } else {
                                a(new com.yandex.passport.internal.ui.challenge.vpn.j(false));
                            }
                        } else {
                            k1Var.getClass();
                            k1Var.p(md.d);
                            a(new com.yandex.passport.internal.ui.challenge.vpn.j(true));
                        }
                    } else {
                        k1Var.getClass();
                        k1Var.p(gd.d);
                        i();
                        com.yandex.passport.internal.usecase.vpn.e eVar = (com.yandex.passport.internal.usecase.vpn.e) obj2;
                        Object V = x97.V(((com.yandex.passport.common.coroutine.b) eVar.a).c, new com.yandex.passport.internal.usecase.vpn.a(eVar, z ? 1 : 0, i2), gVar);
                        nm6 nm6Var = nm6.a;
                        Object obj4 = V;
                        if (V != nm6Var) {
                            obj4 = Unit.a;
                        }
                        Object obj5 = obj4;
                        if (obj5 != nm6Var) {
                            break;
                        }
                    }
                } else {
                    k1Var.getClass();
                    k1Var.p(nd.d);
                    a(com.yandex.passport.internal.ui.challenge.vpn.i.a);
                }
                break;
            default:
                com.yandex.passport.internal.ui.sloth.webcard.g0 g0Var2 = (com.yandex.passport.internal.ui.sloth.webcard.g0) obj;
                com.yandex.passport.internal.ui.sloth.webcard.n0 n0Var = com.yandex.passport.internal.ui.sloth.webcard.n0.b;
                o1 o1Var = (o1) obj3;
                if (!(g0Var2 instanceof com.yandex.passport.internal.ui.sloth.webcard.d0)) {
                    if (!(g0Var2 instanceof com.yandex.passport.internal.ui.sloth.webcard.e0)) {
                        if (!(g0Var2 instanceof com.yandex.passport.internal.ui.sloth.webcard.f0)) {
                            b6e.s();
                            break;
                        } else {
                            b1 b1Var = ((com.yandex.passport.internal.ui.sloth.webcard.f0) g0Var2).a;
                            if (b1Var instanceof com.yandex.passport.sloth.e) {
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(n0Var));
                            } else if (b1Var instanceof com.yandex.passport.sloth.m0) {
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(n0Var));
                            } else if (b1Var instanceof com.yandex.passport.sloth.c) {
                                a(new com.yandex.passport.internal.ui.sloth.webcard.s(new Exception("Failed to process current authentication.")));
                            } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                                r1 r1Var = (r1) obj2;
                                com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                                List list = ((com.yandex.passport.sloth.m) b1Var).a;
                                nVar.getClass();
                                com.yandex.passport.api.exception.o a = com.yandex.passport.api.exception.n.a(list);
                                r1Var.getClass();
                                r1Var.n(yd.d, new ff(a));
                                nVar.getClass();
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(new com.yandex.passport.internal.ui.sloth.webcard.p0(com.yandex.passport.api.exception.n.a(list))));
                            } else if (b1Var instanceof y0) {
                                y0 y0Var = (y0) b1Var;
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(new com.yandex.passport.internal.ui.sloth.webcard.q0(y0Var.a, y0Var.b)));
                            } else if (b1Var instanceof com.yandex.passport.sloth.w) {
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(new com.yandex.passport.internal.ui.sloth.webcard.o0(((com.yandex.passport.sloth.w) b1Var).a)));
                            } else {
                                o1Var.u(com.yandex.passport.sloth.g.a(b1Var), n1.WEB_CARD);
                            }
                        }
                    } else {
                        int ordinal = ((com.yandex.passport.internal.ui.sloth.webcard.e0) g0Var2).a.ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                b6e.s();
                                break;
                            } else {
                                a(new com.yandex.passport.internal.ui.sloth.webcard.u(com.yandex.passport.internal.ui.sloth.webcard.n0.c));
                            }
                        } else {
                            a(new com.yandex.passport.internal.ui.sloth.webcard.u(n0Var));
                        }
                    }
                } else {
                    com.yandex.passport.sloth.h0 h0Var = ((com.yandex.passport.internal.ui.sloth.webcard.d0) g0Var2).a;
                    if (h0Var instanceof com.yandex.passport.sloth.x) {
                        a(new com.yandex.passport.internal.ui.sloth.webcard.u(com.yandex.passport.internal.ui.sloth.webcard.n0.a));
                    } else if (h0Var instanceof com.yandex.passport.sloth.c0) {
                        a(new com.yandex.passport.internal.ui.sloth.webcard.u(new com.yandex.passport.internal.ui.sloth.webcard.r0(((com.yandex.passport.sloth.c0) h0Var).a)));
                    } else if (h0Var instanceof com.yandex.passport.sloth.a0) {
                        Throwable th = ((com.yandex.passport.sloth.a0) h0Var).a;
                        if (!com.yandex.plus.core.locale.b.q(th)) {
                            a(new com.yandex.passport.internal.ui.sloth.webcard.u(new com.yandex.passport.internal.ui.sloth.webcard.p0(th)));
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Internet connection is lost in Sloth.", 8);
                        }
                    } else {
                        o1Var.u(h0Var.toString(), n1.WEB_CARD);
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        switch (this.c) {
            case 0:
                a(new r(th));
                break;
            case 1:
                a(new com.yandex.passport.internal.ui.challenge.logout.z(th));
                break;
            case 2:
                break;
            default:
                a(new com.yandex.passport.internal.ui.sloth.webcard.s(th));
                break;
        }
        return Unit.a;
    }

    public void i() {
        SharedPreferences a;
        SharedPreferences.Editor edit;
        String str = ((com.yandex.passport.internal.ui.challenge.vpn.q) h()).b;
        if (str != null) {
            CookieManager.getInstance().flush();
            String cookie = CookieManager.getInstance().getCookie(str);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                StringBuilder u = ouj.u("saveWebViewCookies url=", str, " hasCookies=");
                u.append(true ^ (cookie == null || StringsKt.U(cookie)));
                com.yandex.passport.common.logger.a.c(bVar, null, u.toString(), 8);
            }
            com.yandex.passport.internal.config.o oVar = (com.yandex.passport.internal.config.o) this.e;
            com.yandex.passport.common.core.b bVar2 = com.yandex.passport.common.core.b.c;
            oVar.getClass();
            if (cookie != null && !StringsKt.U(cookie) && (a = oVar.a.a(bVar2)) != null && (edit = a.edit()) != null) {
                edit.putString("vpn_cookie", cookie);
                edit.apply();
            }
        }
        a(new com.yandex.passport.internal.ui.challenge.vpn.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(cg6 cg6Var) {
        com.yandex.passport.internal.ui.sloth.webcard.p pVar;
        int i;
        com.yandex.passport.sloth.data.c cVar;
        com.yandex.passport.sloth.data.g0 g0Var;
        Object obj;
        Throwable a;
        com.yandex.passport.sloth.data.g0 g0Var2;
        com.yandex.passport.internal.push.m mVar = (com.yandex.passport.internal.push.m) this.g;
        com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var = (com.yandex.passport.internal.ui.sloth.webcard.l0) this.e;
        if (cg6Var instanceof com.yandex.passport.internal.ui.sloth.webcard.p) {
            pVar = (com.yandex.passport.internal.ui.sloth.webcard.p) cg6Var;
            int i2 = pVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.l;
                Object obj3 = nm6.a;
                i = pVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    Continuation continuation = null;
                    if (!(l0Var instanceof com.yandex.passport.internal.ui.sloth.webcard.j0)) {
                        if (!(l0Var instanceof com.yandex.passport.internal.ui.sloth.webcard.k0)) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.passport.sloth.data.m mVar2 = ((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a;
                        com.yandex.passport.sloth.data.o0 o0Var = mVar2.a;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.g0)) {
                            return mVar2;
                        }
                        o0Var.getClass();
                        com.yandex.passport.sloth.data.g0 g0Var3 = (com.yandex.passport.sloth.data.g0) o0Var;
                        mVar.d(g0Var3.g);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "variant: " + g0Var3, 8);
                        }
                        com.yandex.passport.sloth.data.g gVar = g0Var3.c;
                        cVar = gVar instanceof com.yandex.passport.sloth.data.c ? (com.yandex.passport.sloth.data.c) gVar : null;
                        if (cVar != null) {
                            int i3 = cVar.a;
                            pVar.j = g0Var3;
                            pVar.k = cVar;
                            pVar.n = 2;
                            Object q = q(g0Var3, i3, pVar);
                            if (q != obj3) {
                                g0Var = g0Var3;
                                obj = q;
                            }
                        }
                        return ((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a;
                    }
                    Bundle bundle = ((com.yandex.passport.internal.ui.sloth.webcard.j0) l0Var).a;
                    pVar.n = 1;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) mVar.j).c, new j9w(mVar, bundle, continuation, 24), pVar);
                    if (V != obj3) {
                        return V;
                    }
                    return obj3;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return obj2;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = pVar.k;
                g0Var = pVar.j;
                qgg.h0(obj2);
                obj = ((z7o) obj2).a;
                a = z7o.a(obj);
                if (a != null) {
                    g0Var2 = com.yandex.passport.sloth.data.g0.a(g0Var, new com.yandex.passport.sloth.data.f(cVar.a));
                } else {
                    if (a instanceof com.yandex.passport.api.exception.f) {
                        g0Var = com.yandex.passport.sloth.data.g0.a(g0Var, com.yandex.passport.sloth.data.b.a);
                    }
                    g0Var2 = g0Var;
                }
                com.yandex.passport.sloth.data.m.a(((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a, g0Var2);
                return ((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a;
            }
        }
        pVar = new com.yandex.passport.internal.ui.sloth.webcard.p(this, cg6Var);
        Object obj22 = pVar.l;
        Object obj32 = nm6.a;
        i = pVar.n;
        if (i != 0) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        com.yandex.passport.sloth.data.m.a(((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a, g0Var2);
        return ((com.yandex.passport.internal.ui.sloth.webcard.k0) l0Var).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(Uri uri, com.yandex.passport.internal.report.reporters.x xVar, cg6 cg6Var) {
        m mVar;
        int i;
        Throwable th;
        a0 a0Var;
        com.yandex.passport.common.core.f fVar;
        String queryParameter;
        com.yandex.passport.common.core.f fVar2;
        com.yandex.passport.internal.report.reporters.z zVar = (com.yandex.passport.internal.report.reporters.z) this.g;
        try {
            if (cg6Var instanceof m) {
                mVar = (m) cg6Var;
                int i2 = mVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mVar.n = i2 - Integer.MIN_VALUE;
                    m mVar2 = mVar;
                    Object obj = mVar2.l;
                    nm6 nm6Var = nm6.a;
                    i = mVar2.n;
                    boolean z = false;
                    if (i != 0) {
                        qgg.h0(obj);
                        a(new t(false));
                        a0 a0Var2 = (a0) h();
                        try {
                            q0 q0Var = a0Var2.a;
                            if (q0Var == null || (fVar = q0Var.a) == null) {
                                throw new IllegalStateException("EsiaBindProperties is null.");
                            }
                            com.yandex.passport.common.core.b bVar = fVar.a;
                            String queryParameter2 = uri != null ? uri.getQueryParameter("code") : null;
                            String queryParameter3 = uri != null ? uri.getQueryParameter("state") : null;
                            if (queryParameter2 == null || queryParameter3 == null) {
                                String queryParameter4 = uri != null ? uri.getQueryParameter("error") : null;
                                String r = (uri == null || (queryParameter = uri.getQueryParameter("error_description")) == null) ? null : kotlin.text.c.r(queryParameter, "+", StringUtil.SPACE, false);
                                if (queryParameter4 != null) {
                                    zVar.v(fVar, queryParameter4, r == null ? "" : r, xVar);
                                    a(new s(new p0(queryParameter4, r)));
                                } else {
                                    zVar.u(fVar, xVar);
                                    a(new u(b0.a));
                                }
                                return Unit.a;
                            }
                            zVar.w(fVar, xVar);
                            w0 w0Var = (w0) this.f;
                            s0 s0Var = a0Var2.a.e;
                            mVar2.j = xVar;
                            mVar2.k = a0Var2;
                            mVar2.n = 1;
                            Object c = w0Var.c(queryParameter2, queryParameter3, bVar, s0Var, mVar2);
                            if (c == nm6Var) {
                                return nm6Var;
                            }
                            obj = c;
                            a0Var = a0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            a0Var = a0Var2;
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            q0 q0Var2 = a0Var.a;
                            if (q0Var2 != null) {
                            }
                            zVar.getClass();
                            n8g b = t75.b();
                            if (fVar2 != null) {
                            }
                            if (xVar != null) {
                            }
                            b.add(new ff(th));
                            zVar.m(f7.d, t75.a(b));
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0Var = mVar2.k;
                        xVar = mVar2.j;
                        try {
                            qgg.h0(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "An error occurred while processing url from esia.", th);
                            }
                            q0 q0Var22 = a0Var.a;
                            fVar2 = q0Var22 != null ? q0Var22.a : null;
                            zVar.getClass();
                            n8g b2 = t75.b();
                            if (fVar2 != null) {
                                b2.add(new ff(fVar2));
                            }
                            if (xVar != null) {
                                b2.add(new com.yandex.passport.internal.report.f(xVar.a, 2, z));
                            }
                            b2.add(new ff(th));
                            zVar.m(f7.d, t75.a(b2));
                            throw th;
                        }
                    }
                    String str = (String) obj;
                    str.getClass();
                    a(new p(str));
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            String str2 = (String) obj;
            str2.getClass();
            a(new p(str2));
            return Unit.a;
        } catch (CancellationException e) {
            throw e;
        }
        mVar = new m(this, cg6Var);
        m mVar22 = mVar;
        Object obj2 = mVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = mVar22.n;
        boolean z2 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(cg6 cg6Var) {
        n nVar;
        Object obj;
        nm6 nm6Var;
        int i;
        q0 q0Var;
        q0 q0Var2;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.m = i2 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                obj = nVar2.k;
                nm6Var = nm6.a;
                i = nVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    a0 a0Var = (a0) h();
                    q0 q0Var3 = a0Var.a;
                    if (q0Var3 == null) {
                        xq0.q("EsiaBindProperties is null.");
                        return null;
                    }
                    w0 w0Var = (w0) this.f;
                    com.yandex.passport.common.core.b bVar = q0Var3.a.a;
                    String str = q0Var3.b;
                    String str2 = q0Var3.c;
                    String str3 = q0Var3.d;
                    String str4 = null;
                    s0 s0Var = q0Var3.e;
                    String concat = (((r0) this.h).a.getPackageName() + ".passport").concat("://esia");
                    if (a0Var.b.d) {
                        str4 = concat;
                    }
                    nVar2.j = q0Var3;
                    nVar2.m = 1;
                    obj = w0Var.d(bVar, str, str2, str3, s0Var, str4, nVar2);
                    if (obj != nm6Var) {
                        q0Var = q0Var3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q0Var2 = nVar2.j;
                    qgg.h0(obj);
                    Object obj2 = ((z7o) obj).a;
                    qgg.h0(obj2);
                    String str5 = ((com.yandex.passport.common.url.b) obj2).a;
                    com.yandex.passport.internal.report.reporters.z zVar = (com.yandex.passport.internal.report.reporters.z) this.g;
                    com.yandex.passport.common.core.f fVar = q0Var2.a;
                    String str6 = q0Var2.b;
                    String str7 = q0Var2.c;
                    String str8 = q0Var2.d;
                    str6.getClass();
                    str7.getClass();
                    str8.getClass();
                    zVar.getClass();
                    fVar.getClass();
                    zVar.n(k7.d, new ff(fVar), new ve(str6, 29), new ff(str7, 0), new ff(str8, 1));
                    a(new p(str5));
                    return Unit.a;
                }
                q0Var = nVar2.j;
                qgg.h0(obj);
                String str9 = (String) obj;
                com.yandex.passport.internal.usecase.e0 e0Var = (com.yandex.passport.internal.usecase.e0) this.d;
                com.yandex.passport.common.core.f fVar2 = q0Var.a;
                Locale b = ((com.yandex.passport.internal.ui.lang.a) ((com.yandex.passport.common.ui.lang.b) this.e)).b();
                str9.getClass();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar2, b, str9, "ru", e5bVar, (com.yandex.passport.common.core.c) null, 80);
                nVar2.j = q0Var;
                nVar2.m = 2;
                obj = e0Var.g(c0Var, nVar2);
                if (obj != nm6Var) {
                    q0Var2 = q0Var;
                    Object obj22 = ((z7o) obj).a;
                    qgg.h0(obj22);
                    String str52 = ((com.yandex.passport.common.url.b) obj22).a;
                    com.yandex.passport.internal.report.reporters.z zVar2 = (com.yandex.passport.internal.report.reporters.z) this.g;
                    com.yandex.passport.common.core.f fVar3 = q0Var2.a;
                    String str62 = q0Var2.b;
                    String str72 = q0Var2.c;
                    String str82 = q0Var2.d;
                    str62.getClass();
                    str72.getClass();
                    str82.getClass();
                    zVar2.getClass();
                    fVar3.getClass();
                    zVar2.n(k7.d, new ff(fVar3), new ve(str62, 29), new ff(str72, 0), new ff(str82, 1));
                    a(new p(str52));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        nVar = new n(this, cg6Var);
        n nVar22 = nVar;
        obj = nVar22.k;
        nm6Var = nm6.a;
        i = nVar22.m;
        if (i != 0) {
        }
        String str92 = (String) obj;
        com.yandex.passport.internal.usecase.e0 e0Var2 = (com.yandex.passport.internal.usecase.e0) this.d;
        com.yandex.passport.common.core.f fVar22 = q0Var.a;
        Locale b2 = ((com.yandex.passport.internal.ui.lang.a) ((com.yandex.passport.common.ui.lang.b) this.e)).b();
        str92.getClass();
        e5b e5bVar2 = e5b.a;
        e5bVar2.getClass();
        com.yandex.passport.internal.usecase.c0 c0Var2 = new com.yandex.passport.internal.usecase.c0(fVar22, b2, str92, "ru", e5bVar2, (com.yandex.passport.common.core.c) null, 80);
        nVar22.j = q0Var;
        nVar22.m = 2;
        obj = e0Var2.g(c0Var2, nVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(cg6 cg6Var) {
        com.yandex.passport.internal.ui.sloth.webcard.q qVar;
        int i;
        int i2;
        if (cg6Var instanceof com.yandex.passport.internal.ui.sloth.webcard.q) {
            qVar = (com.yandex.passport.internal.ui.sloth.webcard.q) cg6Var;
            int i3 = qVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.l = i3 - Integer.MIN_VALUE;
                Object obj = qVar.j;
                Object obj2 = nm6.a;
                i = qVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qVar.l = 1;
                    obj = j(qVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.passport.sloth.data.m mVar = (com.yandex.passport.sloth.data.m) obj;
                r1 r1Var = (r1) this.d;
                com.yandex.passport.sloth.data.o0 o0Var = mVar.a;
                com.yandex.passport.sloth.data.n0 n0Var = !(o0Var instanceof com.yandex.passport.sloth.data.n0) ? (com.yandex.passport.sloth.data.n0) o0Var : null;
                com.yandex.passport.sloth.data.h hVar = n0Var != null ? n0Var.e : null;
                i2 = hVar != null ? -1 : com.yandex.passport.internal.ui.sloth.webcard.o.a[hVar.ordinal()];
                if (i2 != 1) {
                    r1Var.u(q1.b);
                } else if (i2 == 2) {
                    r1Var.u(q1.a);
                }
                a(new com.yandex.passport.internal.ui.sloth.webcard.t(mVar));
                return Unit.a;
            }
        }
        qVar = new com.yandex.passport.internal.ui.sloth.webcard.q(this, cg6Var);
        Object obj3 = qVar.j;
        Object obj22 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        com.yandex.passport.sloth.data.m mVar2 = (com.yandex.passport.sloth.data.m) obj3;
        r1 r1Var2 = (r1) this.d;
        com.yandex.passport.sloth.data.o0 o0Var2 = mVar2.a;
        if (!(o0Var2 instanceof com.yandex.passport.sloth.data.n0)) {
        }
        if (n0Var != null) {
        }
        if (hVar != null) {
        }
        if (i2 != 1) {
        }
        a(new com.yandex.passport.internal.ui.sloth.webcard.t(mVar2));
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.ui.challenge.logout.d dVar, com.yandex.passport.common.ui.a aVar, cg6 cg6Var) {
        com.yandex.passport.internal.ui.challenge.logout.v vVar;
        int i;
        com.yandex.passport.internal.ui.challenge.j jVar;
        o oVar;
        if (cg6Var instanceof com.yandex.passport.internal.ui.challenge.logout.v) {
            vVar = (com.yandex.passport.internal.ui.challenge.logout.v) cg6Var;
            int i2 = vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.n = i2 - Integer.MIN_VALUE;
                Object obj = vVar.l;
                nm6 nm6Var = nm6.a;
                i = vVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    a(new com.yandex.passport.internal.ui.challenge.logout.y(new com.yandex.passport.internal.ui.challenge.logout.l(fVar, dVar)));
                    com.yandex.passport.internal.ui.challenge.m mVar = (com.yandex.passport.internal.ui.challenge.m) this.d;
                    vVar.j = fVar;
                    vVar.n = 1;
                    obj = mVar.a(fVar, aVar, vVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oVar = vVar.k;
                        qgg.h0(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        oVar.getClass();
                        oVar.a(new com.yandex.passport.internal.ui.challenge.logout.a0(booleanValue));
                        return Unit.a;
                    }
                    fVar = vVar.j;
                    qgg.h0(obj);
                }
                jVar = (com.yandex.passport.internal.ui.challenge.j) obj;
                if (!(jVar instanceof com.yandex.passport.internal.ui.challenge.g)) {
                    a(new com.yandex.passport.internal.ui.challenge.logout.a0(false));
                } else {
                    if (jVar instanceof com.yandex.passport.internal.ui.challenge.h) {
                        vVar.j = null;
                        vVar.k = this;
                        vVar.n = 2;
                        obj = o(fVar, vVar);
                        if (obj != nm6Var) {
                            oVar = this;
                            boolean booleanValue2 = ((Boolean) obj).booleanValue();
                            oVar.getClass();
                            oVar.a(new com.yandex.passport.internal.ui.challenge.logout.a0(booleanValue2));
                        }
                        return nm6Var;
                    }
                    if (!(jVar instanceof com.yandex.passport.internal.ui.challenge.i)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.internal.ui.challenge.c0 c0Var = ((com.yandex.passport.internal.ui.challenge.i) jVar).a;
                    a(new com.yandex.passport.internal.ui.challenge.logout.b0(new com.yandex.passport.internal.ui.challenge.webview.i(c0Var.c, c0Var.d, c0Var.e)));
                    this.h = c0Var;
                }
                return Unit.a;
            }
        }
        vVar = new com.yandex.passport.internal.ui.challenge.logout.v(this, cg6Var);
        Object obj2 = vVar.l;
        nm6 nm6Var2 = nm6.a;
        i = vVar.n;
        if (i != 0) {
        }
        jVar = (com.yandex.passport.internal.ui.challenge.j) obj2;
        if (!(jVar instanceof com.yandex.passport.internal.ui.challenge.g)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:12|13|14|15|(2:17|18)(4:20|(1:22)|23|24))(2:26|27))(5:28|29|(5:31|(1:33)|34|(2:36|37)|14)|15|(0)(0)))(4:38|39|15|(0)(0)))(2:40|(2:59|60)(3:44|(1:(3:47|(1:49)|50)(2:52|53))(3:54|(1:56)|57)|37))|61|62|15|(0)(0)))|63|6|7|(0)(0)|61|62|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        com.yandex.passport.internal.ui.challenge.logout.w wVar;
        int i;
        Object t7oVar;
        Throwable a;
        com.yandex.passport.internal.ui.challenge.logout.d dVar;
        if (cg6Var instanceof com.yandex.passport.internal.ui.challenge.logout.w) {
            wVar = (com.yandex.passport.internal.ui.challenge.logout.w) cg6Var;
            int i2 = wVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wVar.k;
                nm6 nm6Var = nm6.a;
                i = wVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.challenge.logout.l lVar = ((com.yandex.passport.internal.ui.challenge.logout.n) h()).a;
                    if (lVar == null || (dVar = lVar.b) == null) {
                        return Boolean.FALSE;
                    }
                    int ordinal = dVar.ordinal();
                    if (ordinal == 0) {
                        m1 m1Var = (m1) this.e;
                        com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(bVar, null, "Executing logoutUseCase", 10);
                        }
                        wVar.j = fVar;
                        wVar.m = 1;
                        obj = m1Var.g(fVar, wVar);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.passport.internal.usecase.v vVar = (com.yandex.passport.internal.usecase.v) this.f;
                        com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(bVar2, null, "Executing findMasterAccountUseCase", 10);
                        }
                        wVar.j = fVar;
                        wVar.m = 2;
                        obj = vVar.g(fVar, wVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    fVar = wVar.j;
                    qgg.h0(obj);
                    t7oVar = ((z7o) obj).a;
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = wVar.j;
                        qgg.h0(obj);
                        t7oVar = Unit.a;
                        r7o r7oVar = z7o.b;
                        a = z7o.a(t7oVar);
                        if (a == null) {
                            return Boolean.TRUE;
                        }
                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error performing challenged action for uid: " + fVar, a);
                        }
                        return Boolean.FALSE;
                    }
                    fVar = wVar.j;
                    qgg.h0(obj);
                    t7oVar = ((z7o) obj).a;
                    if (!(t7oVar instanceof t7o)) {
                        r7o r7oVar2 = z7o.b;
                        com.yandex.passport.internal.l lVar2 = (com.yandex.passport.internal.l) t7oVar;
                        com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(bVar3, null, "Executing deleteAccountUseCase", 10);
                        }
                        com.yandex.passport.internal.usecase.ui.t tVar = (com.yandex.passport.internal.usecase.ui.t) this.g;
                        wVar.j = fVar;
                        wVar.m = 3;
                        if (tVar.g(lVar2, wVar) == nm6Var) {
                            return nm6Var;
                        }
                        t7oVar = Unit.a;
                        r7o r7oVar3 = z7o.b;
                    }
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                }
                r7o r7oVar4 = z7o.b;
                t7oVar = new t7o(th);
                a = z7o.a(t7oVar);
                if (a == null) {
                }
            }
        }
        wVar = new com.yandex.passport.internal.ui.challenge.logout.w(this, cg6Var);
        Object obj2 = wVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wVar.m;
        if (i != 0) {
        }
        r7o r7oVar42 = z7o.b;
        t7oVar = new t7o(th);
        a = z7o.a(t7oVar);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, cg6 cg6Var) {
        com.yandex.passport.internal.ui.challenge.logout.x xVar;
        Object obj;
        int i;
        com.yandex.passport.internal.ui.challenge.logout.l lVar;
        o oVar;
        if (cg6Var instanceof com.yandex.passport.internal.ui.challenge.logout.x) {
            xVar = (com.yandex.passport.internal.ui.challenge.logout.x) cg6Var;
            int i2 = xVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.n = i2 - Integer.MIN_VALUE;
                obj = xVar.l;
                nm6 nm6Var = nm6.a;
                i = xVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    a(new com.yandex.passport.internal.ui.challenge.logout.b0(null));
                    com.yandex.passport.internal.ui.challenge.logout.l lVar2 = ((com.yandex.passport.internal.ui.challenge.logout.n) h()).a;
                    if (lVar2 == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.ui.challenge.c0 c0Var = (com.yandex.passport.internal.ui.challenge.c0) this.h;
                    if (c0Var == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.ui.challenge.m mVar = (com.yandex.passport.internal.ui.challenge.m) this.d;
                    com.yandex.passport.common.core.f fVar = lVar2.a;
                    xVar.j = lVar2;
                    xVar.n = 1;
                    Object b = mVar.b(str, fVar, c0Var, xVar);
                    if (b != nm6Var) {
                        obj = b;
                        lVar = lVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = xVar.k;
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    oVar.getClass();
                    oVar.a(new com.yandex.passport.internal.ui.challenge.logout.a0(booleanValue));
                    return Unit.a;
                }
                lVar = xVar.j;
                qgg.h0(obj);
                if (((com.yandex.passport.internal.ui.challenge.j) obj) instanceof com.yandex.passport.internal.ui.challenge.h) {
                    a(new com.yandex.passport.internal.ui.challenge.logout.a0(false));
                    return Unit.a;
                }
                com.yandex.passport.common.core.f fVar2 = lVar.a;
                xVar.j = null;
                xVar.k = this;
                xVar.n = 2;
                obj = o(fVar2, xVar);
                if (obj != nm6Var) {
                    oVar = this;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    oVar.getClass();
                    oVar.a(new com.yandex.passport.internal.ui.challenge.logout.a0(booleanValue2));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        xVar = new com.yandex.passport.internal.ui.challenge.logout.x(this, cg6Var);
        obj = xVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xVar.n;
        if (i != 0) {
        }
        if (((com.yandex.passport.internal.ui.challenge.j) obj) instanceof com.yandex.passport.internal.ui.challenge.h) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(com.yandex.passport.sloth.data.g0 g0Var, int i, cg6 cg6Var) {
        com.yandex.passport.internal.ui.sloth.webcard.r rVar;
        int i2;
        if (cg6Var instanceof com.yandex.passport.internal.ui.sloth.webcard.r) {
            rVar = (com.yandex.passport.internal.ui.sloth.webcard.r) cg6Var;
            int i3 = rVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.l = i3 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i2 = rVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "selected picture: " + i, 8);
                    }
                    e2 e2Var = (e2) this.h;
                    c2 c2Var = new c2(i, g0Var.e, g0Var.b);
                    rVar.l = 1;
                    obj = e2Var.g(c2Var, rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        rVar = new com.yandex.passport.internal.ui.sloth.webcard.r(this, cg6Var);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = rVar.l;
        if (i2 != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(cg6 cg6Var) {
        com.yandex.passport.internal.ui.challenge.vpn.h hVar;
        int i;
        com.yandex.passport.internal.entities.a0 a0Var;
        if (cg6Var instanceof com.yandex.passport.internal.ui.challenge.vpn.h) {
            hVar = (com.yandex.passport.internal.ui.challenge.vpn.h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.vpn.e eVar = (com.yandex.passport.internal.usecase.vpn.e) this.d;
                    hVar.l = 1;
                    obj = eVar.d("data_changed", hVar);
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
                a0Var = (com.yandex.passport.internal.entities.a0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "reloadVpnStatus: " + a0Var, 8);
                }
                if (Intrinsics.d(a0Var, com.yandex.passport.internal.entities.x.a)) {
                    i();
                }
                return Unit.a;
            }
        }
        hVar = new com.yandex.passport.internal.ui.challenge.vpn.h(this, cg6Var);
        Object obj2 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        if (i != 0) {
        }
        a0Var = (com.yandex.passport.internal.entities.a0) obj2;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        if (Intrinsics.d(a0Var, com.yandex.passport.internal.entities.x.a)) {
        }
        return Unit.a;
    }

    public o(com.yandex.passport.internal.ui.challenge.m mVar, m1 m1Var, com.yandex.passport.internal.usecase.v vVar, com.yandex.passport.internal.usecase.ui.t tVar) {
        mVar.getClass();
        m1Var.getClass();
        vVar.getClass();
        tVar.getClass();
        this.d = mVar;
        this.e = m1Var;
        this.f = vVar;
        this.g = tVar;
    }

    public o(com.yandex.passport.internal.usecase.vpn.e eVar, com.yandex.passport.internal.config.o oVar, k1 k1Var) {
        eVar.getClass();
        oVar.getClass();
        k1Var.getClass();
        this.d = eVar;
        this.e = oVar;
        this.f = k1Var;
    }

    public o(r1 r1Var, com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var, o1 o1Var, com.yandex.passport.internal.push.m mVar, e2 e2Var) {
        r1Var.getClass();
        l0Var.getClass();
        o1Var.getClass();
        mVar.getClass();
        e2Var.getClass();
        this.d = r1Var;
        this.e = l0Var;
        this.f = o1Var;
        this.g = mVar;
        this.h = e2Var;
    }
}
