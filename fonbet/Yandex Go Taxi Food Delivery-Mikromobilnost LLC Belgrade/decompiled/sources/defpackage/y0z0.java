package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.communications.api.dto.ticket.a;
import ru.yandex.taxi.communications.api.dto.ticket.f;
import ru.yandex.taxi.communications.api.dto.y0;

/* loaded from: classes9.dex */
public final /* synthetic */ class y0z0 implements uxs {
    public static final y0z0 a;
    private static final SerialDescriptor descriptor;

    static {
        y0z0 y0z0Var = new y0z0();
        a = y0z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.Ticket", y0z0Var, 19);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        pluginGeneratedSerialDescriptor.j("promotion", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("policy_text", true);
        pluginGeneratedSerialDescriptor.j("top_asset", true);
        pluginGeneratedSerialDescriptor.j("timer", true);
        pluginGeneratedSerialDescriptor.j("allow_backward_action", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("on_show_features", true);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("bottom_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = a.u;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        y0 y0Var = y0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(vmt.a), auu0Var, z96Var, z96Var, i3yVarArr[6].getValue(), i3yVarArr[7].getValue(), y0Var, y0Var, y0Var, f.a, qke.n(v2z0.a), z96Var, auu0Var, i3yVarArr[15].getValue(), i3yVarArr[16].getValue(), qke.n(zpx.a), i3yVarArr[18].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Calendar calendar;
        TicketTopAsset ticketTopAsset;
        Map map;
        int i;
        Map map2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a.u;
        b.getClass();
        TicketTopAsset ticketTopAsset2 = null;
        TypedContentWidget typedContentWidget = null;
        TypedContentWidget typedContentWidget2 = null;
        TypedContentWidget typedContentWidget3 = null;
        z2z0 z2z0Var = null;
        TicketMode ticketMode = null;
        int i2 = 0;
        Set set = null;
        Map map3 = null;
        Calendar calendar2 = null;
        List list = null;
        iqx iqxVar = null;
        List list2 = null;
        Set set2 = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        boolean z4 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    calendar = calendar2;
                    z = false;
                    map3 = map3;
                    calendar2 = calendar;
                case 0:
                    ticketTopAsset = ticketTopAsset2;
                    calendar = calendar2;
                    str = b.k(serialDescriptor, 0);
                    i2 |= 1;
                    map3 = map3;
                    ticketTopAsset2 = ticketTopAsset;
                    calendar2 = calendar;
                case 1:
                    ticketTopAsset = ticketTopAsset2;
                    calendar = calendar2;
                    map3 = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map3);
                    i2 |= 2;
                    ticketTopAsset2 = ticketTopAsset;
                    calendar2 = calendar;
                case 2:
                    calendar2 = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar2);
                    i2 |= 4;
                    map3 = map3;
                    ticketTopAsset2 = ticketTopAsset2;
                case 3:
                    map2 = map3;
                    str2 = b.k(serialDescriptor, 3);
                    i2 |= 8;
                    map3 = map2;
                case 4:
                    map2 = map3;
                    z2 = b.C(serialDescriptor, 4);
                    i2 |= 16;
                    map3 = map2;
                case 5:
                    map2 = map3;
                    z4 = b.C(serialDescriptor, 5);
                    i2 |= 32;
                    map3 = map2;
                case 6:
                    map = map3;
                    calendar = calendar2;
                    set2 = (Set) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), set2);
                    i2 |= 64;
                    map3 = map;
                    calendar2 = calendar;
                case 7:
                    map = map3;
                    calendar = calendar2;
                    ticketMode = (TicketMode) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), ticketMode);
                    i2 |= 128;
                    map3 = map;
                    calendar2 = calendar;
                case 8:
                    map = map3;
                    calendar = calendar2;
                    typedContentWidget3 = (TypedContentWidget) b.A(serialDescriptor, 8, y0.a, typedContentWidget3);
                    i2 |= 256;
                    map3 = map;
                    calendar2 = calendar;
                case 9:
                    map = map3;
                    calendar = calendar2;
                    typedContentWidget2 = (TypedContentWidget) b.A(serialDescriptor, 9, y0.a, typedContentWidget2);
                    i2 |= 512;
                    map3 = map;
                    calendar2 = calendar;
                case 10:
                    map = map3;
                    calendar = calendar2;
                    typedContentWidget = (TypedContentWidget) b.A(serialDescriptor, 10, y0.a, typedContentWidget);
                    i2 |= 1024;
                    map3 = map;
                    calendar2 = calendar;
                case 11:
                    map = map3;
                    calendar = calendar2;
                    ticketTopAsset2 = (TicketTopAsset) b.A(serialDescriptor, 11, f.a, ticketTopAsset2);
                    i2 |= 2048;
                    map3 = map;
                    calendar2 = calendar;
                case 12:
                    map = map3;
                    calendar = calendar2;
                    z2z0Var = (z2z0) b.s(serialDescriptor, 12, v2z0.a, z2z0Var);
                    i2 |= 4096;
                    map3 = map;
                    calendar2 = calendar;
                case 13:
                    map2 = map3;
                    z3 = b.C(serialDescriptor, 13);
                    i2 |= 8192;
                    map3 = map2;
                case 14:
                    map2 = map3;
                    str3 = b.k(serialDescriptor, 14);
                    i2 |= 16384;
                    map3 = map2;
                case 15:
                    map = map3;
                    calendar = calendar2;
                    set = (Set) b.A(serialDescriptor, 15, (myi) i3yVarArr[15].getValue(), set);
                    i = 32768;
                    i2 |= i;
                    map3 = map;
                    calendar2 = calendar;
                case 16:
                    map = map3;
                    calendar = calendar2;
                    list = (List) b.A(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    map3 = map;
                    calendar2 = calendar;
                case 17:
                    map = map3;
                    calendar = calendar2;
                    iqxVar = (iqx) b.s(serialDescriptor, 17, zpx.a, iqxVar);
                    i = 131072;
                    i2 |= i;
                    map3 = map;
                    calendar2 = calendar;
                case 18:
                    map = map3;
                    calendar = calendar2;
                    list2 = (List) b.A(serialDescriptor, 18, (myi) i3yVarArr[18].getValue(), list2);
                    i = 262144;
                    i2 |= i;
                    map3 = map;
                    calendar2 = calendar;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        Calendar calendar3 = calendar2;
        b.c(serialDescriptor);
        List list3 = list2;
        return new a(i2, str, map3, calendar3, str2, z2, z4, set2, ticketMode, typedContentWidget3, typedContentWidget2, typedContentWidget, ticketTopAsset2, z2z0Var, z3, str3, set, list, iqxVar, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a aVar = (a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = a.u;
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 0, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 2, vmt.a, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 3, aVar.e);
        }
        if (b.F() || aVar.f) {
            b.n(serialDescriptor, 4, aVar.f);
        }
        if (b.F() || !aVar.g) {
            b.n(serialDescriptor, 5, aVar.g);
        }
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(aVar.h, emptySet)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), aVar.h);
        }
        if (b.F() || aVar.i != TicketMode.TICKET) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), aVar.i);
        }
        if (b.F() || !jl40.l(aVar.j, new TypedContentWidget(null, null, 15))) {
            b.e(serialDescriptor, 8, y0.a, aVar.j);
        }
        if (b.F() || !jl40.l(aVar.k, new TypedContentWidget(null, null, 15))) {
            b.e(serialDescriptor, 9, y0.a, aVar.k);
        }
        if (b.F() || !jl40.l(aVar.l, new TypedContentWidget(null, null, 15))) {
            b.e(serialDescriptor, 10, y0.a, aVar.l);
        }
        if (b.F() || !jl40.l(aVar.m, new TicketTopAsset(0))) {
            b.e(serialDescriptor, 11, f.a, aVar.m);
        }
        if (b.F() || aVar.n != null) {
            b.g(serialDescriptor, 12, v2z0.a, aVar.n);
        }
        if (b.F() || !aVar.o) {
            b.n(serialDescriptor, 13, aVar.o);
        }
        if (b.F() || !jl40.l(aVar.p, "")) {
            b.o(serialDescriptor, 14, aVar.p);
        }
        if (b.F() || !jl40.l(aVar.q, emptySet)) {
            b.e(serialDescriptor, 15, (KSerializer) i3yVarArr[15].getValue(), aVar.q);
        }
        if (b.F() || !jl40.l(aVar.r, EmptyList.a)) {
            b.e(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), aVar.r);
        }
        if (b.F() || aVar.s != null) {
            b.g(serialDescriptor, 17, zpx.a, aVar.s);
        }
        if (b.F() || !jl40.l(aVar.t, Collections.singletonList(new TicketBottomButton(0)))) {
            b.e(serialDescriptor, 18, (KSerializer) i3yVarArr[18].getValue(), aVar.t);
        }
        b.c(serialDescriptor);
    }
}
