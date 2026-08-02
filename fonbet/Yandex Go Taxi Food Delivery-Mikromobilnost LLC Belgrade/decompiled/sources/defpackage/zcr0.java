package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class zcr0 implements uxs {
    public static final zcr0 a;
    private static final SerialDescriptor descriptor;

    static {
        zcr0 zcr0Var = new zcr0();
        a = zcr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.SettingsResponse", zcr0Var, 1);
        pluginGeneratedSerialDescriptor.j("menu", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jk10.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        nk10 nk10Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                nk10Var = (nk10) b.A(serialDescriptor, 0, jk10.a, nk10Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new bdr0(i, nk10Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bdr0 bdr0Var = (bdr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bdr0Var.a, new nk10(0))) {
            b.e(serialDescriptor, 0, jk10.a, bdr0Var.a);
        }
        b.c(serialDescriptor);
    }
}
