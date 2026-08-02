package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class x490 implements uxs {
    public static final x490 a;
    private static final SerialDescriptor descriptor;

    static {
        x490 x490Var = new x490();
        a = x490Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PackagePurchaseButtonTexts", x490Var, 6);
        pluginGeneratedSerialDescriptor.j("purchase_title", true);
        pluginGeneratedSerialDescriptor.j("purchase_subtitle", true);
        pluginGeneratedSerialDescriptor.j("purchase_and_book_title", true);
        pluginGeneratedSerialDescriptor.j("purchase_and_book_subtitle", true);
        pluginGeneratedSerialDescriptor.j("purchase_and_go_title", true);
        pluginGeneratedSerialDescriptor.j("purchase_and_go_subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, w7sVar, w7sVar, w7sVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText5);
                    i |= 16;
                    break;
                case 5:
                    formattedText6 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText6);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new z490(i, formattedText, formattedText2, formattedText3, formattedText4, formattedText5, formattedText6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z490 z490Var = (z490) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(z490Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, z490Var.a);
        }
        if (b.F() || !jl40.l(z490Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, z490Var.b);
        }
        if (b.F() || !jl40.l(z490Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, z490Var.c);
        }
        if (b.F() || !jl40.l(z490Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, z490Var.d);
        }
        if (b.F() || !jl40.l(z490Var.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, z490Var.e);
        }
        if (b.F() || !jl40.l(z490Var.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, z490Var.f);
        }
        b.c(serialDescriptor);
    }
}
