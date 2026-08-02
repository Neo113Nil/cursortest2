package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.common_models.net.map_object.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class slb0 implements uxs {
    public static final slb0 a;
    private static final SerialDescriptor descriptor;

    static {
        slb0 slb0Var = new slb0();
        a = slb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PickDriveParkingAction", slb0Var, 1);
        pluginGeneratedSerialDescriptor.j("complete_request_context", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.s(serialDescriptor, 0, rcx.a, bVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new w(i, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, rcx.a, ((w) obj).a);
        b.c(serialDescriptor);
    }
}
