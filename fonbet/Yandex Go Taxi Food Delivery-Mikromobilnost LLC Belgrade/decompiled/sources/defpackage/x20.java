package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class x20 implements uxs {
    public static final x20 a;
    private static final SerialDescriptor descriptor;

    static {
        x20 x20Var = new x20();
        a = x20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ActivePassesScreen", x20Var, 2);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new z20(i, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z20 z20Var = (z20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || z20Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, z20Var.a);
        }
        if (b.F() || z20Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, z20Var.b);
        }
        b.c(serialDescriptor);
    }
}
