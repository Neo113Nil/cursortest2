package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class u4t0 implements uxs {
    public static final u4t0 a;
    private static final SerialDescriptor descriptor;

    static {
        u4t0 u4t0Var = new u4t0();
        a = u4t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.snippet.behaviour.SnippetBehaviour.StickyForDocumentStart", u4t0Var, 5);
        pluginGeneratedSerialDescriptor.j("onStick", false);
        pluginGeneratedSerialDescriptor.j("onUnstick", false);
        pluginGeneratedSerialDescriptor.j("collapseOnScroll", false);
        pluginGeneratedSerialDescriptor.j("extraTopInset", false);
        pluginGeneratedSerialDescriptor.j("safeAreaSettings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w4t0.f;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(z96.a), qke.n(h6w.a), qke.n(h4t0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = w4t0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        kr krVar = null;
        kr krVar2 = null;
        Boolean bool = null;
        Integer num = null;
        j4t0 j4t0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                krVar = (kr) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), krVar);
                i |= 1;
            } else if (v == 1) {
                krVar2 = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar2);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                j4t0Var = (j4t0) b.s(serialDescriptor, 4, h4t0.a, j4t0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new w4t0(i, krVar, krVar2, bool, num, j4t0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w4t0 w4t0Var = (w4t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w4t0.f;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        kr krVar = w4t0Var.a;
        j4t0 j4t0Var = w4t0Var.e;
        b.g(serialDescriptor, 0, kSerializer, krVar);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), w4t0Var.b);
        b.g(serialDescriptor, 2, z96.a, w4t0Var.c);
        b.g(serialDescriptor, 3, h6w.a, w4t0Var.d);
        if (b.F() || j4t0Var != null) {
            b.g(serialDescriptor, 4, h4t0.a, j4t0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
