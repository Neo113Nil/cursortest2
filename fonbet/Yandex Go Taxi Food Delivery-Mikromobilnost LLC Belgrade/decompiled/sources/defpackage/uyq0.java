package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class uyq0 implements uxs {
    public static final uyq0 a;
    private static final SerialDescriptor descriptor;

    static {
        uyq0 uyq0Var = new uyq0();
        a = uyq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.SessionData", uyq0Var, 3);
        pluginGeneratedSerialDescriptor.j("sessionDetails", false);
        pluginGeneratedSerialDescriptor.j("backgroundTime", true);
        pluginGeneratedSerialDescriptor.j("processDataMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ezq0.a, qke.n(o5z0.a), qke.n(wyq0.d[2])};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = wyq0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        gzq0 gzq0Var = null;
        w5z0 w5z0Var = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                gzq0Var = (gzq0) b.A(serialDescriptor, 0, ezq0.a, gzq0Var);
                i |= 1;
            } else if (v == 1) {
                w5z0Var = (w5z0) b.s(serialDescriptor, 1, o5z0.a, w5z0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 2, kSerializerArr[2], map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wyq0(i, gzq0Var, w5z0Var, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wyq0 wyq0Var = (wyq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = wyq0.d;
        ezq0 ezq0Var = ezq0.a;
        gzq0 gzq0Var = wyq0Var.a;
        Map map = wyq0Var.c;
        w5z0 w5z0Var = wyq0Var.b;
        b.e(serialDescriptor, 0, ezq0Var, gzq0Var);
        if (b.F() || w5z0Var != null) {
            b.g(serialDescriptor, 1, o5z0.a, w5z0Var);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 2, kSerializerArr[2], map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
