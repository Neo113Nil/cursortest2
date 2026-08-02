package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common;

/* loaded from: classes5.dex */
public final class k {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a a;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k b;

    public k(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = kVar;
    }

    public final void a() {
        boolean booleanValue = ((Boolean) this.b.invoke()).booleanValue();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar = this.a;
        if (!booleanValue) {
            aVar.a();
        } else {
            aVar.getClass();
            aVar.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.f(), "ClosingOffer");
        }
    }
}
