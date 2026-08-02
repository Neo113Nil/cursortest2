package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class wwi0 implements uxs {
    public static final wwi0 a;
    private static final SerialDescriptor descriptor;

    static {
        wwi0 wwi0Var = new wwi0();
        a = wwi0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("core.flex.preload.actions.RemovePreloadedAction", wwi0Var, 2);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("tag", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) ywi0.c[0].getValue()), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ywi0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        u1m u1mVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u1mVar = (u1m) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ywi0(i, u1mVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ywi0 ywi0Var = (ywi0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, (KSerializer) ywi0.c[0].getValue(), ywi0Var.a);
        b.g(serialDescriptor, 1, auu0.a, ywi0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
