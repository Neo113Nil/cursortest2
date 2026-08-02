package com.yandex.plus.home.feature.webviews.internal.container;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.stories.list.j;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.home.feature.webviews.internal.uri.y;
import com.yandex.plus.home.internal.di.v;
import com.yandex.plus.pay.adapter.internal.c1;
import defpackage.b6e;
import defpackage.bi1;
import defpackage.c7;
import defpackage.ce5;
import defpackage.cg6;
import defpackage.ci0;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.kqv;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.o77;
import defpackage.odu;
import defpackage.qgg;
import defpackage.rjf;
import defpackage.tf6;
import defpackage.u75;
import defpackage.v75;
import defpackage.wdu;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z75;
import defpackage.zne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class t implements u {
    public final Function0 A;
    public final Function0 B;
    public final Function0 C;
    public final Function0 D;
    public final Function0 E;
    public final Function0 F;
    public final Function0 G;
    public final x0q H;
    public tf6 I;
    public final xdr J;
    public final FrameLayout K;
    public final View L;
    public final com.yandex.passport.data.network.l M;
    public com.yandex.plus.home.feature.webviews.internal.home.k N;
    public final Context a;
    public final com.yandex.passport.internal.entities.j b;
    public final com.yandex.plus.home.api.webview.a c;
    public final com.yandex.plus.home.feature.webviews.internal.container.factory.a d;
    public final o77 e;
    public final ce5 f;
    public final bi1 g;
    public final com.yandex.plus.bdui.flex.ui.s h;
    public final com.yandex.plus.bdui.flex.ui.s i;
    public final y j;
    public final Integer k;
    public final com.yandex.plus.home.payment.google.d l;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u m;
    public final int n;
    public final int o;
    public final com.yandex.passport.data.network.l p;
    public final com.yandex.plus.home.feature.webviews.internal.uri.t q;
    public final com.yandex.plus.home.core.navigation.a r;
    public final com.yandex.plus.home.core.navigation.b s;
    public final com.yandex.plus.home.feature.webviews.internal.overlap.g t;
    public final com.yandex.plus.log.api.b u;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i v;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i w;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i x;
    public final com.yandex.plus.core.config.a y;
    public final Function0 z;

    public t(Context context, com.yandex.passport.internal.entities.j jVar, com.yandex.plus.home.api.webview.a aVar, com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar2, o77 o77Var, ce5 ce5Var, bi1 bi1Var, com.yandex.plus.bdui.flex.ui.s sVar, com.yandex.plus.bdui.flex.ui.s sVar2, y yVar, com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar, Integer num, com.yandex.plus.home.payment.google.d dVar, a1 a1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u uVar, int i, int i2, com.yandex.plus.home.ybsdk.a aVar3, com.yandex.passport.data.network.l lVar, com.yandex.plus.home.feature.webviews.internal.uri.t tVar, com.yandex.plus.home.core.navigation.a aVar4, com.yandex.plus.home.core.navigation.b bVar, com.yandex.plus.home.feature.webviews.internal.overlap.g gVar, com.yandex.plus.core.analytics.logging.d dVar2, com.yandex.plus.home.feature.webviews.internal.stories.i iVar, com.yandex.plus.home.feature.webviews.internal.stories.i iVar2, com.yandex.plus.home.feature.webviews.internal.stories.i iVar3, com.yandex.plus.core.config.a aVar5, v vVar, v vVar2, v vVar3, v vVar4, v vVar5, v vVar6, v vVar7, v vVar8, kotlinx.coroutines.a aVar6) {
        jVar.getClass();
        dVar.getClass();
        uVar.getClass();
        aVar4.getClass();
        bVar.getClass();
        dVar2.getClass();
        aVar5.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        vVar4.getClass();
        vVar5.getClass();
        vVar6.getClass();
        vVar7.getClass();
        vVar8.getClass();
        aVar6.getClass();
        this.a = context;
        this.b = jVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = o77Var;
        this.f = ce5Var;
        this.g = bi1Var;
        this.h = sVar;
        this.i = sVar2;
        this.j = yVar;
        this.k = num;
        this.l = dVar;
        this.m = uVar;
        this.n = i;
        this.o = i2;
        this.p = lVar;
        this.q = tVar;
        this.r = aVar4;
        this.s = bVar;
        this.t = gVar;
        this.u = dVar2;
        this.v = iVar;
        this.w = iVar2;
        this.x = iVar3;
        this.y = aVar5;
        this.z = vVar;
        this.A = vVar2;
        this.B = vVar3;
        this.C = vVar4;
        this.D = vVar5;
        this.E = vVar6;
        this.F = vVar7;
        this.G = vVar8;
        this.H = com.yandex.plus.bdui.flex.ui.a.a();
        this.J = ydr.a(null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addOnAttachStateChangeListener(new com.yandex.passport.internal.ui.bouncer.roundabout.n(7, this, aVar6));
        this.K = frameLayout;
        View inflate = LayoutInflater.from(context).inflate(R.layout.plus_sdk_button_debug_panel, (ViewGroup) frameLayout, false);
        inflate.getClass();
        this.L = inflate;
        if (!(aVar instanceof com.yandex.plus.home.api.webview.a)) {
            b6e.s();
            throw null;
        }
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar4 = com.yandex.plus.home.feature.webviews.internal.uri.i.a;
        this.M = new com.yandex.passport.data.network.l(18);
    }

    public static final boolean c(t tVar, View view) {
        WeakHashMap weakHashMap = wdu.a;
        kqv a = odu.a(view);
        if (a == null) {
            return false;
        }
        zne g = a.a.g(519);
        g.getClass();
        boolean z = (view.getHeight() > (view.getRootView().getHeight() - g.b) - g.d) || (view.getWidth() > (view.getRootView().getWidth() - g.a) - g.c);
        com.yandex.plus.log.api.b bVar = tVar.u;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewsControllerImpl", "PlusWebViewContainer: isOverlappedBySystemElements=" + z);
        }
        return z;
    }

    public static final void d(t tVar) {
        z75.B((LinkedList) tVar.M.a);
        FrameLayout frameLayout = tVar.K;
        int childCount = frameLayout.getChildCount();
        int j = tVar.j();
        if (childCount <= j) {
            tVar.N = null;
            tVar.H.a(com.yandex.plus.home.api.state.a.b);
            return;
        }
        frameLayout.removeViewAt(childCount - j);
        KeyEvent.Callback childAt = frameLayout.getChildAt(frameLayout.getChildCount() - tVar.j());
        a aVar = childAt instanceof a ? (a) childAt : null;
        if (aVar != null) {
            aVar.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(t tVar, com.yandex.plus.home.feature.webviews.internal.uri.b bVar, String str, String str2, Map map, zne zneVar, i iVar, com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar, cg6 cg6Var) {
        m mVar;
        int i;
        com.yandex.plus.home.feature.webviews.internal.uri.i y;
        h v;
        String str3;
        Map map2;
        zne zneVar2;
        boolean z;
        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar2;
        boolean z2;
        String str4;
        com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar3;
        com.yandex.plus.home.featureflags.e eVar;
        tVar.getClass();
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.v = i2 - Integer.MIN_VALUE;
                Object obj = mVar.t;
                nm6 nm6Var = nm6.a;
                i = mVar.v;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!(tVar.c instanceof com.yandex.plus.home.api.webview.a)) {
                        b6e.s();
                        return null;
                    }
                    y = tVar.M.y(null);
                    v = tVar.v(y, (int) tVar.a.getResources().getDimension(R.dimen.plus_sdk_mu_4), iVar);
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a N = tVar.p.N(zneVar, y, false);
                    boolean booleanValue = ((Boolean) tVar.z.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) tVar.D.invoke()).booleanValue();
                    str3 = str;
                    com.yandex.plus.home.feature.webviews.internal.uri.s a = tVar.q.a(booleanValue, str3, str2, map, N, aVar);
                    com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar4 = tVar.d;
                    mVar.j = str3;
                    mVar.k = str2;
                    mVar.l = map;
                    mVar.m = zneVar;
                    mVar.n = y;
                    mVar.o = v;
                    mVar.p = N;
                    mVar.q = aVar4;
                    mVar.r = booleanValue;
                    mVar.s = booleanValue2;
                    mVar.v = 1;
                    Object d = a.d(bVar, mVar);
                    if (d == nm6Var) {
                        return nm6Var;
                    }
                    map2 = map;
                    zneVar2 = zneVar;
                    z = booleanValue2;
                    obj = d;
                    aVar2 = aVar4;
                    z2 = booleanValue;
                    str4 = str2;
                    aVar3 = N;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = mVar.s;
                    boolean z4 = mVar.r;
                    com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar5 = mVar.q;
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar6 = mVar.p;
                    v = mVar.o;
                    y = mVar.n;
                    zne zneVar3 = mVar.m;
                    Map map3 = mVar.l;
                    String str5 = mVar.k;
                    String str6 = mVar.j;
                    qgg.h0(obj);
                    z = z3;
                    z2 = z4;
                    aVar2 = aVar5;
                    aVar3 = aVar6;
                    zneVar2 = zneVar3;
                    map2 = map3;
                    str4 = str5;
                    str3 = str6;
                }
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = y;
                com.yandex.plus.home.feature.webviews.internal.uri.b bVar2 = (com.yandex.plus.home.feature.webviews.internal.uri.b) obj;
                x0q x0qVar = tVar.H;
                x0qVar.getClass();
                d dVar = new d(x0qVar);
                aVar2.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar = aVar2.z;
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = aVar2.r;
                h hVar = v;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = aVar2.g;
                com.yandex.plus.bdui.flex.ui.s sVar = aVar2.a;
                com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar = aVar2.A;
                bVar2.getClass();
                aVar3.getClass();
                str3.getClass();
                zneVar2.getClass();
                iVar2.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar4 = new com.yandex.plus.bdui.plus.content.controller.f(str3, aVar2.T);
                com.yandex.plus.acquisition.adapter.internal.adapter.a aVar7 = aVar2.S;
                com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j(aVar7.a, aVar7.b);
                com.yandex.plus.core.strings.a b = ((c1) aVar2.I).b();
                com.yandex.plus.home.feature.webviews.internal.purchase.pay.c cVar = new com.yandex.plus.home.feature.webviews.internal.purchase.pay.c(sVar, tVar, aVar2.c);
                com.yandex.plus.ui.core.theme.a aVar8 = (com.yandex.plus.ui.core.theme.a) aVar2.C.getValue();
                com.yandex.plus.bdui.plus.content.controller.f fVar5 = new com.yandex.plus.bdui.plus.content.controller.f(18);
                rjf rjfVar = new rjf(aVar2.h, aVar2.B, aVar2.H, oVar, aVar2.u, aVar2.v, aVar2.w, aVar2.x, aVar2.y, bVar2.b, aVar2.b, fVar5, aVar2.c, aVar2.E, (com.yandex.plus.acquisition.adapter.internal.processor.b) ((jyr) jVar.d).getValue(), fVar4);
                com.yandex.plus.home.feature.webviews.internal.error.c cVar2 = new com.yandex.plus.home.feature.webviews.internal.error.c(aVar2.O, aVar2.D);
                com.yandex.plus.home.api.config.a aVar9 = aVar2.q;
                kotlinx.coroutines.a aVar10 = aVar2.c;
                kotlinx.coroutines.a aVar11 = aVar2.d;
                kotlinx.coroutines.a aVar12 = aVar2.e;
                com.yandex.passport.internal.core.accounts.h hVar2 = aVar2.N;
                com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar13 = aVar2;
                com.yandex.plus.home.feature.webviews.internal.home.g gVar = new com.yandex.plus.home.feature.webviews.internal.home.g(bVar2, aVar9, aVar10, aVar11, aVar12, hVar2, aVar2.f, fVar3, dVar, aVar2.h, aVar2.i, aVar2.j, aVar2.k, aVar2.l, aVar2.m, aVar2.b, new com.yandex.plus.bdui.plus.content.controller.f(aVar2.n), fVar2, new com.yandex.plus.bdui.plus.content.controller.f(fVar2, hVar2), aVar2.s, aVar2.t, aVar2.v, aVar2.x, str3, map2, oVar, fVar, sVar, tVar, z2, z, str4, aVar2.E, aVar2.F, rjfVar, aVar2.J, aVar2.K, fVar5, aVar2.M, aVar2.Q, aVar2.L);
                Context context = aVar13.o;
                com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar3 = aVar13.p;
                com.yandex.plus.resources.core.a aVar14 = aVar13.D;
                com.yandex.passport.internal.flags.experiments.p pVar = aVar13.G;
                eVar = (com.yandex.plus.home.featureflags.e) ((com.yandex.plus.home.featureflags.g) pVar.c);
                com.yandex.plus.core.animation.a dVar2 = !r1.l(eVar.h) ? new com.yandex.plus.core.insets.d(2) : new com.yandex.passport.internal.flags.experiments.p((com.yandex.plus.bdui.flex.ui.s) pVar.b, (kotlinx.coroutines.a) pVar.d);
                if (r1.l(eVar.i)) {
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, com.yandex.plus.core.analytics.logging.b.a, "Experiment flag is true, but no host animation controller available", null);
                }
                int i3 = 0;
                com.yandex.plus.home.feature.webviews.internal.home.k kVar = new com.yandex.plus.home.feature.webviews.internal.home.k(context, gVar, bVar3, iVar2, aVar8, cVar, aVar14, new com.yandex.plus.home.animation.a(dVar2), cVar2, aVar13.P, b, false, zneVar2, aVar3, new com.yandex.plus.home.feature.webviews.internal.home.contract.d(z2, z, nsa.f(aVar13.Q.a), new com.yandex.plus.home.feature.webviews.internal.home.contract.b(tVar, sVar, aVar13.R, fVar, aVar13.l, aVar13.f, fVar3, aVar13.h, aVar13.i, aVar13.j, aVar13.v, aVar13.E, aVar13.m, oVar, fVar2, aVar13.d, aVar13.c, aVar13.e), new w(aVar13.b), new com.yandex.plus.home.feature.webviews.internal.f(2, aVar13), aVar13.m, aVar13.c), tVar, new com.yandex.plus.bdui.flex.ui.s(new com.yandex.plus.home.analytics.evgen.c(i3, gVar, com.yandex.plus.home.feature.webviews.internal.home.g.class, "onClose", "onClose()V", 0, 13), fVar4, (com.yandex.plus.acquisition.adapter.internal.controller.b) ((jyr) jVar.c).getValue(), new jk6(i3, 12, com.yandex.plus.home.feature.webviews.internal.home.g.class, gVar, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;"), oVar, aVar13.h, aVar13.E));
                tVar.N = kVar;
                tVar.u(hVar, kVar);
                return Unit.a;
            }
        }
        mVar = new m(tVar, cg6Var);
        Object obj2 = mVar.t;
        nm6 nm6Var2 = nm6.a;
        i = mVar.v;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar22 = y;
        com.yandex.plus.home.feature.webviews.internal.uri.b bVar22 = (com.yandex.plus.home.feature.webviews.internal.uri.b) obj2;
        x0q x0qVar2 = tVar.H;
        x0qVar2.getClass();
        d dVar3 = new d(x0qVar2);
        aVar2.getClass();
        com.yandex.plus.bdui.plus.content.controller.f fVar6 = aVar2.z;
        com.yandex.plus.bdui.plus.content.controller.f fVar22 = aVar2.r;
        h hVar3 = v;
        com.yandex.plus.bdui.plus.content.controller.f fVar32 = aVar2.g;
        com.yandex.plus.bdui.flex.ui.s sVar2 = aVar2.a;
        com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar2 = aVar2.A;
        bVar22.getClass();
        aVar3.getClass();
        str3.getClass();
        zneVar2.getClass();
        iVar22.getClass();
        com.yandex.plus.bdui.plus.content.controller.f fVar42 = new com.yandex.plus.bdui.plus.content.controller.f(str3, aVar2.T);
        com.yandex.plus.acquisition.adapter.internal.adapter.a aVar72 = aVar2.S;
        com.yandex.passport.internal.entities.j jVar2 = new com.yandex.passport.internal.entities.j(aVar72.a, aVar72.b);
        com.yandex.plus.core.strings.a b2 = ((c1) aVar2.I).b();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.c cVar3 = new com.yandex.plus.home.feature.webviews.internal.purchase.pay.c(sVar2, tVar, aVar2.c);
        com.yandex.plus.ui.core.theme.a aVar82 = (com.yandex.plus.ui.core.theme.a) aVar2.C.getValue();
        com.yandex.plus.bdui.plus.content.controller.f fVar52 = new com.yandex.plus.bdui.plus.content.controller.f(18);
        rjf rjfVar2 = new rjf(aVar2.h, aVar2.B, aVar2.H, oVar2, aVar2.u, aVar2.v, aVar2.w, aVar2.x, aVar2.y, bVar22.b, aVar2.b, fVar52, aVar2.c, aVar2.E, (com.yandex.plus.acquisition.adapter.internal.processor.b) ((jyr) jVar2.d).getValue(), fVar42);
        com.yandex.plus.home.feature.webviews.internal.error.c cVar22 = new com.yandex.plus.home.feature.webviews.internal.error.c(aVar2.O, aVar2.D);
        com.yandex.plus.home.api.config.a aVar92 = aVar2.q;
        kotlinx.coroutines.a aVar102 = aVar2.c;
        kotlinx.coroutines.a aVar112 = aVar2.d;
        kotlinx.coroutines.a aVar122 = aVar2.e;
        com.yandex.passport.internal.core.accounts.h hVar22 = aVar2.N;
        com.yandex.plus.home.feature.webviews.internal.container.factory.a aVar132 = aVar2;
        com.yandex.plus.home.feature.webviews.internal.home.g gVar2 = new com.yandex.plus.home.feature.webviews.internal.home.g(bVar22, aVar92, aVar102, aVar112, aVar122, hVar22, aVar2.f, fVar32, dVar3, aVar2.h, aVar2.i, aVar2.j, aVar2.k, aVar2.l, aVar2.m, aVar2.b, new com.yandex.plus.bdui.plus.content.controller.f(aVar2.n), fVar22, new com.yandex.plus.bdui.plus.content.controller.f(fVar22, hVar22), aVar2.s, aVar2.t, aVar2.v, aVar2.x, str3, map2, oVar2, fVar6, sVar2, tVar, z2, z, str4, aVar2.E, aVar2.F, rjfVar2, aVar2.J, aVar2.K, fVar52, aVar2.M, aVar2.Q, aVar2.L);
        Context context2 = aVar132.o;
        com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar32 = aVar132.p;
        com.yandex.plus.resources.core.a aVar142 = aVar132.D;
        com.yandex.passport.internal.flags.experiments.p pVar2 = aVar132.G;
        eVar = (com.yandex.plus.home.featureflags.e) ((com.yandex.plus.home.featureflags.g) pVar2.c);
        if (!r1.l(eVar.h)) {
        }
        if (r1.l(eVar.i)) {
        }
        int i32 = 0;
        com.yandex.plus.home.feature.webviews.internal.home.k kVar2 = new com.yandex.plus.home.feature.webviews.internal.home.k(context2, gVar2, bVar32, iVar22, aVar82, cVar3, aVar142, new com.yandex.plus.home.animation.a(dVar2), cVar22, aVar132.P, b2, false, zneVar2, aVar3, new com.yandex.plus.home.feature.webviews.internal.home.contract.d(z2, z, nsa.f(aVar132.Q.a), new com.yandex.plus.home.feature.webviews.internal.home.contract.b(tVar, sVar2, aVar132.R, fVar6, aVar132.l, aVar132.f, fVar32, aVar132.h, aVar132.i, aVar132.j, aVar132.v, aVar132.E, aVar132.m, oVar2, fVar22, aVar132.d, aVar132.c, aVar132.e), new w(aVar132.b), new com.yandex.plus.home.feature.webviews.internal.f(2, aVar132), aVar132.m, aVar132.c), tVar, new com.yandex.plus.bdui.flex.ui.s(new com.yandex.plus.home.analytics.evgen.c(i32, gVar2, com.yandex.plus.home.feature.webviews.internal.home.g.class, "onClose", "onClose()V", 0, 13), fVar42, (com.yandex.plus.acquisition.adapter.internal.controller.b) ((jyr) jVar2.c).getValue(), new jk6(i32, 12, com.yandex.plus.home.feature.webviews.internal.home.g.class, gVar2, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;"), oVar2, aVar132.h, aVar132.E));
        tVar.N = kVar2;
        tVar.u(hVar3, kVar2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(t tVar, com.yandex.plus.home.feature.webviews.internal.uri.e eVar, String str, String str2, Map map, zne zneVar, com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar, i iVar, boolean z, cg6 cg6Var) {
        n nVar;
        int i;
        com.yandex.plus.home.feature.webviews.internal.uri.i y;
        h v;
        boolean z2;
        com.yandex.plus.home.feature.webviews.internal.uri.s sVar;
        zne zneVar2;
        boolean z3;
        String str3;
        tVar.getClass();
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.s = i2 - Integer.MIN_VALUE;
                Object obj = nVar.q;
                nm6 nm6Var = nm6.a;
                i = nVar.s;
                if (i != 0) {
                    qgg.h0(obj);
                    y = tVar.M.y(eVar.c);
                    v = tVar.v(y, (int) tVar.a.getResources().getDimension(R.dimen.plus_sdk_mu_2), iVar);
                    boolean booleanValue = ((Boolean) tVar.C.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.s a = tVar.q.a(booleanValue, str, str2, map, new com.yandex.plus.home.feature.webviews.internalapi.insets.a(0, 0, 0, 0), aVar);
                    nVar.j = str;
                    nVar.k = zneVar;
                    nVar.l = y;
                    nVar.m = v;
                    nVar.n = a;
                    z2 = z;
                    nVar.o = z2;
                    nVar.p = booleanValue;
                    nVar.s = 1;
                    Object b = a.b(eVar, nVar);
                    if (b != nm6Var) {
                        sVar = a;
                        zneVar2 = zneVar;
                        z3 = booleanValue;
                        str3 = str;
                        obj = b;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    tVar.o(Uri.parse((String) obj));
                    return Unit.a;
                }
                boolean z4 = nVar.p;
                boolean z5 = nVar.o;
                sVar = nVar.n;
                v = nVar.m;
                y = nVar.l;
                zne zneVar3 = nVar.k;
                String str4 = nVar.j;
                qgg.h0(obj);
                z3 = z4;
                zneVar2 = zneVar3;
                str3 = str4;
                z2 = z5;
                h hVar = v;
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = y;
                com.yandex.plus.home.feature.webviews.internal.uri.e eVar2 = (com.yandex.plus.home.feature.webviews.internal.uri.e) obj;
                if (z2) {
                    ce5 ce5Var = tVar.f;
                    eVar2.getClass();
                    sVar.getClass();
                    str3.getClass();
                    iVar2.getClass();
                    zneVar2.getClass();
                    com.yandex.plus.home.feature.webviews.internal.error.c cVar = new com.yandex.plus.home.feature.webviews.internal.error.c((com.yandex.plus.home.api.webview.b) ce5Var.o, (com.yandex.plus.resources.core.a) ce5Var.i);
                    com.yandex.plus.home.feature.webviews.internal.uri.s sVar2 = sVar;
                    boolean z6 = z3;
                    String str5 = str3;
                    tVar.u(hVar, new com.yandex.plus.home.feature.webviews.internal.simple.e((Context) ce5Var.b, new com.yandex.plus.home.feature.webviews.internal.simple.j(eVar2, str5, (ci0) ce5Var.j, z6, (y) ce5Var.d, tVar, (com.yandex.plus.bdui.flex.ui.s) ce5Var.c, sVar2, (kotlinx.coroutines.a) ce5Var.l, (com.yandex.plus.home.analytics.diagnostic.webview.a) ce5Var.g, new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.home.feature.webviews.internal.stories.i) ce5Var.h), (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) ce5Var.k, (com.yandex.plus.core.network.api.interceptors.e) ce5Var.m, (com.yandex.plus.core.network.ssl.a) ce5Var.n), (com.yandex.plus.home.feature.webviews.internal.accessibility.b) ce5Var.f, (com.yandex.plus.resources.core.a) ce5Var.i, new com.yandex.plus.home.feature.webviews.internalapi.toolbar.a(eVar2.d, eVar2.e, eVar2.f, eVar2.g), null, cVar, (com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c) ce5Var.a, new com.yandex.plus.home.feature.webviews.internal.webview.j(z6, nsa.f(((ci0) ce5Var.j).a), str3, (com.yandex.plus.home.analytics.diagnostic.webview.a) ce5Var.g, (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) ce5Var.k, (y) ce5Var.e, (com.yandex.plus.log.api.b) ce5Var.p, (kotlinx.coroutines.a) ce5Var.l), tVar, iVar2, zneVar2));
                    return Unit.a;
                }
                y yVar = tVar.j;
                nVar.j = null;
                nVar.k = null;
                nVar.l = null;
                nVar.m = null;
                nVar.n = null;
                nVar.o = z2;
                nVar.p = z3;
                nVar.s = 2;
                obj = yVar.b(eVar2, nVar);
            }
        }
        nVar = new n(tVar, cg6Var);
        Object obj2 = nVar.q;
        nm6 nm6Var2 = nm6.a;
        i = nVar.s;
        if (i != 0) {
        }
        h hVar2 = v;
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar22 = y;
        com.yandex.plus.home.feature.webviews.internal.uri.e eVar22 = (com.yandex.plus.home.feature.webviews.internal.uri.e) obj2;
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(t tVar, com.yandex.plus.home.feature.webviews.internal.uri.f fVar, String str, String str2, Map map, zne zneVar, com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar, cg6 cg6Var) {
        o oVar;
        int i;
        h v;
        zne zneVar2;
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar;
        boolean z;
        com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar2;
        com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar3;
        String str3;
        boolean z2;
        bi1 bi1Var;
        com.yandex.plus.home.feature.webviews.internalapi.container.c bVar;
        tVar.getClass();
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.u = i2 - Integer.MIN_VALUE;
                Object obj = oVar.s;
                nm6 nm6Var = nm6.a;
                i = oVar.u;
                com.yandex.plus.home.feature.webviews.internalapi.container.c cVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.l lVar = tVar.M;
                    com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = fVar.b;
                    Integer num = fVar.d;
                    com.yandex.plus.home.feature.webviews.internal.uri.i y = lVar.y(iVar2);
                    int dimension = (int) tVar.a.getResources().getDimension(R.dimen.plus_sdk_mu_4);
                    int i3 = tVar.n;
                    int i4 = tVar.o;
                    com.yandex.plus.home.feature.webviews.internal.uri.d dVar = fVar.c;
                    int i5 = dVar == null ? -1 : l.a[dVar.ordinal()];
                    if (i5 != -1) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                b6e.s();
                                return null;
                            }
                            if (num != null) {
                                bVar = new com.yandex.plus.home.feature.webviews.internalapi.container.a(num.intValue());
                                cVar = bVar;
                            }
                        } else if (num != null) {
                            bVar = new com.yandex.plus.home.feature.webviews.internalapi.container.b(num.intValue());
                            cVar = bVar;
                        }
                    }
                    v = tVar.v(y, dimension, new i(i3, i4, cVar, fVar.f, fVar.g));
                    com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar4 = new com.yandex.plus.home.feature.webviews.internalapi.toolbar.a(fVar.h, fVar.i, fVar.j, fVar.k);
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a N = tVar.p.N(zneVar, y, aVar4.a);
                    boolean booleanValue = ((Boolean) tVar.A.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) tVar.E.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.s a = tVar.q.a(booleanValue, str, str2, map, N, aVar);
                    bi1 bi1Var2 = tVar.g;
                    oVar.j = str;
                    oVar.k = zneVar;
                    oVar.l = y;
                    oVar.m = v;
                    oVar.n = aVar4;
                    oVar.o = N;
                    oVar.p = bi1Var2;
                    oVar.q = booleanValue;
                    oVar.r = booleanValue2;
                    oVar.u = 1;
                    Object a2 = a.a(fVar, oVar);
                    if (a2 == nm6Var) {
                        return nm6Var;
                    }
                    zneVar2 = zneVar;
                    iVar = y;
                    z = booleanValue2;
                    aVar2 = N;
                    aVar3 = aVar4;
                    str3 = str;
                    z2 = booleanValue;
                    obj = a2;
                    bi1Var = bi1Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = oVar.r;
                    boolean z4 = oVar.q;
                    bi1 bi1Var3 = oVar.p;
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar5 = oVar.o;
                    com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar6 = oVar.n;
                    v = oVar.m;
                    com.yandex.plus.home.feature.webviews.internal.uri.i iVar3 = oVar.l;
                    zne zneVar3 = oVar.k;
                    String str4 = oVar.j;
                    qgg.h0(obj);
                    z = z3;
                    z2 = z4;
                    str3 = str4;
                    bi1Var = bi1Var3;
                    aVar2 = aVar5;
                    aVar3 = aVar6;
                    iVar = iVar3;
                    zneVar2 = zneVar3;
                }
                com.yandex.plus.home.feature.webviews.internal.uri.f fVar2 = (com.yandex.plus.home.feature.webviews.internal.uri.f) obj;
                x0q x0qVar = tVar.H;
                x0qVar.getClass();
                d dVar2 = new d(x0qVar);
                bi1Var.getClass();
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) bi1Var.b;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.s;
                com.yandex.plus.bdui.plus.content.controller.f fVar4 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.l;
                com.yandex.plus.bdui.plus.content.controller.f fVar5 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.j;
                fVar2.getClass();
                aVar2.getClass();
                aVar3.getClass();
                str3.getClass();
                iVar.getClass();
                zneVar2.getClass();
                com.yandex.plus.home.feature.webviews.internal.error.c cVar2 = new com.yandex.plus.home.feature.webviews.internal.error.c((com.yandex.plus.home.api.webview.b) bi1Var.A, (com.yandex.plus.resources.core.a) bi1Var.r);
                Context context = (Context) bi1Var.a;
                com.yandex.plus.home.auth.f fVar6 = (com.yandex.plus.home.auth.f) bi1Var.c;
                com.yandex.plus.bdui.plus.content.controller.f fVar7 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.home.feature.webviews.internal.stories.i) bi1Var.e);
                kotlinx.coroutines.a aVar7 = (kotlinx.coroutines.a) bi1Var.f;
                kotlinx.coroutines.a aVar8 = (kotlinx.coroutines.a) bi1Var.g;
                kotlinx.coroutines.a aVar9 = (kotlinx.coroutines.a) bi1Var.h;
                com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) bi1Var.z;
                a1 a1Var = (a1) bi1Var.i;
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar10 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) bi1Var.k;
                com.yandex.plus.home.internal.di.y yVar = (com.yandex.plus.home.internal.di.y) bi1Var.m;
                com.yandex.plus.home.analytics.diagnostic.messaging.a aVar11 = (com.yandex.plus.home.analytics.diagnostic.messaging.a) bi1Var.o;
                com.yandex.plus.home.analytics.diagnostic.messaging.b bVar2 = (com.yandex.plus.home.analytics.diagnostic.messaging.b) bi1Var.q;
                com.yandex.plus.home.analytics.f fVar8 = (com.yandex.plus.home.analytics.f) bi1Var.p;
                com.yandex.plus.bdui.plus.content.controller.f fVar9 = new com.yandex.plus.bdui.plus.content.controller.f(fVar4, hVar);
                com.yandex.plus.home.api.prefetch.l lVar2 = (com.yandex.plus.home.api.prefetch.l) bi1Var.t;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar12 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) bi1Var.u;
                bi1 bi1Var4 = bi1Var;
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar4 = iVar;
                tVar.u(v, new com.yandex.plus.home.feature.webviews.internal.smart.i(context, new com.yandex.plus.home.feature.webviews.internal.smart.e(fVar3, fVar2, fVar6, fVar7, aVar7, aVar9, aVar8, hVar, a1Var, fVar5, dVar2, aVar10, sVar, tVar, yVar, fVar4, aVar11, bVar2, (com.yandex.plus.home.analytics.diagnostic.webview.a) bi1Var.v, fVar8, fVar9, lVar2, aVar12, str3, z2, z, (a1) bi1Var.w, (com.yandex.plus.core.network.api.interceptors.e) bi1Var.y, (ci0) bi1Var.C, (com.yandex.plus.core.network.ssl.a) bi1Var.x), (com.yandex.plus.home.feature.webviews.internal.accessibility.b) bi1Var4.d, iVar4, (com.yandex.plus.resources.core.a) bi1Var4.r, aVar3, null, cVar2, (com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c) bi1Var4.B, zneVar2, aVar2, new com.yandex.plus.home.feature.webviews.internal.smart.contract.d(z2, z, nsa.f(((ci0) bi1Var4.C).a), new com.yandex.plus.home.feature.webviews.internal.smart.contract.b(tVar, sVar, fVar3, (com.yandex.plus.home.analytics.f) bi1Var4.p, (a1) bi1Var4.i, fVar5, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) bi1Var4.k, (com.yandex.plus.home.analytics.diagnostic.webview.a) bi1Var4.v, (com.yandex.plus.home.analytics.diagnostic.messaging.b) bi1Var4.q, (com.yandex.plus.home.internal.di.y) bi1Var4.m, (Function0) bi1Var4.n, fVar4, (com.yandex.plus.log.api.b) bi1Var4.D, (kotlinx.coroutines.a) bi1Var4.h, (kotlinx.coroutines.a) bi1Var4.f, (kotlinx.coroutines.a) bi1Var4.g), new w((com.yandex.plus.home.auth.f) bi1Var4.c), new com.yandex.plus.home.feature.webviews.internal.f(3, bi1Var4), (Function0) bi1Var4.n, (kotlinx.coroutines.a) bi1Var4.f), tVar));
                return Unit.a;
            }
        }
        oVar = new o(tVar, cg6Var);
        Object obj2 = oVar.s;
        nm6 nm6Var2 = nm6.a;
        i = oVar.u;
        com.yandex.plus.home.feature.webviews.internalapi.container.c cVar3 = null;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.webviews.internal.uri.f fVar22 = (com.yandex.plus.home.feature.webviews.internal.uri.f) obj2;
        x0q x0qVar2 = tVar.H;
        x0qVar2.getClass();
        d dVar22 = new d(x0qVar2);
        bi1Var.getClass();
        com.yandex.plus.bdui.flex.ui.s sVar2 = (com.yandex.plus.bdui.flex.ui.s) bi1Var.b;
        com.yandex.plus.bdui.plus.content.controller.f fVar32 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.s;
        com.yandex.plus.bdui.plus.content.controller.f fVar42 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.l;
        com.yandex.plus.bdui.plus.content.controller.f fVar52 = (com.yandex.plus.bdui.plus.content.controller.f) bi1Var.j;
        fVar22.getClass();
        aVar2.getClass();
        aVar3.getClass();
        str3.getClass();
        iVar.getClass();
        zneVar2.getClass();
        com.yandex.plus.home.feature.webviews.internal.error.c cVar22 = new com.yandex.plus.home.feature.webviews.internal.error.c((com.yandex.plus.home.api.webview.b) bi1Var.A, (com.yandex.plus.resources.core.a) bi1Var.r);
        Context context2 = (Context) bi1Var.a;
        com.yandex.plus.home.auth.f fVar62 = (com.yandex.plus.home.auth.f) bi1Var.c;
        com.yandex.plus.bdui.plus.content.controller.f fVar72 = new com.yandex.plus.bdui.plus.content.controller.f((com.yandex.plus.home.feature.webviews.internal.stories.i) bi1Var.e);
        kotlinx.coroutines.a aVar72 = (kotlinx.coroutines.a) bi1Var.f;
        kotlinx.coroutines.a aVar82 = (kotlinx.coroutines.a) bi1Var.g;
        kotlinx.coroutines.a aVar92 = (kotlinx.coroutines.a) bi1Var.h;
        com.yandex.passport.internal.core.accounts.h hVar2 = (com.yandex.passport.internal.core.accounts.h) bi1Var.z;
        a1 a1Var2 = (a1) bi1Var.i;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar102 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) bi1Var.k;
        com.yandex.plus.home.internal.di.y yVar2 = (com.yandex.plus.home.internal.di.y) bi1Var.m;
        com.yandex.plus.home.analytics.diagnostic.messaging.a aVar112 = (com.yandex.plus.home.analytics.diagnostic.messaging.a) bi1Var.o;
        com.yandex.plus.home.analytics.diagnostic.messaging.b bVar22 = (com.yandex.plus.home.analytics.diagnostic.messaging.b) bi1Var.q;
        com.yandex.plus.home.analytics.f fVar82 = (com.yandex.plus.home.analytics.f) bi1Var.p;
        com.yandex.plus.bdui.plus.content.controller.f fVar92 = new com.yandex.plus.bdui.plus.content.controller.f(fVar42, hVar2);
        com.yandex.plus.home.api.prefetch.l lVar22 = (com.yandex.plus.home.api.prefetch.l) bi1Var.t;
        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar122 = (com.yandex.plus.home.feature.webviews.internalapi.analytics.a) bi1Var.u;
        bi1 bi1Var42 = bi1Var;
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar42 = iVar;
        tVar.u(v, new com.yandex.plus.home.feature.webviews.internal.smart.i(context2, new com.yandex.plus.home.feature.webviews.internal.smart.e(fVar32, fVar22, fVar62, fVar72, aVar72, aVar92, aVar82, hVar2, a1Var2, fVar52, dVar22, aVar102, sVar2, tVar, yVar2, fVar42, aVar112, bVar22, (com.yandex.plus.home.analytics.diagnostic.webview.a) bi1Var.v, fVar82, fVar92, lVar22, aVar122, str3, z2, z, (a1) bi1Var.w, (com.yandex.plus.core.network.api.interceptors.e) bi1Var.y, (ci0) bi1Var.C, (com.yandex.plus.core.network.ssl.a) bi1Var.x), (com.yandex.plus.home.feature.webviews.internal.accessibility.b) bi1Var42.d, iVar42, (com.yandex.plus.resources.core.a) bi1Var42.r, aVar3, null, cVar22, (com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c) bi1Var42.B, zneVar2, aVar2, new com.yandex.plus.home.feature.webviews.internal.smart.contract.d(z2, z, nsa.f(((ci0) bi1Var42.C).a), new com.yandex.plus.home.feature.webviews.internal.smart.contract.b(tVar, sVar2, fVar32, (com.yandex.plus.home.analytics.f) bi1Var42.p, (a1) bi1Var42.i, fVar52, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) bi1Var42.k, (com.yandex.plus.home.analytics.diagnostic.webview.a) bi1Var42.v, (com.yandex.plus.home.analytics.diagnostic.messaging.b) bi1Var42.q, (com.yandex.plus.home.internal.di.y) bi1Var42.m, (Function0) bi1Var42.n, fVar42, (com.yandex.plus.log.api.b) bi1Var42.D, (kotlinx.coroutines.a) bi1Var42.h, (kotlinx.coroutines.a) bi1Var42.f, (kotlinx.coroutines.a) bi1Var42.g), new w((com.yandex.plus.home.auth.f) bi1Var42.c), new com.yandex.plus.home.feature.webviews.internal.f(3, bi1Var42), (Function0) bi1Var42.n, (kotlinx.coroutines.a) bi1Var42.f), tVar));
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.yandex.plus.home.feature.webviews.internal.uri.k] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0126 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(final t tVar, ArrayList arrayList, String str, zne zneVar, i iVar, com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar, cg6 cg6Var) {
        p pVar;
        int i;
        String str2;
        i iVar2;
        boolean z;
        o77 o77Var;
        ArrayList arrayList2;
        boolean z2;
        int i2;
        String str3;
        com.yandex.plus.home.feature.webviews.internal.uri.s sVar;
        Iterator it;
        Map map;
        int i3;
        boolean z3;
        final zne zneVar2;
        boolean z4;
        tVar.getClass();
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i4 = pVar.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.C = i4 - Integer.MIN_VALUE;
                Object obj = pVar.A;
                nm6 nm6Var = nm6.a;
                i = pVar.C;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a N = tVar.p.N(zneVar, com.yandex.plus.home.feature.webviews.internal.uri.i.b, false);
                    boolean booleanValue = ((Boolean) tVar.B.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) tVar.F.invoke()).booleanValue();
                    str2 = null;
                    com.yandex.plus.home.feature.webviews.internal.uri.s a = tVar.q.a(booleanValue, str, null, null, N, aVar);
                    o77 o77Var2 = tVar.e;
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    iVar2 = iVar;
                    z = booleanValue2;
                    o77Var = o77Var2;
                    arrayList2 = arrayList3;
                    z2 = booleanValue;
                    i2 = 0;
                    str3 = str;
                    sVar = a;
                    it = it2;
                    map = null;
                    i3 = 0;
                    z3 = z;
                    zneVar2 = zneVar;
                    z4 = z2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = pVar.x;
                    boolean z6 = pVar.w;
                    i2 = pVar.z;
                    int i5 = pVar.y;
                    boolean z7 = pVar.v;
                    boolean z8 = pVar.u;
                    Collection collection = pVar.t;
                    o77 o77Var3 = pVar.s;
                    com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar = pVar.r;
                    Iterator it3 = pVar.q;
                    Collection collection2 = pVar.p;
                    ?? r13 = pVar.o;
                    i iVar3 = pVar.n;
                    zne zneVar3 = pVar.m;
                    Map map2 = pVar.l;
                    String str4 = pVar.k;
                    String str5 = pVar.j;
                    qgg.h0(obj);
                    String str6 = str5;
                    Object obj2 = obj;
                    i iVar4 = iVar3;
                    p pVar2 = pVar;
                    boolean z9 = z6;
                    int i6 = i5;
                    boolean z10 = z8;
                    o77 o77Var4 = o77Var3;
                    com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar2 = jVar;
                    Iterator it4 = it3;
                    zne zneVar4 = zneVar3;
                    boolean z11 = z5;
                    z3 = z7;
                    ArrayList arrayList4 = collection;
                    ArrayList arrayList5 = collection2;
                    com.yandex.plus.home.feature.webviews.internal.uri.s sVar2 = r13;
                    map = map2;
                    String str7 = str4;
                    com.yandex.plus.home.feature.webviews.internal.uri.g gVar = (com.yandex.plus.home.feature.webviews.internal.uri.g) obj2;
                    int i7 = i6;
                    boolean z12 = jVar2.b;
                    String str8 = jVar2.c;
                    gVar.getClass();
                    arrayList4.add(new com.yandex.plus.home.feature.webviews.internal.stories.list.j(gVar, z12, str8));
                    i3 = i7;
                    pVar = pVar2;
                    arrayList2 = arrayList5;
                    z4 = z10;
                    it = it4;
                    str2 = str7;
                    sVar = sVar2;
                    zneVar2 = zneVar4;
                    z = z11;
                    str3 = str6;
                    iVar2 = iVar4;
                    z2 = z9;
                    o77Var = o77Var4;
                    if (it.hasNext()) {
                        map2 = map;
                        com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar3 = (com.yandex.plus.home.feature.webviews.internal.stories.list.j) it.next();
                        com.yandex.plus.home.feature.webviews.internal.uri.g gVar2 = jVar3.a;
                        pVar.j = str3;
                        pVar.k = str2;
                        str6 = str3;
                        pVar.l = map2;
                        pVar.m = zneVar2;
                        pVar.n = iVar2;
                        pVar.o = sVar;
                        ArrayList arrayList6 = arrayList2;
                        pVar.p = arrayList6;
                        str4 = str2;
                        it4 = it;
                        pVar.q = it4;
                        pVar.r = jVar3;
                        pVar.s = o77Var;
                        pVar.t = arrayList6;
                        pVar.u = z4;
                        pVar.v = z3;
                        pVar.y = i3;
                        pVar.z = i2;
                        pVar.w = z2;
                        pVar.x = z;
                        pVar.C = 1;
                        Object c = sVar.c(gVar2, pVar);
                        if (c == nm6Var) {
                            return nm6Var;
                        }
                        p pVar3 = pVar;
                        i6 = i3;
                        obj2 = c;
                        pVar2 = pVar3;
                        jVar2 = jVar3;
                        iVar4 = iVar2;
                        z9 = z2;
                        o77Var4 = o77Var;
                        sVar2 = sVar;
                        zneVar4 = zneVar2;
                        z11 = z;
                        arrayList4 = arrayList2;
                        z10 = z4;
                        arrayList5 = arrayList4;
                        map = map2;
                        String str72 = str4;
                        com.yandex.plus.home.feature.webviews.internal.uri.g gVar3 = (com.yandex.plus.home.feature.webviews.internal.uri.g) obj2;
                        int i72 = i6;
                        boolean z122 = jVar2.b;
                        String str82 = jVar2.c;
                        gVar3.getClass();
                        arrayList4.add(new com.yandex.plus.home.feature.webviews.internal.stories.list.j(gVar3, z122, str82));
                        i3 = i72;
                        pVar = pVar2;
                        arrayList2 = arrayList5;
                        z4 = z10;
                        it = it4;
                        str2 = str72;
                        sVar = sVar2;
                        zneVar2 = zneVar4;
                        z = z11;
                        str3 = str6;
                        iVar2 = iVar4;
                        z2 = z9;
                        o77Var = o77Var4;
                        if (it.hasNext()) {
                            final String str9 = str3;
                            final Map map3 = map;
                            final String str10 = str2;
                            ArrayList arrayList7 = arrayList2;
                            final String str11 = (String) tVar.v.invoke();
                            x0q x0qVar = tVar.H;
                            x0qVar.getClass();
                            final d dVar = new d(x0qVar);
                            int i8 = 0;
                            int i9 = 0;
                            final com.yandex.plus.home.analytics.evgen.c cVar = new com.yandex.plus.home.analytics.evgen.c(i9, tVar, t.class, "onNativePaySuccess", "onNativePaySuccess()V", i8, 7);
                            final com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(i9, tVar, t.class, "onHostPaySuccess", "onHostPaySuccess()V", i8, 8);
                            o77Var.getClass();
                            arrayList7.getClass();
                            str9.getClass();
                            zneVar2.getClass();
                            final o77 o77Var5 = o77Var;
                            final boolean z13 = z;
                            final boolean z14 = z2;
                            tVar.u(new h(iVar2, 0), new com.yandex.plus.home.feature.webviews.internal.stories.list.f((Context) o77Var.p, new Function1() { // from class: com.yandex.plus.home.feature.webviews.internal.container.factory.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    j jVar4 = (j) obj3;
                                    jVar4.getClass();
                                    return o77.this.a(z14, z13, jVar4.a, jVar4.c, str11, dVar, str9, str10, map3, cVar, cVar2, false, zneVar2, false, tVar);
                                }
                            }, new com.yandex.plus.home.feature.webviews.internal.stories.list.i(arrayList7, (kotlinx.coroutines.a) o77Var5.c), tVar));
                            return Unit.a;
                        }
                    }
                }
            }
        }
        pVar = new p(tVar, cg6Var);
        Object obj3 = pVar.A;
        nm6 nm6Var2 = nm6.a;
        i = pVar.C;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(t tVar, com.yandex.plus.home.feature.webviews.internal.uri.g gVar, String str, String str2, Map map, String str3, zne zneVar, i iVar, com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar, cg6 cg6Var) {
        q qVar;
        int i;
        zne zneVar2;
        h hVar;
        boolean z;
        o77 o77Var;
        String str4;
        boolean z2;
        String str5;
        String str6;
        Map map2;
        tVar.getClass();
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.u = i2 - Integer.MIN_VALUE;
                Object obj = qVar.s;
                nm6 nm6Var = nm6.a;
                i = qVar.u;
                if (i != 0) {
                    qgg.h0(obj);
                    h hVar2 = new h(iVar, 0);
                    com.yandex.plus.home.feature.webviews.internalapi.insets.a N = tVar.p.N(zneVar, com.yandex.plus.home.feature.webviews.internal.uri.i.b, false);
                    boolean booleanValue = ((Boolean) tVar.B.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) tVar.F.invoke()).booleanValue();
                    com.yandex.plus.home.feature.webviews.internal.uri.s a = tVar.q.a(booleanValue, str, str2, map, N, aVar);
                    o77 o77Var2 = tVar.e;
                    qVar.j = str;
                    qVar.k = str2;
                    qVar.l = map;
                    qVar.m = str3;
                    qVar.n = zneVar;
                    qVar.o = hVar2;
                    qVar.p = o77Var2;
                    qVar.q = booleanValue;
                    qVar.r = booleanValue2;
                    qVar.u = 1;
                    Object c = a.c(gVar, qVar);
                    if (c == nm6Var) {
                        return nm6Var;
                    }
                    zneVar2 = zneVar;
                    hVar = hVar2;
                    obj = c;
                    z = booleanValue2;
                    o77Var = o77Var2;
                    str4 = str3;
                    z2 = booleanValue;
                    str5 = str;
                    str6 = str2;
                    map2 = map;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = qVar.r;
                    z2 = qVar.q;
                    o77 o77Var3 = qVar.p;
                    hVar = qVar.o;
                    zne zneVar3 = qVar.n;
                    String str7 = qVar.m;
                    Map map3 = qVar.l;
                    String str8 = qVar.k;
                    String str9 = qVar.j;
                    qgg.h0(obj);
                    z = z3;
                    o77Var = o77Var3;
                    str4 = str7;
                    str5 = str9;
                    map2 = map3;
                    str6 = str8;
                    zneVar2 = zneVar3;
                }
                String str10 = (String) tVar.v.invoke();
                x0q x0qVar = tVar.H;
                x0qVar.getClass();
                d dVar = new d(x0qVar);
                int i3 = 0;
                int i4 = 0;
                com.yandex.plus.home.analytics.evgen.c cVar = new com.yandex.plus.home.analytics.evgen.c(i4, tVar, t.class, "onNativePaySuccess", "onNativePaySuccess()V", i3, 9);
                com.yandex.plus.home.analytics.evgen.c cVar2 = new com.yandex.plus.home.analytics.evgen.c(i4, tVar, t.class, "onHostPaySuccess", "onHostPaySuccess()V", i3, 10);
                tVar.u(hVar, o77Var.a(z2, z, (com.yandex.plus.home.feature.webviews.internal.uri.g) obj, str4, str10, dVar, str5, str6, map2, cVar, cVar2, true, zneVar2, true, tVar));
                return Unit.a;
            }
        }
        qVar = new q(tVar, cg6Var);
        Object obj2 = qVar.s;
        nm6 nm6Var2 = nm6.a;
        i = qVar.u;
        if (i != 0) {
        }
        String str102 = (String) tVar.v.invoke();
        x0q x0qVar2 = tVar.H;
        x0qVar2.getClass();
        d dVar2 = new d(x0qVar2);
        int i32 = 0;
        int i42 = 0;
        com.yandex.plus.home.analytics.evgen.c cVar3 = new com.yandex.plus.home.analytics.evgen.c(i42, tVar, t.class, "onNativePaySuccess", "onNativePaySuccess()V", i32, 9);
        com.yandex.plus.home.analytics.evgen.c cVar22 = new com.yandex.plus.home.analytics.evgen.c(i42, tVar, t.class, "onHostPaySuccess", "onHostPaySuccess()V", i32, 10);
        tVar.u(hVar, o77Var.a(z2, z, (com.yandex.plus.home.feature.webviews.internal.uri.g) obj2, str4, str102, dVar2, str5, str6, map2, cVar3, cVar22, true, zneVar2, true, tVar));
        return Unit.a;
    }

    public final int j() {
        Object obj;
        c7 c7Var = new c7(8, this.K);
        if (c7Var.hasNext()) {
            Object next = c7Var.next();
            while (c7Var.hasNext()) {
                next = c7Var.next();
            }
            obj = next;
        } else {
            obj = null;
        }
        return Intrinsics.d(obj, this.L) ? 2 : 1;
    }

    public final void k() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewsControllerImpl", "closeTopDeeplink(): stackSize=" + this.K.getChildCount());
        }
        a l = l();
        if (l != null) {
            l.r();
        }
    }

    public final a l() {
        Object next;
        FrameLayout frameLayout = this.K;
        c7 c7Var = new c7(8, frameLayout);
        if (c7Var.hasNext()) {
            next = c7Var.next();
            while (c7Var.hasNext()) {
                next = c7Var.next();
            }
        } else {
            next = null;
        }
        KeyEvent.Callback callback = (View) next;
        if (frameLayout.getChildCount() <= 1 || !Intrinsics.d(callback, this.L)) {
            if (callback instanceof a) {
                return (a) callback;
            }
            return null;
        }
        KeyEvent.Callback childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 2);
        if (childAt instanceof a) {
            return (a) childAt;
        }
        return null;
    }

    public final void m(Function1 function1) {
        function1.getClass();
        tf6 tf6Var = this.I;
        if (tf6Var == null) {
            function1.invoke(new Uri[0]);
        } else {
            x97.y(tf6Var, null, null, new com.yandex.plus.bdui.ui.b(this, function1, null, 19), 3);
        }
    }

    public final boolean n() {
        Object next;
        FrameLayout frameLayout = this.K;
        if (frameLayout.getChildCount() != 1) {
            return false;
        }
        c7 c7Var = new c7(8, frameLayout);
        if (c7Var.hasNext()) {
            next = c7Var.next();
            while (c7Var.hasNext()) {
                next = c7Var.next();
            }
        } else {
            next = null;
        }
        return Intrinsics.d(next, this.L);
    }

    public final void o(Uri uri) {
        this.r.a(uri);
        if (this.K.getChildCount() == 0 || n()) {
            this.H.a(com.yandex.plus.home.api.state.a.b);
        }
    }

    public final void p(zne zneVar, com.yandex.plus.home.feature.webviews.internal.serviceinfo.b bVar) {
        k kVar = new k();
        zneVar.getClass();
        com.yandex.plus.bdui.flex.ui.s sVar = this.h;
        com.yandex.passport.sloth.ui.c cVar = (com.yandex.passport.sloth.ui.c) sVar.e;
        Context context = (Context) sVar.b;
        com.yandex.passport.internal.core.accounts.h hVar = new com.yandex.passport.internal.core.accounts.h(cVar, context, "plus_sdk_logs_%s.txt");
        sVar.B();
        kotlinx.coroutines.a aVar = (kotlinx.coroutines.a) sVar.a;
        com.yandex.passport.sloth.ui.c cVar2 = new com.yandex.passport.sloth.ui.c(8, sVar);
        com.yandex.passport.internal.ui.sloth.ebs.i iVar = new com.yandex.passport.internal.ui.sloth.ebs.i(10, sVar, bVar, zneVar);
        aVar.getClass();
        com.yandex.plus.core.debug.panel.internal.presentation.builder.a aVar2 = new com.yandex.plus.core.debug.panel.internal.presentation.builder.a(this, cVar2, aVar, hVar);
        iVar.invoke(aVar2);
        xdr xdrVar = aVar2.c;
        zne zneVar2 = aVar2.d;
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar3 = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
        u(kVar, new com.yandex.plus.home.feature.webviews.internal.serviceinfo.a(new com.yandex.plus.core.debug.panel.internal.presentation.controller.b(context, new com.yandex.plus.bdui.flex.ui.s(aVar2.a, aVar2.b, xdrVar, aVar, this, cVar2, hVar, new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a(), aVar3, zneVar2), zneVar2, aVar, hVar)));
    }

    public final void q(Collection collection, Function1 function1) {
        collection.getClass();
        function1.getClass();
        if (!((Boolean) this.G.invoke()).booleanValue()) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            function1.invoke(e5bVar);
            return;
        }
        tf6 tf6Var = this.I;
        if (tf6Var != null) {
            x97.y(tf6Var, null, null, new com.yandex.plus.home.api.prefetch.j(collection, this, function1, null, 12), 3);
        } else {
            e5b e5bVar2 = e5b.a;
            e5bVar2.getClass();
            function1.invoke(e5bVar2);
        }
    }

    public final boolean r() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewsControllerImpl", "routeBack(): stackSize=" + this.K.getChildCount());
        }
        a l = l();
        return l != null && l.e();
    }

    public final void s(com.yandex.plus.home.feature.webviews.internal.serviceinfo.b bVar) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar2 = this.u;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "WebViewsControllerImpl", "routeToDebugPanel(" + bVar + ')');
        }
        zne zneVar = (zne) this.J.getValue();
        if (zneVar == null) {
            zneVar = zne.e;
        }
        p(zneVar, bVar);
    }

    public final void t(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewsControllerImpl", dfi.i(f1d.m("routeToNativeSharing(", str, ", ", str2, ", "), str3, ')'));
        }
        this.s.a(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.yandex.plus.home.feature.webviews.internal.container.g] */
    public final void u(b bVar, c cVar) {
        c cVar2;
        j jVar;
        a l;
        boolean z = bVar instanceof h;
        Context context = this.a;
        boolean z2 = true;
        FrameLayout frameLayout = this.K;
        if (z) {
            h hVar = (h) bVar;
            int i = hVar.b;
            i iVar = hVar.a;
            if (frameLayout.getChildCount() != 0 && !n()) {
                LinkedList linkedList = (LinkedList) this.M.a;
                if (((com.yandex.plus.home.feature.webviews.internal.uri.i) CollectionsKt.S(linkedList, u75.g(linkedList) - 1)) != com.yandex.plus.home.feature.webviews.internal.uri.i.b) {
                    z2 = false;
                }
            }
            ?? gVar = new g(context, i, this.k, iVar, z2, cVar, new com.yandex.plus.home.analytics.evgen.c(0, this, t.class, "onWebViewContainerHidden", "onWebViewContainerHidden()V", 0, 11));
            cVar2 = cVar;
            jVar = gVar;
        } else {
            cVar2 = cVar;
            if (!(bVar instanceof k)) {
                b6e.s();
                return;
            }
            jVar = new j(context, true, cVar2, new com.yandex.plus.home.analytics.evgen.c(0, this, t.class, "onWebViewContainerHidden", "onWebViewContainerHidden()V", 0, 12));
        }
        if (frameLayout.getChildCount() != 0 && (l = l()) != null) {
            l.l();
        }
        jVar.addOnAttachStateChangeListener(new com.yandex.passport.internal.ui.bouncer.roundabout.n(6, this, new s(jVar)));
        frameLayout.addView(jVar);
        if (!jVar.isLaidOut() || jVar.isLayoutRequested()) {
            jVar.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(4, jVar));
        } else {
            jVar.f();
        }
        if (cVar2 instanceof com.yandex.plus.home.feature.webviews.internal.serviceinfo.a) {
            return;
        }
        this.L.bringToFront();
    }

    public final h v(com.yandex.plus.home.feature.webviews.internal.uri.i iVar, int i, i iVar2) {
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new h(iVar2, i);
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        if (this.c instanceof com.yandex.plus.home.api.webview.a) {
            return new h(iVar2, 0);
        }
        b6e.s();
        return null;
    }

    public final boolean w(Uri uri) {
        uri.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.u;
        if (bVar.b(aVar)) {
            StringBuilder sb = new StringBuilder("tryRouteToTreasury(");
            sb.append(uri);
            sb.append(", isTreasuryAdapterExist=");
            bVar.c(aVar, "WebViewsControllerImpl", dfi.j(sb, false, ')'));
        }
        return false;
    }
}
