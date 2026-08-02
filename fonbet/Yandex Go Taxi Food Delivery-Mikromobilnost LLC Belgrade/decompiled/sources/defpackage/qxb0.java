package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class qxb0 implements uxs {
    public static final qxb0 a;
    private static final SerialDescriptor descriptor;

    static {
        qxb0 qxb0Var = new qxb0();
        a = qxb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.experiments.PinOverrideRule.TariffOverride", qxb0Var, 3);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("source_pin", true);
        pluginGeneratedSerialDescriptor.j("destination_on_map", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sxb0.d[0].getValue(), qke.n(xdt0.a), qke.n(hzi.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = sxb0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        zdt0 zdt0Var = null;
        jzi jziVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                zdt0Var = (zdt0) b.s(serialDescriptor, 1, xdt0.a, zdt0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                jziVar = (jzi) b.s(serialDescriptor, 2, hzi.a, jziVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new sxb0(i, list, zdt0Var, jziVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        sxb0 sxb0Var = (sxb0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = sxb0.d;
        if (b.F() || !jl40.l(sxb0Var.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), sxb0Var.a);
        }
        if (b.F() || sxb0Var.b != null) {
            b.g(serialDescriptor, 1, xdt0.a, sxb0Var.b);
        }
        if (b.F() || sxb0Var.c != null) {
            b.g(serialDescriptor, 2, hzi.a, sxb0Var.c);
        }
        b.c(serialDescriptor);
    }
}
