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
import ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements uxs {
    public static final l0 a;
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton", l0Var, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ShowNavigationButton.c[0].getValue(), w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ShowNavigationButton.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ShowNavigationButton.Type type = null;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                type = (ShowNavigationButton.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ShowNavigationButton(i, type, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ShowNavigationButton showNavigationButton = (ShowNavigationButton) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ShowNavigationButton.c;
        if (b.F() || showNavigationButton.a != ShowNavigationButton.Type.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), showNavigationButton.a);
        }
        if (b.F() || !jl40.l(showNavigationButton.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, showNavigationButton.b);
        }
        b.c(serialDescriptor);
    }
}
