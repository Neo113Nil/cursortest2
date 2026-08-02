package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.wav0;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class sav0 implements uxs {
    public static final sav0 a;
    private static final SerialDescriptor descriptor;

    static {
        sav0 sav0Var = new sav0();
        a = sav0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.SuggestedFavoritesExperiment", sav0Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("suggest_screen", true);
        pluginGeneratedSerialDescriptor.j("summary_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, wav0.f[1].getValue(), uav0.a, xav0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wav0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        wav0.a aVar = null;
        wav0.b bVar = null;
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
                aVar = (wav0.a) b.A(serialDescriptor, 2, uav0.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bVar = (wav0.b) b.A(serialDescriptor, 3, xav0.a, bVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new wav0(i, z2, map, aVar, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wav0 wav0Var = (wav0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wav0.f;
        if (b.F() || wav0Var.b) {
            b.n(serialDescriptor, 0, wav0Var.b);
        }
        if (b.F() || !jl40.l(wav0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), wav0Var.c);
        }
        if (b.F() || !jl40.l(wav0Var.d, wav0.a.e)) {
            b.e(serialDescriptor, 2, uav0.a, wav0Var.d);
        }
        if (b.F() || !jl40.l(wav0Var.e, wav0.b.b)) {
            b.e(serialDescriptor, 3, xav0.a, wav0Var.e);
        }
        b.c(serialDescriptor);
    }
}
