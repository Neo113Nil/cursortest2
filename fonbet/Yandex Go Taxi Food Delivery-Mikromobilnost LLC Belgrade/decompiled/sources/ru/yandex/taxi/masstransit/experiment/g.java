package ru.yandex.taxi.masstransit.experiment;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class g implements uxs {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment", gVar, 17);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("transfer_stop_sections_enabled", true);
        pluginGeneratedSerialDescriptor.j("text_overrides", true);
        pluginGeneratedSerialDescriptor.j("transport_tracking_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("view_on_map_style", true);
        pluginGeneratedSerialDescriptor.j("transport_overrides", true);
        pluginGeneratedSerialDescriptor.j("schedule_polling_delay", true);
        pluginGeneratedSerialDescriptor.j("detail_screen", true);
        pluginGeneratedSerialDescriptor.j("view_on_map_screen", true);
        pluginGeneratedSerialDescriptor.j("sharing_text_template_key", true);
        pluginGeneratedSerialDescriptor.j("intermediate_point_text_template_key", true);
        pluginGeneratedSerialDescriptor.j("walking_route_settings", true);
        pluginGeneratedSerialDescriptor.j("arriving_title_key", true);
        pluginGeneratedSerialDescriptor.j("diff_time_limit", true);
        pluginGeneratedSerialDescriptor.j("button_loading_delay", true);
        pluginGeneratedSerialDescriptor.j("summary_map_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TransportOnSummaryExperiment.s;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, i3yVarArr[3].getValue(), auu0Var, auu0Var, i3yVarArr[6].getValue(), qke.n(pnzVar), m.a, v.a, auu0Var, auu0Var, x.a, auu0Var, h6w.a, pnzVar, r.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.s;
        b.getClass();
        long j = 0;
        TransportOnSummaryExperiment.d dVar = null;
        TransportOnSummaryExperiment.g gVar = null;
        TransportOnSummaryExperiment.f fVar = null;
        TransportOnSummaryExperiment.c cVar = null;
        boolean z4 = true;
        Map map = null;
        Long l = null;
        int i = 0;
        boolean z5 = false;
        Map map2 = null;
        boolean z6 = false;
        Map map3 = null;
        String str = null;
        String str2 = null;
        int i2 = 1;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                case 0:
                    z3 = z4;
                    i |= 1;
                    i2 = i2;
                    z5 = b.C(serialDescriptor, 0);
                    z4 = z3;
                case 1:
                    z = z4;
                    z2 = z5;
                    map2 = (Map) b.A(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), map2);
                    i |= 2;
                    z4 = z;
                    z5 = z2;
                case 2:
                    z3 = z4;
                    z6 = b.C(serialDescriptor, 2);
                    i |= 4;
                    z4 = z3;
                case 3:
                    z = z4;
                    z2 = z5;
                    map3 = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map3);
                    i |= 8;
                    z4 = z;
                    z5 = z2;
                case 4:
                    z3 = z4;
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    z4 = z3;
                case 5:
                    z3 = z4;
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    z4 = z3;
                case 6:
                    z = z4;
                    z2 = z5;
                    map = (Map) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map);
                    i |= 64;
                    z4 = z;
                    z5 = z2;
                case 7:
                    z = z4;
                    z2 = z5;
                    l = (Long) b.s(serialDescriptor, 7, pnz.a, l);
                    i |= 128;
                    z4 = z;
                    z5 = z2;
                case 8:
                    z = z4;
                    z2 = z5;
                    cVar = (TransportOnSummaryExperiment.c) b.A(serialDescriptor, 8, m.a, cVar);
                    i |= 256;
                    z4 = z;
                    z5 = z2;
                case 9:
                    z = z4;
                    z2 = z5;
                    fVar = (TransportOnSummaryExperiment.f) b.A(serialDescriptor, 9, v.a, fVar);
                    i |= 512;
                    z4 = z;
                    z5 = z2;
                case 10:
                    z3 = z4;
                    str3 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    z4 = z3;
                case 11:
                    z3 = z4;
                    str4 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    z4 = z3;
                case 12:
                    z = z4;
                    z2 = z5;
                    gVar = (TransportOnSummaryExperiment.g) b.A(serialDescriptor, 12, x.a, gVar);
                    i |= 4096;
                    z4 = z;
                    z5 = z2;
                case 13:
                    z3 = z4;
                    str5 = b.k(serialDescriptor, 13);
                    i |= 8192;
                    z4 = z3;
                case 14:
                    z3 = z4;
                    i3 = b.h(serialDescriptor, 14);
                    i |= 16384;
                    z4 = z3;
                case 15:
                    z3 = z4;
                    j = b.f(serialDescriptor, 15);
                    i |= 32768;
                    z4 = z3;
                case 16:
                    z = z4;
                    z2 = z5;
                    dVar = (TransportOnSummaryExperiment.d) b.A(serialDescriptor, 16, r.a, dVar);
                    i |= 65536;
                    z4 = z;
                    z5 = z2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment(i, z5, map2, z6, map3, str, str2, map, l, cVar, fVar, str3, str4, gVar, str5, i3, j, dVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.c(0)) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.f(0)) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.g(0)) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b5, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.d(0)) == false) goto L103;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment transportOnSummaryExperiment = (TransportOnSummaryExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.s;
        if (b.F() || transportOnSummaryExperiment.b) {
            b.n(serialDescriptor, 0, transportOnSummaryExperiment.b);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), transportOnSummaryExperiment.c);
        }
        if (b.F() || transportOnSummaryExperiment.d) {
            b.n(serialDescriptor, 2, transportOnSummaryExperiment.d);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.e, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), transportOnSummaryExperiment.e);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.f, "")) {
            b.o(serialDescriptor, 4, transportOnSummaryExperiment.f);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.g, "")) {
            b.o(serialDescriptor, 5, transportOnSummaryExperiment.g);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.h, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), transportOnSummaryExperiment.h);
        }
        if (b.F() || transportOnSummaryExperiment.i != null) {
            b.g(serialDescriptor, 7, pnz.a, transportOnSummaryExperiment.i);
        }
        if (!b.F()) {
            TransportOnSummaryExperiment.c cVar = transportOnSummaryExperiment.j;
            TransportOnSummaryExperiment.c.Companion.getClass();
        }
        b.e(serialDescriptor, 8, m.a, transportOnSummaryExperiment.j);
        if (!b.F()) {
            TransportOnSummaryExperiment.f fVar = transportOnSummaryExperiment.k;
            TransportOnSummaryExperiment.f.Companion.getClass();
        }
        b.e(serialDescriptor, 9, v.a, transportOnSummaryExperiment.k);
        if (b.F() || !jl40.l(transportOnSummaryExperiment.l, "")) {
            b.o(serialDescriptor, 10, transportOnSummaryExperiment.l);
        }
        if (b.F() || !jl40.l(transportOnSummaryExperiment.m, "")) {
            b.o(serialDescriptor, 11, transportOnSummaryExperiment.m);
        }
        if (!b.F()) {
            TransportOnSummaryExperiment.g gVar = transportOnSummaryExperiment.n;
            TransportOnSummaryExperiment.g.Companion.getClass();
        }
        b.e(serialDescriptor, 12, x.a, transportOnSummaryExperiment.n);
        if (b.F() || !jl40.l(transportOnSummaryExperiment.o, "")) {
            b.o(serialDescriptor, 13, transportOnSummaryExperiment.o);
        }
        if (b.F() || transportOnSummaryExperiment.p != 0) {
            b.A(14, transportOnSummaryExperiment.p, serialDescriptor);
        }
        if (b.F() || transportOnSummaryExperiment.q != 2000) {
            b.s(serialDescriptor, 15, transportOnSummaryExperiment.q);
        }
        if (!b.F()) {
            TransportOnSummaryExperiment.d dVar = transportOnSummaryExperiment.r;
            TransportOnSummaryExperiment.d.Companion.getClass();
        }
        b.e(serialDescriptor, 16, r.a, transportOnSummaryExperiment.r);
        b.c(serialDescriptor);
    }
}
