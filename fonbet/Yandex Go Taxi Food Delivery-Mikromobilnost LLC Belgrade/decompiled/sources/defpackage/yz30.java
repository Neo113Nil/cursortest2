package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class yz30 implements uxs {
    public static final yz30 a;
    private static final SerialDescriptor descriptor;

    static {
        yz30 yz30Var = new yz30();
        a = yz30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.MtShownSummaryPromotionInfo", yz30Var, 2);
        pluginGeneratedSerialDescriptor.j("show_count", true);
        pluginGeneratedSerialDescriptor.j("interaction_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        a040 a040Var = new a040();
        if ((i & 1) == 0) {
            a040Var.a = 0;
        } else {
            a040Var.a = i2;
        }
        if ((i & 2) == 0) {
            a040Var.b = 0;
            return a040Var;
        }
        a040Var.b = i3;
        return a040Var;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a040 a040Var = (a040) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || a040Var.a != 0) {
            b.A(0, a040Var.a, serialDescriptor);
        }
        if (b.F() || a040Var.b != 0) {
            b.A(1, a040Var.b, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
