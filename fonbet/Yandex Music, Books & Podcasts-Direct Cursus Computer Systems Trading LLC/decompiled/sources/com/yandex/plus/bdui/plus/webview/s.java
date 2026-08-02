package com.yandex.plus.bdui.plus.webview;

import android.net.Uri;
import com.yandex.plus.bdui.plus.content.serializer.h2;
import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements com.yandex.plus.webview.api.redirect.a {
    public final h2 a;
    public final h2 b;
    public final int c;
    public final com.yandex.plus.bdui.flex.ui.content.c d;
    public final com.yandex.passport.internal.ui.bouncer.o e;
    public final com.yandex.plus.log.api.b f;
    public final Uri g;
    public r h;

    public s(com.yandex.plus.bdui.plus.webview.navigation.b bVar, h2 h2Var, h2 h2Var2, int i, com.yandex.plus.bdui.flex.ui.content.c cVar, com.yandex.passport.internal.ui.bouncer.o oVar, com.yandex.plus.log.api.b bVar2) {
        bVar2.getClass();
        this.a = h2Var;
        this.b = h2Var2;
        this.c = i;
        this.d = cVar;
        this.e = oVar;
        this.f = bVar2;
        this.g = bVar.c();
    }

    @Override // com.yandex.plus.webview.api.redirect.a
    public final boolean a(com.yandex.plus.webview.core.d dVar, com.yandex.plus.webview.core.resource.c cVar) {
        dVar.getClass();
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.webview.core.resource.a)) {
            return false;
        }
        com.yandex.plus.webview.core.resource.a aVar = (com.yandex.plus.webview.core.resource.a) cVar;
        Uri uri = aVar.a;
        String uri2 = uri.toString();
        uri2.getClass();
        com.yandex.plus.bdui.action.a aVar2 = (com.yandex.plus.bdui.action.a) this.a.invoke(uri);
        com.yandex.passport.internal.ui.bouncer.o oVar = this.e;
        com.yandex.plus.log.api.b bVar = this.f;
        if (aVar2 != null) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar3)) {
                bVar.c(aVar3, "WebViewResourceLoadingHandlerImpl", "Override redirect for " + uri2 + " with BDUI action " + aVar2 + ". Uri match.");
            }
            oVar.invoke(aVar2);
            this.h = null;
            return true;
        }
        String scheme = uri.getScheme();
        Uri uri3 = this.g;
        if (!Intrinsics.d(scheme, uri3.getScheme()) || !Intrinsics.d(uri.getHost(), uri3.getHost())) {
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar4)) {
                StringBuilder u = ouj.u("Navigation to ", uri2, " blocked cuz scheme ");
                u.append(uri.getScheme());
                u.append(" or host ");
                u.append(uri.getHost());
                u.append(" changed. Start point is : ");
                u.append(uri3.getScheme());
                u.append("://");
                u.append(uri3.getHost());
                bVar.c(aVar4, "WebViewResourceLoadingHandlerImpl", u.toString());
            }
            this.h = null;
            return true;
        }
        this.d.invoke(uri);
        if (!Boolean.TRUE.booleanValue()) {
            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar5)) {
                StringBuilder u2 = ouj.u("Navigation to ", uri2, " blocked cuz the path ");
                u2.append(uri.getPath());
                u2.append(" is not allowed");
                bVar.c(aVar5, "WebViewResourceLoadingHandlerImpl", u2.toString());
            }
            this.h = null;
            return true;
        }
        com.yandex.plus.bdui.action.a aVar6 = (com.yandex.plus.bdui.action.a) this.b.invoke(uri);
        if (aVar6 != null) {
            com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar7)) {
                bVar.c(aVar7, "WebViewResourceLoadingHandlerImpl", "Override redirect for " + uri2 + " with BDUI action " + aVar6 + ". Anchor match");
            }
            oVar.invoke(aVar6);
            this.h = null;
            return true;
        }
        if (aVar.c != com.yandex.plus.webview.core.resource.d.b) {
            this.h = null;
            return false;
        }
        r rVar = this.h;
        int i = this.c;
        if (rVar != null) {
            int i2 = rVar.a;
            if (i2 < i) {
                rVar.a = i2 + 1;
                return false;
            }
            com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar8)) {
                bVar.c(aVar8, "WebViewResourceLoadingHandlerImpl", "Redirect to " + uri + " is not allowed: max redirect depth is reached!");
            }
            this.h = null;
            return true;
        }
        if (i > 0) {
            r rVar2 = new r();
            rVar2.a = 1;
            this.h = rVar2;
            return false;
        }
        com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.d;
        if (bVar.b(aVar9)) {
            bVar.c(aVar9, "WebViewResourceLoadingHandlerImpl", "Redirect to " + uri + " is not allowed: max redirect depth is 0!");
        }
        this.h = null;
        return true;
    }
}
