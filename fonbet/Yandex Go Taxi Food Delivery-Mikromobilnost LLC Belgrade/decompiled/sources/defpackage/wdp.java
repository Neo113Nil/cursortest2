package defpackage;

import defpackage.tdp;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class wdp implements uxs {
    public static final wdp a;
    private static final SerialDescriptor descriptor;

    static {
        wdp wdpVar = new wdp();
        a = wdpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.address.api.experiment.FavoriteAddressNewUiExperiment.Notification", wdpVar, 3);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("error_title_tk", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var};
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
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new tdp.c(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tdp.c cVar = (tdp.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, "")) {
            b.o(serialDescriptor, 1, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, "")) {
            b.o(serialDescriptor, 2, cVar.c);
        }
        b.c(serialDescriptor);
    }
}
