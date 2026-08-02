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

/* loaded from: classes6.dex */
public final /* synthetic */ class ssr0 implements uxs {
    public static final ssr0 a;
    private static final SerialDescriptor descriptor;

    static {
        ssr0 ssr0Var = new ssr0();
        a = ssr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.SharingRouteNotificationExperiment", ssr0Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("show_time_in_seconds", true);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("origin_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = usr0.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), qke.n(h6w.a), auu0Var, auu0Var, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = usr0.h;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new usr0(i, z2, map, num, str, str2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        usr0 usr0Var = (usr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = usr0.h;
        if (b.F() || usr0Var.b) {
            b.n(serialDescriptor, 0, usr0Var.b);
        }
        if (b.F() || !jl40.l(usr0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), usr0Var.c);
        }
        if (b.F() || usr0Var.d != null) {
            b.g(serialDescriptor, 2, h6w.a, usr0Var.d);
        }
        if (b.F() || !jl40.l(usr0Var.e, "")) {
            b.o(serialDescriptor, 3, usr0Var.e);
        }
        if (b.F() || !jl40.l(usr0Var.f, "")) {
            b.o(serialDescriptor, 4, usr0Var.f);
        }
        if (b.F() || !jl40.l(usr0Var.g, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), usr0Var.g);
        }
        b.c(serialDescriptor);
    }
}
