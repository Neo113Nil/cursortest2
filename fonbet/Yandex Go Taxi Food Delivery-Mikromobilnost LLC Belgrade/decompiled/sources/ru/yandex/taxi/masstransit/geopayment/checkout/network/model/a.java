package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.auu0;
import defpackage.cm2;
import defpackage.ilj;
import defpackage.jl40;
import defpackage.klj;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse", aVar, 15);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("starting_stop_id", true);
        pluginGeneratedSerialDescriptor.j("destination_stop_id", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("direction_selector", true);
        pluginGeneratedSerialDescriptor.j("direction_id", true);
        pluginGeneratedSerialDescriptor.j("stops_selector", true);
        pluginGeneratedSerialDescriptor.j("transport_item", true);
        pluginGeneratedSerialDescriptor.j("counter_item", true);
        pluginGeneratedSerialDescriptor.j("price_item", true);
        pluginGeneratedSerialDescriptor.j("button_item", true);
        pluginGeneratedSerialDescriptor.j("user_agreement", true);
        pluginGeneratedSerialDescriptor.j("meta_payment_info", true);
        pluginGeneratedSerialDescriptor.j("payment_methods", true);
        pluginGeneratedSerialDescriptor.j("footer_is_hidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(k.a), ilj.a, qke.n(auu0Var), qke.n(o.a), x.a, g.a, qke.n(m.a), b.a, qke.n(w7s.a), qke.n(cm2.a), qke.n(d.a), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        FormattedText formattedText;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        FormattedText formattedText2 = null;
        CheckoutResponse.a aVar = null;
        CheckoutResponse.d dVar = null;
        Object obj = null;
        CheckoutResponse.b bVar = null;
        int i = 0;
        CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods = null;
        String str4 = null;
        String str5 = null;
        CheckoutResponse.c cVar = null;
        klj kljVar = null;
        String str6 = null;
        CheckoutResponse.StopsSelector stopsSelector = null;
        CheckoutResponse.TransportItem transportItem = null;
        boolean z = true;
        String str7 = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str5;
                    z = false;
                    str4 = str4;
                    str5 = str;
                case 0:
                    formattedText = formattedText2;
                    str2 = str5;
                    str7 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str4 = str4;
                    str5 = str2;
                    formattedText2 = formattedText;
                case 1:
                    formattedText = formattedText2;
                    str2 = str5;
                    str4 = (String) b.s(serialDescriptor, 1, auu0.a, str4);
                    i |= 2;
                    str5 = str2;
                    formattedText2 = formattedText;
                case 2:
                    formattedText = formattedText2;
                    str5 = (String) b.s(serialDescriptor, 2, auu0.a, str5);
                    i |= 4;
                    str4 = str4;
                    formattedText2 = formattedText;
                case 3:
                    str3 = str4;
                    str = str5;
                    cVar = (CheckoutResponse.c) b.s(serialDescriptor, 3, k.a, cVar);
                    i |= 8;
                    str4 = str3;
                    str5 = str;
                case 4:
                    str3 = str4;
                    str = str5;
                    kljVar = (klj) b.A(serialDescriptor, 4, ilj.a, kljVar);
                    i |= 16;
                    str4 = str3;
                    str5 = str;
                case 5:
                    str3 = str4;
                    str = str5;
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    str4 = str3;
                    str5 = str;
                case 6:
                    str3 = str4;
                    str = str5;
                    stopsSelector = (CheckoutResponse.StopsSelector) b.s(serialDescriptor, 6, o.a, stopsSelector);
                    i |= 64;
                    str4 = str3;
                    str5 = str;
                case 7:
                    str3 = str4;
                    str = str5;
                    transportItem = (CheckoutResponse.TransportItem) b.A(serialDescriptor, 7, x.a, transportItem);
                    i |= 128;
                    str4 = str3;
                    str5 = str;
                case 8:
                    str3 = str4;
                    str = str5;
                    bVar = (CheckoutResponse.b) b.A(serialDescriptor, 8, g.a, bVar);
                    i |= 256;
                    str4 = str3;
                    str5 = str;
                case 9:
                    str3 = str4;
                    str = str5;
                    dVar = (CheckoutResponse.d) b.s(serialDescriptor, 9, m.a, dVar);
                    i |= 512;
                    str4 = str3;
                    str5 = str;
                case 10:
                    str3 = str4;
                    str = str5;
                    aVar = (CheckoutResponse.a) b.A(serialDescriptor, 10, b.a, aVar);
                    i |= 1024;
                    str4 = str3;
                    str5 = str;
                case 11:
                    str3 = str4;
                    str = str5;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 11, w7s.a, formattedText2);
                    i |= 2048;
                    str4 = str3;
                    str5 = str;
                case 12:
                    str3 = str4;
                    str = str5;
                    obj = b.s(serialDescriptor, 12, cm2.a, obj);
                    i |= 4096;
                    str4 = str3;
                    str5 = str;
                case 13:
                    str3 = str4;
                    str = str5;
                    checkoutPaymentMethods = (CheckoutResponse.CheckoutPaymentMethods) b.s(serialDescriptor, 13, d.a, checkoutPaymentMethods);
                    i |= 8192;
                    str4 = str3;
                    str5 = str;
                case 14:
                    z2 = b.C(serialDescriptor, 14);
                    i |= 16384;
                    str4 = str4;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str8 = str5;
        b.c(serialDescriptor);
        return new CheckoutResponse(i, str7, str4, str8, cVar, kljVar, str6, stopsSelector, transportItem, bVar, dVar, aVar, formattedText2, obj, checkoutPaymentMethods, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.klj.d) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse checkoutResponse = (CheckoutResponse) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(checkoutResponse.a, "")) {
            b.o(serialDescriptor, 0, checkoutResponse.a);
        }
        if (b.F() || checkoutResponse.b != null) {
            b.g(serialDescriptor, 1, auu0.a, checkoutResponse.b);
        }
        if (b.F() || checkoutResponse.c != null) {
            b.g(serialDescriptor, 2, auu0.a, checkoutResponse.c);
        }
        if (b.F() || checkoutResponse.d != null) {
            b.g(serialDescriptor, 3, k.a, checkoutResponse.d);
        }
        if (!b.F()) {
            klj kljVar = checkoutResponse.e;
            klj.Companion.getClass();
        }
        b.e(serialDescriptor, 4, ilj.a, checkoutResponse.e);
        if (b.F() || checkoutResponse.f != null) {
            b.g(serialDescriptor, 5, auu0.a, checkoutResponse.f);
        }
        if (b.F() || checkoutResponse.g != null) {
            b.g(serialDescriptor, 6, o.a, checkoutResponse.g);
        }
        if (b.F() || !jl40.l(checkoutResponse.h, new CheckoutResponse.TransportItem(0))) {
            b.e(serialDescriptor, 7, x.a, checkoutResponse.h);
        }
        if (b.F() || !jl40.l(checkoutResponse.i, new CheckoutResponse.b(0))) {
            b.e(serialDescriptor, 8, g.a, checkoutResponse.i);
        }
        if (b.F() || checkoutResponse.j != null) {
            b.g(serialDescriptor, 9, m.a, checkoutResponse.j);
        }
        if (b.F() || !jl40.l(checkoutResponse.k, new CheckoutResponse.a(0))) {
            b.e(serialDescriptor, 10, b.a, checkoutResponse.k);
        }
        if (b.F() || checkoutResponse.l != null) {
            b.g(serialDescriptor, 11, w7s.a, checkoutResponse.l);
        }
        if (b.F() || checkoutResponse.m != null) {
            b.g(serialDescriptor, 12, cm2.a, checkoutResponse.m);
        }
        if (b.F() || checkoutResponse.n != null) {
            b.g(serialDescriptor, 13, d.a, checkoutResponse.n);
        }
        if (b.F() || checkoutResponse.o) {
            b.n(serialDescriptor, 14, checkoutResponse.o);
        }
        b.c(serialDescriptor);
    }
}
