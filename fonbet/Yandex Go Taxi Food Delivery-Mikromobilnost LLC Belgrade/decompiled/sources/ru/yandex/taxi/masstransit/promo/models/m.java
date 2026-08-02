package ru.yandex.taxi.masstransit.promo.models;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class m implements uxs {
    public static final m a;
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam.CommunicationState.Vehicle", mVar, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("starting_stop_id", true);
        pluginGeneratedSerialDescriptor.j("destination_stop_id", true);
        pluginGeneratedSerialDescriptor.j("line_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsParam.CommunicationState.c(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsParam.CommunicationState.c cVar = (MtSummaryCommunicationsParam.CommunicationState.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cVar.c);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cVar.d);
        }
        b.c(serialDescriptor);
    }
}
