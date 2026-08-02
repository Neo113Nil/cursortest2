package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;

/* loaded from: classes6.dex */
public final /* synthetic */ class ttw0 implements uxs {
    public static final ttw0 a;
    private static final SerialDescriptor descriptor;

    static {
        ttw0 ttw0Var = new ttw0();
        a = ttw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockContent", ttw0Var, 9);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("size", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        pluginGeneratedSerialDescriptor.j("hide_separator", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("has_chevron", true);
        pluginGeneratedSerialDescriptor.j("is_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = vtw0.j;
        w7s w7sVar = w7s.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{wtw0.a, w7sVar, w7sVar, i3yVarArr[3].getValue(), muw0.e, z96Var, qke.n(qtw0.e), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vtw0.j;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ytw0 ytw0Var = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        TextBlockSize textBlockSize = null;
        luw0 luw0Var = null;
        stw0 stw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ytw0Var = (ytw0) b.A(serialDescriptor, 0, wtw0.a, ytw0Var);
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
                    textBlockSize = (TextBlockSize) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), textBlockSize);
                    i |= 8;
                    break;
                case 4:
                    luw0Var = (luw0) b.A(serialDescriptor, 4, muw0.e, luw0Var);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    stw0Var = (stw0) b.s(serialDescriptor, 6, qtw0.e, stw0Var);
                    i |= 64;
                    break;
                case 7:
                    z3 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z4 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new vtw0(i, ytw0Var, formattedText, formattedText2, textBlockSize, luw0Var, z2, stw0Var, z3, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vtw0 vtw0Var = (vtw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vtw0.j;
        if (b.F() || !jl40.l(vtw0Var.a, new ytw0(0))) {
            b.e(serialDescriptor, 0, wtw0.a, vtw0Var.a);
        }
        if (b.F() || !jl40.l(vtw0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, vtw0Var.b);
        }
        if (b.F() || !jl40.l(vtw0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, vtw0Var.c);
        }
        if (b.F() || vtw0Var.d != TextBlockSize.UNKNOWN) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), vtw0Var.d);
        }
        if (b.F() || !jl40.l(vtw0Var.e, kuw0.INSTANCE)) {
            b.e(serialDescriptor, 4, muw0.e, vtw0Var.e);
        }
        if (b.F() || vtw0Var.f) {
            b.n(serialDescriptor, 5, vtw0Var.f);
        }
        if (b.F() || vtw0Var.g != null) {
            b.g(serialDescriptor, 6, qtw0.e, vtw0Var.g);
        }
        if (b.F() || vtw0Var.h) {
            b.n(serialDescriptor, 7, vtw0Var.h);
        }
        if (b.F() || vtw0Var.i) {
            b.n(serialDescriptor, 8, vtw0Var.i);
        }
        b.c(serialDescriptor);
    }
}
