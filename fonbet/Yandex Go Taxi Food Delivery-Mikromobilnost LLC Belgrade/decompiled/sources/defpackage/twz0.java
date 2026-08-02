package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class twz0 implements uxs {
    public static final twz0 a;
    private static final SerialDescriptor descriptor;

    static {
        twz0 twz0Var = new twz0();
        a = twz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup.TopUpPayCardAction", twz0Var, 3);
        pluginGeneratedSerialDescriptor.j("amount", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        pluginGeneratedSerialDescriptor.j("onFinish", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(e6m.a), qke.n(auu0.a), qke.n((KSerializer) vwz0.d[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vwz0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        vm50 vm50Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                vm50Var = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new vwz0(i, d, str, vm50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vwz0 vwz0Var = (vwz0) obj;
        vm50 vm50Var = vwz0Var.c;
        String str = vwz0Var.b;
        Double d = vwz0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vwz0.d;
        if (b.F() || d != null) {
            b.g(serialDescriptor, 0, e6m.a, d);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
