package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class see0 implements uxs {
    public static final see0 a;
    private static final SerialDescriptor descriptor;

    static {
        see0 see0Var = new see0();
        a = see0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.PostMessageParameterMapping", see0Var, 4);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("sendToBackend", true);
        pluginGeneratedSerialDescriptor.j("sendToBackendPath", true);
        pluginGeneratedSerialDescriptor.j("variableName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uee0.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(vpq0.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uee0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        xpq0 xpq0Var = null;
        List list = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                xpq0Var = (xpq0) b.s(serialDescriptor, 1, vpq0.a, xpq0Var);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new uee0(i, str, xpq0Var, list, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uee0 uee0Var = (uee0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uee0.e;
        String str = uee0Var.a;
        String str2 = uee0Var.d;
        List list = uee0Var.c;
        xpq0 xpq0Var = uee0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || xpq0Var != null) {
            b.g(serialDescriptor, 1, vpq0.a, xpq0Var);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
