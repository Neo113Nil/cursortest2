package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class tgb implements uxs {
    public static final tgb a;
    private static final SerialDescriptor descriptor;

    static {
        tgb tgbVar = new tgb();
        a = tgbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.CheckPaymentRequest", tgbVar, 2);
        pluginGeneratedSerialDescriptor.j("paymentMethodID", true);
        pluginGeneratedSerialDescriptor.j("money", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(ms51.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        os51 os51Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                os51Var = (os51) b.s(serialDescriptor, 1, ms51.a, os51Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vgb(i, str, os51Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vgb vgbVar = (vgb) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || vgbVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, vgbVar.a);
        }
        if (b.F() || vgbVar.b != null) {
            b.g(serialDescriptor, 1, ms51.a, vgbVar.b);
        }
        b.c(serialDescriptor);
    }
}
