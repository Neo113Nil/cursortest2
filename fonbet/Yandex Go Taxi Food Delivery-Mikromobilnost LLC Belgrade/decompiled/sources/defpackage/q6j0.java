package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class q6j0 implements uxs {
    public static final q6j0 a;
    private static final SerialDescriptor descriptor;

    static {
        q6j0 q6j0Var = new q6j0();
        a = q6j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.RequestGooglePaySupportParams", q6j0Var, 2);
        pluginGeneratedSerialDescriptor.j("merchant", true);
        pluginGeneratedSerialDescriptor.j("gateway", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new s6j0(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s6j0 s6j0Var = (s6j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || s6j0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, s6j0Var.a);
        }
        if (b.F() || s6j0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, s6j0Var.b);
        }
        b.c(serialDescriptor);
    }
}
