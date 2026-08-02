package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class zvm0 implements uxs {
    public static final zvm0 a;
    private static final SerialDescriptor descriptor;

    static {
        zvm0 zvm0Var = new zvm0();
        a = zvm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.FreezeSettings", zvm0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{w7sVar, n, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new bwm0(i, str, str2, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bwm0 bwm0Var = (bwm0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bwm0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, bwm0Var.a);
        }
        if (b.F() || bwm0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, bwm0Var.b);
        }
        if (b.F() || bwm0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bwm0Var.c);
        }
        if (b.F() || bwm0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, bwm0Var.d);
        }
        b.c(serialDescriptor);
    }
}
