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
public final /* synthetic */ class wuh implements uxs {
    public static final wuh a;
    private static final SerialDescriptor descriptor;

    static {
        wuh wuhVar = new wuh();
        a = wuhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.DeliveryAddressCopyParseExperiment", wuhVar, 16);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("title_form_name_key", true);
        pluginGeneratedSerialDescriptor.j("title_cancel_button_key", true);
        pluginGeneratedSerialDescriptor.j("title_success_button_key", true);
        pluginGeneratedSerialDescriptor.j("title_apartment_number_key", true);
        pluginGeneratedSerialDescriptor.j("title_porch_number_key", true);
        pluginGeneratedSerialDescriptor.j("title_floor_number_key", true);
        pluginGeneratedSerialDescriptor.j("title_doorphone_number_key", true);
        pluginGeneratedSerialDescriptor.j("title_comment_key", true);
        pluginGeneratedSerialDescriptor.j("title_contact_key", true);
        pluginGeneratedSerialDescriptor.j("title_source_contact_key", true);
        pluginGeneratedSerialDescriptor.j("title_original_text_key", true);
        pluginGeneratedSerialDescriptor.j("subtitle_original_text_key", true);
        pluginGeneratedSerialDescriptor.j("contacts_picker_main_title_recipient_key", true);
        pluginGeneratedSerialDescriptor.j("contacts_picker_main_title_sender_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yuh.r;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = yuh.r;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
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
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
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
                case 10:
                    str9 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    str10 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    str11 = b.k(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    str12 = b.k(serialDescriptor, 13);
                    i |= 8192;
                    break;
                case 14:
                    str13 = b.k(serialDescriptor, 14);
                    i |= 16384;
                    break;
                case 15:
                    str14 = b.k(serialDescriptor, 15);
                    i |= 32768;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new yuh(i, z2, map, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yuh yuhVar = (yuh) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = yuh.r;
        if (b.F() || yuhVar.b) {
            b.n(serialDescriptor, 0, yuhVar.b);
        }
        if (b.F() || !jl40.l(yuhVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), yuhVar.c);
        }
        if (b.F() || !jl40.l(yuhVar.d, "")) {
            b.o(serialDescriptor, 2, yuhVar.d);
        }
        if (b.F() || !jl40.l(yuhVar.e, "")) {
            b.o(serialDescriptor, 3, yuhVar.e);
        }
        if (b.F() || !jl40.l(yuhVar.f, "")) {
            b.o(serialDescriptor, 4, yuhVar.f);
        }
        if (b.F() || !jl40.l(yuhVar.g, "")) {
            b.o(serialDescriptor, 5, yuhVar.g);
        }
        if (b.F() || !jl40.l(yuhVar.h, "")) {
            b.o(serialDescriptor, 6, yuhVar.h);
        }
        if (b.F() || !jl40.l(yuhVar.i, "")) {
            b.o(serialDescriptor, 7, yuhVar.i);
        }
        if (b.F() || !jl40.l(yuhVar.j, "")) {
            b.o(serialDescriptor, 8, yuhVar.j);
        }
        if (b.F() || !jl40.l(yuhVar.k, "")) {
            b.o(serialDescriptor, 9, yuhVar.k);
        }
        if (b.F() || !jl40.l(yuhVar.l, "")) {
            b.o(serialDescriptor, 10, yuhVar.l);
        }
        if (b.F() || !jl40.l(yuhVar.m, "")) {
            b.o(serialDescriptor, 11, yuhVar.m);
        }
        if (b.F() || !jl40.l(yuhVar.n, "")) {
            b.o(serialDescriptor, 12, yuhVar.n);
        }
        if (b.F() || !jl40.l(yuhVar.o, "")) {
            b.o(serialDescriptor, 13, yuhVar.o);
        }
        if (b.F() || !jl40.l(yuhVar.p, "")) {
            b.o(serialDescriptor, 14, yuhVar.p);
        }
        if (b.F() || !jl40.l(yuhVar.q, "")) {
            b.o(serialDescriptor, 15, yuhVar.q);
        }
        b.c(serialDescriptor);
    }
}
