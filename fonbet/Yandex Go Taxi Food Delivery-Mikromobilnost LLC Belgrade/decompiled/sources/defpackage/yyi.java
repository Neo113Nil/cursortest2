package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class yyi implements uxs {
    public static final yyi a;
    private static final SerialDescriptor descriptor;

    static {
        yyi yyiVar = new yyi();
        a = yyiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.map.experiment.DestinationArrivalTimePinExperiment", yyiVar, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("arrival_time_title_key", true);
        pluginGeneratedSerialDescriptor.j("arrival_time_description_key", true);
        pluginGeneratedSerialDescriptor.j("buffer_time_minutes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = azi.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), auu0Var, auu0Var, h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = azi.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        Map map = null;
        String str = null;
        String str2 = null;
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
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new azi(i, z2, map, str, str2, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        azi aziVar = (azi) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = azi.g;
        if (b.F() || aziVar.b) {
            b.n(serialDescriptor, 0, aziVar.b);
        }
        if (b.F() || !jl40.l(aziVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aziVar.c);
        }
        if (b.F() || !jl40.l(aziVar.d, "")) {
            b.o(serialDescriptor, 2, aziVar.d);
        }
        if (b.F() || !jl40.l(aziVar.e, "")) {
            b.o(serialDescriptor, 3, aziVar.e);
        }
        if (b.F() || aziVar.f != 0) {
            b.A(4, aziVar.f, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
