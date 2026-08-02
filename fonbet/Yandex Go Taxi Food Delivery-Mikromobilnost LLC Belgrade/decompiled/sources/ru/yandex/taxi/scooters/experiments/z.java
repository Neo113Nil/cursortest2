package ru.yandex.taxi.scooters.experiments;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class z implements uxs {
    public static final z a;
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion", zVar, 3);
        pluginGeneratedSerialDescriptor.j("suggestion_id", true);
        pluginGeneratedSerialDescriptor.j("suggestion_ride_intervals", true);
        pluginGeneratedSerialDescriptor.j("upsale_window", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.d[1].getValue(), qke.n(b0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                upsaleWindow = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow) b.s(serialDescriptor, 2, b0.a, upsaleWindow);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion(i, str, list, upsaleWindow);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion fullInsuranceSuggestion = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.d;
        if (b.F() || !jl40.l(fullInsuranceSuggestion.a, "")) {
            b.o(serialDescriptor, 0, fullInsuranceSuggestion.a);
        }
        if (b.F() || !jl40.l(fullInsuranceSuggestion.b, Collections.singletonList(0L))) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), fullInsuranceSuggestion.b);
        }
        if (b.F() || fullInsuranceSuggestion.c != null) {
            b.g(serialDescriptor, 2, b0.a, fullInsuranceSuggestion.c);
        }
        b.c(serialDescriptor);
    }
}
