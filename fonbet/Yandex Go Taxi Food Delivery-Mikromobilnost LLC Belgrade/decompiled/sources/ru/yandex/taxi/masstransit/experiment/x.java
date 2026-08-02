package ru.yandex.taxi.masstransit.experiment;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h6w;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class x implements uxs {
    public static final x a;
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.WalkingRouteSettings", xVar, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("start_position", true);
        pluginGeneratedSerialDescriptor.j("max_min_duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96.a, qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment.g(i, z2, num, num2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment.g gVar = (TransportOnSummaryExperiment.g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || gVar.a) {
            b.n(serialDescriptor, 0, gVar.a);
        }
        if (b.F() || gVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, gVar.b);
        }
        if (b.F() || gVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, gVar.c);
        }
        b.c(serialDescriptor);
    }
}
