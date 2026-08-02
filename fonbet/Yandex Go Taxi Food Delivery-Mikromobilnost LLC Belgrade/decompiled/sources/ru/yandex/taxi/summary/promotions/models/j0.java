package ru.yandex.taxi.summary.promotions.models;

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
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class j0 implements uxs {
    public static final j0 a;
    private static final SerialDescriptor descriptor;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.Offers", j0Var, 2);
        pluginGeneratedSerialDescriptor.j("promoblocks", true);
        pluginGeneratedSerialDescriptor.j("modal_windows", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n0.a, p0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SummaryPromotionsResponse.d dVar = null;
        SummaryPromotionsResponse.e eVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dVar = (SummaryPromotionsResponse.d) b.A(serialDescriptor, 0, n0.a, dVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                eVar = (SummaryPromotionsResponse.e) b.A(serialDescriptor, 1, p0.a, eVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.b(i, dVar, eVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.b bVar = (SummaryPromotionsResponse.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        int i = 0;
        if (b.F() || !jl40.l(bVar.a, new SummaryPromotionsResponse.d(i))) {
            b.e(serialDescriptor, 0, n0.a, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, new SummaryPromotionsResponse.e(0))) {
            b.e(serialDescriptor, 1, p0.a, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
