package ru.yandex.taxi.masstransit.promo.models;

import defpackage.auu0;
import defpackage.b0t;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.orx;
import defpackage.qke;
import defpackage.sjd;
import defpackage.srx;
import defpackage.uc4;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam.CommunicationState", fVar, 14);
        pluginGeneratedSerialDescriptor.j("screen_type", true);
        pluginGeneratedSerialDescriptor.j("appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("bbox", true);
        pluginGeneratedSerialDescriptor.j("user_location", true);
        pluginGeneratedSerialDescriptor.j("user_location_update_time", true);
        pluginGeneratedSerialDescriptor.j("point_a_position", true);
        pluginGeneratedSerialDescriptor.j("fields", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("known_orders", true);
        pluginGeneratedSerialDescriptor.j("zone_name", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("shown_objects_over_map", true);
        pluginGeneratedSerialDescriptor.j("route_selector", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.CommunicationState.o;
        auu0 auu0Var = auu0.a;
        b0t b0tVar = b0t.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(auu0Var), qke.n(h6w.a), qke.n(uc4.Companion.serializer()), qke.n(b0tVar), qke.n(auu0Var), qke.n(b0tVar), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(auu0Var), i3yVarArr[9].getValue(), qke.n(auu0Var), orx.a, i3yVarArr[12].getValue(), qke.n(k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        Integer num;
        srx srxVar;
        Integer num2;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.CommunicationState.o;
        b.getClass();
        srx srxVar2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        MtSummaryCommunicationsParam.CommunicationState.b bVar = null;
        String str5 = null;
        Integer num3 = null;
        uc4 uc4Var = null;
        zzs zzsVar = null;
        String str6 = null;
        zzs zzsVar2 = null;
        boolean z = true;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    srxVar = srxVar2;
                    num2 = num3;
                    mtScreenType = mtScreenType2;
                    str2 = str3;
                    z = false;
                    str3 = str2;
                    num3 = num2;
                    mtScreenType2 = mtScreenType;
                    srxVar2 = srxVar;
                case 0:
                    srxVar = srxVar2;
                    num2 = num3;
                    String str7 = str5;
                    myi myiVar = (myi) i3yVarArr[0].getValue();
                    MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType3 = mtScreenType2;
                    str2 = str3;
                    mtScreenType = (MtSummaryCommunicationsParam.CommunicationState.MtScreenType) b.A(serialDescriptor, 0, myiVar, mtScreenType3);
                    i |= 1;
                    str5 = str7;
                    str3 = str2;
                    num3 = num2;
                    mtScreenType2 = mtScreenType;
                    srxVar2 = srxVar;
                case 1:
                    srxVar = srxVar2;
                    str5 = (String) b.s(serialDescriptor, 1, auu0.a, str5);
                    i |= 2;
                    num3 = num3;
                    srxVar2 = srxVar;
                case 2:
                    srxVar = srxVar2;
                    num3 = (Integer) b.s(serialDescriptor, 2, h6w.a, num3);
                    i |= 4;
                    str5 = str5;
                    srxVar2 = srxVar;
                case 3:
                    str = str5;
                    num = num3;
                    uc4Var = (uc4) b.s(serialDescriptor, 3, uc4.Companion.serializer(), uc4Var);
                    i |= 8;
                    str5 = str;
                    num3 = num;
                case 4:
                    str = str5;
                    num = num3;
                    zzsVar = (zzs) b.s(serialDescriptor, 4, b0t.a, zzsVar);
                    i |= 16;
                    str5 = str;
                    num3 = num;
                case 5:
                    str = str5;
                    num = num3;
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    str5 = str;
                    num3 = num;
                case 6:
                    str = str5;
                    num = num3;
                    zzsVar2 = (zzs) b.s(serialDescriptor, 6, b0t.a, zzsVar2);
                    i |= 64;
                    str5 = str;
                    num3 = num;
                case 7:
                    str = str5;
                    num = num3;
                    list3 = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list3);
                    i |= 128;
                    str5 = str;
                    num3 = num;
                case 8:
                    str = str5;
                    num = num3;
                    str4 = (String) b.s(serialDescriptor, 8, auu0.a, str4);
                    i |= 256;
                    str5 = str;
                    num3 = num;
                case 9:
                    str = str5;
                    num = num3;
                    list = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list);
                    i |= 512;
                    str5 = str;
                    num3 = num;
                case 10:
                    str = str5;
                    num = num3;
                    str3 = (String) b.s(serialDescriptor, 10, auu0.a, str3);
                    i |= 1024;
                    str5 = str;
                    num3 = num;
                case 11:
                    str = str5;
                    num = num3;
                    srxVar2 = (srx) b.A(serialDescriptor, 11, orx.a, srxVar2);
                    i |= 2048;
                    str5 = str;
                    num3 = num;
                case 12:
                    str = str5;
                    num = num3;
                    list2 = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list2);
                    i |= 4096;
                    str5 = str;
                    num3 = num;
                case 13:
                    str = str5;
                    num = num3;
                    bVar = (MtSummaryCommunicationsParam.CommunicationState.b) b.s(serialDescriptor, 13, k.a, bVar);
                    i |= 8192;
                    str5 = str;
                    num3 = num;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        srx srxVar3 = srxVar2;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType4 = mtScreenType2;
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsParam.CommunicationState(i, mtScreenType4, str5, num3, uc4Var, zzsVar, str6, zzsVar2, list3, str4, list, str3, srxVar3, list2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsParam.CommunicationState communicationState = (MtSummaryCommunicationsParam.CommunicationState) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.CommunicationState.o;
        if (b.F() || communicationState.a != MtSummaryCommunicationsParam.CommunicationState.MtScreenType.MASSTRANSIT_SUMMARY) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), communicationState.a);
        }
        if (b.F() || communicationState.b != null) {
            b.g(serialDescriptor, 1, auu0.a, communicationState.b);
        }
        if (b.F() || communicationState.c != null) {
            b.g(serialDescriptor, 2, h6w.a, communicationState.c);
        }
        if (b.F() || communicationState.d != null) {
            b.g(serialDescriptor, 3, uc4.Companion.serializer(), communicationState.d);
        }
        if (b.F() || communicationState.e != null) {
            b.g(serialDescriptor, 4, b0t.a, communicationState.e);
        }
        if (b.F() || communicationState.f != null) {
            b.g(serialDescriptor, 5, auu0.a, communicationState.f);
        }
        if (b.F() || communicationState.g != null) {
            b.g(serialDescriptor, 6, b0t.a, communicationState.g);
        }
        if (b.F() || communicationState.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), communicationState.h);
        }
        if (b.F() || communicationState.i != null) {
            b.g(serialDescriptor, 8, auu0.a, communicationState.i);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(communicationState.j, emptyList)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), communicationState.j);
        }
        if (b.F() || communicationState.k != null) {
            b.g(serialDescriptor, 10, auu0.a, communicationState.k);
        }
        if (b.F() || !jl40.l(communicationState.l, new srx(null, null))) {
            b.e(serialDescriptor, 11, orx.a, communicationState.l);
        }
        if (b.F() || !jl40.l(communicationState.m, emptyList)) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), communicationState.m);
        }
        if (b.F() || communicationState.n != null) {
            b.g(serialDescriptor, 13, k.a, communicationState.n);
        }
        b.c(serialDescriptor);
    }
}
