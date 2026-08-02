package ru.yandex.taxi.masstransit.promo.models;

import defpackage.c540;
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
public final /* synthetic */ class o implements uxs {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse", oVar, 1);
        pluginGeneratedSerialDescriptor.j("offers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        MtSummaryCommunicationsResponse.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                bVar = (MtSummaryCommunicationsResponse.b) b.A(serialDescriptor, 0, u.a, bVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsResponse(i, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsResponse mtSummaryCommunicationsResponse = (MtSummaryCommunicationsResponse) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        c540 c540Var = MtSummaryCommunicationsResponse.Companion;
        if (b.F() || !jl40.l(mtSummaryCommunicationsResponse.a, new MtSummaryCommunicationsResponse.b(0))) {
            b.e(serialDescriptor, 0, u.a, mtSummaryCommunicationsResponse.a);
        }
        b.c(serialDescriptor);
    }
}
