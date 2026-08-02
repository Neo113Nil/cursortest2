package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.common_models.net.map_object.y;

/* loaded from: classes5.dex */
public final /* synthetic */ class xlb0 implements uxs {
    public static final xlb0 a;
    private static final SerialDescriptor descriptor;

    static {
        xlb0 xlb0Var = new xlb0();
        a = xlb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PickScooterParkingAction", xlb0Var, 3);
        pluginGeneratedSerialDescriptor.j("complete_request_context", true);
        pluginGeneratedSerialDescriptor.j("destination", true);
        pluginGeneratedSerialDescriptor.j("objects_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{rcx.a, qke.n(b0t.a), h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        b bVar = null;
        zzs zzsVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (b) b.A(serialDescriptor, 0, rcx.a, bVar);
                i |= 1;
            } else if (v == 1) {
                zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new y(i, bVar, zzsVar, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(yVar.a, JsonNull.INSTANCE)) {
            b.e(serialDescriptor, 0, rcx.a, yVar.a);
        }
        if (b.F() || yVar.b != null) {
            b.g(serialDescriptor, 1, b0t.a, yVar.b);
        }
        if (b.F() || yVar.c != 0) {
            b.A(2, yVar.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
