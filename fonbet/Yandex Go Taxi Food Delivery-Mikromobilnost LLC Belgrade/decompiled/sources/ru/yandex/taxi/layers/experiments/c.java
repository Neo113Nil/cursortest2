package ru.yandex.taxi.layers.experiments;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment.AnimationParams", cVar, 2);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("animation_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, LayersObjectsAnimationParamsExperiment.AnimationParams.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LayersObjectsAnimationParamsExperiment.AnimationParams.c;
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType animationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                animationType = (LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), animationType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new LayersObjectsAnimationParamsExperiment.AnimationParams(i, j, animationType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LayersObjectsAnimationParamsExperiment.AnimationParams animationParams = (LayersObjectsAnimationParamsExperiment.AnimationParams) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LayersObjectsAnimationParamsExperiment.AnimationParams.c;
        if (b.F() || animationParams.a != 0) {
            b.s(serialDescriptor, 0, animationParams.a);
        }
        if (b.F() || animationParams.b != LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), animationParams.b);
        }
        b.c(serialDescriptor);
    }
}
