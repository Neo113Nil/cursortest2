package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class vsa0 implements uxs {
    public static final vsa0 a;
    private static final SerialDescriptor descriptor;

    static {
        vsa0 vsa0Var = new vsa0();
        a = vsa0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.orders.PendingOrdersEndpointExperiment", vsa0Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("polling_request_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("await_on_startup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, pnz.a, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z3 = false;
            } else if (v == 0) {
                z = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xsa0(i, z, j, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xsa0 xsa0Var = (xsa0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        wsa0 wsa0Var = xsa0.Companion;
        if (b.F() || xsa0Var.b) {
            b.n(serialDescriptor, 0, xsa0Var.b);
        }
        if (b.F() || xsa0Var.c != 10000) {
            b.s(serialDescriptor, 1, xsa0Var.c);
        }
        if (b.F() || xsa0Var.d) {
            b.n(serialDescriptor, 2, xsa0Var.d);
        }
        b.c(serialDescriptor);
    }
}
