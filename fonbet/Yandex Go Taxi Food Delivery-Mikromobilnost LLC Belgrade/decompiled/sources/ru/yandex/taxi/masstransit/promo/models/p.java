package ru.yandex.taxi.masstransit.promo.models;

import defpackage.a4v;
import defpackage.auu0;
import defpackage.c4v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class p implements uxs {
    public static final p a;
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse.Item", pVar, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("meta_type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.i;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[7].getValue());
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, n, w7sVar, w7sVar, a4v.a, ru.yandex.taxi.communications.model.c.a, r.a, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        c4v c4vVar = null;
        CommunicationItem.a aVar = null;
        MtSummaryCommunicationsResponse.a.C0107a c0107a = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    c4vVar = (c4v) b.A(serialDescriptor, 4, a4v.a, c4vVar);
                    i |= 16;
                    break;
                case 5:
                    aVar = (CommunicationItem.a) b.A(serialDescriptor, 5, ru.yandex.taxi.communications.model.c.a, aVar);
                    i |= 32;
                    break;
                case 6:
                    c0107a = (MtSummaryCommunicationsResponse.a.C0107a) b.A(serialDescriptor, 6, r.a, c0107a);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new MtSummaryCommunicationsResponse.a(i, str, str2, formattedText, formattedText2, c4vVar, aVar, c0107a, map);
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
        MtSummaryCommunicationsResponse.a aVar = (MtSummaryCommunicationsResponse.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtSummaryCommunicationsResponse.a.i;
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
        if (b.F() || !jl40.l(aVar.g, new MtSummaryCommunicationsResponse.a.C0107a(0))) {
            b.e(serialDescriptor, 6, r.a, aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), aVar.h);
        }
        b.c(serialDescriptor);
    }
}
