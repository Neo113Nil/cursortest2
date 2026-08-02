package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class t9d0 implements uxs {
    public static final t9d0 a;
    private static final SerialDescriptor descriptor;

    static {
        t9d0 t9d0Var = new t9d0();
        a = t9d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer.Texts", t9d0Var, 12);
        pluginGeneratedSerialDescriptor.j("subscriptionName", false);
        pluginGeneratedSerialDescriptor.j("buttonText", false);
        pluginGeneratedSerialDescriptor.j("buttonTextWithDetails", false);
        pluginGeneratedSerialDescriptor.j("combinedIntroductoryText", false);
        pluginGeneratedSerialDescriptor.j("combinedPriceText", false);
        pluginGeneratedSerialDescriptor.j("combinedFullOfferText", false);
        pluginGeneratedSerialDescriptor.j("priceInMonth", false);
        pluginGeneratedSerialDescriptor.j("commonPrice", false);
        pluginGeneratedSerialDescriptor.j("currencySymbol", false);
        pluginGeneratedSerialDescriptor.j("discountPercent", true);
        pluginGeneratedSerialDescriptor.j("fullPriceText", true);
        pluginGeneratedSerialDescriptor.j("customTexts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = v9d0.m;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[11].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = v9d0.m;
        b.getClass();
        Map map = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str4 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str7 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str8 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str9 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str10 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str11 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr2[11].getValue(), map);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new v9d0(i, str3, str4, str5, str6, str7, str8, str9, str10, str11, str2, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v9d0 v9d0Var = (v9d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = v9d0.m;
        String str = v9d0Var.a;
        Map map = v9d0Var.l;
        String str2 = v9d0Var.k;
        String str3 = v9d0Var.j;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, v9d0Var.b);
        b.o(serialDescriptor, 2, v9d0Var.c);
        b.o(serialDescriptor, 3, v9d0Var.d);
        b.o(serialDescriptor, 4, v9d0Var.e);
        b.o(serialDescriptor, 5, v9d0Var.f);
        b.o(serialDescriptor, 6, v9d0Var.g);
        b.o(serialDescriptor, 7, v9d0Var.h);
        b.o(serialDescriptor, 8, v9d0Var.i);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 9, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 10, auu0.a, str2);
        }
        if (b.F() || !jl40.l(map, b.f())) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
