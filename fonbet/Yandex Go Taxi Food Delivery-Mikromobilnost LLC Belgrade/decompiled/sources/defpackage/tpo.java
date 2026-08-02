package defpackage;

import defpackage.xpo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class tpo implements uxs {
    public static final tpo a;
    private static final SerialDescriptor descriptor;

    static {
        tpo tpoVar = new tpo();
        a = tpoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.suggested.destinations.ExpectedDestinations", tpoVar, 3);
        pluginGeneratedSerialDescriptor.j("objects", true);
        pluginGeneratedSerialDescriptor.j("screen_options", true);
        pluginGeneratedSerialDescriptor.j("cache_expected_destinations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k0j.Companion.serializer(), qke.n(vpo.a), qke.n(v1k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        k0j k0jVar = null;
        xpo.a aVar = null;
        x1k x1kVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                k0jVar = (k0j) b.A(serialDescriptor, 0, k0j.Companion.serializer(), k0jVar);
                i |= 1;
            } else if (v == 1) {
                aVar = (xpo.a) b.s(serialDescriptor, 1, vpo.a, aVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                x1kVar = (x1k) b.s(serialDescriptor, 2, v1k.a, x1kVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xpo(i, k0jVar, aVar, x1kVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xpo xpoVar = (xpo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        upo upoVar = xpo.Companion;
        if (b.F() || !jl40.l(xpoVar.a, new k0j(0))) {
            b.e(serialDescriptor, 0, k0j.Companion.serializer(), xpoVar.a);
        }
        if (b.F() || xpoVar.b != null) {
            b.g(serialDescriptor, 1, vpo.a, xpoVar.b);
        }
        if (b.F() || xpoVar.c != null) {
            b.g(serialDescriptor, 2, v1k.a, xpoVar.c);
        }
        b.c(serialDescriptor);
    }
}
