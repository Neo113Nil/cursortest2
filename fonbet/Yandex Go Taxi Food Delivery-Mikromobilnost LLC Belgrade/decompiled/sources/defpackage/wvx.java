package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class wvx implements uxs {
    public static final wvx a;
    private static final SerialDescriptor descriptor;

    static {
        wvx wvxVar = new wvx();
        a = wvxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.dto.LaunchParam.Antifraud", wvxVar, 7);
        pluginGeneratedSerialDescriptor.j("instance_id", false);
        pluginGeneratedSerialDescriptor.j("metrica_uuid", false);
        pluginGeneratedSerialDescriptor.j("metrica_device_id", false);
        pluginGeneratedSerialDescriptor.j("mac", false);
        pluginGeneratedSerialDescriptor.j("ip", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("started_in_emulator", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), yvx.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        awx awxVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
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
                    awxVar = (awx) b.A(serialDescriptor, 5, yvx.a, awxVar);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new bwx(i, str, str2, str3, str4, str5, awxVar, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bwx bwxVar = (bwx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, bwxVar.a);
        b.g(serialDescriptor, 1, auu0Var, bwxVar.b);
        b.g(serialDescriptor, 2, auu0Var, bwxVar.c);
        b.g(serialDescriptor, 3, auu0Var, bwxVar.d);
        b.g(serialDescriptor, 4, auu0Var, bwxVar.e);
        b.e(serialDescriptor, 5, yvx.a, bwxVar.f);
        b.n(serialDescriptor, 6, bwxVar.g);
        b.c(serialDescriptor);
    }
}
