package defpackage;

import defpackage.rct;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class sct implements uxs {
    public static final sct a;
    private static final SerialDescriptor descriptor;

    static {
        sct sctVar = new sct();
        a = sctVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.data.dto.GetRideHistoryOrderByIdResponse.RideHistoryOrderDriverDto", sctVar, 3);
        pluginGeneratedSerialDescriptor.j("call_mode", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rct.b(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rct.b bVar = (rct.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bVar.c);
        }
        b.c(serialDescriptor);
    }
}
