package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class tmv implements uxs {
    public static final tmv a;
    private static final SerialDescriptor descriptor;

    static {
        tmv tmvVar = new tmv();
        a = tmvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PURCHASE_PRODUCT_AUTOSTART", tmvVar, 3);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j("purchaseType", false);
        pluginGeneratedSerialDescriptor.j("offerType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = vmv.d;
        return new KSerializer[]{qke.n(auu0.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vmv.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PurchaseTypeDto purchaseTypeDto = null;
        OfferTypeDto offerTypeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                purchaseTypeDto = (PurchaseTypeDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), purchaseTypeDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                offerTypeDto = (OfferTypeDto) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), offerTypeDto);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new vmv(i, str, purchaseTypeDto, offerTypeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vmv vmvVar = (vmv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vmv.d;
        b.g(serialDescriptor, 0, auu0.a, vmvVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vmvVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vmvVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
