package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class y550 implements uxs {
    public static final y550 a;
    private static final SerialDescriptor descriptor;

    static {
        y550 y550Var = new y550();
        a = y550Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.Navigation", y550Var, 4);
        pluginGeneratedSerialDescriptor.j("navigation_to_any_point", true);
        pluginGeneratedSerialDescriptor.j("allow_parking_navigation", true);
        pluginGeneratedSerialDescriptor.j("is_nearest_parking_navigation_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_destination_parking_warning_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                i |= 2;
            } else if (v == 2) {
                bool3 = (Boolean) b.s(serialDescriptor, 2, z96.a, bool3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool4 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new a650(i, bool, bool2, bool3, bool4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a650 a650Var = (a650) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || a650Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, a650Var.a);
        }
        if (b.F() || a650Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, a650Var.b);
        }
        if (b.F() || a650Var.c != null) {
            b.g(serialDescriptor, 2, z96.a, a650Var.c);
        }
        if (b.F() || a650Var.d != null) {
            b.g(serialDescriptor, 3, z96.a, a650Var.d);
        }
        b.c(serialDescriptor);
    }
}
