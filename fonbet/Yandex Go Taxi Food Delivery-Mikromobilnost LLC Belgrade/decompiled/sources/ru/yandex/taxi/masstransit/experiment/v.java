package ru.yandex.taxi.masstransit.experiment;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class v implements uxs {
    public static final v a;
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment.ViewOnMapScreen", vVar, 1);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TransportOnSummaryExperiment.f.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.f.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        ArrayList arrayList = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                arrayList = (ArrayList) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), arrayList);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TransportOnSummaryExperiment.f(i, arrayList);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TransportOnSummaryExperiment.f fVar = (TransportOnSummaryExperiment.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransportOnSummaryExperiment.f.b;
        if (b.F() || !jl40.l(fVar.a, new ArrayList())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), fVar.a);
        }
        b.c(serialDescriptor);
    }
}
