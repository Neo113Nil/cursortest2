package com.yandex.plus.pay.internal;

import android.content.Context;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.metrica.utils.i;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.metrica.utils.z;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import com.yandex.plus.pay.data.mb.dto.c1;
import com.yandex.plus.pay.internal.analytics.tarifficator.o;
import com.yandex.plus.pay.internal.di.l;
import com.yandex.plus.pay.internal.di.r;
import com.yandex.plus.pay.internal.di.t;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.feature.user.h;
import defpackage.btf;
import defpackage.buu;
import defpackage.cg6;
import defpackage.f8m;
import defpackage.g8m;
import defpackage.ie5;
import defpackage.jk6;
import defpackage.joj;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class g implements com.yandex.plus.pay.a {
    public final jyr a;
    public final u b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;

    public g(String str, String str2, String str3, String str4, String str5, com.yandex.plus.core.locale.a aVar, com.yandex.plus.core.config.b bVar, Context context, String str6, String str7, joj jojVar, com.yandex.plus.home.feature.webviews.internal.webview.e eVar, com.yandex.plus.pay.internal.network.d dVar, f8m f8mVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2, com.yandex.plus.home.plaque.animator.internal.utils.a aVar3, com.yandex.plus.core.strings.a aVar4, String str8, com.yandex.plus.metrica.api.b bVar2, i iVar, z zVar, z zVar2, com.yandex.plus.pay.internal.common.e eVar2, g8m g8mVar, com.yandex.plus.domain.auth.impl.i iVar2, x0 x0Var, n nVar, x xVar, tf6 tf6Var, com.yandex.plus.core.dispatcher.b bVar3, long j) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        context.getClass();
        eVar.getClass();
        aVar4.getClass();
        bVar2.getClass();
        iVar.getClass();
        zVar.getClass();
        zVar2.getClass();
        bVar3.getClass();
        this.a = btf.b(new b(this, 0));
        jyr b = btf.b(new c1(27));
        com.yandex.plus.core.featureflags.x xVar2 = new com.yandex.plus.core.featureflags.x(new jk6(0, 21, com.yandex.plus.pay.common.internal.featureflags.b.class, com.yandex.plus.pay.common.internal.featureflags.c.b, "DEFAULT", "getDEFAULT()Lcom/yandex/plus/pay/common/internal/featureflags/PlusPayFlags;"), new com.yandex.passport.sloth.ui.c(14, this));
        int i = 0;
        n nVar2 = new n(i, this, g.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0, 17);
        jk6 jk6Var = new jk6(i, 22, g.class, this, "experimentsRepository", "getExperimentsRepository()Lcom/yandex/plus/experiments/api/providers/PlusExperimentsRepository;");
        com.yandex.plus.core.location.a aVar5 = (com.yandex.plus.core.location.a) b.getValue();
        n nVar3 = new n(i, xVar2, com.yandex.plus.core.featureflags.x.class, "getActualFlags", "getActualFlags()Lcom/yandex/plus/core/featureflags/ResettableFlags;", 0, 18);
        aVar5.getClass();
        com.yandex.plus.pay.internal.di.i iVar3 = new com.yandex.plus.pay.internal.di.i(str, str2, str3, str4, str5, str6, str7, aVar4, str8, context, bVar, tf6Var, aVar, aVar5, f8mVar, jojVar, eVar, bVar3, bVar2, iVar, zVar, zVar2, eVar2, iVar2, x0Var, nVar, xVar, j);
        com.yandex.plus.pay.internal.di.e eVar3 = new com.yandex.plus.pay.internal.di.e(iVar3, str4, str5, nVar2, jk6Var, g8mVar, nVar3);
        l lVar = new l(iVar3, eVar3, dVar, aVar2, aVar3, nVar3);
        ie5 ie5Var = new ie5(iVar3, eVar3, jk6Var);
        com.yandex.plus.pay.internal.di.n nVar4 = new com.yandex.plus.pay.internal.di.n(iVar3, lVar, eVar3, ie5Var, nVar3);
        com.yandex.plus.pay.internal.di.external.a aVar6 = new com.yandex.plus.pay.internal.di.external.a();
        ((com.yandex.plus.core.benchmark.c) xVar).b = new com.yandex.plus.pay.internal.di.a(eVar3, 14);
        this.b = new u(iVar3, eVar3, ie5Var, lVar, nVar4, aVar6);
        com.yandex.plus.pay.internal.analytics.l.a = new c(eVar2, 0);
        com.yandex.plus.bdui.flex.ui.a.k(iVar2.h, tf6Var, (com.yandex.plus.pay.internal.feature.user.listener.c) nVar4.g.getValue());
        com.yandex.plus.bdui.flex.ui.a.k(((com.yandex.plus.core.network.api.interceptors.d) lVar.H.getValue()).a, tf6Var, new e(this, null));
        x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.social.i(this, null, 25), 3);
        this.c = btf.b(new b(this, 1));
        this.d = btf.b(new b(this, 2));
        this.e = btf.b(new d(0, this, xVar));
        this.f = btf.b(new b(this, 3));
        this.g = btf.b(new b(this, 4));
        this.h = btf.b(new b(this, 5));
        this.i = btf.b(new b(this, 6));
        this.j = btf.b(new b(this, 7));
        this.k = btf.b(new b(this, 8));
        btf.b(new b(this, 9));
        btf.b(new b(this, 10));
        this.l = btf.b(new b(str3, this));
        this.m = btf.b(new b(this, 12));
    }

    public final com.yandex.plus.pay.api.analytics.a b() {
        return (com.yandex.plus.pay.api.analytics.a) this.b.b.l.getValue();
    }

    public final r c() {
        u uVar = this.b;
        com.yandex.plus.pay.internal.di.i iVar = uVar.a;
        String str = iVar.a;
        String str2 = iVar.b;
        String str3 = iVar.c;
        String str4 = iVar.d;
        String str5 = iVar.e;
        String str6 = iVar.f;
        String str7 = iVar.g;
        com.yandex.plus.core.strings.a aVar = iVar.h;
        String c = iVar.c();
        String str8 = iVar.i;
        Context context = iVar.j;
        context.getClass();
        Long g = com.yandex.plus.home.common.utils.a.g(context);
        Context context2 = iVar.j;
        com.yandex.plus.core.locale.a b = iVar.b();
        com.yandex.plus.domain.auth.impl.i iVar2 = iVar.w;
        com.yandex.plus.core.location.a aVar2 = iVar.n;
        com.yandex.plus.core.config.b bVar = iVar.k;
        com.yandex.plus.metrica.api.b bVar2 = iVar.r;
        i iVar3 = iVar.s;
        z zVar = iVar.t;
        z zVar2 = iVar.u;
        com.yandex.plus.pay.internal.common.e eVar = iVar.v;
        x0 x0Var = iVar.x;
        n nVar = iVar.y;
        x xVar = iVar.z;
        l lVar = uVar.d;
        jk6 jk6Var = new jk6(0, 23, l.class, lVar, "okHttpClient", "getOkHttpClient()Lokhttp3/OkHttpClient;");
        com.yandex.plus.pay.internal.di.e eVar2 = uVar.b;
        com.yandex.plus.pay.log.impl.b bVar3 = eVar2.e;
        com.yandex.plus.pay.reporter.api.f fVar = (com.yandex.plus.pay.reporter.api.f) eVar2.d.getValue();
        int i = 0;
        return new r(str, str2, str3, str4, str5, str6, str7, aVar, c, str8, g, context2, b, iVar2, aVar2, bVar, iVar.q, bVar2, iVar3, zVar, zVar2, eVar, x0Var, nVar, xVar, jk6Var, bVar3, fVar, new jk6(0, 24, l.class, lVar, "experimentsRepository", "getExperimentsRepository()Lcom/yandex/plus/experiments/api/providers/PlusExperimentsRepository;"), new jk6(i, 25, com.yandex.plus.pay.internal.di.e.class, eVar2, "dwhAnalyticsReporter", "getDwhAnalyticsReporter()Lcom/yandex/plus/analytics/dwh/DwhAnalyticsReporter;"), new jk6(i, 26, com.yandex.plus.pay.internal.di.e.class, eVar2, "originProvider", "getOriginProvider()Lcom/yandex/plus/pay/internal/analytics/OriginProvider;"), lVar.d(), new buu(uVar, null, 6), new t(uVar, 0), new t(uVar, 1), new t(uVar, 2), new jk6(0, 27, com.yandex.plus.pay.internal.di.n.class, uVar.e, "resetCacheInteractor", "getResetCacheInteractor()Lcom/yandex/plus/pay/internal/feature/cache/ResetCacheInteractor;"), new n(0, (com.yandex.plus.pay.internal.network.urls.a) iVar.D.c, com.yandex.plus.pay.internal.network.urls.a.class, "getBduiGatewayHostProvider", "getBduiGatewayHostProvider()Lcom/yandex/plus/core/network/hosts/HostProvider;", 0, 22));
    }

    public final com.yandex.plus.pay.log.impl.b d() {
        return this.b.b.e;
    }

    public final com.yandex.plus.core.user.a e() {
        com.yandex.plus.pay.api.log.a aVar = com.yandex.plus.pay.api.log.b.b;
        com.yandex.plus.pay.log.impl.b.d(d(), aVar, this + ".getSubscriptionStatus()");
        PlusPayUserStatus plusPayUserStatus = (PlusPayUserStatus) ((h) this.b.d.n.getValue()).g.getValue();
        com.yandex.plus.core.user.a aVar2 = plusPayUserStatus == null ? com.yandex.plus.core.user.a.c : plusPayUserStatus.getFeatures().isEmpty() ? com.yandex.plus.core.user.a.a : plusPayUserStatus.hasPlus() ? com.yandex.plus.core.user.a.b : com.yandex.plus.core.user.a.c;
        com.yandex.plus.pay.log.impl.b.d(d(), aVar, this + ".getSubscriptionStatus() = " + aVar2);
        return aVar2;
    }

    public final o f() {
        return (o) this.l.getValue();
    }

    public final com.yandex.plus.pay.api.analytics.tarifficator.e g() {
        return (com.yandex.plus.pay.api.analytics.tarifficator.e) ((jyr) this.b.c.i).getValue();
    }

    public final com.yandex.plus.pay.internal.feature.payment.b h() {
        return (com.yandex.plus.pay.internal.feature.payment.b) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x002b, CancellationException -> 0x002e, wis -> 0x0031, TryCatch #3 {CancellationException -> 0x002e, blocks: (B:12:0x0027, B:13:0x0074, B:15:0x007b, B:18:0x009a, B:30:0x0086, B:31:0x008a, B:33:0x0090, B:47:0x005a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var) {
        f fVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        Throwable th;
        wis e;
        t7o t7oVar;
        Object obj;
        Throwable a;
        Iterable iterable;
        Iterator it;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i2 = fVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = fVar.k;
                    nm6 nm6Var = nm6.a;
                    i = fVar.m;
                    com.yandex.plus.pay.api.log.a aVar = com.yandex.plus.pay.api.log.b.b;
                    boolean z = true;
                    if (i != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.pay.log.impl.b.d(d(), aVar, this + ".hasInAppPaymentsToRestore()");
                        com.yandex.plus.pay.log.impl.b d = d();
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b d2 = this.b.d.d();
                            com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                            fVar.j = d;
                            fVar.m = 1;
                            Object b = d2.b(eVar, fVar);
                            if (b == nm6Var) {
                                return nm6Var;
                            }
                            bVar = d;
                            obj2 = b;
                        } catch (wis e2) {
                            bVar = d;
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            bVar = d;
                            th = th2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = fVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    iterable = (Iterable) obj2;
                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!((com.yandex.plus.pay.inapp.api.f) it.next()).f) {
                                break;
                            }
                        }
                    }
                    z = false;
                    obj = Boolean.valueOf(z);
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool.booleanValue();
                    com.yandex.plus.pay.log.impl.b.d(d(), aVar, this + ".hasInAppPaymentsToRestore() = " + booleanValue);
                    return bool;
                }
            }
            if (i != 0) {
            }
            iterable = (Iterable) obj2;
            if (iterable instanceof Collection) {
            }
            it = iterable.iterator();
            while (it.hasNext()) {
            }
            z = false;
            obj = Boolean.valueOf(z);
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        fVar = new f(this, cg6Var);
        Object obj22 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        com.yandex.plus.pay.api.log.a aVar2 = com.yandex.plus.pay.api.log.b.b;
        boolean z2 = true;
    }
}
