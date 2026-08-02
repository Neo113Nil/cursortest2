package ru.yandex.taxi.masstransit.promo.models;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.nf10;
import defpackage.ny61;
import defpackage.pf10;
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
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam.ClientInfo", bVar, 2);
        pluginGeneratedSerialDescriptor.j("supported_features", true);
        pluginGeneratedSerialDescriptor.j("media_size_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MtSummaryCommunicationsParam.a.c[0].getValue(), nf10.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.a.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        pf10 pf10Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                pf10Var = (pf10) b.A(serialDescriptor, 1, nf10.a, pf10Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsParam.a(i, list, pf10Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsParam.a aVar = (MtSummaryCommunicationsParam.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.a.c;
        int i = 0;
        if (b.F() || !jl40.l(aVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, new pf10(i))) {
            b.e(serialDescriptor, 1, nf10.a, aVar.b);
        }
        b.c(serialDescriptor);
    }
}
