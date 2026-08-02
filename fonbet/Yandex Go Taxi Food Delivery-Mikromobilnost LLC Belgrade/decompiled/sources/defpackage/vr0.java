package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationContent;
import ru.yandex.taxi.common_models.net.map_object.e;
import ru.yandex.taxi.common_models.net.map_object.g;
import ru.yandex.taxi.common_models.net.map_object.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class vr0 implements uxs {
    public static final vr0 a;
    private static final SerialDescriptor descriptor;

    static {
        vr0 vr0Var = new vr0();
        a = vr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.AddressConfirmationScreen", vr0Var, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("confirm_button", true);
        pluginGeneratedSerialDescriptor.j("edit_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        e eVar = e.a;
        return new KSerializer[]{w7sVar, w7sVar, g.a, eVar, eVar};
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
        AddressConfirmationContent addressConfirmationContent = null;
        AddressConfirmationButton addressConfirmationButton = null;
        AddressConfirmationButton addressConfirmationButton2 = null;
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
                addressConfirmationContent = (AddressConfirmationContent) b.A(serialDescriptor, 2, g.a, addressConfirmationContent);
                i |= 4;
            } else if (v == 3) {
                addressConfirmationButton = (AddressConfirmationButton) b.A(serialDescriptor, 3, e.a, addressConfirmationButton);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                addressConfirmationButton2 = (AddressConfirmationButton) b.A(serialDescriptor, 4, e.a, addressConfirmationButton2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new i(i, formattedText, formattedText2, addressConfirmationContent, addressConfirmationButton, addressConfirmationButton2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(iVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, iVar.a);
        }
        if (b.F() || !jl40.l(iVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, iVar.b);
        }
        if (b.F() || !jl40.l(iVar.c, new AddressConfirmationContent(0))) {
            b.e(serialDescriptor, 2, g.a, iVar.c);
        }
        if (b.F() || !jl40.l(iVar.d, new AddressConfirmationButton(0))) {
            b.e(serialDescriptor, 3, e.a, iVar.d);
        }
        if (b.F() || !jl40.l(iVar.e, new AddressConfirmationButton(0))) {
            b.e(serialDescriptor, 4, e.a, iVar.e);
        }
        b.c(serialDescriptor);
    }
}
