package ru.yandex.taxi.requirements.experiments;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
