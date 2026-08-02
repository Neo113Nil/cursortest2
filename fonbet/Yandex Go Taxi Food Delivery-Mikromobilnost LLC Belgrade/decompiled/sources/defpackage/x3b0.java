package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes13.dex */
public final /* synthetic */ class x3b0 implements uxs {
    public static final x3b0 a;
    private static final SerialDescriptor descriptor;

    static {
        x3b0 x3b0Var = new x3b0();
        a = x3b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.PersonalGoal", x3b0Var, 10);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("progress_total_count", true);
        pluginGeneratedSerialDescriptor.j("progress_current_count", true);
        pluginGeneratedSerialDescriptor.j("progress_image_tag", true);
        pluginGeneratedSerialDescriptor.j("prize_image_tag", true);
        pluginGeneratedSerialDescriptor.j("prize_info_deeplink", true);
        pluginGeneratedSerialDescriptor.j("promoblock_title_override", true);
        pluginGeneratedSerialDescriptor.j("promoblock_subtitle_override", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, h6wVar, h6wVar, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str7 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str8 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new z3b0(i, str, str2, str3, i2, i3, str4, str5, str6, str7, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z3b0 z3b0Var = (z3b0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(z3b0Var.a, "")) {
            b.o(serialDescriptor, 0, z3b0Var.a);
        }
        if (b.F() || !jl40.l(z3b0Var.b, "")) {
            b.o(serialDescriptor, 1, z3b0Var.b);
        }
        if (b.F() || !jl40.l(z3b0Var.c, "")) {
            b.o(serialDescriptor, 2, z3b0Var.c);
        }
        if (b.F() || z3b0Var.d != 0) {
            b.A(3, z3b0Var.d, serialDescriptor);
        }
        if (b.F() || z3b0Var.e != 0) {
            b.A(4, z3b0Var.e, serialDescriptor);
        }
        if (b.F() || !jl40.l(z3b0Var.f, "")) {
            b.o(serialDescriptor, 5, z3b0Var.f);
        }
        if (b.F() || !jl40.l(z3b0Var.g, "")) {
            b.o(serialDescriptor, 6, z3b0Var.g);
        }
        if (b.F() || !jl40.l(z3b0Var.h, "")) {
            b.o(serialDescriptor, 7, z3b0Var.h);
        }
        if (b.F() || !jl40.l(z3b0Var.i, "")) {
            b.o(serialDescriptor, 8, z3b0Var.i);
        }
        if (b.F() || !jl40.l(z3b0Var.j, "")) {
            b.o(serialDescriptor, 9, z3b0Var.j);
        }
        b.c(serialDescriptor);
    }
}
