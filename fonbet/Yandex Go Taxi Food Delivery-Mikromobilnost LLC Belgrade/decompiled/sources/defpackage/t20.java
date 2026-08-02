package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes6.dex */
public final /* synthetic */ class t20 implements uxs {
    public static final t20 a;
    private static final SerialDescriptor descriptor;

    static {
        t20 t20Var = new t20();
        a = t20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ActivePassesDto", t20Var, 2);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("passes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(x20.a), qke.n((KSerializer) v20.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = v20.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        z20 z20Var = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z20Var = (z20) b.s(serialDescriptor, 0, x20.a, z20Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new v20(i, z20Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v20 v20Var = (v20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = v20.c;
        if (b.F() || v20Var.a != null) {
            b.g(serialDescriptor, 0, x20.a, v20Var.a);
        }
        if (b.F() || v20Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), v20Var.b);
        }
        b.c(serialDescriptor);
    }
}
