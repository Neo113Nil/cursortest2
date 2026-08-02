package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto$Details$Type;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class y7f0 implements uxs {
    public static final y7f0 a;
    private static final SerialDescriptor descriptor;

    static {
        y7f0 y7f0Var = new y7f0();
        a = y7f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto.Details", y7f0Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("offerText", false);
        pluginGeneratedSerialDescriptor.j("offerSubText", false);
        pluginGeneratedSerialDescriptor.j("commonPeriod", false);
        pluginGeneratedSerialDescriptor.j("trialPeriod", false);
        pluginGeneratedSerialDescriptor.j("introPeriod", false);
        pluginGeneratedSerialDescriptor.j("family", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = h8f0.i;
        auu0 auu0Var = auu0.a;
        a8f0 a8f0Var = a8f0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), a8f0Var, qke.n(a8f0Var), qke.n(a8f0Var), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = h8f0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        ProductDto$Details$Type productDto$Details$Type = null;
        String str2 = null;
        String str3 = null;
        c8f0 c8f0Var = null;
        c8f0 c8f0Var2 = null;
        c8f0 c8f0Var3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    productDto$Details$Type = (ProductDto$Details$Type) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), productDto$Details$Type);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    c8f0Var = (c8f0) b.A(serialDescriptor, 4, a8f0.a, c8f0Var);
                    i |= 16;
                    break;
                case 5:
                    c8f0Var2 = (c8f0) b.s(serialDescriptor, 5, a8f0.a, c8f0Var2);
                    i |= 32;
                    break;
                case 6:
                    c8f0Var3 = (c8f0) b.s(serialDescriptor, 6, a8f0.a, c8f0Var3);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new h8f0(i, str, productDto$Details$Type, str2, str3, c8f0Var, c8f0Var2, c8f0Var3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h8f0 h8f0Var = (h8f0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = h8f0.i;
        b.o(serialDescriptor, 0, h8f0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), h8f0Var.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, h8f0Var.c);
        b.g(serialDescriptor, 3, auu0Var, h8f0Var.d);
        a8f0 a8f0Var = a8f0.a;
        b.e(serialDescriptor, 4, a8f0Var, h8f0Var.e);
        b.g(serialDescriptor, 5, a8f0Var, h8f0Var.f);
        b.g(serialDescriptor, 6, a8f0Var, h8f0Var.g);
        b.n(serialDescriptor, 7, h8f0Var.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
