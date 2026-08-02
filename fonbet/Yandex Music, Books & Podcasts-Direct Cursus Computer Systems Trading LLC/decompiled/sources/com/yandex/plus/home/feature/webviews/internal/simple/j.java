package com.yandex.plus.home.feature.webviews.internal.simple;

import android.net.Uri;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.uri.k;
import com.yandex.plus.home.feature.webviews.internal.uri.y;
import defpackage.bsh;
import defpackage.cg6;
import defpackage.ci0;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.rar;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j extends bsh implements com.yandex.plus.webview.core.i {
    public final com.yandex.plus.home.feature.webviews.internal.uri.e g;
    public final String h;
    public final ci0 i;
    public final boolean j;
    public final y k;
    public final u l;
    public final s m;
    public final k n;
    public final kotlinx.coroutines.a o;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a p;
    public final com.yandex.plus.bdui.plus.content.controller.f q;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a r;
    public final com.yandex.plus.core.network.api.interceptors.e s;
    public final com.yandex.plus.core.network.ssl.a t;
    public String u;
    public boolean v;
    public boolean w;
    public rar x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.yandex.plus.home.feature.webviews.internal.uri.e eVar, String str, ci0 ci0Var, boolean z, y yVar, t tVar, s sVar, k kVar, kotlinx.coroutines.a aVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar3, com.yandex.plus.core.network.api.interceptors.e eVar2, com.yandex.plus.core.network.ssl.a aVar4) {
        super(new f(), aVar);
        ci0Var.getClass();
        tVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        eVar2.getClass();
        this.g = eVar;
        this.h = str;
        this.i = ci0Var;
        this.j = z;
        this.k = yVar;
        this.l = tVar;
        this.m = sVar;
        this.n = kVar;
        this.o = aVar;
        this.p = aVar2;
        this.q = fVar;
        this.r = aVar3;
        this.s = eVar2;
        this.t = aVar4;
        String uri = eVar.a.toString();
        uri.getClass();
        this.u = uri;
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "init()", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h0(j jVar, String str, cg6 cg6Var) {
        i iVar;
        int i;
        String str2;
        j jVar2;
        jVar.getClass();
        boolean z = jVar.j;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.n = i2 - Integer.MIN_VALUE;
                Object obj = iVar.l;
                nm6 nm6Var = nm6.a;
                i = iVar.n;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    iVar.j = str;
                    iVar.k = jVar;
                    iVar.n = 1;
                    if (!z) {
                        y yVar = jVar.k;
                        Object r = yVar.a.r(Uri.parse(str));
                        if (r instanceof t7o) {
                            r = null;
                        }
                        com.yandex.plus.home.feature.webviews.internal.uri.j jVar3 = (com.yandex.plus.home.feature.webviews.internal.uri.j) r;
                        if (jVar3 instanceof com.yandex.plus.home.feature.webviews.internal.uri.e) {
                            obj = yVar.b((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar3, iVar);
                            if (obj != nm6Var) {
                                return nm6Var;
                            }
                            str2 = str;
                            jVar2 = jVar;
                        }
                    }
                    obj = str;
                    if (obj != nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar2 = iVar.k;
                    str2 = iVar.j;
                    qgg.h0(obj);
                }
                jVar2.u = (String) obj;
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                StringBuilder u = ouj.u("loadUriInternal(uriString=", str2, "), currentUrl=");
                u.append(jVar.u);
                String sb = u.toString();
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, sb, null);
                jVar.w = false;
                ((g) jVar.e).d();
                ((g) jVar.e).h();
                ((g) jVar.e).j(jVar.u);
                if (!z) {
                    rar rarVar = jVar.x;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    jVar.x = x97.y(jVar.l(), jVar.o, null, new h(jVar, continuation, i3), 2);
                }
                return Unit.a;
            }
        }
        iVar = new i(jVar, cg6Var);
        Object obj2 = iVar.l;
        nm6 nm6Var2 = nm6.a;
        i = iVar.n;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        jVar2.u = (String) obj2;
        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.b;
        StringBuilder u2 = ouj.u("loadUriInternal(uriString=", str2, "), currentUrl=");
        u2.append(jVar.u);
        String sb2 = u2.toString();
        jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, sb2, null);
        jVar.w = false;
        ((g) jVar.e).d();
        ((g) jVar.e).h();
        ((g) jVar.e).j(jVar.u);
        if (!z) {
        }
        return Unit.a;
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        this.p.e(i, str, str2, str3, z);
        if (z) {
            k0("ssl error", str);
        }
    }

    public final void i0() {
        this.q.q(this.u);
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String str = "onWebPageReady() url=" + this.u;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
        ((g) this.e).g();
        this.r.e(this.h, this.u);
    }

    public final void j0() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        StringBuilder sb = new StringBuilder("onWebPageReadyTimeout() wait timeout for ");
        ci0 ci0Var = this.i;
        sb.append((Object) nsa.t(ci0Var.a));
        String sb2 = sb.toString();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, sb2, null);
        k0("loading timeout", this.u);
        String str = this.u;
        this.p.d(ci0Var.a, str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        this.p.c(i, str, str2, str3, z);
        if (z) {
            k0(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }

    public final void k0(String str, String str2) {
        rar rarVar;
        if (!this.j && (rarVar = this.x) != null) {
            rarVar.g(null);
        }
        if (str2 == null) {
            str2 = this.u;
        }
        this.r.d(this.h, str2);
        this.q.p();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "processError() errorMessage=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        this.w = true;
        ((g) this.e).c(str);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.p.b(i, str, str2, str3, z);
        if (z) {
            k0(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
    }
}
