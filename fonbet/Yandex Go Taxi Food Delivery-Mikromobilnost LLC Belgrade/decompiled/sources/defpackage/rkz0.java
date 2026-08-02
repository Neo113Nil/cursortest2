package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class rkz0 implements uxs {
    public static final rkz0 a;
    private static final SerialDescriptor descriptor;

    static {
        rkz0 rkz0Var = new rkz0();
        a = rkz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.ToggleDto", rkz0Var, 8);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("disabled_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("prohibited_payment_method_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("prohibited_alternative_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("lead_image_tag", true);
        pluginGeneratedSerialDescriptor.j("contacts_trail_image_tag", true);
        pluginGeneratedSerialDescriptor.j("summary_trail_image_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
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
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
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
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) b.s(serialDescriptor, 6, auu0.a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) b.s(serialDescriptor, 7, auu0.a, str8);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new tkz0(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tkz0 tkz0Var = (tkz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(tkz0Var.a, "")) {
            b.o(serialDescriptor, 0, tkz0Var.a);
        }
        if (b.F() || tkz0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, tkz0Var.b);
        }
        if (b.F() || !jl40.l(tkz0Var.c, "")) {
            b.o(serialDescriptor, 2, tkz0Var.c);
        }
        if (b.F() || !jl40.l(tkz0Var.d, "")) {
            b.o(serialDescriptor, 3, tkz0Var.d);
        }
        if (b.F() || !jl40.l(tkz0Var.e, "")) {
            b.o(serialDescriptor, 4, tkz0Var.e);
        }
        if (b.F() || tkz0Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, tkz0Var.f);
        }
        if (b.F() || tkz0Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, tkz0Var.g);
        }
        if (b.F() || tkz0Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, tkz0Var.h);
        }
        b.c(serialDescriptor);
    }
}
