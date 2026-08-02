package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class tt80 implements uxs {
    public static final tt80 a;
    private static final SerialDescriptor descriptor;

    static {
        tt80 tt80Var = new tt80();
        a = tt80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OPEN_SMART", tt80Var, 4);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("broadcastId", true);
        pluginGeneratedSerialDescriptor.j("presentationOptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(twe0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        exe0 exe0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                exe0Var = (exe0) b.s(serialDescriptor, 3, twe0.a, exe0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vt80(i, str, str2, str3, exe0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vt80 vt80Var = (vt80) obj;
        String str = vt80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        String str2 = vt80Var.b;
        exe0 exe0Var = vt80Var.d;
        String str3 = vt80Var.c;
        b.o(serialDescriptor, 1, str2);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 2, auu0.a, str3);
        }
        if (b.F() || exe0Var != null) {
            b.g(serialDescriptor, 3, twe0.a, exe0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
