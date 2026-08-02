package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import yads.ig2;

/* loaded from: classes7.dex */
public final class qp61 implements uxs {
    public static final qp61 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        qp61 qp61Var = new qp61();
        a = qp61Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.configuration.model.PreloadBlock", qp61Var, 2);
        pluginGeneratedSerialDescriptor.j("adUnitId", false);
        pluginGeneratedSerialDescriptor.j("format", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, u671.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = u671.c;
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ig2 ig2Var = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b2.k(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                ig2Var = (ig2) b2.A(pluginGeneratedSerialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ig2Var);
                i |= 2;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new u671(i, str, ig2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u671 u671Var = (u671) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        i3y[] i3yVarArr = u671.c;
        b2.o(pluginGeneratedSerialDescriptor, 0, u671Var.a);
        b2.e(pluginGeneratedSerialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), u671Var.b);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
