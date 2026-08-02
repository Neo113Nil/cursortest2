package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.x;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class vlb0 implements uxs {
    public static final vlb0 a;
    private static final SerialDescriptor descriptor;

    static {
        vlb0 vlb0Var = new vlb0();
        a = vlb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PickScooterAction", vlb0Var, 4);
        pluginGeneratedSerialDescriptor.j("car_number", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, true);
        pluginGeneratedSerialDescriptor.j("onboarding_type", true);
        pluginGeneratedSerialDescriptor.j("destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(b0t.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
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
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new x(i, zzsVar, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x xVar = (x) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(xVar.a, "")) {
            b.o(serialDescriptor, 0, xVar.a);
        }
        if (b.F() || !jl40.l(xVar.b, "")) {
            b.o(serialDescriptor, 1, xVar.b);
        }
        if (b.F() || !jl40.l(xVar.c, "")) {
            b.o(serialDescriptor, 2, xVar.c);
        }
        if (b.F() || xVar.d != null) {
            b.g(serialDescriptor, 3, b0t.a, xVar.d);
        }
        b.c(serialDescriptor);
    }
}
