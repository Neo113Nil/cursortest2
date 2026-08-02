package com.yandex.plus.home.feature.webviews.internal;

import android.net.Uri;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import defpackage.a4g;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.e5b;
import defpackage.gld;
import defpackage.jyr;
import defpackage.ouj;
import defpackage.pjt;
import defpackage.q5b;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.u75;
import defpackage.x97;
import defpackage.z7o;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {
    public final String a;
    public final com.yandex.plus.home.auth.f b;
    public final com.yandex.plus.home.analytics.diagnostic.messaging.a c;
    public final u d;
    public final s e;
    public final boolean f;
    public String g;
    public final tf6 h;
    public rar i;
    public Boolean j;

    public d(String str, com.yandex.plus.home.auth.f fVar, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar, u uVar, s sVar, boolean z, kotlinx.coroutines.a aVar2) {
        str.getClass();
        fVar.getClass();
        aVar.getClass();
        uVar.getClass();
        aVar2.getClass();
        this.a = str;
        this.b = fVar;
        this.c = aVar;
        this.d = uVar;
        this.e = sVar;
        this.f = z;
        this.g = str;
        this.h = gld.e(aVar2.plus(a4g.n()));
    }

    public final void a(Function0 function0) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.a;
        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "checkAndOpenAuthCallbackUrlElse()", null);
        String b = b();
        if (b == null) {
            com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "authCallbackUrl url is null", null);
            function0.invoke();
        } else if (!this.b.c()) {
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, "is not authorized", null);
            function0.invoke();
        } else {
            m(null);
            com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "open callback url", null);
            k(b);
        }
    }

    public abstract String b();

    public abstract String c();

    public final void d(o3 o3Var, Function0 function0, Function1 function1) {
        Object t7oVar;
        o3Var.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.b, "handleNeedAuthorizationMessage() outMessage=" + o3Var, null);
        n3 n3Var = o3Var.b;
        String str = o3Var.c;
        n3 n3Var2 = n3.b;
        com.yandex.plus.home.analytics.diagnostic.messaging.a aVar = this.c;
        if (n3Var == n3Var2) {
            dnb dnbVar = aVar.a;
            cnb cnbVar = aVar.b;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            dnbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", cnbVar.a);
            linkedHashMap.put("additional_params", e5bVar);
            linkedHashMap.put("_meta", dnb.b(new HashMap()));
            dnbVar.c("Error.WebView.Messaging.NeedAuthorization.Expired", linkedHashMap);
            i();
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Uri.parse(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        String str2 = t7oVar != null ? str : null;
        if (str2 != null) {
            rar rarVar = this.i;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.i = x97.y(this.h, null, null, new j(function0, this, function1, continuation, 8), 3);
            m(str2);
            return;
        }
        aVar.getClass();
        str.getClass();
        dnb dnbVar2 = aVar.a;
        cnb cnbVar2 = aVar.b;
        e5b e5bVar2 = e5b.a;
        e5bVar2.getClass();
        dnbVar2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("webview_type", cnbVar2.a);
        linkedHashMap2.put("additional_params", e5bVar2);
        linkedHashMap2.put("error_url", str);
        linkedHashMap2.put("_meta", dnb.b(new HashMap()));
        dnbVar2.c("Error.WebView.Messaging.NeedAuthorization.IncorrectURL", linkedHashMap2);
    }

    public final void f(x2 x2Var, Function1 function1) {
        x2Var.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.b, "handleNeedLogoutMessage() outMessage=" + x2Var, null);
        rar rarVar = this.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.i = x97.y(this.h, null, null, new j(this, x2Var, function1, (Continuation) null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r4 = kotlin.text.StringsKt__StringsKt.split$default(r4, new java.lang.String[]{"&"}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.split$default(r5, new java.lang.String[]{"&"}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r4.containsAll(r0) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(com.yandex.plus.webview.core.resource.c cVar) {
        List split$default;
        List split$default2;
        Uri.Builder buildUpon;
        Uri.Builder clearQuery;
        Uri.Builder buildUpon2;
        Uri.Builder clearQuery2;
        cVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String str = "handleUrlLoading() uri=" + cVar.getUri();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, str, null);
        if (cVar instanceof com.yandex.plus.webview.core.resource.a) {
            com.yandex.plus.webview.core.resource.a aVar = (com.yandex.plus.webview.core.resource.a) cVar;
            Uri uri = aVar.a;
            if (aVar.c != com.yandex.plus.webview.core.resource.d.b) {
                Uri parse = Uri.parse(this.g);
                String query = uri != null ? uri.getQuery() : null;
                String query2 = parse != null ? parse.getQuery() : null;
                if (Intrinsics.d((uri == null || (buildUpon2 = uri.buildUpon()) == null || (clearQuery2 = buildUpon2.clearQuery()) == null) ? null : clearQuery2.build(), (parse == null || (buildUpon = parse.buildUpon()) == null || (clearQuery = buildUpon.clearQuery()) == null) ? null : clearQuery.build())) {
                    Set A0 = (query == null || split$default2 == null) ? null : CollectionsKt.A0(split$default2);
                    if (A0 == null) {
                        A0 = q5b.a;
                    }
                    Set A02 = (query2 == null || split$default == null) ? null : CollectionsKt.A0(split$default);
                    if (A02 == null) {
                        A02 = q5b.a;
                    }
                    if (A0.size() == A02.size()) {
                    }
                }
                Object r = this.e.r(uri);
                if (!(r instanceof t7o)) {
                    u.b(this.d, (com.yandex.plus.home.feature.webviews.internal.uri.j) r, true, null, 60);
                }
                return true;
            }
        }
        String uri2 = cVar.getUri().toString();
        uri2.getClass();
        this.g = uri2;
        return false;
    }

    public final void h() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "attachView()", null);
        x97.y(this.h, null, null, new com.yandex.plus.bdui.ui.b(this, (Continuation) null, 16), 3);
    }

    public abstract void i();

    public abstract void j(String str, List list);

    public final void k(String str) {
        String a;
        com.yandex.plus.home.auth.f fVar = this.b;
        this.j = Boolean.valueOf(fVar.c());
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        StringBuilder u = ouj.u("openUrl() url=", str, " openedForAuthorizationState=");
        u.append(this.j);
        String sb = u.toString();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.home.feature.webviews.internal.network.b bVar2 = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, sb, null);
        n(str);
        if (!this.f && (a = fVar.a()) != null) {
            bVar2 = new com.yandex.plus.home.feature.webviews.internal.network.b("OAuth ".concat(a));
        }
        j(str, u75.i(bVar2));
    }

    public final void l() {
        x97.y(this.h, null, null, new pjt(this, null, 29), 3);
    }

    public abstract void m(String str);

    public abstract void n(String str);
}
