package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class r251 implements uxs {
    public static final r251 a;
    private static final SerialDescriptor descriptor;

    static {
        r251 r251Var = new r251();
        a = r251Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Switch", r251Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("templates", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = t251.g;
        return new KSerializer[]{auu0.a, qke.n(qfe.a), qke.n((KSerializer) i3yVarArr[2].getValue()), nzj.a, i3yVarArr[4].getValue(), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = t251.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        sfe sfeVar = null;
        wv wvVar = null;
        wzj wzjVar = null;
        List list = null;
        List list2 = null;
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
                    sfeVar = (sfe) b.s(serialDescriptor, 1, qfe.a, sfeVar);
                    i |= 2;
                    break;
                case 2:
                    wvVar = (wv) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), wvVar);
                    i |= 4;
                    break;
                case 3:
                    wzjVar = (wzj) b.A(serialDescriptor, 3, nzj.a, wzjVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new t251(i, str, sfeVar, wvVar, wzjVar, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        t251.f((t251) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
