package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class v151 implements uxs {
    public static final v151 a;
    private static final SerialDescriptor descriptor;

    static {
        v151 v151Var = new v151();
        a = v151Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Box", v151Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("contentDescription", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("displayRules", false);
        pluginGeneratedSerialDescriptor.j("widgetsIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = x151.f;
        return new KSerializer[]{auu0.a, qke.n(qfe.a), qke.n((KSerializer) i3yVarArr[2].getValue()), nzj.a, i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = x151.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        sfe sfeVar = null;
        wv wvVar = null;
        wzj wzjVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                sfeVar = (sfe) b.s(serialDescriptor, 1, qfe.a, sfeVar);
                i |= 2;
            } else if (v == 2) {
                wvVar = (wv) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), wvVar);
                i |= 4;
            } else if (v == 3) {
                wzjVar = (wzj) b.A(serialDescriptor, 3, nzj.a, wzjVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new x151(i, str, sfeVar, wvVar, wzjVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        x151.e((x151) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
