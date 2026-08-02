package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class vm20 implements uxs {
    public static final vm20 a;
    private static final SerialDescriptor descriptor;

    static {
        vm20 vm20Var = new vm20();
        a = vm20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.params.MobConfigParams", vm20Var, 4);
        pluginGeneratedSerialDescriptor.j("config_id", false);
        pluginGeneratedSerialDescriptor.j("supported_api_names", false);
        pluginGeneratedSerialDescriptor.j("country_code", true);
        pluginGeneratedSerialDescriptor.j("fcm_token", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xm20.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xm20.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new xm20(str, i, str2, str3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xm20 xm20Var = (xm20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xm20.e;
        String str = xm20Var.a;
        String str2 = xm20Var.d;
        String str3 = xm20Var.c;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), xm20Var.b);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 2, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
