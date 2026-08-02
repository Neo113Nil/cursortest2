package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.mez0;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.oez0;
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
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.ButtonItem", bVar, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_hidden", true);
        pluginGeneratedSerialDescriptor.j("timer_state_update", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(mez0.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{w7s.a, z96Var, z96Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        FormattedText formattedText = null;
        oez0 oez0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                oez0Var = (oez0) b.s(serialDescriptor, 3, mez0.a, oez0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.a(i, formattedText, z2, z3, oez0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.a aVar = (CheckoutResponse.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !nzs.t(0, aVar.a)) {
            b.e(serialDescriptor, 0, w7s.a, aVar.a);
        }
        if (b.F() || aVar.b) {
            b.n(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || aVar.c) {
            b.n(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, mez0.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
