package com.yandex.plus.home.internal.di;

import defpackage.jk6;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.b.h.getValue() instanceof com.yandex.plus.domain.auth.api.b);
            case 1:
                d dVar = this.b;
                return new com.yandex.plus.home.analytics.payment.d(dVar.a(), new b(dVar, 0));
            case 2:
                return new com.yandex.plus.home.analytics.payment.b(this.b.a());
            case 3:
                return new com.yandex.plus.home.analytics.payment.e(this.b.a(), true);
            case 4:
                d dVar2 = this.b;
                return new com.yandex.plus.home.panel.a(dVar2.b(), new a(dVar2, 29));
            case 5:
                return new com.yandex.plus.home.analytics.f(new jk6(0, 20, d.class, this.b, "reporters", "getReporters$plus_sdk_release()Lcom/yandex/plus/core/analytics/Reporters;"));
            case 6:
                this.b.a().getClass();
                return new com.yandex.plus.home.analytics.bubble.a();
            default:
                return new com.yandex.plus.home.analytics.diagnostic.panel.a(this.b.b());
        }
    }
}
