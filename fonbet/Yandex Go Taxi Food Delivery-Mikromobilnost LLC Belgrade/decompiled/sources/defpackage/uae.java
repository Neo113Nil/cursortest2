package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uae implements uxs {
    public static final uae a;
    private static final SerialDescriptor descriptor;

    static {
        uae uaeVar = new uae();
        a = uaeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.ContactPickerConfig", uaeVar, 1);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 0);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new wae(i, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wae waeVar = (wae) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(waeVar.a, "")) {
            b.o(serialDescriptor, 0, waeVar.a);
        }
        b.c(serialDescriptor);
    }
}
