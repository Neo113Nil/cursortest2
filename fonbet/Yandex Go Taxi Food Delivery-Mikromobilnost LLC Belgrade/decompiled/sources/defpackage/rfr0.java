package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class rfr0 implements uxs {
    public static final rfr0 a;
    private static final SerialDescriptor descriptor;

    static {
        rfr0 rfr0Var = new rfr0();
        a = rfr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.SetupRequirements", rfr0Var, 4);
        pluginGeneratedSerialDescriptor.j("item_title", true);
        pluginGeneratedSerialDescriptor.j("item_with_requirements_title", true);
        pluginGeneratedSerialDescriptor.j("screen_title", true);
        pluginGeneratedSerialDescriptor.j("confirm", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new tfr0(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tfr0 tfr0Var = (tfr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(tfr0Var.a, "")) {
            b.o(serialDescriptor, 0, tfr0Var.a);
        }
        if (b.F() || !jl40.l(tfr0Var.b, "")) {
            b.o(serialDescriptor, 1, tfr0Var.b);
        }
        if (b.F() || !jl40.l(tfr0Var.c, "")) {
            b.o(serialDescriptor, 2, tfr0Var.c);
        }
        if (b.F() || !jl40.l(tfr0Var.d, "")) {
            b.o(serialDescriptor, 3, tfr0Var.d);
        }
        b.c(serialDescriptor);
    }
}
