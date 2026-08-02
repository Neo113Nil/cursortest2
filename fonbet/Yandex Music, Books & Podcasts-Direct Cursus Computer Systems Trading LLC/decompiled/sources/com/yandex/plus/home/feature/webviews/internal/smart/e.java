package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.api.prefetch.l;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.internal.di.y;
import defpackage.bsh;
import defpackage.btf;
import defpackage.ci0;
import defpackage.evj;
import defpackage.jyr;
import defpackage.rar;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class e extends bsh implements com.yandex.plus.home.feature.webviews.internal.bridge.c, com.yandex.plus.webview.core.i {
    public final String A;
    public final boolean B;
    public final a1 C;
    public final com.yandex.plus.core.network.api.interceptors.e D;
    public final ci0 E;
    public final com.yandex.plus.core.network.ssl.a F;
    public final jyr G;
    public rar H;
    public final evj I;
    public final jyr J;
    public final d K;
    public final com.yandex.plus.home.feature.webviews.internal.uri.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;
    public final kotlinx.coroutines.a i;
    public final kotlinx.coroutines.a j;
    public final kotlinx.coroutines.a k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final a1 m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final com.yandex.plus.home.feature.webviews.internal.container.d o;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a p;
    public final s q;
    public final u r;
    public final y s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.b u;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a v;
    public final com.yandex.plus.home.analytics.f w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final l y;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internal.uri.f fVar2, com.yandex.plus.home.auth.f fVar3, com.yandex.plus.bdui.plus.content.controller.f fVar4, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, com.yandex.passport.internal.core.accounts.h hVar, a1 a1Var, com.yandex.plus.bdui.plus.content.controller.f fVar5, com.yandex.plus.home.feature.webviews.internal.container.d dVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar4, s sVar, t tVar, y yVar, com.yandex.plus.bdui.plus.content.controller.f fVar6, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar5, com.yandex.plus.home.analytics.diagnostic.messaging.b bVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar6, com.yandex.plus.home.analytics.f fVar7, com.yandex.plus.bdui.plus.content.controller.f fVar8, l lVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar7, String str, boolean z, boolean z2, a1 a1Var2, com.yandex.plus.core.network.api.interceptors.e eVar, ci0 ci0Var, com.yandex.plus.core.network.ssl.a aVar8) {
        super(new b(), aVar);
        fVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        hVar.getClass();
        a1Var.getClass();
        aVar4.getClass();
        tVar.getClass();
        yVar.getClass();
        aVar5.getClass();
        bVar.getClass();
        aVar6.getClass();
        fVar7.getClass();
        lVar.getClass();
        aVar7.getClass();
        eVar.getClass();
        ci0Var.getClass();
        this.g = fVar2;
        this.h = fVar4;
        this.i = aVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = hVar;
        this.m = a1Var;
        this.n = fVar5;
        this.o = dVar;
        this.p = aVar4;
        this.q = sVar;
        this.r = tVar;
        this.s = yVar;
        this.t = fVar6;
        this.u = bVar;
        this.v = aVar6;
        this.w = fVar7;
        this.x = fVar8;
        this.y = lVar;
        this.z = aVar7;
        this.A = str;
        this.B = z;
        this.C = a1Var2;
        this.D = eVar;
        this.E = ci0Var;
        this.F = aVar8;
        this.G = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(5, this));
        this.I = new evj();
        this.J = btf.b(new a(fVar, 0));
        this.K = new d(this, fVar2.a.toString(), fVar3, aVar5, tVar, sVar, z2, aVar);
    }

    @Override // defpackage.bsh
    public final void L() {
        d dVar = this.K;
        dVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onResume()", null);
        dVar.a(new u6(14));
        this.I.j();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            h0("ssl error", str);
        }
        this.v.e(i, str, str2, str3, z);
    }

    @Override // defpackage.bsh
    public final void h() {
        rar rarVar = this.H;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.H = null;
        super.h();
        com.yandex.plus.bdui.plus.analytics.b.d(this.K.h);
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "detachView()", null);
        evj evjVar = this.I;
        evjVar.a = false;
        evjVar.c();
    }

    public final void h0(String str, String str2) {
        if (!this.B) {
            rar rarVar = this.H;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.H = null;
        }
        this.h.p();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, str, null);
        ((j) this.e).c(str);
        if (str2 == null) {
            str2 = this.K.g;
        }
        this.z.d(this.A, str2);
    }

    public final void i0() {
        this.h.p();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "web view timeout", null);
        ((j) this.e).c("loading timeout");
        String uri = this.g.a.toString();
        this.v.d(this.E.a, uri);
        this.z.d(this.A, this.K.g);
    }

    public final void j0(v1 v1Var) {
        if (this.B) {
            ((j) this.e).d(v1Var);
        } else {
            ((c) this.G.getValue()).A(v1Var);
        }
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            h0(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.v.c(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.bridge.c
    public final void onMessage(String str) {
        str.getClass();
        ((c) this.G.getValue()).onMessage(str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (z) {
            h0(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.v.b(i, str, str2, str3, z);
    }

    @Override // defpackage.bsh
    public final void w() {
        this.K.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onPause()", null);
        this.I.g();
    }
}
