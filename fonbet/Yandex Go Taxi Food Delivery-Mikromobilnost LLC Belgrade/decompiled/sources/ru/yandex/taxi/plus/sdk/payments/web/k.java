package ru.yandex.taxi.plus.sdk.payments.web;

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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$StatePaymentEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements uxs {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.StatePaymentEvent", kVar, 1);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PaymentEvent$StatePaymentEvent.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$StatePaymentEvent.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        PaymentEvent$StatePaymentEvent.Status status = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                status = (PaymentEvent$StatePaymentEvent.Status) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), status);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new PaymentEvent$StatePaymentEvent(i, status);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentEvent$StatePaymentEvent paymentEvent$StatePaymentEvent = (PaymentEvent$StatePaymentEvent) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$StatePaymentEvent.b;
        if (b.F() || paymentEvent$StatePaymentEvent.a != PaymentEvent$StatePaymentEvent.Status.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), paymentEvent$StatePaymentEvent.a);
        }
        b.c(serialDescriptor);
    }
}
