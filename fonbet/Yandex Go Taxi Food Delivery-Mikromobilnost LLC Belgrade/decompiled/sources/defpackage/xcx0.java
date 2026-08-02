package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class xcx0 implements uxs {
    public static final xcx0 a;
    private static final SerialDescriptor descriptor;

    static {
        xcx0 xcx0Var = new xcx0();
        a = xcx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment", xcx0Var, 2);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("parameters_by_tariff", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TariffCardPreorderCellCustomizationExperiment.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffCardPreorderCellCustomizationExperiment.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        Map map2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                map2 = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new TariffCardPreorderCellCustomizationExperiment(i, map, map2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TariffCardPreorderCellCustomizationExperiment tariffCardPreorderCellCustomizationExperiment = (TariffCardPreorderCellCustomizationExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffCardPreorderCellCustomizationExperiment.d;
        if (b.F() || !jl40.l(tariffCardPreorderCellCustomizationExperiment.b, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), tariffCardPreorderCellCustomizationExperiment.b);
        }
        if (b.F() || !jl40.l(tariffCardPreorderCellCustomizationExperiment.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), tariffCardPreorderCellCustomizationExperiment.c);
        }
        b.c(serialDescriptor);
    }
}
