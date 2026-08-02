package ru.yandex.taxi.masstransit.trains.checkout.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;

/* loaded from: classes6.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtTrainCheckoutResponse.ResponseStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
