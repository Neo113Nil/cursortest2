package ru.yandex.taxi.plus.sdk.payments.web;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
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
import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$OpenUrlPaymentEvent;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent.OpenUrlPaymentEvent.UriInfo", fVar, 3);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("auth", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), z96.a, PaymentEvent$OpenUrlPaymentEvent.UriInfo.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$OpenUrlPaymentEvent.UriInfo.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type type = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                type = (PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), type);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PaymentEvent$OpenUrlPaymentEvent.UriInfo(i, str, z2, type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PaymentEvent$OpenUrlPaymentEvent.UriInfo uriInfo = (PaymentEvent$OpenUrlPaymentEvent.UriInfo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentEvent$OpenUrlPaymentEvent.UriInfo.d;
        if (b.F() || uriInfo.a != null) {
            b.g(serialDescriptor, 0, auu0.a, uriInfo.a);
        }
        if (b.F() || uriInfo.b) {
            b.n(serialDescriptor, 1, uriInfo.b);
        }
        if (b.F() || uriInfo.c != PaymentEvent$OpenUrlPaymentEvent.UriInfo.Type.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), uriInfo.c);
        }
        b.c(serialDescriptor);
    }
}
