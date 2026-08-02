package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class r851 implements uxs {
    public static final r851 a;
    private static final SerialDescriptor descriptor;

    static {
        r851 r851Var = new r851();
        a = r851Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.orderbutton.summary.base.entities.network.WithoutDueOrderButtonExperiment", r851Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("button_data_by_tariff", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = u851.e;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = u851.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        Map map2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map2 = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new u851(i, z2, map, map2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u851 u851Var = (u851) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = u851.e;
        if (b.F() || u851Var.b) {
            b.n(serialDescriptor, 0, u851Var.b);
        }
        if (b.F() || !jl40.l(u851Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), u851Var.c);
        }
        if (b.F() || !jl40.l(u851Var.d, b.f())) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), u851Var.d);
        }
        b.c(serialDescriptor);
    }
}
