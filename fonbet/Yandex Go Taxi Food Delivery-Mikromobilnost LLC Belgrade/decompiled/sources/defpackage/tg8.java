package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class tg8 implements uxs {
    public static final tg8 a;
    private static final SerialDescriptor descriptor;

    static {
        tg8 tg8Var = new tg8();
        a = tg8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputTokenizationData", tg8Var, 6);
        pluginGeneratedSerialDescriptor.j("pmdVariableName", false);
        pluginGeneratedSerialDescriptor.j("psdVariableName", false);
        pluginGeneratedSerialDescriptor.j("tokenizationContext", false);
        pluginGeneratedSerialDescriptor.j("diehardBaseUrl", false);
        pluginGeneratedSerialDescriptor.j("tokenizeSuccessAction", false);
        pluginGeneratedSerialDescriptor.j("tokenizeFailureAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        dlk dlkVar = dlk.a;
        return new KSerializer[]{auu0Var, auu0Var, mdx.a, n, dlkVar, dlkVar};
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
        c cVar = null;
        String str3 = null;
        hlk hlkVar = null;
        hlk hlkVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    cVar = (c) b.A(serialDescriptor, 2, mdx.a, cVar);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    hlkVar = (hlk) b.A(serialDescriptor, 4, dlk.a, hlkVar);
                    i |= 16;
                    break;
                case 5:
                    hlkVar2 = (hlk) b.A(serialDescriptor, 5, dlk.a, hlkVar2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new xg8(i, str, str2, cVar, str3, hlkVar, hlkVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xg8 xg8Var = (xg8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, xg8Var.a);
        b.o(serialDescriptor, 1, xg8Var.b);
        b.e(serialDescriptor, 2, mdx.a, xg8Var.c);
        b.g(serialDescriptor, 3, auu0.a, xg8Var.d);
        dlk dlkVar = dlk.a;
        b.e(serialDescriptor, 4, dlkVar, xg8Var.e);
        b.e(serialDescriptor, 5, dlkVar, xg8Var.f);
        b.c(serialDescriptor);
    }
}
