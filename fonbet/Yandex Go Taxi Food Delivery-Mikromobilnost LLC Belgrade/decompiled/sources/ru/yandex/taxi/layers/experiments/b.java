package ru.yandex.taxi.layers.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.syx;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment", bVar, 2);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("animation_parameters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, qke.n(c.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        LayersObjectsAnimationParamsExperiment.AnimationParams animationParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                animationParams = (LayersObjectsAnimationParamsExperiment.AnimationParams) b.s(serialDescriptor, 1, c.a, animationParams);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new LayersObjectsAnimationParamsExperiment(i, z2, animationParams);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LayersObjectsAnimationParamsExperiment layersObjectsAnimationParamsExperiment = (LayersObjectsAnimationParamsExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        syx syxVar = LayersObjectsAnimationParamsExperiment.Companion;
        if (b.F() || layersObjectsAnimationParamsExperiment.b) {
            b.n(serialDescriptor, 0, layersObjectsAnimationParamsExperiment.b);
        }
        if (b.F() || layersObjectsAnimationParamsExperiment.c != null) {
            b.g(serialDescriptor, 1, c.a, layersObjectsAnimationParamsExperiment.c);
        }
        b.c(serialDescriptor);
    }
}
