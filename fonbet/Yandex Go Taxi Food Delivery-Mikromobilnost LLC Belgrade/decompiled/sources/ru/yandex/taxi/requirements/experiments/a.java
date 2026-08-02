package ru.yandex.taxi.requirements.experiments;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.qke;
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
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto", aVar, 4);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(c.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition preorderCardPosition = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                preorderCardPosition = (TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition) b.s(serialDescriptor, 3, c.a, preorderCardPosition);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto(i, str, str2, str3, preorderCardPosition);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto preorderCardTariffParametersDto = (TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || preorderCardTariffParametersDto.a != null) {
            b.g(serialDescriptor, 0, auu0.a, preorderCardTariffParametersDto.a);
        }
        if (b.F() || preorderCardTariffParametersDto.b != null) {
            b.g(serialDescriptor, 1, auu0.a, preorderCardTariffParametersDto.b);
        }
        if (b.F() || preorderCardTariffParametersDto.c != null) {
            b.g(serialDescriptor, 2, auu0.a, preorderCardTariffParametersDto.c);
        }
        if (b.F() || preorderCardTariffParametersDto.d != null) {
            b.g(serialDescriptor, 3, c.a, preorderCardTariffParametersDto.d);
        }
        b.c(serialDescriptor);
    }
}
