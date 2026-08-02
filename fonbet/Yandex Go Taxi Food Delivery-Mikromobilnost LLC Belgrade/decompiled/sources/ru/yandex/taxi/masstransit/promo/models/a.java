package ru.yandex.taxi.masstransit.promo.models;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam", aVar, 3);
        pluginGeneratedSerialDescriptor.j("client_info", true);
        pluginGeneratedSerialDescriptor.j("communication_types", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b.a, MtSummaryCommunicationsParam.d[1].getValue(), f.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        MtSummaryCommunicationsParam.a aVar = null;
        jsq0 jsq0Var = null;
        MtSummaryCommunicationsParam.CommunicationState communicationState = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (MtSummaryCommunicationsParam.a) b.A(serialDescriptor, 0, b.a, aVar);
                i |= 1;
            } else if (v == 1) {
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                communicationState = (MtSummaryCommunicationsParam.CommunicationState) b.A(serialDescriptor, 2, f.a, communicationState);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsParam(i, aVar, jsq0Var, communicationState);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtSummaryCommunicationsParam mtSummaryCommunicationsParam = (MtSummaryCommunicationsParam) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsParam.d;
        int i = 0;
        if (b.F() || !jl40.l(mtSummaryCommunicationsParam.a, new MtSummaryCommunicationsParam.a(i))) {
            b.e(serialDescriptor, 0, b.a, mtSummaryCommunicationsParam.a);
        }
        if (b.F() || !jl40.l(mtSummaryCommunicationsParam.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mtSummaryCommunicationsParam.b);
        }
        if (b.F() || !jl40.l(mtSummaryCommunicationsParam.c, new MtSummaryCommunicationsParam.CommunicationState(null, null, null, null, null, null, null, null, null, null, null, null, null, 16383))) {
            b.e(serialDescriptor, 2, f.a, mtSummaryCommunicationsParam.c);
        }
        b.c(serialDescriptor);
    }
}
