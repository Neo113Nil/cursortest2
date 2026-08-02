package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class t7y implements uxs {
    public static final t7y a;
    private static final SerialDescriptor descriptor;

    static {
        t7y t7yVar = new t7y();
        a = t7yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.location.dto.LbsParams", t7yVar, 5);
        pluginGeneratedSerialDescriptor.j("common", true);
        pluginGeneratedSerialDescriptor.j("ip", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("gsm_cells", false);
        pluginGeneratedSerialDescriptor.j("wifi_networks", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = e8y.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{u7y.a, qke.n(auu0Var), auu0Var, i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e8y.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        w7y w7yVar = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                w7yVar = (w7y) b.A(serialDescriptor, 0, u7y.a, w7yVar);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new e8y(i, w7yVar, str, str2, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e8y e8yVar = (e8y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e8y.g;
        if (b.F() || !jl40.l(e8yVar.a, new w7y())) {
            b.e(serialDescriptor, 0, u7y.a, e8yVar.a);
        }
        b.g(serialDescriptor, 1, auu0.a, e8yVar.b);
        b.o(serialDescriptor, 2, e8yVar.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), e8yVar.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), e8yVar.e);
        b.c(serialDescriptor);
    }
}
