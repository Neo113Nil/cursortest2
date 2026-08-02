package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes9.dex */
public final /* synthetic */ class sud0 implements uxs {
    public static final sud0 a;
    private static final SerialDescriptor descriptor;

    static {
        sud0 sud0Var = new sud0();
        a = sud0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PointOption", sud0Var, 3);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("on", true);
        pluginGeneratedSerialDescriptor.j("keep_pin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = uud0.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = uud0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        Trigger trigger = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                trigger = (Trigger) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), trigger);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new uud0(i, list, trigger, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        uud0.h((uud0) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
