package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.f1;

/* loaded from: classes6.dex */
public final /* synthetic */ class wrw0 implements uxs {
    public static final wrw0 a;
    private static final SerialDescriptor descriptor;

    static {
        wrw0 wrw0Var = new wrw0();
        a = wrw0Var;
        descriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.SectionSeparator", wrw0Var, 0);
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int v = b.v(serialDescriptor);
        if (v == -1) {
            b.c(serialDescriptor);
            return new f1();
        }
        ny61.c(v);
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        encoder.b(serialDescriptor).c(serialDescriptor);
    }
}
