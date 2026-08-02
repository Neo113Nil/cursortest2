package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes12.dex */
public final /* synthetic */ class yat implements uxs {
    public static final yat a;
    private static final SerialDescriptor descriptor;

    static {
        yat yatVar = new yat();
        a = yatVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.response.GetPaymentKitConfigResponseDto", yatVar, 3);
        pluginGeneratedSerialDescriptor.j("exp_boxes", false);
        pluginGeneratedSerialDescriptor.j("flags", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = abt.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = abt.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new abt(i, str, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        abt abtVar = (abt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = abt.d;
        b.o(serialDescriptor, 0, abtVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), abtVar.b);
        b.o(serialDescriptor, 2, abtVar.c);
        b.c(serialDescriptor);
    }
}
