package ru.yandex.taxi.surge.models.dto;

import defpackage.h6w;
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
import ru.yandex.taxi.surge.models.dto.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements uxs {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent.GradientAnalytics", jVar, 3);
        pluginGeneratedSerialDescriptor.j("free_cars", true);
        pluginGeneratedSerialDescriptor.j("all_cars", true);
        pluginGeneratedSerialDescriptor.j("orders_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                num2 = (Integer) b.s(serialDescriptor, 1, h6w.a, num2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num3 = (Integer) b.s(serialDescriptor, 2, h6w.a, num3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new i.b(i, num, num2, num3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i.b bVar = (i.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, bVar.c);
        }
        b.c(serialDescriptor);
    }
}
