package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.auu0;
import defpackage.cm2;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
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
public final /* synthetic */ class x implements uxs {
    public static final x a;
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.TransportItem", xVar, 4);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("card_item", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("meta_checkout_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(y.a), CheckoutResponse.TransportItem.e[2].getValue(), qke.n(cm2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.TransportItem.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        CheckoutResponse.TransportItem.a aVar = null;
        CheckoutResponse.TransportItem.TransportType transportType = null;
        Object obj = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (CheckoutResponse.TransportItem.a) b.s(serialDescriptor, 1, y.a, aVar);
                i |= 2;
            } else if (v == 2) {
                transportType = (CheckoutResponse.TransportItem.TransportType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), transportType);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                obj = b.s(serialDescriptor, 3, cm2.a, obj);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.TransportItem(i, str, aVar, transportType, obj);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.TransportItem transportItem = (CheckoutResponse.TransportItem) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.TransportItem.e;
        if (b.F() || !jl40.l(transportItem.a, "")) {
            b.o(serialDescriptor, 0, transportItem.a);
        }
        if (b.F() || transportItem.b != null) {
            b.g(serialDescriptor, 1, y.a, transportItem.b);
        }
        if (b.F() || transportItem.c != CheckoutResponse.TransportItem.TransportType.BUS) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), transportItem.c);
        }
        if (b.F() || transportItem.d != null) {
            b.g(serialDescriptor, 3, cm2.a, transportItem.d);
        }
        b.c(serialDescriptor);
    }
}
