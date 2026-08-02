package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class vne implements uxs {
    public static final vne a;
    private static final SerialDescriptor descriptor;

    static {
        vne vneVar = new vne();
        a = vneVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.CoordProvider", vneVar, 8);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("speed", true);
        pluginGeneratedSerialDescriptor.j("location_update_time", true);
        pluginGeneratedSerialDescriptor.j("altitude", true);
        pluginGeneratedSerialDescriptor.j("location_tags", true);
        pluginGeneratedSerialDescriptor.j("altitude_accuracy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xne.i;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(b0t.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, qke.n(h6wVar), qke.n(h6wVar), qke.n(auu0Var), qke.n(e6m.a), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xne.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Integer num = null;
        String str = null;
        zzs zzsVar = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        Double d = null;
        Map map = null;
        int i = 0;
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
                    zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) b.s(serialDescriptor, 5, e6m.a, d);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new xne(i, str, zzsVar, num2, num3, str2, d, map, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xne xneVar = (xne) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xne.i;
        if (b.F() || xneVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, xneVar.a);
        }
        if (b.F() || xneVar.b != null) {
            b.g(serialDescriptor, 1, b0t.a, xneVar.b);
        }
        if (b.F() || xneVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, xneVar.c);
        }
        if (b.F() || xneVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, xneVar.d);
        }
        if (b.F() || xneVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, xneVar.e);
        }
        if (b.F() || xneVar.f != null) {
            b.g(serialDescriptor, 5, e6m.a, xneVar.f);
        }
        if (b.F() || xneVar.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), xneVar.g);
        }
        if (b.F() || xneVar.h != null) {
            b.g(serialDescriptor, 7, h6w.a, xneVar.h);
        }
        b.c(serialDescriptor);
    }
}
