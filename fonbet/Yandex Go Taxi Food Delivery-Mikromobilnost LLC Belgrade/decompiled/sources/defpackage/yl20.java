package defpackage;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class yl20 implements uxs {
    public static final yl20 a;
    private static final SerialDescriptor descriptor;

    static {
        yl20 yl20Var = new yl20();
        a = yl20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobAvailabilityCheckStrategy", yl20Var, 1);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) am20.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = am20.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                mobAvailabilityCheckStrategyName = (MobAvailabilityCheckStrategyName) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mobAvailabilityCheckStrategyName);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new am20(i, mobAvailabilityCheckStrategyName);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName = ((am20) obj).a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = am20.b;
        if (b.F() || mobAvailabilityCheckStrategyName != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mobAvailabilityCheckStrategyName);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
