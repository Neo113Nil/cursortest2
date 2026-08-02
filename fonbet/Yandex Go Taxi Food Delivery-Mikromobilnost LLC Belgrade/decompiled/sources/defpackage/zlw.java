package defpackage;

import defpackage.ylw;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class zlw implements uxs {
    public static final zlw a;
    private static final SerialDescriptor descriptor;

    static {
        zlw zlwVar = new zlw();
        a = zlwVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.intercity.contact.IntercityDeliveryExtraExperiment.DeliveryRequirements", zlwVar, 1);
        pluginGeneratedSerialDescriptor.j("destination_contact", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(bmw.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ylw.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                cVar = (ylw.c) b.s(serialDescriptor, 0, bmw.a, cVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new ylw.b(i, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ylw.b bVar = (ylw.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, bmw.a, bVar.a);
        }
        b.c(serialDescriptor);
    }
}
