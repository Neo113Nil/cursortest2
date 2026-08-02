package com.yandex.plus.home.feature.webviews.internal.purchase.pay;

import android.net.Uri;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.uri.j;
import defpackage.bsh;
import defpackage.jyr;
import defpackage.ouj;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class c extends bsh {
    public final s g;
    public final u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, u uVar, kotlinx.coroutines.a aVar) {
        super(new a1(17), aVar);
        uVar.getClass();
        aVar.getClass();
        this.g = sVar;
        this.h = uVar;
    }

    public final void h0(String str) {
        Object r = this.g.r(Uri.parse(str));
        if (!(r instanceof t7o)) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.d;
            String k = ouj.k(')', "openLegalUrl(", str);
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, k, null);
            u.b(this.h, (j) r, true, null, 60);
        }
        Throwable a = z7o.a(r);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.d;
            String k2 = ouj.k(')', "openLegalUrl(", str);
            jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar2, k2, a);
        }
    }
}
