package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.report.a4;
import com.yandex.passport.internal.report.c3;
import com.yandex.passport.internal.report.d3;
import com.yandex.passport.internal.report.e3;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.g3;
import com.yandex.passport.internal.report.h3;
import com.yandex.passport.internal.report.r2;
import com.yandex.passport.internal.report.s2;
import com.yandex.passport.internal.report.t2;
import com.yandex.passport.internal.report.u2;
import com.yandex.passport.internal.report.v2;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.y2;
import com.yandex.passport.internal.report.z2;
import com.yandex.passport.internal.report.z3;
import com.yandex.passport.internal.report.ze;
import com.yandex.passport.internal.usecase.g2;
import com.yandex.passport.internal.usecase.i2;
import com.yandex.passport.internal.usecase.p1;
import com.yandex.passport.internal.usecase.r1;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.etn;
import defpackage.fxf;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.tah;
import defpackage.u75;
import defpackage.uah;
import defpackage.vz1;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.z7o;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class a0 extends com.yandex.passport.common.mvi.h {
    public final Context c;
    public final f d;
    public final com.yandex.passport.common.ebs.k e;
    public final com.yandex.passport.internal.usecase.e f;
    public final r1 g;
    public final i2 h;
    public final com.yandex.passport.internal.usecase.o i;
    public final com.yandex.passport.internal.usecase.h j;
    public final com.yandex.passport.internal.report.reporters.v k;
    public final com.yandex.passport.sloth.data.m l;

    public a0(Context context, f fVar, com.yandex.passport.common.ebs.k kVar, com.yandex.passport.internal.usecase.e eVar, r1 r1Var, i2 i2Var, com.yandex.passport.internal.usecase.o oVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.report.reporters.v vVar) {
        context.getClass();
        fVar.getClass();
        kVar.getClass();
        eVar.getClass();
        r1Var.getClass();
        i2Var.getClass();
        oVar.getClass();
        hVar.getClass();
        vVar.getClass();
        this.c = context;
        this.d = fVar;
        this.e = kVar;
        this.f = eVar;
        this.g = r1Var;
        this.h = i2Var;
        this.i = oVar;
        this.j = hVar;
        this.k = vVar;
        com.yandex.passport.common.core.f fVar2 = fVar.a;
        this.l = new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.a0(fVar2, com.yandex.plus.core.network.api.utils.a.T(fVar.d), fVar.b), fVar2.a, new com.yandex.passport.common.properties.a(15, false, false), 4);
    }

    public static void i(a0 a0Var, m1 m1Var) {
        a0Var.j(new h1(m1Var), t.AM);
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        s sVar = (s) obj;
        if (!(sVar instanceof m)) {
            boolean equals = sVar.equals(q.a);
            l lVar = l.a;
            if (equals) {
                f fVar = this.d;
                com.yandex.passport.common.core.f fVar2 = fVar.a;
                String str = fVar.b;
                String str2 = fVar.c;
                com.yandex.passport.internal.report.reporters.v vVar = this.k;
                vVar.getClass();
                fVar2.getClass();
                str.getClass();
                vVar.n(z3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str, 8), new com.yandex.passport.internal.report.f(str2, 7));
                e(lVar);
            } else {
                if (!sVar.equals(lVar)) {
                    if (sVar.equals(o.a)) {
                        Object p = p(gVar);
                        return p == nm6.a ? p : Unit.a;
                    }
                    if (sVar.equals(n.a)) {
                        Object o = o(gVar);
                        return o == nm6.a ? o : Unit.a;
                    }
                    if (sVar.equals(r.a)) {
                        Object r = r(gVar);
                        return r == nm6.a ? r : Unit.a;
                    }
                    if (sVar.equals(p.a)) {
                        Object s = s(gVar);
                        return s == nm6.a ? s : Unit.a;
                    }
                    b6e.s();
                    return null;
                }
                this.e.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Biometric module not implementation", 8);
                }
                n("biometric_module_connection_error");
                a(new f0(601));
            }
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        String uuid;
        m1 m1Var;
        m1 m1Var2;
        e1 e1Var = (e1) obj;
        if (e1Var instanceof b1) {
            com.yandex.passport.sloth.h0 h0Var = ((b1) e1Var).a;
            if (h0Var instanceof com.yandex.passport.sloth.a0) {
                Throwable th = ((com.yandex.passport.sloth.a0) h0Var).a;
                if (th instanceof com.yandex.passport.common.exception.a) {
                    n(null);
                    a(new f0(NetworkRequestException.EXPIRED_SIGNATURE));
                } else {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "SlothExternalRequest.Failed " + th, 8);
                    }
                    m1 m1Var3 = m1.t;
                    l1.a.getClass();
                    q(m1Var3, i0.b(th).name());
                }
            } else if (h0Var instanceof com.yandex.passport.sloth.e0) {
                com.yandex.passport.sloth.e0 e0Var = (com.yandex.passport.sloth.e0) h0Var;
                String str = e0Var.a;
                k1 k1Var = ((s0) h()).a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, vz1.s(new StringBuilder("Request change EBS process state, current state = "), (k1Var == null || (m1Var2 = k1Var.a) == null) ? null : m1Var2.name(), ", newState = ", str), 8);
                }
                try {
                    m1Var = m1.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    m1Var = m1.s;
                }
                if (u.a[m1Var.ordinal()] == 1) {
                    String str2 = e0Var.b;
                    String str3 = e0Var.c;
                    String str4 = e0Var.d;
                    if (str2 == null) {
                        m1 m1Var4 = m1.t;
                        i0 i0Var = l1.a;
                        q(m1Var4, "ESIA_CONSENT_APPLICATION_IS_NULL");
                    } else if (str3 == null) {
                        m1 m1Var5 = m1.t;
                        i0 i0Var2 = l1.a;
                        q(m1Var5, "ESIA_CONSENT_CONSUMER_NULL");
                    } else if (str4 == null) {
                        m1 m1Var6 = m1.t;
                        i0 i0Var3 = l1.a;
                        q(m1Var6, "ESIA_CONSENT_SCOPE_IS_NULL");
                    } else {
                        j(new i1(str2, str3, kotlin.text.c.r(str4, StringUtil.SPACE, "%20", false)), t.WEBAM);
                    }
                } else {
                    j(new h1(m1Var), t.WEBAM);
                }
            } else if (h0Var instanceof com.yandex.passport.sloth.b0) {
                k1 k1Var2 = ((s0) h()).a;
                if (k1Var2 == null) {
                    k1Var2 = new h1(m1.a);
                }
                m1 m1Var7 = k1Var2.a;
                if (k1Var2 instanceof h1) {
                    ((com.yandex.passport.sloth.b0) h0Var).a.invoke(tah.b(new Pair("type", m1Var7.name())));
                } else if (k1Var2 instanceof j1) {
                    ((com.yandex.passport.sloth.b0) h0Var).a.invoke(uah.e(new Pair("type", m1Var7.name()), new Pair("reason", ((j1) k1Var2).c)));
                } else {
                    if (!(k1Var2 instanceof i1)) {
                        b6e.s();
                        return null;
                    }
                    i1 i1Var = (i1) k1Var2;
                    ((com.yandex.passport.sloth.b0) h0Var).a.invoke(uah.e(new Pair("type", m1Var7.name()), new Pair("application", i1Var.b), new Pair("consumer", i1Var.c), new Pair("scope", i1Var.d)));
                }
            } else if (h0Var instanceof com.yandex.passport.sloth.c0) {
                n("invalid_token");
                a(new f0(NetworkRequestException.EXPIRED_SIGNATURE));
            }
        } else {
            boolean z = e1Var instanceof c1;
            f fVar = this.d;
            com.yandex.passport.internal.report.reporters.v vVar = this.k;
            if (z) {
                int ordinal = ((c1) e1Var).a.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    com.yandex.passport.common.core.f fVar2 = fVar.a;
                    String str5 = fVar.b;
                    String l = l();
                    k1 k1Var3 = ((s0) h()).a;
                    m1 m1Var8 = k1Var3 != null ? k1Var3.a : null;
                    vVar.getClass();
                    fVar2.getClass();
                    str5.getClass();
                    vVar.n(r2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str5, 8), new ff(l, 13), new ve(m1Var8 != null ? m1Var8.name() : null, 10));
                    g(m0.a);
                } else if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
            } else if (e1Var instanceof z0) {
                com.yandex.passport.common.core.f fVar3 = fVar.a;
                String str6 = fVar.b;
                vVar.getClass();
                fVar3.getClass();
                str6.getClass();
                vVar.n(e3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)), new com.yandex.passport.internal.report.a(str6, 8));
                i(this, m1.a);
                e(o.a);
            } else if (e1Var instanceof y0) {
                com.yandex.passport.common.core.f fVar4 = fVar.a;
                String str7 = fVar.b;
                com.yandex.passport.api.exception.j jVar = ((y0) e1Var).a;
                String message = jVar != null ? jVar.getMessage() : null;
                vVar.getClass();
                fVar4.getClass();
                str7.getClass();
                vVar.n(c3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar4.b)), new com.yandex.passport.internal.report.a(str7, 8), new com.yandex.passport.internal.report.a(message, 27));
                i(this, m1.f);
            } else if (e1Var instanceof v0) {
                com.yandex.passport.common.core.f fVar5 = fVar.a;
                String str8 = fVar.b;
                String l2 = l();
                vVar.getClass();
                fVar5.getClass();
                str8.getClass();
                vVar.n(v2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar5.b)), new com.yandex.passport.internal.report.a(str8, 8), new ff(l2, 13));
                Context context = this.c;
                try {
                    context.getClass();
                    uuid = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    uuid.getClass();
                } catch (Exception unused2) {
                    uuid = AppMetricaYandex.getUuid(context);
                }
                if (uuid != null) {
                    com.yandex.passport.internal.usecase.o oVar = this.i;
                    oVar.getClass();
                    SharedPreferences sharedPreferences = (SharedPreferences) oVar.b.getValue();
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("install_id", uuid);
                    edit.commit();
                }
                if (((s0) h()).f) {
                    i(this, m1.b);
                } else {
                    i(this, m1.k);
                }
            } else if (e1Var instanceof a1) {
                i(this, m1.l);
            } else if (e1Var instanceof u0) {
                com.yandex.passport.common.core.f fVar6 = fVar.a;
                String str9 = fVar.b;
                String l3 = l();
                vVar.getClass();
                fVar6.getClass();
                str9.getClass();
                vVar.n(t2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar6.b)), new com.yandex.passport.internal.report.a(str9, 8), new ff(l3, 13), new com.yandex.passport.internal.report.a("biometric_module_connection_error", 27));
                i(this, m1.j);
            } else if (e1Var instanceof t0) {
                vVar.A(fVar.a, fVar.b, l(), "NotInitializedSdkEbsException");
                a(d0.a);
                e(r.a);
            } else if (e1Var instanceof w0) {
                vVar.A(fVar.a, fVar.b, l(), ((w0) e1Var).a);
                i(this, m1.n);
            } else {
                if (!(e1Var instanceof d1)) {
                    if (!(e1Var instanceof x0)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.common.core.f fVar7 = fVar.a;
                    String str10 = fVar.b;
                    String l4 = l();
                    vVar.getClass();
                    fVar7.getClass();
                    str10.getClass();
                    vVar.n(z2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar7.b)), new com.yandex.passport.internal.report.a(str10, 8), new ff(l4, 13));
                    Object k = k(gVar);
                    return k == nm6.a ? k : Unit.a;
                }
                i(this, m1.b);
            }
        }
        return Unit.a;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        n(th.getMessage());
        a(new f0(((th instanceof com.yandex.passport.common.exception.a) || (th instanceof com.yandex.passport.api.exception.b)) ? NetworkRequestException.EXPIRED_SIGNATURE : 1112));
        return Unit.a;
    }

    public final void j(k1 k1Var, t tVar) {
        char c;
        m1 m1Var = k1Var.a;
        j1 j1Var = k1Var instanceof j1 ? (j1) k1Var : null;
        String str = j1Var != null ? j1Var.c : null;
        f fVar = this.d;
        com.yandex.passport.common.core.f fVar2 = fVar.a;
        String str2 = fVar.b;
        String l = l();
        k1 k1Var2 = ((s0) h()).a;
        m1 m1Var2 = k1Var2 != null ? k1Var2.a : null;
        com.yandex.passport.internal.report.reporters.v vVar = this.k;
        vVar.getClass();
        fVar2.getClass();
        str2.getClass();
        m1Var.getClass();
        ArrayList j = u75.j(new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str2, 8), new ff(l, 13), new ve(m1Var2 != null ? m1Var2.name() : null, 9), new ve(m1Var.name(), 7), new ff(tVar.a, 15));
        if (str != null) {
            c = 0;
            j.add(new ve(str, 17));
        } else {
            c = 0;
        }
        vVar.m(s2.d, j);
        a(new e0(k1Var, this.l));
        if (!(k1Var instanceof i1)) {
            int ordinal = m1Var.ordinal();
            if (ordinal == 1) {
                a(b0.a);
                e(o.a);
                return;
            }
            if (ordinal == 2) {
                e(p.a);
                return;
            }
            if (ordinal == 4) {
                e(r.a);
                return;
            } else if (ordinal == 8) {
                e(n.a);
                return;
            } else {
                if (ordinal != 14) {
                    return;
                }
                g(n0.a);
                return;
            }
        }
        com.yandex.passport.common.core.f fVar3 = fVar.a;
        i1 i1Var = (i1) k1Var;
        String str3 = i1Var.b;
        String str4 = i1Var.c;
        String str5 = i1Var.d;
        fVar3.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        d3 d3Var = d3.d;
        com.yandex.passport.internal.report.c cVar = new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b));
        com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(str2, 8);
        com.yandex.passport.internal.report.a aVar2 = new com.yandex.passport.internal.report.a(str3, 3);
        com.yandex.passport.internal.report.a aVar3 = new com.yandex.passport.internal.report.a(str4, 19);
        ve veVar = new ve(str5, 22);
        ze[] zeVarArr = new ze[5];
        zeVarArr[c] = cVar;
        zeVarArr[1] = aVar;
        zeVarArr[2] = aVar2;
        zeVarArr[3] = aVar3;
        zeVarArr[4] = veVar;
        vVar.n(d3Var, zeVarArr);
        g(new l0(fVar.d, fVar.a, i1Var.b, i1Var.c, i1Var.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        v vVar;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.j;
                nm6 nm6Var = nm6.a;
                i = vVar.l;
                f fVar = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    String l = l();
                    if (l == null) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Track id is null when check track_id", 8);
                        }
                        m1 m1Var = m1.t;
                        i0 i0Var = l1.a;
                        q(m1Var, "TRACK_ID_IS_NULL");
                        return Unit.a;
                    }
                    com.yandex.passport.internal.usecase.f fVar2 = new com.yandex.passport.internal.usecase.f(fVar.a, fVar.b, l, fVar.c);
                    vVar.l = 1;
                    obj2 = this.j.g(fVar2, vVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.ebs.f fVar3 = (com.yandex.passport.common.ebs.f) obj;
                    boolean z = fVar3.a;
                    boolean z2 = fVar3.b;
                    if (z && z2) {
                        com.yandex.passport.common.core.f fVar4 = fVar.a;
                        String str = fVar.b;
                        String l2 = l();
                        com.yandex.passport.internal.report.reporters.v vVar2 = this.k;
                        vVar2.getClass();
                        fVar4.getClass();
                        str.getClass();
                        vVar2.n(a4.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar4.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(l2, 13));
                        a(new f0(-1));
                    } else if (z && !z2) {
                        i(this, m1.d);
                    } else if (z || !z2) {
                        m1 m1Var2 = m1.r;
                        i0 i0Var2 = l1.a;
                        q(m1Var2, "FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE");
                    } else {
                        m1 m1Var3 = m1.r;
                        i0 i0Var3 = l1.a;
                        q(m1Var3, "FACE_RECOGNIZED_IS_FALSE");
                    }
                }
                a = z7o.a(obj);
                if (a != null) {
                    m(m1.r, a);
                }
                return Unit.a;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj22 = vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vVar.l;
        f fVar5 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    public final String l() {
        return ((s0) h()).d;
    }

    public final void m(m1 m1Var, Throwable th) {
        String name;
        if (th instanceof com.yandex.passport.common.exception.a) {
            n(null);
            a(new f0(NetworkRequestException.EXPIRED_SIGNATURE));
            return;
        }
        if (th instanceof com.yandex.passport.data.exceptions.f) {
            List list = ((com.yandex.passport.data.exceptions.f) th).a;
            Set set = com.yandex.passport.data.exceptions.g.a;
            list.getClass();
            name = CollectionsKt.X(list, StringUtils.COMMA, null, null, null, 62);
        } else {
            l1.a.getClass();
            name = i0.b(th).name();
        }
        q(m1Var, name);
    }

    public final void n(String str) {
        f fVar = this.d;
        com.yandex.passport.common.core.f fVar2 = fVar.a;
        String str2 = fVar.b;
        String l = l();
        com.yandex.passport.internal.report.reporters.v vVar = this.k;
        vVar.getClass();
        fVar2.getClass();
        str2.getClass();
        vVar.n(g3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str2, 8), new ff(l, 13), new com.yandex.passport.internal.report.a(str, 27));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(3:25|12|13)(2:26|(2:28|21)))|19))|30|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (p(r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r8 = com.yandex.passport.internal.ui.sloth.ebs.m1.t;
        r0 = com.yandex.passport.internal.ui.sloth.ebs.l1.a;
        q(r8, "RETRYING_TRACK_ID_INIT_REQUEST_FAILED");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(cg6 cg6Var) {
        w wVar;
        int i;
        int i2;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i3 = wVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wVar.m = i3 - Integer.MIN_VALUE;
                Object obj = wVar.k;
                Object obj2 = nm6.a;
                i = wVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = ((s0) h()).b;
                    List list = j0.k;
                    if (i2 >= list.size()) {
                        i(this, m1.h);
                        return Unit.a;
                    }
                    long X = fxf.X(((Number) list.get(i2)).intValue(), 0);
                    wVar.j = i2;
                    wVar.m = 1;
                    if (y2x.o(X, wVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = wVar.j;
                    qgg.h0(obj);
                }
                a(c0.a);
                wVar.j = i2;
                wVar.m = 2;
            }
        }
        wVar = new w(this, cg6Var);
        Object obj3 = wVar.k;
        Object obj22 = nm6.a;
        i = wVar.m;
        if (i != 0) {
        }
        a(c0.a);
        wVar.j = i2;
        wVar.m = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(cg6 cg6Var) {
        x xVar;
        int i;
        Object obj;
        Throwable a;
        String uuid;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = xVar.j;
                nm6 nm6Var = nm6.a;
                i = xVar.l;
                f fVar = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.usecase.c cVar = new com.yandex.passport.internal.usecase.c(((s0) h()).b, fVar.a, fVar.c, fVar.b);
                    xVar.l = 1;
                    obj2 = this.f.g(cVar, xVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.ebs.q qVar = (com.yandex.passport.common.ebs.q) obj;
                    if (qVar instanceof com.yandex.passport.common.ebs.o) {
                        a(new g0(((com.yandex.passport.common.ebs.o) qVar).a));
                        Context context = this.c;
                        try {
                            context.getClass();
                            uuid = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            uuid.getClass();
                        } catch (Exception unused) {
                            uuid = AppMetricaYandex.getUuid(context);
                        }
                        if (uuid != null) {
                            String string = ((SharedPreferences) this.i.b.getValue()).getString("install_id", null);
                            boolean d = Intrinsics.d(string, uuid);
                            com.yandex.passport.common.core.f fVar2 = fVar.a;
                            String l = l();
                            String str = fVar.b;
                            com.yandex.passport.internal.report.reporters.v vVar = this.k;
                            vVar.getClass();
                            fVar2.getClass();
                            str.getClass();
                            vVar.n(h3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(l, 13), new com.yandex.passport.internal.report.f(19, !d), new com.yandex.passport.internal.report.a(string, 15), new com.yandex.passport.internal.report.a(uuid, 21, false));
                            if (d) {
                                e(r.a);
                            } else {
                                i(this, m1.i);
                            }
                        } else {
                            m1 m1Var = m1.t;
                            i0 i0Var = l1.a;
                            q(m1Var, "INSTALL_ID_IS_NULL");
                        }
                    } else if (Intrinsics.d(qVar, com.yandex.passport.common.ebs.p.a)) {
                        i(this, m1.d);
                    } else if (Intrinsics.d(qVar, com.yandex.passport.common.ebs.m.a)) {
                        i(this, m1.f);
                    } else if (Intrinsics.d(qVar, com.yandex.passport.common.ebs.l.a)) {
                        i(this, m1.e);
                    } else {
                        if (!Intrinsics.d(qVar, com.yandex.passport.common.ebs.n.a)) {
                            b6e.s();
                            return null;
                        }
                        i(this, m1.g);
                    }
                }
                a = z7o.a(obj);
                if (a != null) {
                    m(m1.o, a);
                }
                return Unit.a;
            }
        }
        xVar = new x(this, cg6Var);
        Object obj22 = xVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xVar.l;
        f fVar3 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    public final void q(m1 m1Var, String str) {
        j(new j1(m1Var, str), t.AM);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(cg6 cg6Var) {
        y yVar;
        int i;
        String uuid;
        Object obj;
        Throwable a;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = yVar.j;
                nm6 nm6Var = nm6.a;
                i = yVar.l;
                f fVar = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    Context context = this.c;
                    try {
                        context.getClass();
                        uuid = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        uuid.getClass();
                    } catch (Exception unused) {
                        uuid = AppMetricaYandex.getUuid(context);
                    }
                    if (uuid == null) {
                        m1 m1Var = m1.t;
                        i0 i0Var = l1.a;
                        q(m1Var, "INSTALL_ID_IS_NULL");
                        return Unit.a;
                    }
                    p1 p1Var = new p1(fVar.a, fVar.b, l(), uuid);
                    yVar.l = 1;
                    obj2 = this.g.g(p1Var, yVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.core.f fVar2 = fVar.a;
                    String str = fVar.b;
                    String l = l();
                    com.yandex.passport.internal.report.reporters.v vVar = this.k;
                    vVar.getClass();
                    fVar2.getClass();
                    str.getClass();
                    vVar.n(u2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(l, 13));
                    g(new p0((com.yandex.passport.common.core.d) obj));
                }
                a = z7o.a(obj);
                if (a != null) {
                    m(m1.p, a);
                }
                return Unit.a;
            }
        }
        yVar = new y(this, cg6Var);
        Object obj22 = yVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yVar.l;
        f fVar3 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(cg6 cg6Var) {
        z zVar;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof z) {
            zVar = (z) cg6Var;
            int i2 = zVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = zVar.j;
                nm6 nm6Var = nm6.a;
                i = zVar.l;
                f fVar = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (etn.z(this.c, "android.permission.CAMERA") != 0) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Camera permission request for Biometric Verification", 8);
                        }
                        g(k0.a);
                        return Unit.a;
                    }
                    String l = l();
                    if (l == null) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Track id is null when start biometric session", 8);
                        }
                        m1 m1Var = m1.t;
                        i0 i0Var = l1.a;
                        q(m1Var, "TRACK_ID_IS_NULL");
                        return Unit.a;
                    }
                    g2 g2Var = new g2(fVar.a, fVar.b, l, fVar.c);
                    zVar.l = 1;
                    obj2 = this.h.g(g2Var, zVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.common.ebs.a aVar = (com.yandex.passport.common.ebs.a) obj;
                    com.yandex.passport.common.core.f fVar2 = fVar.a;
                    String str = fVar.b;
                    String l2 = l();
                    String str2 = aVar.f;
                    String str3 = aVar.g;
                    com.yandex.passport.internal.report.reporters.v vVar = this.k;
                    vVar.getClass();
                    fVar2.getClass();
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    vVar.n(y2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(l2, 13), new com.yandex.passport.internal.report.f(str2, 1), new ve(str3, 27));
                    g(new o0(aVar));
                }
                a = z7o.a(obj);
                if (a != null) {
                    m(m1.q, a);
                }
                return Unit.a;
            }
        }
        zVar = new z(this, cg6Var);
        Object obj22 = zVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zVar.l;
        f fVar3 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }
}
