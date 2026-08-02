package ru.yandex.taxi.routestats.prefetch;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment", aVar, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("prefetch_route_stats_mode", true);
        pluginGeneratedSerialDescriptor.j("prefetch_suggest_amount", true);
        pluginGeneratedSerialDescriptor.j("include_cache_for_prefetch", true);
        pluginGeneratedSerialDescriptor.j("params_timeout_millis", true);
        pluginGeneratedSerialDescriptor.j("log_diffs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = RouteStatsPrefetchExperiment.h;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), h6w.a, z96Var, pnz.a, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteStatsPrefetchExperiment.h;
        b.getClass();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        RouteStatsPrefetchExperiment.PrefetchMode prefetchMode = null;
        long j = 0;
        boolean z4 = true;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                    break;
                case 0:
                    z = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    prefetchMode = (RouteStatsPrefetchExperiment.PrefetchMode) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), prefetchMode);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j = b.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new RouteStatsPrefetchExperiment(i, z, prefetchMode, i2, z2, j, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        RouteStatsPrefetchExperiment routeStatsPrefetchExperiment = (RouteStatsPrefetchExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteStatsPrefetchExperiment.h;
        if (b.F() || routeStatsPrefetchExperiment.b) {
            b.n(serialDescriptor, 0, routeStatsPrefetchExperiment.b);
        }
        if (b.F() || routeStatsPrefetchExperiment.c != RouteStatsPrefetchExperiment.PrefetchMode.DISABLED) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), routeStatsPrefetchExperiment.c);
        }
        if (b.F() || routeStatsPrefetchExperiment.d != 0) {
            b.A(2, routeStatsPrefetchExperiment.d, serialDescriptor);
        }
        if (b.F() || routeStatsPrefetchExperiment.e) {
            b.n(serialDescriptor, 3, routeStatsPrefetchExperiment.e);
        }
        if (b.F() || routeStatsPrefetchExperiment.f != 1000) {
            b.s(serialDescriptor, 4, routeStatsPrefetchExperiment.f);
        }
        if (b.F() || routeStatsPrefetchExperiment.g) {
            b.n(serialDescriptor, 5, routeStatsPrefetchExperiment.g);
        }
        b.c(serialDescriptor);
    }
}
