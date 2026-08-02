package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import com.yandex.passport.api.x;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.impl.f0;
import com.yandex.passport.internal.impl.g0;
import com.yandex.passport.internal.report.m1;
import defpackage.bsd;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.gld;
import defpackage.gm5;
import defpackage.hld;
import defpackage.inr;
import defpackage.j5h;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.wis;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zh;
import io.appmetrica.analytics.IReporterYandex;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k {
    public final f0 a;
    public final IReporterYandex b;

    public k(f0 f0Var, IReporterYandex iReporterYandex) {
        f0Var.getClass();
        this.a = f0Var;
        this.b = iReporterYandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, com.yandex.passport.internal.sloth.credentialmanager.a aVar, com.yandex.passport.internal.properties.g gVar, cg6 cg6Var) {
        b bVar;
        int i;
        w wVar;
        Object q;
        Exception e;
        com.yandex.passport.api.exception.p e2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.o = i2 - Integer.MIN_VALUE;
                Object obj = bVar.m;
                nm6 nm6Var = nm6.a;
                i = bVar.o;
                f0 f0Var = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.api.impl.b bVar2 = gVar.a.a;
                    String str = aVar.b;
                    String str2 = aVar.c;
                    str2.getClass();
                    wVar = new w(bVar2, str, str2, null);
                    try {
                        bVar.j = context;
                        bVar.k = gVar;
                        bVar.l = wVar;
                        bVar.o = 1;
                        q = f0Var.q(wVar, bVar);
                        if (q == nm6Var) {
                            return nm6Var;
                        }
                    } catch (com.yandex.passport.api.exception.p e3) {
                        e2 = e3;
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        throw new com.yandex.passport.api.exception.e(((g0) f0Var.c.getValue()).p(context, gVar, wVar, true));
                    } catch (Exception e4) {
                        e = e4;
                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        throw new com.yandex.passport.api.exception.e(((g0) f0Var.c.getValue()).p(context, gVar, wVar, false));
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w wVar2 = bVar.l;
                    gVar = bVar.k;
                    Context context2 = bVar.j;
                    try {
                        qgg.h0(obj);
                        Object obj2 = ((z7o) obj).a;
                        wVar = wVar2;
                        context = context2;
                        q = obj2;
                    } catch (com.yandex.passport.api.exception.p e5) {
                        wVar = wVar2;
                        context = context2;
                        e2 = e5;
                        com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Network problem", e2);
                        }
                        throw new com.yandex.passport.api.exception.e(((g0) f0Var.c.getValue()).p(context, gVar, wVar, true));
                    } catch (Exception e6) {
                        wVar = wVar2;
                        context = context2;
                        e = e6;
                        com.yandex.passport.common.logger.d dVar22 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Other problem", e);
                        }
                        throw new com.yandex.passport.api.exception.e(((g0) f0Var.c.getValue()).p(context, gVar, wVar, false));
                    }
                }
                qgg.h0(q);
                return (com.yandex.passport.internal.account.f) q;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bVar.o;
        f0 f0Var2 = this.a;
        if (i != 0) {
        }
        qgg.h0(q);
        return (com.yandex.passport.internal.account.f) q;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, cg6 cg6Var) {
        c cVar;
        int i;
        Object r;
        boolean booleanValue;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.j = context;
                    cVar.m = 1;
                    r = this.a.r(cVar);
                    if (r == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = cVar.j;
                    qgg.h0(obj);
                    r = ((z7o) obj).a;
                }
                Boolean bool = Boolean.TRUE;
                r7o r7oVar = z7o.b;
                if (r instanceof t7o) {
                    r = bool;
                }
                booleanValue = ((Boolean) r).booleanValue();
                IReporterYandex iReporterYandex = this.b;
                if (!booleanValue) {
                    iReporterYandex.reportEvent(m1.d.toString(), tah.b(new Pair("error", "Credential Manager disabled for autologin")));
                    throw new com.yandex.passport.api.exception.d("Credential Manager disabled for autologin");
                }
                if (com.yandex.passport.common.util.a.b(context)) {
                    return Unit.a;
                }
                iReporterYandex.reportEvent(m1.d.toString(), tah.b(new Pair("error", "Google play services not available")));
                throw new com.yandex.passport.api.exception.d("Google play services not available");
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        Boolean bool2 = Boolean.TRUE;
        r7o r7oVar2 = z7o.b;
        if (r instanceof t7o) {
        }
        booleanValue = ((Boolean) r).booleanValue();
        IReporterYandex iReporterYandex2 = this.b;
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r0 != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, com.yandex.passport.internal.sloth.credentialmanager.a aVar, com.yandex.passport.internal.properties.g gVar, cg6 cg6Var) {
        d dVar;
        int i;
        com.yandex.passport.internal.properties.g gVar2;
        k kVar;
        int i2;
        Object v;
        Object t7oVar;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i3 = dVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = dVar.m;
                    nm6 nm6Var = nm6.a;
                    i = dVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        gVar.getClass();
                        com.yandex.passport.internal.entities.k s = com.yandex.passport.internal.ui.a.s(gVar.e());
                        y1 h = gVar.h();
                        x f = gVar.f();
                        String message = gVar.getMessage();
                        boolean g = gVar.g();
                        com.yandex.passport.internal.credentials.f d = gVar.d();
                        com.yandex.passport.internal.properties.g gVar3 = new com.yandex.passport.internal.properties.g(s, h, f, message, g, d != null ? new com.yandex.passport.internal.credentials.f(d.a, d.b) : null);
                        gVar2 = gVar;
                        dVar.j = gVar2;
                        dVar.k = this;
                        dVar.l = 0;
                        dVar.o = 1;
                        if (a(context, aVar, gVar3, dVar) == nm6Var) {
                            return nm6Var;
                        }
                        kVar = this;
                        i2 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            v = ((z7o) obj).a;
                            r7o r7oVar2 = z7o.b;
                            if (!(v instanceof t7o)) {
                                try {
                                    t7oVar = new com.yandex.passport.internal.entities.d((com.yandex.passport.internal.account.f) v, false);
                                } catch (Throwable th) {
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar = new t7o(th);
                                }
                                v = t7oVar;
                            }
                            qgg.h0(v);
                            return (com.yandex.passport.internal.entities.d) v;
                        }
                        i2 = dVar.l;
                        kVar = dVar.k;
                        com.yandex.passport.internal.properties.g gVar4 = dVar.j;
                        qgg.h0(obj);
                        gVar2 = gVar4;
                    }
                    f0 f0Var = kVar.a;
                    dVar.j = null;
                    dVar.k = null;
                    dVar.l = i2;
                    dVar.o = 2;
                    v = f0Var.v(gVar2, dVar);
                }
            }
            if (i != 0) {
            }
            f0 f0Var2 = kVar.a;
            dVar.j = null;
            dVar.k = null;
            dVar.l = i2;
            dVar.o = 2;
            v = f0Var2.v(gVar2, dVar);
        } catch (Throwable th2) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th2);
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.m;
        nm6 nm6Var2 = nm6.a;
        i = dVar.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.passport.internal.properties.g gVar, cg6 cg6Var) {
        e eVar;
        int i;
        Object v;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.j;
                    nm6 nm6Var = nm6.a;
                    i = eVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        f0 f0Var = this.a;
                        eVar.l = 1;
                        v = f0Var.v(gVar, eVar);
                        if (v == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        v = ((z7o) obj).a;
                    }
                    qgg.h0(v);
                    return new com.yandex.passport.internal.entities.d((com.yandex.passport.internal.account.f) v, true);
                }
            }
            if (i != 0) {
            }
            qgg.h0(v);
            return new com.yandex.passport.internal.entities.d((com.yandex.passport.internal.account.f) v, true);
        } catch (com.yandex.passport.api.exception.d e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't auto login:", e);
            }
            this.b.reportEvent(m1.d.toString(), tah.b(new Pair("error", e.getMessage())));
            return null;
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r12 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x002e, CancellationException -> 0x0032, wis -> 0x0036, TryCatch #2 {wis -> 0x0036, CancellationException -> 0x0032, all -> 0x002e, blocks: (B:12:0x0029, B:13:0x0091, B:14:0x0094, B:21:0x004c, B:24:0x0075, B:26:0x0079, B:30:0x005a), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, com.yandex.passport.internal.properties.g gVar, zh zhVar, x0q x0qVar, cg6 cg6Var) {
        f fVar;
        int i;
        int i2;
        Object d;
        zh zhVar2;
        int i3;
        com.yandex.passport.internal.entities.d dVar;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i4 = fVar.r;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.r = i4 - Integer.MIN_VALUE;
                    f fVar2 = fVar;
                    Object obj = fVar2.p;
                    Object obj2 = nm6.a;
                    i = fVar2.r;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        fVar2.j = context;
                        fVar2.k = gVar;
                        fVar2.l = zhVar;
                        fVar2.m = x0qVar;
                        i2 = 0;
                        fVar2.n = 0;
                        fVar2.o = 0;
                        fVar2.r = 1;
                        d = d(gVar, fVar2);
                        if (d == obj2) {
                            return obj2;
                        }
                        zhVar2 = zhVar;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            dVar = (com.yandex.passport.internal.entities.d) obj;
                            r7o r7oVar2 = z7o.b;
                            return dVar;
                        }
                        int i5 = fVar2.o;
                        int i6 = fVar2.n;
                        x0qVar = fVar2.m;
                        zh zhVar3 = fVar2.l;
                        com.yandex.passport.internal.properties.g gVar2 = fVar2.k;
                        Context context2 = fVar2.j;
                        qgg.h0(obj);
                        zhVar2 = zhVar3;
                        i3 = i6;
                        gVar = gVar2;
                        d = obj;
                        i2 = i5;
                        context = context2;
                    }
                    xpi xpiVar = x0qVar;
                    dVar = (com.yandex.passport.internal.entities.d) d;
                    if (dVar == null) {
                        fVar2.j = null;
                        fVar2.k = null;
                        fVar2.l = null;
                        fVar2.m = null;
                        fVar2.n = i3;
                        fVar2.o = i2;
                        fVar2.r = 2;
                        obj = f(context, xpiVar, gVar, zhVar2, fVar2);
                    }
                    r7o r7oVar22 = z7o.b;
                    return dVar;
                }
            }
            if (i != 0) {
            }
            xpi xpiVar2 = x0qVar;
            dVar = (com.yandex.passport.internal.entities.d) d;
            if (dVar == null) {
            }
            r7o r7oVar222 = z7o.b;
            return dVar;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        fVar = new f(this, cg6Var);
        f fVar22 = fVar;
        Object obj3 = fVar22.p;
        Object obj22 = nm6.a;
        i = fVar22.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (r1 != r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, xpi xpiVar, com.yandex.passport.internal.properties.g gVar, zh zhVar, cg6 cg6Var) {
        i iVar;
        i iVar2;
        Object obj;
        int i;
        gm5 gm5Var;
        xpi xpiVar2;
        zh zhVar2;
        com.yandex.passport.internal.properties.g gVar2;
        Context context2;
        bsd bsdVar;
        pjt pjtVar;
        gm5 gm5Var2;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.q = i2 - Integer.MIN_VALUE;
                iVar2 = iVar;
                Object obj2 = iVar2.o;
                obj = nm6.a;
                i = iVar2.q;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    gm5 j = hld.j();
                    iVar2.j = context;
                    iVar2.k = xpiVar;
                    iVar2.l = gVar;
                    iVar2.m = zhVar;
                    iVar2.n = j;
                    iVar2.q = 1;
                    if (b(context, iVar2) != obj) {
                        gm5Var = j;
                        xpiVar2 = xpiVar;
                        zhVar2 = zhVar;
                        gVar2 = gVar;
                        context2 = context;
                    }
                    return obj;
                }
                if (i == 1) {
                    gm5 gm5Var3 = iVar2.n;
                    zh zhVar3 = iVar2.m;
                    com.yandex.passport.internal.properties.g gVar3 = iVar2.l;
                    xpi xpiVar3 = iVar2.k;
                    Context context3 = iVar2.j;
                    qgg.h0(obj2);
                    zhVar2 = zhVar3;
                    xpiVar2 = xpiVar3;
                    context2 = context3;
                    gVar2 = gVar3;
                    gm5Var = gm5Var3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        Object obj3 = ((z7o) obj2).a;
                        qgg.h0(obj3);
                        return obj3;
                    }
                    gm5Var2 = iVar2.n;
                    qgg.h0(obj2);
                    iVar2.j = null;
                    iVar2.k = null;
                    iVar2.l = null;
                    iVar2.m = null;
                    iVar2.n = null;
                    iVar2.q = 3;
                    obj2 = gm5Var2.s(iVar2);
                }
                dq7 dq7Var = ca8.a;
                x97.y(gld.e(mn7.d), null, null, new inr(xpiVar2, (Continuation) null, this, gm5Var, context2, gVar2), 3);
                bsdVar = j5h.a;
                pjtVar = new pjt(zhVar2, continuation, 16);
                iVar2.j = null;
                iVar2.k = null;
                iVar2.l = null;
                iVar2.m = null;
                iVar2.n = gm5Var;
                iVar2.q = 2;
                if (x97.V(bsdVar, pjtVar, iVar2) != obj) {
                    gm5Var2 = gm5Var;
                    iVar2.j = null;
                    iVar2.k = null;
                    iVar2.l = null;
                    iVar2.m = null;
                    iVar2.n = null;
                    iVar2.q = 3;
                    obj2 = gm5Var2.s(iVar2);
                }
                return obj;
            }
        }
        iVar = new i(this, cg6Var);
        iVar2 = iVar;
        Object obj22 = iVar2.o;
        obj = nm6.a;
        i = iVar2.q;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        dq7 dq7Var2 = ca8.a;
        x97.y(gld.e(mn7.d), null, null, new inr(xpiVar2, (Continuation) null, this, gm5Var, context2, gVar2), 3);
        bsdVar = j5h.a;
        pjtVar = new pjt(zhVar2, continuation2, 16);
        iVar2.j = null;
        iVar2.k = null;
        iVar2.l = null;
        iVar2.m = null;
        iVar2.n = gm5Var;
        iVar2.q = 2;
        if (x97.V(bsdVar, pjtVar, iVar2) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r8.a.u(true, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (b(r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, com.yandex.passport.internal.properties.g gVar, cg6 cg6Var) {
        j jVar;
        Object obj;
        int i;
        Object a;
        Context context2;
        z7o z7oVar;
        Object c;
        try {
            if (cg6Var instanceof j) {
                jVar = (j) cg6Var;
                int i2 = jVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.o = i2 - Integer.MIN_VALUE;
                    Object obj2 = jVar.m;
                    obj = nm6.a;
                    i = jVar.o;
                    if (i != 0) {
                        qgg.h0(obj2);
                        jVar.j = context;
                        jVar.k = gVar;
                        jVar.o = 1;
                    } else if (i == 1) {
                        gVar = jVar.k;
                        context = jVar.j;
                        qgg.h0(obj2);
                    } else if (i == 2) {
                        com.yandex.passport.internal.properties.g gVar2 = jVar.k;
                        Context context3 = jVar.j;
                        qgg.h0(obj2);
                        a = ((z7o) obj2).a;
                        context2 = context3;
                        gVar = gVar2;
                        z7oVar = new z7o(a);
                        jVar.j = context2;
                        jVar.k = gVar;
                        jVar.l = z7oVar;
                        jVar.o = 3;
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                            c = ((z7o) obj2).a;
                            qgg.h0(c);
                            com.yandex.passport.internal.entities.d dVar = (com.yandex.passport.internal.entities.d) c;
                            r7o r7oVar = z7o.b;
                            return dVar;
                        }
                        z7oVar = jVar.l;
                        gVar = jVar.k;
                        context2 = jVar.j;
                        qgg.h0(obj2);
                        ((z7o) obj2).getClass();
                        Object obj3 = z7oVar.a;
                        if (obj3 instanceof t7o) {
                            return obj3;
                        }
                        r7o r7oVar2 = z7o.b;
                        jVar.j = null;
                        jVar.k = null;
                        jVar.l = null;
                        jVar.o = 4;
                        c = c(context2, (com.yandex.passport.internal.sloth.credentialmanager.a) obj3, gVar, jVar);
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.k kVar = new com.yandex.passport.internal.sloth.credentialmanager.k(this.b);
                    kVar.d(context);
                    com.yandex.passport.internal.sloth.credentialmanager.e eVar = com.yandex.passport.internal.sloth.credentialmanager.e.AutoLogin;
                    jVar.j = context;
                    jVar.k = gVar;
                    jVar.o = 2;
                    a = kVar.a(true, eVar, jVar);
                    if (a != obj) {
                        context2 = context;
                        z7oVar = new z7o(a);
                        jVar.j = context2;
                        jVar.k = gVar;
                        jVar.l = z7oVar;
                        jVar.o = 3;
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            com.yandex.passport.internal.sloth.credentialmanager.k kVar2 = new com.yandex.passport.internal.sloth.credentialmanager.k(this.b);
            kVar2.d(context);
            com.yandex.passport.internal.sloth.credentialmanager.e eVar2 = com.yandex.passport.internal.sloth.credentialmanager.e.AutoLogin;
            jVar.j = context;
            jVar.k = gVar;
            jVar.o = 2;
            a = kVar2.a(true, eVar2, jVar);
            if (a != obj) {
            }
            return obj;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            return new t7o(th);
        }
        jVar = new j(this, cg6Var);
        Object obj22 = jVar.m;
        obj = nm6.a;
        i = jVar.o;
    }
}
