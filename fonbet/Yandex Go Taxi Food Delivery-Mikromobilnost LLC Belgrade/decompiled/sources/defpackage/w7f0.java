package defpackage;

import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class w7f0 implements uxs {
    public static final w7f0 a;
    private static final SerialDescriptor descriptor;

    static {
        w7f0 w7f0Var = new w7f0();
        a = w7f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto", w7f0Var, 2);
        pluginGeneratedSerialDescriptor.j("available", false);
        pluginGeneratedSerialDescriptor.j(CreateApplicationWithProductJsonAdapter.productKey, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, y7f0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        h8f0 h8f0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                h8f0Var = (h8f0) b.A(serialDescriptor, 1, y7f0.a, h8f0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new i8f0(i, z2, h8f0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i8f0 i8f0Var = (i8f0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.n(serialDescriptor, 0, i8f0Var.a);
        b.e(serialDescriptor, 1, y7f0.a, i8f0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
