package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class zoz0 implements uxs {
    public static final zoz0 a;
    private static final SerialDescriptor descriptor;

    static {
        zoz0 zoz0Var = new zoz0();
        a = zoz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.OrderButton", zoz0Var, 3);
        pluginGeneratedSerialDescriptor.j("titles", true);
        pluginGeneratedSerialDescriptor.j("toll_road_selected_subtitle_redesigned_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_selected_summary_subtitle_redesigned_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{jpz0.a, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        soz0.j jVar = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                jVar = (soz0.j) b.A(serialDescriptor, 0, jpz0.a, jVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new soz0.e(i, jVar, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.e eVar = (soz0.e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(eVar.a, new soz0.j(0))) {
            b.e(serialDescriptor, 0, jpz0.a, eVar.a);
        }
        if (b.F() || !jl40.l(eVar.b, "")) {
            b.o(serialDescriptor, 1, eVar.b);
        }
        if (b.F() || !jl40.l(eVar.c, "")) {
            b.o(serialDescriptor, 2, eVar.c);
        }
        b.c(serialDescriptor);
    }
}
