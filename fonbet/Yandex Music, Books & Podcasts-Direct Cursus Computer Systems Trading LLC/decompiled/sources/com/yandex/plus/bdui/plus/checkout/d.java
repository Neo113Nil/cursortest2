package com.yandex.plus.bdui.plus.checkout;

import defpackage.e5b;
import defpackage.ern;
import defpackage.t75;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.log.api.b b;

    public /* synthetic */ d(com.yandex.plus.log.api.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                com.yandex.plus.log.api.b bVar = this.b;
                bVar.getClass();
                com.yandex.plus.bdui.plus.a aVar = new com.yandex.plus.bdui.plus.a(bVar, 0);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return t75.c(new com.yandex.plus.bdui.model.a("actions", aVar, ern.a(com.yandex.plus.bdui.plus.shared.a.class), e5bVar));
            case 1:
                this.b.getClass();
                return new com.yandex.plus.bdui.plus.webview.navigation.c();
            default:
                return new com.yandex.passport.data.network.a(this.b);
        }
    }
}
