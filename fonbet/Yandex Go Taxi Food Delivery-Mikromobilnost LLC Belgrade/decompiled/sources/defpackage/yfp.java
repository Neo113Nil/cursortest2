package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class yfp implements uxs {
    public static final yfp a;
    private static final SerialDescriptor descriptor;

    static {
        yfp yfpVar = new yfp();
        a = yfpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.experiment.FavoriteEditSettingsExperiment", yfpVar, 11);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("hide_entrance", true);
        pluginGeneratedSerialDescriptor.j("hide_delivery_section", true);
        pluginGeneratedSerialDescriptor.j("hide_select_as_destination", true);
        pluginGeneratedSerialDescriptor.j("hide_editing_title", true);
        pluginGeneratedSerialDescriptor.j("hide_address_subtitle", true);
        pluginGeneratedSerialDescriptor.j("autoback_after_saving", true);
        pluginGeneratedSerialDescriptor.j("edit_favorite_empty_name_error_tk", true);
        pluginGeneratedSerialDescriptor.j("edit_favorite_driver_comment_title_tk", true);
        pluginGeneratedSerialDescriptor.j("edit_favorite_courier_comment_title_tk", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = agp.m;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = agp.m;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z4 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z5 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z6 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z7 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z8 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str2 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str3 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new agp(i, z2, map, z3, z4, z5, z6, z7, z8, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        agp agpVar = (agp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = agp.m;
        if (b.F() || agpVar.b) {
            b.n(serialDescriptor, 0, agpVar.b);
        }
        if (b.F() || !jl40.l(agpVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), agpVar.c);
        }
        if (b.F() || agpVar.d) {
            b.n(serialDescriptor, 2, agpVar.d);
        }
        if (b.F() || agpVar.e) {
            b.n(serialDescriptor, 3, agpVar.e);
        }
        if (b.F() || agpVar.f) {
            b.n(serialDescriptor, 4, agpVar.f);
        }
        if (b.F() || agpVar.g) {
            b.n(serialDescriptor, 5, agpVar.g);
        }
        if (b.F() || agpVar.h) {
            b.n(serialDescriptor, 6, agpVar.h);
        }
        if (b.F() || agpVar.i) {
            b.n(serialDescriptor, 7, agpVar.i);
        }
        if (b.F() || !jl40.l(agpVar.j, "")) {
            b.o(serialDescriptor, 8, agpVar.j);
        }
        if (b.F() || !jl40.l(agpVar.k, "")) {
            b.o(serialDescriptor, 9, agpVar.k);
        }
        if (b.F() || !jl40.l(agpVar.l, "")) {
            b.o(serialDescriptor, 10, agpVar.l);
        }
        b.c(serialDescriptor);
    }
}
