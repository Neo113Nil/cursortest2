package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.c1;
import ru.yandex.taxi.surge.models.dto.f;
import ru.yandex.taxi.surge.models.dto.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class qrw0 implements uxs {
    public static final qrw0 a;
    private static final SerialDescriptor descriptor;

    static {
        qrw0 qrw0Var = new qrw0();
        a = qrw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.GradientComponent", qrw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        i iVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                iVar = (i) b.A(serialDescriptor, 0, f.a, iVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new c1(i, iVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c1 c1Var = (c1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(c1Var.a, new i(0))) {
            b.e(serialDescriptor, 0, f.a, c1Var.a);
        }
        b.c(serialDescriptor);
    }
}
