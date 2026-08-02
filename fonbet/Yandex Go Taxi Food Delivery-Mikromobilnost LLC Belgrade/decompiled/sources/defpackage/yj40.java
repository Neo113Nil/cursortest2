package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.geopayment.network.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class yj40 implements uxs {
    public static final yj40 a;
    private static final SerialDescriptor descriptor;

    static {
        yj40 yj40Var = new yj40();
        a = yj40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesParam", yj40Var, 3);
        pluginGeneratedSerialDescriptor.j("ble", true);
        pluginGeneratedSerialDescriptor.j("zone_name", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g.d[0].getValue(), qke.n(auu0.a), qke.n(b0t.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = g.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        zzs zzsVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
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
        return new g(i, zzsVar, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = g.d;
        if (b.F() || !jl40.l(gVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), gVar.a);
        }
        if (b.F() || gVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, gVar.b);
        }
        if (b.F() || gVar.c != null) {
            b.g(serialDescriptor, 2, b0t.a, gVar.c);
        }
        b.c(serialDescriptor);
    }
}
