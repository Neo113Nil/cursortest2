package com.yandex.plus.pay.internal.model;

import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.home.plaque.plugin.internal.di.c;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.repository.api.model.offers.a1;
import com.yandex.plus.pay.repository.api.model.offers.b1;
import com.yandex.plus.pay.repository.api.model.offers.d1;
import com.yandex.plus.pay.repository.api.model.offers.e1;
import com.yandex.plus.pay.repository.api.model.offers.g1;
import com.yandex.plus.pay.repository.api.model.offers.h1;
import com.yandex.plus.pay.repository.api.model.offers.r0;
import com.yandex.plus.pay.repository.api.model.offers.t0;
import com.yandex.plus.pay.repository.api.model.offers.u0;
import com.yandex.plus.pay.repository.api.model.offers.x0;
import com.yandex.plus.pay.repository.api.model.offers.y0;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.e;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b;
import com.yandex.pulse.metrics.o;
import defpackage.c5b;
import defpackage.cl4;
import defpackage.ern;
import defpackage.f9f;
import defpackage.gao;
import defpackage.qy0;
import defpackage.s9f;
import defpackage.t9f;
import defpackage.tyo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(c cVar) {
        this.a = 29;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t9f _childSerializers$_anonymous_$0;
        t9f _childSerializers$_anonymous_$1;
        t9f _childSerializers$_anonymous_;
        t9f _childSerializers$_anonymous_$02;
        t9f _childSerializers$_anonymous_$12;
        t9f _childSerializers$_anonymous_2;
        t9f _childSerializers$_anonymous_$03;
        t9f _childSerializers$_anonymous_3;
        t9f _childSerializers$_anonymous_4;
        t9f _childSerializers$_anonymous_$04;
        t9f _childSerializers$_anonymous_$13;
        t9f _childSerializers$_anonymous_5;
        t9f _childSerializers$_anonymous_6;
        t9f _childSerializers$_anonymous_7;
        t9f _childSerializers$_anonymous_8;
        t9f _childSerializers$_anonymous_9;
        t9f _childSerializers$_anonymous_10;
        t9f _init_$_anonymous_;
        t9f _init_$_anonymous_2;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$0 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_$1 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 2:
                _childSerializers$_anonymous_ = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 3:
                _childSerializers$_anonymous_$02 = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 4:
                _childSerializers$_anonymous_$12 = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 5:
                _childSerializers$_anonymous_2 = PlusPayCompositeOfferDetails.PaymentMethodsGroup._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 6:
                _childSerializers$_anonymous_$03 = PlusPayCompositeOfferDetails.PaymentMethodsGroup._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 7:
                _childSerializers$_anonymous_3 = PlusPayCompositeOfferDetails.PaymentPromo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 8:
                _childSerializers$_anonymous_4 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 9:
                _childSerializers$_anonymous_$04 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 10:
                _childSerializers$_anonymous_$13 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 11:
                _childSerializers$_anonymous_5 = PlusPayCounterOffers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 12:
                _childSerializers$_anonymous_6 = PlusPayCounterOffers.CounterOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 13:
                _childSerializers$_anonymous_7 = PlusPayInvoice._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 14:
                _childSerializers$_anonymous_8 = PlusPayInvoice.Payment._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 15:
                _childSerializers$_anonymous_9 = PlusPayRichText._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 16:
                _childSerializers$_anonymous_10 = PlusPayRichText.Item.TextColor._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 17:
                _init_$_anonymous_ = PlusPayUpsaleStep._init_$_anonymous_();
                return _init_$_anonymous_;
            case 18:
                _init_$_anonymous_2 = PlusPayUpsaleType._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 19:
                return new qy0(h1.Companion.serializer(), 0);
            case 20:
                return new tyo("com.yandex.plus.pay.repository.api.model.offers.RichText.Item", ern.a(h1.class), new f9f[]{ern.a(t0.class), ern.a(x0.class), ern.a(a1.class), ern.a(d1.class), ern.a(g1.class)}, new t9f[]{r0.a, u0.a, y0.a, b1.a, e1.a}, new Annotation[0]);
            case 21:
                return v.Companion.serializer(k.Companion.serializer());
            case 22:
                return new com.yandex.plus.pay.ui.core.debug.internal.domain.log.a();
            case 23:
                s9f[] s9fVarArr = e.o;
                com.yandex.plus.pay.ui.core.debug.internal.ui.form.web.a aVar = new com.yandex.plus.pay.ui.core.debug.internal.ui.form.web.a();
                aVar.b = c5b.a;
                return aVar;
            case 24:
                return new cl4(new gao(1));
            case 25:
                return new b();
            case 26:
                return new com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.c();
            case 27:
                return new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.b();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.plus.paymentsdk.internal.common.a();
            default:
                return new com.yandex.plus.paymentsdk.api.c(R.style.PlusSDK_Theme_PaymentSdk_Light);
        }
    }

    public /* synthetic */ a(int i) {
        this.a = i;
    }
}
