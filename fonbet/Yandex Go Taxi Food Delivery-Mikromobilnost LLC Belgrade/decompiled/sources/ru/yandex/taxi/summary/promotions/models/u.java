package ru.yandex.taxi.summary.promotions.models;

import defpackage.h6w;
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
public final /* synthetic */ class u implements uxs {
    public static final u a;
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.Item.Options", uVar, 1);
        pluginGeneratedSerialDescriptor.j("priority", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 0);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.a.b(i, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.a.b bVar = (SummaryPromotionsResponse.a.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != 0) {
            b.A(0, bVar.a, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
