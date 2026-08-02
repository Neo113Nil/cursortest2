package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.s0;
import ru.yandex.taxi.surge.models.dto.t0;

/* loaded from: classes6.dex */
public final /* synthetic */ class yqw0 implements uxs {
    public static final yqw0 a;
    private static final SerialDescriptor descriptor;

    static {
        yqw0 yqw0Var = new yqw0();
        a = yqw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.ActionButtons", yqw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{t0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                surgeInfoItem$ActionButtonsContent = (SurgeInfoItem$ActionButtonsContent) b.A(serialDescriptor, 0, t0.a, surgeInfoItem$ActionButtonsContent);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new s0(i, surgeInfoItem$ActionButtonsContent);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s0 s0Var = (s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(s0Var.a, new SurgeInfoItem$ActionButtonsContent(0))) {
            b.e(serialDescriptor, 0, t0.a, s0Var.a);
        }
        b.c(serialDescriptor);
    }
}
