package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class t9o0 implements uxs {
    public static final t9o0 a;
    private static final SerialDescriptor descriptor;

    static {
        t9o0 t9o0Var = new t9o0();
        a = t9o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPackagesPurchaseWindowDto.PackageDto.PriceTitleDto.Text", t9o0Var, 1);
        pluginGeneratedSerialDescriptor.j("text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new v9o0(i, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v9o0 v9o0Var = (v9o0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(v9o0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, v9o0Var.a);
        }
        b.c(serialDescriptor);
    }
}
