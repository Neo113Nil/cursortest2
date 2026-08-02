package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ycj0 implements uxs {
    public static final ycj0 a;
    private static final SerialDescriptor descriptor;

    static {
        ycj0 ycj0Var = new ycj0();
        a = ycj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.RequirementAvailabilityConfig", ycj0Var, 4);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("show_requirement_on_summary", true);
        pluginGeneratedSerialDescriptor.j("show_requirement_on_delivery_screen", true);
        pluginGeneratedSerialDescriptor.j("allowed_payment_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) adj0.e[3].getValue());
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0.a, z96Var, z96Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = adj0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new adj0(i, str, list, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        adj0 adj0Var = (adj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = adj0.e;
        if (b.F() || !jl40.l(adj0Var.a, "")) {
            b.o(serialDescriptor, 0, adj0Var.a);
        }
        if (b.F() || !adj0Var.b) {
            b.n(serialDescriptor, 1, adj0Var.b);
        }
        if (b.F() || !adj0Var.c) {
            b.n(serialDescriptor, 2, adj0Var.c);
        }
        if (b.F() || adj0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), adj0Var.d);
        }
        b.c(serialDescriptor);
    }
}
