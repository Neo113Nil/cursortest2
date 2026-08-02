package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class rvd implements uxs {
    public static final rvd a;
    private static final SerialDescriptor descriptor;

    static {
        rvd rvdVar = new rvd();
        a = rvdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.CompoundSelectItemDto", rvdVar, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_popup", true);
        pluginGeneratedSerialDescriptor.j("title_on_label", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("trail_placeholder", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title_selected", true);
        pluginGeneratedSerialDescriptor.j("cancel_button", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(c7v.a);
        KSerializer n2 = qke.n(ik4.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, n, auu0Var, auu0Var, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        kk4 kk4Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        n7v n7vVar = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
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
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    n7vVar = (n7v) b.s(serialDescriptor, 5, c7v.a, n7vVar);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str7 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    kk4Var = (kk4) b.s(serialDescriptor, 8, ik4.a, kk4Var);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new tvd(i, str, str2, str3, str4, str5, n7vVar, str6, str7, kk4Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tvd tvdVar = (tvd) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(tvdVar.a, "")) {
            b.o(serialDescriptor, 0, tvdVar.a);
        }
        if (b.F() || !jl40.l(tvdVar.b, "")) {
            b.o(serialDescriptor, 1, tvdVar.b);
        }
        if (b.F() || !jl40.l(tvdVar.c, "")) {
            b.o(serialDescriptor, 2, tvdVar.c);
        }
        if (b.F() || !jl40.l(tvdVar.d, "")) {
            b.o(serialDescriptor, 3, tvdVar.d);
        }
        if (b.F() || !jl40.l(tvdVar.e, "")) {
            b.o(serialDescriptor, 4, tvdVar.e);
        }
        if (b.F() || tvdVar.f != null) {
            b.g(serialDescriptor, 5, c7v.a, tvdVar.f);
        }
        if (b.F() || !jl40.l(tvdVar.g, "")) {
            b.o(serialDescriptor, 6, tvdVar.g);
        }
        if (b.F() || !jl40.l(tvdVar.h, "")) {
            b.o(serialDescriptor, 7, tvdVar.h);
        }
        if (b.F() || tvdVar.i != null) {
            b.g(serialDescriptor, 8, ik4.a, tvdVar.i);
        }
        b.c(serialDescriptor);
    }
}
