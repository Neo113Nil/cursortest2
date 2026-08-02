package defpackage;

import defpackage.f0k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class xzj implements uxs {
    public static final xzj a;
    private static final SerialDescriptor descriptor;

    static {
        xzj xzjVar = new xzj();
        a = xzjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.DisplaySettings", xzjVar, 6);
        pluginGeneratedSerialDescriptor.j("z_index", true);
        pluginGeneratedSerialDescriptor.j("simplified_zoom", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("enable_animation", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        pluginGeneratedSerialDescriptor.j("safe_zone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = f0k.g;
        nor norVar = nor.a;
        return new KSerializer[]{qke.n(norVar), qke.n(norVar), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(z96.a), qke.n(zzj.a), norVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f0k.g;
        b.getClass();
        int i = 0;
        Float f = null;
        Float f2 = null;
        Float[] fArr = null;
        Boolean bool = null;
        f0k.a aVar = null;
        float f3 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                    i |= 1;
                    break;
                case 1:
                    f2 = (Float) b.s(serialDescriptor, 1, nor.a, f2);
                    i |= 2;
                    break;
                case 2:
                    fArr = (Float[]) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), fArr);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                    i |= 8;
                    break;
                case 4:
                    aVar = (f0k.a) b.s(serialDescriptor, 4, zzj.a, aVar);
                    i |= 16;
                    break;
                case 5:
                    f3 = b.y(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new f0k(i, f, f2, fArr, bool, aVar, f3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0k f0kVar = (f0k) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f0k.g;
        if (b.F() || f0kVar.a != null) {
            b.g(serialDescriptor, 0, nor.a, f0kVar.a);
        }
        if (b.F() || f0kVar.b != null) {
            b.g(serialDescriptor, 1, nor.a, f0kVar.b);
        }
        if (b.F() || f0kVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), f0kVar.c);
        }
        if (b.F() || f0kVar.d != null) {
            b.g(serialDescriptor, 3, z96.a, f0kVar.d);
        }
        if (b.F() || f0kVar.e != null) {
            b.g(serialDescriptor, 4, zzj.a, f0kVar.e);
        }
        if (b.F() || Float.compare(f0kVar.f, 0.0f) != 0) {
            b.z(serialDescriptor, 5, f0kVar.f);
        }
        b.c(serialDescriptor);
    }
}
