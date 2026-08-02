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
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class l0 implements uxs {
    public static final l0 a;
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment.Camera.ScooterPreview.Button", l0Var, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("is_accent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ScootersMultiOrderExperiment.Camera.ScooterPreview.a.e[0].getValue(), auu0.a, w7s.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.Camera.ScooterPreview.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType buttonType = null;
        String str = null;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                buttonType = (ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), buttonType);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScootersMultiOrderExperiment.Camera.ScooterPreview.a(i, buttonType, str, formattedText, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScootersMultiOrderExperiment.Camera.ScooterPreview.a aVar = (ScootersMultiOrderExperiment.Camera.ScooterPreview.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMultiOrderExperiment.Camera.ScooterPreview.a.e;
        if (b.F() || aVar.a != ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType.ADD) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, aVar.c);
        }
        if (b.F() || !aVar.d) {
            b.n(serialDescriptor, 3, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
