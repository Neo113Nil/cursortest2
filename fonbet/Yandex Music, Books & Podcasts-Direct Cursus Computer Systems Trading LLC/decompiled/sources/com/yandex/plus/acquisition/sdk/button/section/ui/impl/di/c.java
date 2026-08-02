package com.yandex.plus.acquisition.sdk.button.section.ui.impl.di;

import android.content.Context;
import com.yandex.passport.common.network.n;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.i;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c {
    public final i a;
    public final jyr b = btf.b(new k0(4));
    public final jyr c;

    public c(i iVar) {
        this.a = iVar;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i iVar2 = this.b.a;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = new com.yandex.plus.acquisition.sdk.common.api.di.b(new com.yandex.plus.paywall.sdk.analytics.api.a(iVar2.a, iVar2.b));
                        com.yandex.plus.acquisition.sdk.common.impl.di.b bVar2 = iVar2.a;
                        jyr jyrVar = (jyr) bVar.b;
                        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a aVar = (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a) jyrVar.getValue();
                        n nVar = new n((Context) bVar2.a.i, (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a) jyrVar.getValue());
                        com.yandex.plus.core.imageloader.b bVar3 = iVar2.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) bVar2.c.getValue())).getClass();
                        return new d(aVar, nVar, bVar3, com.yandex.plus.core.dispatcher.a.e);
                    default:
                        c cVar = this.b;
                        return new com.yandex.passport.data.network.token.i(cVar.a.b, (d) cVar.c.getValue());
                }
            }
        });
        final int i2 = 1;
        btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i iVar2 = this.b.a;
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = new com.yandex.plus.acquisition.sdk.common.api.di.b(new com.yandex.plus.paywall.sdk.analytics.api.a(iVar2.a, iVar2.b));
                        com.yandex.plus.acquisition.sdk.common.impl.di.b bVar2 = iVar2.a;
                        jyr jyrVar = (jyr) bVar.b;
                        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a aVar = (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a) jyrVar.getValue();
                        n nVar = new n((Context) bVar2.a.i, (com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a) jyrVar.getValue());
                        com.yandex.plus.core.imageloader.b bVar3 = iVar2.c;
                        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) bVar2.c.getValue())).getClass();
                        return new d(aVar, nVar, bVar3, com.yandex.plus.core.dispatcher.a.e);
                    default:
                        c cVar = this.b;
                        return new com.yandex.passport.data.network.token.i(cVar.a.b, (d) cVar.c.getValue());
                }
            }
        });
    }
}
