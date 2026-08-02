package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class vxv implements uxs {
    public static final vxv a;
    private static final SerialDescriptor descriptor;

    static {
        vxv vxvVar = new vxv();
        a = vxvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.InnerText", vxvVar, 3);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("angle", true);
        pluginGeneratedSerialDescriptor.j("tile_size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(w7s.a), qke.n(nor.a), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        Float f = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xxv(i, formattedText, f, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xxv xxvVar = (xxv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || xxvVar.a != null) {
            b.g(serialDescriptor, 0, w7s.a, xxvVar.a);
        }
        if (b.F() || xxvVar.b != null) {
            b.g(serialDescriptor, 1, nor.a, xxvVar.b);
        }
        if (b.F() || xxvVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, xxvVar.c);
        }
        b.c(serialDescriptor);
    }
}
