package ru.yandex.taxi.summary.promotions.models;

import defpackage.h6w;
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
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class w implements uxs {
    public static final w a;
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.Item.PromoblockShowPolicy", wVar, 3);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("max_widget_usage_count", true);
        pluginGeneratedSerialDescriptor.j("offer_availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.c.d;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.c.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        SummaryPromotionsResponse.OfferAvailability offerAvailability = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                offerAvailability = (SummaryPromotionsResponse.OfferAvailability) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), offerAvailability);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.a.c(i, i2, i3, offerAvailability);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.a.c cVar = (SummaryPromotionsResponse.a.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.c.d;
        if (b.F() || cVar.a != Integer.MAX_VALUE) {
            b.A(0, cVar.a, serialDescriptor);
        }
        if (b.F() || cVar.b != Integer.MAX_VALUE) {
            b.A(1, cVar.b, serialDescriptor);
        }
        if (b.F() || cVar.c != SummaryPromotionsResponse.OfferAvailability.ORIGINAL) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), cVar.c);
        }
        b.c(serialDescriptor);
    }
}
