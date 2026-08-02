package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes9.dex */
public final class v {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersCardV2.ChargeConfig.ValueOption.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
