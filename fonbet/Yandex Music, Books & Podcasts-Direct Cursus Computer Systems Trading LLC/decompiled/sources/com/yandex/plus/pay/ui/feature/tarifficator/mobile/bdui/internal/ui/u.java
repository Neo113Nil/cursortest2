package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.content.Context;
import android.os.Bundle;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.controller.f0;
import com.yandex.plus.bdui.plus.checkout.content.controller.j0;
import com.yandex.plus.bdui.plus.checkout.content.controller.n0;
import com.yandex.plus.bdui.plus.checkout.content.controller.u;
import com.yandex.plus.bdui.plus.checkout.content.r;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p3;
import com.yandex.plus.bdui.plus.checkout.content.serializer.x5;
import com.yandex.plus.bdui.w;
import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.aa3;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.bsd;
import defpackage.buu;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.cq4;
import defpackage.dfi;
import defpackage.dzf;
import defpackage.e5b;
import defpackage.ern;
import defpackage.gld;
import defpackage.huw;
import defpackage.i50;
import defpackage.i5f;
import defpackage.jk6;
import defpackage.lub;
import defpackage.m10;
import defpackage.mn7;
import defpackage.mqr;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.npu;
import defpackage.ofr;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.t75;
import defpackage.tah;
import defpackage.tf6;
import defpackage.uah;
import defpackage.v75;
import defpackage.vl1;
import defpackage.x3f;
import defpackage.xq0;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u extends bfu {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k A;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j A0;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k B;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j B0;
    public final String C;
    public final com.yandex.plus.bdui.plus.checkout.g C0;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k D;
    public final com.yandex.plus.core.dispatcher.b D0;
    public final com.yandex.plus.pay.ui.core.internal.di.g E;
    public final com.yandex.plus.log.api.b E0;
    public final com.yandex.plus.core.imageloader.b F;
    public final x3f F0;
    public final com.yandex.plus.domain.auth.impl.i G;
    public final e G0;
    public final com.yandex.plus.paymentsdk.internal.method.e H;
    public final com.yandex.plus.pay.inapp.api.b I;
    public final com.yandex.passport.internal.entities.j J;
    public final Map K;
    public final Map L;
    public final List X;
    public final jk6 Y;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a Z;
    public final com.yandex.plus.bdui.r k;
    public final a l;
    public final n m;
    public final int n;
    public final com.yandex.plus.core.locale.a o;
    public final com.yandex.plus.core.location.a p;
    public final com.yandex.plus.core.strings.a q;
    public final com.yandex.plus.pay.ui.core.api.common.a r;
    public final com.yandex.plus.pay.ui.design.api.api.a s;
    public final y t;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d u;
    public final com.yandex.plus.pay.ui.core.api.domain.a v;
    public final x v0;
    public final com.yandex.plus.metrica.utils.i w;
    public final jk6 w0;
    public final com.yandex.plus.pay.internal.common.e x;
    public final List x0;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k y;
    public final com.yandex.plus.home.feature.webviews.internal.webview.a y0;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k z;
    public final jk6 z0;

    public u(com.yandex.plus.bdui.r rVar, String str, String str2, String str3, String str4, a aVar, n nVar, String str5, int i, com.yandex.plus.core.locale.a aVar2, com.yandex.plus.core.location.a aVar3, com.yandex.plus.core.strings.a aVar4, com.yandex.plus.pay.ui.core.api.common.a aVar5, com.yandex.plus.pay.ui.design.api.api.a aVar6, y yVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.pay.ui.core.api.domain.a aVar7, com.yandex.plus.metrica.utils.i iVar, com.yandex.plus.pay.internal.common.e eVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar3, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar4, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar5, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar6, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar7, com.yandex.plus.home.feature.webviews.internal.webview.a aVar8, String str6, String str7, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar8, com.yandex.plus.pay.ui.core.internal.di.g gVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.domain.auth.impl.i iVar2, com.yandex.plus.paymentsdk.internal.method.e eVar2, com.yandex.plus.pay.inapp.api.b bVar2, com.yandex.passport.internal.entities.j jVar, Map map, Map map2, List list, jk6 jk6Var, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar9, x xVar, jk6 jk6Var2, List list2, com.yandex.plus.home.feature.webviews.internal.webview.a aVar10, jk6 jk6Var3, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar3, com.yandex.plus.bdui.plus.checkout.g gVar2, com.yandex.plus.core.dispatcher.b bVar3, com.yandex.plus.log.api.b bVar4, i5f i5fVar) {
        rVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        dVar.getClass();
        aVar7.getClass();
        iVar.getClass();
        gVar.getClass();
        bVar.getClass();
        eVar2.getClass();
        bVar2.getClass();
        gVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        i5fVar.getClass();
        this.k = rVar;
        this.l = aVar;
        this.m = nVar;
        this.n = i;
        this.o = aVar2;
        this.p = aVar3;
        this.q = aVar4;
        this.r = aVar5;
        this.s = aVar6;
        this.t = yVar;
        this.u = dVar;
        this.v = aVar7;
        this.w = iVar;
        this.x = eVar;
        this.y = kVar4;
        this.z = kVar5;
        this.A = kVar6;
        this.B = kVar7;
        this.C = str6;
        this.D = kVar8;
        this.E = gVar;
        this.F = bVar;
        this.G = iVar2;
        this.H = eVar2;
        this.I = bVar2;
        this.J = jVar;
        this.K = map;
        this.L = map2;
        this.X = list;
        this.Y = jk6Var;
        this.Z = aVar9;
        this.v0 = xVar;
        this.w0 = jk6Var2;
        this.x0 = list2;
        this.y0 = aVar10;
        this.z0 = jk6Var3;
        this.A0 = jVar2;
        this.B0 = jVar3;
        this.C0 = gVar2;
        this.D0 = bVar3;
        this.E0 = bVar4;
        this.F0 = i5fVar;
        this.G0 = new e(str, str2, str3, str4, str5, str6, str7, nVar, aVar3, kVar, kVar2, kVar3, aVar8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0799 A[LOOP:1: B:27:0x0793->B:29:0x0799, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x07f9 A[LOOP:2: B:32:0x07f3->B:34:0x07f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(final TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, int i, Bundle bundle, com.yandex.plus.home.feature.webviews.internal.webview.a aVar, cg6 cg6Var) {
        t tVar;
        int i2;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.bdui.plus.scenario.o oVar;
        com.yandex.plus.bdui.plus.scenario.o oVar2;
        n nVar;
        TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity2;
        Bundle bundle2;
        com.yandex.plus.bdui.plus.scenario.m mVar;
        int i3;
        e eVar;
        com.yandex.plus.bdui.plus.scenario.m mVar2;
        e eVar2;
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        n8g n8gVar;
        Map map;
        Map v;
        TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity3;
        int i4;
        Bundle bundle3;
        com.yandex.plus.bdui.plus.scenario.m mVar3;
        Map d;
        com.yandex.plus.bdui.plus.scenario.m mVar4;
        e eVar3;
        LinkedHashMap g;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e eVar4;
        int a;
        Iterator it;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i5 = tVar.p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tVar.p = i5 - Integer.MIN_VALUE;
                t tVar2 = tVar;
                Object obj = tVar2.n;
                Object obj2 = nm6.a;
                i2 = tVar2.p;
                e eVar5 = this.G0;
                n nVar2 = this.m;
                Continuation continuation = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    final com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) this.Z.invoke();
                    Object value = this.G.h.getValue();
                    com.yandex.plus.domain.auth.api.b bVar2 = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
                    com.yandex.plus.bdui.plus.auth.b bVar3 = bVar2 != null ? new com.yandex.plus.bdui.plus.auth.b(bVar2.a, bVar2.b, bVar2.d) : null;
                    buu buuVar = new buu(this, continuation, 8);
                    ((com.yandex.plus.core.dispatcher.a) this.D0).getClass();
                    final bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                    final com.yandex.plus.log.api.b bVar4 = this.E0;
                    final com.yandex.plus.bdui.plus.auth.a aVar2 = new com.yandex.plus.bdui.plus.auth.a(bVar3, buuVar, bVar4, bsdVar);
                    boolean z = nVar2 instanceof k;
                    k kVar = z ? (k) nVar2 : null;
                    final PlusPayCompositeOffers.Offer offer = (kVar == null || (eVar4 = kVar.a) == null) ? null : eVar4.b;
                    final String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(nVar2.F());
                    final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, this.o, com.yandex.plus.core.locale.a.class, "getLocale", "getLocale()Ljava/util/Locale;", 0, 8);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar3 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, this.p, com.yandex.plus.core.location.a.class, "getGeoLocation", "getGeoLocation()Lcom/yandex/plus/home/api/location/GeoLocation;", 0, 9);
                    final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(0, 2, com.yandex.plus.bdui.plus.auth.a.class, aVar2, "authInfo", "getAuthInfo()Lcom/yandex/plus/bdui/plus/auth/PlusAuthInfo;");
                    q qVar = new q(this);
                    final com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar3 = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(15, this);
                    final com.yandex.plus.pay.ui.webview.paymentwidget.ui.c cVar = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) this.y0.invoke(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j(0, 3, com.yandex.plus.bdui.plus.auth.a.class, aVar2, "authInfo", "getAuthInfo()Lcom/yandex/plus/bdui/plus/auth/PlusAuthInfo;"));
                    final com.yandex.plus.pay.ui.webview.family.ui.c cVar2 = (com.yandex.plus.pay.ui.webview.family.ui.c) this.z0.get();
                    final com.yandex.plus.pay.ui.webview.family.domain.a aVar4 = (com.yandex.plus.pay.ui.webview.family.domain.a) this.A0.get();
                    final com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar5 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.B0.get();
                    mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                    cq4 F = ot0.F(this);
                    o oVar3 = new o(this, 2);
                    com.yandex.plus.bdui.templating.render.a aVar6 = new com.yandex.plus.bdui.templating.render.a(13, this, aVar);
                    com.yandex.plus.bdui.plus.checkout.p pVar2 = (com.yandex.plus.bdui.plus.checkout.p) this.C0;
                    pVar2.getClass();
                    tarifficatorBduiScenarioActivity.getClass();
                    com.yandex.plus.bdui.r rVar = this.k;
                    rVar.getClass();
                    d2.getClass();
                    com.yandex.plus.core.strings.a aVar7 = this.q;
                    aVar7.getClass();
                    final com.yandex.plus.pay.ui.core.api.common.a aVar8 = this.r;
                    aVar8.getClass();
                    final com.yandex.plus.core.imageloader.b bVar5 = this.F;
                    bVar5.getClass();
                    final com.yandex.plus.pay.ui.design.api.api.a aVar9 = this.s;
                    aVar9.getClass();
                    final y yVar = this.t;
                    yVar.getClass();
                    final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = this.u;
                    dVar.getClass();
                    final com.yandex.plus.paymentsdk.internal.method.e eVar6 = this.H;
                    eVar6.getClass();
                    final com.yandex.plus.pay.inapp.api.b bVar6 = this.I;
                    bVar6.getClass();
                    final com.yandex.plus.pay.ui.core.api.domain.a aVar10 = this.v;
                    aVar10.getClass();
                    com.yandex.plus.metrica.utils.i iVar = this.w;
                    iVar.getClass();
                    final com.yandex.plus.pay.ui.core.internal.di.g gVar = this.E;
                    gVar.getClass();
                    cVar2.getClass();
                    aVar4.getClass();
                    aVar5.getClass();
                    com.yandex.plus.pay.internal.common.e eVar7 = this.x;
                    eVar7.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar4 = this.y;
                    kVar4.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar5 = this.z;
                    kVar5.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar6 = this.A;
                    kVar6.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar7 = this.B;
                    kVar7.getClass();
                    x xVar = this.v0;
                    xVar.getClass();
                    jk6 jk6Var = this.w0;
                    jk6Var.getClass();
                    mn7Var.getClass();
                    x3f x3fVar = this.F0;
                    x3fVar.getClass();
                    final Context applicationContext = tarifficatorBduiScenarioActivity.getApplicationContext();
                    final tf6 X = gld.X(F, bsdVar);
                    tf6 X2 = gld.X(F, mn7Var);
                    tf6 e = gld.e(mn7Var);
                    com.yandex.plus.bdui.plus.checkout.n nVar3 = com.yandex.plus.bdui.plus.checkout.n.a;
                    final com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new a1(6));
                    com.yandex.plus.bdui.plus.checkout.action.a aVar11 = new com.yandex.plus.bdui.plus.checkout.action.a();
                    com.yandex.plus.bdui.plus.checkout.m mVar5 = new com.yandex.plus.bdui.plus.checkout.m(aVar8, bVar5, aVar9, yVar, aVar11, bVar4);
                    com.yandex.plus.bdui.flex.factory.e eVar8 = new com.yandex.plus.bdui.flex.factory.e(bVar4, 4);
                    String str = pVar2.d;
                    String str2 = pVar2.a;
                    String str3 = pVar2.b;
                    Long l = pVar2.c;
                    com.yandex.plus.bdui.plus.scenario.p[] pVarArr = com.yandex.plus.bdui.plus.scenario.p.a;
                    com.yandex.plus.bdui.plus.checkout.h hVar = new com.yandex.plus.bdui.plus.checkout.h(0, kVar2);
                    com.yandex.plus.bdui.plus.checkout.h hVar2 = new com.yandex.plus.bdui.plus.checkout.h(1, aVar7);
                    com.yandex.plus.bdui.content.b bVar7 = new com.yandex.plus.bdui.content.b(5, aVar9, applicationContext);
                    applicationContext.getClass();
                    final com.yandex.plus.bdui.plus.checkout.o oVar4 = new com.yandex.plus.bdui.plus.checkout.o();
                    lub lubVar = new lub(pVar, X2, bVar4, applicationContext, yVar, aVar10, X, oVar4);
                    final int i6 = this.n;
                    Function1 function1 = new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            com.yandex.plus.bdui.plus.analytics.c cVar3 = (com.yandex.plus.bdui.plus.analytics.c) obj3;
                            cVar3.getClass();
                            com.yandex.plus.pay.ui.webview.paymentwidget.ui.c cVar4 = cVar;
                            o oVar5 = oVar4;
                            com.yandex.plus.pay.ui.core.api.domain.a aVar12 = aVar10;
                            kotlinx.coroutines.a aVar13 = bsdVar;
                            final y yVar2 = yVar;
                            final com.yandex.plus.log.api.b bVar8 = bVar4;
                            m10 m10Var = new m10(cVar4, oVar5, aVar12, aVar13, yVar2, bVar8, 7);
                            Pair pair5 = new Pair("PlusPaymentWidgetBridge", new com.yandex.plus.bdui.plus.webview.c(m10Var, new com.yandex.plus.bdui.flex.ui.content.c(7)));
                            Pair pair6 = new Pair("PlusCollectContactsBridge", new com.yandex.plus.bdui.plus.webview.c(m10Var, new com.yandex.plus.bdui.flex.ui.content.c(8)));
                            final Context context = applicationContext;
                            String str4 = d2;
                            com.yandex.plus.pay.ui.webview.family.ui.c cVar5 = cVar2;
                            com.yandex.plus.pay.ui.webview.family.domain.a aVar14 = aVar4;
                            com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar15 = aVar5;
                            final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar2 = jVar;
                            Map e2 = uah.e(pair5, pair6, new Pair("PlusFamilyInviteBridge", new com.yandex.plus.bdui.plus.webview.c(new ofr(context, str4, cVar5, aVar14, aVar15, jVar2, bVar8))));
                            com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(e2, bVar8);
                            com.yandex.plus.pay.ui.core.internal.di.g gVar2 = gVar;
                            com.yandex.plus.bdui.plus.auth.a aVar16 = aVar2;
                            com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar17 = aVar3;
                            tf6 tf6Var = X;
                            s sVar = new s(gVar2, aVar16, aVar17, cVar3, aVar13, tf6Var, bVar8);
                            com.yandex.plus.pay.ui.core.api.common.a aVar18 = aVar8;
                            aVar18.getClass();
                            final com.yandex.plus.core.imageloader.b bVar9 = bVar5;
                            bVar9.getClass();
                            final com.yandex.plus.pay.ui.design.api.api.a aVar19 = aVar9;
                            aVar19.getClass();
                            yVar2.getClass();
                            final int i7 = 2;
                            huw huwVar = new huw(aVar18, bVar9, aVar19, yVar2, bVar8, 2);
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            new com.yandex.plus.bdui.content.c(null, null, ern.a(com.yandex.plus.bdui.plus.content.j.class), huwVar, e5bVar);
                            e eVar9 = new e();
                            com.yandex.plus.pay.inapp.api.b bVar10 = bVar6;
                            bVar10.getClass();
                            com.yandex.plus.bdui.content.c cVar6 = new com.yandex.plus.bdui.content.c("GetInAppInfo", new com.yandex.plus.bdui.plus.a(bVar8, 6), ern.a(com.yandex.plus.bdui.plus.checkout.content.k.class), new com.yandex.passport.internal.ui.bouncer.p(15, bVar10, bVar8), e5bVar);
                            final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = dVar;
                            dVar2.getClass();
                            com.yandex.plus.bdui.plus.content.controller.f fVar3 = fVar;
                            com.yandex.plus.bdui.content.c cVar7 = new com.yandex.plus.bdui.content.c("Presale", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 11), ern.a(x5.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.b
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    com.yandex.plus.bdui.s sVar2 = (com.yandex.plus.bdui.s) obj4;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    switch (i7) {
                                        case 0:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new com.yandex.plus.bdui.plus.checkout.content.controller.q(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        case 1:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new u(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        default:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new f0(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                    }
                                }
                            }, e5bVar);
                            com.yandex.plus.bdui.content.c cVar8 = new com.yandex.plus.bdui.content.c("Checkout", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 6), ern.a(com.yandex.plus.bdui.plus.checkout.content.e.class), new vl1(bVar9, aVar19, kVar2, aVar18, dVar2, yVar2, bVar8, 14), e5bVar);
                            final int i8 = 0;
                            com.yandex.plus.bdui.content.c cVar9 = new com.yandex.plus.bdui.content.c("ClosingOffer", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 7), ern.a(com.yandex.plus.bdui.plus.checkout.content.h.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.b
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    com.yandex.plus.bdui.s sVar2 = (com.yandex.plus.bdui.s) obj4;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    switch (i8) {
                                        case 0:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new com.yandex.plus.bdui.plus.checkout.content.controller.q(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        case 1:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new u(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        default:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new f0(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                    }
                                }
                            }, e5bVar);
                            final com.yandex.plus.paymentsdk.internal.method.e eVar10 = eVar6;
                            eVar10.getClass();
                            com.yandex.plus.bdui.plus.a aVar20 = new com.yandex.plus.bdui.plus.a(bVar8, 14);
                            final int i9 = 0;
                            final PlusPayCompositeOffers.Offer offer2 = offer;
                            final int i10 = i6;
                            com.yandex.plus.bdui.content.c cVar10 = new com.yandex.plus.bdui.content.c("UserAddNewCard", aVar20, ern.a(r.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.q
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i11 = i9;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    ((com.yandex.plus.bdui.s) obj4).getClass();
                                    mVar6.getClass();
                                    switch (i11) {
                                        case 0:
                                            PlusPayCompositeOffers.Offer offer3 = offer2;
                                            return new n0(mVar6, context, offer3 != null ? com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(offer3) : null, i10, eVar10, jVar2, bVar8, 0);
                                        default:
                                            PlusPayCompositeOffers.Offer offer4 = offer2;
                                            return new n0(mVar6, context, offer4 != null ? com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(offer4) : null, i10, eVar10, jVar2, bVar8, 1);
                                    }
                                }
                            }, e5bVar);
                            final int i11 = 1;
                            com.yandex.plus.bdui.content.c cVar11 = new com.yandex.plus.bdui.content.c("UserAddNewSBP", new com.yandex.plus.bdui.plus.a(bVar8, 15), ern.a(com.yandex.plus.bdui.plus.checkout.content.s.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.q
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i112 = i11;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    ((com.yandex.plus.bdui.s) obj4).getClass();
                                    mVar6.getClass();
                                    switch (i112) {
                                        case 0:
                                            PlusPayCompositeOffers.Offer offer3 = offer2;
                                            return new n0(mVar6, context, offer3 != null ? com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(offer3) : null, i10, eVar10, jVar2, bVar8, 0);
                                        default:
                                            PlusPayCompositeOffers.Offer offer4 = offer2;
                                            return new n0(mVar6, context, offer4 != null ? com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(offer4) : null, i10, eVar10, jVar2, bVar8, 1);
                                    }
                                }
                            }, e5bVar);
                            com.yandex.plus.bdui.content.c cVar12 = new com.yandex.plus.bdui.content.c("GooglePlayPurchase", new com.yandex.plus.bdui.plus.a(bVar8, 12), ern.a(com.yandex.plus.bdui.plus.checkout.content.o.class), new npu(i10, pVar, bVar8), e5bVar);
                            com.yandex.plus.bdui.content.c cVar13 = new com.yandex.plus.bdui.content.c("WaitingForPayment", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 10), ern.a(com.yandex.plus.bdui.plus.checkout.content.l.class), new com.yandex.plus.bdui.plus.a(bVar8, 11), e5bVar);
                            com.yandex.plus.bdui.content.c cVar14 = new com.yandex.plus.bdui.content.c("Upsale", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 13), ern.a(com.yandex.plus.bdui.plus.checkout.content.q.class), new mqr(bVar9, dVar2, yVar2, bVar8, 20), e5bVar);
                            com.yandex.plus.bdui.plus.b bVar11 = new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 12);
                            final int i12 = 1;
                            com.yandex.plus.bdui.content.c cVar15 = new com.yandex.plus.bdui.content.c("CheckoutSuccess", bVar11, ern.a(com.yandex.plus.bdui.plus.checkout.content.p.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.a
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    com.yandex.plus.bdui.s sVar2 = (com.yandex.plus.bdui.s) obj4;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    switch (i12) {
                                        case 0:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new com.yandex.plus.bdui.plus.checkout.content.controller.d(mVar6, bVar9, aVar19, bVar8);
                                        default:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new j0(mVar6, bVar9, aVar19, bVar8);
                                    }
                                }
                            }, e5bVar);
                            final int i13 = 1;
                            com.yandex.plus.bdui.content.c cVar16 = new com.yandex.plus.bdui.content.c("CounterOffers", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 8), ern.a(p3.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.b
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    com.yandex.plus.bdui.s sVar2 = (com.yandex.plus.bdui.s) obj4;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    switch (i13) {
                                        case 0:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new com.yandex.plus.bdui.plus.checkout.content.controller.q(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        case 1:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new u(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                        default:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new f0(mVar6, bVar9, aVar19, dVar2, yVar2, bVar8);
                                    }
                                }
                            }, e5bVar);
                            com.yandex.plus.bdui.content.c cVar17 = new com.yandex.plus.bdui.content.c("CheckoutError", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 9), ern.a(com.yandex.plus.bdui.plus.checkout.content.j.class), new mqr(bVar9, aVar19, yVar2, bVar8, 19), e5bVar);
                            com.yandex.plus.bdui.content.c cVar18 = new com.yandex.plus.bdui.content.c("CheckoutClose", new com.yandex.plus.bdui.plus.a(bVar8, 4), ern.a(com.yandex.plus.bdui.plus.checkout.content.f.class), new com.yandex.plus.bdui.plus.a(bVar8, 5), e5bVar);
                            com.yandex.plus.bdui.plus.b bVar12 = new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 4);
                            final int i14 = 0;
                            com.yandex.plus.bdui.content.c cVar19 = new com.yandex.plus.bdui.content.c("AppBarContent", bVar12, ern.a(com.yandex.plus.bdui.plus.checkout.content.a.class), new Function2() { // from class: com.yandex.plus.bdui.plus.checkout.a
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    com.yandex.plus.bdui.s sVar2 = (com.yandex.plus.bdui.s) obj4;
                                    com.yandex.plus.bdui.m mVar6 = (com.yandex.plus.bdui.m) obj5;
                                    switch (i14) {
                                        case 0:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new com.yandex.plus.bdui.plus.checkout.content.controller.d(mVar6, bVar9, aVar19, bVar8);
                                        default:
                                            sVar2.getClass();
                                            mVar6.getClass();
                                            return new j0(mVar6, bVar9, aVar19, bVar8);
                                    }
                                }
                            }, e5bVar);
                            com.yandex.plus.bdui.content.c cVar20 = new com.yandex.plus.bdui.content.c("ButtonContent", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 5), ern.a(com.yandex.plus.bdui.plus.checkout.content.b.class), new com.yandex.plus.bdui.plus.a(bVar8, 3), e5bVar);
                            com.yandex.plus.bdui.content.c cVar21 = new com.yandex.plus.bdui.content.c("TechnicalError", new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 2), ern.a(com.yandex.plus.bdui.plus.content.j.class), null, e5bVar);
                            dzf dzfVar = tarifficatorBduiScenarioActivity;
                            dzfVar.getClass();
                            com.yandex.plus.bdui.plus.b bVar13 = new com.yandex.plus.bdui.plus.b(fVar3, bVar8, 3);
                            vl1 vl1Var = new vl1(sVar, fVar2, eVar9, dzfVar, tf6Var, bVar8, huwVar);
                            Set keySet = e2.keySet();
                            keySet.getClass();
                            return xz0.w(new com.yandex.plus.bdui.content.c[]{cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, new com.yandex.plus.bdui.content.c("PlusWebView", bVar13, ern.a(com.yandex.plus.bdui.plus.content.r.class), vl1Var, tah.b(new Pair(new w("webViewBridges"), keySet)))});
                        }
                    };
                    PlusPayCompositeOffers.Offer offer2 = offer;
                    com.yandex.plus.bdui.plus.scenario.o oVar5 = new com.yandex.plus.bdui.plus.scenario.o(lubVar, function1, new com.yandex.passport.internal.ui.bouncer.p(14, X, bVar4), new com.yandex.plus.bdui.plus.checkout.d(bVar4, 0), null, 16);
                    com.yandex.plus.bdui.plus.scenario.o oVar6 = new com.yandex.plus.bdui.plus.scenario.o(new i50(bVar4, jVar, aVar2, X, 28), new com.yandex.plus.home.feature.webviews.internal.e(fVar, bVar4, aVar2, X), null, null, null, 28);
                    com.yandex.passport.internal.entities.j jVar2 = this.J;
                    if (jVar2 != null) {
                        com.yandex.plus.bdui.plus.checkout.o oVar7 = new com.yandex.plus.bdui.plus.checkout.o();
                        com.yandex.plus.bdui.plus.checkout.div.e eVar9 = new com.yandex.plus.bdui.plus.checkout.div.e(tarifficatorBduiScenarioActivity);
                        Map map2 = this.K;
                        if (map2 == null) {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        Map map3 = this.L;
                        if (map3 == null) {
                            map3 = e5b.a;
                            map3.getClass();
                        }
                        LinkedHashMap i7 = uah.i(map3, tah.b(new Pair("decorated-text", new com.yandex.plus.bdui.plus.checkout.div.a(dVar, yVar, bVar4, x3fVar))));
                        List list = this.X;
                        if (list == null) {
                            list = c5b.a;
                        }
                        com.yandex.plus.bdui.flex.ui.content.d dVar2 = new com.yandex.plus.bdui.flex.ui.content.d();
                        Map map4 = com.yandex.plus.bdui.plus.d.a;
                        list.getClass();
                        oVar = oVar5;
                        bVar = bVar4;
                        oVar2 = new com.yandex.plus.bdui.plus.scenario.o(null, new aa3(jVar2, list, i7, fVar, bVar4, tarifficatorBduiScenarioActivity, oVar7, eVar9, map2, dVar2, X), null, null, new k0(19), 13);
                    } else {
                        bVar = bVar4;
                        oVar = oVar5;
                        oVar2 = null;
                    }
                    str.getClass();
                    com.yandex.plus.bdui.plus.scenario.m mVar6 = new com.yandex.plus.bdui.plus.scenario.m(rVar, str, d2, str2, str3, l, hVar, hVar2, bVar7, iVar, this.C, kVar3, jVar, new o(this, 0), new o(this, 1), oVar3, qVar, xz0.w(new com.yandex.plus.bdui.plus.scenario.o[]{oVar, oVar6, oVar2}), mVar5, new com.yandex.plus.bdui.plus.checkout.o(), aVar11, new androidx.core.app.q(aVar11), fVar, eVar8, xVar, aVar6, new com.yandex.plus.bdui.plus.checkout.k(pVar2, offer2, eVar7, kVar4, kVar5, kVar6, kVar7, jk6Var, this.x0, e, bVar), bsdVar, mn7Var, X, X2, bVar);
                    if (z) {
                        nVar = nVar2;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e eVar10 = ((k) nVar).a;
                        eVar5.getClass();
                        eVar10.getClass();
                        PlusPayCompositeOffers.Offer offer3 = eVar10.b;
                        e eVar11 = eVar5;
                        Pair pair5 = new Pair("origin", eVar11.e);
                        Pair pair6 = new Pair("offersBatchId", offer3.getMeta().getOffersBatchId());
                        Pair pair7 = new Pair("offersPositionId", offer3.getPositionId());
                        Pair pair8 = new Pair("target", offer3.getMeta().getProductTarget());
                        Pair pair9 = new Pair("activeTariffName", offer3.getActiveTariffId());
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer3.getTariffOffer();
                        Pair pair10 = new Pair("tariff", tariffOffer != null ? e.c(tariffOffer.getId(), tariffOffer.getTitle(), tariffOffer.getDescription(), tariffOffer.getText(), tariffOffer.getAdditionalText(), tariffOffer.getCommonPrice(), tariffOffer.getCommonPeriod(), tariffOffer.getVendor(), tariffOffer.getPayload()) : null);
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer3.getOptionOffers();
                        ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                        for (PlusPayCompositeOffers.Offer.Option option : optionOffers) {
                            arrayList.add(e.c(option.getId(), option.getTitle(), option.getDescription(), option.getText(), option.getAdditionalText(), option.getCommonPrice(), option.getCommonPeriod(), option.getVendor(), option.getPayload()));
                        }
                        Pair pair11 = new Pair("options", arrayList);
                        PlusPayLegalInfo legalInfo = offer3.getLegalInfo();
                        if (legalInfo != null) {
                            Pair pair12 = new Pair("text", legalInfo.getText());
                            List<PlusPayLegalInfo.Item> items = legalInfo.getItems();
                            pair = pair6;
                            pair2 = pair7;
                            pair3 = pair8;
                            ArrayList arrayList2 = new ArrayList(v75.o(items, 10));
                            Iterator it2 = items.iterator();
                            while (it2.hasNext()) {
                                PlusPayLegalInfo.Item item = (PlusPayLegalInfo.Item) it2.next();
                                Iterator it3 = it2;
                                Pair pair13 = pair5;
                                if (item instanceof PlusPayLegalInfo.Item.Link) {
                                    eVar3 = eVar11;
                                    PlusPayLegalInfo.Item.Link link = (PlusPayLegalInfo.Item.Link) item;
                                    mVar4 = mVar6;
                                    g = uah.g(new Pair("type", "LINK"), new Pair("altText", link.getText()), new Pair("data", uah.e(new Pair("text", link.getText()), new Pair("url", link.getLink()))));
                                } else {
                                    mVar4 = mVar6;
                                    eVar3 = eVar11;
                                    if (!(item instanceof PlusPayLegalInfo.Item.Text)) {
                                        b6e.s();
                                        return null;
                                    }
                                    PlusPayLegalInfo.Item.Text text = (PlusPayLegalInfo.Item.Text) item;
                                    g = uah.g(new Pair("type", "TEXT"), new Pair("altText", text.getText()), new Pair("data", dfi.n("text", text.getText())));
                                }
                                g.put(PListParser.TAG_KEY, item.getKey());
                                arrayList2.add(g);
                                it2 = it3;
                                pair5 = pair13;
                                eVar11 = eVar3;
                                mVar6 = mVar4;
                            }
                            mVar2 = mVar6;
                            eVar2 = eVar11;
                            pair4 = pair5;
                            n8gVar = null;
                            map = uah.e(pair12, new Pair("components", arrayList2));
                        } else {
                            mVar2 = mVar6;
                            eVar2 = eVar11;
                            pair = pair6;
                            pair2 = pair7;
                            pair3 = pair8;
                            pair4 = pair5;
                            n8gVar = null;
                            map = null;
                        }
                        Pair pair14 = new Pair("compositeOffer", r1.v(pair9, pair10, pair11, new Pair("legals", map), new Pair("assets", uah.e(new Pair("subscriptionName", offer3.getAssets().getSubscriptionName()), new Pair("buttonText", offer3.getAssets().getButtonText()), new Pair("buttonTextWithDetails", offer3.getAssets().getButtonTextWithDetails())))));
                        n8g b = t75.b();
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer3.getTariffOffer();
                        if (tariffOffer2 != null && (d = e.d(tariffOffer2.getId(), tariffOffer2.getCommonPrice(), tariffOffer2.getCommonPeriod(), tariffOffer2.getPlans(), tariffOffer2.getVendor())) != null) {
                            b.add(d);
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer3.getOptionOffers();
                        ArrayList arrayList3 = new ArrayList();
                        for (PlusPayCompositeOffers.Offer.Option option2 : optionOffers2) {
                            Map d3 = e.d(option2.getId(), option2.getCommonPrice(), option2.getCommonPeriod(), option2.getPlans(), option2.getVendor());
                            if (d3 != null) {
                                arrayList3.add(d3);
                            }
                        }
                        b.addAll(arrayList3);
                        n8g a2 = t75.a(b);
                        if (a2.isEmpty()) {
                            a2 = n8gVar;
                        }
                        v = r1.v(pair4, pair, pair2, pair3, pair14, new Pair("storeOffersV2Data", a2 != null ? tah.b(new Pair("storeOffers", a2)) : n8gVar), new Pair("checkSilentInvoiceAvailability", Boolean.valueOf(eVar10.f == com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.d.a)));
                        tarifficatorBduiScenarioActivity3 = tarifficatorBduiScenarioActivity;
                        i4 = i;
                        bundle3 = bundle;
                        eVar = eVar2;
                        mVar3 = mVar2;
                        Set Z = nVar.Z();
                        n nVar4 = eVar.h;
                        Z.getClass();
                        ?? r4 = e.m;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : r4.entrySet()) {
                            if (Z.contains((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p) entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Collection values = linkedHashMap.values();
                        a = tah.a(v75.o(values, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
                        for (Object obj3 : values) {
                            linkedHashMap2.put(obj3, Boolean.FALSE);
                        }
                        Pair pair15 = new Pair("sdkVersion", "110.0.0");
                        Pair pair16 = new Pair("service", eVar.a);
                        Pair pair17 = new Pair("serviceChannel", eVar.b);
                        Pair pair18 = new Pair("clientSource", eVar.c);
                        Pair pair19 = new Pair("clientSubSource", eVar.d);
                        Pair pair20 = new Pair("checkoutPlatform", "MOBILE_ANDROID");
                        Iterable iterable = (Iterable) eVar.i.invoke();
                        ArrayList arrayList4 = new ArrayList(v75.o(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(String.valueOf(((Number) it.next()).longValue()));
                        }
                        LinkedHashMap i8 = uah.i(v, uah.i(r1.v(pair15, pair16, pair17, pair18, pair19, pair20, new Pair("testIds", arrayList4), new Pair("experimentFlags", eVar.k.invoke()), new Pair("externalCallerPayload", nVar4.V()), new Pair("purchaseSessionId", com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(nVar4.F())), new Pair("eventSessionId", nVar4.getEventSessionId()), new Pair("triggeredTestIds", eVar.j.invoke()), new Pair("clid", eVar.f)), linkedHashMap2));
                        ((com.yandex.plus.bdui.plus.query.a) mVar3.E.getValue()).getClass();
                        Map a3 = com.yandex.plus.bdui.plus.query.a.a(null, i8);
                        a aVar12 = this.l;
                        return mVar3.e(tarifficatorBduiScenarioActivity3, i4, aVar12.b, aVar12.c, aVar12.d, a3, bundle3);
                    }
                    nVar = nVar2;
                    if (!(nVar instanceof m)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h hVar3 = ((m) nVar).a;
                    tarifficatorBduiScenarioActivity2 = tarifficatorBduiScenarioActivity;
                    tVar2.j = tarifficatorBduiScenarioActivity2;
                    bundle2 = bundle;
                    tVar2.k = bundle2;
                    mVar = mVar6;
                    tVar2.l = mVar;
                    i3 = i;
                    tVar2.m = i3;
                    tVar2.p = 1;
                    eVar = eVar5;
                    obj = eVar.b(hVar3, tVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i9 = tVar2.m;
                    com.yandex.plus.bdui.plus.scenario.m mVar7 = tVar2.l;
                    Bundle bundle4 = tVar2.k;
                    TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity4 = tVar2.j;
                    qgg.h0(obj);
                    tarifficatorBduiScenarioActivity2 = tarifficatorBduiScenarioActivity4;
                    nVar = nVar2;
                    mVar = mVar7;
                    bundle2 = bundle4;
                    eVar = eVar5;
                    i3 = i9;
                }
                v = (Map) obj;
                bundle3 = bundle2;
                mVar3 = mVar;
                i4 = i3;
                tarifficatorBduiScenarioActivity3 = tarifficatorBduiScenarioActivity2;
                Set Z2 = nVar.Z();
                n nVar42 = eVar.h;
                Z2.getClass();
                ?? r42 = e.m;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (r4.hasNext()) {
                }
                Collection values2 = linkedHashMap3.values();
                a = tah.a(v75.o(values2, 10));
                if (a < 16) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(a);
                while (r1.hasNext()) {
                }
                Pair pair152 = new Pair("sdkVersion", "110.0.0");
                Pair pair162 = new Pair("service", eVar.a);
                Pair pair172 = new Pair("serviceChannel", eVar.b);
                Pair pair182 = new Pair("clientSource", eVar.c);
                Pair pair192 = new Pair("clientSubSource", eVar.d);
                Pair pair202 = new Pair("checkoutPlatform", "MOBILE_ANDROID");
                Iterable iterable2 = (Iterable) eVar.i.invoke();
                ArrayList arrayList42 = new ArrayList(v75.o(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                LinkedHashMap i82 = uah.i(v, uah.i(r1.v(pair152, pair162, pair172, pair182, pair192, pair202, new Pair("testIds", arrayList42), new Pair("experimentFlags", eVar.k.invoke()), new Pair("externalCallerPayload", nVar42.V()), new Pair("purchaseSessionId", com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(nVar42.F())), new Pair("eventSessionId", nVar42.getEventSessionId()), new Pair("triggeredTestIds", eVar.j.invoke()), new Pair("clid", eVar.f)), linkedHashMap22));
                ((com.yandex.plus.bdui.plus.query.a) mVar3.E.getValue()).getClass();
                Map a32 = com.yandex.plus.bdui.plus.query.a.a(null, i82);
                a aVar122 = this.l;
                return mVar3.e(tarifficatorBduiScenarioActivity3, i4, aVar122.b, aVar122.c, aVar122.d, a32, bundle3);
            }
        }
        tVar = new t(this, cg6Var);
        t tVar22 = tVar;
        Object obj4 = tVar22.n;
        Object obj22 = nm6.a;
        i2 = tVar22.p;
        e eVar52 = this.G0;
        n nVar22 = this.m;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
        v = (Map) obj4;
        bundle3 = bundle2;
        mVar3 = mVar;
        i4 = i3;
        tarifficatorBduiScenarioActivity3 = tarifficatorBduiScenarioActivity2;
        Set Z22 = nVar.Z();
        n nVar422 = eVar.h;
        Z22.getClass();
        ?? r422 = e.m;
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r4.hasNext()) {
        }
        Collection values22 = linkedHashMap32.values();
        a = tah.a(v75.o(values22, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap222 = new LinkedHashMap(a);
        while (r1.hasNext()) {
        }
        Pair pair1522 = new Pair("sdkVersion", "110.0.0");
        Pair pair1622 = new Pair("service", eVar.a);
        Pair pair1722 = new Pair("serviceChannel", eVar.b);
        Pair pair1822 = new Pair("clientSource", eVar.c);
        Pair pair1922 = new Pair("clientSubSource", eVar.d);
        Pair pair2022 = new Pair("checkoutPlatform", "MOBILE_ANDROID");
        Iterable iterable22 = (Iterable) eVar.i.invoke();
        ArrayList arrayList422 = new ArrayList(v75.o(iterable22, 10));
        it = iterable22.iterator();
        while (it.hasNext()) {
        }
        LinkedHashMap i822 = uah.i(v, uah.i(r1.v(pair1522, pair1622, pair1722, pair1822, pair1922, pair2022, new Pair("testIds", arrayList422), new Pair("experimentFlags", eVar.k.invoke()), new Pair("externalCallerPayload", nVar422.V()), new Pair("purchaseSessionId", com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(nVar422.F())), new Pair("eventSessionId", nVar422.getEventSessionId()), new Pair("triggeredTestIds", eVar.j.invoke()), new Pair("clid", eVar.f)), linkedHashMap222));
        ((com.yandex.plus.bdui.plus.query.a) mVar3.E.getValue()).getClass();
        Map a322 = com.yandex.plus.bdui.plus.query.a.a(null, i822);
        a aVar1222 = this.l;
        return mVar3.e(tarifficatorBduiScenarioActivity3, i4, aVar1222.b, aVar1222.c, aVar1222.d, a322, bundle3);
    }
}
