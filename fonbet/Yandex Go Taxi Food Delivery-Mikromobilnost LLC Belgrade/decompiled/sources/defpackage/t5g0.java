package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class t5g0 implements uxs {
    public static final t5g0 a;
    private static final SerialDescriptor descriptor;

    static {
        t5g0 t5g0Var = new t5g0();
        a = t5g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.Qr", t5g0Var, 3);
        pluginGeneratedSerialDescriptor.j("prefixes", true);
        pluginGeneratedSerialDescriptor.j("number_length", true);
        pluginGeneratedSerialDescriptor.j("valid_number_min_length", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) v5g0.d[0].getValue());
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = v5g0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new v5g0(i, list, num, num2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v5g0 v5g0Var = (v5g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = v5g0.d;
        if (b.F() || v5g0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), v5g0Var.a);
        }
        if (b.F() || v5g0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, v5g0Var.b);
        }
        if (b.F() || v5g0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, v5g0Var.c);
        }
        b.c(serialDescriptor);
    }
}
