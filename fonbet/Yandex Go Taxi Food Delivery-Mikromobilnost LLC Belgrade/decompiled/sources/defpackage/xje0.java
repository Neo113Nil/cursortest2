package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class xje0 implements uxs {
    public static final xje0 a;
    private static final SerialDescriptor descriptor;

    static {
        xje0 xje0Var = new xje0();
        a = xje0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Equal", xje0Var, 2);
        pluginGeneratedSerialDescriptor.j("argName", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, zje0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zje0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        uie0 uie0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                uie0Var = (uie0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), uie0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new zje0(i, str, uie0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zje0 zje0Var = (zje0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zje0.c;
        b.o(serialDescriptor, 0, zje0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zje0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
