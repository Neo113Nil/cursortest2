package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class w370 implements uxs {
    public static final w370 a;
    private static final SerialDescriptor descriptor;

    static {
        w370 w370Var = new w370();
        a = w370Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.browser.OpenBrowserAction", w370Var, 2);
        pluginGeneratedSerialDescriptor.j("params", true);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) y370.c[0].getValue()), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y370.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new y370(i, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y370 y370Var = (y370) obj;
        Map map = y370Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = y370.c;
        if (b.F() || map != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), map);
        }
        b.o(serialDescriptor, 1, y370Var.b);
        b.c(serialDescriptor);
    }
}
