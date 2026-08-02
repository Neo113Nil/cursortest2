package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class uc21 implements uxs {
    public static final uc21 a;
    private static final SerialDescriptor descriptor;

    static {
        uc21 uc21Var = new uc21();
        a = uc21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.logistics.care.data.UploadPhotoResult", uc21Var, 2);
        pluginGeneratedSerialDescriptor.j("response_type", false);
        pluginGeneratedSerialDescriptor.j("failure_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(wc21.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        yc21 yc21Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                yc21Var = (yc21) b.s(serialDescriptor, 1, wc21.a, yc21Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new zc21(i, str, yc21Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zc21 zc21Var = (zc21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = zc21Var.a;
        yc21 yc21Var = zc21Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || yc21Var != null) {
            b.g(serialDescriptor, 1, wc21.a, yc21Var);
        }
        b.c(serialDescriptor);
    }
}
