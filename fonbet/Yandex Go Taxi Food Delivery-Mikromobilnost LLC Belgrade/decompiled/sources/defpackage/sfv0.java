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

/* loaded from: classes9.dex */
public final /* synthetic */ class sfv0 implements uxs {
    public static final sfv0 a;
    private static final SerialDescriptor descriptor;

    static {
        sfv0 sfv0Var = new sfv0();
        a = sfv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.focusbutton.SummaryFocusButtonAdditionalStatesExperiment", sfv0Var, 7);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("summary_focus_source_point_description_key", true);
        pluginGeneratedSerialDescriptor.j("summary_focus_destination_point_description_key", true);
        pluginGeneratedSerialDescriptor.j("focus_on_a_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("focus_on_b_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("supported_order_flows", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ufv0.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ufv0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ufv0(i, str, str2, str3, str4, list, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ufv0 ufv0Var = (ufv0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ufv0.i;
        if (b.F() || ufv0Var.b) {
            b.n(serialDescriptor, 0, ufv0Var.b);
        }
        if (b.F() || !jl40.l(ufv0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ufv0Var.c);
        }
        if (b.F() || !jl40.l(ufv0Var.d, "")) {
            b.o(serialDescriptor, 2, ufv0Var.d);
        }
        if (b.F() || !jl40.l(ufv0Var.e, "")) {
            b.o(serialDescriptor, 3, ufv0Var.e);
        }
        if (b.F() || !jl40.l(ufv0Var.f, "")) {
            b.o(serialDescriptor, 4, ufv0Var.f);
        }
        if (b.F() || !jl40.l(ufv0Var.g, "")) {
            b.o(serialDescriptor, 5, ufv0Var.g);
        }
        if (b.F() || !jl40.l(ufv0Var.h, EmptyList.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), ufv0Var.h);
        }
        b.c(serialDescriptor);
    }
}
