package com.yandex.plus.home.feature.webviews.internal.container;

import defpackage.su4;
import defpackage.tf6;
import defpackage.x97;
import defpackage.y7b;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface u {
    static void a(u uVar, ArrayList arrayList) {
        t tVar = (t) uVar;
        tVar.getClass();
        tf6 tf6Var = tVar.I;
        if (tf6Var != null) {
            x97.y(tf6Var, null, null, new com.yandex.plus.home.api.prefetch.j(tVar, arrayList, (Continuation) null), 3);
        }
    }

    static void b(u uVar, com.yandex.plus.home.feature.webviews.internal.uri.j jVar, boolean z, String str, int i) {
        String str2 = (i & 4) != 0 ? null : str;
        String str3 = (i & 8) != 0 ? null : "deeplink";
        t tVar = (t) uVar;
        tVar.getClass();
        jVar.getClass();
        com.yandex.plus.log.api.b bVar = tVar.u;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            StringBuilder sb = new StringBuilder("routeToDeeplink(deeplink=");
            sb.append(jVar);
            sb.append(", validateWhitelist=");
            sb.append(z);
            sb.append(", data=");
            su4.v(sb, str2, ", from=", str3, ", place=");
            sb.append((String) null);
            sb.append(", payload=");
            sb.append((Object) null);
            sb.append(')');
            bVar.c(aVar, "WebViewsControllerImpl", sb.toString());
        }
        tf6 tf6Var = tVar.I;
        if (tf6Var != null) {
            x97.y(tf6Var, null, null, new y7b(tVar, jVar, str3, null, null, str2, null), 3);
        }
    }
}
