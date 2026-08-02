package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class qu80 implements uxs {
    public static final qu80 a;
    private static final SerialDescriptor descriptor;

    static {
        qu80 qu80Var = new qu80();
        a = qu80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PURCHASE_PRODUCT_REQUEST", qu80Var, 5);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("purchaseType", false);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("target", true);
        pluginGeneratedSerialDescriptor.j("forceSelectCard", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = su80.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), auu0Var, qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = su80.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PurchaseTypeDto purchaseTypeDto = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
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
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new su80(i, str, purchaseTypeDto, str2, str3, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        su80 su80Var = (su80) obj;
        String str = su80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = su80.f;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        KSerializer kSerializer = (KSerializer) i3yVarArr[1].getValue();
        PurchaseTypeDto purchaseTypeDto = su80Var.b;
        Boolean bool = su80Var.e;
        String str2 = su80Var.d;
        b.e(serialDescriptor, 1, kSerializer, purchaseTypeDto);
        b.o(serialDescriptor, 2, su80Var.c);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 4, z96.a, bool);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
