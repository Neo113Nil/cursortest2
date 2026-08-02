package ru.yandex.taxi.scooters.experiments;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.experiments.FinishCard;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.FinishCard", aVar, 6);
        pluginGeneratedSerialDescriptor.j("shortcuts", true);
        pluginGeneratedSerialDescriptor.j("sections_order", true);
        pluginGeneratedSerialDescriptor.j("statistics", true);
        pluginGeneratedSerialDescriptor.j("info_redesign_enabled", true);
        pluginGeneratedSerialDescriptor.j("comment_enabled", true);
        pluginGeneratedSerialDescriptor.j("support_enabled_by_rating", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FinishCard.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{c.a, i3yVarArr[1].getValue(), e.a, z96Var, z96Var, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FinishCard.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        FinishCard.a aVar = null;
        jsq0 jsq0Var = null;
        FinishCard.Statistics statistics = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    aVar = (FinishCard.a) b.A(serialDescriptor, 0, c.a, aVar);
                    i |= 1;
                    break;
                case 1:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                    i |= 2;
                    break;
                case 2:
                    statistics = (FinishCard.Statistics) b.A(serialDescriptor, 2, e.a, statistics);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FinishCard(i, aVar, jsq0Var, statistics, z2, z3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FinishCard finishCard = (FinishCard) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FinishCard.g;
        if (b.F() || !jl40.l(finishCard.a, new FinishCard.a(0))) {
            b.e(serialDescriptor, 0, c.a, finishCard.a);
        }
        if (b.F() || !jl40.l(finishCard.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), finishCard.b);
        }
        if (b.F() || !jl40.l(finishCard.c, new FinishCard.Statistics(0))) {
            b.e(serialDescriptor, 2, e.a, finishCard.c);
        }
        if (b.F() || finishCard.d) {
            b.n(serialDescriptor, 3, finishCard.d);
        }
        if (b.F() || finishCard.e) {
            b.n(serialDescriptor, 4, finishCard.e);
        }
        if (b.F() || !jl40.l(finishCard.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), finishCard.f);
        }
        b.c(serialDescriptor);
    }
}
