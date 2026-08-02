package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class u8d0 implements uxs {
    public static final u8d0 a;
    private static final SerialDescriptor descriptor;

    static {
        u8d0 u8d0Var = new u8d0();
        a = u8d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOptionDto", u8d0Var, 10);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("additionText", true);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, false);
        pluginGeneratedSerialDescriptor.j("commonPeriod", false);
        pluginGeneratedSerialDescriptor.j("commonPrice", false);
        pluginGeneratedSerialDescriptor.j("offerVendorType", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w8d0.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), k8d0.a, auu0Var, x8d0.a, i3yVarArr[8].getValue(), qke.n((KSerializer) i3yVarArr[9].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = w8d0.k;
        b.getClass();
        Map map = null;
        PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto = null;
        boolean z = true;
        z8d0 z8d0Var = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        m8d0 m8d0Var = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    m8d0Var = (m8d0) b.A(serialDescriptor, 5, k8d0.a, m8d0Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z8d0Var = (z8d0) b.A(serialDescriptor, 7, x8d0.a, z8d0Var);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    plusPayAcquisitionOfferVendorTypeDto = (PlusPayAcquisitionOfferVendorTypeDto) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), plusPayAcquisitionOfferVendorTypeDto);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.s(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), map);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new w8d0(i, str, str2, str3, str4, str5, m8d0Var, str6, z8d0Var, plusPayAcquisitionOfferVendorTypeDto, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w8d0 w8d0Var = (w8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w8d0.k;
        String str = w8d0Var.a;
        Map map = w8d0Var.j;
        PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto = w8d0Var.i;
        String str2 = w8d0Var.e;
        String str3 = w8d0Var.d;
        String str4 = w8d0Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, w8d0Var.b);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 3, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.e(serialDescriptor, 5, k8d0.a, w8d0Var.f);
        b.o(serialDescriptor, 6, w8d0Var.g);
        b.e(serialDescriptor, 7, x8d0.a, w8d0Var.h);
        if (b.F() || plusPayAcquisitionOfferVendorTypeDto != PlusPayAcquisitionOfferVendorTypeDto.UNKNOWN) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), plusPayAcquisitionOfferVendorTypeDto);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
