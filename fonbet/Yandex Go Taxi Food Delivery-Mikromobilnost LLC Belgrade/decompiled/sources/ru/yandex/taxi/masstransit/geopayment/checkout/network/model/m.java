package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.ny61;
import defpackage.nzs;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class m implements uxs {
    public static final m a;
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.PriceItem", mVar, 3);
        pluginGeneratedSerialDescriptor.j("lead_title", true);
        pluginGeneratedSerialDescriptor.j("trail_title", true);
        pluginGeneratedSerialDescriptor.j("discount_trail_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                formattedText3 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.d(i, formattedText, formattedText2, formattedText3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.d dVar = (CheckoutResponse.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !nzs.t(0, dVar.a)) {
            b.e(serialDescriptor, 0, w7s.a, dVar.a);
        }
        if (b.F() || !nzs.t(0, dVar.b)) {
            b.e(serialDescriptor, 1, w7s.a, dVar.b);
        }
        if (b.F() || dVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, dVar.c);
        }
        b.c(serialDescriptor);
    }
}
