package defpackage;

import defpackage.w6p0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class q6p0 implements uxs {
    public static final q6p0 a;
    private static final SerialDescriptor descriptor;

    static {
        q6p0 q6p0Var = new q6p0();
        a = q6p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersUserStateResponse", q6p0Var, 6);
        pluginGeneratedSerialDescriptor.j("is_newbie", true);
        pluginGeneratedSerialDescriptor.j("ignition_key_allowed", true);
        pluginGeneratedSerialDescriptor.j("insurance", true);
        pluginGeneratedSerialDescriptor.j("debt", true);
        pluginGeneratedSerialDescriptor.j("super_pass_grace_days_left", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n(s6p0.a), qke.n(ptg.a), qke.n(h6w.a), qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        w6p0.a aVar = null;
        rtg rtgVar = null;
        Integer num = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                    i |= 2;
                    break;
                case 2:
                    aVar = (w6p0.a) b.s(serialDescriptor, 2, s6p0.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    rtgVar = (rtg) b.s(serialDescriptor, 3, ptg.a, rtgVar);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    break;
                case 5:
                    iefVar = (ief) b.s(serialDescriptor, 5, gef.a, iefVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new w6p0(i, bool, bool2, aVar, rtgVar, num, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w6p0 w6p0Var = (w6p0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || w6p0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, w6p0Var.a);
        }
        if (b.F() || w6p0Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, w6p0Var.b);
        }
        if (b.F() || w6p0Var.c != null) {
            b.g(serialDescriptor, 2, s6p0.a, w6p0Var.c);
        }
        if (b.F() || w6p0Var.d != null) {
            b.g(serialDescriptor, 3, ptg.a, w6p0Var.d);
        }
        if (b.F() || w6p0Var.e != null) {
            b.g(serialDescriptor, 4, h6w.a, w6p0Var.e);
        }
        if (b.F() || w6p0Var.f != null) {
            b.g(serialDescriptor, 5, gef.a, w6p0Var.f);
        }
        b.c(serialDescriptor);
    }
}
