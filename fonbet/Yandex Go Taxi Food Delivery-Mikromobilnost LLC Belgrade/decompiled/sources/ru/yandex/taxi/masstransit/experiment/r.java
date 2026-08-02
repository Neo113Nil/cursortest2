package ru.yandex.taxi.masstransit.experiment;

import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class r implements uxs {
    public static final r a;
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.SummaryMapSettings", rVar, 2);
        pluginGeneratedSerialDescriptor.j("show_ya_on_summary", true);
        pluginGeneratedSerialDescriptor.j("live_tags_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, o.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        TransportOnSummaryExperiment.LiveTagsSettings liveTagsSettings = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                liveTagsSettings = (TransportOnSummaryExperiment.LiveTagsSettings) b.A(serialDescriptor, 1, o.a, liveTagsSettings);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment.d(i, z2, liveTagsSettings);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.LiveTagsSettings(0)) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment.d dVar = (TransportOnSummaryExperiment.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || dVar.a) {
            b.n(serialDescriptor, 0, dVar.a);
        }
        if (!b.F()) {
            TransportOnSummaryExperiment.LiveTagsSettings liveTagsSettings = dVar.b;
            TransportOnSummaryExperiment.LiveTagsSettings.Companion.getClass();
        }
        b.e(serialDescriptor, 1, o.a, dVar.b);
        b.c(serialDescriptor);
    }
}
