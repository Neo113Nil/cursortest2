package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes6.dex */
public final /* synthetic */ class yce0 implements uxs {
    public static final yce0 a;
    private static final SerialDescriptor descriptor;

    static {
        yce0 yce0Var = new yce0();
        a = yce0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.PositionChoice", yce0Var, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, true);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ade0.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ade0.d;
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
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ade0(i, str, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ade0 ade0Var = (ade0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ade0.d;
        if (b.F() || ade0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ade0Var.a);
        }
        if (b.F() || ade0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ade0Var.b);
        }
        if (b.F() || ade0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, ade0Var.c);
        }
        b.c(serialDescriptor);
    }
}
