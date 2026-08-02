package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class x531 implements uxs {
    public static final x531 a;
    private static final SerialDescriptor descriptor;

    static {
        x531 x531Var = new x531();
        a = x531Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.VehicleStatus", x531Var, 3);
        pluginGeneratedSerialDescriptor.j("charge_level", true);
        pluginGeneratedSerialDescriptor.j("remaining_distance", true);
        pluginGeneratedSerialDescriptor.j("remaining_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, nor.a, pnz.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f = b.y(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new z531(i, i2, f, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z531 z531Var = (z531) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || z531Var.a != 0) {
            b.A(0, z531Var.a, serialDescriptor);
        }
        if (b.F() || Float.compare(z531Var.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, z531Var.b);
        }
        if (b.F() || z531Var.c != 0) {
            b.s(serialDescriptor, 2, z531Var.c);
        }
        b.c(serialDescriptor);
    }
}
