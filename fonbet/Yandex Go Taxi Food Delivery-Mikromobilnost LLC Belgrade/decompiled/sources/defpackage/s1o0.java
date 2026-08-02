package defpackage;

import com.adjust.sdk.Constants;
import defpackage.n1o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final /* synthetic */ class s1o0 implements uxs {
    public static final s1o0 a;
    private static final SerialDescriptor descriptor;

    static {
        s1o0 s1o0Var = new s1o0();
        a = s1o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersNewbieFlowExperiment.ProgressInfo.HelpItem", s1o0Var, 5);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("metrica_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, w7sVar, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else if (v == 3) {
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new n1o0.c.a(i, str, formattedText, formattedText2, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1o0.c.a aVar = (n1o0.c.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 4, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
