package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

/* loaded from: classes6.dex */
public final class f0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CreatePaymentResponse.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
