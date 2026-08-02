package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final /* synthetic */ class xk00 implements uxs {
    public static final xk00 a;
    private static final SerialDescriptor descriptor;

    static {
        xk00 xk00Var = new xk00();
        a = xk00Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.map_common.map.experiment.MapKitGlobalExperimentsExperiment", xk00Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("modules", true);
        pluginGeneratedSerialDescriptor.j("experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zk00.e;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zk00.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new zk00(i, list, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zk00 zk00Var = (zk00) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zk00.e;
        if (b.F() || zk00Var.b) {
            b.n(serialDescriptor, 0, zk00Var.b);
        }
        if (b.F() || !jl40.l(zk00Var.c, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zk00Var.c);
        }
        if (b.F() || !jl40.l(zk00Var.d, b.f())) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), zk00Var.d);
        }
        b.c(serialDescriptor);
    }
}
