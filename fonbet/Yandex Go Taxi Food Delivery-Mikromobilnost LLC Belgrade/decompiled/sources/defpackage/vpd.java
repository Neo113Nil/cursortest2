package defpackage;

import com.yandex.plus.pay.adapter.internal.CompositeOfferImpl;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class vpd implements uxs {
    public static final vpd a;
    private static final SerialDescriptor descriptor;

    static {
        vpd vpdVar = new vpd();
        a = vpdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.adapter.internal.CompositeOfferImpl", vpdVar, 1);
        pluginGeneratedSerialDescriptor.j("actualOffer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PlusPayCompositeOffers$Offer$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        PlusPayCompositeOffers.Offer offer = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                offer = (PlusPayCompositeOffers.Offer) b.A(serialDescriptor, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new CompositeOfferImpl(i, offer, psq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, ((CompositeOfferImpl) obj).actualOffer);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
