package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

/* loaded from: classes5.dex */
public final /* synthetic */ class u3a0 implements uxs {
    public static final u3a0 a;
    private static final SerialDescriptor descriptor;

    static {
        u3a0 u3a0Var = new u3a0();
        a = u3a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.PaymentMethod", u3a0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("number", false);
        pluginGeneratedSerialDescriptor.j("system", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = d4a0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d4a0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PaymentMethodType paymentMethodType = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                paymentMethodType = (PaymentMethodType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), paymentMethodType);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new d4a0(i, str, paymentMethodType, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d4a0 d4a0Var = (d4a0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d4a0.f;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, d4a0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), d4a0Var.b);
        b.g(serialDescriptor, 2, auu0Var, d4a0Var.c);
        b.g(serialDescriptor, 3, auu0Var, d4a0Var.d);
        b.g(serialDescriptor, 4, auu0Var, d4a0Var.e);
        b.c(serialDescriptor);
    }
}
