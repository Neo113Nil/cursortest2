package defpackage;

import defpackage.u4w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class q4w implements uxs {
    public static final q4w a;
    private static final SerialDescriptor descriptor;

    static {
        q4w q4wVar = new q4w();
        a = q4wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Insurance", q4wVar, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("is_immutable", true);
        pluginGeneratedSerialDescriptor.j("provider_info", true);
        pluginGeneratedSerialDescriptor.j("full_insurance_prices", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), z96.a, qke.n(v4w.a), qke.n(s4w.a)};
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
        u4w.b bVar = null;
        u4w.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                bVar = (u4w.b) b.s(serialDescriptor, 2, v4w.a, bVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (u4w.a) b.s(serialDescriptor, 3, s4w.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new u4w(i, str, z2, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u4w u4wVar = (u4w) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || u4wVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, u4wVar.a);
        }
        if (b.F() || u4wVar.b) {
            b.n(serialDescriptor, 1, u4wVar.b);
        }
        if (b.F() || u4wVar.c != null) {
            b.g(serialDescriptor, 2, v4w.a, u4wVar.c);
        }
        if (b.F() || u4wVar.d != null) {
            b.g(serialDescriptor, 3, s4w.a, u4wVar.d);
        }
        b.c(serialDescriptor);
    }
}
