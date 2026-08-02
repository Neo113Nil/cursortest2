package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class sxd0 implements uxs {
    public static final sxd0 a;
    private static final SerialDescriptor descriptor;

    static {
        sxd0 sxd0Var = new sxd0();
        a = sxd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll.PollPayCardAction", sxd0Var, 7);
        pluginGeneratedSerialDescriptor.j("retryCount", false);
        pluginGeneratedSerialDescriptor.j("intervalSec", false);
        pluginGeneratedSerialDescriptor.j("trustIdStateName", false);
        pluginGeneratedSerialDescriptor.j("trustIdStateKey", false);
        pluginGeneratedSerialDescriptor.j("onFinish", true);
        pluginGeneratedSerialDescriptor.j("onStart", true);
        pluginGeneratedSerialDescriptor.j("onError", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uxd0.h;
        KSerializer n = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[6].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h6w.a, e6m.a, auu0Var, auu0Var, n, n2, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uxd0.h;
        b.getClass();
        Object obj = null;
        double d = 0.0d;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        String str = null;
        String str2 = null;
        vm50 vm50Var3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    vm50Var3 = (vm50) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), vm50Var3);
                    i |= 16;
                    break;
                case 5:
                    vm50Var = (vm50) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), vm50Var);
                    i |= 32;
                    break;
                case 6:
                    vm50Var2 = (vm50) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), vm50Var2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new uxd0(i, i2, d, str, str2, vm50Var3, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uxd0 uxd0Var = (uxd0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uxd0.h;
        int i = uxd0Var.a;
        vm50 vm50Var = uxd0Var.g;
        vm50 vm50Var2 = uxd0Var.f;
        vm50 vm50Var3 = uxd0Var.e;
        b.A(0, i, serialDescriptor);
        b.E(serialDescriptor, 1, uxd0Var.b);
        b.o(serialDescriptor, 2, uxd0Var.c);
        b.o(serialDescriptor, 3, uxd0Var.d);
        if (b.F() || vm50Var3 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), vm50Var3);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
