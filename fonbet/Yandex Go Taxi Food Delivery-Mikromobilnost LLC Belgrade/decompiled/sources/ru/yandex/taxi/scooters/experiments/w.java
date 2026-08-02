package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a5w;
import defpackage.auu0;
import defpackage.c5w;
import defpackage.d5w;
import defpackage.h5w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class w implements uxs {
    public static final w a;
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment", wVar, 8);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("info_promotion_id", true);
        pluginGeneratedSerialDescriptor.j("price_string_format", true);
        pluginGeneratedSerialDescriptor.j("full_insurance_suggestion", true);
        pluginGeneratedSerialDescriptor.j("v2", true);
        pluginGeneratedSerialDescriptor.j("v3", true);
        pluginGeneratedSerialDescriptor.j("disable_suggest", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(z.a), qke.n(a5w.a), qke.n(d5w.a), qke.n(x.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        ScootersClientInsuranceNewExperiment.a aVar = null;
        Map map = null;
        String str = null;
        String str2 = null;
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion fullInsuranceSuggestion = null;
        c5w c5wVar = null;
        h5w h5wVar = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    fullInsuranceSuggestion = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion) b.s(serialDescriptor, 4, z.a, fullInsuranceSuggestion);
                    i |= 16;
                    break;
                case 5:
                    c5wVar = (c5w) b.s(serialDescriptor, 5, a5w.a, c5wVar);
                    i |= 32;
                    break;
                case 6:
                    h5wVar = (h5w) b.s(serialDescriptor, 6, d5w.a, h5wVar);
                    i |= 64;
                    break;
                case 7:
                    aVar = (ScootersClientInsuranceNewExperiment.a) b.s(serialDescriptor, 7, x.a, aVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ScootersClientInsuranceNewExperiment(i, z2, map, str, str2, fullInsuranceSuggestion, c5wVar, h5wVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.j;
        if (b.F() || scootersClientInsuranceNewExperiment.b) {
            b.n(serialDescriptor, 0, scootersClientInsuranceNewExperiment.b);
        }
        if (b.F() || !jl40.l(scootersClientInsuranceNewExperiment.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), scootersClientInsuranceNewExperiment.c);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.d != null) {
            b.g(serialDescriptor, 2, auu0.a, scootersClientInsuranceNewExperiment.d);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.e != null) {
            b.g(serialDescriptor, 3, auu0.a, scootersClientInsuranceNewExperiment.e);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.f != null) {
            b.g(serialDescriptor, 4, z.a, scootersClientInsuranceNewExperiment.f);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.g != null) {
            b.g(serialDescriptor, 5, a5w.a, scootersClientInsuranceNewExperiment.g);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.h != null) {
            b.g(serialDescriptor, 6, d5w.a, scootersClientInsuranceNewExperiment.h);
        }
        if (b.F() || scootersClientInsuranceNewExperiment.i != null) {
            b.g(serialDescriptor, 7, x.a, scootersClientInsuranceNewExperiment.i);
        }
        b.c(serialDescriptor);
    }
}
