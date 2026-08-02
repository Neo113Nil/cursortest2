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
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class b0 implements uxs {
    public static final b0 a;
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow", b0Var, 7);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("groups", true);
        pluginGeneratedSerialDescriptor.j("reject_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        pluginGeneratedSerialDescriptor.j("bottom_provider_info_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, w7sVar, i3yVarArr[3].getValue(), w7sVar, w7sVar, w7sVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        List list = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
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
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText4);
                    i |= 32;
                    break;
                case 6:
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText5);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow(i, str, formattedText, formattedText2, list, formattedText3, formattedText4, formattedText5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow upsaleWindow = (ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.h;
        if (b.F() || !jl40.l(upsaleWindow.a, "")) {
            b.o(serialDescriptor, 0, upsaleWindow.a);
        }
        if (b.F() || !jl40.l(upsaleWindow.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, upsaleWindow.b);
        }
        if (b.F() || !jl40.l(upsaleWindow.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, upsaleWindow.c);
        }
        if (b.F() || !jl40.l(upsaleWindow.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), upsaleWindow.d);
        }
        if (b.F() || !jl40.l(upsaleWindow.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, upsaleWindow.e);
        }
        if (b.F() || !jl40.l(upsaleWindow.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, upsaleWindow.f);
        }
        if (b.F() || !jl40.l(upsaleWindow.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, upsaleWindow.g);
        }
        b.c(serialDescriptor);
    }
}
