package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class zsw0 implements uxs {
    public static final zsw0 a;
    private static final SerialDescriptor descriptor;

    static {
        zsw0 zsw0Var = new zsw0();
        a = zsw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoResponse", zsw0Var, 2);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sqw0.a, hqw0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        uqw0 uqw0Var = null;
        jqw0 jqw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                uqw0Var = (uqw0) b.A(serialDescriptor, 0, sqw0.a, uqw0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                jqw0Var = (jqw0) b.A(serialDescriptor, 1, hqw0.a, jqw0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new btw0(i, uqw0Var, jqw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        btw0 btw0Var = (btw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(btw0Var.a, new uqw0(0))) {
            b.e(serialDescriptor, 0, sqw0.a, btw0Var.a);
        }
        if (b.F() || !jl40.l(btw0Var.b, new jqw0(0))) {
            b.e(serialDescriptor, 1, hqw0.a, btw0Var.b);
        }
        b.c(serialDescriptor);
    }
}
