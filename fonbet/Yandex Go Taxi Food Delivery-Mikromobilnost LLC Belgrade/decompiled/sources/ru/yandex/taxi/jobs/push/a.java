package ru.yandex.taxi.jobs.push;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.wkz0;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.jobs.push.ToggleJobsExperiment", aVar, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("pushack_job", true);
        pluginGeneratedSerialDescriptor.j("promotions_job", true);
        pluginGeneratedSerialDescriptor.j("prune_token", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        b bVar = b.a;
        return new KSerializer[]{z96.a, bVar, bVar, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ToggleJobsExperiment.a aVar = null;
        ToggleJobsExperiment.a aVar2 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (ToggleJobsExperiment.a) b.A(serialDescriptor, 1, b.a, aVar);
                i |= 2;
            } else if (v == 2) {
                aVar2 = (ToggleJobsExperiment.a) b.A(serialDescriptor, 2, b.a, aVar2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ToggleJobsExperiment(i, z2, aVar, aVar2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ToggleJobsExperiment toggleJobsExperiment = (ToggleJobsExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        wkz0 wkz0Var = ToggleJobsExperiment.Companion;
        if (b.F() || toggleJobsExperiment.b) {
            b.n(serialDescriptor, 0, toggleJobsExperiment.b);
        }
        if (b.F() || !jl40.l(toggleJobsExperiment.c, new ToggleJobsExperiment.a(0))) {
            b.e(serialDescriptor, 1, b.a, toggleJobsExperiment.c);
        }
        if (b.F() || !jl40.l(toggleJobsExperiment.d, new ToggleJobsExperiment.a(0))) {
            b.e(serialDescriptor, 2, b.a, toggleJobsExperiment.d);
        }
        if (b.F() || !jl40.l(toggleJobsExperiment.e, "")) {
            b.o(serialDescriptor, 3, toggleJobsExperiment.e);
        }
        b.c(serialDescriptor);
    }
}
