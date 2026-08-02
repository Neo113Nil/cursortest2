package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.internal.report.r5;
import com.yandex.passport.internal.report.s5;
import com.yandex.passport.internal.report.t5;
import defpackage.avf;
import defpackage.c3x;
import defpackage.cg6;
import defpackage.ern;
import defpackage.gm5;
import defpackage.h0n;
import defpackage.hld;
import defpackage.knn;
import defpackage.m7d;
import defpackage.ms6;
import defpackage.my1;
import defpackage.n7d;
import defpackage.nm6;
import defpackage.o7d;
import defpackage.opi;
import defpackage.q5b;
import defpackage.qad;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.sad;
import defpackage.sg1;
import defpackage.t7o;
import defpackage.tad;
import defpackage.tah;
import defpackage.uah;
import defpackage.uej;
import defpackage.wr6;
import defpackage.xq0;
import defpackage.xq6;
import defpackage.xz0;
import defpackage.z7o;
import defpackage.z9k;
import defpackage.zq6;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class k implements d {
    public static final /* synthetic */ s9f[] c;
    public final IReporterYandex a;
    public final knn b = avf.V();

    static {
        opi opiVar = new opi(k.class, "context", "getContext()Landroid/content/Context;", 0);
        ern.a.getClass();
        c = new s9f[]{opiVar};
    }

    public k(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, e eVar, Continuation continuation) {
        f fVar;
        int i;
        Object g;
        Throwable a;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.j;
                Object obj2 = nm6.a;
                i = fVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Context context = (Context) this.b.getValue(this, c[0]);
                    if (context == null) {
                        f("context credential manager is null", new NullPointerException(), eVar);
                        r7o r7oVar = z7o.b;
                        return new t7o(new IllegalStateException("context credential manager is null"));
                    }
                    fVar2.l = 1;
                    g = g(context, z, null, eVar, fVar2);
                    if (g == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = ((z7o) obj).a;
                }
                a = z7o.a(g);
                if (a == null) {
                    return new t7o(a);
                }
                c cVar = (c) g;
                a aVar = cVar instanceof a ? (a) cVar : null;
                return aVar != null ? aVar : new t7o(new IllegalStateException("unrecognized credential types"));
            }
        }
        fVar = new f(this, (cg6) continuation);
        f fVar22 = fVar;
        Object obj3 = fVar22.j;
        Object obj22 = nm6.a;
        i = fVar22.l;
        if (i != 0) {
        }
        a = z7o.a(g);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e eVar, String str, Continuation continuation) {
        g gVar;
        int i;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.j;
                Object obj2 = nm6.a;
                i = gVar2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Context context = (Context) this.b.getValue(this, c[0]);
                if (context != null) {
                    gVar2.l = 1;
                    Object g = g(context, false, str, eVar, gVar2);
                    return g == obj2 ? obj2 : g;
                }
                f("context credential manager is null", new NullPointerException(), eVar);
                r7o r7oVar = z7o.b;
                return new t7o(new IllegalStateException("context credential manager is null"));
            }
        }
        gVar = new g(this, (cg6) continuation);
        g gVar22 = gVar;
        Object obj3 = gVar22.j;
        Object obj22 = nm6.a;
        i = gVar22.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, e eVar, cg6 cg6Var) {
        i iVar;
        int i;
        boolean z;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                Object obj2 = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    z = false;
                    Context context = (Context) this.b.getValue(this, c[0]);
                    if (context == null) {
                        f("context credential manager is null", new NullPointerException(), eVar);
                        return Boolean.valueOf(z);
                    }
                    iVar.l = 1;
                    obj = h(context, aVar, eVar, iVar);
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
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        iVar = new i(this, cg6Var);
        Object obj3 = iVar.j;
        Object obj22 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        z = ((Boolean) obj3).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final void d(Context context) {
        context.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Attach Credential Manager to context of Activity", 8);
        }
        this.b.setValue(this, c[0], context);
    }

    public final void e(o7d o7dVar, gm5 gm5Var, e eVar) {
        c3x c3xVar = o7dVar.a;
        boolean z = c3xVar instanceof z9k;
        IReporterYandex iReporterYandex = this.a;
        if (z) {
            iReporterYandex.reportEvent(s5.d.toString(), tah.b(new Pair("from", eVar.a)));
            z9k z9kVar = (z9k) c3xVar;
            gm5Var.U(new z7o(avf.u(new a(z9kVar.j, z9kVar.k, true))));
        } else {
            if (c3xVar instanceof h0n) {
                gm5Var.U(new z7o(avf.u(new b(((h0n) c3xVar).j, true))));
                return;
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, null, "unrecognized credential types", 8);
            }
            iReporterYandex.reportEvent("unrecognized credential types", tah.b(new Pair("from", eVar.a)));
            my1 my1Var = new my1("unrecognized credential types", new uej(null, 1, null));
            r7o r7oVar = z7o.b;
            gm5Var.U(new z7o(new t7o(my1Var)));
        }
    }

    public final void f(String str, Exception exc, e eVar) {
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, str, exc);
        }
        this.a.reportEvent(r5.d.toString(), uah.e(new Pair("error", str), new Pair("throwable-message", exc.getMessage()), new Pair("from", eVar.a)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(1:(1:(3:10|11|12)(2:14|15))(4:16|17|18|19))(11:42|(1:44)|(1:46)(1:69)|47|48|49|50|51|52|(1:54)|24)|20|21|22))|70|6|(0)(0)|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014e, code lost:
    
        if (r2 != r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, boolean z, String str, e eVar, cg6 cg6Var) {
        h hVar;
        int i;
        e eVar2;
        boolean z2;
        gm5 gm5Var;
        e eVar3;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.o = i2 - Integer.MIN_VALUE;
                Object obj = hVar.m;
                Object obj2 = nm6.a;
                i = hVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    context.getClass();
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start request to get credential from Credential Manager", 8);
                    }
                    tad tadVar = str != null ? new tad(str) : null;
                    q5b q5bVar = q5b.a;
                    q5bVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(q5bVar));
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(q5bVar));
                    n7d n7dVar = new n7d(xz0.w(new ms6[]{tadVar, new qad("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, z, q5bVar, 1000)}));
                    gm5 j = hld.j();
                    eVar2 = eVar;
                    try {
                        hVar.j = eVar2;
                        hVar.k = j;
                        z2 = z;
                        try {
                            hVar.l = z2;
                            hVar.o = 1;
                            Object d = sg1.d(context, n7dVar, hVar);
                            if (d != obj2) {
                                gm5Var = j;
                                eVar3 = eVar2;
                                obj = d;
                            }
                        } catch (sad e) {
                            e = e;
                            gm5Var = j;
                            f("Request for public key was failed", e, eVar2);
                            my1 my1Var = new my1("Work with Credential Manager is failed", e);
                            r7o r7oVar = z7o.b;
                            gm5Var.U(new z7o(new t7o(my1Var)));
                            hVar.j = null;
                            hVar.k = null;
                            hVar.l = z2;
                            hVar.o = 2;
                            obj = gm5Var.s(hVar);
                            nm6 nm6Var = nm6.a;
                        } catch (m7d e2) {
                            e = e2;
                            gm5Var = j;
                            f("Request credentials was failed", e, eVar2);
                            my1 my1Var2 = new my1("Work with Credential Manager is failed", e);
                            r7o r7oVar2 = z7o.b;
                            gm5Var.U(new z7o(new t7o(my1Var2)));
                            hVar.j = null;
                            hVar.k = null;
                            hVar.l = z2;
                            hVar.o = 2;
                            obj = gm5Var.s(hVar);
                            nm6 nm6Var2 = nm6.a;
                        } catch (Exception e3) {
                            e = e3;
                            gm5Var = j;
                            f("unknown error", e, eVar2);
                            my1 my1Var3 = new my1("unknown error", e);
                            r7o r7oVar3 = z7o.b;
                            gm5Var.U(new z7o(new t7o(my1Var3)));
                            hVar.j = null;
                            hVar.k = null;
                            hVar.l = z2;
                            hVar.o = 2;
                            obj = gm5Var.s(hVar);
                            nm6 nm6Var22 = nm6.a;
                        }
                    } catch (sad e4) {
                        e = e4;
                        z2 = z;
                    } catch (m7d e5) {
                        e = e5;
                        z2 = z;
                    } catch (Exception e6) {
                        e = e6;
                        z2 = z;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = hVar.l;
                gm5Var = hVar.k;
                eVar3 = hVar.j;
                try {
                    qgg.h0(obj);
                    z2 = z3;
                } catch (sad e7) {
                    e = e7;
                    z2 = z3;
                    eVar2 = eVar3;
                    f("Request for public key was failed", e, eVar2);
                    my1 my1Var4 = new my1("Work with Credential Manager is failed", e);
                    r7o r7oVar4 = z7o.b;
                    gm5Var.U(new z7o(new t7o(my1Var4)));
                    hVar.j = null;
                    hVar.k = null;
                    hVar.l = z2;
                    hVar.o = 2;
                    obj = gm5Var.s(hVar);
                    nm6 nm6Var222 = nm6.a;
                } catch (m7d e8) {
                    e = e8;
                    z2 = z3;
                    eVar2 = eVar3;
                    f("Request credentials was failed", e, eVar2);
                    my1 my1Var22 = new my1("Work with Credential Manager is failed", e);
                    r7o r7oVar22 = z7o.b;
                    gm5Var.U(new z7o(new t7o(my1Var22)));
                    hVar.j = null;
                    hVar.k = null;
                    hVar.l = z2;
                    hVar.o = 2;
                    obj = gm5Var.s(hVar);
                    nm6 nm6Var2222 = nm6.a;
                } catch (Exception e9) {
                    e = e9;
                    z2 = z3;
                    eVar2 = eVar3;
                    f("unknown error", e, eVar2);
                    my1 my1Var32 = new my1("unknown error", e);
                    r7o r7oVar32 = z7o.b;
                    gm5Var.U(new z7o(new t7o(my1Var32)));
                    hVar.j = null;
                    hVar.k = null;
                    hVar.l = z2;
                    hVar.o = 2;
                    obj = gm5Var.s(hVar);
                    nm6 nm6Var22222 = nm6.a;
                }
                e((o7d) obj, gm5Var, eVar3);
                hVar.j = null;
                hVar.k = null;
                hVar.l = z2;
                hVar.o = 2;
                obj = gm5Var.s(hVar);
                nm6 nm6Var222222 = nm6.a;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj3 = hVar.m;
        Object obj22 = nm6.a;
        i = hVar.o;
        if (i != 0) {
        }
        e((o7d) obj3, gm5Var, eVar3);
        hVar.j = null;
        hVar.k = null;
        hVar.l = z2;
        hVar.o = 2;
        obj3 = gm5Var.s(hVar);
        nm6 nm6Var2222222 = nm6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Context context, a aVar, e eVar, cg6 cg6Var) {
        j jVar;
        int i;
        gm5 gm5Var;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    context.getClass();
                    sg1 sg1Var = new sg1(context, 1);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start save credential in Credential Manager", 8);
                    }
                    String str = aVar.c;
                    if (str == null || StringsKt.U(str)) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Password from Credentials is null or empty", 8);
                        }
                        return Boolean.FALSE;
                    }
                    gm5 j = hld.j();
                    wr6 wr6Var = new wr6(aVar.b, str);
                    try {
                        jVar.j = eVar;
                        jVar.k = j;
                        jVar.n = 1;
                        if (sg1Var.c(context, wr6Var, jVar) != nm6Var) {
                            gm5Var = j;
                        }
                    } catch (xq6 e) {
                        e = e;
                        gm5Var = j;
                        f("User cancelled the save", e, eVar);
                        gm5Var.U(Boolean.FALSE);
                        jVar.j = null;
                        jVar.k = null;
                        jVar.n = 2;
                        Object s = gm5Var.s(jVar);
                        nm6 nm6Var2 = nm6.a;
                        if (s != nm6Var) {
                        }
                    } catch (zq6 e2) {
                        e = e2;
                        gm5Var = j;
                        f("Save credentials was failed", e, eVar);
                        gm5Var.U(Boolean.FALSE);
                        jVar.j = null;
                        jVar.k = null;
                        jVar.n = 2;
                        Object s2 = gm5Var.s(jVar);
                        nm6 nm6Var22 = nm6.a;
                        if (s2 != nm6Var) {
                        }
                    } catch (Exception e3) {
                        e = e3;
                        gm5Var = j;
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        gm5Var.U(Boolean.FALSE);
                        jVar.j = null;
                        jVar.k = null;
                        jVar.n = 2;
                        Object s22 = gm5Var.s(jVar);
                        nm6 nm6Var222 = nm6.a;
                        if (s22 != nm6Var) {
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gm5Var = jVar.k;
                eVar = jVar.j;
                try {
                    qgg.h0(obj);
                } catch (xq6 e4) {
                    e = e4;
                    f("User cancelled the save", e, eVar);
                    gm5Var.U(Boolean.FALSE);
                    jVar.j = null;
                    jVar.k = null;
                    jVar.n = 2;
                    Object s222 = gm5Var.s(jVar);
                    nm6 nm6Var2222 = nm6.a;
                    if (s222 != nm6Var) {
                    }
                } catch (zq6 e5) {
                    e = e5;
                    f("Save credentials was failed", e, eVar);
                    gm5Var.U(Boolean.FALSE);
                    jVar.j = null;
                    jVar.k = null;
                    jVar.n = 2;
                    Object s2222 = gm5Var.s(jVar);
                    nm6 nm6Var22222 = nm6.a;
                    if (s2222 != nm6Var) {
                    }
                } catch (Exception e6) {
                    e = e6;
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "unknown error", e);
                    }
                    gm5Var.U(Boolean.FALSE);
                    jVar.j = null;
                    jVar.k = null;
                    jVar.n = 2;
                    Object s22222 = gm5Var.s(jVar);
                    nm6 nm6Var222222 = nm6.a;
                    if (s22222 != nm6Var) {
                    }
                }
                this.a.reportEvent(t5.d.toString(), tah.b(new Pair("from", eVar.a)));
                gm5Var.U(Boolean.TRUE);
                jVar.j = null;
                jVar.k = null;
                jVar.n = 2;
                Object s222222 = gm5Var.s(jVar);
                nm6 nm6Var2222222 = nm6.a;
                return s222222 != nm6Var ? nm6Var : s222222;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.l;
        nm6 nm6Var3 = nm6.a;
        i = jVar.n;
        if (i != 0) {
        }
        this.a.reportEvent(t5.d.toString(), tah.b(new Pair("from", eVar.a)));
        gm5Var.U(Boolean.TRUE);
        jVar.j = null;
        jVar.k = null;
        jVar.n = 2;
        Object s2222222 = gm5Var.s(jVar);
        nm6 nm6Var22222222 = nm6.a;
        if (s2222222 != nm6Var3) {
        }
    }
}
