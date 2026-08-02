package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class wkm0 implements uxs {
    public static final wkm0 a;
    private static final SerialDescriptor descriptor;

    static {
        wkm0 wkm0Var = new wkm0();
        a = wkm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.animation.generic.internal.transform.scale.ScaleAnimationSettings", wkm0Var, 2);
        pluginGeneratedSerialDescriptor.j("start", false);
        pluginGeneratedSerialDescriptor.j("end", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        psd0 psd0Var = psd0.a;
        return new KSerializer[]{psd0Var, psd0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        rsd0 rsd0Var = null;
        rsd0 rsd0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                rsd0Var = (rsd0) b.A(serialDescriptor, 0, psd0.a, rsd0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                rsd0Var2 = (rsd0) b.A(serialDescriptor, 1, psd0.a, rsd0Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ykm0(i, rsd0Var, rsd0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ykm0 ykm0Var = (ykm0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        psd0 psd0Var = psd0.a;
        b.e(serialDescriptor, 0, psd0Var, ykm0Var.a);
        b.e(serialDescriptor, 1, psd0Var, ykm0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
