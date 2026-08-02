package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class sn21 implements uxs {
    public static final sn21 a;
    private static final SerialDescriptor descriptor;

    static {
        sn21 sn21Var = new sn21();
        a = sn21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.userinfo.UserInfoRequest", sn21Var, 5);
        pluginGeneratedSerialDescriptor.j("user_id", false);
        pluginGeneratedSerialDescriptor.j("appmetrica_device_id", false);
        pluginGeneratedSerialDescriptor.j("taxi_device_id", false);
        pluginGeneratedSerialDescriptor.j("user_info", false);
        pluginGeneratedSerialDescriptor.j("yandex_uid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new un21(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        un21 un21Var = (un21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, un21Var.a);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, un21Var.b);
        b.g(serialDescriptor, 2, auu0Var, un21Var.c);
        b.g(serialDescriptor, 3, auu0Var, un21Var.d);
        b.g(serialDescriptor, 4, auu0Var, un21Var.e);
        b.c(serialDescriptor);
    }
}
