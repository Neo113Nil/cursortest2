package ru.yandex.taxi.summary.promotions.models;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
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
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class l implements uxs {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam.SummaryState", lVar, 5);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("modes", true);
        pluginGeneratedSerialDescriptor.j("promo_context", true);
        pluginGeneratedSerialDescriptor.j("alternative_offers", true);
        pluginGeneratedSerialDescriptor.j("modal_windows_display_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SummaryPromotionsParam.c.f;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), qke.n(rcx.a), i3yVarArr[3].getValue(), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsParam.c.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        kotlinx.serialization.json.b bVar = null;
        Set set = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 2, rcx.a, bVar);
                i |= 4;
            } else if (v == 3) {
                set = (Set) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsParam.c(i, list, list2, bVar, set, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsParam.c cVar = (SummaryPromotionsParam.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsParam.c.f;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(cVar.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, rcx.a, cVar.c);
        }
        if (b.F() || !jl40.l(cVar.d, EmptySet.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), cVar.d);
        }
        if (b.F() || cVar.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), cVar.e);
        }
        b.c(serialDescriptor);
    }
}
