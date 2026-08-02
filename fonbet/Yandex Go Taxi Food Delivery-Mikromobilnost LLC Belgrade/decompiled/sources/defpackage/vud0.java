package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public final /* synthetic */ class vud0 implements uxs {
    public static final vud0 a;
    private static final SerialDescriptor descriptor;

    static {
        vud0 vud0Var = new vud0();
        a = vud0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.core.graphql.gradient.PointResponse", vud0Var, 2);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.X, false);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.Y, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new xud0(d, d2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xud0 xud0Var = (xud0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.E(serialDescriptor, 0, xud0Var.a);
        b.E(serialDescriptor, 1, xud0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
