package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class wpw0 implements uxs {
    public static final wpw0 a;
    private static final SerialDescriptor descriptor;

    static {
        wpw0 wpw0Var = new wpw0();
        a = wpw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoBalanceContent", wpw0Var, 7);
        pluginGeneratedSerialDescriptor.j("leading_icon", true);
        pluginGeneratedSerialDescriptor.j("trail_icon", true);
        pluginGeneratedSerialDescriptor.j("value_icon", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("balance", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, h6w.a, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ypw0(i, str, str2, str3, str4, i2, str5, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ypw0 ypw0Var = (ypw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ypw0Var.a, "")) {
            b.o(serialDescriptor, 0, ypw0Var.a);
        }
        if (b.F() || !jl40.l(ypw0Var.b, "")) {
            b.o(serialDescriptor, 1, ypw0Var.b);
        }
        if (b.F() || !jl40.l(ypw0Var.c, "")) {
            b.o(serialDescriptor, 2, ypw0Var.c);
        }
        if (b.F() || !jl40.l(ypw0Var.d, "")) {
            b.o(serialDescriptor, 3, ypw0Var.d);
        }
        if (b.F() || ypw0Var.e != 0) {
            b.A(4, ypw0Var.e, serialDescriptor);
        }
        if (b.F() || !jl40.l(ypw0Var.f, "")) {
            b.o(serialDescriptor, 5, ypw0Var.f);
        }
        if (b.F() || !jl40.l(ypw0Var.g, "")) {
            b.o(serialDescriptor, 6, ypw0Var.g);
        }
        b.c(serialDescriptor);
    }
}
