package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final /* synthetic */ class rxx0 implements uxs {
    public static final rxx0 a;
    private static final SerialDescriptor descriptor;

    static {
        rxx0 rxx0Var = new rxx0();
        a = rxx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.TaxiOrder", rxx0Var, 5);
        pluginGeneratedSerialDescriptor.j("point_a", false);
        pluginGeneratedSerialDescriptor.j("point_b", false);
        pluginGeneratedSerialDescriptor.j("order_for_another_selected", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        tzs tzsVar = tzs.a;
        KSerializer n = qke.n(tzsVar);
        KSerializer n2 = qke.n(tzsVar);
        KSerializer n3 = qke.n(z96.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        xzs xzsVar = null;
        xzs xzsVar2 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                xzsVar = (xzs) b.s(serialDescriptor, 0, tzs.a, xzsVar);
                i |= 1;
            } else if (v == 1) {
                xzsVar2 = (xzs) b.s(serialDescriptor, 1, tzs.a, xzsVar2);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new uxx0(i, xzsVar, xzsVar2, bool, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uxx0 uxx0Var = (uxx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        tzs tzsVar = tzs.a;
        xzs xzsVar = uxx0Var.a;
        String str = uxx0Var.e;
        b.g(serialDescriptor, 0, tzsVar, xzsVar);
        b.g(serialDescriptor, 1, tzsVar, uxx0Var.b);
        b.g(serialDescriptor, 2, z96.a, uxx0Var.c);
        b.o(serialDescriptor, 3, uxx0Var.d);
        if (b.F() || !jl40.l(str, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
            b.o(serialDescriptor, 4, str);
        }
        b.c(serialDescriptor);
    }
}
