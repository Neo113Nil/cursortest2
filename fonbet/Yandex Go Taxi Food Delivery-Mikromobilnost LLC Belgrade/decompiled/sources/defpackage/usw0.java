package defpackage;

import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class usw0 implements uxs {
    public static final usw0 a;
    private static final SerialDescriptor descriptor;

    static {
        usw0 usw0Var = new usw0();
        a = usw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoParam", usw0Var, 5);
        pluginGeneratedSerialDescriptor.j("selected_classes", false);
        pluginGeneratedSerialDescriptor.j("payload", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("selection", false);
        pluginGeneratedSerialDescriptor.j("open_origin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wsw0.f;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(rcx.a), s03.a, i3yVarArr[3].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wsw0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        b bVar = null;
        w03 w03Var = null;
        Map map = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i |= 1;
            } else if (v == 1) {
                bVar = (b) b.s(serialDescriptor, 1, rcx.a, bVar);
                i |= 2;
            } else if (v == 2) {
                w03Var = (w03) b.A(serialDescriptor, 2, s03.a, w03Var);
                i |= 4;
            } else if (v == 3) {
                map = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new wsw0(i, set, bVar, w03Var, map, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wsw0 wsw0Var = (wsw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wsw0.f;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), wsw0Var.a);
        b.g(serialDescriptor, 1, rcx.a, wsw0Var.b);
        b.e(serialDescriptor, 2, s03.a, wsw0Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), wsw0Var.d);
        b.o(serialDescriptor, 4, wsw0Var.e);
        b.c(serialDescriptor);
    }
}
