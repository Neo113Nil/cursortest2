package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class u6a0 implements uxs {
    public static final u6a0 a;
    private static final SerialDescriptor descriptor;

    static {
        u6a0 u6a0Var = new u6a0();
        a = u6a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.PaymentMethodRequest", u6a0Var, 4);
        pluginGeneratedSerialDescriptor.j("lat", true);
        pluginGeneratedSerialDescriptor.j("lon", true);
        pluginGeneratedSerialDescriptor.j("paymentMethod", true);
        pluginGeneratedSerialDescriptor.j("xpay_networks", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w6a0.e;
        KSerializer n = qke.n(o65.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[3].getValue());
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar, n, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = w6a0.e;
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        q65 q65Var = null;
        List list = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                q65Var = (q65) b.s(serialDescriptor, 2, o65.a, q65Var);
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
        return new w6a0(i, d, d2, q65Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w6a0 w6a0Var = (w6a0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w6a0.e;
        if (b.F() || Double.compare(w6a0Var.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, w6a0Var.a);
        }
        if (b.F() || Double.compare(w6a0Var.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, w6a0Var.b);
        }
        if (b.F() || w6a0Var.c != null) {
            b.g(serialDescriptor, 2, o65.a, w6a0Var.c);
        }
        if (b.F() || w6a0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), w6a0Var.d);
        }
        b.c(serialDescriptor);
    }
}
