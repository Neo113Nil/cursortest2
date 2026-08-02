package ru.yandex.taxi.masstransit.trains.checkout.model;

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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse", aVar, 2);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("success_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MtTrainCheckoutResponse.c[0].getValue(), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtTrainCheckoutResponse.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        MtTrainCheckoutResponse.ResponseStatus responseStatus = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                responseStatus = (MtTrainCheckoutResponse.ResponseStatus) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), responseStatus);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MtTrainCheckoutResponse(i, responseStatus, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtTrainCheckoutResponse mtTrainCheckoutResponse = (MtTrainCheckoutResponse) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtTrainCheckoutResponse.c;
        if (b.F() || mtTrainCheckoutResponse.a != MtTrainCheckoutResponse.ResponseStatus.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mtTrainCheckoutResponse.a);
        }
        if (b.F() || mtTrainCheckoutResponse.b != null) {
            b.g(serialDescriptor, 1, auu0.a, mtTrainCheckoutResponse.b);
        }
        b.c(serialDescriptor);
    }
}
