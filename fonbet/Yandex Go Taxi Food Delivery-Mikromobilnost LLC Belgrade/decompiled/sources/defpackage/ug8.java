package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class ug8 implements uxs {
    public static final ug8 a;
    private static final SerialDescriptor descriptor;

    static {
        ug8 ug8Var = new ug8();
        a = ug8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputTokenizationData", ug8Var, 7);
        pluginGeneratedSerialDescriptor.j("diehardBaseUrl", false);
        pluginGeneratedSerialDescriptor.j("isAnonymous", false);
        pluginGeneratedSerialDescriptor.j("pmdVariableName", false);
        pluginGeneratedSerialDescriptor.j("psdVariableName", false);
        pluginGeneratedSerialDescriptor.j("tokenizationContext", false);
        pluginGeneratedSerialDescriptor.j("tokenizeFailureAction", false);
        pluginGeneratedSerialDescriptor.j("tokenizeSuccessAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        elk elkVar = elk.a;
        return new KSerializer[]{auu0Var, z96.a, auu0Var, auu0Var, mdx.a, elkVar, elkVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        c cVar = null;
        ilk ilkVar = null;
        ilk ilkVar2 = null;
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
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    cVar = (c) b.A(serialDescriptor, 4, mdx.a, cVar);
                    i |= 16;
                    break;
                case 5:
                    ilkVar = (ilk) b.A(serialDescriptor, 5, elk.a, ilkVar);
                    i |= 32;
                    break;
                case 6:
                    ilkVar2 = (ilk) b.A(serialDescriptor, 6, elk.a, ilkVar2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new yg8(i, str, z2, str2, str3, cVar, ilkVar, ilkVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yg8 yg8Var = (yg8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, yg8Var.a);
        b.n(serialDescriptor, 1, yg8Var.b);
        b.o(serialDescriptor, 2, yg8Var.c);
        b.o(serialDescriptor, 3, yg8Var.d);
        b.e(serialDescriptor, 4, mdx.a, yg8Var.e);
        elk elkVar = elk.a;
        b.e(serialDescriptor, 5, elkVar, yg8Var.f);
        b.e(serialDescriptor, 6, elkVar, yg8Var.g);
        b.c(serialDescriptor);
    }
}
