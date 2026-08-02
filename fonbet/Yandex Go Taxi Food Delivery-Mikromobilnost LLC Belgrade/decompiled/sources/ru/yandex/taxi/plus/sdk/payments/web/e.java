package ru.yandex.taxi.plus.sdk.payments.web;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
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
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$OpenUrlPaymentEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.OpenUrlPaymentEvent", eVar, 2);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("fallbackUri", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        f fVar = f.a;
        return new KSerializer[]{qke.n(fVar), qke.n(fVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        PaymentEvent$OpenUrlPaymentEvent.UriInfo uriInfo = null;
        PaymentEvent$OpenUrlPaymentEvent.UriInfo uriInfo2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                uriInfo = (PaymentEvent$OpenUrlPaymentEvent.UriInfo) b.s(serialDescriptor, 0, f.a, uriInfo);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                uriInfo2 = (PaymentEvent$OpenUrlPaymentEvent.UriInfo) b.s(serialDescriptor, 1, f.a, uriInfo2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new PaymentEvent$OpenUrlPaymentEvent(i, uriInfo, uriInfo2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentEvent$OpenUrlPaymentEvent paymentEvent$OpenUrlPaymentEvent = (PaymentEvent$OpenUrlPaymentEvent) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || paymentEvent$OpenUrlPaymentEvent.a != null) {
            b.g(serialDescriptor, 0, f.a, paymentEvent$OpenUrlPaymentEvent.a);
        }
        if (b.F() || paymentEvent$OpenUrlPaymentEvent.b != null) {
            b.g(serialDescriptor, 1, f.a, paymentEvent$OpenUrlPaymentEvent.b);
        }
        b.c(serialDescriptor);
    }
}
