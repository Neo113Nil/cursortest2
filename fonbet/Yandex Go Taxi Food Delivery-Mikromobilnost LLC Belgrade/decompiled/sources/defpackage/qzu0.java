package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class qzu0 implements uxs {
    public static final qzu0 a;
    private static final SerialDescriptor descriptor;

    static {
        qzu0 qzu0Var = new qzu0();
        a = qzu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.subscribe.SubscribeParam", qzu0Var, 2);
        pluginGeneratedSerialDescriptor.j("push_tokens", false);
        pluginGeneratedSerialDescriptor.j("push_settings", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j5g0.a, a4g0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        l5g0 l5g0Var = null;
        c4g0 c4g0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l5g0Var = (l5g0) b.A(serialDescriptor, 0, j5g0.a, l5g0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                c4g0Var = (c4g0) b.A(serialDescriptor, 1, a4g0.a, c4g0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new szu0(i, l5g0Var, c4g0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        szu0 szu0Var = (szu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, j5g0.a, szu0Var.a);
        b.e(serialDescriptor, 1, a4g0.a, szu0Var.b);
        b.c(serialDescriptor);
    }
}
