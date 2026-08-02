package ru.yandex.taxi.masstransit.promo.models;

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
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class a0 implements uxs {
    public static final a0 a;
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse.PromoBlockPriority", a0Var, 2);
        pluginGeneratedSerialDescriptor.j("route_id", true);
        pluginGeneratedSerialDescriptor.j("promoblocks_order", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, MtSummaryCommunicationsResponse.d.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.d.c;
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
        return new MtSummaryCommunicationsResponse.d(i, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsResponse.d dVar = (MtSummaryCommunicationsResponse.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.d.c;
        if (b.F() || !jl40.l(dVar.a, "")) {
            b.o(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dVar.b);
        }
        b.c(serialDescriptor);
    }
}
