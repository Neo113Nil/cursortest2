package ru.yandex.taxi.summary.promotions.models;

import defpackage.a4v;
import defpackage.auu0;
import defpackage.c4v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.m0e;
import defpackage.myi;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.qke;
import defpackage.sjd;
import defpackage.t0e;
import defpackage.uxs;
import defpackage.v1e;
import defpackage.w7s;
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
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class q implements uxs {
    public static final q a;
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.Item", qVar, 16);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("meta_type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("cashback", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("tariff_icon_override", true);
        pluginGeneratedSerialDescriptor.j("tap_action", true);
        pluginGeneratedSerialDescriptor.j("intercept_on_first_contact", true);
        pluginGeneratedSerialDescriptor.j("display_on", true);
        pluginGeneratedSerialDescriptor.j("configuration", true);
        pluginGeneratedSerialDescriptor.j("supported_verticals", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.q;
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), w7sVar, w7sVar, a4v.a, ru.yandex.taxi.communications.model.c.a, w.a, qke.n(r.a), qke.n(u.a), qke.n(e0.a), qke.n(c0.e), z96.a, qke.n((KSerializer) i3yVarArr[12].getValue()), v1e.e, i3yVarArr[14].getValue(), qke.n((KSerializer) i3yVarArr[15].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        FormattedText formattedText;
        FormattedText formattedText2;
        jsq0 jsq0Var;
        FormattedText formattedText3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.q;
        b.getClass();
        jsq0 jsq0Var2 = null;
        d0 d0Var = null;
        SummaryPromotionsResponse.a.d dVar = null;
        SummaryPromotionsResponse.a.b bVar = null;
        t0e t0eVar = null;
        SummaryPromotionsResponse.a.C0118a c0118a = null;
        int i = 0;
        List list = null;
        Map map = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        c4v c4vVar = null;
        CommunicationItem.a aVar = null;
        SummaryPromotionsResponse.a.c cVar = null;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    z = false;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 0:
                    jsq0Var = jsq0Var2;
                    formattedText3 = formattedText4;
                    formattedText2 = formattedText5;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    formattedText4 = formattedText3;
                    jsq0Var2 = jsq0Var;
                    formattedText5 = formattedText2;
                case 1:
                    jsq0Var = jsq0Var2;
                    formattedText2 = formattedText5;
                    formattedText3 = formattedText4;
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    formattedText4 = formattedText3;
                    jsq0Var2 = jsq0Var;
                    formattedText5 = formattedText2;
                case 2:
                    jsq0Var = jsq0Var2;
                    formattedText2 = formattedText5;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText4);
                    i |= 4;
                    jsq0Var2 = jsq0Var;
                    formattedText5 = formattedText2;
                case 3:
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText5);
                    i |= 8;
                    formattedText4 = formattedText4;
                    jsq0Var2 = jsq0Var2;
                case 4:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    c4vVar = (c4v) b.A(serialDescriptor, 4, a4v.a, c4vVar);
                    i |= 16;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 5:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    aVar = (CommunicationItem.a) b.A(serialDescriptor, 5, ru.yandex.taxi.communications.model.c.a, aVar);
                    i |= 32;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 6:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    cVar = (SummaryPromotionsResponse.a.c) b.A(serialDescriptor, 6, w.a, cVar);
                    i |= 64;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 7:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    c0118a = (SummaryPromotionsResponse.a.C0118a) b.s(serialDescriptor, 7, r.a, c0118a);
                    i |= 128;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 8:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    bVar = (SummaryPromotionsResponse.a.b) b.s(serialDescriptor, 8, u.a, bVar);
                    i |= 256;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 9:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    dVar = (SummaryPromotionsResponse.a.d) b.s(serialDescriptor, 9, e0.a, dVar);
                    i |= 512;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 10:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    d0Var = (d0) b.s(serialDescriptor, 10, c0.e, d0Var);
                    i |= 1024;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 11:
                    z2 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    formattedText4 = formattedText4;
                case 12:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    jsq0Var2 = (jsq0) b.s(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), jsq0Var2);
                    i |= 4096;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 13:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    t0eVar = (t0e) b.A(serialDescriptor, 13, v1e.e, t0eVar);
                    i |= 8192;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 14:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    list = (List) b.A(serialDescriptor, 14, (myi) i3yVarArr[14].getValue(), list);
                    i |= 16384;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                case 15:
                    formattedText = formattedText4;
                    formattedText2 = formattedText5;
                    map = (Map) b.s(serialDescriptor, 15, (myi) i3yVarArr[15].getValue(), map);
                    i |= 32768;
                    formattedText4 = formattedText;
                    formattedText5 = formattedText2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        FormattedText formattedText6 = formattedText4;
        FormattedText formattedText7 = formattedText5;
        String str3 = str2;
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.a(i, str, str3, formattedText6, formattedText7, c4vVar, aVar, cVar, c0118a, bVar, dVar, d0Var, z2, jsq0Var2, t0eVar, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (defpackage.jl40.l(r8.e, new defpackage.c4v(r5, r5, r3)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (defpackage.jl40.l(r1, ru.yandex.taxi.communications.model.CommunicationItem.a.j) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.a aVar = (SummaryPromotionsResponse.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.a.q;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, aVar.b);
        }
        if (b.F() || !nzs.t(0, aVar.c)) {
            b.e(serialDescriptor, 2, w7s.a, aVar.c);
        }
        int i = 3;
        if (b.F() || !nzs.t(0, aVar.d)) {
            b.e(serialDescriptor, 3, w7s.a, aVar.d);
        }
        if (!b.F()) {
            String str = null;
        }
        b.e(serialDescriptor, 4, a4v.a, aVar.e);
        if (!b.F()) {
            CommunicationItem.a aVar2 = aVar.f;
            CommunicationItem.a.Companion.getClass();
        }
        b.e(serialDescriptor, 5, ru.yandex.taxi.communications.model.c.a, aVar.f);
        if (b.F() || !jl40.l(aVar.g, new SummaryPromotionsResponse.a.c(0))) {
            b.e(serialDescriptor, 6, w.a, aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, r.a, aVar.h);
        }
        if (b.F() || aVar.i != null) {
            b.g(serialDescriptor, 8, u.a, aVar.i);
        }
        if (b.F() || aVar.j != null) {
            b.g(serialDescriptor, 9, e0.a, aVar.j);
        }
        if (b.F() || aVar.k != null) {
            b.g(serialDescriptor, 10, c0.e, aVar.k);
        }
        if (b.F() || aVar.l) {
            b.n(serialDescriptor, 11, aVar.l);
        }
        if (b.F() || aVar.m != null) {
            b.g(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), aVar.m);
        }
        if (b.F() || !jl40.l(aVar.n, new m0e(0))) {
            b.e(serialDescriptor, 13, v1e.e, aVar.n);
        }
        if (b.F() || !jl40.l(aVar.o, EmptyList.a)) {
            b.e(serialDescriptor, 14, (KSerializer) i3yVarArr[14].getValue(), aVar.o);
        }
        if (b.F() || aVar.p != null) {
            b.g(serialDescriptor, 15, (KSerializer) i3yVarArr[15].getValue(), aVar.p);
        }
        b.c(serialDescriptor);
    }
}
