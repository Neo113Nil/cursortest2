package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class tzs implements uxs {
    public static final tzs a;
    private static final SerialDescriptor descriptor;

    static {
        tzs tzsVar = new tzs();
        a = tzsVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.GeoPoint", tzsVar, 5);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lon", false);
        pluginGeneratedSerialDescriptor.j("datum_id", true);
        pluginGeneratedSerialDescriptor.j("datum_type", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        KSerializer n = qke.n(e6mVar);
        KSerializer n2 = qke.n(e6mVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                i |= 1;
            } else if (v == 1) {
                d2 = (Double) b.s(serialDescriptor, 1, e6m.a, d2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new xzs(i, d, d2, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xzs xzsVar = (xzs) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        e6m e6mVar = e6m.a;
        Double d = xzsVar.a;
        String str = xzsVar.e;
        String str2 = xzsVar.d;
        String str3 = xzsVar.c;
        b.g(serialDescriptor, 0, e6mVar, d);
        b.g(serialDescriptor, 1, e6mVar, xzsVar.b);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 2, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 4, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
