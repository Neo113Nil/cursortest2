package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.net.Uri;
import com.yandex.passport.internal.report.we;
import defpackage.agv;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.chv;
import defpackage.dzf;
import defpackage.ei;
import defpackage.fft;
import defpackage.gao;
import defpackage.gi;
import defpackage.gld;
import defpackage.gzf;
import defpackage.hav;
import defpackage.ild;
import defpackage.j8s;
import defpackage.jyr;
import defpackage.kyf;
import defpackage.lno;
import defpackage.nm6;
import defpackage.nyf;
import defpackage.onx;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rad;
import defpackage.t13;
import defpackage.t7o;
import defpackage.tah;
import defpackage.vh;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 extends t13 implements dzf {
    public final x0q A;
    public final jyr B;
    public final ei C;
    public final Activity l;
    public final s0 m;
    public final l0 n;
    public final com.yandex.passport.sloth.ui.string.b o;
    public final d2 p;
    public final com.yandex.passport.sloth.ui.dependencies.d q;
    public final com.yandex.passport.internal.flags.experiments.p r;
    public final com.yandex.passport.data.network.token.i s;
    public final b1 t;
    public final l u;
    public final com.yandex.passport.common.common.a v;
    public final com.yandex.passport.sloth.ui.dependencies.p w;
    public final agv x;
    public final com.yandex.passport.sloth.dependencies.i y;
    public final jyr z;

    public b0(Activity activity, s0 s0Var, l0 l0Var, com.yandex.passport.sloth.ui.string.b bVar, d2 d2Var, com.yandex.passport.sloth.ui.dependencies.d dVar, com.yandex.passport.internal.flags.experiments.p pVar, com.yandex.passport.data.network.token.i iVar, b1 b1Var, l lVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.sloth.ui.dependencies.p pVar2, agv agvVar, com.yandex.passport.sloth.dependencies.i iVar2) {
        activity.getClass();
        s0Var.getClass();
        l0Var.getClass();
        bVar.getClass();
        d2Var.getClass();
        dVar.getClass();
        pVar.getClass();
        iVar.getClass();
        b1Var.getClass();
        lVar.getClass();
        aVar.getClass();
        pVar2.getClass();
        agvVar.getClass();
        iVar2.getClass();
        this.l = activity;
        this.m = s0Var;
        this.n = l0Var;
        this.o = bVar;
        this.p = d2Var;
        this.q = dVar;
        this.r = pVar;
        this.s = iVar;
        this.t = b1Var;
        this.u = lVar;
        this.v = aVar;
        this.w = pVar2;
        this.x = agvVar;
        this.y = iVar2;
        this.z = btf.b(new r(this, 2));
        this.A = y0q.b(0, 0, null, 7);
        this.B = btf.b(new r(this, 3));
        this.C = (ei) registerForActivityResult(new vh(5), new gi(20, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(b0 b0Var, a1 a1Var, com.yandex.passport.sloth.u uVar, Continuation continuation) {
        z zVar;
        int i;
        b1 b1Var = b0Var.t;
        Activity activity = b0Var.l;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i2 = zVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zVar.k;
                Serializable serializable = nm6.a;
                i = zVar.m;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(uVar, com.yandex.passport.sloth.s.a)) {
                        com.yandex.passport.internal.ui.sloth.d dVar = (com.yandex.passport.internal.ui.sloth.d) b0Var.q;
                        dVar.getClass();
                        activity.getClass();
                        new com.yandex.passport.internal.util.i(dVar.a).a(activity);
                    } else if (uVar instanceof com.yandex.passport.sloth.n) {
                        b0Var.s().a.e = ((com.yandex.passport.sloth.n) uVar).a;
                    } else {
                        if (uVar instanceof com.yandex.passport.sloth.t) {
                            com.yandex.passport.sloth.t tVar = (com.yandex.passport.sloth.t) uVar;
                            zVar.j = null;
                            zVar.m = 1;
                            rad radVar = new rad(0);
                            x97.y(gld.e(zVar.getContext()), null, null, new j(b0Var.A, null, tVar), 3);
                            try {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Phone Number Hint started", 8);
                                }
                                b1Var.a(new com.yandex.passport.sloth.n0(com.yandex.passport.sloth.u0.STARTED, (String) null));
                                onx e = ild.z(activity).e(radVar);
                                c cVar = new c(i3, new com.yandex.passport.internal.ui.bouncer.roundabout.k(14, b0Var));
                                e.getClass();
                                lno lnoVar = j8s.a;
                                e.d(lnoVar, cVar);
                                e.c(lnoVar, new com.yandex.passport.internal.ui.l(9, b0Var, tVar));
                            } catch (Exception e2) {
                                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failed", e2);
                                }
                                b1Var.a(new com.yandex.passport.sloth.n0(com.yandex.passport.sloth.u0.FAILED, e2.getMessage()));
                                tVar.a.invoke(null);
                            }
                            if (Unit.a == serializable) {
                                return serializable;
                            }
                            return Unit.a;
                        }
                        if (uVar instanceof com.yandex.passport.sloth.o) {
                            com.yandex.passport.sloth.o oVar = (com.yandex.passport.sloth.o) uVar;
                            if (!oVar.b) {
                                w0 w0Var = new w0(true);
                                zVar.j = null;
                                zVar.m = 3;
                                if (((com.yandex.passport.sloth.c1) a1Var).f(w0Var, zVar) == serializable) {
                                    return serializable;
                                }
                                return Unit.a;
                            }
                            if (!oVar.a) {
                                w0 w0Var2 = new w0(false);
                                zVar.j = null;
                                zVar.m = 2;
                                if (((com.yandex.passport.sloth.c1) a1Var).f(w0Var2, zVar) == serializable) {
                                    return serializable;
                                }
                                return Unit.a;
                            }
                            s0 s0Var = b0Var.m;
                            com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) a1Var;
                            c1Var.d();
                            s0Var.e(new hav(26, b0Var, c1Var));
                        } else if (uVar instanceof com.yandex.passport.sloth.q) {
                            if (((com.yandex.passport.sloth.q) uVar).a) {
                                com.yandex.passport.sloth.ui.webview.i s = b0Var.s();
                                if (!s.h) {
                                    s.a.b(q0.d);
                                }
                            }
                        } else if (uVar instanceof com.yandex.passport.sloth.p) {
                            com.yandex.passport.sloth.p pVar = (com.yandex.passport.sloth.p) uVar;
                            com.yandex.passport.sloth.c1 c1Var2 = (com.yandex.passport.sloth.c1) a1Var;
                            if ((c1Var2.a instanceof com.yandex.passport.sloth.data.d0) && !pVar.c) {
                                Map b = tah.b(new Pair("url", pVar.a));
                                b1Var.getClass();
                                b.getClass();
                                a1 a1Var2 = b1Var.a;
                                if (a1Var2 != null) {
                                    com.yandex.passport.sloth.a1 a1Var3 = ((com.yandex.passport.sloth.c1) a1Var2).b.i;
                                    a1Var3.getClass();
                                    com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) a1Var3.a;
                                    oVar2.getClass();
                                    if (oVar2.a()) {
                                        oVar2.a.a("pay.processing_open_browser_without_redirect", b);
                                    }
                                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "interactor is not ready", 8);
                                }
                            }
                            com.yandex.passport.sloth.data.o0 o0Var = c1Var2.a;
                            zVar.j = pVar;
                            zVar.m = 4;
                            if (b0Var.t(pVar, o0Var, zVar) == serializable) {
                                return serializable;
                            }
                            if (((com.yandex.passport.sloth.p) uVar).c) {
                            }
                        } else if (!(uVar instanceof com.yandex.passport.sloth.r)) {
                            b6e.s();
                            return null;
                        }
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uVar = zVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    if (((com.yandex.passport.sloth.p) uVar).c) {
                        b0Var.p.a(e1.b);
                    }
                }
                return Unit.a;
            }
        }
        zVar = new z(b0Var, continuation);
        Object obj2 = zVar.k;
        Serializable serializable2 = nm6.a;
        i = zVar.m;
        int i32 = 1;
        if (i != 0) {
        }
        return Unit.a;
    }

    @Override // defpackage.orq, defpackage.srq
    public final void a() {
        super.a();
        r().g(kyf.ON_PAUSE);
    }

    @Override // defpackage.orq, defpackage.srq
    public final void b() {
        super.b();
        r().g(kyf.ON_START);
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        return r();
    }

    @Override // defpackage.orq
    public final void j() {
        super.j();
        r().g(kyf.ON_CREATE);
    }

    @Override // defpackage.orq
    public final void k() {
        super.k();
        r().g(kyf.ON_DESTROY);
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.m.a;
    }

    @Override // defpackage.orq, defpackage.srq
    public final void onResume() {
        super.onResume();
        r().g(kyf.ON_RESUME);
    }

    @Override // defpackage.orq, defpackage.srq
    public final void onStop() {
        super.onStop();
        r().g(kyf.ON_STOP);
    }

    public final gzf r() {
        return (gzf) this.z.getValue();
    }

    public final com.yandex.passport.sloth.ui.webview.i s() {
        return (com.yandex.passport.sloth.ui.webview.i) this.B.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable t(com.yandex.passport.sloth.p pVar, com.yandex.passport.sloth.data.o0 o0Var, cg6 cg6Var) {
        x xVar;
        int i;
        com.yandex.passport.common.core.f uid;
        String str;
        Object d;
        com.yandex.passport.sloth.p pVar2;
        com.yandex.passport.sloth.p pVar3;
        com.yandex.passport.common.core.f fVar;
        Serializable e;
        Throwable a;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.o = i2 - Integer.MIN_VALUE;
                x xVar2 = xVar;
                Object obj = xVar2.m;
                nm6 nm6Var = nm6.a;
                i = xVar2.o;
                b1 b1Var = this.t;
                if (i != 0) {
                    qgg.h0(obj);
                    uid = o0Var instanceof com.yandex.passport.sloth.data.q ? ((com.yandex.passport.sloth.data.q) o0Var).getUid() : null;
                    com.yandex.passport.common.core.c cVar = ((o0Var instanceof com.yandex.passport.sloth.data.t) || (o0Var instanceof com.yandex.passport.sloth.data.c0)) ? com.yandex.passport.common.core.c.b : com.yandex.passport.common.core.c.a;
                    if (!pVar.b || uid == null) {
                        str = pVar.a;
                        Uri uri = com.yandex.passport.common.browser.c.a;
                        e = com.yandex.passport.common.browser.c.e(this.l, str);
                        r7o r7oVar = z7o.b;
                        if (!(e instanceof t7o)) {
                            b1Var.a(new com.yandex.passport.sloth.n0(pVar, true, (String) e, uid != null ? new Long(uid.b) : null));
                        }
                        if (z7o.a(e) == null) {
                            return e;
                        }
                        b1Var.a(new com.yandex.passport.sloth.n0(pVar, false, null, uid != null ? new Long(uid.b) : null));
                        return e;
                    }
                    String str2 = pVar.a;
                    xVar2.j = pVar;
                    xVar2.k = pVar;
                    xVar2.l = uid;
                    xVar2.o = 1;
                    d = ((com.yandex.passport.internal.sloth.w) this.y).d(uid, null, str2, cVar, xVar2);
                    if (d == nm6Var) {
                        return nm6Var;
                    }
                    pVar2 = pVar;
                    pVar3 = pVar2;
                    fVar = uid;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = xVar2.l;
                    pVar2 = xVar2.k;
                    pVar3 = xVar2.j;
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                a = z7o.a(d);
                if (a != null) {
                    b1Var.a(new com.yandex.passport.sloth.n0(String.valueOf(a.getMessage()), new Pair("uid", String.valueOf(fVar.b)), new Pair("place", "getAuthorizationUrl in openExternalUrl")));
                }
                if (d instanceof t7o) {
                    d = null;
                }
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) d;
                str = bVar == null ? bVar.a : null;
                if (str == null) {
                    str = pVar2.a;
                }
                uid = fVar;
                pVar = pVar3;
                Uri uri2 = com.yandex.passport.common.browser.c.a;
                e = com.yandex.passport.common.browser.c.e(this.l, str);
                r7o r7oVar2 = z7o.b;
                if (!(e instanceof t7o)) {
                }
                if (z7o.a(e) == null) {
                }
            }
        }
        xVar = new x(this, cg6Var);
        x xVar22 = xVar;
        Object obj2 = xVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = xVar22.o;
        b1 b1Var2 = this.t;
        if (i != 0) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
        if (d instanceof t7o) {
        }
        com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) d;
        if (bVar2 == null) {
        }
        if (str == null) {
        }
        uid = fVar;
        pVar = pVar3;
        Uri uri22 = com.yandex.passport.common.browser.c.a;
        e = com.yandex.passport.common.browser.c.e(this.l, str);
        r7o r7oVar22 = z7o.b;
        if (!(e instanceof t7o)) {
        }
        if (z7o.a(e) == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(14:5|6|7|(1:(1:10)(2:40|41))(2:42|(1:44))|11|12|13|14|15|16|17|(1:(2:20|(1:22))(2:26|27))(2:28|(1:30))|23|24))|45|6|7|(0)(0)|11|12|13|14|15|16|17|(0)(0)|23|24|(1:(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        r0.getPackageManager().getPackageInfo("com.whatsapp.w4b", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        r11.a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new kotlin.Pair("error_message", java.lang.String.valueOf(r0.getMessage()))));
        r1 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016b, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016d, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "Failed sendOtpIntentToWhatsApp", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127 A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:13:0x00e2, B:15:0x00e9, B:32:0x00f3, B:20:0x0103, B:22:0x0115, B:26:0x011f, B:27:0x0126, B:28:0x0127, B:30:0x0142), top: B:12:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // defpackage.t13
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(t0 t0Var, cg6 cg6Var) {
        y yVar;
        int i;
        int i2;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i3 = yVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yVar.l = i3 - Integer.MIN_VALUE;
                y yVar2 = yVar;
                Object obj = yVar2.j;
                nm6 nm6Var = nm6.a;
                i = yVar2.l;
                i2 = 0;
                b1 b1Var = this.t;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    a1 a1Var = t0Var.a;
                    b1Var.a = a1Var;
                    x97.y(wyf.F(r()), null, null, new u(((com.yandex.passport.internal.sloth.n) this.u).a, continuation, this, i2), 3);
                    com.yandex.passport.sloth.ui.webview.i s = s();
                    com.yandex.passport.sloth.c1 c1Var = (com.yandex.passport.sloth.c1) a1Var;
                    s.f = c1Var.a;
                    s.i = new s(a1Var, this);
                    s.j = new com.yandex.passport.internal.ui.bouncer.roundabout.k(13, a1Var);
                    s.k = new s(this, a1Var);
                    x97.y(gld.e(yVar2.getContext()), null, null, new we(c1Var.b(), continuation, this, a1Var, 16), 3);
                    x97.y(gld.e(yVar2.getContext()), null, null, new u(c1Var.b.c.b, continuation, this, i4), 3);
                    com.yandex.passport.sloth.ui.webview.i s2 = s();
                    yVar2.l = 1;
                    this.n.getClass();
                    SlothJsApi$WebAmJsInterface slothJsApi$WebAmJsInterface = new SlothJsApi$WebAmJsInterface(gld.e(yVar2.getContext()), a1Var, s2);
                    s2.getClass();
                    s2.a(new com.yandex.passport.internal.ui.bouncer.o(18, s2, slothJsApi$WebAmJsInterface));
                    if (Unit.a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.m.d = new r(this, i4);
                Activity activity = this.l;
                gao gaoVar = new gao(17);
                activity.getPackageManager().getPackageInfo("com.whatsapp", 0);
                i2 = 1;
                if (i2 != 0) {
                    b1Var.a(new com.yandex.passport.sloth.n0("send_otp_intent_to_whats_app", new Pair("error_message", "whatsapp_is_not_installed")));
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Failed sendOtpIntentToWhatsApp: WhatsApp is not installed", 8);
                    }
                } else {
                    if (activity == null) {
                        throw new NullPointerException("Context cannot be null");
                    }
                    gaoVar.N(activity, chv.CONSUMER);
                    gaoVar.N(activity, chv.BUSINESS);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Success sendOtpIntentToWhatsApp", 8);
                    }
                }
                return Unit.a;
            }
        }
        yVar = new y(this, cg6Var);
        y yVar22 = yVar;
        Object obj2 = yVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = yVar22.l;
        i2 = 0;
        b1 b1Var2 = this.t;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        this.m.d = new r(this, i42);
        Activity activity2 = this.l;
        gao gaoVar2 = new gao(17);
        activity2.getPackageManager().getPackageInfo("com.whatsapp", 0);
        i2 = 1;
        if (i2 != 0) {
        }
        return Unit.a;
    }
}
