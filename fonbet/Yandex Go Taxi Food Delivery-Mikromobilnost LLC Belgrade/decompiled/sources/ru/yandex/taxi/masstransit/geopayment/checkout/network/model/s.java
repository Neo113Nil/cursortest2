package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.jl40;
import defpackage.ny61;
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
public final /* synthetic */ class s implements uxs {
    public static final s a;
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.StopsSelector.StopSelectorItems", sVar, 3);
        pluginGeneratedSerialDescriptor.j("starting_item", true);
        pluginGeneratedSerialDescriptor.j("destination_item", true);
        pluginGeneratedSerialDescriptor.j("selector_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        v vVar = v.a;
        return new KSerializer[]{vVar, qke.n(vVar), w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        CheckoutResponse.StopsSelector.c cVar = null;
        CheckoutResponse.StopsSelector.c cVar2 = null;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (CheckoutResponse.StopsSelector.c) b.A(serialDescriptor, 0, v.a, cVar);
                i |= 1;
            } else if (v == 1) {
                cVar2 = (CheckoutResponse.StopsSelector.c) b.s(serialDescriptor, 1, v.a, cVar2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.StopsSelector.b(i, cVar, cVar2, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.StopsSelector.b bVar = (CheckoutResponse.StopsSelector.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, new CheckoutResponse.StopsSelector.c(0))) {
            b.e(serialDescriptor, 0, v.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, v.a, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, bVar.c);
        }
        b.c(serialDescriptor);
    }
}
