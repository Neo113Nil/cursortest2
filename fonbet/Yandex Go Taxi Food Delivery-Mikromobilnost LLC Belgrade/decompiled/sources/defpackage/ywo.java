package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cxo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ywo implements uxs {
    public static final ywo a;
    private static final SerialDescriptor descriptor;

    static {
        ywo ywoVar = new ywo();
        a = ywoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.ExtendedNotificationExperiment", ywoVar, 7);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("driving", true);
        pluginGeneratedSerialDescriptor.j("waiting", true);
        pluginGeneratedSerialDescriptor.j("car_under_plates_tag", true);
        pluginGeneratedSerialDescriptor.j("car_under_plates_background_tag", true);
        pluginGeneratedSerialDescriptor.j("car_under_plates_glossy_tag", true);
        pluginGeneratedSerialDescriptor.j("car_under_plates_details_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, axo.a, dxo.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        cxo.a aVar = null;
        cxo.b bVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    aVar = (cxo.a) b.A(serialDescriptor, 1, axo.a, aVar);
                    i |= 2;
                    break;
                case 2:
                    bVar = (cxo.b) b.A(serialDescriptor, 2, dxo.a, bVar);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new cxo(i, z2, aVar, bVar, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cxo cxoVar = (cxo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        zwo zwoVar = cxo.Companion;
        if (b.F() || cxoVar.b) {
            b.n(serialDescriptor, 0, cxoVar.b);
        }
        if (b.F() || !jl40.l(cxoVar.c, new cxo.a(0))) {
            b.e(serialDescriptor, 1, axo.a, cxoVar.c);
        }
        if (b.F() || !jl40.l(cxoVar.d, new cxo.b(0))) {
            b.e(serialDescriptor, 2, dxo.a, cxoVar.d);
        }
        if (b.F() || cxoVar.e != null) {
            b.g(serialDescriptor, 3, auu0.a, cxoVar.e);
        }
        if (b.F() || cxoVar.f != null) {
            b.g(serialDescriptor, 4, auu0.a, cxoVar.f);
        }
        if (b.F() || cxoVar.g != null) {
            b.g(serialDescriptor, 5, auu0.a, cxoVar.g);
        }
        if (b.F() || cxoVar.h != null) {
            b.g(serialDescriptor, 6, auu0.a, cxoVar.h);
        }
        b.c(serialDescriptor);
    }
}
