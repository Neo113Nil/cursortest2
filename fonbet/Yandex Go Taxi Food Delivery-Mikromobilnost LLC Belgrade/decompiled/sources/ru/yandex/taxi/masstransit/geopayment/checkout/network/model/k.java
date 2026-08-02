package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.e6m;
import defpackage.gef;
import defpackage.ief;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements uxs {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.Price", kVar, 3);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("discount_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, gef.a, qke.n(e6mVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        ief iefVar = null;
        Double d2 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                iefVar = (ief) b.A(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d2 = (Double) b.s(serialDescriptor, 2, e6m.a, d2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.c(i, d, iefVar, d2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.c cVar = (CheckoutResponse.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Double.compare(cVar.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, new ief(null, null, null, null))) {
            b.e(serialDescriptor, 1, gef.a, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, e6m.a, cVar.c);
        }
        b.c(serialDescriptor);
    }
}
