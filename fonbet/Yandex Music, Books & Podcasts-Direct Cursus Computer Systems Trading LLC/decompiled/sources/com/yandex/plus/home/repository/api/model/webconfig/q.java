package com.yandex.plus.home.repository.api.model.webconfig;

import com.yandex.plus.pay.adapter.api.c0;
import com.yandex.plus.pay.adapter.api.f0;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.udb;
import defpackage.wsd;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t9f _childSerializers$_anonymous_;
        t9f _childSerializers$_anonymous_$0;
        t9f _childSerializers$_anonymous_$1;
        t9f _childSerializers$_anonymous_2;
        t9f _childSerializers$_anonymous_$02;
        t9f _childSerializers$_anonymous_$12;
        t9f _init_$_anonymous_;
        t9f _childSerializers$_anonymous_3;
        t9f _childSerializers$_anonymous_$03;
        t9f _childSerializers$_anonymous_$13;
        t9f _childSerializers$_anonymous_4;
        t9f _init_$_anonymous_2;
        t9f _childSerializers$_anonymous_5;
        t9f _init_$_anonymous_3;
        t9f _childSerializers$_anonymous_6;
        switch (this.a) {
            case 0:
                v[] values = v.values();
                values.getClass();
                return new udb("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.ButtonType", values);
            case 1:
                x[] values2 = x.values();
                values2.getClass();
                return new udb("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.PaymentMethod", values2);
            case 2:
                y[] values3 = y.values();
                values3.getClass();
                return new udb("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.WidgetType", values3);
            case 3:
                return new qy0(tkr.a, 2);
            case 4:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 5:
                return new com.yandex.plus.network.okhttp.logger.a();
            case 6:
                f0[] values4 = f0.values();
                values4.getClass();
                return new udb("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.TrustErrorKind", values4);
            case 7:
                return new udb("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Connection", com.yandex.plus.pay.adapter.api.w.INSTANCE, new Annotation[0]);
            case 8:
                return new udb("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unauthorized", com.yandex.plus.pay.adapter.api.a0.INSTANCE, new Annotation[0]);
            case 9:
                return new udb("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.Unexpected", c0.INSTANCE, new Annotation[0]);
            case 10:
                return new qy0(tkr.a, 0);
            case 11:
                return new qy0(tkr.a, 0);
            case 12:
                com.yandex.plus.pay.api.google.model.m[] values5 = com.yandex.plus.pay.api.google.model.m.values();
                values5.getClass();
                return new udb("com.yandex.plus.pay.api.google.model.PurchaseState", values5);
            case 13:
                _childSerializers$_anonymous_ = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 14:
                _childSerializers$_anonymous_$0 = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 15:
                _childSerializers$_anonymous_$1 = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 16:
                _childSerializers$_anonymous_2 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 17:
                _childSerializers$_anonymous_$02 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 18:
                _childSerializers$_anonymous_$12 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 19:
                _init_$_anonymous_ = PlusPayCompositeOffers.Offer.Plan._init_$_anonymous_();
                return _init_$_anonymous_;
            case 20:
                _childSerializers$_anonymous_3 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 21:
                _childSerializers$_anonymous_$03 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 22:
                _childSerializers$_anonymous_$13 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 23:
                _childSerializers$_anonymous_4 = PlusPayInAppReplacementParams._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 24:
                _init_$_anonymous_2 = PlusPayInAppReplacementParams.Strategy._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 25:
                _childSerializers$_anonymous_5 = PlusPayLegalInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 26:
                _init_$_anonymous_3 = PlusPayLegalInfo.Item._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 27:
                _childSerializers$_anonymous_6 = PlusPayPrice._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.pay.common.internal.featureflags.a();
            default:
                return new qy0(tkr.a, 2);
        }
    }
}
