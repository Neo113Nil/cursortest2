package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import defpackage.rar;
import defpackage.x97;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d extends com.yandex.plus.home.feature.webviews.internal.d {
    public String k;
    public String l;
    public final /* synthetic */ e m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, com.yandex.plus.home.auth.f fVar, com.yandex.plus.home.analytics.diagnostic.messaging.a aVar, u uVar, s sVar, boolean z, kotlinx.coroutines.a aVar2) {
        super(str, fVar, aVar, uVar, sVar, z, aVar2);
        this.m = eVar;
        str.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        this.k = eVar.g.a.toString();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final String b() {
        return this.l;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final String c() {
        return this.k;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void i() {
        ((j) this.m.e).dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void j(String str, List list) {
        str.getClass();
        list.getClass();
        e eVar = this.m;
        ((j) eVar.e).n(str, list);
        if (eVar.B) {
            return;
        }
        rar rarVar = eVar.H;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        eVar.H = x97.y(eVar.l(), null, null, new com.yandex.passport.internal.ui.social.i(eVar, continuation, 18), 3);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void m(String str) {
        this.l = str;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.d
    public final void n(String str) {
        this.k = str;
    }
}
