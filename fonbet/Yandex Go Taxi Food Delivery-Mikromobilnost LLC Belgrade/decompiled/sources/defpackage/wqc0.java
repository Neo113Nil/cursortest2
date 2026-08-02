package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class wqc0 implements uxs {
    public static final wqc0 a;
    private static final SerialDescriptor descriptor;

    static {
        wqc0 wqc0Var = new wqc0();
        a = wqc0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.PlaqueShowParamsDto", wqc0Var, 3);
        pluginGeneratedSerialDescriptor.j("show_after", true);
        pluginGeneratedSerialDescriptor.j("close_after", true);
        pluginGeneratedSerialDescriptor.j("ttl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, qke.n(h6wVar), h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new yqc0(i, i2, i3, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yqc0 yqc0Var = (yqc0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || yqc0Var.a != 0) {
            b.A(0, yqc0Var.a, serialDescriptor);
        }
        if (b.F() || yqc0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, yqc0Var.b);
        }
        if (b.F() || yqc0Var.c != 0) {
            b.A(2, yqc0Var.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
