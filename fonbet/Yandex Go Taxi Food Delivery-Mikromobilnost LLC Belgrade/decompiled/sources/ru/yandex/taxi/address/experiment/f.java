package ru.yandex.taxi.address.experiment;

import com.yandex.messaging.core.net.entities.BackendConfig;
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
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment", fVar, 23);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
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
        pluginGeneratedSerialDescriptor.j("button_add_entrance_key", true);
        pluginGeneratedSerialDescriptor.j("button_add_stop_key", true);
        pluginGeneratedSerialDescriptor.j("missing_arrived_time_key", true);
        pluginGeneratedSerialDescriptor.j("single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("source_single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("destination_single_line_address_title_key", true);
        pluginGeneratedSerialDescriptor.j("missing_travel_time_key", true);
        pluginGeneratedSerialDescriptor.j("loading_travel_time_title_key", true);
        pluginGeneratedSerialDescriptor.j("summary_source_address_style", true);
        pluginGeneratedSerialDescriptor.j("summary_destination_address_style", true);
        pluginGeneratedSerialDescriptor.j("override_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = NewbiesRedesignPointsABExperiment.y;
        kv0 kv0Var = kv0.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), kv0Var, kv0Var, kv0Var, kv0Var, kv0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), auu0Var, auu0Var, i3yVarArr[20].getValue(), i3yVarArr[21].getValue(), i3yVarArr[22].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = NewbiesRedesignPointsABExperiment.y;
        b.getClass();
        List list = null;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = null;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2 = null;
        String str = null;
        boolean z4 = true;
        String str2 = null;
        int i3 = 0;
        boolean z5 = false;
        Map map = null;
        mv0 mv0Var = null;
        mv0 mv0Var2 = null;
        mv0 mv0Var3 = null;
        mv0 mv0Var4 = null;
        mv0 mv0Var5 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i4 = 1;
        String str12 = null;
        String str13 = null;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                case 0:
                    z3 = z4;
                    i3 |= 1;
                    i4 = i4;
                    z5 = b.C(serialDescriptor, 0);
                    z4 = z3;
                case 1:
                    z = z4;
                    z2 = z5;
                    map = (Map) b.A(serialDescriptor, i4, (myi) i3yVarArr[i4].getValue(), map);
                    i3 |= 2;
                    z4 = z;
                    z5 = z2;
                case 2:
                    z = z4;
                    z2 = z5;
                    mv0Var = (mv0) b.A(serialDescriptor, 2, kv0.a, mv0Var);
                    i3 |= 4;
                    z4 = z;
                    z5 = z2;
                case 3:
                    z = z4;
                    z2 = z5;
                    mv0Var2 = (mv0) b.A(serialDescriptor, 3, kv0.a, mv0Var2);
                    i3 |= 8;
                    z4 = z;
                    z5 = z2;
                case 4:
                    z = z4;
                    z2 = z5;
                    mv0Var3 = (mv0) b.A(serialDescriptor, 4, kv0.a, mv0Var3);
                    i3 |= 16;
                    z4 = z;
                    z5 = z2;
                case 5:
                    z = z4;
                    z2 = z5;
                    mv0Var4 = (mv0) b.A(serialDescriptor, 5, kv0.a, mv0Var4);
                    i3 |= 32;
                    z4 = z;
                    z5 = z2;
                case 6:
                    z = z4;
                    z2 = z5;
                    mv0Var5 = (mv0) b.A(serialDescriptor, 6, kv0.a, mv0Var5);
                    i3 |= 64;
                    z4 = z;
                    z5 = z2;
                case 7:
                    z3 = z4;
                    str3 = b.k(serialDescriptor, 7);
                    i3 |= 128;
                    z4 = z3;
                case 8:
                    z3 = z4;
                    str4 = b.k(serialDescriptor, 8);
                    i3 |= 256;
                    z4 = z3;
                case 9:
                    z3 = z4;
                    str5 = b.k(serialDescriptor, 9);
                    i3 |= 512;
                    z4 = z3;
                case 10:
                    z3 = z4;
                    str6 = b.k(serialDescriptor, 10);
                    i3 |= 1024;
                    z4 = z3;
                case 11:
                    z3 = z4;
                    str7 = b.k(serialDescriptor, 11);
                    i3 |= 2048;
                    z4 = z3;
                case 12:
                    z3 = z4;
                    str8 = b.k(serialDescriptor, 12);
                    i3 |= 4096;
                    z4 = z3;
                case 13:
                    z3 = z4;
                    str9 = b.k(serialDescriptor, 13);
                    i3 |= 8192;
                    z4 = z3;
                case 14:
                    z3 = z4;
                    str10 = b.k(serialDescriptor, 14);
                    i3 |= 16384;
                    z4 = z3;
                case 15:
                    z3 = z4;
                    str11 = b.k(serialDescriptor, 15);
                    i2 = 32768;
                    i3 |= i2;
                    z4 = z3;
                case 16:
                    z = z4;
                    z2 = z5;
                    str2 = (String) b.s(serialDescriptor, 16, auu0.a, str2);
                    i = 65536;
                    i3 |= i;
                    z4 = z;
                    z5 = z2;
                case 17:
                    z = z4;
                    z2 = z5;
                    str = (String) b.s(serialDescriptor, 17, auu0.a, str);
                    i = 131072;
                    i3 |= i;
                    z4 = z;
                    z5 = z2;
                case 18:
                    z3 = z4;
                    str12 = b.k(serialDescriptor, 18);
                    i2 = 262144;
                    i3 |= i2;
                    z4 = z3;
                case 19:
                    z3 = z4;
                    str13 = b.k(serialDescriptor, 19);
                    i2 = 524288;
                    i3 |= i2;
                    z4 = z3;
                case 20:
                    z = z4;
                    z2 = z5;
                    summaryAddressStyle2 = (NewbiesRedesignPointsABExperiment.SummaryAddressStyle) b.A(serialDescriptor, 20, (myi) i3yVarArr[20].getValue(), summaryAddressStyle2);
                    i = 1048576;
                    i3 |= i;
                    z4 = z;
                    z5 = z2;
                case 21:
                    z = z4;
                    z2 = z5;
                    summaryAddressStyle = (NewbiesRedesignPointsABExperiment.SummaryAddressStyle) b.A(serialDescriptor, 21, (myi) i3yVarArr[21].getValue(), summaryAddressStyle);
                    i = 2097152;
                    i3 |= i;
                    z4 = z;
                    z5 = z2;
                case 22:
                    z = z4;
                    z2 = z5;
                    list = (List) b.A(serialDescriptor, 22, (myi) i3yVarArr[22].getValue(), list);
                    i = SelfTester_JCP.ENCRYPT_CBC;
                    i3 |= i;
                    z4 = z;
                    z5 = z2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new NewbiesRedesignPointsABExperiment(i3, z5, map, mv0Var, mv0Var2, mv0Var3, mv0Var4, mv0Var5, str3, str4, str5, str6, str7, str8, str9, str10, str11, str2, str, str12, str13, summaryAddressStyle2, summaryAddressStyle, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        NewbiesRedesignPointsABExperiment newbiesRedesignPointsABExperiment = (NewbiesRedesignPointsABExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = NewbiesRedesignPointsABExperiment.y;
        if (b.F() || newbiesRedesignPointsABExperiment.b) {
            b.n(serialDescriptor, 0, newbiesRedesignPointsABExperiment.b);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), newbiesRedesignPointsABExperiment.c);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.d, new mv0(0))) {
            b.e(serialDescriptor, 2, kv0.a, newbiesRedesignPointsABExperiment.d);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.e, new mv0(0))) {
            b.e(serialDescriptor, 3, kv0.a, newbiesRedesignPointsABExperiment.e);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.f, new mv0(0))) {
            b.e(serialDescriptor, 4, kv0.a, newbiesRedesignPointsABExperiment.f);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.g, new mv0(0))) {
            b.e(serialDescriptor, 5, kv0.a, newbiesRedesignPointsABExperiment.g);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.h, new mv0(0))) {
            b.e(serialDescriptor, 6, kv0.a, newbiesRedesignPointsABExperiment.h);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.i, "")) {
            b.o(serialDescriptor, 7, newbiesRedesignPointsABExperiment.i);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.j, "")) {
            b.o(serialDescriptor, 8, newbiesRedesignPointsABExperiment.j);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.k, "")) {
            b.o(serialDescriptor, 9, newbiesRedesignPointsABExperiment.k);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.l, "")) {
            b.o(serialDescriptor, 10, newbiesRedesignPointsABExperiment.l);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.m, "")) {
            b.o(serialDescriptor, 11, newbiesRedesignPointsABExperiment.m);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.n, "")) {
            b.o(serialDescriptor, 12, newbiesRedesignPointsABExperiment.n);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.o, "")) {
            b.o(serialDescriptor, 13, newbiesRedesignPointsABExperiment.o);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.p, "")) {
            b.o(serialDescriptor, 14, newbiesRedesignPointsABExperiment.p);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.q, "")) {
            b.o(serialDescriptor, 15, newbiesRedesignPointsABExperiment.q);
        }
        if (b.F() || newbiesRedesignPointsABExperiment.r != null) {
            b.g(serialDescriptor, 16, auu0.a, newbiesRedesignPointsABExperiment.r);
        }
        if (b.F() || newbiesRedesignPointsABExperiment.s != null) {
            b.g(serialDescriptor, 17, auu0.a, newbiesRedesignPointsABExperiment.s);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.t, "")) {
            b.o(serialDescriptor, 18, newbiesRedesignPointsABExperiment.t);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.u, "")) {
            b.o(serialDescriptor, 19, newbiesRedesignPointsABExperiment.u);
        }
        if (b.F() || newbiesRedesignPointsABExperiment.v != NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY) {
            b.e(serialDescriptor, 20, (KSerializer) i3yVarArr[20].getValue(), newbiesRedesignPointsABExperiment.v);
        }
        if (b.F() || newbiesRedesignPointsABExperiment.w != NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY) {
            b.e(serialDescriptor, 21, (KSerializer) i3yVarArr[21].getValue(), newbiesRedesignPointsABExperiment.w);
        }
        if (b.F() || !jl40.l(newbiesRedesignPointsABExperiment.x, EmptyList.a)) {
            b.e(serialDescriptor, 22, (KSerializer) i3yVarArr[22].getValue(), newbiesRedesignPointsABExperiment.x);
        }
        b.c(serialDescriptor);
    }
}
