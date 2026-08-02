package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class sp20 implements uxs {
    public static final sp20 a;
    private static final SerialDescriptor descriptor;

    static {
        sp20 sp20Var = new sp20();
        a = sp20Var;
        descriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.params.MobNotificationsParams", sp20Var, 0);
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
            return new up20();
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

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
