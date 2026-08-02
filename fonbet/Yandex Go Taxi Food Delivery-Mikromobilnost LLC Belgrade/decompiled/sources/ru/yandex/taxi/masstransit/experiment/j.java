package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements uxs {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.ButtonItem", jVar, 2);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TransportOnSummaryExperiment.b.c[0].getValue(), h.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.b.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ExperimentAction experimentAction = null;
        TransportOnSummaryExperiment.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                experimentAction = (ExperimentAction) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), experimentAction);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (TransportOnSummaryExperiment.a) b.A(serialDescriptor, 1, h.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment.b(i, experimentAction, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (defpackage.jl40.l(r0, new ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.a(0)) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment.b bVar = (TransportOnSummaryExperiment.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.b.c;
        if (b.F() || bVar.a != ExperimentAction.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), bVar.a);
        }
        if (!b.F()) {
            TransportOnSummaryExperiment.a aVar = bVar.b;
            TransportOnSummaryExperiment.a.Companion.getClass();
        }
        b.e(serialDescriptor, 1, h.a, bVar.b);
        b.c(serialDescriptor);
    }
}
