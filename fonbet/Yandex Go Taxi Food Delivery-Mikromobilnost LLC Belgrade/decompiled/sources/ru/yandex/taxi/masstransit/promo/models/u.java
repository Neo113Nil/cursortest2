package ru.yandex.taxi.masstransit.promo.models;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class u implements uxs {
    public static final u a;
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse.Offers", uVar, 2);
        pluginGeneratedSerialDescriptor.j("promoblocks", true);
        pluginGeneratedSerialDescriptor.j("objects_over_map", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y.a, w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        MtSummaryCommunicationsResponse.c cVar = null;
        MtSummaryCommunicationsResponse.b.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (MtSummaryCommunicationsResponse.c) b.A(serialDescriptor, 0, y.a, cVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (MtSummaryCommunicationsResponse.b.a) b.A(serialDescriptor, 1, w.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsResponse.b(i, cVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsResponse.b bVar = (MtSummaryCommunicationsResponse.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, new MtSummaryCommunicationsResponse.c(0))) {
            b.e(serialDescriptor, 0, y.a, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, new MtSummaryCommunicationsResponse.b.a(0))) {
            b.e(serialDescriptor, 1, w.a, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
