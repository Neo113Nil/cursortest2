package ru.yandex.taxi.plus.sdk.payments.web;

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
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$ErrorPaymentEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.ErrorPaymentEvent", aVar, 4);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("requestId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PaymentEvent$ErrorPaymentEvent.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$ErrorPaymentEvent.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PaymentEvent$ErrorPaymentEvent.Action action = null;
        PaymentEvent$ErrorPaymentEvent.Type type = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                action = (PaymentEvent$ErrorPaymentEvent.Action) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), action);
                i |= 2;
            } else if (v == 2) {
                type = (PaymentEvent$ErrorPaymentEvent.Type) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), type);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new PaymentEvent$ErrorPaymentEvent(i, str, action, type, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentEvent$ErrorPaymentEvent paymentEvent$ErrorPaymentEvent = (PaymentEvent$ErrorPaymentEvent) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$ErrorPaymentEvent.e;
        if (b.F() || paymentEvent$ErrorPaymentEvent.a != null) {
            b.g(serialDescriptor, 0, auu0.a, paymentEvent$ErrorPaymentEvent.a);
        }
        if (b.F() || paymentEvent$ErrorPaymentEvent.b != PaymentEvent$ErrorPaymentEvent.Action.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), paymentEvent$ErrorPaymentEvent.b);
        }
        if (b.F() || paymentEvent$ErrorPaymentEvent.c != PaymentEvent$ErrorPaymentEvent.Type.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), paymentEvent$ErrorPaymentEvent.c);
        }
        if (b.F() || paymentEvent$ErrorPaymentEvent.d != null) {
            b.g(serialDescriptor, 3, auu0.a, paymentEvent$ErrorPaymentEvent.d);
        }
        b.c(serialDescriptor);
    }
}
