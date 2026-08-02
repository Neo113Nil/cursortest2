package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class sb81 implements uxs {
    public static final sb81 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        sb81 sb81Var = new sb81();
        a = sb81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", sb81Var, 5);
        pluginGeneratedSerialDescriptor.j("minBufferMs", true);
        pluginGeneratedSerialDescriptor.j("maxBufferMs", true);
        pluginGeneratedSerialDescriptor.j("bufferForPlaybackMs", true);
        pluginGeneratedSerialDescriptor.j("bufferForPlaybackAfterRebufferMs", true);
        pluginGeneratedSerialDescriptor.j("targetBufferBytes", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b2.s(pluginGeneratedSerialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                num2 = (Integer) b2.s(pluginGeneratedSerialDescriptor, 1, h6w.a, num2);
                i |= 2;
            } else if (v == 2) {
                num3 = (Integer) b2.s(pluginGeneratedSerialDescriptor, 2, h6w.a, num3);
                i |= 4;
            } else if (v == 3) {
                num4 = (Integer) b2.s(pluginGeneratedSerialDescriptor, 3, h6w.a, num4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                num5 = (Integer) b2.s(pluginGeneratedSerialDescriptor, 4, h6w.a, num5);
                i |= 16;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new ai81(i, num, num2, num3, num4, num5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ai81 ai81Var = (ai81) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        if (b2.F() || ai81Var.a != null) {
            b2.g(pluginGeneratedSerialDescriptor, 0, h6w.a, ai81Var.a);
        }
        if (b2.F() || ai81Var.b != null) {
            b2.g(pluginGeneratedSerialDescriptor, 1, h6w.a, ai81Var.b);
        }
        if (b2.F() || ai81Var.c != null) {
            b2.g(pluginGeneratedSerialDescriptor, 2, h6w.a, ai81Var.c);
        }
        if (b2.F() || ai81Var.d != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, h6w.a, ai81Var.d);
        }
        if (b2.F() || ai81Var.e != null) {
            b2.g(pluginGeneratedSerialDescriptor, 4, h6w.a, ai81Var.e);
        }
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
