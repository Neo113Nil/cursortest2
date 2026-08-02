package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes6.dex */
public final /* synthetic */ class tws0 implements uxs {
    public static final tws0 a;
    private static final SerialDescriptor descriptor;

    static {
        tws0 tws0Var = new tws0();
        a = tws0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Slowdown", tws0Var, 2);
        pluginGeneratedSerialDescriptor.j("speed_limit", true);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vws0(i, i2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vws0 vws0Var = (vws0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || vws0Var.a != 0) {
            b.A(0, vws0Var.a, serialDescriptor);
        }
        if (b.F() || !jl40.l(vws0Var.b, "")) {
            b.o(serialDescriptor, 1, vws0Var.b);
        }
        b.c(serialDescriptor);
    }
}
