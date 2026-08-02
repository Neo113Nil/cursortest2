package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class y implements com.yandex.plus.webview.api.request.b {
    public final com.yandex.plus.bdui.flex.ui.s a;
    public final com.yandex.plus.home.auth.f b;

    public y(com.yandex.plus.bdui.flex.ui.s sVar, com.yandex.plus.home.auth.f fVar) {
        fVar.getClass();
        this.a = sVar;
        this.b = fVar;
    }

    @Override // com.yandex.plus.webview.api.request.b
    public final Object a(String str, Map map, Continuation continuation) {
        cg6 cg6Var = (cg6) continuation;
        Object r = this.a.r(Uri.parse(str));
        if (r instanceof t7o) {
            r = null;
        }
        j jVar = (j) r;
        return jVar instanceof e ? b((e) jVar, cg6Var) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r4.f(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e eVar, cg6 cg6Var) {
        x xVar;
        int i;
        String uri;
        com.yandex.plus.core.analytics.logging.b bVar;
        String host;
        Object obj;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = xVar.k;
                Object obj3 = nm6.a;
                i = xVar.m;
                com.yandex.plus.home.auth.f fVar = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (!eVar.h) {
                        String uri2 = eVar.a.toString();
                        uri2.getClass();
                        return uri2;
                    }
                    xVar.j = eVar;
                    xVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = xVar.j;
                    qgg.h0(obj2);
                }
                uri = eVar.a.toString();
                uri.getClass();
                Continuation continuation = null;
                xVar.j = null;
                xVar.m = 2;
                fVar.getClass();
                Uri parse = Uri.parse(uri);
                bVar = com.yandex.plus.core.analytics.logging.b.a;
                String k = ouj.k('\"', "Authorize url = \"", uri);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, k, null);
                host = parse.getHost();
                if (host != null || host.length() == 0) {
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, ouj.k('\"', "Can't get host for url = \"", uri), null);
                    obj = uri;
                } else {
                    String host2 = parse.getHost();
                    List e0 = host2 != null ? StringsKt.e0(host2, new char[]{'.'}, 6) : null;
                    String str = e0 != null ? (String) CollectionsKt.Z(e0) : null;
                    if (str == null) {
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, ouj.k('\"', "Can't get TLD for url = \"", uri), null);
                        obj = uri;
                    } else {
                        obj = x97.V(fVar.c, new com.yandex.plus.home.api.prefetch.j(fVar, uri, str, continuation, 1), xVar);
                    }
                }
                return obj != obj3 ? obj3 : obj;
            }
        }
        xVar = new x(this, cg6Var);
        Object obj22 = xVar.k;
        Object obj32 = nm6.a;
        i = xVar.m;
        com.yandex.plus.home.auth.f fVar2 = this.b;
        if (i != 0) {
        }
        uri = eVar.a.toString();
        uri.getClass();
        Continuation continuation2 = null;
        xVar.j = null;
        xVar.m = 2;
        fVar2.getClass();
        Uri parse2 = Uri.parse(uri);
        bVar = com.yandex.plus.core.analytics.logging.b.a;
        String k2 = ouj.k('\"', "Authorize url = \"", uri);
        jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, k2, null);
        host = parse2.getHost();
        if (host != null) {
        }
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, ouj.k('\"', "Can't get host for url = \"", uri), null);
        obj = uri;
        if (obj != obj32) {
        }
    }
}
