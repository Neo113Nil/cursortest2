package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class yja0 implements uxs {
    public static final yja0 a;
    private static final SerialDescriptor descriptor;

    static {
        yja0 yja0Var = new yja0();
        a = yja0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.PaymentSelectorScreenListItemDto", yja0Var, 3);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("subtitle_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new aka0(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        aka0 aka0Var = (aka0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aka0Var.a, "")) {
            b.o(serialDescriptor, 0, aka0Var.a);
        }
        if (b.F() || !jl40.l(aka0Var.b, "")) {
            b.o(serialDescriptor, 1, aka0Var.b);
        }
        if (b.F() || aka0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, aka0Var.c);
        }
        b.c(serialDescriptor);
    }
}
