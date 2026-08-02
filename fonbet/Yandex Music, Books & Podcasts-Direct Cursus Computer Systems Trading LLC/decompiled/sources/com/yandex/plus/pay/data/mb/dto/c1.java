package com.yandex.plus.pay.data.mb.dto;

import defpackage.jyr;
import defpackage.qy0;
import defpackage.tkr;
import defpackage.up6;
import defpackage.wsd;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return k1.Companion.serializer();
            case 1:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 2:
                return new qy0(w0.Companion.serializer(), 0);
            case 3:
                return up6.q("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.Vendor", k1.values(), new String[]{"GOOGLE_PLAY", "NATIVE_YANDEX", null}, new Annotation[][]{null, null, null});
            case 4:
                return new qy0(o1.a, 0);
            case 5:
                return new qy0(c3.a, 0);
            case 6:
                return new qy0(tkr.a, 0);
            case 7:
                return up6.q("com.yandex.plus.pay.data.mb.dto.FamilyRoleDto", w1.values(), new String[]{"PARENT", "CHILD", null}, new Annotation[][]{null, null, null});
            case 8:
                return new qy0(tkr.a, 0);
            case 9:
                return new qy0(tkr.a, 0);
            case 10:
                return up6.q("com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto.StatusDto", u2.values(), new String[]{"SUCCESS", "FAIL", null}, new Annotation[][]{null, null, null});
            case 11:
                return new qy0(tkr.a, 0);
            case 12:
                return new qy0(e3.a, 0);
            case 13:
                return h3.Companion.serializer();
            case 14:
                return up6.q("com.yandex.plus.pay.data.mb.dto.RichTextDto.Item.Type", h3.values(), new String[]{"LINK", "HIGHLIGHT", "STRIKE"}, new Annotation[][]{null, null, null});
            case 15:
                return n3.Companion.serializer();
            case 16:
                return up6.q("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto.SubscriptionStatusDto", n3.values(), new String[]{"FAIL_3DS", "HOLD", "PAYMENT_FAILED", "REFUND", "WAIT_FOR_PAYMENT", null}, new Annotation[][]{null, null, null, null, null, null});
            case 17:
                return w1.Companion.serializer();
            case 18:
                return new qy0(x1.a, 0);
            case 19:
                return new com.yandex.plus.home.plaque.animator.internal.utils.a();
            case 20:
                return new com.yandex.plus.pay.graphql.invoice.g();
            case 21:
                return new com.yandex.plus.pay.graphql.utils.b();
            case 22:
                return new com.yandex.plus.pay.graphql.offers.n();
            case 23:
                return new com.yandex.plus.pay.graphql.offers.a();
            case 24:
                return new com.yandex.plus.pay.graphql.offers.o();
            case 25:
                return new com.yandex.plus.pay.graphql.offers.p();
            case 26:
                return new com.yandex.plus.pay.graphql.upsale.a(new com.yandex.plus.pay.graphql.offers.d(new com.yandex.plus.pay.graphql.offers.n(), new com.yandex.plus.pay.graphql.utils.b()), new com.yandex.plus.pay.graphql.offers.p());
            case 27:
                return new com.yandex.plus.core.location.a();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jyr jyrVar = com.yandex.plus.pay.internal.benchmark.tarifficator.b.g;
                return 1000000000L;
            default:
                return null;
        }
    }
}
