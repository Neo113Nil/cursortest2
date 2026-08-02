package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class x1x implements uxs {
    public static final x1x a;
    private static final SerialDescriptor descriptor;

    static {
        x1x x1xVar = new x1x();
        a = x1xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", x1xVar, 8);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("textDecoration", false);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("metaColor", false);
        pluginGeneratedSerialDescriptor.j("metaStyle", false);
        pluginGeneratedSerialDescriptor.j("fontSize", false);
        pluginGeneratedSerialDescriptor.j("fontStyle", false);
        pluginGeneratedSerialDescriptor.j("fontWeight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = z1x.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = z1x.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        String str6 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
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
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new z1x(i, str2, list, str3, str4, str5, num, str6, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z1x z1xVar = (z1x) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = z1x.i;
        b.o(serialDescriptor, 0, z1xVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), z1xVar.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, z1xVar.c);
        b.g(serialDescriptor, 3, auu0Var, z1xVar.d);
        b.g(serialDescriptor, 4, auu0Var, z1xVar.e);
        b.g(serialDescriptor, 5, h6w.a, z1xVar.f);
        b.g(serialDescriptor, 6, auu0Var, z1xVar.g);
        b.g(serialDescriptor, 7, auu0Var, z1xVar.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
