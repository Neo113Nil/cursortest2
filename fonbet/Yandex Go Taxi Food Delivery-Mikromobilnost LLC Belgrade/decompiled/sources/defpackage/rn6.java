package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class rn6 implements uxs {
    public static final rn6 a;
    private static final SerialDescriptor descriptor;

    static {
        rn6 rn6Var = new rn6();
        a = rn6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.BubblePaddings", rn6Var, 4);
        pluginGeneratedSerialDescriptor.j("start", true);
        pluginGeneratedSerialDescriptor.j("top", true);
        pluginGeneratedSerialDescriptor.j("end", true);
        pluginGeneratedSerialDescriptor.j("bottom", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar, h6wVar};
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
        int i4 = 0;
        int i5 = 0;
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
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i5 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new tn6(i, i2, i3, i4, i5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tn6 tn6Var = (tn6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || tn6Var.a != 0) {
            b.A(0, tn6Var.a, serialDescriptor);
        }
        if (b.F() || tn6Var.b != 0) {
            b.A(1, tn6Var.b, serialDescriptor);
        }
        if (b.F() || tn6Var.c != 0) {
            b.A(2, tn6Var.c, serialDescriptor);
        }
        if (b.F() || tn6Var.d != 0) {
            b.A(3, tn6Var.d, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
