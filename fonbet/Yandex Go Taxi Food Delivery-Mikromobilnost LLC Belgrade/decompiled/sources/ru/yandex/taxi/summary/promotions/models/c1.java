package ru.yandex.taxi.summary.promotions.models;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class c1 implements uxs {
    public static final c1 a;
    private static final SerialDescriptor descriptor;

    static {
        c1 c1Var = new c1();
        a = c1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.TariffPromos", c1Var, 2);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("promoblocks_order", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, SummaryPromotionsResponse.g.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.g.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.g(i, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.g gVar = (SummaryPromotionsResponse.g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.g.c;
        if (b.F() || !jl40.l(gVar.a, "")) {
            b.o(serialDescriptor, 0, gVar.a);
        }
        if (b.F() || !jl40.l(gVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), gVar.b);
        }
        b.c(serialDescriptor);
    }
}
