package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class y03 implements uxs {
    public static final y03 a;
    private static final SerialDescriptor descriptor;

    static {
        y03 y03Var = new y03();
        a = y03Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.ApplicationStateField", y03Var, 8);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("entrance", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("metrica_action", true);
        pluginGeneratedSerialDescriptor.j("metrica_method", true);
        pluginGeneratedSerialDescriptor.j("finalsuggest_method", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(b0t.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzs zzsVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    zzsVar = (zzs) b.s(serialDescriptor, 4, b0t.a, zzsVar);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) b.s(serialDescriptor, 7, auu0.a, str7);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new a13(i, str, str2, str3, str4, zzsVar, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a13 a13Var = (a13) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || a13Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, a13Var.a);
        }
        if (b.F() || a13Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, a13Var.b);
        }
        if (b.F() || a13Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, a13Var.c);
        }
        if (b.F() || a13Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, a13Var.d);
        }
        if (b.F() || a13Var.e != null) {
            b.g(serialDescriptor, 4, b0t.a, a13Var.e);
        }
        if (b.F() || a13Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, a13Var.f);
        }
        if (b.F() || a13Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, a13Var.g);
        }
        if (b.F() || a13Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, a13Var.h);
        }
        b.c(serialDescriptor);
    }
}
