package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class rpw0 implements uxs {
    public static final rpw0 a;
    private static final SerialDescriptor descriptor;

    static {
        rpw0 rpw0Var = new rpw0();
        a = rpw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SurgeInfo", rpw0Var, 4);
        pluginGeneratedSerialDescriptor.j("balance", true);
        pluginGeneratedSerialDescriptor.j("info_balance", true);
        pluginGeneratedSerialDescriptor.j("unlock_balance", true);
        pluginGeneratedSerialDescriptor.j("description_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) tpw0.e[3].getValue());
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar, e6mVar, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tpw0.e;
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
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
                d3 = b.E(serialDescriptor, 2);
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
        return new tpw0(i, d, d2, d3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tpw0 tpw0Var = (tpw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tpw0.e;
        if (b.F() || Double.compare(tpw0Var.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, tpw0Var.a);
        }
        if (b.F() || Double.compare(tpw0Var.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, tpw0Var.b);
        }
        if (b.F() || Double.compare(tpw0Var.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, tpw0Var.c);
        }
        if (b.F() || tpw0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), tpw0Var.d);
        }
        b.c(serialDescriptor);
    }
}
