package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class xjq0 implements uxs {
    public static final xjq0 a;
    private static final SerialDescriptor descriptor;

    static {
        xjq0 xjq0Var = new xjq0();
        a = xjq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedYBMethod.Companion.DecodedPayload", xjq0Var, 3);
        pluginGeneratedSerialDescriptor.j(SelectedPaymentMethodPayload.KEY_METHOD_ID, false);
        pluginGeneratedSerialDescriptor.j("card_type", true);
        pluginGeneratedSerialDescriptor.j("is_owner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(z96.a)};
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
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new zjq0(i, bool, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zjq0 zjq0Var = (zjq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = zjq0Var.a;
        Boolean bool = zjq0Var.c;
        String str2 = zjq0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 1, auu0.a, str2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 2, z96.a, bool);
        }
        b.c(serialDescriptor);
    }
}
