package ru.yandex.taxi.requirements.experiments;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition", cVar, 1);
        pluginGeneratedSerialDescriptor.j("section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection cardPositionSection = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                cardPositionSection = (TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), cardPositionSection);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition(i, cardPositionSection);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition preorderCardPosition = (TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.b;
        if (b.F() || preorderCardPosition.a != TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection.DEFAULT) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), preorderCardPosition.a);
        }
        b.c(serialDescriptor);
    }
}
