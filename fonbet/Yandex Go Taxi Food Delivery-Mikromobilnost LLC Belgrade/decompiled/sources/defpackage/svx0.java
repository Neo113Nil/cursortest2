package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes5.dex */
public final /* synthetic */ class svx0 implements uxs {
    public static final svx0 a;
    private static final SerialDescriptor descriptor;

    static {
        svx0 svx0Var = new svx0();
        a = svx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.TaxiKnownOrderInfo", svx0Var, 8);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, false);
        pluginGeneratedSerialDescriptor.j("api_tag", true);
        pluginGeneratedSerialDescriptor.j("source_point", true);
        pluginGeneratedSerialDescriptor.j("destination_point", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("tariff_class_name", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        b0t b0tVar = b0t.a;
        return new KSerializer[]{auu0Var, auu0Var, n, qke.n(b0tVar), qke.n(b0tVar), qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a)};
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
        zzs zzsVar = null;
        zzs zzsVar2 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                    i |= 8;
                    break;
                case 4:
                    zzsVar2 = (zzs) b.s(serialDescriptor, 4, b0t.a, zzsVar2);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new uvx0(i, str, str2, str3, zzsVar, zzsVar2, str4, str5, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uvx0 uvx0Var = (uvx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = uvx0Var.a;
        Boolean bool = uvx0Var.h;
        String str2 = uvx0Var.g;
        String str3 = uvx0Var.f;
        zzs zzsVar = uvx0Var.e;
        zzs zzsVar2 = uvx0Var.d;
        String str4 = uvx0Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, uvx0Var.b);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || zzsVar2 != null) {
            b.g(serialDescriptor, 3, b0t.a, zzsVar2);
        }
        if (b.F() || zzsVar != null) {
            b.g(serialDescriptor, 4, b0t.a, zzsVar);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 5, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 6, auu0.a, str2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 7, z96.a, bool);
        }
        b.c(serialDescriptor);
    }
}
