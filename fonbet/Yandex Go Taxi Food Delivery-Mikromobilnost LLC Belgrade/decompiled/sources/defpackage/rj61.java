package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class rj61 implements uxs {
    public static final rj61 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        rj61 rj61Var = new rj61();
        a = rj61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.fonts.FontParameters", rj61Var, 1);
        pluginGeneratedSerialDescriptor.j("urls", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(lh71.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        wn71 wn71Var = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                wn71Var = (wn71) b2.s(pluginGeneratedSerialDescriptor, 0, lh71.a, wn71Var);
                i = 1;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new ty61(i, wn71Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.g(pluginGeneratedSerialDescriptor, 0, lh71.a, ((ty61) obj).a);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
