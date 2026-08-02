package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class z570 implements uxs {
    public static final z570 a;
    private static final SerialDescriptor descriptor;

    static {
        z570 z570Var = new z570();
        a = z570Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.OpenInAppCallsParams", z570Var, 7);
        pluginGeneratedSerialDescriptor.j("inAppCallForwardingId", true);
        pluginGeneratedSerialDescriptor.j("phoneNumber", true);
        pluginGeneratedSerialDescriptor.j("calleeName", true);
        pluginGeneratedSerialDescriptor.j("calleePhotoUrl", true);
        pluginGeneratedSerialDescriptor.j("modalTitle", true);
        pluginGeneratedSerialDescriptor.j("modalSubtitle", true);
        pluginGeneratedSerialDescriptor.j("sdkStrings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b670.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b670.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new b670(i, str, str2, str3, str4, str5, str6, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b670 b670Var = (b670) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b670.h;
        if (b.F() || b670Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, b670Var.a);
        }
        if (b.F() || b670Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, b670Var.b);
        }
        if (b.F() || b670Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, b670Var.c);
        }
        if (b.F() || b670Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, b670Var.d);
        }
        if (b.F() || b670Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, b670Var.e);
        }
        if (b.F() || b670Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, b670Var.f);
        }
        if (b.F() || b670Var.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), b670Var.g);
        }
        b.c(serialDescriptor);
    }
}
