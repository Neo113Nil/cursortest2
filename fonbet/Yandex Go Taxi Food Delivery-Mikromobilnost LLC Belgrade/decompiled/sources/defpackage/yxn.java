package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes12.dex */
public final /* synthetic */ class yxn implements uxs {
    public static final yxn a;
    private static final SerialDescriptor descriptor;

    static {
        yxn yxnVar = new yxn();
        a = yxnVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.map_common.map.experiment.EnableOsmMapKitExperiment", yxnVar, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("driving", true);
        pluginGeneratedSerialDescriptor.j(PolicyMappingsExtension.MAP, true);
        pluginGeneratedSerialDescriptor.j("search", true);
        pluginGeneratedSerialDescriptor.j("suggest", true);
        pluginGeneratedSerialDescriptor.j("traffic", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
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
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ayn(i, z2, z3, z4, z5, z6, z7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ayn aynVar = (ayn) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        zxn zxnVar = ayn.Companion;
        if (b.F() || aynVar.b) {
            b.n(serialDescriptor, 0, aynVar.b);
        }
        if (b.F() || aynVar.c) {
            b.n(serialDescriptor, 1, aynVar.c);
        }
        if (b.F() || aynVar.d) {
            b.n(serialDescriptor, 2, aynVar.d);
        }
        if (b.F() || aynVar.e) {
            b.n(serialDescriptor, 3, aynVar.e);
        }
        if (b.F() || aynVar.f) {
            b.n(serialDescriptor, 4, aynVar.f);
        }
        if (b.F() || aynVar.g) {
            b.n(serialDescriptor, 5, aynVar.g);
        }
        b.c(serialDescriptor);
    }
}
