package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class uhq0 implements uxs {
    public static final uhq0 a;
    private static final SerialDescriptor descriptor;

    static {
        uhq0 uhq0Var = new uhq0();
        a = uhq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload", uhq0Var, 3);
        pluginGeneratedSerialDescriptor.j("methodId", false);
        pluginGeneratedSerialDescriptor.j("methodType", false);
        pluginGeneratedSerialDescriptor.j("rawPayloadString", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), auu0Var};
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
        String str3 = null;
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
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SelectedPaymentMethodPayload(i, str, str2, str3, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SelectedPaymentMethodPayload.write$Self$flows_payment_kit_release((SelectedPaymentMethodPayload) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
