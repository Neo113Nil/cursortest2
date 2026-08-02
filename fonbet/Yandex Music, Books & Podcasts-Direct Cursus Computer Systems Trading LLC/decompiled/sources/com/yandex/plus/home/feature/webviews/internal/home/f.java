package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import defpackage.bsh;
import defpackage.rar;
import defpackage.x0q;
import defpackage.x97;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class f extends com.yandex.plus.home.feature.webviews.internal.d {
    public final /* synthetic */ int k = 0;
    public final /* synthetic */ bsh l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.plus.home.feature.webviews.internal.stories.k kVar, String str, com.yandex.plus.home.auth.f fVar, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar, u uVar, s sVar, boolean z, kotlinx.coroutines.a aVar2) {
        super(str, fVar, aVar, uVar, sVar, z, aVar2);
        this.l = kVar;
        str.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final String b() {
        switch (this.k) {
            case 0:
                return ((g) this.l).h.b;
            default:
                return ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).h.c.d;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final String c() {
        switch (this.k) {
            case 0:
                return ((g) this.l).h.a;
            default:
                return ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).h.c.c;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void i() {
        switch (this.k) {
            case 0:
                ((a) ((g) this.l).e).dismiss();
                break;
            default:
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).e).n(false);
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void j(String str, List list) {
        int i = this.k;
        str.getClass();
        list.getClass();
        switch (i) {
            case 0:
                g gVar = (g) this.l;
                ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) gVar.I0.getValue()).getClass();
                gVar.B0 = false;
                ((x0q) gVar.v0.c).a(com.yandex.plus.home.feature.webviews.internal.events.a.a);
                ((a) gVar.e).n(str, list);
                if (!gVar.I) {
                    rar rarVar = gVar.A0;
                    Continuation continuation = null;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    gVar.A0 = x97.y(gVar.l(), null, null, new e(gVar, continuation, 0), 3);
                    break;
                }
                break;
            default:
                com.yandex.plus.home.feature.webviews.internal.stories.k kVar = (com.yandex.plus.home.feature.webviews.internal.stories.k) this.l;
                ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) kVar.D0.getValue()).getClass();
                kVar.E0 = false;
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) kVar.e).u(str, kVar.h.a, list);
                if (!kVar.E) {
                    rar rarVar2 = kVar.v0;
                    Continuation continuation2 = null;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    kVar.v0 = x97.y(kVar.l(), null, null, new com.yandex.passport.internal.ui.social.i(kVar, continuation2, 19), 3);
                    break;
                }
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void m(String str) {
        switch (this.k) {
            case 0:
                ((g) this.l).h.b = str;
                break;
            default:
                ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).h.c.d = str;
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void n(String str) {
        switch (this.k) {
            case 0:
                ((g) this.l).h.a = str;
                break;
            default:
                ((com.yandex.plus.home.feature.webviews.internal.stories.k) this.l).h.c.c = str;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, com.yandex.plus.home.auth.f fVar, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar, s sVar, u uVar, boolean z, kotlinx.coroutines.a aVar2) {
        super(str, fVar, aVar, uVar, sVar, z, aVar2);
        this.l = gVar;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
    }
}
