package ru.yandex.taxi.scooters.experiments;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes6.dex */
public final /* synthetic */ class d0 implements uxs {
    public static final d0 a;
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item", d0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("lead_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.e;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, auu0.a, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action action = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                action = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), action);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item(i, formattedText, formattedText2, str, action);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item item = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.e;
        if (b.F() || !jl40.l(item.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, item.a);
        }
        if (b.F() || !jl40.l(item.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, item.b);
        }
        if (b.F() || !jl40.l(item.c, "")) {
            b.o(serialDescriptor, 2, item.c);
        }
        if (b.F() || item.d != ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.UNKNOWN) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), item.d);
        }
        b.c(serialDescriptor);
    }
}
