package ru.yandex.taxi.summary.promotions.models;

import defpackage.jl40;
import defpackage.knv0;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class o implements uxs {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse", oVar, 1);
        pluginGeneratedSerialDescriptor.j("offers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SummaryPromotionsResponse.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                bVar = (SummaryPromotionsResponse.b) b.A(serialDescriptor, 0, j0.a, bVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse(i, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse summaryPromotionsResponse = (SummaryPromotionsResponse) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        knv0 knv0Var = SummaryPromotionsResponse.Companion;
        int i = 0;
        if (b.F() || !jl40.l(summaryPromotionsResponse.a, new SummaryPromotionsResponse.b(i))) {
            b.e(serialDescriptor, 0, j0.a, summaryPromotionsResponse.a);
        }
        b.c(serialDescriptor);
    }
}
