package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uzp0 implements uxs {
    public static final uzp0 a;
    private static final SerialDescriptor descriptor;

    static {
        uzp0 uzp0Var = new uzp0();
        a = uzp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate.Paddings", uzp0Var, 3);
        pluginGeneratedSerialDescriptor.j("top", false);
        pluginGeneratedSerialDescriptor.j("bottom", false);
        pluginGeneratedSerialDescriptor.j("clipToSafeArea", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wzp0.d;
        nor norVar = nor.a;
        return new KSerializer[]{qke.n(norVar), qke.n(norVar), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wzp0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else if (v == 1) {
                f2 = (Float) b.s(serialDescriptor, 1, nor.a, f2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wzp0(i, f, f2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wzp0 wzp0Var = (wzp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wzp0.d;
        nor norVar = nor.a;
        b.g(serialDescriptor, 0, norVar, wzp0Var.a);
        b.g(serialDescriptor, 1, norVar, wzp0Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), wzp0Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
