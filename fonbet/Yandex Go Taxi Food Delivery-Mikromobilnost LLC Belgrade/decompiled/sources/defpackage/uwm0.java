package defpackage;

import defpackage.ovm0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class uwm0 implements uxs {
    public static final uwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        uwm0 uwm0Var = new uwm0();
        a = uwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SuperPassUpsaleLongestPass", uwm0Var, 6);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("pass_title", true);
        pluginGeneratedSerialDescriptor.j("pass_subtitle", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, qke.n(w7sVar), w7sVar, qke.n(auu0Var), qke.n(wwm0.a)};
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
        FormattedText formattedText3 = null;
        String str2 = null;
        ovm0.f fVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    fVar = (ovm0.f) b.s(serialDescriptor, 5, wwm0.a, fVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ovm0.e(i, str, formattedText, formattedText2, formattedText3, str2, fVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ovm0.e eVar = (ovm0.e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(eVar.a, "")) {
            b.o(serialDescriptor, 0, eVar.a);
        }
        if (b.F() || !jl40.l(eVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, eVar.b);
        }
        if (b.F() || eVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, eVar.c);
        }
        if (b.F() || !jl40.l(eVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, eVar.d);
        }
        if (b.F() || eVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, eVar.e);
        }
        if (b.F() || eVar.f != null) {
            b.g(serialDescriptor, 5, wwm0.a, eVar.f);
        }
        b.c(serialDescriptor);
    }
}
