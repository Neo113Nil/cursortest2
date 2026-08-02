package ru.yandex.taxi.summary.promotions.models;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.oos0;
import defpackage.qke;
import defpackage.qos0;
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
public final /* synthetic */ class a1 implements uxs {
    public static final a1 a;
    private static final SerialDescriptor descriptor;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.PromotionWidgets", a1Var, 3);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("slider", true);
        pluginGeneratedSerialDescriptor.j("sticky_action_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SummaryPromotionsResponse.f.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(oos0.a), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.f.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        qos0 qos0Var = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                qos0Var = (qos0) b.s(serialDescriptor, 1, oos0.a, qos0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SummaryPromotionsResponse.f(i, list, qos0Var, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SummaryPromotionsResponse.f fVar = (SummaryPromotionsResponse.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SummaryPromotionsResponse.f.d;
        if (b.F() || !jl40.l(fVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), fVar.a);
        }
        if (b.F() || fVar.b != null) {
            b.g(serialDescriptor, 1, oos0.a, fVar.b);
        }
        if (b.F() || fVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), fVar.c);
        }
        b.c(serialDescriptor);
    }
}
