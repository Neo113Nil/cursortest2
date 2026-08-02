package defpackage;

import com.yandex.mob.api.model.MobPingPolicy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class ql20 implements uxs {
    public static final ql20 a;
    private static final SerialDescriptor descriptor;

    static {
        ql20 ql20Var = new ql20();
        a = ql20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobApiNamePolicy", ql20Var, 1);
        pluginGeneratedSerialDescriptor.j("ping_policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = sl20.b;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = sl20.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        MobPingPolicy mobPingPolicy = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                mobPingPolicy = (MobPingPolicy) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mobPingPolicy);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new sl20(i, mobPingPolicy);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        sl20.c((sl20) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
