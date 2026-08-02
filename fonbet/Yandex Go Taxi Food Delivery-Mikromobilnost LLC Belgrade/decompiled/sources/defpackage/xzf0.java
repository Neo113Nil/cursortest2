package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class xzf0 implements uxs {
    public static final xzf0 a;
    private static final SerialDescriptor descriptor;

    static {
        xzf0 xzf0Var = new xzf0();
        a = xzf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PurchaseInfo", xzf0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("expire_text", true);
        pluginGeneratedSerialDescriptor.j("button_title", true);
        pluginGeneratedSerialDescriptor.j("descriptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b0g0.e;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0g0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                formattedText3 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new b0g0(i, list, formattedText, formattedText2, formattedText3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b0g0 b0g0Var = (b0g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0g0.e;
        if (b.F() || b0g0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, b0g0Var.a);
        }
        if (b.F() || b0g0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, b0g0Var.b);
        }
        if (b.F() || b0g0Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, b0g0Var.c);
        }
        if (b.F() || b0g0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), b0g0Var.d);
        }
        b.c(serialDescriptor);
    }
}
