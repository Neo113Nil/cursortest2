package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class e0 implements uxs {
    public static final e0 a;
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse", e0Var, 2);
        pluginGeneratedSerialDescriptor.j("payment_id", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, CreatePaymentResponse.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CreatePaymentResponse.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        CreatePaymentResponse.Status status = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                status = (CreatePaymentResponse.Status) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), status);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new CreatePaymentResponse(i, str, status);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CreatePaymentResponse createPaymentResponse = (CreatePaymentResponse) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CreatePaymentResponse.c;
        if (b.F() || !jl40.l(createPaymentResponse.a, "")) {
            b.o(serialDescriptor, 0, createPaymentResponse.a);
        }
        if (b.F() || createPaymentResponse.b != CreatePaymentResponse.Status.Success) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), createPaymentResponse.b);
        }
        b.c(serialDescriptor);
    }
}
