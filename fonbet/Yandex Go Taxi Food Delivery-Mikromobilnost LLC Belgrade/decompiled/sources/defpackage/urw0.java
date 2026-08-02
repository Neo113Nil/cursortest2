package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.e1;
import ru.yandex.taxi.surge.models.dto.r;
import ru.yandex.taxi.surge.models.dto.u;

/* loaded from: classes6.dex */
public final /* synthetic */ class urw0 implements uxs {
    public static final urw0 a;
    private static final SerialDescriptor descriptor;

    static {
        urw0 urw0Var = new urw0();
        a = urw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.HorizontalShortcuts", urw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        u uVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                uVar = (u) b.A(serialDescriptor, 0, r.a, uVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new e1(i, uVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e1 e1Var = (e1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(e1Var.a, new u(0))) {
            b.e(serialDescriptor, 0, r.a, e1Var.a);
        }
        b.c(serialDescriptor);
    }
}
