package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class qeb0 implements uxs {
    public static final qeb0 a;
    private static final SerialDescriptor descriptor;

    static {
        qeb0 qeb0Var = new qeb0();
        a = qeb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.options.PhoneDeliveryOption", qeb0Var, 2);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("phone_selection_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, yfb0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        agb0 agb0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                agb0Var = (agb0) b.A(serialDescriptor, 1, yfb0.a, agb0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new seb0(i, str, agb0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.agb0.g) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        seb0 seb0Var = (seb0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(seb0Var.a, "")) {
            b.o(serialDescriptor, 0, seb0Var.a);
        }
        if (!b.F()) {
            agb0 agb0Var = seb0Var.b;
            agb0.Companion.getClass();
        }
        b.e(serialDescriptor, 1, yfb0.a, seb0Var.b);
        b.c(serialDescriptor);
    }
}
