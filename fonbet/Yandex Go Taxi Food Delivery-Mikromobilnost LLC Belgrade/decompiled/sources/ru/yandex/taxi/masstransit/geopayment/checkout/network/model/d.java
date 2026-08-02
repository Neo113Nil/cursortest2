package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.auu0;
import defpackage.i3y;
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
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.CheckoutPaymentMethods", dVar, 3);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("cards_description", true);
        pluginGeneratedSerialDescriptor.j("no_cards_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{CheckoutResponse.CheckoutPaymentMethods.d[0].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.CheckoutPaymentMethods.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        CheckoutResponse.CheckoutPaymentMethods.Source source = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                source = (CheckoutResponse.CheckoutPaymentMethods.Source) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), source);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.CheckoutPaymentMethods(i, source, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods = (CheckoutResponse.CheckoutPaymentMethods) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.CheckoutPaymentMethods.d;
        if (b.F() || checkoutPaymentMethods.a != CheckoutResponse.CheckoutPaymentMethods.Source.DEFAULT) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), checkoutPaymentMethods.a);
        }
        if (b.F() || checkoutPaymentMethods.b != null) {
            b.g(serialDescriptor, 1, auu0.a, checkoutPaymentMethods.b);
        }
        if (b.F() || checkoutPaymentMethods.c != null) {
            b.g(serialDescriptor, 2, auu0.a, checkoutPaymentMethods.c);
        }
        b.c(serialDescriptor);
    }
}
