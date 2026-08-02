package com.yandex.plus.home.datasource.openapi.models;

import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import defpackage.ern;
import defpackage.kgm;
import defpackage.quj;
import defpackage.qy0;
import defpackage.tkr;
import defpackage.udb;
import defpackage.up6;
import defpackage.wsd;
import defpackage.x3f;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class u6 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return new qy0(tkr.a, 0);
            case 1:
                return new qy0(tkr.a, 0);
            case 2:
                return new qy0(tkr.a, 0);
            case 3:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 4:
                tkr tkrVar2 = tkr.a;
                return new wsd(tkrVar2, tkrVar2, 1);
            case 5:
                tkr tkrVar3 = tkr.a;
                return new wsd(tkrVar3, tkrVar3, 1);
            case 6:
                return new qy0(tkr.a, 0);
            case 7:
                p7[] values = p7.values();
                values.getClass();
                return new udb("com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel.TextStyle", values);
            case 8:
                return new qy0(tkr.a, 0);
            case 9:
                return new qy0(v7.Companion.serializer(), 0);
            case 10:
                return new qy0(v7.Companion.serializer(), 0);
            case 11:
                return new qy0(tkr.a, 0);
            case 12:
                return new com.yandex.plus.home.feature.panel.internalapi.analytics.a(-1, -1, -1, -1);
            case 13:
                int i2 = GiftProgressView.n;
                return Unit.a;
            case 14:
                com.yandex.plus.core.analytics.logging.e.b(com.yandex.plus.core.analytics.logging.b.b, "callback have not been opened");
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 17:
                return LinkMovementMethod.getInstance();
            case 18:
                return new qy0(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.k.a, 0);
            case 19:
                return new kgm(ern.a(com.yandex.plus.home.feature.webviews.internalapi.subscription.p.class), new Annotation[0]);
            case 20:
                return new qy0(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.k.a, 0);
            case 21:
                return new kgm(ern.a(com.yandex.plus.home.feature.webviews.internalapi.subscription.p.class), new Annotation[0]);
            case 22:
                return new kgm(ern.a(com.yandex.plus.pay.adapter.api.j.class), new Annotation[0]);
            case 23:
                return quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(i));
            case 24:
                return Unit.a;
            case 25:
                return Unit.a;
            case 26:
                return new qy0(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.r.a, 0);
            case 27:
                return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t.Companion.serializer();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return up6.q("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage.LogoutResponse.LogoutStatus", com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.t.values(), new String[]{"success", "failed", "canceled"}, new Annotation[][]{null, null, null});
            default:
                return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0.Companion.serializer();
        }
    }
}
