package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mti;
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
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment.Rule", bVar, 7);
        pluginGeneratedSerialDescriptor.j("rule_type", true);
        pluginGeneratedSerialDescriptor.j("max_attempts", true);
        pluginGeneratedSerialDescriptor.j("parts_to_parse", true);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("description_key", true);
        pluginGeneratedSerialDescriptor.j("positive_button_title_key", true);
        pluginGeneratedSerialDescriptor.j("negative_button_title_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.a.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{mti.e, h6w.a, i3yVarArr[2].getValue(), auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.a.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        h hVar = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    hVar = (h) b.A(serialDescriptor, 0, mti.e, hVar);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new DeliveryTariffsCommentRedirectionsExperiment.a(i, hVar, i2, list, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DeliveryTariffsCommentRedirectionsExperiment.a aVar = (DeliveryTariffsCommentRedirectionsExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryTariffsCommentRedirectionsExperiment.a.h;
        if (b.F() || !jl40.l(aVar.a, g.INSTANCE)) {
            b.e(serialDescriptor, 0, mti.e, aVar.a);
        }
        if (b.F() || aVar.b != Integer.MAX_VALUE) {
            b.A(1, aVar.b, serialDescriptor);
        }
        if (b.F() || !jl40.l(aVar.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 4, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, "")) {
            b.o(serialDescriptor, 5, aVar.f);
        }
        if (b.F() || !jl40.l(aVar.g, "")) {
            b.o(serialDescriptor, 6, aVar.g);
        }
        b.c(serialDescriptor);
    }
}
