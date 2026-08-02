package ru.yandex.taxi.panorama;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.panorama.d;

/* loaded from: classes9.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.panorama.TaxiPanoramaExperiment.PanoramaTooltip", eVar, 2);
        pluginGeneratedSerialDescriptor.j("behind_screen_pin_a_key", true);
        pluginGeneratedSerialDescriptor.j("behind_screen_pin_b_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new d.b(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d.b bVar = (d.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, "")) {
            b.o(serialDescriptor, 1, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
