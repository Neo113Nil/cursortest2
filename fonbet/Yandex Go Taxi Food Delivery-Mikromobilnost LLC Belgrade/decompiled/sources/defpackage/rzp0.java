package defpackage;

import flex.engine.section.model.ReusePolicy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class rzp0 implements uxs {
    public static final rzp0 a;
    private static final SerialDescriptor descriptor;

    static {
        rzp0 rzp0Var = new rzp0();
        a = rzp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate.LoadingSettings", rzp0Var, 2);
        pluginGeneratedSerialDescriptor.j("loadingSection", false);
        pluginGeneratedSerialDescriptor.j("reusePolicy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tzp0.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tzp0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        pyp0 pyp0Var = null;
        ReusePolicy reusePolicy = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                pyp0Var = (pyp0) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), pyp0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                reusePolicy = (ReusePolicy) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), reusePolicy);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new tzp0(i, pyp0Var, reusePolicy);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tzp0 tzp0Var = (tzp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tzp0.c;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), tzp0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), tzp0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
