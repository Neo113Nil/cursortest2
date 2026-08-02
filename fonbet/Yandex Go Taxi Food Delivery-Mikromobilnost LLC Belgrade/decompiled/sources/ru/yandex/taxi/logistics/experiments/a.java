package ru.yandex.taxi.logistics.experiments;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment", aVar, 19);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("tariff_classes_translations", true);
        pluginGeneratedSerialDescriptor.j("share_map_button_link", true);
        pluginGeneratedSerialDescriptor.j("summary_source_point_address_prefix_key", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_point_address_prefix_key", true);
        pluginGeneratedSerialDescriptor.j("summary_source_point_subtitle_not_pvz_key", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_point_subtitle_not_pvz_key", true);
        pluginGeneratedSerialDescriptor.j("summary_source_point_subtitle_pvz_key", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_point_subtitle_pvz_key", true);
        pluginGeneratedSerialDescriptor.j("select_pvz_button_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("bubble_unavailable_send_text_key", true);
        pluginGeneratedSerialDescriptor.j("points_title_key", true);
        pluginGeneratedSerialDescriptor.j("point_title_key", true);
        pluginGeneratedSerialDescriptor.j("error_try_another_pvz_key", true);
        pluginGeneratedSerialDescriptor.j("route_switch_buttons", true);
        pluginGeneratedSerialDescriptor.j("initial_zoom_level", true);
        pluginGeneratedSerialDescriptor.j("courier_flow_segment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DeliveryPvzExperiment.u;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), qke.n(auu0Var), auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[16].getValue(), qke.n(nor.a), c.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = DeliveryPvzExperiment.u;
        b.getClass();
        DeliveryPvzExperiment.a aVar = null;
        Float f = null;
        boolean z = true;
        List list = null;
        int i2 = 0;
        boolean z2 = false;
        Map map = null;
        List list2 = null;
        List list3 = null;
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
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i2 |= 2;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                    i2 |= 4;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                    i2 |= 8;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i2 |= 16;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str4 = b.k(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 8);
                    i2 |= 256;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    str7 = b.k(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    str8 = b.k(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 12:
                    i3yVarArr = i3yVarArr2;
                    str9 = b.k(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 13:
                    i3yVarArr = i3yVarArr2;
                    str10 = b.k(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 14:
                    i3yVarArr = i3yVarArr2;
                    str11 = b.k(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                    i3yVarArr2 = i3yVarArr;
                case 15:
                    i3yVarArr = i3yVarArr2;
                    str12 = b.k(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), list);
                    i = 65536;
                    break;
                case 17:
                    i3yVarArr = i3yVarArr2;
                    f = (Float) b.s(serialDescriptor, 17, nor.a, f);
                    i = 131072;
                    break;
                case 18:
                    i3yVarArr = i3yVarArr2;
                    aVar = (DeliveryPvzExperiment.a) b.A(serialDescriptor, 18, c.a, aVar);
                    i = 262144;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i2 |= i;
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new DeliveryPvzExperiment(i2, z2, map, list2, list3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, f, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DeliveryPvzExperiment deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPvzExperiment.u;
        if (b.F() || deliveryPvzExperiment.b) {
            b.n(serialDescriptor, 0, deliveryPvzExperiment.b);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), deliveryPvzExperiment.c);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(deliveryPvzExperiment.d, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), deliveryPvzExperiment.d);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.e, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), deliveryPvzExperiment.e);
        }
        if (b.F() || deliveryPvzExperiment.f != null) {
            b.g(serialDescriptor, 4, auu0.a, deliveryPvzExperiment.f);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.g, "")) {
            b.o(serialDescriptor, 5, deliveryPvzExperiment.g);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.h, "")) {
            b.o(serialDescriptor, 6, deliveryPvzExperiment.h);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.i, "")) {
            b.o(serialDescriptor, 7, deliveryPvzExperiment.i);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.j, "")) {
            b.o(serialDescriptor, 8, deliveryPvzExperiment.j);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.k, "")) {
            b.o(serialDescriptor, 9, deliveryPvzExperiment.k);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.l, "")) {
            b.o(serialDescriptor, 10, deliveryPvzExperiment.l);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.m, "")) {
            b.o(serialDescriptor, 11, deliveryPvzExperiment.m);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.n, "")) {
            b.o(serialDescriptor, 12, deliveryPvzExperiment.n);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.o, "")) {
            b.o(serialDescriptor, 13, deliveryPvzExperiment.o);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.p, "")) {
            b.o(serialDescriptor, 14, deliveryPvzExperiment.p);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.q, "")) {
            b.o(serialDescriptor, 15, deliveryPvzExperiment.q);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.r, emptyList)) {
            b.e(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), deliveryPvzExperiment.r);
        }
        if (b.F() || deliveryPvzExperiment.s != null) {
            b.g(serialDescriptor, 17, nor.a, deliveryPvzExperiment.s);
        }
        if (b.F() || !jl40.l(deliveryPvzExperiment.t, new DeliveryPvzExperiment.a(0))) {
            b.e(serialDescriptor, 18, c.a, deliveryPvzExperiment.t);
        }
        b.c(serialDescriptor);
    }
}
