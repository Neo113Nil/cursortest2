package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class uvj implements uxs {
    public static final uvj a;
    private static final SerialDescriptor descriptor;

    static {
        uvj uvjVar = new uvj();
        a = uvjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.DiscoveryOpenTransportAction", uvjVar, 3);
        pluginGeneratedSerialDescriptor.j("line_id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(uc4.Companion.serializer());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n};
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
        uc4 uc4Var = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                uc4Var = (uc4) b.s(serialDescriptor, 2, uc4.Companion.serializer(), uc4Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wvj(i, uc4Var, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wvj wvjVar = (wvj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(wvjVar.a, "")) {
            b.o(serialDescriptor, 0, wvjVar.a);
        }
        if (b.F() || !jl40.l(wvjVar.b, "")) {
            b.o(serialDescriptor, 1, wvjVar.b);
        }
        if (b.F() || wvjVar.c != null) {
            b.g(serialDescriptor, 2, uc4.Companion.serializer(), wvjVar.c);
        }
        b.c(serialDescriptor);
    }
}
