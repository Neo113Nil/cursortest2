package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class v9u0 implements uxs {
    public static final v9u0 a;
    private static final SerialDescriptor descriptor;

    static {
        v9u0 v9u0Var = new v9u0();
        a = v9u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.Step", v9u0Var, 4);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, qke.n(w7sVar), qke.n(jau0.a)};
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
        lau0 lau0Var = null;
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
                formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                lau0Var = (lau0) b.s(serialDescriptor, 3, jau0.a, lau0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new gau0(i, str, formattedText, formattedText2, lau0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gau0 gau0Var = (gau0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(gau0Var.a, "")) {
            b.o(serialDescriptor, 0, gau0Var.a);
        }
        if (b.F() || !jl40.l(gau0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, gau0Var.b);
        }
        if (b.F() || gau0Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, gau0Var.c);
        }
        if (b.F() || gau0Var.d != null) {
            b.g(serialDescriptor, 3, jau0.a, gau0Var.d);
        }
        b.c(serialDescriptor);
    }
}
