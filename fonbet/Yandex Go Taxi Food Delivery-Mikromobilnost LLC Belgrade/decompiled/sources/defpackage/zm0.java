package defpackage;

import defpackage.cn0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class zm0 implements uxs {
    public static final zm0 a;
    private static final SerialDescriptor descriptor;

    static {
        zm0 zm0Var = new zm0();
        a = zm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.AdditionalPointInfoDto", zm0Var, 3);
        pluginGeneratedSerialDescriptor.j("userplace_suggestion", true);
        pluginGeneratedSerialDescriptor.j("clarify_suggestion", true);
        pluginGeneratedSerialDescriptor.j("additional_data_correction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(kn0.a), qke.n(dn0.a), qke.n(an0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        cn0.e eVar = null;
        cn0.b bVar = null;
        cn0.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                eVar = (cn0.e) b.s(serialDescriptor, 0, kn0.a, eVar);
                i |= 1;
            } else if (v == 1) {
                bVar = (cn0.b) b.s(serialDescriptor, 1, dn0.a, bVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                aVar = (cn0.a) b.s(serialDescriptor, 2, an0.a, aVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new cn0(i, eVar, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cn0 cn0Var = (cn0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cn0Var.a != null) {
            b.g(serialDescriptor, 0, kn0.a, cn0Var.a);
        }
        if (b.F() || cn0Var.b != null) {
            b.g(serialDescriptor, 1, dn0.a, cn0Var.b);
        }
        if (b.F() || cn0Var.c != null) {
            b.g(serialDescriptor, 2, an0.a, cn0Var.c);
        }
        b.c(serialDescriptor);
    }
}
