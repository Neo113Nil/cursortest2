package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.experiments.FinishCard;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FinishCard.Section.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
