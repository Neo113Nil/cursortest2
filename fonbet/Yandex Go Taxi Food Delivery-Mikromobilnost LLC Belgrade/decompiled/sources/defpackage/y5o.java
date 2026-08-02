package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule$Type;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class y5o implements uxs {
    public static final y5o a;
    private static final SerialDescriptor descriptor;

    static {
        y5o y5oVar = new y5o();
        a = y5oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule", y5oVar, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("length", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a6o.c[0].getValue(), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a6o.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                errorBodyLoggingRule$Type = (ErrorBodyLoggingRule$Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), errorBodyLoggingRule$Type);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new a6o(i, errorBodyLoggingRule$Type, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a6o a6oVar = (a6o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) a6o.c[0].getValue();
        ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type = a6oVar.a;
        Integer num = a6oVar.b;
        b.e(serialDescriptor, 0, kSerializer, errorBodyLoggingRule$Type);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 1, h6w.a, num);
        }
        b.c(serialDescriptor);
    }
}
