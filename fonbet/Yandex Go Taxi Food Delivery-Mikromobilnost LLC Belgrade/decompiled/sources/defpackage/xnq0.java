package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class xnq0 implements uxs {
    public static final xnq0 a;
    private static final SerialDescriptor descriptor;

    static {
        xnq0 xnq0Var = new xnq0();
        a = xnq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.analytics.SendAnalyticsEventAction", xnq0Var, 2);
        pluginGeneratedSerialDescriptor.j("eventName", false);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) boq0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = boq0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Map map = null;
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
                map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new boq0(i, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        boq0 boq0Var = (boq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = boq0.c;
        String str = boq0Var.a;
        Map map = boq0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || map != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), map);
        }
        b.c(serialDescriptor);
    }
}
