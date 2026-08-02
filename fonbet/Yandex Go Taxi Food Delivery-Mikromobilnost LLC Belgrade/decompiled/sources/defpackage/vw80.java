package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class vw80 implements uxs {
    public static final vw80 a;
    private static final SerialDescriptor descriptor;

    static {
        vw80 vw80Var = new vw80();
        a = vw80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.voip_calls.calls_go.OutgoingCallArgs", vw80Var, 9);
        pluginGeneratedSerialDescriptor.j("forwardingId", false);
        pluginGeneratedSerialDescriptor.j("callToTitle", false);
        pluginGeneratedSerialDescriptor.j("callToAvatarUrl", false);
        pluginGeneratedSerialDescriptor.j("rating", false);
        pluginGeneratedSerialDescriptor.j("callToCar", true);
        pluginGeneratedSerialDescriptor.j("callToCarColor", true);
        pluginGeneratedSerialDescriptor.j("linkageId", false);
        pluginGeneratedSerialDescriptor.j("fallbackCallAvailable", true);
        pluginGeneratedSerialDescriptor.j("fallbackChatAvailable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(gk7.a);
        KSerializer n4 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, n, n2, n3, n4, auu0Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ik7 ik7Var = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    ik7Var = (ik7) b.s(serialDescriptor, 4, gk7.a, ik7Var);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z3 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new xw80(i, str, str2, str3, str4, ik7Var, str5, str6, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xw80 xw80Var = (xw80) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = xw80Var.a;
        String str2 = xw80Var.f;
        ik7 ik7Var = xw80Var.e;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, xw80Var.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, xw80Var.c);
        b.g(serialDescriptor, 3, auu0Var, xw80Var.d);
        if (b.F() || ik7Var != null) {
            b.g(serialDescriptor, 4, gk7.a, ik7Var);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 5, auu0Var, str2);
        }
        b.o(serialDescriptor, 6, xw80Var.g);
        if (b.F() || xw80Var.h) {
            b.n(serialDescriptor, 7, xw80Var.h);
        }
        if (b.F() || xw80Var.i) {
            b.n(serialDescriptor, 8, xw80Var.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
