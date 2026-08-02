package defpackage;

import com.adjust.sdk.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class q470 implements uxs {
    public static final q470 a;
    private static final SerialDescriptor descriptor;

    static {
        q470 q470Var = new q470();
        a = q470Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OpenDeeplinkAction", q470Var, 4);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, false);
        pluginGeneratedSerialDescriptor.j("universalLinksOnly", true);
        pluginGeneratedSerialDescriptor.j("onSuccess", true);
        pluginGeneratedSerialDescriptor.j("onFail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = s470.e;
        return new KSerializer[]{auu0.a, qke.n(z96.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = s470.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else if (v == 2) {
                vm50Var = (vm50) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), vm50Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                vm50Var2 = (vm50) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vm50Var2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new s470(i, str, bool, vm50Var, vm50Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s470 s470Var = (s470) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = s470.e;
        String str = s470Var.a;
        vm50 vm50Var = s470Var.d;
        vm50 vm50Var2 = s470Var.c;
        Boolean bool = s470Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 1, z96.a, bool);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), vm50Var);
        }
        b.c(serialDescriptor);
    }
}
