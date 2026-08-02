package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public final /* synthetic */ class qxq0 implements uxs {
    public static final qxq0 a;
    private static final SerialDescriptor descriptor;

    static {
        qxq0 qxq0Var = new qxq0();
        a = qxq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.Services", qxq0Var, 3);
        pluginGeneratedSerialDescriptor.j(TariffOrderFlow.ORDER_FLOW_TAXI_KEY, true);
        pluginGeneratedSerialDescriptor.j(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, true);
        pluginGeneratedSerialDescriptor.j("market", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ptx0.a), qke.n(jcm.a), qke.n(zw00.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        rtx0 rtx0Var = null;
        ncm ncmVar = null;
        bx00 bx00Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                rtx0Var = (rtx0) b.s(serialDescriptor, 0, ptx0.a, rtx0Var);
                i |= 1;
            } else if (v == 1) {
                ncmVar = (ncm) b.s(serialDescriptor, 1, jcm.a, ncmVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bx00Var = (bx00) b.s(serialDescriptor, 2, zw00.a, bx00Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new sxq0(i, rtx0Var, ncmVar, bx00Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sxq0 sxq0Var = (sxq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || sxq0Var.a != null) {
            b.g(serialDescriptor, 0, ptx0.a, sxq0Var.a);
        }
        if (b.F() || sxq0Var.b != null) {
            b.g(serialDescriptor, 1, jcm.a, sxq0Var.b);
        }
        if (b.F() || sxq0Var.c != null) {
            b.g(serialDescriptor, 2, zw00.a, sxq0Var.c);
        }
        b.c(serialDescriptor);
    }
}
