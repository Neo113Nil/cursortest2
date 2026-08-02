package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class zmv implements uxs {
    public static final zmv a;
    private static final SerialDescriptor descriptor;

    static {
        zmv zmvVar = new zmv();
        a = zmvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PURCHASE_PRODUCT_CLICK", zmvVar, 3);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j("purchaseType", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cnv.d;
        return new KSerializer[]{qke.n(auu0.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cnv.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PurchaseTypeDto purchaseTypeDto = null;
        InMessage$PurchaseProductClick$Type inMessage$PurchaseProductClick$Type = null;
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
                inMessage$PurchaseProductClick$Type = (InMessage$PurchaseProductClick$Type) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), inMessage$PurchaseProductClick$Type);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new cnv(i, str, purchaseTypeDto, inMessage$PurchaseProductClick$Type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cnv cnvVar = (cnv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cnv.d;
        b.g(serialDescriptor, 0, auu0.a, cnvVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cnvVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), cnvVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
