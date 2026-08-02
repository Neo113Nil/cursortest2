package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.metrica.utils.z;
import defpackage.cdk;
import defpackage.gdk;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.a A;
    public final com.yandex.plus.pay.internal.g B;
    public final q C;
    public final String a;
    public final String b;
    public final String c;
    public final Context d;
    public final com.yandex.plus.core.strings.a e;
    public final com.yandex.plus.core.config.a f;
    public final com.yandex.plus.domain.auth.impl.i g;
    public final com.yandex.plus.pay.ui.design.api.api.a h;
    public final com.yandex.plus.core.locale.a i;
    public final com.yandex.plus.core.location.a j;
    public final com.yandex.plus.metrica.utils.i k;
    public final com.yandex.plus.pay.log.impl.b l;
    public final com.yandex.plus.pay.reporter.api.f m;
    public final com.yandex.plus.experiments.impl.providers.h n;
    public final com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f o;
    public final z p;
    public final com.yandex.plus.core.dispatcher.b q;
    public final com.yandex.plus.core.imageloader.b r;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a s;
    public final com.yandex.plus.pay.ui.core.internal.common.f t;
    public final com.yandex.plus.paymentsdk.internal.method.e u;
    public final y v;
    public final com.yandex.plus.pay.ui.core.internal.di.g w;
    public final x x;
    public final cdk y;
    public final gdk z;

    public b(String str, String str2, String str3, Context context, com.yandex.plus.core.strings.a aVar, com.yandex.plus.core.config.a aVar2, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.pay.ui.design.api.api.a aVar3, com.yandex.plus.core.locale.a aVar4, com.yandex.plus.core.location.a aVar5, com.yandex.plus.metrica.utils.i iVar2, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.reporter.api.f fVar, com.yandex.plus.experiments.impl.providers.h hVar, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar2, z zVar, com.yandex.plus.core.dispatcher.b bVar2, com.yandex.plus.core.imageloader.b bVar3, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar6, com.yandex.plus.pay.ui.core.internal.common.f fVar3, com.yandex.plus.paymentsdk.internal.method.e eVar, y yVar, com.yandex.plus.pay.ui.core.internal.di.g gVar, x xVar, cdk cdkVar, gdk gdkVar, com.yandex.plus.pay.a aVar7, com.yandex.plus.pay.internal.g gVar2, q qVar) {
        str.getClass();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        iVar2.getClass();
        bVar.getClass();
        fVar.getClass();
        hVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        fVar3.getClass();
        eVar.getClass();
        gVar.getClass();
        cdkVar.getClass();
        gdkVar.getClass();
        aVar7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = context;
        this.e = aVar;
        this.f = aVar2;
        this.g = iVar;
        this.h = aVar3;
        this.i = aVar4;
        this.j = aVar5;
        this.k = iVar2;
        this.l = bVar;
        this.m = fVar;
        this.n = hVar;
        this.o = fVar2;
        this.p = zVar;
        this.q = bVar2;
        this.r = bVar3;
        this.s = aVar6;
        this.t = fVar3;
        this.u = eVar;
        this.v = yVar;
        this.w = gVar;
        this.x = xVar;
        this.y = cdkVar;
        this.z = gdkVar;
        this.A = aVar7;
        this.B = gVar2;
        this.C = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && Intrinsics.d(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g.equals(bVar.g) && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i) && this.j.equals(bVar.j) && Intrinsics.d(this.k, bVar.k) && Intrinsics.d(this.l, bVar.l) && Intrinsics.d(this.m, bVar.m) && Intrinsics.d(this.n, bVar.n) && this.o.equals(bVar.o) && Intrinsics.d(this.p, bVar.p) && Intrinsics.d(this.q, bVar.q) && Intrinsics.d(this.r, bVar.r) && this.s.equals(bVar.s) && Intrinsics.d(this.t, bVar.t) && Intrinsics.d(this.u, bVar.u) && this.v.equals(bVar.v) && Intrinsics.d(this.w, bVar.w) && this.x.equals(bVar.x) && Intrinsics.d(this.y, bVar.y) && Intrinsics.d(this.z, bVar.z) && Intrinsics.d(this.A, bVar.A) && this.B.equals(bVar.B) && this.C.equals(bVar.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31) + 1986582804) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExternalModule(serviceName=" + this.a + ", clientAppPackage=" + this.b + ", clientAppVersion=" + this.c + ", sdkVersion=110.0.0, context=" + this.d + ", brandType=" + this.e + ", environment=" + this.f + ", authSession=" + this.g + ", designSystem=" + this.h + ", localeProvider=" + this.i + ", locationProvider=" + this.j + ", metricaIdsProvider=" + this.k + ", logger=" + this.l + ", reporter=" + this.m + ", experimentsRepository=" + this.n + ", featureFlags=" + this.o + ", sessionControllerProvider=" + this.p + ", dispatchersProvider=" + this.q + ", imageLoader=" + this.r + ", stringsProvider=" + this.s + ", userStateProvider=" + this.t + ", paymentMethodsFacade=" + this.u + ", urlLauncher=" + this.v + ", sslErrorResolverFactory=" + this.w + ", benchmarker=" + this.x + ", evgenAnalytics=" + this.y + ", evgenDiagnostic=" + this.z + ", plusPay=" + this.A + ", plusPayInternal=" + this.B + ", contentScaleFactorProvider=" + this.C + ')';
    }
}
