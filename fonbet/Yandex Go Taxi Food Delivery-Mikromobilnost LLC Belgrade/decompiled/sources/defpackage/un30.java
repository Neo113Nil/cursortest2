package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class un30 implements uxs {
    public static final un30 a;
    private static final SerialDescriptor descriptor;

    static {
        un30 un30Var = new un30();
        a = un30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.model.MtLottieAnimation", un30Var, 4);
        pluginGeneratedSerialDescriptor.j("animation_count", true);
        pluginGeneratedSerialDescriptor.j("tap_count", true);
        pluginGeneratedSerialDescriptor.j("delay", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(uc30.e);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, e6m.a, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        tc30 tc30Var = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                d = b.E(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                tc30Var = (tc30) b.s(serialDescriptor, 3, uc30.e, tc30Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new wn30(i, i2, i3, d, tc30Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wn30 wn30Var = (wn30) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || wn30Var.a != 0) {
            b.A(0, wn30Var.a, serialDescriptor);
        }
        if (b.F() || wn30Var.b != 0) {
            b.A(1, wn30Var.b, serialDescriptor);
        }
        if (b.F() || Double.compare(wn30Var.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, wn30Var.c);
        }
        if (b.F() || wn30Var.d != null) {
            b.g(serialDescriptor, 3, uc30.e, wn30Var.d);
        }
        b.c(serialDescriptor);
    }
}
