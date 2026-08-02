package com.yandex.passport.internal.report.reporters;

import android.net.Uri;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.h6;

/* loaded from: classes4.dex */
public final class g0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.report.g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.yandex.passport.internal.report.g gVar) {
        super(gVar);
        gVar.getClass();
        this.b = gVar;
    }

    public final void u(com.yandex.passport.common.core.f fVar, Uri uri, com.yandex.passport.internal.links.h hVar) {
        fVar.getClass();
        uri.getClass();
        hVar.getClass();
        n(h6.d, new ff(fVar), new com.yandex.passport.internal.report.c(uri), new com.yandex.passport.internal.report.f(hVar));
    }
}
