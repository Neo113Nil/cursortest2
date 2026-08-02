package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class w8a0 implements uxs {
    public static final w8a0 a;
    private static final SerialDescriptor descriptor;

    static {
        w8a0 w8a0Var = new w8a0();
        a = w8a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.PaymentMethods", w8a0Var, 2);
        pluginGeneratedSerialDescriptor.j("paymentMethods", false);
        pluginGeneratedSerialDescriptor.j("lastUsedPaymentMethod", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y8a0.c[0].getValue(), qke.n(u3a0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y8a0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        d4a0 d4a0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d4a0Var = (d4a0) b.s(serialDescriptor, 1, u3a0.a, d4a0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new y8a0(i, list, d4a0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y8a0 y8a0Var = (y8a0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) y8a0.c[0].getValue(), y8a0Var.a);
        b.g(serialDescriptor, 1, u3a0.a, y8a0Var.b);
        b.c(serialDescriptor);
    }
}
