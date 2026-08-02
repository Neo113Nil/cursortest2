package ru.yandex.taxi.masstransit.promo.models;

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
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class r implements uxs {
    public static final r a;
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse.Item.PromoblockShowPolicy", rVar, 3);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("max_widget_usage_count", true);
        pluginGeneratedSerialDescriptor.j("offer_availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.C0107a.d;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.C0107a.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        MtSummaryCommunicationsResponse.OfferAvailability offerAvailability = null;
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
                offerAvailability = (MtSummaryCommunicationsResponse.OfferAvailability) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), offerAvailability);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsResponse.a.C0107a(i, i2, i3, offerAvailability);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsResponse.a.C0107a c0107a = (MtSummaryCommunicationsResponse.a.C0107a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.C0107a.d;
        if (b.F() || c0107a.a != Integer.MAX_VALUE) {
            b.A(0, c0107a.a, serialDescriptor);
        }
        if (b.F() || c0107a.b != Integer.MAX_VALUE) {
            b.A(1, c0107a.b, serialDescriptor);
        }
        if (b.F() || c0107a.c != MtSummaryCommunicationsResponse.OfferAvailability.ORIGINAL) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), c0107a.c);
        }
        b.c(serialDescriptor);
    }
}
