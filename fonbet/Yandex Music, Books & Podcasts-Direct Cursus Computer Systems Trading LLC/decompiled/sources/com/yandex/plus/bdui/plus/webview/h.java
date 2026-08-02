package com.yandex.plus.bdui.plus.webview;

import defpackage.huw;
import defpackage.r2f;

/* loaded from: classes4.dex */
public final class h implements com.yandex.plus.webview.api.redirect.a {
    public final s a;
    public final huw b;
    public r2f c;

    public h(s sVar, huw huwVar) {
        this.a = sVar;
        this.b = huwVar;
    }

    @Override // com.yandex.plus.webview.api.redirect.a
    public final boolean a(com.yandex.plus.webview.core.d dVar, com.yandex.plus.webview.core.resource.c cVar) {
        dVar.getClass();
        cVar.getClass();
        r2f r2fVar = this.c;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        this.c = null;
        if (!this.a.a(dVar, cVar)) {
            this.c = (r2f) this.b.invoke(dVar, cVar);
        }
        return true;
    }
}
