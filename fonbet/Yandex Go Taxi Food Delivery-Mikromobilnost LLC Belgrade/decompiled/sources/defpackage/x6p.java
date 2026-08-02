package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class x6p implements uxs {
    public static final x6p a;
    private static final SerialDescriptor descriptor;

    static {
        x6p x6pVar = new x6p();
        a = x6pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.api.dtotransport.FTVariableNode", x6pVar, 3);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("optional", true);
        pluginGeneratedSerialDescriptor.j("optionalDescriptor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z6p.d[0].getValue(), qke.n(z96.a), qke.n(k5p.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = z6p.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        m5p m5pVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                m5pVar = (m5p) b.s(serialDescriptor, 2, k5p.a, m5pVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new z6p(i, list, bool, m5pVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z6p z6pVar = (z6p) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) z6p.d[0].getValue();
        List list = z6pVar.a;
        m5p m5pVar = z6pVar.c;
        Boolean bool = z6pVar.b;
        b.e(serialDescriptor, 0, kSerializer, list);
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 1, z96.a, bool);
        }
        if (b.F() || m5pVar != null) {
            b.g(serialDescriptor, 2, k5p.a, m5pVar);
        }
        b.c(serialDescriptor);
    }
}
