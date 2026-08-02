package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class rl90 implements uxs {
    public static final rl90 a;
    private static final SerialDescriptor descriptor;

    static {
        rl90 rl90Var = new rl90();
        a = rl90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Passes", rl90Var, 3);
        pluginGeneratedSerialDescriptor.j("free_passes", true);
        pluginGeneratedSerialDescriptor.j("super_passes", true);
        pluginGeneratedSerialDescriptor.j("pending_operation_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(e590.a), qke.n(g8w0.a), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        g590 g590Var = null;
        i8w0 i8w0Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                g590Var = (g590) b.s(serialDescriptor, 0, e590.a, g590Var);
                i |= 1;
            } else if (v == 1) {
                i8w0Var = (i8w0) b.s(serialDescriptor, 1, g8w0.a, i8w0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new tl90(i, g590Var, i8w0Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tl90 tl90Var = (tl90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || tl90Var.a != null) {
            b.g(serialDescriptor, 0, e590.a, tl90Var.a);
        }
        if (b.F() || tl90Var.b != null) {
            b.g(serialDescriptor, 1, g8w0.a, tl90Var.b);
        }
        if (b.F() || tl90Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, tl90Var.c);
        }
        b.c(serialDescriptor);
    }
}
