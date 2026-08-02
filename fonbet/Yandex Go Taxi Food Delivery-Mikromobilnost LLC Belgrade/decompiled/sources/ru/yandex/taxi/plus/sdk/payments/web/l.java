package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$StatePaymentEvent;

/* loaded from: classes6.dex */
public final class l {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentEvent$StatePaymentEvent.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
