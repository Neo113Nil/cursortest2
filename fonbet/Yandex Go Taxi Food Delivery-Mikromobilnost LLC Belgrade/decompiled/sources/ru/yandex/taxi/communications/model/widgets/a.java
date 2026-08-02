package ru.yandex.taxi.communications.model.widgets;

import com.adjust.sdk.Constants;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.ActionButton", aVar, 6);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ActionButton.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(c.e), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ActionButton.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        b bVar = null;
        ActionButton.ButtonTextStyle buttonTextStyle = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    bVar = (b) b.s(serialDescriptor, 4, c.e, bVar);
                    i |= 16;
                    break;
                case 5:
                    buttonTextStyle = (ActionButton.ButtonTextStyle) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), buttonTextStyle);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ActionButton(i, str, str2, str3, str4, bVar, buttonTextStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ActionButton actionButton = (ActionButton) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ActionButton.g;
        if (b.F() || !jl40.l(actionButton.a, "")) {
            b.o(serialDescriptor, 0, actionButton.a);
        }
        if (b.F() || !jl40.l(actionButton.b, "")) {
            b.o(serialDescriptor, 1, actionButton.b);
        }
        if (b.F() || actionButton.c != null) {
            b.g(serialDescriptor, 2, auu0.a, actionButton.c);
        }
        if (b.F() || actionButton.d != null) {
            b.g(serialDescriptor, 3, auu0.a, actionButton.d);
        }
        if (b.F() || actionButton.e != null) {
            b.g(serialDescriptor, 4, c.e, actionButton.e);
        }
        if (b.F() || actionButton.f != ActionButton.ButtonTextStyle.DEFAULT) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), actionButton.f);
        }
        b.c(serialDescriptor);
    }
}
