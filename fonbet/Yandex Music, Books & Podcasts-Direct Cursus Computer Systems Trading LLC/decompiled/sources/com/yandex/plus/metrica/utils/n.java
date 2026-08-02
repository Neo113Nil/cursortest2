package com.yandex.plus.metrica.utils;

import android.content.Context;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.b6e;
import defpackage.cdk;
import defpackage.ezc;
import defpackage.gdk;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class n extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        switch (this.a) {
            case 0:
                return (IReporterYandex) ((x) this.receiver).h();
            case 1:
                return (IReporterYandex) ((x) this.receiver).h();
            case 2:
                return (IReporter) ((x) this.receiver).g();
            case 3:
                return (IReporterYandex) ((x) this.receiver).h();
            case 4:
                return (IReporter) ((x) this.receiver).g();
            case 5:
                return (IReporterYandex) ((x) this.receiver).h();
            case 6:
                return (IReporterYandex) ((x) this.receiver).h();
            case 7:
                return (IReporter) ((x) this.receiver).g();
            case 8:
                return (IReporterYandex) ((x) this.receiver).h();
            case 9:
                return (IReporterYandex) ((x) this.receiver).h();
            case 10:
                return com.yandex.plus.pay.inapp.google.internal.g.f((com.yandex.plus.pay.inapp.google.internal.g) this.receiver);
            case 11:
                return com.yandex.plus.pay.inapp.google.internal.g.f((com.yandex.plus.pay.inapp.google.internal.g) this.receiver);
            case 12:
                return com.yandex.plus.pay.inapp.google.internal.g.f((com.yandex.plus.pay.inapp.google.internal.g) this.receiver);
            case 13:
                return com.yandex.plus.pay.inapp.google.internal.g.f((com.yandex.plus.pay.inapp.google.internal.g) this.receiver);
            case 14:
                return com.yandex.plus.pay.inapp.google.internal.g.f((com.yandex.plus.pay.inapp.google.internal.g) this.receiver);
            case 15:
                return ((com.yandex.plus.core.analytics.h) this.receiver).e();
            case 16:
                ((com.yandex.plus.core.benchmark.y) this.receiver).getClass();
                return Boolean.TRUE;
            case 17:
                return ((com.yandex.plus.pay.internal.g) this.receiver).e();
            case 18:
                return (com.yandex.plus.pay.common.internal.featureflags.c) ((com.yandex.plus.core.featureflags.x) this.receiver).a();
            case 19:
                return Boolean.valueOf(com.yandex.plus.pay.common.api.utils.a.a((Context) this.receiver));
            case 20:
                com.yandex.plus.core.network.urls.c cVar = (com.yandex.plus.core.network.urls.c) this.receiver;
                int i2 = com.yandex.plus.core.network.okhttp.utils.a.a;
                cVar.getClass();
                return new com.yandex.plus.core.network.okhttp.interceptor.f(new com.yandex.plus.core.network.okhttp.call.h(i, new com.yandex.passport.data.network.l(new com.yandex.plus.core.network.utils.a(cVar, 0))));
            case 21:
                return com.yandex.plus.core.locale.b.m((com.yandex.plus.core.locale.a) this.receiver);
            case 22:
                com.yandex.plus.pay.internal.network.urls.a aVar = (com.yandex.plus.pay.internal.network.urls.a) this.receiver;
                com.yandex.plus.core.config.a aVar2 = aVar.e;
                com.yandex.plus.core.strings.a aVar3 = aVar.f;
                aVar2.getClass();
                aVar3.getClass();
                int ordinal = aVar3.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    return new com.yandex.passport.internal.flags.experiments.p("checkout-bdui.plus.yandex.net", "checkout-bdui.plus.tst.yandex.net", aVar2);
                }
                b6e.s();
                return null;
            case 23:
                return ((com.yandex.plus.pay.ui.core.debug.api.b) this.receiver).getTheme();
            case 24:
                com.yandex.plus.pay.ui.core.internal.common.b bVar = (com.yandex.plus.pay.ui.core.internal.common.b) this.receiver;
                bVar.getClass();
                return new cdk(new com.yandex.plus.pay.ui.core.internal.common.a(bVar), new com.yandex.plus.pay.ui.core.internal.common.a(bVar), new com.yandex.plus.home.plaque.plugin.internal.proxy.a(bVar));
            case 25:
                return ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.a) this.receiver)).e();
            case 26:
                com.yandex.plus.pay.ui.core.internal.common.d dVar = (com.yandex.plus.pay.ui.core.internal.common.d) this.receiver;
                dVar.getClass();
                return new gdk(new com.yandex.plus.pay.ui.core.internal.common.c(dVar), new com.yandex.plus.pay.ui.core.internal.common.c(dVar), new com.yandex.plus.home.plaque.plugin.internal.proxy.a(dVar));
            case 27:
                return ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.a) this.receiver)).e();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Boolean.valueOf(com.yandex.plus.pay.common.api.utils.a.a((Context) this.receiver));
            default:
                return Boolean.valueOf(r1.l(((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.e) this.receiver).a.a())).n));
        }
    }
}
