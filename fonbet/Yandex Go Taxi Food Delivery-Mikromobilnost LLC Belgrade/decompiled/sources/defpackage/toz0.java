package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class toz0 implements uxs {
    public static final toz0 a;
    private static final SerialDescriptor descriptor;

    static {
        toz0 toz0Var = new toz0();
        a = toz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.ListItems", toz0Var, 10);
        pluginGeneratedSerialDescriptor.j("free_road_title_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_title_key", true);
        pluginGeneratedSerialDescriptor.j("free_road_title_default_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_title_default_key", true);
        pluginGeneratedSerialDescriptor.j("road_time_format_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_manual_payment_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_title_with_unknown_toll_road_fee_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_subtitle_redesigned_key", true);
        pluginGeneratedSerialDescriptor.j("free_road_subtitle_redesigned_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
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
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str9 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str10 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new soz0.b(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.b bVar = (soz0.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, "")) {
            b.o(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, "")) {
            b.o(serialDescriptor, 2, bVar.c);
        }
        if (b.F() || !jl40.l(bVar.d, "")) {
            b.o(serialDescriptor, 3, bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, "")) {
            b.o(serialDescriptor, 4, bVar.e);
        }
        if (b.F() || !jl40.l(bVar.f, "")) {
            b.o(serialDescriptor, 5, bVar.f);
        }
        if (b.F() || !jl40.l(bVar.g, "")) {
            b.o(serialDescriptor, 6, bVar.g);
        }
        if (b.F() || !jl40.l(bVar.h, "")) {
            b.o(serialDescriptor, 7, bVar.h);
        }
        if (b.F() || !jl40.l(bVar.i, "")) {
            b.o(serialDescriptor, 8, bVar.i);
        }
        if (b.F() || !jl40.l(bVar.j, "")) {
            b.o(serialDescriptor, 9, bVar.j);
        }
        b.c(serialDescriptor);
    }
}
