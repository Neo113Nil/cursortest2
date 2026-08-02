package ru.yandex.taxi.summary.promotions.models;

import com.yandex.go.analytics.AccountType;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.nf10;
import defpackage.ny61;
import defpackage.pf10;
import defpackage.pfa0;
import defpackage.qke;
import defpackage.rfa0;
import defpackage.s03;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w03;
import defpackage.yjd;
import defpackage.zmv0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam", cVar, 10);
        pluginGeneratedSerialDescriptor.j("summary_state", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("client_info", true);
        pluginGeneratedSerialDescriptor.j("media_size_info", true);
        pluginGeneratedSerialDescriptor.j("payment", true);
        pluginGeneratedSerialDescriptor.j("account_type", true);
        pluginGeneratedSerialDescriptor.j("ultima_mode", true);
        pluginGeneratedSerialDescriptor.j("choose_appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("user_power_prc", true);
        pluginGeneratedSerialDescriptor.j("user_plugged_state", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{l.a, s03.a, d.a, nf10.a, pfa0.a, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        String str = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        SummaryPromotionsParam.c cVar = null;
        w03 w03Var = null;
        SummaryPromotionsParam.a aVar = null;
        pf10 pf10Var = null;
        rfa0 rfa0Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    cVar = (SummaryPromotionsParam.c) b.A(serialDescriptor, 0, l.a, cVar);
                    i |= 1;
                    break;
                case 1:
                    w03Var = (w03) b.A(serialDescriptor, 1, s03.a, w03Var);
                    i |= 2;
                    break;
                case 2:
                    aVar = (SummaryPromotionsParam.a) b.A(serialDescriptor, 2, d.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    pf10Var = (pf10) b.A(serialDescriptor, 3, nf10.a, pf10Var);
                    i |= 8;
                    break;
                case 4:
                    rfa0Var = (rfa0) b.A(serialDescriptor, 4, pfa0.a, rfa0Var);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) b.s(serialDescriptor, 8, h6w.a, num);
                    i |= 256;
                    break;
                case 9:
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsParam(i, cVar, w03Var, aVar, pf10Var, rfa0Var, str2, str3, str4, num, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsParam summaryPromotionsParam = (SummaryPromotionsParam) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        zmv0 zmv0Var = SummaryPromotionsParam.Companion;
        int i = 0;
        if (b.F() || !jl40.l(summaryPromotionsParam.a, new SummaryPromotionsParam.c(i))) {
            b.e(serialDescriptor, 0, l.a, summaryPromotionsParam.a);
        }
        if (b.F() || !jl40.l(summaryPromotionsParam.b, new w03(i))) {
            b.e(serialDescriptor, 1, s03.a, summaryPromotionsParam.b);
        }
        if (b.F() || !jl40.l(summaryPromotionsParam.c, new SummaryPromotionsParam.a(i))) {
            b.e(serialDescriptor, 2, d.a, summaryPromotionsParam.c);
        }
        if (b.F() || !jl40.l(summaryPromotionsParam.d, new pf10(i))) {
            b.e(serialDescriptor, 3, nf10.a, summaryPromotionsParam.d);
        }
        if (b.F() || !jl40.l(summaryPromotionsParam.e, new rfa0(PaymentMethod$Type.CASH, (String) null, (String) null, (Boolean) null, (List) null, 30))) {
            b.e(serialDescriptor, 4, pfa0.a, summaryPromotionsParam.e);
        }
        if (b.F() || !jl40.l(summaryPromotionsParam.f, AccountType.None.getEventValue())) {
            b.o(serialDescriptor, 5, summaryPromotionsParam.f);
        }
        if (b.F() || summaryPromotionsParam.g != null) {
            b.g(serialDescriptor, 6, auu0.a, summaryPromotionsParam.g);
        }
        if (b.F() || summaryPromotionsParam.h != null) {
            b.g(serialDescriptor, 7, auu0.a, summaryPromotionsParam.h);
        }
        if (b.F() || summaryPromotionsParam.i != null) {
            b.g(serialDescriptor, 8, h6w.a, summaryPromotionsParam.i);
        }
        if (b.F() || summaryPromotionsParam.j != null) {
            b.g(serialDescriptor, 9, auu0.a, summaryPromotionsParam.j);
        }
        b.c(serialDescriptor);
    }
}
