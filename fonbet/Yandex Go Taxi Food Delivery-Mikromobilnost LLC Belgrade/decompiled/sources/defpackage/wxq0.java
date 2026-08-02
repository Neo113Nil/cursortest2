package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class wxq0 implements uxs {
    public static final wxq0 a;
    private static final SerialDescriptor descriptor;

    static {
        wxq0 wxq0Var = new wxq0();
        a = wxq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Session", wxq0Var, 2);
        pluginGeneratedSerialDescriptor.j("segment", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(y0r0.a), qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        a1r0 a1r0Var = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                a1r0Var = (a1r0) b.s(serialDescriptor, 0, y0r0.a, a1r0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new yxq0(i, a1r0Var, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        yxq0.c((yxq0) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
