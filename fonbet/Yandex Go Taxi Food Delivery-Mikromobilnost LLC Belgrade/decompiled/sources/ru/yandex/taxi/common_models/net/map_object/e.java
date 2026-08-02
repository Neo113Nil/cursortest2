package ru.yandex.taxi.common_models.net.map_object;

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
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton", eVar, 2);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a, AddressConfirmationButton.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddressConfirmationButton.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        AddressConfirmationButton.ButtonStyle buttonStyle = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                buttonStyle = (AddressConfirmationButton.ButtonStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), buttonStyle);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new AddressConfirmationButton(i, formattedText, buttonStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AddressConfirmationButton addressConfirmationButton = (AddressConfirmationButton) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddressConfirmationButton.c;
        if (b.F() || !jl40.l(addressConfirmationButton.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, addressConfirmationButton.a);
        }
        if (b.F() || addressConfirmationButton.b != AddressConfirmationButton.ButtonStyle.MAIN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), addressConfirmationButton.b);
        }
        b.c(serialDescriptor);
    }
}
