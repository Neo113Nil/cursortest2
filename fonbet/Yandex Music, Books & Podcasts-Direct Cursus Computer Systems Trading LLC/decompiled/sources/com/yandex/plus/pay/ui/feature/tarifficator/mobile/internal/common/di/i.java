package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import android.content.Context;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import defpackage.btf;
import defpackage.cdk;
import defpackage.cl4;
import defpackage.gdk;
import defpackage.i5f;
import defpackage.jyr;
import defpackage.quj;
import defpackage.rb5;
import defpackage.u75;
import defpackage.x3f;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i {
    public final jyr A;
    public final jyr A0;
    public final jyr B;
    public final jyr B0;
    public final jyr C;
    public final jyr C0;
    public final jyr D;
    public final jyr D0;
    public final jyr E;
    public final jyr E0;
    public final jyr F;
    public final jyr F0;
    public final jyr G;
    public final jyr G0;
    public final jyr H;
    public final jyr H0;
    public final jyr I;
    public final jyr I0;
    public final jyr J;
    public final jyr J0;
    public final jyr K;
    public final jyr K0;
    public final jyr L;
    public final jyr L0;
    public final jyr M;
    public final jyr N;
    public final jyr O;
    public final jyr P;
    public final jyr Q;
    public final jyr R;
    public final jyr S;
    public final jyr T;
    public final jyr U;
    public final jyr V;
    public final jyr W;
    public final jyr X;
    public final jyr Y;
    public final jyr Z;
    public final com.yandex.passport.internal.entities.j a;
    public final jyr a0;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d b;
    public final jyr b0;
    public final String c;
    public final jyr c0;
    public final String d;
    public final jyr d0;
    public final com.yandex.plus.core.strings.a e;
    public final jyr e0;
    public final com.yandex.plus.core.config.a f;
    public final jyr f0;
    public final com.yandex.plus.pay.log.impl.b g;
    public final jyr g0;
    public final com.yandex.plus.pay.reporter.api.f h;
    public final jyr h0;
    public final com.yandex.plus.core.dispatcher.b i;
    public final jyr i0;
    public final com.yandex.plus.core.imageloader.b j;
    public final jyr j0;
    public final com.yandex.plus.domain.auth.impl.i k;
    public final jyr k0;
    public final com.yandex.plus.core.locale.a l;
    public final jyr l0;
    public final com.yandex.plus.core.location.a m;
    public final jyr m0;
    public final com.yandex.plus.metrica.utils.i n;
    public final jyr n0;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a o;
    public final jyr o0;
    public final com.yandex.plus.pay.ui.core.internal.common.f p;
    public final jyr p0;
    public final com.yandex.plus.pay.ui.design.api.api.a q;
    public final jyr q0;
    public final com.yandex.plus.paymentsdk.internal.method.e r;
    public final jyr r0;
    public final y s;
    public final jyr s0;
    public final com.yandex.plus.pay.ui.core.internal.di.g t;
    public final jyr t0;
    public final x u;
    public final jyr u0;
    public final com.yandex.plus.pay.a v;
    public final jyr v0;
    public final com.yandex.plus.pay.internal.g w;
    public final jyr w0;
    public final com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f x;
    public final jyr x0;
    public final com.yandex.plus.experiments.impl.providers.h y;
    public final jyr y0;
    public final i5f z;
    public final jyr z0;

    public i(com.yandex.passport.internal.entities.j jVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar, String str, String str2, Context context, com.yandex.plus.core.strings.a aVar, com.yandex.plus.core.config.a aVar2, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.reporter.api.f fVar, com.yandex.plus.core.dispatcher.b bVar2, com.yandex.plus.core.imageloader.b bVar3, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.core.locale.a aVar3, com.yandex.plus.core.location.a aVar4, com.yandex.plus.metrica.utils.i iVar2, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5, com.yandex.plus.pay.ui.core.internal.common.f fVar2, com.yandex.plus.pay.ui.design.api.api.a aVar6, com.yandex.plus.paymentsdk.internal.method.e eVar, y yVar, com.yandex.plus.pay.ui.core.internal.di.g gVar, x xVar, com.yandex.plus.pay.a aVar7, com.yandex.plus.pay.internal.g gVar2, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar3, com.yandex.plus.experiments.impl.providers.h hVar) {
        str.getClass();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        fVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        aVar3.getClass();
        iVar2.getClass();
        fVar2.getClass();
        aVar6.getClass();
        eVar.getClass();
        gVar.getClass();
        aVar7.getClass();
        hVar.getClass();
        this.a = jVar;
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = aVar;
        this.f = aVar2;
        this.g = bVar;
        this.h = fVar;
        this.i = bVar2;
        this.j = bVar3;
        this.k = iVar;
        this.l = aVar3;
        this.m = aVar4;
        this.n = iVar2;
        this.o = aVar5;
        this.p = fVar2;
        this.q = aVar6;
        this.r = eVar;
        this.s = yVar;
        this.t = gVar;
        this.u = xVar;
        this.v = aVar7;
        this.w = gVar2;
        this.x = fVar3;
        this.y = hVar;
        this.z = quj.r(x3f.d, new com.yandex.plus.pay.ui.common.internal.error.content.b(14));
        this.A = btf.b(new com.yandex.plus.pay.internal.model.a(24));
        final int i = 11;
        this.B = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                i iVar3 = this.b;
                switch (i2) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i2 = 23;
        this.C = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        this.D = btf.b(new x0(context, 6));
        this.E = btf.b(new f(this, 16));
        this.F = btf.b(new f(this, 22));
        this.G = btf.b(new f(this, 23));
        this.H = btf.b(new f(this, 24));
        this.I = btf.b(new f(this, 25));
        final int i3 = 8;
        this.J = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i4 = 19;
        this.K = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        this.L = btf.b(new f(this, 0));
        this.M = btf.b(new f(this, 10));
        this.N = btf.b(new f(this, 20));
        this.O = btf.b(new f(this, 27));
        this.P = btf.b(new f(this, 28));
        this.Q = btf.b(new f(this, 29));
        final int i5 = 0;
        this.R = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.g
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        i iVar3 = this.b;
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a(iVar3.c(), (cdk) iVar3.a.a);
                    default:
                        i iVar4 = this.b;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.e(iVar4.a().a(), iVar4.c(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar4.q).a);
                }
            }
        });
        this.S = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i6 = 1;
        this.T = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i7 = 2;
        this.U = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i8 = 3;
        this.V = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i9 = 4;
        this.W = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i10 = 5;
        this.X = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i10;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        this.Y = btf.b(new com.yandex.plus.pay.internal.model.a(25));
        final int i11 = 6;
        this.Z = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i11;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i12 = 7;
        this.a0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i12;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i13 = 9;
        this.b0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i13;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i14 = 10;
        this.c0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i14;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i15 = 12;
        this.d0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i15;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i16 = 13;
        this.e0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i16;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i17 = 14;
        this.f0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i17;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i18 = 15;
        this.g0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i18;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i19 = 16;
        this.h0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i19;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i20 = 17;
        this.i0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i20;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i21 = 18;
        this.j0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                i iVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i22 = 20;
        this.k0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i23 = 21;
        this.l0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i23;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i24 = 22;
        this.m0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i24;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i25 = 24;
        this.n0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i25;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i26 = 25;
        this.o0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i26;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i27 = 26;
        this.p0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i27;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i28 = 27;
        this.q0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i28;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i29 = 28;
        this.r0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.e
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i29;
                i iVar3 = this.b;
                switch (i222) {
                    case 0:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.f((gdk) iVar3.a.b);
                    case 1:
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar3.X.getValue()).a("family");
                    case 2:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.success.b(iVar3.c(), (cdk) iVar3.a.a, iVar3.w.f().f);
                    case 3:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e((cdk) iVar3.a.a, iVar3.w.f().a);
                    case 4:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b((cdk) iVar3.a.a, iVar3.w.f().g);
                    case 5:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g((gdk) iVar3.a.b, 1);
                    case 6:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c(iVar3.w, iVar3.g);
                    case 7:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c(iVar3.w, iVar3.a(), iVar3.b(), (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b) iVar3.L.getValue(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.g);
                    case 8:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b(iVar3.b.c, (cdk) iVar3.a.a, iVar3.w.f().a);
                    case 9:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.family.c(iVar3.w, (com.yandex.plus.pay.ui.webview.family.domain.a) iVar3.K.getValue(), iVar3.g);
                    case 10:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.b(iVar3.d, iVar3.c, iVar3.a(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar3.q).a, iVar3.l, iVar3.m, iVar3.n);
                    case 11:
                        return (rb5) ((cl4) iVar3.A.getValue()).a.a;
                    case 12:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a(iVar3.c());
                    case 13:
                        return new com.yandex.plus.pay.ui.core.mobile.domain.b(iVar3.p);
                    case 14:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h(iVar3.l, iVar3.d(), iVar3.f(), new k(0, iVar3.x, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isYbPromoEnabled", "isYbPromoEnabled()Z", 0, 10));
                    case 15:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.f(iVar3.b);
                    case 16:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c(iVar3.w, iVar3.g);
                    case 17:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g(iVar3.e());
                    case 18:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i(iVar3.g);
                    case 19:
                        com.yandex.passport.internal.entities.j jVar2 = iVar3.a;
                        return new com.yandex.plus.pay.ui.webview.family.domain.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b) ((jyr) jVar2.d).getValue(), (cdk) jVar2.a);
                    case 20:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e(iVar3.w, iVar3.g);
                    case 21:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h(iVar3.w, iVar3.g);
                    case 22:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c(iVar3.s, iVar3.e(), iVar3.g);
                    case 23:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a(((cl4) iVar3.A.getValue()).a);
                    case 24:
                        com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f fVar4 = iVar3.x;
                        return u75.h(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.e(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isTopupYbCardOnCheckoutEnabled", "isTopupYbCardOnCheckoutEnabled()Z", 0, 13)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.c(iVar3.r, new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isSbpForSubscriptionsEnabled", "isSbpForSubscriptionsEnabled()Z", 0, 14), new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "isNewYbCardOnCheckoutEnabled", "isNewYbCardOnCheckoutEnabled()Z", 0, 15)), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.d(new k(0, fVar4, com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.f.class, "areOnsalesEnabled", "areOnsalesEnabled()Z", 0, 16)), new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.h(iVar3.c()));
                    case 25:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.c(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 26:
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.f(iVar3.c(), iVar3.w, (List) iVar3.n0.getValue());
                    case 27:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.checkout.c) iVar3.Z.getValue());
                    default:
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d(iVar3.a(), iVar3.r, iVar3.g, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.h) iVar3.I.getValue(), iVar3.k.h);
                }
            }
        });
        final int i30 = 1;
        this.s0 = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.g
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        i iVar3 = this.b;
                        return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a(iVar3.c(), (cdk) iVar3.a.a);
                    default:
                        i iVar4 = this.b;
                        return new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.e(iVar4.a().a(), iVar4.c(), ((com.yandex.plus.pay.ui.design.plus.api.a) iVar4.q).a);
                }
            }
        });
        this.t0 = btf.b(new f(this, i30));
        this.u0 = btf.b(new f(this, 2));
        this.v0 = btf.b(new f(this, 3));
        this.w0 = btf.b(new f(this, 4));
        this.x0 = btf.b(new f(this, 5));
        this.y0 = btf.b(new f(this, 6));
        this.z0 = btf.b(new f(this, 7));
        this.A0 = btf.b(new f(this, 8));
        this.B0 = btf.b(new f(this, 9));
        this.C0 = btf.b(new f(this, 11));
        this.D0 = btf.b(new f(this, 12));
        this.E0 = btf.b(new f(this, 13));
        this.F0 = btf.b(new f(this, 14));
        this.G0 = btf.b(new f(this, 15));
        this.H0 = btf.b(new f(this, 17));
        this.I0 = btf.b(new com.yandex.plus.pay.internal.model.a(26));
        this.J0 = btf.b(new f(this, 18));
        this.K0 = btf.b(new f(this, 19));
        this.L0 = btf.b(new f(this, 21));
    }

    public final com.yandex.plus.pay.ui.common.api.a a() {
        return (com.yandex.plus.pay.ui.common.api.a) this.D.getValue();
    }

    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a b() {
        return (com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a) this.d0.getValue();
    }

    public final com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b c() {
        return (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b) this.Y.getValue();
    }

    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d d() {
        return (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d) this.E.getValue();
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a e() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a) this.C.getValue();
    }

    public final com.yandex.plus.pay.ui.core.api.common.a f() {
        return (com.yandex.plus.pay.ui.core.api.common.a) this.F.getValue();
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a g() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a) this.v0.getValue();
    }
}
