package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class vu21 implements uxs {
    public static final vu21 a;
    private static final SerialDescriptor descriptor;

    static {
        vu21 vu21Var = new vu21();
        a = vu21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.UserplaceInfo", vu21Var, 4);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("place_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(en60.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Number number = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                number = (Number) b.s(serialDescriptor, 2, en60.a, number);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new xu21(i, str, str2, number, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xu21 xu21Var = (xu21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || xu21Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, xu21Var.a);
        }
        if (b.F() || xu21Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, xu21Var.b);
        }
        if (b.F() || xu21Var.c != null) {
            b.g(serialDescriptor, 2, en60.a, xu21Var.c);
        }
        if (b.F() || xu21Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, xu21Var.d);
        }
        b.c(serialDescriptor);
    }
}
