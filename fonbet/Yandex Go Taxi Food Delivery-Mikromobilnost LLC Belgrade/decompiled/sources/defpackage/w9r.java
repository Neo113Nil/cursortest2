package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes12.dex */
public final /* synthetic */ class w9r implements uxs {
    public static final w9r a;
    private static final SerialDescriptor descriptor;

    static {
        w9r w9rVar = new w9r();
        a = w9rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.finishflow.FinishFlowAction", w9rVar, 3);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("enrichLinkParams", true);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = aar.d;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = aar.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new aar(i, str, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        aar aarVar = (aar) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = aar.d;
        String str = aarVar.a;
        Map map = aarVar.c;
        List list = aarVar.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), list);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), map);
        }
        b.c(serialDescriptor);
    }
}
