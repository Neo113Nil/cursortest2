package com.yandex.plus.home.internal.di;

import android.os.Build;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.pay.adapter.internal.c1;
import defpackage.b6e;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.gh3;
import defpackage.hrg;
import defpackage.jk6;
import defpackage.omb;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                a aVar = new a(dVar, 25);
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                str2.getClass();
                str.getClass();
                if (!StringsKt.M(str2, str, true)) {
                    str2 = hrg.l(' ', str, str2);
                }
                String str3 = str2;
                u uVar = dVar.a;
                return new com.yandex.plus.home.analytics.evgen.d(uVar.r, uVar.s, aVar, new com.yandex.plus.home.graphql.configuration.a(4), new a(dVar, 26), new a(dVar, 27), new a(dVar, 28), str3, String.valueOf(Build.VERSION.SDK_INT));
            case 1:
                return new com.yandex.plus.home.analytics.diagnostic.webview.a(this.b.b(), cnb.Home);
            case 2:
                com.yandex.plus.home.analytics.evgen.d dVar2 = (com.yandex.plus.home.analytics.evgen.d) this.b.d.getValue();
                int i = 0;
                int i2 = 0;
                return new com.yandex.plus.home.analytics.evgen.b(dVar2.a, dVar2.b, dVar2.c, dVar2.d, new com.yandex.plus.home.analytics.evgen.c(i2, dVar2, com.yandex.plus.home.analytics.evgen.d.class, "getTestIds", "getTestIds()Ljava/lang/String;", i, 3), new com.yandex.plus.home.analytics.evgen.c(i2, dVar2, com.yandex.plus.home.analytics.evgen.d.class, "getTriggeredTestIds", "getTriggeredTestIds()Ljava/lang/String;", i, 4), new com.yandex.plus.home.analytics.evgen.c(i2, dVar2, com.yandex.plus.home.analytics.evgen.d.class, "getPuid", "getPuid()Ljava/lang/String;", i, 5), new com.yandex.plus.home.analytics.evgen.c(i2, dVar2, com.yandex.plus.home.analytics.evgen.d.class, "getUserStatusType", "getUserStatusType()LUserStatusType;", i, 6), dVar2.g, dVar2.h, dVar2.i);
            case 3:
                return new com.yandex.plus.home.analytics.diagnostic.webview.a(this.b.b(), cnb.Story);
            case 4:
                return new com.yandex.plus.home.analytics.diagnostic.webview.a(this.b.b(), cnb.Simple);
            case 5:
                return new com.yandex.plus.home.analytics.diagnostic.webview.a(this.b.b(), cnb.Smart);
            case 6:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.a(this.b.b(), cnb.Home);
            case 7:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.a(this.b.b(), cnb.Story);
            case 8:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.a(this.b.b(), cnb.Smart);
            case 9:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.b(this.b.b(), cnb.Home);
            case 10:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.b(this.b.b(), cnb.Story);
            case 11:
                return new com.yandex.plus.home.analytics.b(this.b.a());
            case 12:
                return new com.yandex.plus.home.analytics.diagnostic.messaging.b(this.b.b(), cnb.Smart);
            case 13:
                return new com.yandex.plus.home.analytics.payment.c(this.b.b(), cnb.Home);
            case 14:
                com.yandex.plus.home.analytics.evgen.d dVar3 = (com.yandex.plus.home.analytics.evgen.d) this.b.d.getValue();
                int i3 = 0;
                int i4 = 0;
                return new com.yandex.plus.home.analytics.evgen.a(dVar3.a, dVar3.b, dVar3.d, new com.yandex.plus.bdui.plus.checkout.content.controller.w(i4, dVar3, com.yandex.plus.home.analytics.evgen.d.class, "getTestIds", "getTestIds()Ljava/lang/String;", i3, 28), new com.yandex.plus.bdui.plus.checkout.content.controller.w(i4, dVar3, com.yandex.plus.home.analytics.evgen.d.class, "getTriggeredTestIds", "getTriggeredTestIds()Ljava/lang/String;", i3, 29), new com.yandex.plus.home.analytics.evgen.c(i4, dVar3, com.yandex.plus.home.analytics.evgen.d.class, "getPuid", "getPuid()Ljava/lang/String;", i3, 0), new com.yandex.plus.home.analytics.evgen.c(i4, dVar3, com.yandex.plus.home.analytics.evgen.d.class, "getEvgenPlusState", "getEvgenPlusState()LEvgenPlusState;", i3, 1), new com.yandex.plus.home.analytics.evgen.c(i4, dVar3, com.yandex.plus.home.analytics.evgen.d.class, "getBalance", "getBalance()D", i3, 2), dVar3.f);
            case 15:
                return new com.yandex.plus.home.analytics.payment.c(this.b.b(), cnb.Story);
            case 16:
                d dVar4 = this.b;
                return new com.yandex.plus.home.analytics.payment.a(new jk6(0, 19, d.class, dVar4, "errorReporter", "getErrorReporter$plus_sdk_release()Lcom/yandex/plus/core/analytics/ErrorReporter;"), (com.yandex.plus.home.analytics.evgen.a) dVar4.f.getValue());
            case 17:
                a1 a1Var = new a1(9);
                d dVar5 = this.b;
                return new omb(new c(dVar5, false), (com.yandex.plus.home.analytics.evgen.a) dVar5.f.getValue(), a1Var);
            case 18:
                a1 a1Var2 = new a1(10);
                d dVar6 = this.b;
                return new dnb(new c(dVar6, false), (com.yandex.plus.home.analytics.evgen.b) dVar6.e.getValue(), a1Var2);
            case 19:
                return new com.yandex.plus.home.analytics.c(this.b.a());
            case 20:
                return new com.yandex.plus.home.analytics.a(this.b.a(), 0);
            case 21:
                return new com.yandex.plus.home.analytics.a(this.b.a(), 1);
            case 22:
                return new com.yandex.plus.home.analytics.payment.e(this.b.a(), false);
            case 23:
                return new com.yandex.plus.home.analytics.d(this.b.a());
            case 24:
                return new com.yandex.plus.home.analytics.e(this.b.a());
            case 25:
                int ordinal = ((c1) this.b.a.a()).b().ordinal();
                if (ordinal == 0) {
                    return gh3.Yandex;
                }
                if (ordinal == 1) {
                    return gh3.Yango;
                }
                b6e.s();
                return null;
            case 26:
                return ((com.yandex.plus.domain.auth.api.e) this.b.b.h.getValue()).getId();
            case 27:
                return this.b.a.j;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String languageTag = this.b.a.o.a().toLanguageTag();
                languageTag.getClass();
                return languageTag;
            default:
                com.yandex.plus.home.featureflags.g gVar = this.b.a.q;
                gVar.getClass();
                Boolean bool = (Boolean) ((com.yandex.plus.home.featureflags.e) gVar).u.getValue();
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
    }
}
