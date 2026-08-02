package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class y4e0 implements uxs {
    public static final y4e0 a;
    private static final SerialDescriptor descriptor;

    static {
        y4e0 y4e0Var = new y4e0();
        a = y4e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolylineStyle", y4e0Var, 4);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("width", true);
        pluginGeneratedSerialDescriptor.j("outline", true);
        pluginGeneratedSerialDescriptor.j("turn_radius", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        nor norVar = nor.a;
        return new KSerializer[]{n, qke.n(norVar), qke.n(b5e0.a), qke.n(norVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Float f = null;
        d5e0 d5e0Var = null;
        Float f2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                i |= 2;
            } else if (v == 2) {
                d5e0Var = (d5e0) b.s(serialDescriptor, 2, b5e0.a, d5e0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f2 = (Float) b.s(serialDescriptor, 3, nor.a, f2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new a5e0(i, str, f, d5e0Var, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a5e0 a5e0Var = (a5e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || a5e0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, a5e0Var.a);
        }
        if (b.F() || a5e0Var.b != null) {
            b.g(serialDescriptor, 1, nor.a, a5e0Var.b);
        }
        if (b.F() || a5e0Var.c != null) {
            b.g(serialDescriptor, 2, b5e0.a, a5e0Var.c);
        }
        if (b.F() || a5e0Var.d != null) {
            b.g(serialDescriptor, 3, nor.a, a5e0Var.d);
        }
        b.c(serialDescriptor);
    }
}
