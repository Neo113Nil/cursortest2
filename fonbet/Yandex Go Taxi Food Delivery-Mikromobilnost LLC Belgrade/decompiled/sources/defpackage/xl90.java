package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes6.dex */
public final /* synthetic */ class xl90 implements uxs {
    public static final xl90 a;
    private static final SerialDescriptor descriptor;

    static {
        xl90 xl90Var = new xl90();
        a = xl90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassesErrorResponse", xl90Var, 1);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ul90.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        wl90 wl90Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                wl90Var = (wl90) b.s(serialDescriptor, 0, ul90.a, wl90Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new zl90(i, wl90Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zl90 zl90Var = (zl90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || zl90Var.a != null) {
            b.g(serialDescriptor, 0, ul90.a, zl90Var.a);
        }
        b.c(serialDescriptor);
    }
}
