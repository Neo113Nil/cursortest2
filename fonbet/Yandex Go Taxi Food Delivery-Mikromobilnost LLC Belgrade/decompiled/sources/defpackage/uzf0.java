package defpackage;

import com.yandex.plus.pay.api.google.model.GooglePlayPurchase;
import com.yandex.plus.pay.api.google.model.PurchaseData;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class uzf0 implements uxs {
    public static final uzf0 a;
    private static final SerialDescriptor descriptor;

    static {
        uzf0 uzf0Var = new uzf0();
        a = uzf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.api.google.model.PurchaseData", uzf0Var, 3);
        pluginGeneratedSerialDescriptor.j("purchase", false);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("isSubscription", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cwt.a, auu0.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        GooglePlayPurchase googlePlayPurchase = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                googlePlayPurchase = (GooglePlayPurchase) b.A(serialDescriptor, 0, cwt.a, googlePlayPurchase);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PurchaseData(i, googlePlayPurchase, str, z2, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PurchaseData.write$Self$pay_sdk_api_release((PurchaseData) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
