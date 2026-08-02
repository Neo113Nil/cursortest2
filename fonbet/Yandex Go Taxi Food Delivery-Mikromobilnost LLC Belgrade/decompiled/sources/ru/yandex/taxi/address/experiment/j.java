package ru.yandex.taxi.address.experiment;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kv0;
import defpackage.mv0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class j implements uxs {
    public static final j a;
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment.OverrideRule.TariffOverride", jVar, 22);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("source_icon", true);
        pluginGeneratedSerialDescriptor.j("destination_icon", true);
        pluginGeneratedSerialDescriptor.j("single_line_address_icon", true);
        pluginGeneratedSerialDescriptor.j("focused_source_icon", true);
        pluginGeneratedSerialDescriptor.j("focused_destination_icon", true);
        pluginGeneratedSerialDescriptor.j("route_selector_source_title_key", true);
        pluginGeneratedSerialDescriptor.j("route_selector_destination_title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_source_title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_title_key", true);
        pluginGeneratedSerialDescriptor.j("missing_arrived_time_key", true);
        pluginGeneratedSerialDescriptor.j("single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("source_single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("destination_single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("button_add_stop_key", true);
        pluginGeneratedSerialDescriptor.j("button_add_entrance_key", true);
        pluginGeneratedSerialDescriptor.j("missing_travel_time_key", true);
        pluginGeneratedSerialDescriptor.j("loading_travel_time_title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_address_style", true);
        pluginGeneratedSerialDescriptor.j("summary_source_address_style", true);
        pluginGeneratedSerialDescriptor.j("hide_destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = k.w;
        kv0 kv0Var = kv0.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(kv0Var), qke.n(kv0Var), qke.n(kv0Var), qke.n(kv0Var), qke.n(kv0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[19].getValue()), qke.n((KSerializer) i3yVarArr[20].getValue()), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        List list;
        String str4;
        String str5;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = k.w;
        b.getClass();
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        String str9 = null;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = null;
        int i2 = 0;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2 = null;
        boolean z = true;
        List list2 = null;
        mv0 mv0Var = null;
        mv0 mv0Var2 = null;
        mv0 mv0Var3 = null;
        mv0 mv0Var4 = null;
        mv0 mv0Var5 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str3 = str6;
                    list = list2;
                    z = false;
                    str8 = str8;
                    list2 = list;
                    str6 = str3;
                case 0:
                    str3 = str6;
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list2);
                    i2 |= 1;
                    mv0Var = mv0Var;
                    str8 = str8;
                    str7 = str7;
                    list2 = list;
                    str6 = str3;
                case 1:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    mv0Var = (mv0) b.s(serialDescriptor, 1, kv0.a, mv0Var);
                    i2 |= 2;
                    mv0Var2 = mv0Var2;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 2:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    mv0Var2 = (mv0) b.s(serialDescriptor, 2, kv0.a, mv0Var2);
                    i2 |= 4;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 3:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    mv0Var3 = (mv0) b.s(serialDescriptor, 3, kv0.a, mv0Var3);
                    i2 |= 8;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 4:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    mv0Var4 = (mv0) b.s(serialDescriptor, 4, kv0.a, mv0Var4);
                    i2 |= 16;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 5:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    mv0Var5 = (mv0) b.s(serialDescriptor, 5, kv0.a, mv0Var5);
                    i2 |= 32;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 6:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    str16 = (String) b.s(serialDescriptor, 6, auu0.a, str16);
                    i2 |= 64;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 7:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    str17 = (String) b.s(serialDescriptor, 7, auu0.a, str17);
                    i2 |= 128;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 8:
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    str18 = (String) b.s(serialDescriptor, 8, auu0.a, str18);
                    i2 |= 256;
                    str8 = str5;
                    str7 = str4;
                    str6 = str3;
                case 9:
                    str3 = str6;
                    str4 = str7;
                    str8 = (String) b.s(serialDescriptor, 9, auu0.a, str8);
                    i2 |= 512;
                    str7 = str4;
                    str6 = str3;
                case 10:
                    str3 = str6;
                    str7 = (String) b.s(serialDescriptor, 10, auu0.a, str7);
                    i2 |= 1024;
                    str8 = str8;
                    str6 = str3;
                case 11:
                    str = str7;
                    str2 = str8;
                    str6 = (String) b.s(serialDescriptor, 11, auu0.a, str6);
                    i2 |= 2048;
                    str8 = str2;
                    str7 = str;
                case 12:
                    str = str7;
                    str2 = str8;
                    str9 = (String) b.s(serialDescriptor, 12, auu0.a, str9);
                    i2 |= 4096;
                    str8 = str2;
                    str7 = str;
                case 13:
                    str = str7;
                    str2 = str8;
                    str10 = (String) b.s(serialDescriptor, 13, auu0.a, str10);
                    i2 |= 8192;
                    str8 = str2;
                    str7 = str;
                case 14:
                    str = str7;
                    str2 = str8;
                    str11 = (String) b.s(serialDescriptor, 14, auu0.a, str11);
                    i2 |= 16384;
                    str8 = str2;
                    str7 = str;
                case 15:
                    str = str7;
                    str2 = str8;
                    str12 = (String) b.s(serialDescriptor, 15, auu0.a, str12);
                    i = 32768;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 16:
                    str = str7;
                    str2 = str8;
                    str13 = (String) b.s(serialDescriptor, 16, auu0.a, str13);
                    i = 65536;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 17:
                    str = str7;
                    str2 = str8;
                    str14 = (String) b.s(serialDescriptor, 17, auu0.a, str14);
                    i = 131072;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 18:
                    str = str7;
                    str2 = str8;
                    str15 = (String) b.s(serialDescriptor, 18, auu0.a, str15);
                    i = 262144;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 19:
                    str = str7;
                    str2 = str8;
                    summaryAddressStyle2 = (NewbiesRedesignPointsABExperiment.SummaryAddressStyle) b.s(serialDescriptor, 19, (myi) i3yVarArr[19].getValue(), summaryAddressStyle2);
                    i = 524288;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 20:
                    str = str7;
                    str2 = str8;
                    summaryAddressStyle = (NewbiesRedesignPointsABExperiment.SummaryAddressStyle) b.s(serialDescriptor, 20, (myi) i3yVarArr[20].getValue(), summaryAddressStyle);
                    i = 1048576;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                case 21:
                    str2 = str8;
                    str = str7;
                    bool = (Boolean) b.s(serialDescriptor, 21, z96.a, bool);
                    i = 2097152;
                    i2 |= i;
                    str8 = str2;
                    str7 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str19 = str6;
        String str20 = str8;
        List list3 = list2;
        mv0 mv0Var6 = mv0Var;
        mv0 mv0Var7 = mv0Var2;
        b.c(serialDescriptor);
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle3 = summaryAddressStyle2;
        return new k(i2, list3, mv0Var6, mv0Var7, mv0Var3, mv0Var4, mv0Var5, str16, str17, str18, str20, str7, str19, str9, str10, str11, str12, str13, str14, str15, summaryAddressStyle3, summaryAddressStyle, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k kVar = (k) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = k.w;
        if (b.F() || !jl40.l(kVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), kVar.a);
        }
        if (b.F() || kVar.b != null) {
            b.g(serialDescriptor, 1, kv0.a, kVar.b);
        }
        if (b.F() || kVar.c != null) {
            b.g(serialDescriptor, 2, kv0.a, kVar.c);
        }
        if (b.F() || kVar.d != null) {
            b.g(serialDescriptor, 3, kv0.a, kVar.d);
        }
        if (b.F() || kVar.e != null) {
            b.g(serialDescriptor, 4, kv0.a, kVar.e);
        }
        if (b.F() || kVar.f != null) {
            b.g(serialDescriptor, 5, kv0.a, kVar.f);
        }
        if (b.F() || kVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, kVar.g);
        }
        if (b.F() || kVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, kVar.h);
        }
        if (b.F() || kVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, kVar.i);
        }
        if (b.F() || kVar.j != null) {
            b.g(serialDescriptor, 9, auu0.a, kVar.j);
        }
        if (b.F() || kVar.k != null) {
            b.g(serialDescriptor, 10, auu0.a, kVar.k);
        }
        if (b.F() || kVar.l != null) {
            b.g(serialDescriptor, 11, auu0.a, kVar.l);
        }
        if (b.F() || kVar.m != null) {
            b.g(serialDescriptor, 12, auu0.a, kVar.m);
        }
        if (b.F() || kVar.n != null) {
            b.g(serialDescriptor, 13, auu0.a, kVar.n);
        }
        if (b.F() || kVar.o != null) {
            b.g(serialDescriptor, 14, auu0.a, kVar.o);
        }
        if (b.F() || kVar.p != null) {
            b.g(serialDescriptor, 15, auu0.a, kVar.p);
        }
        if (b.F() || kVar.q != null) {
            b.g(serialDescriptor, 16, auu0.a, kVar.q);
        }
        if (b.F() || kVar.r != null) {
            b.g(serialDescriptor, 17, auu0.a, kVar.r);
        }
        if (b.F() || kVar.s != null) {
            b.g(serialDescriptor, 18, auu0.a, kVar.s);
        }
        if (b.F() || kVar.t != null) {
            b.g(serialDescriptor, 19, (KSerializer) i3yVarArr[19].getValue(), kVar.t);
        }
        if (b.F() || kVar.u != null) {
            b.g(serialDescriptor, 20, (KSerializer) i3yVarArr[20].getValue(), kVar.u);
        }
        if (b.F() || kVar.v != null) {
            b.g(serialDescriptor, 21, z96.a, kVar.v);
        }
        b.c(serialDescriptor);
    }
}
