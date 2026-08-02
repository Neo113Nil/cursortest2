package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
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
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class q implements uxs {
    public static final q a;
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.StopsSelector.Stop", qVar, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("starting_stop_state", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CheckoutResponse.StopsSelector.a.f;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), w7sVar, qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.StopsSelector.a.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        CheckoutResponse.StopsSelector.StopState stopState = null;
        CheckoutResponse.StopsSelector.StopState stopState2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                stopState = (CheckoutResponse.StopsSelector.StopState) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), stopState);
                i |= 2;
            } else if (v == 2) {
                stopState2 = (CheckoutResponse.StopsSelector.StopState) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), stopState2);
                i |= 4;
            } else if (v == 3) {
                formattedText = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                formattedText2 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.StopsSelector.a(i, str, stopState, stopState2, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.StopsSelector.a aVar = (CheckoutResponse.StopsSelector.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.StopsSelector.a.f;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || aVar.b != CheckoutResponse.StopsSelector.StopState.PASSED) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || aVar.c != CheckoutResponse.StopsSelector.StopState.PASSED) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, w7s.a, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
