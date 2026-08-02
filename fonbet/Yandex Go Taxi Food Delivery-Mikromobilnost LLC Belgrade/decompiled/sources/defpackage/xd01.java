package defpackage;

import defpackage.td01;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class xd01 implements uxs {
    public static final xd01 a;
    private static final SerialDescriptor descriptor;

    static {
        xd01 xd01Var = new xd01();
        a = xd01Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.config.TrainsFlowConfigDto.StationSearch", xd01Var, 3);
        pluginGeneratedSerialDescriptor.j("to_station", true);
        pluginGeneratedSerialDescriptor.j("from_station", true);
        pluginGeneratedSerialDescriptor.j("empty_suggests_message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        vd01 vd01Var = vd01.a;
        return new KSerializer[]{qke.n(vd01Var), qke.n(vd01Var), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        td01.b bVar = null;
        td01.b bVar2 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (td01.b) b.s(serialDescriptor, 0, vd01.a, bVar);
                i |= 1;
            } else if (v == 1) {
                bVar2 = (td01.b) b.s(serialDescriptor, 1, vd01.a, bVar2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new td01.c(i, bVar, bVar2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        td01.c cVar = (td01.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cVar.a != null) {
            b.g(serialDescriptor, 0, vd01.a, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, vd01.a, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cVar.c);
        }
        b.c(serialDescriptor);
    }
}
