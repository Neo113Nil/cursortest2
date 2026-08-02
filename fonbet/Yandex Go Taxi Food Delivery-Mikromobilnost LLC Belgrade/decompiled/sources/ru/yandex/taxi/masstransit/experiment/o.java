package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class o implements uxs {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.LiveTagsSettings", oVar, 1);
        pluginGeneratedSerialDescriptor.j("route_sections_with_live_tags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) TransportOnSummaryExperiment.LiveTagsSettings.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.LiveTagsSettings.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType liveTagsFilterType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                liveTagsFilterType = (TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), liveTagsFilterType);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment.LiveTagsSettings(i, liveTagsFilterType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment.LiveTagsSettings liveTagsSettings = (TransportOnSummaryExperiment.LiveTagsSettings) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.LiveTagsSettings.b;
        if (b.F() || liveTagsSettings.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), liveTagsSettings.a);
        }
        b.c(serialDescriptor);
    }
}
