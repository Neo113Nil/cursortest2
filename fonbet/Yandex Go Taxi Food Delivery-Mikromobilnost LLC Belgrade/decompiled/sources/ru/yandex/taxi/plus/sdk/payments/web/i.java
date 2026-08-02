package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$PurchaseSuccessPaymentEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.PurchaseSuccessPaymentEvent", iVar, 5);
        pluginGeneratedSerialDescriptor.j("scenario", true);
        pluginGeneratedSerialDescriptor.j("monetizationModel", true);
        pluginGeneratedSerialDescriptor.j("userStateSynchronized", true);
        pluginGeneratedSerialDescriptor.j("isTrial", true);
        pluginGeneratedSerialDescriptor.j("subscriptionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{PaymentEvent$PurchaseSuccessPaymentEvent.f[0].getValue(), qke.n(auu0Var), z96Var, z96Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$PurchaseSuccessPaymentEvent.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        PaymentEvent$PurchaseSuccessPaymentEvent.Scenario scenario = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                scenario = (PaymentEvent$PurchaseSuccessPaymentEvent.Scenario) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), scenario);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z3 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new PaymentEvent$PurchaseSuccessPaymentEvent(i, scenario, str, z2, z3, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentEvent$PurchaseSuccessPaymentEvent paymentEvent$PurchaseSuccessPaymentEvent = (PaymentEvent$PurchaseSuccessPaymentEvent) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$PurchaseSuccessPaymentEvent.f;
        if (b.F() || paymentEvent$PurchaseSuccessPaymentEvent.a != PaymentEvent$PurchaseSuccessPaymentEvent.Scenario.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), paymentEvent$PurchaseSuccessPaymentEvent.a);
        }
        if (b.F() || paymentEvent$PurchaseSuccessPaymentEvent.b != null) {
            b.g(serialDescriptor, 1, auu0.a, paymentEvent$PurchaseSuccessPaymentEvent.b);
        }
        if (b.F() || !paymentEvent$PurchaseSuccessPaymentEvent.c) {
            b.n(serialDescriptor, 2, paymentEvent$PurchaseSuccessPaymentEvent.c);
        }
        if (b.F() || paymentEvent$PurchaseSuccessPaymentEvent.d) {
            b.n(serialDescriptor, 3, paymentEvent$PurchaseSuccessPaymentEvent.d);
        }
        if (b.F() || paymentEvent$PurchaseSuccessPaymentEvent.e != null) {
            b.g(serialDescriptor, 4, auu0.a, paymentEvent$PurchaseSuccessPaymentEvent.e);
        }
        b.c(serialDescriptor);
    }
}
