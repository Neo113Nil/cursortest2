package com.yandex.plus.pay.internal.di;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import defpackage.quj;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.x3f;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t9f _childSerializers$_anonymous_;
        t9f _childSerializers$_anonymous_$0;
        t9f _childSerializers$_anonymous_$1;
        t9f _childSerializers$_anonymous_2;
        t9f _childSerializers$_anonymous_$02;
        t9f _childSerializers$_anonymous_3;
        t9f _childSerializers$_anonymous_$03;
        t9f _childSerializers$_anonymous_4;
        t9f _childSerializers$_anonymous_5;
        t9f _childSerializers$_anonymous_$12;
        t9f _childSerializers$_anonymous_$2;
        t9f _childSerializers$_anonymous_6;
        switch (this.a) {
            case 0:
                return quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(14));
            case 1:
                return new com.yandex.plus.core.network.api.interceptors.d();
            case 2:
                return new com.yandex.plus.pay.internal.model.mappers.f();
            case 3:
                return new com.yandex.plus.pay.internal.model.mappers.g();
            case 4:
                return new com.yandex.plus.pay.internal.model.mappers.i();
            case 5:
                return new com.yandex.plus.pay.internal.model.mappers.g();
            case 6:
                return new com.yandex.plus.pay.internal.model.mappers.k();
            case 7:
                return new com.yandex.plus.pay.internal.model.mappers.i();
            case 8:
                return new com.yandex.plus.pay.internal.model.mappers.g();
            case 9:
                return new qy0(PlusPayUpsaleStep.INSTANCE.serializer(), 0);
            case 10:
                return new qy0(com.yandex.plus.pay.internal.feature.offers.o.a, 0);
            case 11:
                return PlusPayUpsaleStep.INSTANCE.serializer();
            case 12:
                return new com.yandex.plus.pay.internal.model.mappers.l();
            case 13:
                return new com.yandex.plus.pay.internal.model.mappers.c(new com.yandex.plus.pay.internal.model.mappers.i(), new com.yandex.plus.pay.internal.model.mappers.g());
            case 14:
                return new com.yandex.plus.pay.internal.model.mappers.m();
            case 15:
                return new com.yandex.plus.pay.internal.model.mappers.c(new com.yandex.plus.pay.internal.model.mappers.i(), new com.yandex.plus.pay.internal.model.mappers.g());
            case 16:
                return new com.yandex.plus.pay.internal.model.mappers.n();
            case 17:
                return new com.yandex.plus.pay.internal.model.mappers.n();
            case 18:
                _childSerializers$_anonymous_ = PlusPayAdditionalOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 19:
                _childSerializers$_anonymous_$0 = PlusPayAdditionalOffer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 20:
                _childSerializers$_anonymous_$1 = PlusPayAdditionalOffer._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 21:
                _childSerializers$_anonymous_2 = PlusPayAdditionalOffer.Assets._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 22:
                _childSerializers$_anonymous_$02 = PlusPayAdditionalOffer.Assets._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 23:
                _childSerializers$_anonymous_3 = PlusPayAdditionalOffers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 24:
                _childSerializers$_anonymous_$03 = PlusPayAdditionalOffers._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 25:
                _childSerializers$_anonymous_4 = PlusPayClosingOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 26:
                _childSerializers$_anonymous_5 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 27:
                _childSerializers$_anonymous_$12 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                _childSerializers$_anonymous_$2 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            default:
                _childSerializers$_anonymous_6 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
        }
    }
}
