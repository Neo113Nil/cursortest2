package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class r1t implements uxs {
    public static final r1t a;
    private static final SerialDescriptor descriptor;

    static {
        r1t r1tVar = new r1t();
        a = r1tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.GeoState", r1tVar, 3);
        pluginGeneratedSerialDescriptor.j("accuracy", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(nor.a), qke.n(auu0.a), qke.n(b0t.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        String str = null;
        zzs zzsVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                zzsVar = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new t1t(i, f, str, zzsVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1t t1tVar = (t1t) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, nor.a, t1tVar.a);
        b.g(serialDescriptor, 1, auu0.a, t1tVar.b);
        b.g(serialDescriptor, 2, b0t.a, t1tVar.c);
        b.c(serialDescriptor);
    }
}
