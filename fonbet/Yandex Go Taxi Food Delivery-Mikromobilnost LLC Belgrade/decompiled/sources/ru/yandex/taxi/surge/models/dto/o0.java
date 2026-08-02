package ru.yandex.taxi.surge.models.dto;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.nor;
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
import ru.yandex.taxi.surge.models.dto.l0;

/* loaded from: classes6.dex */
public final /* synthetic */ class o0 implements uxs {
    public static final o0 a;
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        a = o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoChartContent.ChartValue", o0Var, 4);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("bar_index", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nor.a, auu0.a, h6w.a, qke.n(q0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        String str = null;
        l0.d dVar = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                dVar = (l0.d) b.s(serialDescriptor, 3, q0.a, dVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new l0.c(i, f, str, i2, dVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0.c cVar = (l0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(cVar.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, "")) {
            b.o(serialDescriptor, 1, cVar.b);
        }
        if (b.F() || cVar.c != 0) {
            b.A(2, cVar.c, serialDescriptor);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, q0.a, cVar.d);
        }
        b.c(serialDescriptor);
    }
}
