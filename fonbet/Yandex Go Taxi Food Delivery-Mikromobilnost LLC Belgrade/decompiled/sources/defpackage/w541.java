package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.t0;

/* loaded from: classes5.dex */
public final /* synthetic */ class w541 implements uxs {
    public static final w541 a;
    private static final SerialDescriptor descriptor;

    static {
        w541 w541Var = new w541();
        a = w541Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.WalkRouteAction", w541Var, 1);
        pluginGeneratedSerialDescriptor.j("dst", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qyi.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        syi syiVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                syiVar = (syi) b.A(serialDescriptor, 0, qyi.a, syiVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new t0(i, syiVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t0 t0Var = (t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(t0Var.a, new syi(3, null))) {
            b.e(serialDescriptor, 0, qyi.a, t0Var.a);
        }
        b.c(serialDescriptor);
    }
}
