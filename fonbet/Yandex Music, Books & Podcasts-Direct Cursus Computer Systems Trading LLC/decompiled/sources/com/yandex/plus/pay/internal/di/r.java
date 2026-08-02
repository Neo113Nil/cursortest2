package com.yandex.plus.pay.internal.di;

import android.content.Context;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.metrica.utils.z;
import defpackage.buu;
import defpackage.jk6;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {
    public final com.yandex.plus.pay.log.impl.b A;
    public final com.yandex.plus.pay.reporter.api.f B;
    public final jk6 C;
    public final jk6 D;
    public final jk6 E;
    public final com.yandex.plus.pay.inapp.api.b F;
    public final buu G;
    public final t H;
    public final t I;
    public final t J;
    public final jk6 K;
    public final com.yandex.plus.metrica.utils.n L;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final com.yandex.plus.core.strings.a h;
    public final String i;
    public final String j;
    public final Long k;
    public final Context l;
    public final com.yandex.plus.core.locale.a m;
    public final com.yandex.plus.domain.auth.impl.i n;
    public final com.yandex.plus.core.location.a o;
    public final com.yandex.plus.core.config.b p;
    public final com.yandex.plus.core.dispatcher.b q;
    public final com.yandex.plus.metrica.api.b r;
    public final com.yandex.plus.metrica.utils.i s;
    public final z t;
    public final z u;
    public final com.yandex.plus.pay.internal.common.e v;
    public final x0 w;
    public final com.yandex.plus.metrica.utils.n x;
    public final x y;
    public final jk6 z;

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, com.yandex.plus.core.strings.a aVar, String str8, String str9, Long l, Context context, com.yandex.plus.core.locale.a aVar2, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.core.location.a aVar3, com.yandex.plus.core.config.b bVar, com.yandex.plus.core.dispatcher.b bVar2, com.yandex.plus.metrica.api.b bVar3, com.yandex.plus.metrica.utils.i iVar2, z zVar, z zVar2, com.yandex.plus.pay.internal.common.e eVar, x0 x0Var, com.yandex.plus.metrica.utils.n nVar, x xVar, jk6 jk6Var, com.yandex.plus.pay.log.impl.b bVar4, com.yandex.plus.pay.reporter.api.f fVar, jk6 jk6Var2, jk6 jk6Var3, jk6 jk6Var4, com.yandex.plus.pay.inapp.api.b bVar5, buu buuVar, t tVar, t tVar2, t tVar3, jk6 jk6Var5, com.yandex.plus.metrica.utils.n nVar2) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        aVar.getClass();
        context.getClass();
        aVar2.getClass();
        bVar2.getClass();
        bVar3.getClass();
        iVar2.getClass();
        zVar.getClass();
        zVar2.getClass();
        bVar4.getClass();
        fVar.getClass();
        bVar5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = aVar;
        this.i = str8;
        this.j = str9;
        this.k = l;
        this.l = context;
        this.m = aVar2;
        this.n = iVar;
        this.o = aVar3;
        this.p = bVar;
        this.q = bVar2;
        this.r = bVar3;
        this.s = iVar2;
        this.t = zVar;
        this.u = zVar2;
        this.v = eVar;
        this.w = x0Var;
        this.x = nVar;
        this.y = xVar;
        this.z = jk6Var;
        this.A = bVar4;
        this.B = fVar;
        this.C = jk6Var2;
        this.D = jk6Var3;
        this.E = jk6Var4;
        this.F = bVar5;
        this.G = buuVar;
        this.H = tVar;
        this.I = tVar2;
        this.J = tVar3;
        this.K = jk6Var5;
        this.L = nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && this.b.equals(rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && Intrinsics.d(this.e, rVar.e) && Intrinsics.d(this.f, rVar.f) && Intrinsics.d(this.g, rVar.g) && this.h == rVar.h && this.i.equals(rVar.i) && this.j.equals(rVar.j) && Intrinsics.d(this.k, rVar.k) && Intrinsics.d(this.l, rVar.l) && Intrinsics.d(this.m, rVar.m) && this.n.equals(rVar.n) && this.o.equals(rVar.o) && this.p.equals(rVar.p) && Intrinsics.d(this.q, rVar.q) && Intrinsics.d(this.r, rVar.r) && Intrinsics.d(this.s, rVar.s) && Intrinsics.d(this.t, rVar.t) && Intrinsics.d(this.u, rVar.u) && this.v.equals(rVar.v) && this.w.equals(rVar.w) && this.x.equals(rVar.x) && this.y.equals(rVar.y) && this.z.equals(rVar.z) && Intrinsics.d(this.A, rVar.A) && Intrinsics.d(this.B, rVar.B) && this.C.equals(rVar.C) && this.D.equals(rVar.D) && this.E.equals(rVar.E) && Intrinsics.d(this.F, rVar.F) && this.G.equals(rVar.G) && this.H.equals(rVar.H) && this.I.equals(rVar.I) && this.J.equals(rVar.J) && this.K.equals(rVar.K) && this.L.equals(rVar.L);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = k5r.c(k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (c2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int c3 = k5r.c(k5r.c((this.h.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.i), 31, this.j);
        Long l = this.k;
        return this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((((c3 + (l != null ? l.hashCode() : 0)) * 31) + 1986582804) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlusPayInternalDependenciesImpl(serviceName=" + this.a + ", subServiceName=" + this.b + ", serviceChannel=" + this.c + ", clientSource=" + this.d + ", clientSubSource=" + this.e + ", clid=" + this.f + ", appDistribution=" + this.g + ", brandType=" + this.h + ", packageName=" + this.i + ", appVersionName=" + this.j + ", appVersionCode=" + this.k + ", sdkVersion=110.0.0, testIdsOverride=null, context=" + this.l + ", localeProvider=" + this.m + ", globalAuthSession=" + this.n + ", geoLocationProvider=" + this.o + ", environmentProvider=" + this.p + ", dispatchersProvider=" + this.q + ", metricaProvider=" + this.r + ", metricaIdsProvider=" + this.s + ", metricaUserConsumerProvider=" + this.t + ", metricaSessionControllerProvider=" + this.u + ", metricaReporterProviders=" + this.v + ", isMetricaLogsEnabled=" + this.w + ", isBenchmarksNeeded=" + this.x + ", benchmarker=" + this.y + ", getOkHttpClient=" + this.z + ", logger=" + this.A + ", reporter=" + this.B + ", getExperimentsRepository=" + this.C + ", getDwhAnalyticsReporter=" + this.D + ", getOriginProvider=" + this.E + ", inAppPaymentFacade=" + this.F + ", getGooglePlayBillingConfig=" + this.G + ", getAnalyticsGlobalParams=" + this.H + ", getOffersAnalyticsGlobalParams=" + this.I + ", getOffersAnalyticsPlatformParams=" + this.J + ", getResetCacheInteractor=" + this.K + ", getBduiGatewayHostProvider=" + this.L + ')';
    }
}
