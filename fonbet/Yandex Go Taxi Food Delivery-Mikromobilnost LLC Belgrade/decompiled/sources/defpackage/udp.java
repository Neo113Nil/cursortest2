package defpackage;

import defpackage.tdp;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class udp implements uxs {
    public static final udp a;
    private static final SerialDescriptor descriptor;

    static {
        udp udpVar = new udp();
        a = udpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.address.api.experiment.FavoriteAddressNewUiExperiment.NearbyModal", udpVar, 4);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("button_new_tk", true);
        pluginGeneratedSerialDescriptor.j("button_update_tk", true);
        pluginGeneratedSerialDescriptor.j("notification_after_update", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, wdp.a};
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
        tdp.c cVar = null;
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
                cVar = (tdp.c) b.A(serialDescriptor, 3, wdp.a, cVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new tdp.b(i, str, str2, str3, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (defpackage.jl40.l(r0, tdp.c.d) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        tdp.b bVar = (tdp.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, "")) {
            b.o(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, "")) {
            b.o(serialDescriptor, 2, bVar.c);
        }
        if (!b.F()) {
            tdp.c cVar = bVar.d;
            tdp.c.Companion.getClass();
        }
        b.e(serialDescriptor, 3, wdp.a, bVar.d);
        b.c(serialDescriptor);
    }
}
