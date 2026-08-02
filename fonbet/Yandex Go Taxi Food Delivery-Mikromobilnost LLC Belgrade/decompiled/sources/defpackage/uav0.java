package defpackage;

import defpackage.wav0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class uav0 implements uxs {
    public static final uav0 a;
    private static final SerialDescriptor descriptor;

    static {
        uav0 uav0Var = new uav0();
        a = uav0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.SuggestedFavoritesExperiment.SuggestScreen", uav0Var, 4);
        pluginGeneratedSerialDescriptor.j("section_title_tk", true);
        pluginGeneratedSerialDescriptor.j("discard_button_tk", true);
        pluginGeneratedSerialDescriptor.j("save_button_tk", true);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
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
        Integer num = null;
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
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new wav0.a(i, num, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wav0.a aVar = (wav0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
