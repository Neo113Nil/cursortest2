package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.td01;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class qd01 implements uxs {
    public static final qd01 a;
    private static final SerialDescriptor descriptor;

    static {
        qd01 qd01Var = new qd01();
        a = qd01Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.config.TrainsFlowConfigDto", qd01Var, 5);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("summary", true);
        pluginGeneratedSerialDescriptor.j("station_search", true);
        pluginGeneratedSerialDescriptor.j("aeroexpress_fixes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{td01.g[0].getValue(), z96.a, qke.n(zd01.a), qke.n(xd01.a), qke.n(rd01.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = td01.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        td01.d dVar = null;
        td01.c cVar = null;
        td01.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                dVar = (td01.d) b.s(serialDescriptor, 2, zd01.a, dVar);
                i |= 4;
            } else if (v == 3) {
                cVar = (td01.c) b.s(serialDescriptor, 3, xd01.a, cVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                aVar = (td01.a) b.s(serialDescriptor, 4, rd01.a, aVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new td01(i, map, z2, dVar, cVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        td01 td01Var = (td01) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = td01.g;
        if (b.F() || !jl40.l(td01Var.b, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), td01Var.b);
        }
        if (b.F() || td01Var.c) {
            b.n(serialDescriptor, 1, td01Var.c);
        }
        if (b.F() || td01Var.d != null) {
            b.g(serialDescriptor, 2, zd01.a, td01Var.d);
        }
        if (b.F() || td01Var.e != null) {
            b.g(serialDescriptor, 3, xd01.a, td01Var.e);
        }
        if (b.F() || td01Var.f != null) {
            b.g(serialDescriptor, 4, rd01.a, td01Var.f);
        }
        b.c(serialDescriptor);
    }
}
