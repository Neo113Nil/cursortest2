package defpackage;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.a;
import ru.yandex.taxi.communications.api.dto.y0;

/* loaded from: classes9.dex */
public final /* synthetic */ class rg60 implements uxs {
    public static final rg60 a;
    private static final SerialDescriptor descriptor;

    static {
        rg60 rg60Var = new rg60();
        a = rg60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.NotificationBanner", rg60Var, 14);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("zones", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("start_date", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        pluginGeneratedSerialDescriptor.j("promotion", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tg60.p;
        auu0 auu0Var = auu0.a;
        vmt vmtVar = vmt.a;
        z96 z96Var = z96.a;
        y0 y0Var = y0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), h6w.a, qke.n(vmtVar), qke.n(vmtVar), auu0Var, z96Var, z96Var, i3yVarArr[9].getValue(), qke.n(y0Var), qke.n(y0Var), qke.n(auu0Var), a.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tg60.p;
        b.getClass();
        BannerWidgets bannerWidgets = null;
        String str2 = null;
        TypedContentWidget typedContentWidget = null;
        TypedContentWidget typedContentWidget2 = null;
        boolean z3 = true;
        Set set = null;
        int i = 0;
        String str3 = null;
        Map map = null;
        List list = null;
        int i2 = 0;
        Calendar calendar = null;
        Calendar calendar2 = null;
        String str4 = null;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = 1;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                case 0:
                    z2 = z3;
                    i |= 1;
                    i3 = i3;
                    str3 = b.k(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z = z3;
                    str = str3;
                    map = (Map) b.s(serialDescriptor, i3, (myi) i3yVarArr[i3].getValue(), map);
                    i |= 2;
                    z3 = z;
                    str3 = str;
                case 2:
                    z = z3;
                    str = str3;
                    list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    z3 = z;
                    str3 = str;
                case 3:
                    z2 = z3;
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    z3 = z2;
                case 4:
                    z = z3;
                    str = str3;
                    calendar = (Calendar) b.s(serialDescriptor, 4, vmt.a, calendar);
                    i |= 16;
                    z3 = z;
                    str3 = str;
                case 5:
                    z = z3;
                    str = str3;
                    calendar2 = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar2);
                    i |= 32;
                    z3 = z;
                    str3 = str;
                case 6:
                    z2 = z3;
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    z3 = z2;
                case 7:
                    z2 = z3;
                    z4 = b.C(serialDescriptor, 7);
                    i |= 128;
                    z3 = z2;
                case 8:
                    z2 = z3;
                    z5 = b.C(serialDescriptor, 8);
                    i |= 256;
                    z3 = z2;
                case 9:
                    z = z3;
                    str = str3;
                    set = (Set) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), set);
                    i |= 512;
                    z3 = z;
                    str3 = str;
                case 10:
                    z = z3;
                    str = str3;
                    typedContentWidget2 = (TypedContentWidget) b.s(serialDescriptor, 10, y0.a, typedContentWidget2);
                    i |= 1024;
                    z3 = z;
                    str3 = str;
                case 11:
                    z = z3;
                    str = str3;
                    typedContentWidget = (TypedContentWidget) b.s(serialDescriptor, 11, y0.a, typedContentWidget);
                    i |= 2048;
                    z3 = z;
                    str3 = str;
                case 12:
                    z = z3;
                    str = str3;
                    str2 = (String) b.s(serialDescriptor, 12, auu0.a, str2);
                    i |= 4096;
                    z3 = z;
                    str3 = str;
                case 13:
                    z = z3;
                    str = str3;
                    bannerWidgets = (BannerWidgets) b.A(serialDescriptor, 13, a.a, bannerWidgets);
                    i |= 8192;
                    z3 = z;
                    str3 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new tg60(i, str3, map, list, i2, calendar, calendar2, str4, z4, z5, set, typedContentWidget2, typedContentWidget, str2, bannerWidgets);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tg60 tg60Var = (tg60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tg60.p;
        if (b.F() || !jl40.l(tg60Var.b, "")) {
            b.o(serialDescriptor, 0, tg60Var.b);
        }
        if (b.F() || tg60Var.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), tg60Var.c);
        }
        if (b.F() || tg60Var.d != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), tg60Var.d);
        }
        if (b.F() || tg60Var.e != 0) {
            b.A(3, tg60Var.e, serialDescriptor);
        }
        if (b.F() || tg60Var.f != null) {
            b.g(serialDescriptor, 4, vmt.a, tg60Var.f);
        }
        if (b.F() || tg60Var.g != null) {
            b.g(serialDescriptor, 5, vmt.a, tg60Var.g);
        }
        if (b.F() || !jl40.l(tg60Var.h, "")) {
            b.o(serialDescriptor, 6, tg60Var.h);
        }
        if (b.F() || tg60Var.i) {
            b.n(serialDescriptor, 7, tg60Var.i);
        }
        if (b.F() || !tg60Var.j) {
            b.n(serialDescriptor, 8, tg60Var.j);
        }
        if (b.F() || !jl40.l(tg60Var.k, EmptySet.a)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), tg60Var.k);
        }
        if (b.F() || tg60Var.l != null) {
            b.g(serialDescriptor, 10, y0.a, tg60Var.l);
        }
        if (b.F() || tg60Var.m != null) {
            b.g(serialDescriptor, 11, y0.a, tg60Var.m);
        }
        if (b.F() || tg60Var.n != null) {
            b.g(serialDescriptor, 12, auu0.a, tg60Var.n);
        }
        if (b.F() || !jl40.l(tg60Var.o, BannerWidgets.j)) {
            b.e(serialDescriptor, 13, a.a, tg60Var.o);
        }
        b.c(serialDescriptor);
    }
}
