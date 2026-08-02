package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class x implements uxs {
    public static final x a;
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment.DisableSuggest", xVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("suggestion_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("main_button_text", true);
        pluginGeneratedSerialDescriptor.j("minor_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{z96.a, auu0.a, w7sVar, w7sVar, w7sVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                i |= 4;
            } else if (v == 3) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                formattedText3 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScootersClientInsuranceNewExperiment.a(i, z2, str, formattedText, formattedText2, formattedText3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersClientInsuranceNewExperiment.a aVar = (ScootersClientInsuranceNewExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a) {
            b.n(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
