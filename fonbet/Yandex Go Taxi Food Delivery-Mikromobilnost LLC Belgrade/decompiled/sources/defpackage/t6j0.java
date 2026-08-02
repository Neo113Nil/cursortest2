package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class t6j0 implements uxs {
    public static final t6j0 a;
    private static final SerialDescriptor descriptor;

    static {
        t6j0 t6j0Var = new t6j0();
        a = t6j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.RequestGooglePayTokenParams", t6j0Var, 9);
        pluginGeneratedSerialDescriptor.j("regionId", true);
        pluginGeneratedSerialDescriptor.j("merchant", true);
        pluginGeneratedSerialDescriptor.j("gateway", true);
        pluginGeneratedSerialDescriptor.j("serviceToken", true);
        pluginGeneratedSerialDescriptor.j("currencyCode", true);
        pluginGeneratedSerialDescriptor.j("amount", true);
        pluginGeneratedSerialDescriptor.j("bind_token_to_trust", true);
        pluginGeneratedSerialDescriptor.j("networks", true);
        pluginGeneratedSerialDescriptor.j("tokenizedOnly", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = v6j0.j;
        KSerializer n = qke.n(h6w.a);
        auu0 auu0Var = auu0.a;
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, qke.n(z96Var), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = v6j0.j;
        b.getClass();
        Boolean bool = null;
        boolean z = true;
        List list = null;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
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
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool2);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new v6j0(i, num, str, str2, str3, str4, str5, bool2, list, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v6j0 v6j0Var = (v6j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = v6j0.j;
        if (b.F() || v6j0Var.a != null) {
            b.g(serialDescriptor, 0, h6w.a, v6j0Var.a);
        }
        if (b.F() || v6j0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, v6j0Var.b);
        }
        if (b.F() || v6j0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, v6j0Var.c);
        }
        if (b.F() || v6j0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, v6j0Var.d);
        }
        if (b.F() || v6j0Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, v6j0Var.e);
        }
        if (b.F() || v6j0Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, v6j0Var.f);
        }
        if (b.F() || v6j0Var.g != null) {
            b.g(serialDescriptor, 6, z96.a, v6j0Var.g);
        }
        if (b.F() || v6j0Var.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), v6j0Var.h);
        }
        if (b.F() || v6j0Var.i != null) {
            b.g(serialDescriptor, 8, z96.a, v6j0Var.i);
        }
        b.c(serialDescriptor);
    }
}
