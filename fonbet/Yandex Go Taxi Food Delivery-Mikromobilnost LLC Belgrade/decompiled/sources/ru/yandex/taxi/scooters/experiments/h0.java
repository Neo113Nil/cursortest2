package ru.yandex.taxi.scooters.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
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
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class h0 implements uxs {
    public static final h0 a;
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment", h0Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("max_sessions", true);
        pluginGeneratedSerialDescriptor.j("camera", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, ScootersMultiOrderExperiment.f[1].getValue(), h6w.a, i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        Map map = null;
        ScootersMultiOrderExperiment.Camera camera = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                camera = (ScootersMultiOrderExperiment.Camera) b.A(serialDescriptor, 3, i0.a, camera);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScootersMultiOrderExperiment(i, z2, map, i2, camera);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersMultiOrderExperiment scootersMultiOrderExperiment = (ScootersMultiOrderExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.f;
        if (b.F() || scootersMultiOrderExperiment.b) {
            b.n(serialDescriptor, 0, scootersMultiOrderExperiment.b);
        }
        if (b.F() || !jl40.l(scootersMultiOrderExperiment.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), scootersMultiOrderExperiment.c);
        }
        if (b.F() || scootersMultiOrderExperiment.d != 1) {
            b.A(2, scootersMultiOrderExperiment.d, serialDescriptor);
        }
        if (b.F() || !jl40.l(scootersMultiOrderExperiment.e, new ScootersMultiOrderExperiment.Camera(0))) {
            b.e(serialDescriptor, 3, i0.a, scootersMultiOrderExperiment.e);
        }
        b.c(serialDescriptor);
    }
}
